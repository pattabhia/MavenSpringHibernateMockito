package com.mayabansi.webappdemo.domain;

// Generated Sep 19, 2010 12:31:53 AM by Hibernate Tools 3.3.0.GA

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Customer generated by hbm2java
 */
@Entity
@Table(name = "customer", catalog = "MockitoDemo1")
public class Customer implements java.io.Serializable {

    private Long id;
    private long version;
    private String middleName;
    private String lastName;
    private String email;
    private String firstName;
    private String password;

    public Customer() {
    }

    public Customer(String lastName, String email, String firstName,
                    String password) {
        this.lastName = lastName;
        this.email = email;
        this.firstName = firstName;
        this.password = password;
    }

    public Customer(String middleName, String lastName, String email,
                    String firstName, String password) {
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.firstName = firstName;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Version
    @Column(name = "version", nullable = false)
    public long getVersion() {
        return this.version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    @Column(name = "middle_name", length = 20)
    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Column(name = "last_name", nullable = false, length = 20)
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "email", nullable = false, length = 20)
    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "first_name", nullable = false, length = 20)
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "password", nullable = false, length = 20)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
