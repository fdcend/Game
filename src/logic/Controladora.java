package logic;

import java.util.Random;

public class Controladora {

    public int determinarCantidadEmoji(String emoji, int cantidadElegida, String matriz[][]) {

        int cantEncontrada = 0;

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                if (matriz[f][c].equals(emoji)) {
                    cantEncontrada++;
                }
            }
        }
        return cantEncontrada;
    }

    public String[][] generarMatriz() {

        Random random = new Random();
        String[] emojis = {"♫", "♣", "▲", "♥"};
        String[][] matriz = new String[4][4];

        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                matriz[f][c] = emojis[random.nextInt(emojis.length)];
            }
        }
        return matriz;
    }

}
