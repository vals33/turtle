import java.util.Scanner;
import java.awt.Color;

public class EsercizioPoligono extends TurtleScreen {
    private Turtle t;

    public EsercizioPoligono() {
        super(800, 600); // Dimensioni finestra
    }

    public static void main(String[] args) {
        System.out.println( "dimmi un numero tra 3 e 12 per disegnare un poligono regolare e quanti poligoni vuoi disegnare ");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // numero lati
        int lunghezza;
        int k = scanner.nextInt();// numero poligoni
        EsercizioPoligono disegno = new EsercizioPoligono();
        disegno.run();

    }

    public int disegnare(int n, int lunghezza) {
        int angle = 360 / n; // Calcola l'angolo di rotazione per un poligono regolare
        for (int i = 0; i < n; i++) {
            t.left(angle);
            t.penDown();
            t.forward(lunghezza); // Avanza di 'lato' pixel
             // Ruota a sinistra di 'angle' gradi
        }


        return 0;
    }

    public void setup(int lunghezza, int n, int k) { // Metodo chiamato una volta all'avvio
    noLoop();                                // Disegna 1 volta e poi si ferma
    title("Albero Frattale");                // Imposta il titolo della finestra
    bgcolor(new Color(50, 50, 100));       // Colore di sfondo

    t = createTurtle(); // Crea una nuova tartaruga
    t.speed(1); // Velocità 1 = disegna veloce
    t.hideTurtle(); // Nasconde la tartaruga
    t.setPenSize(2); // Spessore iniziale della penna

    // Posiziona la tartaruga in basso al centro
    t.penUp();                       
    t.goTo(0, -250);                 
    t.penDown();                  
    t.setHeading(0);
    disegnare(n,lunghezza);
    }
    }

    