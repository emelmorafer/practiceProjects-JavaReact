package com.company.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsSection {

    public void execute() {
        List<Persona> listPersona = new ArrayList<Persona>();

        Persona persona1 = new Persona(1L, "2345","Carlos", "Medina", 34);
        listPersona.add(persona1);
        Persona persona2 = new Persona(2L, "8756","Andres", "Aguirre", 23);
        listPersona.add(persona2);
        Persona persona3 = new Persona(3L, "9785","Felipe", "Osorio", 47);
        listPersona.add(persona3);
        Persona persona4 = new Persona(4L, "9787","Augusto", "Lopez", 19);
        listPersona.add(persona4);


        System.out.println("\n Imprimir los nombres");
        listPersona.forEach(persona -> {
            System.out.print(persona.getNombre() + " , ");
        });


        System.out.println("\n Otra forma de imprimir los nombres");
        List<String> nombres = listPersona.stream().map(persona-> persona.getNombre()).collect(Collectors.toList());
        System.out.print(nombres);


        System.out.println("\n Imprimir las edades");
        List<Integer> edades = listPersona.stream()
                .map(persona -> persona.getEdad())
                .filter(number -> number > 30)
                .collect(Collectors.toList());
        System.out.print(edades);


        System.out.println("\n Imprimir las edades mayores de 30");
        listPersona.stream()
                .filter(persona -> persona.getEdad() > 30)
                .forEach(persona -> {
                    System.out.print(persona.getNombre() + " , ");
                });


        System.out.println("\n Imprimir nombres que empiezan por A");
        List<String> nombresA = listPersona.stream()
                .map(persona -> persona.getNombre())
                .filter(nombre -> nombre.charAt(0) == 'A')
                .collect(Collectors.toList());
        System.out.println(nombresA);


        System.out.println("\n Imprimir nombres y apellidos que empiezan por A");
        List<Persona> nomApl = listPersona.stream()
                .filter(persona -> (persona.getNombre().charAt(0) == 'A' &&
                        persona.getApellido().charAt(0) == 'A'))
                .collect(Collectors.toList());
        nomApl.forEach(persona -> System.out.println(persona.getNombre()));


        System.out.println("\n Buscar la persona con la edad mas pequeña");
        Optional<Persona> personMinEdad1 = listPersona.stream().min(Comparator.comparingInt(Persona::getEdad));
        Optional<Persona> personMinEdad2 = listPersona.stream().min((per1, per2) -> per1.getEdad() - per2.getEdad());
        System.out.println("Minimos: " + personMinEdad1.get().getEdad() + " , " + personMinEdad2.get().getEdad() + " , ");


        System.out.println("\n Obtener el primer elemento de la lista");
        Optional<Persona> firtPerson = listPersona.stream().findFirst();
        System.out.println(firtPerson.get().getNombre());


        System.out.println("\n Imprimir nombres que terminan en S");
        List<Persona> nomTerS = listPersona.stream()
                .filter(persona -> (persona.getNombre().endsWith("s")))
                .collect(Collectors.toList());
        nomTerS.forEach(persona -> System.out.println(persona.getNombre()));


        System.out.println("\n Imprimir nombres que contengan d");
        List<Persona> nomConc = listPersona.stream()
                .filter(persona -> (persona.getNombre().contains("d")))
                .collect(Collectors.toList());
        nomConc.forEach(persona -> System.out.println(persona.getNombre()));
    }
}
