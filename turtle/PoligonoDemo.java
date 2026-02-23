  // Importa la libreria turtle
import java.awt.Color;

/**
 * Demo che mostra come disegnare forme geometriche con la tartaruga
 */
public class PoligonoDemo extends TurtleScreen {  // Estende TurtleScreen per creare una finestra grafica
    private Turtle t;  // La nostra tartaruga

    public PoligonoDemo() {
        super(800, 600);  // Crea una finestra di 800x600 pixel
    }

    @Override
    public void setup() {  // Metodo chiamato una volta all'avvio
        noLoop();          // Disabilita l'animazione continua (disegno statico)
        title("Poligoni");  // Imposta il titolo della finestra

        t = createTurtle(); // Crea una nuova tartaruga
        t.speed(10); // Imposta la velocità (1=veloce, 255=lento, 0=istant)
        t.setPenSize(2); // Imposta lo spessore della penna a 2 pixel

        // Triangolo rosso
        t.penUp();           // Alza la penna (ora la tartaruga si muove senza disegnare)
        t.goTo(-250, 100);   // Vai alle coordinate (-250, 100)
        t.penDown();         // Abbassa la penna (quando si muove disegna)
        t.setPenColor(Color.RED);                  // Colore del pennello: rosso
        disegnaTriangolo(80);

        // Quadrato blu
        t.penUp();
        t.goTo(-50, 100);
        t.penDown();
        t.setPenColor(Color.BLUE);
        t.setFillColor(new Color(200, 200, 255)); // Imposta un "colore di riempimento"
        disegnaQuadrato(70);

        // Pentagono verde
        t.penUp();
        t.goTo(150, 100);
        t.penDown();
        t.setPenColor(Color.GREEN);
        t.setFillColor(new Color(200, 255, 200));
        disegnaPentagono(50);

        // Cerchio arancione
        t.penUp();
        t.goTo(-150, -150);
        t.penDown();
        t.setPenColor(Color.ORANGE);
        t.setFillColor(new Color(255, 230, 200));
        disegnaCerchio(50);

        // Esagono magenta
        t.penUp();
        t.goTo(100, -150);
        t.penDown();
        t.setPenColor(Color.MAGENTA);
        t.setFillColor(new Color(255, 200, 255));
        disegnaEsagono(40);

        t.hideTurtle();  // Nasconde la tartaruga alla fine
    }

    private void disegnaTriangolo(double lato) {
        // Disegniamo solo i "bordi" del triangolo
        // Facendo muovere la tartaruga
        t.forward(lato);  // Avanza di 'lato' pixel
        t.left(120);      // Ruota a sinistra di 120 gradi
        t.forward(lato);
        t.left(120);
        t.forward(lato);
        t.left(120);
    }

    private void disegnaQuadrato(double lato) {
        t.beginFill(); // Questo ci serve per riempire la figura
        // Ogni movimento viene salvato, alla fine usiamo endFill() per riempire 
        t.forward(lato);
        t.left(90);       // Ruota a sinistra di 90 gradi
        t.forward(lato);
        t.left(90);
        t.forward(lato);
        t.left(90);
        t.forward(lato);
        t.left(90);
        t.endFill();
    }

    private void disegnaPentagono(double lato) {
        t.beginFill();
        t.forward(lato);
        t.left(72);       // 360 / 5 = 72 gradi
        t.forward(lato);
        t.left(72);
        t.forward(lato);
        t.left(72);
        t.forward(lato);
        t.left(72);
        t.forward(lato);
        t.left(72);
        t.endFill();
    }

    private void disegnaEsagono(double lato) {
        t.beginFill();
        t.forward(lato);
        t.left(60);       // 360 / 6 = 60 gradi
        t.forward(lato);
        t.left(60);
        t.forward(lato);
        t.left(60);
        t.forward(lato);
        t.left(60);
        t.forward(lato);
        t.left(60);
        t.forward(lato);
        t.left(60);
        t.endFill();
    }

    private void disegnaCerchio(double raggio) {
        t.beginFill();
        t.circle(raggio);  // Disegna un cerchio con il raggio specificato
        t.endFill();
    }

    public static void main(String[] args) {
        TurtleScreen app = new PoligonoDemo();  // Crea l'applicazione
        app.run();  // Avvia l'esecuzione (chiama setup() e mostra la finestra)
    }
}
