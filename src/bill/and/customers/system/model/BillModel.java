/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bill.and.customers.system.model;

/**
 *
 * @author User
 */
public class BillModel {
    
    private Integer billId;
    private String billDate;
    private String serviceDescription;
    private Double serviceAumout;
    private String client;

    public BillModel(Integer billId, String billDate, String serviceDescription, Double serviceAumout, String client) {
        this.billId = billId;
        this.billDate = billDate;
        this.serviceDescription = serviceDescription;
        this.serviceAumout = serviceAumout;
        this.client = client;
    }

    public BillModel() {
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public Double getServiceAumout() {
        return serviceAumout;
    }

    public void setServiceAumout(Double serviceAumout) {
        this.serviceAumout = serviceAumout;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }
    
    
    
    
    
}
