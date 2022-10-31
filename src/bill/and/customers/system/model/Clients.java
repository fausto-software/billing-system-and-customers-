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
public class Clients {
    
    private Integer clienteId;
    private String clientFirstName;
    private String clientLastName;
    private String clientAddress;
    private String clientCellPhone;
    private String clientEmail;

    public Clients(Integer clienteId, String clientFirstName, String clientLastName, String clientAddress, String clientCellPhone, String clientEmail) {
        this.clienteId = clienteId;
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.clientAddress = clientAddress;
        this.clientCellPhone = clientCellPhone;
        this.clientEmail = clientEmail;
    }

    public Clients() {
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientCellPhone() {
        return clientCellPhone;
    }

    public void setClientCellPhone(String clientCellPhone) {
        this.clientCellPhone = clientCellPhone;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }
    
    
    
}
