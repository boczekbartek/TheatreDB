package com.greglturnquist.payroll;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by bartek on 13.06.17.
 */
@Data
@Table(name = "THEATREOFFICES")
@Entity
public class TheatreOffice {
    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long theatreofficeID;
    private String street;
    private String housenumber;
    private String zipcode;
    private String city;





    public TheatreOffice(){}


    public TheatreOffice(String street, String housenumber, String zipcode, String city){
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
        this.housenumber = housenumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHousenumber() {
        return housenumber;
    }

    public void setHousenumber(String housenumber) {
        this.housenumber = housenumber;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
