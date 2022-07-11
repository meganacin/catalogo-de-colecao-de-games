package Models;

import java.sql.SQLException;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class Jogo extends Iten {

    private String estadoConcerv;

    public Jogo() {

    }

    public Jogo(String nome, int lancamento, String estadoConcerv, String console) {
        super(nome, lancamento, console);
        this.estadoConcerv = estadoConcerv;
    }

    @Override
    public boolean insert() {
        String sql = "insert into jogos(nome,lancamento,EstadoConcerv,console) values(?, ?, ?, ?)";

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setString(1, getNome());
            pst.setInt(2, getLancamento());
            pst.setString(3, getEstadoConcerv());
            pst.setString(4, getConsole());

            pst.executeUpdate();
            System.out.println("Jogo cadastrado com sucesso!");
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

//    @Override
    public TableModel visualizar(String nome) {
        String sql = "select distinct jogos.id,jogos.nome,jogos.lancamento,jogos.estadoConcerv from jogos right join colecoes on jogos.console = ?";
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
        String sql = "delete from jogos where id=?";

        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            System.out.println("Jogo excluído com sucesso!");
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    public boolean edit(int id, String nome, int lancamento, String estadoConcerv) {
        String sql = "update jogos set nome=?, lancamento=?, estadoConcerv=? where id=?";
        try {
            this.conectar();
            pst = this.conexao.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setInt(2, lancamento);
            pst.setString(3, estadoConcerv);
            pst.setInt(4, id);
            pst.executeUpdate();
            System.out.println("Jogo editado com sucesso!");
            this.desconectar(this.conexao);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            return false;
        }
    }

    public String getEstadoConcerv() {
        return estadoConcerv;
    }

    public void setEstadoConcerv(String estadoConcerv) {
        this.estadoConcerv = estadoConcerv;
    }
}
