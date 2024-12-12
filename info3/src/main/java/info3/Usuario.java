package info3;


//Importando classes e pacotes necessários
import com.mysql.cj.xdevapi.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
        String sql = "INSERT INTO usuario"
                + " (nome, email, login, senha, genero) "
                + " VALUES (?, ?, ?, ?, ?) ";
        //Filtrando contra SQL-INJECTION
        PreparedStatement consulta = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        consulta.setString(1, this.nome);
        consulta.setString(2, this.email);
        consulta.setString(3, this.login);
        consulta.setString(4, this.senha);
        consulta.setString(5, this.genero);
        
        //executando a consulta/comando SQL
        consulta.executeUpdate();
        
       //após cadastrar queremos pegar o idusuario
       ResultSet resultado = consulta.getGeneratedKeys();
       resultado.next();
       String idusuario = resultado.getString(1);
       this.idusuario = idusuario;
    }
    
    public ArrayList<Usuario> getUsuarios() throws SQLException {
        ArrayList<Usuario> ListaUsuarios = new ArrayList<>();
        Connection conexao = Conexao.getConexao();
        String sql="SELECT * FROM usuario";
        PreparedStatement comando = conexao.prepareStatement(sql);
        ResultSet resultado = comando.executeQuery();
        while(resultado.next()) {
            String idusuario = resultado.getString("idusuario");
            String nome = resultado.getString("nome");
        }
        return ListaUsuarios;
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
