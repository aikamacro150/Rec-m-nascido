/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import Dao.DaoRecemnascido;
import javax.swing.JOptionPane;
import modelo.Recemnascido;
import tela.manutencao.ManutencaoRecemnascido;
/**
 *
 * @author Administrador
 */
public class ControladorRecemnascido {
    public static void inserir(ManutencaoRecemnascido man){
        Recemnascido objeto = new Recemnascido();
        objeto.setNomedamae(main.jtfNomedamae.getText());
        objeto.setSexo(main.jtfSexo.getText());
        objeto.setPeso(main.jtfPeso.getText());
        objeto.setNumerodoquarto(main.jtfNumerodoquarto.getText());
        
        boolean resultado = DaoRecemnascido.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}
    
}
