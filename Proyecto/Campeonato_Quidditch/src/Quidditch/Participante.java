package Quidditch;

public class Participante {
    private String curp;
    private String nombre_comp;
    private int fk_idpais;
    private int edad;
    private float altura;
    private int peso;
    private int fk_hotel;
    private String estado;

    public Participante() {
    }

    public Participante(String curp) {
        this.curp = curp;
    }

    public Participante(String nombre_comp, int fk_idpais, int edad, float altura, int peso, int fk_hotel, String estado) {
        
        this.nombre_comp = nombre_comp;
        this.fk_idpais = fk_idpais;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.fk_hotel = fk_hotel;
        this.estado = estado;
    }

    public Participante(String curp, String nombre_comp, int fk_idpais, int edad, float altura, int peso, int fk_hotel, String estado) {
        this.curp = curp;
        this.nombre_comp = nombre_comp;
        this.fk_idpais = fk_idpais;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.fk_hotel = fk_hotel;
        this.estado = estado;
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

    @Override
    public String toString() {
        return "Participante{"+ "Curp=" + curp + ", nombre_comp=" + nombre_comp + ", fk_idpais=" + fk_idpais + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + ", fk_hotel=" + fk_hotel + ", estado=" + estado + '}';
    }  
}
    
