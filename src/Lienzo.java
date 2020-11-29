
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juani
 */

public class Lienzo extends Canvas{
    Font myFont = new Font("Serif", Font.BOLD, 36);
    Color Colortexto;
    int contador=0;
    int x=100;
    int y=100;
    String[] vec=new String[]{"Sin cultura no hay nación",
        "Querámoslo o no todso somos creadores",
        "Todo acto de creación es un acto de amor",
        "Uno lleva a cuestas la propia casa",
        "Educar quiere decir fortificar",
        "Para mi libertad bastan tus alas",
        "Dios no juega a los dados, pero la Naturaleza puede hacernos bromas perversas",
        "No saber quién soy es mi principal certeza, el resto son especulaciones",
        "Ningún fantasma ni espectro espanta al hombre más cierta y constantemente que la conciencia crimianal",
        "Las leyes de excepción y circunstancias son espadas de dos filos",
        "Yo prefiero pedalear toda la vida que quedarme sin tequila",
        "No tenemos derecho de desperdiciar ni aburrir ni agredir a nadie con una arquitectura mediocre e inhumana",
        "La belleza de los museos no se hace entender verdaderamente sino de aquellso que saben interrogarla",
        "Los medios representan un nuevo tipo de control soocial, que viene a sustituir sutilmente el control social brutal que antes se ejercía y que la sociedad moderna ya no tolera",
        "Los efectos de la fuerza son rápidos, pero pasajerosñ los de la persuación lentos, pero seguros.",
        "La reforma es un aire más propicio para la democracia que el viento de la revolución",
        "La más grande satisfacción en la vida de un ser humano viene de ayudar a sus semejantes",
        "La libertad no necesita alas, lo que necesita es echar raíces",
        "El pasado está escrito en la memoria y el futuro presente en el deseo",
        "Aquel que no espera vencer, ya está vencido",
        "¿Qué armas más poderosas que las ideas? Ni tenemos otras, ni las hay mejores",
        "La primera obligación de todo ser humano es ser feliz, la segunda es hacer feliz a los demás",
        "Si vivir es solo soñar, hagamos el bien soñando",
        "Sin importar el tamaño de la ciudad o pueblo donde nacen los hombres y mujeres, ellos finalmente, son el tamaño de su obra, de su voluntad de engrandecer y enriquecer a sus hermanos",
        "Si nadie te garantiza el mañana, el hoy se vuelve inmenso",
        "Si sobrevives, si persistes, canta, sueña. El viento de las horas barre las calles, los caminos. Los árboles esperan, tú no esperes. Este es el tiempo de vivir, el único",
        "Nada hay ran vacío como un cerebro lleno de sí mismo",
        "La literatura es la más asombrosa manera de conversar con los difuntos",
        "No hay crítica irrefutable, aunque sí muchas que merecen ser pasadas por alto",
        "La historia debe ser comprendida antes que juzgada",
        "Todo deportista deber tener en mente el oro y trabajar día a día incansablemente por él",
        "Cuando las gradas enmudecen, confirman que el silencio siempre juega de local",
        "Si no cuentas una historia se quedará en tu gargante, se oxidará y te envenenará",
        "Lo peor que le puede suceder a un intelectual es estar de acuerdo consigo mismo",
        "Solo la vida existe, lo demás lo inventamos",
        "El dinero compra únicamente lo que puede comprarse con dinero",
        "El desencanto está en boga. Mencionarlo es un rasgo de inteligencia, el sello de un espíritu refinado",
        "La casa es ese lugar que nos da certeza",
        "El cuerpo es un puro tránsito a cadáver y la seducción un juego de asesinos",
        "Quí yacen tus pasos: en el anonimado de las huellas",};
    
    //Frases frases;
    public void Cambiar(){
        contador=(int)(Math.random()*39);
        x=(int)(Math.random()*1000);
        y=(int)(Math.random()*1000);
        //contador++;
        repaint();
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2 = (Graphics2D) g;
        setBackground(new Color(240,240,240));
        g2.setStroke(new BasicStroke(5));
        g2.setFont(myFont);
        //g2.drawString("HOLA", 0, 0);
        Colortexto = new Color((int)(Math.random()*250),(int)(Math.random()*250),(int)(Math.random()*250));
        g2.setColor(Colortexto);
        g2.setFont(myFont);
        g2.drawString(vec[contador], x, y);
    }
    
}
