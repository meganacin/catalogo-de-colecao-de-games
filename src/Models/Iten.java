package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public abstract class Iten extends DAO {

    private String nome;
    private int lancamento;
    private String console;

    PreparedStatement pst = null;
    ResultSet rs = null;

    public Iten() {

    }

    public Iten(String nome, int lancamento,String console) {
        this.nome = nome;
        this.lancamento = lancamento;
        this.console = console;
    }

    public boolean insert() {
        String sql = "insert into itens(nome,lancamento,console) values(?, ?, ?)";

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setString(1, getNome());
            pst.setInt(2, getLancamento());
            pst.setString(3, getConsole());
            pst.executeUpdate();
            System.out.println("Item cadastrado com sucesso!");
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    public TableModel visualizar(String nome) {
        String sql = "select distinct itens.id, itens.nome, itens.lancamento, itens.valor from itens";

        TableModel tb = null;

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            tb = DbUtils.resultSetToTableModel(rs);
            this.desconectar(this.conexao);
            return tb;
        } catch (SQLException ex) {
            System.out.println(ex);
            return tb;
        }
    }
    public boolean delet(int id) {
        String sql = "delete from item where id=?";
        
        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            System.out.println("Cliente excluído com sucesso!");
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

    public int getLancamento() {
        return lancamento;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }
}
