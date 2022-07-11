package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.TableModel;

public class Colecao extends DAO {

    private String nome;

    public Colecao() {

    }

    public Colecao(String nome) {
        this.nome = nome;
    }

    PreparedStatement pst = null;

    public ResultSet listColections() {
        String sql = "select nome from colecoes";

        TableModel tb = null;

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            return pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex);
            return null;
        }
    }

    public boolean create() {
        String sql = "insert into colecoes(nome) values(?)";

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setString(1, getNome());
            pst.executeUpdate();
            System.out.println("Coleção cadastrado com sucesso!");
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    public boolean delet(String nome) {
        String sql = "delete from colecoes where nome=?";

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setString(2, nome);

            pst.executeUpdate();
            System.out.println("Coleção excluída com sucesso!");
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
