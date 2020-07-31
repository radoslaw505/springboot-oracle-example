package com.binge.radoslaw.OracleJDBC.model;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer Id;

    @Column(name = "LOGIN")
    private String Login;

    @Column(name = "FIRST_NAME")
    private String FirstName;

    @Column(name = "LAST_NAME")
    private String LastName;

    @Column(name = "TEAM")
    private String Team;

    @Column(name = "PHONE_NUMBER")
    private String PhoneNumber;

    @Column(name = "OTHER_PARAM1")
    private String OtherParam1;

    @Column(name = "OTHER_PARAM2")
    private String OtherParam2;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", Login='" + Login + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Team='" + Team + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", OtherParam1='" + OtherParam1 + '\'' +
                ", OtherParam2='" + OtherParam2 + '\'' +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getOtherParam1() {
        return OtherParam1;
    }

    public void setOtherParam1(String otherParam1) {
        OtherParam1 = otherParam1;
    }

    public String getOtherParam2() {
        return OtherParam2;
    }

    public void setOtherParam2(String otherParam2) {
        OtherParam2 = otherParam2;
    }
}
