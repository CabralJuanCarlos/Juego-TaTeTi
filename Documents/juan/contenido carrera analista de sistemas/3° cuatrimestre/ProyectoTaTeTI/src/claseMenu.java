import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class claseMenu extends JPanel  implements ActionListener{

	private JLabel jugador1,jugador2;
	private JTextField nombre1,nombre2;
	private JButton ingresar;
	
	
	public claseMenu(){
		
			setLayout(null);
		
			jugador1= new JLabel("Jugador X:");
			jugador1.setBounds(170,20, 200, 20);
			jugador1.setFont(new Font("Tahoma", Font. BOLD,16));
			add(jugador1);
			
			jugador2= new JLabel("Jugador O:");
			jugador2.setBounds(170,50, 200, 20);
			jugador2.setBackground(new Color(255,0,0));
			jugador2.setFont(new Font("Tahoma", Font. BOLD,16));
			add(jugador2);
			
			nombre1= new JTextField();
			nombre1.setBounds(280,20,140, 20);
			nombre1.setFont(new Font("Tahoma", Font. BOLD,16));
			add(nombre1);
			 
			nombre2= new JTextField();
			nombre2.setBounds(280,50, 140, 20);
			nombre2.setFont(new Font("Tahoma", Font. BOLD,16));
			add(nombre2);
		
			ingresar= new JButton("A JUGAR");
			ingresar.setFont(new Font("Arial", Font. ITALIC,20));
			ingresar.setBounds(170,83,250, 40);
			ingresar.setBackground(new Color(196,98,0));
			add(ingresar);
			ingresar.addActionListener(this);
	
			
	}
	
	public void paint(Graphics g)
	{
		ImageIcon imagen=new ImageIcon(getClass().getResource("/resources/imagenMenu.png"));
		g.drawImage(imagen.getImage(),0,0,getWidth(),getHeight(),this);
		setOpaque(false);
		super.paint(g);
	}
	

public static void main(String[] args){
		JFrame ventana = new JFrame();
		claseMenu tateti=new claseMenu();
		ventana.setContentPane(tateti);
		ventana.setSize(600, 600);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

@Override
public void actionPerformed(ActionEvent arg0) {
	if(arg0.getSource()==ingresar)
	{
		String nombreO=nombre1.getText();
		String nombreX=nombre2.getText();
		TaTeTi tateti=new TaTeTi(nombreO,nombreX);
		tateti.setBounds(450, 170, 600,450);
		tateti.setVisible(true);
	}
}

}
