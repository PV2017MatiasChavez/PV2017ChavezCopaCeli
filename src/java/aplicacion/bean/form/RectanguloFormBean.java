/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.bean.form;

import aplicacion.modelo.dominio.Distancia;
import aplicacion.modelo.dominio.Punto;
import aplicacion.modelo.dominio.Rectangulo;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@SessionScoped
public class RectanguloFormBean {
    private double x1;
    private double y1;
    private double base;
    private double altura;
    private ArrayList<Punto> puntosEncontrados;
    private Rectangulo unRectangulo;
    private double superficie;
    private double perimetro;
    
    /**
     * Creates a new instance of RectanguloFormBean
     */
    public RectanguloFormBean() {
    }
    public void calcularOtrosPuntos(){
        Punto unPuntoA = new Punto(getX1(), getY1());
        Rectangulo rectangulo = new Rectangulo();
        setPuntosEncontrados(rectangulo.encontrarNuevoPunto(unPuntoA, getBase(), getAltura()));
        setUnRectangulo(new Rectangulo(getPuntosEncontrados().get(0), getPuntosEncontrados().get(1), getPuntosEncontrados().get(2), getPuntosEncontrados().get(3)));
    }
    public double calcularSuperficie(){
        superficie=altura*base;
        return superficie;
    }
    public double calcularPerimetro(){
        perimetro=altura*2+base*2;
        return perimetro;
    }
    /**
     * @return the x1
     */
    public double getX1() {
        return x1;
    }

    /**
     * @param x1 the x1 to set
     */
    public void setX1(double x1) {
        this.x1 = x1;
    }

    /**
     * @return the y1
     */
    public double getY1() {
        return y1;
    }

    /**
     * @param y1 the y1 to set
     */
    public void setY1(double y1) {
        this.y1 = y1;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the puntosEncontrados
     */
    public ArrayList<Punto> getPuntosEncontrados() {
        return puntosEncontrados;
    }

    /**
     * @param puntosEncontrados the puntosEncontrados to set
     */
    public void setPuntosEncontrados(ArrayList<Punto> puntosEncontrados) {
        this.puntosEncontrados = puntosEncontrados;
    }

    /**
     * @return the unRectangulo
     */
    public Rectangulo getUnRectangulo() {
        return unRectangulo;
    }

    /**
     * @param unRectangulo the unRectangulo to set
     */
    public void setUnRectangulo(Rectangulo unRectangulo) {
        this.unRectangulo = unRectangulo;
    }

    /**
     * @return the superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @return the perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

}
