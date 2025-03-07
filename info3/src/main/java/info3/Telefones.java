package info3;

//Esta classe abstrai a tabela telefones do banco de dados

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Telefones {
    private String idtelefone;
    private String idusuario;
    private String telefone;

    
    
    //metodo que é executado ao instanciar a classe (construtor)
    public Telefones() {
        
    }
    
    public void cadastrar () throws SQLException {
        Connection conexao = Conexao.getConexao();
        String sql = "INSERT INTO telefones (idusuario, telefone) VALUES (?, ?)";
        //Filtrando ataques ao banco de dados
        
        PreparedStatement comando = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        comando.setString(1, this.idusuario);
        comando.setString(2, this.telefone);
        comando.executeUpdate();
        
        //Recuperando chave utilizada
        ResultSet resultado = comando.getGeneratedKeys();
        resultado.next();
        idtelefone = resultado.getString(1);
    }
    
    public String getIdtelefones() {
        return idtelefone;
    }

    public void setIdtelefones(String idtelefones) {
        this.idtelefone = idtelefones;
    }

    public String getIdusuarios() {
        return idusuario;
    }

    public void setIdusuarios(String idusuarios) {
        this.idusuario = idusuarios;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
