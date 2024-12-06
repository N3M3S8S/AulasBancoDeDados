/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package info3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 1919341
 */
public class Conexao {
    private static final String basededados="info3";
    private static final String usuario="root";
    private static final String senha="123456";
    private static final String servidor="localhost";
    private static final String porta="3306";
    private static final String url="jdbc:mysql://"+servidor
            +":"+porta+"/"
            +basededados
            +"?useTimezone=true&serverTimezone=UTC";
    
    public static Connection getConexao() throws SQLException {
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        conexao.setSchema(basededados);
        return conexao;
    }
    
}
