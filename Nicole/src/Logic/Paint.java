package Logic;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 * @author Andrés, Nicol, Meibel, Adrián
 */

/*
In this class are the methods in charge of painting circles, painting line, 
painting path and paint the traversed nodes respectively.
*/
public class Paint {

    public Paint() {

    }

    public static void pinta_Circulo(Graphics g, int x, int y, String n) {
        ((Graphics2D) g).setColor(Color.CYAN);
        ((Graphics2D) g).setStroke(new BasicStroke(1));//thickness to circle       
        ((Graphics2D) g).fillOval(x, y, 12, 12);
        ((Graphics2D) g).setColor(Color.BLACK);
        ((Graphics2D) g).drawOval(x, y, 12, 12);

        ((Graphics2D) g).setColor(Color.BLACK);//COLOR NODE NUMBER
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
       
    }
   
    public static void pinta_Camino(Graphics g, int x1, int y1, int x2, int y2, Color color) {
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(3);
        ((Graphics2D) g).setStroke(stroke);
        g.setColor(color);
        g.drawLine(x1 + 10, y1 + 10, x2 + 10, y2 + 10);
        
    }
   
    public static void seleccionNodo(Graphics g, int x, int y, String n, Color co) {
        
        ((Graphics2D) g).setColor(co);
        ((Graphics2D) g).setStroke(new BasicStroke(1));//thickness from outline to circle    
        ((Graphics2D) g).fillOval(x, y, 12, 12);//circle size
        ((Graphics2D) g).setColor(Color.BLACK);
        ((Graphics2D) g).drawOval(x, y, 12, 12);

    }
}
