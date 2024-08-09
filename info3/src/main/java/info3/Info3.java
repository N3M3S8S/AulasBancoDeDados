/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package info3;

import java.sql.SQLException;

/**
 *
 * @author 1919341
 */
public class Info3 {

    public static void main(String[] args) throws SQLException {
        Usuario u = new Usuario("", "", "", "", "");
        u.Cadastrar();
        
    }
}
