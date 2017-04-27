/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.bean.form;

import aplicacion.modelo.dominio.JuegoAhorcado;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class JuegoFormBean implements Serializable{
    private JuegoAhorcado juegoAhorcado;
    private String palabraIngresada;
    private char letraIngresada;
    private boolean componenteDeshabilitado;
    private String imagen;
    
    /**
     * Creates a new instance of JuegoFormBean
     */
    public JuegoFormBean() {
        juegoAhorcado=new JuegoAhorcado();
        componenteDeshabilitado = false;
    }
    public void empezarJuego(){
        juegoAhorcado.comenzarJuego(getPalabraIngresada());
        setComponenteDeshabilitado(true);
        FacesContext context=FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"JUEGO INICIADO","Tenga Suerte"));
    }
    public void controlarLetra(){
        boolean esLetraEncontrada=juegoAhorcado.buscarLetra(getLetraIngresada());
        setImagen(juegoAhorcado.cargarImagen());
        if (esLetraEncontrada==true){
            if (juegoAhorcado.juegoGanado()==true){
                FacesContext context = FacesContext.getCurrentInstance();
                setComponenteDeshabilitado(false);
                setPalabraIngresada(new String());
                setJuegoAhorcado(new JuegoAhorcado());
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"WINER","Usted ha ganado"));
            }
        }else {
            if(juegoAhorcado.getIntentos()==0){
                FacesContext context = FacesContext.getCurrentInstance();
                setComponenteDeshabilitado(false);
                setPalabraIngresada(new String());
                setJuegoAhorcado(new JuegoAhorcado());
                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"GAME OVER","Usted ha perdido"));
            }
        }
    }

    /**
     * @return the juegoAhorcado
     */
    public JuegoAhorcado getJuegoAhorcado() {
        return juegoAhorcado;
    }

    /**
     * @param juegoAhorcado the juegoAhorcado to set
     */
    public void setJuegoAhorcado(JuegoAhorcado juegoAhorcado) {
        this.juegoAhorcado = juegoAhorcado;
    }

    /**
     * @return the palabraIngresada
     */
    public String getPalabraIngresada() {
        return palabraIngresada;
    }

    /**
     * @param palabraIngresada the palabraIngresada to set
     */
    public void setPalabraIngresada(String palabraIngresada) {
        this.palabraIngresada = palabraIngresada;
    }

    /**
     * @return the letraIngresada
     */
    public char getLetraIngresada() {
        return letraIngresada;
    }

    /**
     * @param letraIngresada the letraIngresada to set
     */
    public void setLetraIngresada(char letraIngresada) {
        this.letraIngresada = letraIngresada;
    }

    /**
     * @return the componenteDeshabilitado
     */
    public boolean isComponenteDeshabilitado() {
        return componenteDeshabilitado;
    }

    /**
     * @param componenteDeshabilitado the componenteDeshabilitado to set
     */
    public void setComponenteDeshabilitado(boolean componenteDeshabilitado) {
        this.componenteDeshabilitado = componenteDeshabilitado;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}
