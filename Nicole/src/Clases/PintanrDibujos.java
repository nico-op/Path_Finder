package Clases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author Jose H Elel
 */
public class PintanrDibujos {

    public PintanrDibujos() {

    }

    public static void pinta_Circulo(Graphics g, int x, int y, String n) {
        //g.drawOval(x, y-10, 20, 20);
        ((Graphics2D) g).setColor(Color.ORANGE);
        ((Graphics2D) g).setStroke(new BasicStroke(2));//leda el grosor al circulo        
        ((Graphics2D) g).fillOval(x, y, 15, 15);
        ((Graphics2D) g).setColor(Color.BLACK);
        ((Graphics2D) g).drawOval(x, y, 15, 15);

        ((Graphics2D) g).setColor(Color.BLUE);
        Font fuente = new Font("Monospaced", Font.BOLD, 16);
        g.setFont(fuente);
        ((Graphics2D) g).drawString(n, x, y);

    }

    public static void pinta_Linea(Graphics g, int x1, int y1, int x2, int y2, double tam) {
        int xAux = 0;
        int yAux = 0;
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(1);
        ((Graphics2D) g).setStroke(stroke);
        ((Graphics2D) g).drawLine(x1 + 10, y1 + 10, x2 + 10, y2 + 10);
        if (x1 <= x2) {
            xAux = ((x2 - x1) / 2) + x1;
        }
        if (x1 > x2) {
            xAux = ((x1 - x2) / 2) + x2;
        }
        if (y1 < y2) {
            yAux = ((y2 - y1) / 2) + y1;
        }
        if (y1 >= y2) {
            yAux = ((y1 - y2) / 2) + y2;
        }
        ((Graphics2D)g).setColor(Color.BLUE);//PINTANDO TEXTO DE VERTICES(TAMANIO)
        Font fuente = new Font("Monospaced", Font.PLAIN, 12);
        g.setFont(fuente);
        ((Graphics2D) g).drawString(String.valueOf(tam), xAux, yAux);
    }

    public static void pinta_Camino(Graphics g, int x1, int y1, int x2, int y2, Color color) {
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(3);
        ((Graphics2D) g).setStroke(stroke);
        g.setColor(color);
        g.drawLine(x1 + 10, y1 + 10, x2 + 10, y2 + 10);
        
    }
//Pintando nodos que son recorridos
    public static void seleccionNodo(Graphics g, int x, int y, String n, Color co) {
        
        ((Graphics2D) g).setColor(co);
        ((Graphics2D) g).setStroke(new BasicStroke(2));//leda el grosor del contorno al circulo        
        ((Graphics2D) g).fillOval(x, y, 15, 15);//tamanio del circulo
        ((Graphics2D) g).setColor(Color.BLUE);
        ((Graphics2D) g).drawOval(x, y, 15, 15);

    }
}
