/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao.model.dao;

import Conexao.connection.ConnectionFactory;
import Conexao.model.bin.Carros;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Danrley
 */
public class CarrosDAO {
    
    public void DefinirPreco(Carros c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO carros (carro, placa, usuario, cpf, horario, horasalugadas, valor) VALUES (?,?,?,?,?,?,?)");
            stmt.setString(1, c.getCarro());
            stmt.setString(2, c.getPlaca());
            stmt.setString(3, "");
            stmt.setInt(4, 0);
            stmt.setString(5, "2019-11-19 000000");
            stmt.setInt(6, 0);
            stmt.setFloat(7, c.getValor());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Preço definido com sucesso");
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void createCarros(Carros c){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO carros (carro, placa, usuario, cpf, horario, horasalugadas, valor) VALUES (?,?,?,?,?,?)");
            stmt.setString(1, c.getCarro());
            stmt.setString(2, c.getPlaca());
            stmt.setString(3, "");
            stmt.setInt(4, 0);
            stmt.setString(5, "2019-11-19 000000");
            stmt.setInt(6, 0);
            
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
    }
    
    public List<Carros> readCarros(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Carros> carros = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM carros");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Carros c = new Carros();
                
                if(rs.getInt("cpf") == 0){
                c.setId(rs.getInt("id"));
                c.setCarro(rs.getString("carro"));
                c.setPlaca(rs.getString("placa"));
                c.setUsuario(rs.getString("usuario"));
                c.setCpf(rs.getInt("cpf"));
                c.setHorario(rs.getString("horario"));
                c.setHorasalugadas(rs.getInt("horasalugadas"));
                carros.add(c);
                }
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return carros;
    }
    public List<Carros> readCarrosExclusao(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Carros> carros = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM carros");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Carros c = new Carros();
                
               
                c.setId(rs.getInt("id"));
                c.setCarro(rs.getString("carro"));
                c.setPlaca(rs.getString("placa"));
                c.setUsuario(rs.getString("usuario"));
                c.setCpf(rs.getInt("cpf"));
                c.setHorario(rs.getString("horario"));
                c.setHorasalugadas(rs.getInt("horasalugadas"));
                carros.add(c);
                
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return carros;
    }
     public List<Carros> readCarrosClientes(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Carros> carros = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM carros");
            rs = stmt.executeQuery();
                
            while(rs.next()){
                
                Carros c = new Carros();
                
                if(rs.getInt("cpf") != 0){
                c.setId(rs.getInt("id"));
                c.setCarro(rs.getString("carro"));
                c.setPlaca(rs.getString("placa"));
                c.setUsuario(rs.getString("usuario"));
                c.setCpf(rs.getInt("cpf"));
                c.setHorario(rs.getString("horario"));
                c.setHorasalugadas(rs.getInt("horasalugadas"));
                carros.add(c);
                }
            } 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return carros;
    }
    
    public void updateCarros(Carros c){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE carros SET usuario = ?, cpf = ?, horario = ?, horasalugadas = ? WHERE id = ?");
            stmt.setString(1, c.getUsuario());
            stmt.setInt(2, c.getCpf());
            stmt.setString(3, c.getHorario());
            stmt.setInt(4, c.getHorasalugadas());
            stmt.setInt(5, c.getId());
            
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null, "Alugado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alugar: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
    }
    public void delete(Carros c){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM carros WHERE id=?");
            stmt.setInt(1, c.getId());
            
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
    }
    public void deleteCarros(Carros c){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE carros SET usuario = '', cpf = 0, horario = 20191119000000, horasalugadas = 0 WHERE id = ?");
            stmt.setInt(1, c.getId());
            stmt.executeUpdate();
            
            
            
            JOptionPane.showMessageDialog(null, "O carro foi devolvido");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao devolver: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
        
    }

    private void CalcularBoleto(Carros c) {
        StringBuilder sb = new StringBuilder();
        GregorianCalendar d = new GregorianCalendar();
        sb.append( d.get( GregorianCalendar.HOUR_OF_DAY ) );
        sb.append( ":" );
        sb.append( d.get( GregorianCalendar.MINUTE ) );
        sb.append( ":" );
        sb.append( d.get( GregorianCalendar.SECOND ) );
        
        
        
    }
}
