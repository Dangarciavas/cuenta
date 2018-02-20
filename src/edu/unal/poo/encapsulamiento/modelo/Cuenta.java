package edu.unal.poo.encapsulamiento.modelo;

/**
 *
 * @author Daniel
 */
public class Cuenta {
    private int numero;
    private int clave;
    private String duenno;
    private double saldo;

    public Cuenta(int numero, int clave, String duenno, double saldo) {
        this.numero = numero;
        this.clave = clave;
        this.duenno = duenno;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public int getClave() {
        return clave;
    }

    public String getDuenno() {
        return duenno;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setDuenno(String duenno) {
        this.duenno = duenno;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean consignar(double valor){
     if(valor>0){
         this.saldo+=valor;
         return true;
     }else{
         return false;
     }
    }
    
    
    public boolean retirar(double valor){
    if (valor<this.saldo){
            this.saldo = this.saldo- valor;
            return true;    
        }else{
        return false;
         }       
    }
    
    public boolean cambiarClave(int nuevaclave){
    if(nuevaclave!=this.clave){
    this.clave=nuevaclave;
    return true;
    }else{
        return false;
        }  
    }
    
}
