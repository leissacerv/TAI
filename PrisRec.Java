package volumen;

public class PrisRec {
	int alt;		//Atributos
	int bas;
	int prof;

	//CONSTRUCTORES LLEVAN EL NOMBRE DE LA CLASE
	public PrisRec(){

	}

	//Sobrecarga de constructores (más de un constructor), no deben haber dos constructores iguales
	public PrisRec(int alt, int bas, int prof){
		this.alt=alt;
		this.bas=bas;		//Argumentos que recibe
		this.prof=prof;
	}

	public int CalcVolumen(){
		return alt*bas*prof
	}
}