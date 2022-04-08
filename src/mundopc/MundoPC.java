package mundopc;

import mx.com.crr.mundopc.*;

/**
 * @author ClaudioNicolas
 */
public class MundoPC {

    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

        Monitor monitorGamer = new Monitor("Gamer", 34);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);

        Monitor monitorLogitech = new Monitor("Logitech", 16);
        Teclado tecladoLogitech = new Teclado("USB", "Logitech");
        Raton ratonLogitech = new Raton("Bluetooth", "Logitech");
        Computadora computadoraLogitech = new Computadora("Computadora Logitech", monitorLogitech, tecladoLogitech, ratonLogitech);

        Computadora computadoraMixta = new Computadora("Computadora Mixta", monitorGamer, tecladoHP, ratonLogitech);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraMixta);
        orden1.mostrarOrden();
    }
}
