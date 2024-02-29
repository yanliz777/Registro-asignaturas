package co.edu.uniquindio.registroasignaturas.persistencia;

import co.edu.uniquindio.registroasignaturas.enums.TipoUsuario;
import co.edu.uniquindio.registroasignaturas.model.Estudiante;
import co.edu.uniquindio.registroasignaturas.model.Profesor;
import java.io.IOException;
import java.util.ArrayList;

public class Persistencia {

    private ArchivoUtil archivoUtil = new ArchivoUtil();
    public static final String rutaAsignatura = "src/main/java/co/edu/uniquindio/" +
            "registroasignaturas/archivos/Asignaturas.txt";
    public static final String rutaEstudiantes = "src/main/java/co/edu/uniquindio/" +
            "registroasignaturas/archivos/Estudiantes.txt";
    public static final String rutaProfesores = "src/main/java/co/edu/uniquindio/" +
            "registroasignaturas/archivos/Profesores.txt";

    public void guardarDocente(ArrayList<Profesor>listaVendedores) throws IOException {
        StringBuilder datos  = new StringBuilder();
        for (Profesor docente: listaVendedores) {
            datos.append(docente.getUsuario()).append("!!").
                    append(docente.getNombre()).append("!!").
                    append(docente.getApellido()).append("!!").
                    append(docente.getEmail()).append("!!").
                    append(docente.getPassword()).append("\n");
        }
        archivoUtil.guardarArchivo(rutaProfesores, datos.toString(), false );
    }
    public ArrayList<Profesor> leerDocente()throws IOException{
        ArrayList<Profesor> docentes = new ArrayList<>();
        ArrayList<String>datos = archivoUtil.leerArchivo(rutaProfesores);
        String cadena;
        for (String t: datos) {
            cadena = t;
            Profesor docente = new Profesor();
            docente.setUsuario(TipoUsuario.valueOf(cadena.split("!!")[0]));
            docente.setNombre(cadena.split("!!")[1]);
            docente.setApellido(cadena.split("!!")[2]);
            docente.setEmail(cadena.split("!!")[3]);
            docente.setPassword(cadena.split("!!")[4]);
            docentes.add(docente);
        }
        return docentes;
    }

    public void guardarEstudiantes(ArrayList<Estudiante> listaEstudiantes) throws IOException {
        StringBuilder datos  = new StringBuilder();
        for (Estudiante estudiante: listaEstudiantes) {
            datos.append(estudiante.getUsuario()).append("!!").
                    append(estudiante.getNombre()).append("!!").
                    append(estudiante.getApellido()).append("!!").
                    append(estudiante.getEmail()).append("!!").
                    append(estudiante.getPassword()).append("\n");

        }
        archivoUtil.guardarArchivo(rutaEstudiantes, datos.toString(), false );
    }
    public ArrayList<Estudiante> leerEstudiante()throws IOException{
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        ArrayList<String>datos = archivoUtil.leerArchivo(rutaProfesores);
        String cadena;
        for (String t: datos) {
            cadena = t;
            Estudiante estudiante = new Estudiante();
            estudiante.setUsuario(TipoUsuario.valueOf(cadena.split("!!")[0]));
            estudiante.setNombre(cadena.split("!!")[1]);
            estudiante.setApellido(cadena.split("!!")[2]);
            estudiante.setEmail(cadena.split("!!")[3]);
            estudiante.setPassword(cadena.split("!!")[4]);
            estudiantes.add(estudiante);
        }
        return estudiantes;
    }

}
