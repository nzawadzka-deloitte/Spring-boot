package com.dolittle.demo.carMaintenance;

import javax.persistence.*;


@SuppressWarnings("JpaAttributeTypeInspection")
@Entity
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_id_generator")
    @SequenceGenerator(name = "client_id_generator", sequenceName="client_id_sqe", allocationSize = 1)
    private Long id;
    private String name;
    private String lastname;
    private String ciy;
    private String dateOfbirth;
    private int phoneNumber;
    private String accountNumber;



    protected ClientEntity(){}
    public ClientEntity(Long id, String name, String lastname, String ciy, String dateOfbirth, int phoneNumber, String accountNumber) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.ciy = ciy;
        this.dateOfbirth = dateOfbirth;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;

    }


}
