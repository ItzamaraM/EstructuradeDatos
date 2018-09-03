package estructuradedatos.diagnostica;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Pantalla {
    public void mostrar(Palabra x){
        JLabel[]info = new JLabel[x.significados.size()+1];
        
        info[0]=new JLabel(x.id);
        for(int i=1; i<info.length; i++)
            info[i]=new JLabel(x.significados.get(i-1));
        
        
        info[0].setForeground(Color.RED);
        info[0].setFont(new Font("algerian", Font.PLAIN,40));
        JOptionPane.showMessageDialog(null,
                //null,
                info,
                "Pequeño Larousse ilustrado",//contenido del panel
                -1,
                //x.id = nombre de la palabra
                new ImageIcon("src/estructuradedatos/diagnostica/"+ x.id+ ".jpg"));
    }
    
}
