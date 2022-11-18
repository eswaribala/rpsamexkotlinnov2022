package com.amex.customerapp.models

import io.swagger.v3.oas.annotations.media.Schema
import lombok.Data
import java.time.LocalDate
import javax.persistence.*


@Entity
@Table(name="Customer")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
open class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Account_No")
    @Schema(hidden = true)
   open var accountNumber:Long = 0
    @Embedded
   open lateinit var fullName:FullName
   @Column(name="Contact_No")
   open var contactNumber:Long = 0
    @Column(name="Email", nullable = false, length = 100)
    open lateinit var email:String
    @Column(name="Password", nullable = false, length = 10)
    open lateinit var password:String
}