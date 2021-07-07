package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "contract_detail")
public class Contract_Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ContractDetailId ;

    private int quantity ;

    @ManyToOne
    @JoinColumn(name = "contractId")
    private Contract contract ;

    @ManyToOne
    @JoinColumn(name = "attachServiceId")
    private Attach_Service attachService ;

    public Contract_Detail() {
    }

    public int getContractDetailId() {
        return ContractDetailId;
    }

    public void setContractDetailId(int contractDetailId) {
        ContractDetailId = contractDetailId;
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

    public Attach_Service getAttachService() {
        return attachService;
    }

    public void setAttachService(Attach_Service attachService) {
        this.attachService = attachService;
    }
}
