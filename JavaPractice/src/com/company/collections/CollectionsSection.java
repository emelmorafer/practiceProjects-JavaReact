package com.company.collections;

import java.util.*;

public class CollectionsSection {

    public void execute() {

        //frequencyWord();
        //firtElement();
        //mostFrequentElement();
        //primeraPalabraNoRepite();
        elementosMasFrecuentes();



    }

    public void frequencyWord() {
        // Ejercicio:
        // Escribe un programa en Java que cuente la cantidad de veces que aparece cada palabra en una lista de palabras y las ordene alfabéticamente.

        // Lista de palabras
        List<String> palabras = Arrays.asList(
                "java", "python", "java", "c++", "java", "python", "c#", "c#", "c++", "ruby"
        );

        // Mapa ordenado alfabéticamente para almacenar conteo de palabras
        Map<String, Integer> frecuencia = new TreeMap<>();

        /*
        getOrDefault(K key, V defaultValue) es un método de Map<K, V> en Java que:
        --Devuelve el valor asociado a la clave (key) si existe.
        --Si la clave no existe, devuelve un valor por defecto (defaultValue) sin modificar el mapa.
        */

        // Contar palabras
        for (String palabra : palabras) {
            frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
        }

        // Mostrar resultado ordenado
        System.out.println("Frecuencia de palabras ordenadas alfabéticamente:");
        for (Map.Entry<String, Integer> entry : frecuencia.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    public void firtElement() {
        // Ejercicio:
        // Dado un array de enteros, encuentra el primer elemento no repetido.

        // Lista de numeros
        List<Integer> numbers = Arrays.asList(4, 5, 1, 2, 0, 4, 1, 2);
        int firtNum=0;


        /*int coinci;
        for(Integer num1 : numbers){
            coinci = 0;
            for(Integer num2 : numbers){
                if(num1==num2){
                    coinci++;
                }
            }
            if(coinci==1){
                firtNum=num1;
                break;
            }
        }*/


        Map<Integer, Integer> frecuencia = new LinkedHashMap<>(); // Mantiene el orden
        // Contar las apariciones de cada número
        for (int num : numbers) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }

        // Encontrar el primer número con frecuencia 1
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() == 1) {
                firtNum = entry.getKey();
                break;
            }
        }

        System.out.println("El primer elemento no repetido es : " + firtNum);
    }


    public void mostFrequentElement() {
        // Ejercicio:
        // Dado un array de enteros, encuentra los k elementos más frecuentes.

        // Lista de numeros
        List<Integer> numbers = Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5);
        int k=2;

        // Paso 1: Contar frecuencia de cada número
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int num : numbers) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }

        // Paso 2: Usar un Heap (PriorityQueue) para almacenar los k más frecuentes
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> frecuencia.get(a) - frecuencia.get(b));

        // (a, b) -> frecuencia.get(a) - frecuencia.get(b) define un comparador ascendente basado en la frecuencia.
        // En nuestro caso, queremos ordenar los números asendentemente por su frecuencia, no por su valor.

        // Si frecuencia.get(a) < frecuencia.get(b), el resultado es negativo, lo que significa que a irá antes en el orden.
        // Si frecuencia.get(a) > frecuencia.get(b), el resultado es positivo, lo que significa que b irá antes en el orden.
        // Si son iguales, el orden relativo no cambia.
        // Si la diferencia es negativa, a va primero; si es positiva, b va primero.

        for (int num : frecuencia.keySet()) {
            heap.offer(num);
            if (heap.size() > k) {
                heap.poll(); // Mantener solo los k más grandes
            }
        }

        // Paso 3: Extraer los k elementos más frecuentes en orden inverso
        List<Integer> resultado = new ArrayList<>();
        while (!heap.isEmpty()) {
            resultado.add(heap.poll());
        }
        Collections.reverse(resultado); // Para obtener el orden correcto

        System.out.println("Los " + k + " elementos más frecuentes: " + resultado);
    }


    public void primeraPalabraNoRepite() {
        // Ejercicio:
        // Dado un array de palabras, encuentra la primera palabra que no se repite.

        String noRepite = "";
        // Lista de palabras
        List<String> palabras = Arrays.asList(
                "java", "python", "java", "c", "c", "ruby", "python", "go"
        );

        // LinkedHashMap mantiene el orden de inserción, asegurando que la primera palabra única sea la correcta.
        Map<String, Integer> frecuencia = new LinkedHashMap<>();

        // Contar palabras
        for (String palabra : palabras) {
            frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
        }

        // Mostrar resultado ordenado
        System.out.println("Frecuencia de palabras ordenadas alfabéticamente:");
        for (Map.Entry<String, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() == 1) {
                noRepite = entry.getKey();
                break;
            }
        }

        System.out.println("La primera palabra que no se repite es: " + noRepite);

    }

    public void elementosMasFrecuentes() {
        // Ejercicio:
        // Dado un array de enteros, encuentra los k elementos más frecuentes.

        Integer frecuElem = 2;
        List<Integer> numList = Arrays.asList(
                1, 1, 1, 2, 2, 3, 4, 4, 4, 4, 5
        );

        // LinkedHashMap mantiene el orden de inserción, asegurando que la primera palabra única sea la correcta.
        Map<Integer, Integer> frecuencia = new LinkedHashMap<>();

        for (Integer num : numList) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }

        // Paso 2: Usar un Heap (PriorityQueue) para almacenar los k más frecuentes
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> frecuencia.get(a) - frecuencia.get(b));

        for (int num : frecuencia.keySet()) {
            heap.offer(num);
            if (heap.size() > frecuElem) {
                heap.poll(); // Mantener solo los k más grandes
            }
        }

        // Paso 3: Extraer los k elementos más frecuentes en orden inverso
        List<Integer> resultado = new ArrayList<>();
        while (!heap.isEmpty()) {
            resultado.add(heap.poll());
        }
        Collections.reverse(resultado); // Para obtener el orden correcto

        System.out.println("Los " + frecuElem + " elementos más frecuentes: " + resultado);
        
    }

}
