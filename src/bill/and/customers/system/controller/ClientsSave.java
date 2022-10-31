/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bill.and.customers.system.controller;

import bill.and.customers.system.model.Clients;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ClientsSave {
    
    
    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    ArrayList<Clients> lista = new ArrayList<>();
    
    public void SaveRegister(Clients clients) throws SQLException{
        String sql = "insert into clients (clientFirstName, clientLastName, clientAddress, clientCellPhone, clientEmail) values (?,?,?,?,?) ";
        conn = new BDConnnection().Connecting();
        try {
     
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,clients.getClientFirstName());
            pstm.setString(2, clients.getClientLastName());
            pstm.setString(3,clients.getClientAddress());
            pstm.setString(4, clients.getClientCellPhone());
            pstm.setString(5, clients.getClientEmail());
            
            
             if(clients.getClientFirstName().isEmpty()){
                   JOptionPane.showMessageDialog(null, "preencha todos campos porfavor..."+ JOptionPane.WARNING_MESSAGE);
             }else{
                  pstm.execute();
                  pstm.close(); 
             JOptionPane.showMessageDialog(null, "dados do Produto gravados...");
             } 
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "dados do divida nao foram gravados ..." + e);
        }
                

    }
    
     public ArrayList<Clients> produtList() {
        String sql = "select * from clients";
         conn = new BDConnnection().Connecting();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                Clients clients = new Clients();
                clients.setClienteId(rs.getInt("clienteId"));
                clients.setClientFirstName(rs.getString("clientFirstName"));
                clients.setClientLastName(rs.getString("clientLastName"));
                clients.setClientAddress(rs.getString("clientAddress"));
                clients.setClientCellPhone(rs.getString("clientCellPhone"));
                clients.setClientEmail(rs.getString("clientEmail"));
//                    clientFirstName, clientLastName, clientAddress, clientCellPhone, clientEmail
                lista.add(clients);
                System.out.println("listado");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null , "pesquisar" + erro);
        }
        return lista;
    }
    
     
//     CREATE TABLE clients(
//    clienteId int PRIMARY key AUTO_INCREMENT,
//    clientFirstName varchar (100) not null, 
//    clientLastName varchar (100) not null, 
//    clientAddress varchar (100) not null, 
//    clientCellPhone varchar (100) not null,
//    clientEmail varchar (100) not null
//) ;
    
}
