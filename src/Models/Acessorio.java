package Models;

import java.sql.SQLException;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class Acessorio extends Iten {

    private String tipo;

    public Acessorio() {
    }

    public Acessorio(String nome, int lancamento, String tipo, String console) {
        super(nome, lancamento, console);
        this.tipo = tipo;
    }

    @Override
    public boolean insert() {
        String sql = "insert into acessorios(nome,lancamento,tipo,console) values(?, ?, ?, ?)";

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setString(1, getNome());
            pst.setInt(2, getLancamento());
            pst.setString(3, getTipo());
            pst.setString(4, getConsole());

            pst.executeUpdate();
            System.out.println("Acessorio cadastrado com sucesso!");
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    //@Override
    public TableModel visualizar(String nome) {
        String sql = "select distinct acessorios.id,acessorios.nome,acessorios.lancamento,acessorios.tipo from acessorios right join colecoes on acessorios.console = ?";
        TableModel tb = null;

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setString(1, nome);
            rs = pst.executeQuery();
            tb = DbUtils.resultSetToTableModel(rs);
            this.desconectar(this.conexao);
            return tb;
        } catch (SQLException ex) {
            System.out.println(ex);
            return tb;
        }
    }

    @Override
    public boolean delet(int id) {
        String sql = "delete from acessorios where id=?";

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            System.out.println("Acessorio excluído com sucesso!");
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    public boolean edit(int id, String nome, int lancamento, String estadoConcerv) {
        String sql = "update acessorios set nome=?, lancamento=?, estadoConcerv=? where id=?";
        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setInt(2, lancamento);
            pst.setString(3, estadoConcerv);
            pst.setInt(4, id);
            pst.executeUpdate();
            System.out.println("Acessorio editado com sucesso!");
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
