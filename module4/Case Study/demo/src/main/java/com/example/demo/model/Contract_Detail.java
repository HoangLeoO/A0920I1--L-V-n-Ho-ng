package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "contract_detail")
public class Contract_Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Contract_detail_id ;

    private int quantity ;

    @ManyToOne
    @JoinColumn(name = "contract_id")
    private Contract contract ;

    @ManyToOne
    @JoinColumn(name = "attach_service_id")
    private Attach_Service attach_service ;

    public Contract_Detail() {
    }

    public int getContract_detail_id() {
        return Contract_detail_id;
    }

    public void setContract_detail_id(int contract_detail_id) {
        Contract_detail_id = contract_detail_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Attach_Service getAttach_service() {
        return attach_service;
    }

    public void setAttach_service(Attach_Service attach_service) {
        this.attach_service = attach_service;
    }
}
