package co.edu.uniquindio.registroasignaturas.model;

import java.util.ArrayList;

public class Universidad_mainLogic {
    Usuario user;
    ArrayList<Asignatura> listaAsignaturas = new ArrayList<>();
    ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    ArrayList<Docente> listaDocentes = new ArrayList<>();



    //datos quemados de listaAsignaturas y listaEstudiantes:
    public void quemarDatos(){
        //lista estudiantes:
        listaEstudiantes.add(new Estudiante
                ("yan","123","Franco","Gómez","yan@hotmail",user.getTipoUsuario().ESTUDIANTE));
        listaEstudiantes.add(new Estudiante
                ("Liz","321","Eliza","Perex","liz@hotmail",user.getTipoUsuario().ESTUDIANTE));
        listaEstudiantes.add(new Estudiante
                ("Lucho","789","Luis","Lopez","lucho@hotmail",user.getTipoUsuario().ESTUDIANTE));
        //lista docentes:
        listaEstudiantes.add(new Estudiante
                ("Georg","123","Georege","Gómez","yan@hotmail",user.getTipoUsuario().DOCENTE));
        listaEstudiantes.add(new Estudiante
                ("Rodri","321","Rodrigo","Perex","liz@hotmail",user.getTipoUsuario().DOCENTE));
        listaEstudiantes.add(new Estudiante
                ("Luisa","789","Luisa","Lopez","lucho@hotmail",user.getTipoUsuario().DOCENTE));
        //lista asignatura: Teorico practicas
        listaAsignaturas.add(new TeoricoPractica("Lectura y Escritura en Ingeniería", "12306", 2, 4, 4,2));
        listaAsignaturas.add(new TeoricoPractica("Introducción a la Ingería de Sistemas y Computo", "12303", 3, 4, 4,2));
        listaAsignaturas.add(new TeoricoPractica("Lógica de Programación", "12305", 3, 4, 4,2));
        listaAsignaturas.add(new TeoricoPractica("Matemáticas Generales", "12302", 2, 4, 4,2));
        listaAsignaturas.add(new TeoricoPractica("Fundamentos de Electronica", "12311", 3, 4, 4, 2));
        listaAsignaturas.add(new TeoricoPractica("Fisica General", "12313", 4, 4, 4, 2));
        //teóricas:
        listaAsignaturas.add(new Teorica("Pensamiento Sistemico", "12310", 4, 4, "N/A"));
        listaAsignaturas.add(new Teorica("Programación I", "12309", 4, 4, "Lógica de Programación"));
        listaAsignaturas.add(new Teorica("Algebra Lineal", "12308", 4, 4, "Matemáticas Generales"));
        listaAsignaturas.add(new Teorica("Calculo Diferencial", "12307", 4, 6, "Matemáticas Generales"));
        listaAsignaturas.add(new Teorica("Teoria y Diseño Organizacional", "12316", 4, 4, "Pensamiento Sistemico"));
        listaAsignaturas.add(new Teorica("Programación II", "12315", 4, 4, "Programación I"));
        listaAsignaturas.add(new Teorica("Matemáticas Discretas", "12314", 4, 4, "Algebra Lineal"));
        listaAsignaturas.add(new Teorica("Cálculo Integral", "12312", 4, 6, "Calculo Diferencial"));
        listaAsignaturas.add(new Practica("Fundamentos de Infraestructura Computacional", "12322", 3, 4, 4));
       //Practicas:
        listaAsignaturas.add(new Practica("Laboratorio de Fisica", "12321", 3, 4, 4));
    }

}
