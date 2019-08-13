/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Recemnascido {
 private Integer numerodoquarto;
 private Integer codigo;
 private String nomedamae;
 private String sexo;
 private double peso;

    public Integer getNumerodoquarto() {
        return numerodoquarto;
    }

    public void setNumerodoquarto(Integer numerodoquarto) {
        this.numerodoquarto = numerodoquarto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome_da_mae() {
        return nomedamae;
    }

    public void setNome_da_mae(String nomedamae) {
        this.nomedamae = nomedamae;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Recemnascido{" + "nomedamae=" + nomedamae + '}';
    }

  
    
}
