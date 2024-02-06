package com.example.D288.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import jakarta.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "customers")
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Customer_ID", nullable = false)
    private Long id;

    @Column(name = "Customer_First_Name", nullable = false)
    private String firstName;

    @Column(name = "Customer_Last_Name", nullable = false)
    private String lastName;

    @Column(name = "Address", nullable = false)
    private String address;

    @Column(name = "Postal_Code", nullable = false)
    private String postal_code;

    @Column(name = "Phone", nullable = false)
    private String phone;

    @Column(name = "Create_Date")
    @CreationTimestamp
    private Date create_date;

    @Column(name = "Last_Update")
    @UpdateTimestamp
    private Date last_update;

    @ManyToOne
    @JoinColumn(name = "Division_ID")
    private Division division;

    @OneToMany(mappedBy = "customer")
    private Set<Cart> carts= new HashSet<>();

    public void add(Cart cart) {
        if(cart != null){
            if(carts == null){
                carts= new HashSet<>();
            }
            carts.add(cart);
            cart.setCustomer(this);
        }
    }
}