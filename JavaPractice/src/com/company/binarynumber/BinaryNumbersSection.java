package com.company.binarynumber;

public class BinaryNumbersSection {

    public void execute() {

        System.out.println("10 en binario es: " + decimalToBinary(10));
        System.out.println("1010 en decimal es: " + binaryToDecimal("10001101"));

    }

    public static String decimalToBinary(int num) {
        if (num == 0) return "0"; // Caso especial para 0

        StringBuilder binary = new StringBuilder();

        // Creamos un objeto de tipo StringBuilder llamado binary, que nos permitirá construir la cadena binaria de manera eficiente.
        // ¿Por qué StringBuilder y no String? → Porque String es inmutable, y modificarlo en cada iteración sería ineficiente.

        while (num > 0) {
            binary.insert(0, num % 2); // Aqui se obtiene el residuo de dividir num/2
                                                // Luego dicho residuo se agrega al inicio de la cadena en StringBuilder.
            num = num/2; // Dividir entre 2, num se reduce a la mitad en cada iteracion
        }

        return binary.toString();
    }


    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        //Invertimos el string
        String binaryReversed = new StringBuilder(binary).reverse().toString();

        // Recorremos cada carácter del String binario reverso
        for (int i = 0; i < length; i++) {
            char bit = binaryReversed.charAt(i); // Obtenemos el bit (carácter '0' o '1')

            if (bit == '1') {
                // En cada iteracion sumamos 2^(posicion) i (2^0 + 2^1 + 2^2 + 2^3)
                decimal = decimal + (int)Math.pow(2, i);
            }
        }

        return decimal;
    }
}
