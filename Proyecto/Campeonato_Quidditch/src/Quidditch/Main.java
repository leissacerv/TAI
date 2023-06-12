package Quidditch;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main
{
    public static void main (String []args)
    {
        MiBD conexion =  new MiBD();
        ResultSet result;
        Participante player = new Participante();  

        result = conexion.getQuery("select * from PARTICIPANTE;");
        try
        {
            while(result.next())
            {
                player.setNum_part(result.getInt("num_part"));
                player.setCurp(result.getString("curp"));
                player.setNombre_comp(result.getString("nombre_comp"));
                player.setFk_idpais(result.getInt("fk_idpais"));
                player.setEdad(result.getInt("edad"));
                player.setAltura(result.getFloat("altura"));
                player.setPeso(result.getInt("peso"));
                player.setFk_hotel(result.getInt("fk_hotel"));
                player.setEstado(result.getString("estado"));
                
                System.out.println("\nNumero de participante: " + player.getNum_part());
                System.out.println ("CURP: "+ player.getCurp());
                System.out.println("Nombre: " +  player.getNombre_comp());
                System.out.println("Pais: " + player.getFk_idpais());
                System.out.println("Edad: " + player.getEdad());
                System.out.println("Altura: " + player.getAltura());
                System.out.println("Peso: " + player.getPeso());
                System.out.println("Hotel donde se hospeda: " + player.getFk_hotel());
                System.out.println("Estado del participante: " + player.getEstado());
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
