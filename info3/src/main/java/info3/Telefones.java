package info3;

//Esta classe abstrai a tabela telefones do banco de dados

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Telefones {
    private String idtelefones;
    private String idusuarios;
    private Usuario usuario;
    private String telefone;

    //metodo que é executado ao instanciar a classe (construtor)
    public Telefones() {
        
    }
    
    public void cadastrar () throws SQLException {
        Connection conexao = Conexao.getConexao();
        String sql = "INSERT INTO telefones (idusuario, telefones) VALUES (?, ?)";
        //Filtrando ataques ao banco de dados
        
        PreparedStatement comando = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        comando.setString(1, this.idusuarios);
        comando.setString(2, this.telefone);
        comando.executeUpdate();
        
        //Recuperando chave utilizada
        ResultSet resultado = comando.getGeneratedKeys();
        
        if (resultado.next()) {
            this.telefone = resultado.getString(sql);
        }
    }
    
    public String getIdtelefones() {
        return idtelefones;
    }

    public void setIdtelefones(String idtelefones) {
        this.idtelefones = idtelefones;
    }

    public String getIdusuarios() {
        return idusuarios;
    }

    public void setIdusuarios(String idusuarios) {
        this.idusuarios = idusuarios;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
