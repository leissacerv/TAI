package Quidditch;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main
{
    public static void main (String []args)
    {
        MiBD conexion =  new MiBD();
        ResultSet result;
        Jugador player = new Jugador();  

        result = conexion.getQuery("select * from JUGADOR;");
        try
        {
            while(result.next())
            {
                player.setCurp(result.getString("curp"));
                player.setNombre_comp(result.getString("nombre_comp"));
                player.setFk_idpais(result.getInt("fk_idpais"));
                player.setEdad(result.getInt("edad"));
                player.setAltura(result.getFloat("altura"));
                player.setPeso(result.getInt("peso"));
                player.setFk_hotel(result.getInt("fk_hotel"));
                player.setEstado(result.getString("estado"));
                player.setFk_equipo(result.getInt("fk_equipo"));
                player.setPosicion(result.getString("posicion"));
                player.setNivel(result.getInt("nivel"));

                System.out.println ("\nCURP: "+ player.getCurp());
                System.out.println("Nombre: " +  player.getNombre_comp());
                System.out.println("Pais: " + player.getFk_idpais());
                System.out.println("Edad: " + player.getEdad());
                System.out.println("Altura: " + player.getAltura());
                System.out.println("Peso: " + player.getPeso());
                System.out.println("Hotel donde se hospeda: " + player.getFk_hotel());
                System.out.println("Estado del participante: " + player.getEstado());
                System.out.println("Equipo donde pertenece: " + player.getFk_equipo());
                System.out.println("Posicion: " + player.getPosicion());
                System.out.println("Nivel: " + player.getNivel());
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
}
