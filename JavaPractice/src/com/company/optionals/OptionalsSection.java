package com.company.optionals;

import java.util.Optional;

public class OptionalsSection {

    public void execute() {

        Neumatico neumatico1 = new Neumatico(1L, "neumatico1");
        Rueda rueda1 = new Rueda(1L, "rueda1",neumatico1);
        Carro carro1 = new Carro(1L, "carro1",rueda1);

        Optional<Carro> carroOpcional = Optional.of(carro1);
        System.out.print("\n obtener nombre neumatico");

        String nombreNeumatico1 = carroOpcional
                .map(Carro::getRueda)
                .map(Rueda::getNeumatico)
                .map(Neumatico::getNombre).orElse("Sin Nombre");
        System.out.print("\n" + nombreNeumatico1);

        Optional<String> nombreNeumatico2 = carroOpcional
                .map(Carro::getRueda)
                .map(Rueda::getNeumatico)
                .map(Neumatico::getNombre);
        System.out.print("\n" + nombreNeumatico2.orElse("Sin Nombre"));

    }
}
