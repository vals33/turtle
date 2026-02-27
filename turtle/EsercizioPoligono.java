import java.util.Scanner;
import java.awt.Color;

public class EsercizioPoligono extends TurtleScreen {
    private Turtle t;

    public EsercizioPoligono() {
        super(800, 600); // Dimensioni finestra
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("quanti lati? (3 - 12)");
        int nLati = scanner.nextInt(); // numero lati
        System.out.print("L:unghezza pixel (10 - 50)");
        int lunghezza = scanner.nextInt(); // lunghezza lato
        System.out.print("quanti poligoni?");
        int nPoligoni = scanner.nextInt();// numero poligoni
        EsercizioPoligono disegno = new EsercizioPoligono();
        disegno.setup(nLati, nPoligoni, lunghezza);

    }

    public int disegnare(int lati, int lunghezza) {
        int angle = 360 / lati; // Calcola l'angolo di rotazione per un poligono regolare
        for (int i = 0; i < lati; i++) {

            t.penDown();
            t.forward(lunghezza);
            t.penUp();
            t.left(angle); // Avanza di 'lato' pixel
            // Ruota a sinistra di 'angle' gradi
        }

        return 0;
    }

    public void setup(int lati, int poligoni, int lunghezza) { // Metodo chiamato una volta all'avvio
        noLoop(); // Disegna 1 volta e poi si ferma
        title("Albero Frattale"); // Imposta il titolo della finestra
        bgcolor(new Color(50, 50, 100)); // Colore di sfondo

        t = createTurtle(); // Crea una nuova tartaruga
        t.speed(1); // Velocità 1 = disegna veloce
        t.hideTurtle(); // Nasconde la tartaruga
        t.setPenSize(2); // Spessore iniziale della penna

        for (int i = 0; i<poligoni; i++) {
            t.penUp();
            t.goTo(-lunghezza / 2 - 20, -lunghezza / 2 - 20); // Posiziona la tartaruga in basso al centro
            t.penDown();
            t.setHeading(0);
            t.setColor(Color.BLUE);
            disegnare(lati, lunghezza);
            lunghezza += 20;
        }
    }
}
