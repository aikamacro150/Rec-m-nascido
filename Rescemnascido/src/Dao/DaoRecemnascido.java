/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Recemnascido;
/**
 *
 * @author Administrador
 */
public class DaoRecemnascido {
     public static boolean inserir(Recemnascido objeto) {
        String sql = "INSERT INTO Recemnascido (sexo, nome_da_mae, numero_do_quarto, peso) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getSexo());
            ps.setString(2, objeto.getNome_da_mae());
            ps.setString(3, objeto.getNumero_do_quarto());
            ps.setString(4, objeto.getPeso());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    public static void main(String[] args) {
        Recemnascido objeto = new Recemnascido();
        objeto.setCodigo(1);
        objeto.setNome_da_mae("Sandra");
        objeto.setNumero_do_quarto(4);
        objeto.setPeso(3,2);
        objeto.setSexo("masculino");
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
}
