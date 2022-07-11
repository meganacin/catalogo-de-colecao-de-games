package Controllers;

import Models.Acessorio;
import Models.Colecao;
import javax.swing.table.TableModel;
import Models.Jogo;
import java.sql.ResultSet;

public class Controllers {
    public TableModel indexJogos(String nome) {
        return new Jogo().visualizar(nome);
    }
    public boolean insertJogo(String nome, int lancamento, String estadoConcerv,String console) {
        Jogo p = new Jogo(nome,lancamento,estadoConcerv,console);
        return p.insert();
    }
    public boolean deleteJogo(int id) {
        return new Jogo().delet(id);
    }
    public boolean editarJogo(int id,String nome,int lancamento,String estadoConcerv){             
        return new Jogo().edit(id, nome, lancamento, estadoConcerv);          
    }
    public TableModel indexAcessorios(String nome) {
        return new Acessorio().visualizar(nome);
    }
        public boolean insertAcessorio(String nome, int lancamento, String tipo,String console) {
        Acessorio a = new Acessorio(nome,lancamento,tipo,console);
        return a.insert();
    }
        public boolean deleteAcessorio(int id) {
        return new Acessorio().delet(id);
    }
    public boolean editarAcessorio(int id,String nome, int lancamento, String tipo) {
        return new Acessorio().edit(id, nome, lancamento, tipo);          
    }
     public ResultSet listColection() {
     return new Colecao().listColections();
     }
    
    public boolean createColection(String nome) {
        Colecao col = new Colecao(nome);
        return col.create();
    }
    public boolean deleteColecao(String nome) {
        return new Colecao().delet(nome);
    }
}
