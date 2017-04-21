package com.beans.pojo;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import java.util.Scanner;

/**
 * The doctor have some characters that have been inherited from either the employee class and the person class
 * for instance the fileds such as name, national id, age, email, phone number can still be inherited from the person clss
 * from the employee class doctor is able to inherit salary and qualifications traits.
 * Therefore this helps in code reuse.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Doctor")
public class Doctor extends Employee {
    private String specialist;
    private String licenseNo;

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

}
