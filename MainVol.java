package volumen;

public class MainVol {
	public static void main(String[] args) {
		//Definicioón e iniciación al mismno tiempo
		int medAlt=3;
		int medBas=4;
		int medProf=5;
		/*Instanciar la clase 
		Crear un objeto tipo prisma rectangular*/
		PrisRec rec= new PrisRec();
		rec.alt=medAlt;
		rec.bas=medBas;
		rec.prof=medProf;

		int resultado= rec.CalcVolumen();
		System.out.println(res)
	}
}