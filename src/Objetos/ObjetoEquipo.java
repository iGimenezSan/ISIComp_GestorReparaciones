/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author McKyavelik
 */
public class ObjetoEquipo {

    String tipoEquipo;
    String marcaEquipo;
    String modeloEquipo;
    String serialEquipo;
    String sistemaOperativo;
    String serialSistema;
    String propietario;

    public ObjetoEquipo(String tipoEquipo, String marcaEquipo, String modeloEquipo, String serialEquipo, String sistemaOperativo, String serialSistema, String propietario) {
        this.tipoEquipo = tipoEquipo;
        this.marcaEquipo = marcaEquipo;
        this.modeloEquipo = modeloEquipo;
        this.serialEquipo = serialEquipo;
        this.sistemaOperativo = sistemaOperativo;
        this.serialSistema = serialSistema;
        this.propietario = propietario;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }

    public String getMarcaEquipo() {
        return marcaEquipo;
    }

    public void setMarcaEquipo(String marcaEquipo) {
        this.marcaEquipo = marcaEquipo;
    }

    public String getModeloEquipo() {
        return modeloEquipo;
    }

    public void setModeloEquipo(String modeloEquipo) {
        this.modeloEquipo = modeloEquipo;
    }

    public String getSerialEquipo() {
        return serialEquipo;
    }

    public void setSerialEquipo(String serialEquipo) {
        this.serialEquipo = serialEquipo;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getSerialSistema() {
        return serialSistema;
    }

    public void setSerialSistema(String serialSistema) {
        this.serialSistema = serialSistema;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
}
