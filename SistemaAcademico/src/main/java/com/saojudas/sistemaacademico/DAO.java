package com.saojudas.sistemaacademico;

import java.sql.*;

public class DAO {
    public boolean existe (Usuario usuario) throws Exception{
        String sql = "SELECT * FROM tb_usuario WHERE nome = ? AND senha = ?";
        ConnectionFactory factory = new ConnectionFactory();
        try(Connection conn = factory.obtemConexao();
                PreparedStatement ps = conn.prepareStatement(sql)){
                    ps.setString(1,usuario.getNome());
                    ps.setString(2,usuario.getSenha());
                    try(ResultSet rs = ps.executeQuery()){
                        return rs.next();
                    }
                }
    }
}
