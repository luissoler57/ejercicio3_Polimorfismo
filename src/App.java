import java.time.LocalDate;
import java.util.ArrayList;

import supermercado.Cereales;
import supermercado.Detergente;
import supermercado.EsAlimento;
import supermercado.Vino;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(
                "=========================================== SUPERMERCADO ==========================================");
        System.out.println("------------------------- DETERGENTE -------------------------------------");

        Detergente detergente = new Detergente("LimpiaMas", 2.5);
        detergente.setVolumen(33);
        detergente.setDescuento(2);
        detergente.setTipoEnvase("Botella de plastico");
        System.out.println(detergente);

        System.out.println("------------------------- CEREALES -------------------------------------");
        Cereales cereales = new Cereales("CER MARCA", "Espelta", 2.5);
        cereales.setCaducidad(LocalDate.of(2023, 05, 26));
        System.out.println(cereales);

        System.out.println("------------------------- VINO -------------------------------------");
        Vino vino = new Vino("Vinos al", "tinto", 12.8, 2.5);
        vino.setVolumen(330);
        vino.setTipoEnvase("botella de vino");
        vino.setCaducidad(LocalDate.of(2024, 6, 12));
        vino.setDescuento(5);
        System.out.println(vino);

        System.out.println("------------------------- POLIMORFISMO -------------------------------------");
        ArrayList<EsAlimento> listaEsAlimentos = new ArrayList<>();
        listaEsAlimentos.add(cereales);
        listaEsAlimentos.add(vino);

        int totalCalorias = 0;
        for (EsAlimento esAlimento : listaEsAlimentos) {
            totalCalorias += esAlimento.getCalorias();
        }
        System.out.println(listaEsAlimentos);
        System.out.println("Total Calorias= " + totalCalorias);

    }
}
