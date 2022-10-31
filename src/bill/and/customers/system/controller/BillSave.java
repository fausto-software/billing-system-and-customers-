/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bill.and.customers.system.controller;

import bill.and.customers.system.model.BillModel;
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
public class BillSave {
    
    Connection conn = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;
    ArrayList<BillModel> lista = new ArrayList<>();
    
    public void SaveRegister(BillModel billModel) throws SQLException{
        String sql = "insert into bill (billDate, serviceDescription, serviceAumou, client) values (?,?,?,?) ";
        conn = new BDConnnection().Connecting();
        try {
     
            pstm = conn.prepareStatement(sql);
            pstm.setString(1,billModel.getBillDate());
            pstm.setString(2, billModel.getServiceDescription());
            pstm.setDouble(3,billModel.getServiceAumout());
            pstm.setString(4, billModel.getClient());
            
             if(billModel.getClient().isEmpty()){
                   JOptionPane.showMessageDialog(null, "preencha todos campos porfavor..."+ JOptionPane.WARNING_MESSAGE);
             }else{
                  pstm.execute();
                  pstm.close(); 
             JOptionPane.showMessageDialog(null, "dados do Produto gravados...");
             
             } 
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "dados do divida nao foram gravados ..." + e);
             System.out.println("aaaa"+ e);
        }
                

    }
    
     public ArrayList<BillModel> produtList() {
        String sql = "select * from bill";
         conn = new BDConnnection().Connecting();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                BillModel bill = new BillModel();
                bill.setBillId(rs.getInt("billId"));
                bill.setBillDate(rs.getString("billDate"));
                bill.setServiceDescription(rs.getString("serviceDescription"));
                bill.setServiceAumout(rs.getDouble("serviceAumout"));
                bill.setClient(rs.getString("client"));
                
//            private Integer billId;
//            private String billDate;
//            private String serviceDescription;
//            private Double serviceAumout;
//            private Clients client;
         
                lista.add(bill);
                System.out.println("listado");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null , "pesquisar" + erro);
        }
        return lista;
    }
     
     
//     CREATE TABLE bill(
//    billId int PRIMARY key AUTO_INCREMENT,
//    billDate varchar (100) not null, 
//    serviceDescription varchar (100) not null, 
//    serviceAumout double , 
//    client varchar (100) not null
//) ;
    
}
