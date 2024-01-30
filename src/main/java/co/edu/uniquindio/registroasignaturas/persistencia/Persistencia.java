package co.edu.uniquindio.registroasignaturas.persistencia;

import co.edu.uniquindio.registroasignaturas.enums.TipoUsuario;
import co.edu.uniquindio.registroasignaturas.model.Docente;
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

    public void guardarDocente(ArrayList<Docente>listaVendedores) throws IOException {
        StringBuilder datos  = new StringBuilder();
        for (Docente docente: listaVendedores) {
            datos.append(docente.getUser()).append("!!").
                    append(docente.getName()).append("!!").
                    append(docente.getLastName()).append("!!").
                    append(docente.getEmail()).append("!!").
                    append(docente.getPassword()).append("!!").
                    append(docente.getTipoUsuario()).append("\n");
        }
        archivoUtil.guardarArchivo(rutaProfesores, datos.toString(), false );
    }
    public ArrayList<Docente> leerDocente()throws IOException{
        ArrayList<Docente> docentes = new ArrayList<>();
        ArrayList<String>datos = archivoUtil.leerArchivo(rutaProfesores);
        String cadena;
        for (String t: datos) {
            cadena = t;
            Docente docente = new Docente();
            docente.setUser(cadena.split("!!")[0]);
            docente.setName(cadena.split("!!")[1]);
            docente.setLastName(cadena.split("!!")[2]);
            docente.setEmail(cadena.split("!!")[5]);
            docente.setPassword(cadena.split("!!")[6]);
            docente.setTipoUsuario(TipoUsuario.valueOf(cadena.split("!!")[7]));
            docentes.add(docente);
        }
        return docentes;
    }

}
