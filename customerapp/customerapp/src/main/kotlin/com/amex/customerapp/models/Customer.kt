package com.amex.customerapp.models

import java.time.LocalDate
import javax.persistence.*


@Entity
@Table(name="Customer")
@Inheritance(strategy = InheritanceType.JOINED)
data class Customer (@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="Account_No")var accountNumber:Long,
                     @Embedded var fullName:FullName,
                     @Column(name="Contact_No") var contactNumber:Long,
                     @Column(name="Email", nullable = false, length = 100) var email:String,
                     @Column(name="Password", nullable = false, length = 10) var password:String)