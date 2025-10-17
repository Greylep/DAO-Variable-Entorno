package org.example;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DataSource ds = DataProvider.getDataSource (
                "jdbc:mysql://localhost:3306/videojuegos",
                System.getenv("MYSQL_USER"),
                System.getenv("MYSQL_PASSWORD")
                );

        ArrayList<VideoJuegos> listado = new ArrayList<>();

        try(Connection conn = ds.getConnection()){
            Statement stmt = conn.createStatement();
            ResultSet resultado = stmt.executeQuery("SELECT * FROM videojuegos");



            while(resultado.next()){
                VideoJuegos videojuegos = new VideoJuegos();
                videojuegos.setId(resultado.getInt("id"));
                videojuegos.setNombre(resultado.getString("nombre"));
                videojuegos.setDesarrollador(resultado.getString("desarrollador"));
                videojuegos.setPlataforma(resultado.getString("plataforma"));
                videojuegos.setPlataforma(resultado.getString("plataforma"));
                listado.add(videojuegos);



            }
            listado.forEach(System.out::println);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

