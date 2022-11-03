package com.saojudas.aulabd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Pessoa {
    private int codigo;
    private String nome;
    private String fone;
    private String email;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public String getEmail() {
        return email;
    }
    
    public void inserir(){
        //1: Definir comando do SQL;
        String sql = "INSERT INTO tb_pessoa(nome, fone, email) VALUES (?,?,?)";
        
        //2: Abrir uma conexão com banco de dados;
        ConnectionFactory factory = new ConnectionFactory();
        
        try(Connection c = factory.obtemConexao()){
            
            //3: Pré compilação do comando;
            PreparedStatement ps = c.prepareStatement(sql);
            
            //4: Preenchimento de dados;
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            
            //5: Executar o comando no MySQL;
            
            ps.execute();
        }catch(Exception e){
            
        }
    }
    
    public void atualizar(){
        //1: definir comando SQL
        
        String sql = "UPDATE tb_pessoa SET nome nome = ?, fone = ?, email = ? WHERE codigo = ?";
        
        //2: abrir a conexão
        ConnectionFactory factory = new ConnectionFactory();
        
        try(Connection c = factory.obtemConexao()){
            
            //3: Pré compilamento
            PreparedStatement ps = c.prepareStatement(sql);
            
            //4: Preenche os dados para os placeholders
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            ps.setInt(4, codigo);
            
            //5: Executar comando SQL
            ps.execute();
        }catch(Exception e){
            
        }
    }
    
    public void deletar(){
        //1: denfinir comando sql
        String sql = "DELETE FROM tb_pessoa WHERE codigo = ?";
        
        //2: Abrir conexão com banco de dados.
        ConnectionFactory factory = new ConnectionFactory();
        
        try(Connection c = factory.obtemConexao()){
            
            //3: Pré compilamento
            PreparedStatement ps = c.prepareStatement(sql);
            
             //4: Preenche os dados para os placeholders
            ps.setInt(1, codigo);
            
            ps.execute();   
        }catch(Exception e){
        }
    }
    
    public void listar(){
        //1: denfinir comando sql
        String sql = "SELECT * FROM tb_pessoa";
        
        //2: Abrir conexão com banco de dados.
        ConnectionFactory factory = new ConnectionFactory();
        
        try(Connection c = factory.obtemConexao()){
            
            //3: Pré compilamento
            PreparedStatement ps = c.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int codigo =  rs.getInt("codigo");
                String nome = rs.getString("nome");
                String fone = rs.getString("fone");
                String email = rs.getString("email");
                
                // &d = valor decimal; &s = valor String;
                String aux = String.format("Código: %d, Nome: &s, Fone: &s, Email: &s", codigo,nome,fone,email);
                // ou String aux = "Código: " + codigo + " Nome: " + nome;
                
                JOptionPane.showMessageDialog(null, aux);
            }     
        }catch(Exception e){
        }
    }
        
}
