package com.amex.customerapp.models

import lombok.EqualsAndHashCode
import lombok.experimental.SuperBuilder
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Enumerated
import javax.persistence.Table

@Entity
@Table(name="Corporate")
@SuperBuilder
@EqualsAndHashCode(callSuper = false)
data class Corporate(@Enumerated @Column(name="Company_Type")var companyType: CompanyType): Customer()