package info3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *  Representa a tabela usuario
 *  no banco mysql
 */
public class Usuario {
    private String idusuario;
    private String nome;
    private String email;
    private String login;
    private String senha;
    private String genero;
    
    //método construtor 

    public Usuario(String nome, String email, String login, String senha, String genero) {
        setNome(nome);
        setEmail(email);
        setLogin(login);
        setSenha(senha);
        setGenero(genero);
    }               
     
    
    //método construtor
    public Usuario() {
    
    }

    public Usuario(String idusuario) {
        
    }
    
    //método que cadastra um novo usuário
    public void Cadastrar() throws SQLException {
        Connection conexao = Conexao.getConexao();
        String sql = "INSERT INTO usuario2"
                + " (nome, email, login, senha, genero) "
                + " VALUES (?, ?, ?, ?, ?) ";
        //Filtrando contra SQL-INJECTION
        PreparedStatement consulta = conexao.prepareStatement(sql);
        consulta.setString(1, this.nome);
        consulta.setString(2, this.email);
        consulta.setString(3, this.login);
        consulta.setString(4, this.senha);
        consulta.setString(5, this.genero);
        //executando a consulta/comando SQL
        consulta.executeUpdate();
       //após cadastrar queremos pegar o idusuario
        
    }
    
    
    

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    
}
