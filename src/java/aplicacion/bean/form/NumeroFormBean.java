/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.bean.form;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped

public class NumeroFormBean {
private int n1=0,n2=0, primos = 0;
private int noprimos=0;
private int pares=0;
private int impares=0;


    /**
     * Creates a new instance of PrimoFormBean
     */
    public NumeroFormBean() {
    }
    
    public void tipoNumero()
    {
        setPrimos(0);
        setNoprimos(0);
        for(int i = getN1(); i <= getN2(); i++)
        {
            int count = 0;
            for (int e = 1; e <= i; e++)
            {
                if(i % e == 0) count++;
            }
            if(count < 3 && count > 1){
                setPrimos(getPrimos() + 1);
            }else{
                setNoprimos(getNoprimos() + 1);
            }   
        }
        setPares(0);
        setImpares(0);
        for(int i=getN1();i<=getN2();i++){
            if(i%2==0){
                setPares(getPares()+1);
            }else{
                setImpares(getImpares()+1);
            }
        }
    }
    /**
     * @return the n1
     */
    public int getN1() {
        return n1;
    }

    /**
     * @param n1 the n1 to set
     */
    public void setN1(int n1) {
        this.n1 = n1;
    }

    /**
     * @return the n2
     */
    public int getN2() {
        return n2;
    }

    /**
     * @param n2 the n2 to set
     */
    public void setN2(int n2) {
        this.n2 = n2;
    }

    /**
     * @return the primos
     */
    public int getPrimos() {
        return primos;
    }

    /**
     * @param primos the primos to set
     */
    public void setPrimos(int primos) {
        this.primos = primos;
    }

    /**
     * @return the noprimos
     */
    public int getNoprimos() {
        return noprimos;
    }

    /**
     * @param noprimos the noprimos to set
     */
    public void setNoprimos(int noprimos) {
        this.noprimos = noprimos;
    }

    /**
     * @return the pares
     */
    public int getPares() {
        return pares;
    }

    /**
     * @param pares the pares to set
     */
    public void setPares(int pares) {
        this.pares = pares;
    }

    /**
     * @return the impares
     */
    public int getImpares() {
        return impares;
    }

    /**
     * @param impares the impares to set
     */
    public void setImpares(int impares) {
        this.impares = impares;
    }
    
}
