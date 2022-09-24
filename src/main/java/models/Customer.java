package models;

import java.util.Objects;

public class Customer {
//Fields
    private Long custID;
    private String address;
    private String city;
    private String postalCode;
    private String ocupation;
    private String custType;
//Constructors

    public Customer(Long custID, String address, String city, String postalCode, String ocupation, String custType) {
        this.custID = custID;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.ocupation = ocupation;
        this.custType = custType;
    }

//HashCode-Equals & toString


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getCustID(), customer.getCustID()) && Objects.equals(getAddress(), customer.getAddress()) && Objects.equals(getCity(), customer.getCity()) && Objects.equals(getPostalCode(), customer.getPostalCode()) && Objects.equals(getOcupation(), customer.getOcupation()) && Objects.equals(getCustType(), customer.getCustType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustID(), getAddress(), getCity(), getPostalCode(), getOcupation(), getCustType());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custID=" + custID +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", ocupation='" + ocupation + '\'' +
                ", custType='" + custType + '\'' +
                '}';
    }

    //Getters & Setters
    public Long getCustID() {
        return custID;
    }
    public void setCustID(Long custID) {
        this.custID = custID;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public String getOcupation() {
        return ocupation;
    }
    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }
    public String getCustType() {
        return custType;
    }
    public void setCustType(String custType) {
        this.custType = custType;
    }
}
