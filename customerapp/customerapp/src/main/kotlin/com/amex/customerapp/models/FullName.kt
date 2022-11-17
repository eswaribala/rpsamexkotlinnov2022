package com.amex.customerapp.models

import javax.persistence.Column
import javax.persistence.Embeddable

@Embeddable
data class FullName(@Column(name="First_Name", nullable = false, length = 100) var firstName: String,
                    @Column(name="Middle_Name", nullable = false, length = 100) var middleName:String,
                    @Column(name="Last_Name", nullable = false, length = 100) var lastName:String)