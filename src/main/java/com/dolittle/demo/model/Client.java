package com.dolittle.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@SuppressWarnings("JpaAttributeTypeInspection")
@Entity
public class Client {
    @Id
    private Long id;
    private String name;
    private String lastname;
    private String ciy;
    private String dateOfbirth;
    private int phoneNumber;
    private String accountNumber;

    private ArrayList<String> worker;

    protected Client(){}
    public Client(Long id, String name, String lastname, String ciy, String dateOfbirth, int phoneNumber, String accountNumber, ArrayList<String> worker) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.ciy = ciy;
        this.dateOfbirth = dateOfbirth;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.worker = worker;
    }


}
