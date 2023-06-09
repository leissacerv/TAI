/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quidditch;

public class Jugador {
    private int fk_idpais;
    private int edad;
    private float altura;
    private int peso;
    private int fk_hotel;
    private String estado;
    private int fk_equipo;
    private int nivel;
    private String curp;
    private String nombre_comp;
    private String posicion;

    public Jugador() {
    }

    public Jugador(String curp) {
        this.curp = curp;
    }

    public Jugador(int fk_idpais, int edad, float altura, int peso, int fk_hotel, String estado, int fk_equipo, int nivel, String nombre_comp, String posicion) {
        this.fk_idpais = fk_idpais;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.fk_hotel = fk_hotel;
        this.estado= estado;
        this.fk_equipo = fk_equipo;
        this.nivel = nivel;
        this.nombre_comp = nombre_comp;
        this.posicion = posicion;
    }

    public Jugador(int fk_idpais, int edad, float altura, int peso, int fk_hotel,String estado, int fk_equipo, int nivel, String curp, String nombre_comp, String posicion) {
        this.fk_idpais = fk_idpais;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.fk_hotel = fk_hotel;
        this.estado = estado;
        this.fk_equipo = fk_equipo;
        this.nivel = nivel;
        this.curp = curp;
        this.nombre_comp = nombre_comp;
        this.posicion = posicion;
    }

    public int getFk_idpais() {
        return fk_idpais;
    }

    public void setFk_idpais(int fk_idpais) {
        this.fk_idpais = fk_idpais;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getFk_hotel() {
        return fk_hotel;
    }

    public void setFk_hotel(int fk_hotel) {
        this.fk_hotel = fk_hotel;
    }

    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public int getFk_equipo() {
        return fk_equipo;
    }

    public void setFk_equipo(int fk_equipo) {
        this.fk_equipo = fk_equipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre_comp() {
        return nombre_comp;
    }

    public void setNombre_comp(String nombre_comp) {
        this.nombre_comp = nombre_comp;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" + "fk_idpais=" + fk_idpais + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", fk_hotel=" + fk_hotel + ", estado=" + estado + ", fk_equipo=" + fk_equipo + ", nivel=" + nivel + ", curp=" + curp + ", nombre_comp=" + nombre_comp + ", posicion=" + posicion + '}';
    }
    
    
    
}
