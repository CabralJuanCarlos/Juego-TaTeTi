import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TaTeTi extends JFrame implements ActionListener {
	
	private JButton boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9,boton10,boton11;
	private JLabel empates, puntos,jugador1,jugador2,marcador1,marcador2,ganador;
	private String jugador="X";
	private int puntaje2,puntaje1=0,bandera;
	private boolean bandera1,bandera2,bandera3,bandera4,bandera5,bandera6,bandera7,bandera8,bandera9;

	
	public TaTeTi(String nombr1,String nombr2)
	{
		
		setTitle("<<<SUPER TATETI>>>");
		
		setIconImage(getIconImage());
		getContentPane().setBackground(new Color(196,98,0));
		setLayout(null);
		
		boton1=new JButton ("");
		boton1.setBounds(10,10,100,100);
		boton1.setBackground(new Color(255,127,39));
		add(boton1);
		
		boton2=new JButton ("");
		boton2.setBounds(120,10,100,100);
		boton2.setBackground(new Color(255,127,39));
		add(boton2);
		
		boton3=new JButton ("");
		boton3.setBounds(230,10,100,100);
		boton3.setBackground(new Color(255,127,39));
		add(boton3);
		
		boton4=new JButton ("");
		boton4.setBounds(10,120,100,100);
		boton4.setBackground(new Color(255,127,39));
		add(boton4);
		
		boton5=new JButton ("");
		boton5.setBounds(120,120,100,100);
		boton5.setBackground(new Color(255,127,39));
		add(boton5);
		
		boton6=new JButton ("");
		boton6.setBounds(230,120,100,100);
		boton6.setBackground(new Color(255,127,39));
		add(boton6);
		
		boton7=new JButton ("");
		boton7.setBounds(10,230,100,100);
		boton7.setBackground(new Color(255,127,39));
		add(boton7);
		
		boton8=new JButton ("");
		boton8.setBounds(120,230,100,100);
		boton8.setBackground(new Color(255,127,39));
		add(boton8);
		
		boton9=new JButton ("");
		boton9.setBounds(230,230,100,100);
		boton9.setBackground(new Color(255,127,39));
		add(boton9);
	
		boton10=new JButton ("REINICIO");
		boton10.setBounds(10,340,155,30);
		boton10.setBackground(new Color(255,255,255));
		add(boton10);
	
		boton11=new JButton ("VOLVER AL MENÚ");
		boton11.setBounds(175,340,155,30);
		boton11.setBackground(new Color(255,255,255));
		add(boton11);
		
		puntos= new JLabel("Puntos");
		puntos.setBounds(355,40, 200, 30);
		puntos.setFont(new Font("Tahoma", Font. BOLD,27));
		add(puntos);
		
		
		jugador1= new JLabel(nombr1);
		jugador1.setBounds(340, 90, 200, 20);
		jugador1.setBackground(new Color(255,0,0));
		jugador1.setFont(new Font("Tahoma", Font. BOLD,16));
		add(jugador1);
		
		jugador2= new JLabel(nombr2);
		
		jugador2.setBounds(340, 120, 200, 20);
		jugador2.setBackground(new Color(255,0,0));
		jugador2.setFont(new Font("Tahoma", Font. BOLD,16));
		add(jugador2);
		
		marcador1= new JLabel("0");
		marcador1.setBounds(450,90,400,20);
		marcador1.setFont(new Font("Tahoma", Font. BOLD,16));
		add(marcador1);
		
		marcador2= new JLabel("0");
		marcador2.setBounds(450,120,400,20);
		marcador2.setFont(new Font("Tahoma", Font. BOLD,16));
		add(marcador2);
		
		ganador=new JLabel("Empates: ");
		ganador.setBounds(340,150,400,20);
		ganador.setFont(new Font("Tahoma", Font. BOLD,16));
		add(ganador);
		
		empates=new JLabel("0");
		empates.setBounds(450,150,200,20);
		empates.setFont(new Font("Tahoma", Font. BOLD,16));
		add(empates);
		
		boton1.addActionListener(this);
		boton2.addActionListener(this);
		boton3.addActionListener(this);
		boton4.addActionListener(this);
		boton5.addActionListener(this);
		boton6.addActionListener(this);
		boton7.addActionListener(this);
		boton8.addActionListener(this);
		boton9.addActionListener(this);
		boton10.addActionListener(this);
		boton11.addActionListener(this);
		
		
		
	}
	public Image getIconImage()
	{
		Image retValue= Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("resources/images.png"));
		return retValue;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		 bandera=0;
		if(arg0.getSource()==boton11)
		{
			dispose();
		}
		if(boton1.isEnabled()==false || boton2.isEnabled()==false|| boton3.isEnabled()==false||
		boton4.isEnabled()==false|| boton5.isEnabled()==false|| boton6.isEnabled()==false|| 
		boton7.isEnabled()==false|| boton8.isEnabled()==false|| boton9.isEnabled()==false)
		{
			setTitle("Debe presionar el boton de reinicio");
		}
		else
		{
			if(arg0.getSource()==boton1)
			{
				boton1.setText(jugador);
				bandera1=true;
				
			}	
			if(arg0.getSource()==boton2)
			{
				boton2.setText(jugador);
				bandera2=true;
				
			}
			if(arg0.getSource()==boton3)
			{
				boton3.setText(jugador);
				bandera3=true;
				
			}
			if(arg0.getSource()==boton4)
			{
				boton4.setText(jugador);
				bandera4=true;
				
			}
			if(arg0.getSource()==boton5)
			{
				boton5.setText(jugador);
				bandera5=true;
				
			}
			if(arg0.getSource()==boton6)
			{
				boton6.setText(jugador);
				bandera6=true;
				
			}
			if(arg0.getSource()==boton7)
			{
				boton7.setText(jugador);
				bandera7=true;
				
			}
			if(arg0.getSource()==boton8)
			{
				boton8.setText(jugador);
				bandera8=true;
			}
			if(arg0.getSource()==boton9)
			{
				boton9.setText(jugador);
				bandera9=true;
			}
			if(jugador.equals("X"))
			{
				jugador="O";
			}
			else
			{
				jugador="X";
			}
		
		
		verificarGano();
		empate();
	}
		
		if(arg0.getSource()== boton10)
		{
			inabilitarOHabilitarBotones("");
		}
	}
	public void reiniciarBandera()
	{
		bandera1=false;bandera2=false;bandera3=false;bandera4=false;bandera5=false;bandera6=false;bandera7=false;bandera8=false;bandera9=false;	
	}
	public void empate()
	{
		if(bandera1 == true && bandera2==true && bandera3==true && bandera4==true & bandera5==true && bandera6==true && bandera7==true && bandera8==true && bandera9==true && bandera==0) 
		{
			int puntosEmpates=Integer.parseInt(empates.getText());
			puntosEmpates++;
			empates.setText( Integer. toString(puntosEmpates));
			inabilitarOHabilitarBotones("");
			reiniciarBandera();
		}
	}
	public void colorear(String color)
	{
		if(color.equals("1,2,3"))
		{
			boton1.setBackground(new Color(0,230,230));
			boton2.setBackground(new Color(0,230,230));
			boton3.setBackground(new Color(0,230,230));
			
		}
		if(color.equals("4,5,6"))
		{
			boton4.setBackground(new Color(0,230,230));
			boton5.setBackground(new Color(0,230,230));
			boton6.setBackground(new Color(0,230,230));
		}
		if(color.equals("7,8,9"))
		{
			boton7.setBackground(new Color(0,230,230));
			boton8.setBackground(new Color(0,230,230));
			boton9.setBackground(new Color(0,230,230));
		}
		if(color.equals("1,5,9"))
		{
			boton1.setBackground(new Color(0,230,230));
			boton5.setBackground(new Color(0,230,230));
			boton9.setBackground(new Color(0,230,230));
		}
		if(color.equals("3,5,7"))
		{
			boton3.setBackground(new Color(0,230,230));
			boton5.setBackground(new Color(0,230,230));
			boton7.setBackground(new Color(0,230,230));
		}
		if(color.equals("1,4,7"))
		{
			boton1.setBackground(new Color(0,230,230));
			boton4.setBackground(new Color(0,230,230));
			boton7.setBackground(new Color(0,230,230));
		}
		if(color.equals("2,5,8"))
		{
			boton2.setBackground(new Color(0,230,230));
			boton5.setBackground(new Color(0,230,230));
			boton8.setBackground(new Color(0,230,230));
		}
		if(color.equals("3,6,9"))
		{
			boton3.setBackground(new Color(0,230,230));
			boton6.setBackground(new Color(0,230,230));
			boton9.setBackground(new Color(0,230,230));
		}
	}
	public void inabilitarOHabilitarBotones (String v1){
		if(v1.equals(""))
		{
			boton1.setEnabled(true);
			boton2.setEnabled(true);
			boton3.setEnabled(true);
			boton4.setEnabled(true);
			boton5.setEnabled(true);
			boton6.setEnabled(true);
			boton7.setEnabled(true);
			boton8.setEnabled(true);
			boton9.setEnabled(true);
			
			boton1.setBackground(new Color(255,127,39));
			boton2.setBackground(new Color(255,127,39));
			boton3.setBackground(new Color(255,127,39));
			boton4.setBackground(new Color(255,127,39));
			boton5.setBackground(new Color(255,127,39));
			boton6.setBackground(new Color(255,127,39));
			boton7.setBackground(new Color(255,127,39));
			boton8.setBackground(new Color(255,127,39));
			boton9.setBackground(new Color(255,127,39));
			
			boton1.setText("");
			boton2.setText("");
			boton3.setText("");
			boton4.setText("");
			boton5.setText("");
			boton6.setText("");
			boton7.setText("");
			boton8.setText("");
			boton9.setText("");
		}
		if(v1.equals("1,2,3"))
		{
			boton4.setEnabled(false);
			boton5.setEnabled(false);
			boton6.setEnabled(false);
			boton7.setEnabled(false);
			boton8.setEnabled(false);
			boton9.setEnabled(false);
		}
		if(v1.equals("4,5,6"))
		{
			boton1.setEnabled(false);
			boton2.setEnabled(false);
			boton3.setEnabled(false);
			boton7.setEnabled(false);
			boton8.setEnabled(false);
			boton9.setEnabled(false);
		}
		if(v1.equals("7,8,9"))
		{
			boton1.setEnabled(false);
			boton2.setEnabled(false);
			boton3.setEnabled(false);
			boton4.setEnabled(false);
			boton5.setEnabled(false);
			boton6.setEnabled(false);
		}
		if(v1.equals("1,5,9"))
		{
			boton2.setEnabled(false);
			boton3.setEnabled(false);
			boton4.setEnabled(false);
			boton6.setEnabled(false);
			boton7.setEnabled(false);
			boton8.setEnabled(false);
		}
		if(v1.equals("3,5,7"))
		{
			boton1.setEnabled(false);
			boton2.setEnabled(false);
			boton4.setEnabled(false);
			boton6.setEnabled(false);
			boton8.setEnabled(false);
			boton9.setEnabled(false);
		}
		if(v1.equals("1,4,7"))
		{
			boton2.setEnabled(false);
			boton3.setEnabled(false);
			boton5.setEnabled(false);
			boton6.setEnabled(false);
			boton8.setEnabled(false);
			boton9.setEnabled(false);
		}
		if(v1.equals("2,5,8"))
		{
			boton1.setEnabled(false);
			boton3.setEnabled(false);
			boton4.setEnabled(false);
			boton6.setEnabled(false);
			boton7.setEnabled(false);
			boton9.setEnabled(false);
		}
		if(v1.equals("3,6,9"))
		{
			boton1.setEnabled(false);
			boton2.setEnabled(false);
			boton4.setEnabled(false);
			boton5.setEnabled(false);
			boton7.setEnabled(false);
			boton8.setEnabled(false);
		}
		
	}
	public void marcador2()
	{
		
		puntaje2=Integer.parseInt(marcador2.getText());
		puntaje2+=10;
		marcador2.setText( Integer. toString(puntaje2));
	}
	public void marcador1()
	{
		
		puntaje1=Integer.parseInt(marcador1.getText());
		puntaje1+=10;
		marcador1.setText( Integer. toString(puntaje1));
	}
	public void verificarGano()
	{
		String valor1=boton1.getText();
		String valor2=boton2.getText();
		String valor3=boton3.getText();
		String valor4=boton4.getText();
		String valor5=boton5.getText();
		String valor6=boton6.getText();
		String valor7=boton7.getText();
		String valor8=boton8.getText();
		String valor9=boton9.getText();
		
		if(valor1.equals("X")&& valor2.equals("X") && valor3.equals("X"))
		{
			setTitle("Gano el jugador X");
			inabilitarOHabilitarBotones("1,2,3");
			colorear("1,2,3");
			marcador1();
			bandera=1;
			reiniciarBandera();
		}else
		
			if(valor4.equals("X")&& valor5.equals("X") && valor6.equals("X"))
			{
				setTitle("Gano el jugador X");
				inabilitarOHabilitarBotones("4,5,6");
				colorear("4,5,6");
				marcador1();
				bandera=1;
				reiniciarBandera();
			}else
				if(valor7.equals("X")&& valor8.equals("X") && valor9.equals("X"))
				{
					setTitle("Gano el jugador X");
					inabilitarOHabilitarBotones("7,8,9");
					colorear("7,8,9");
					marcador1();
					bandera=1;
					reiniciarBandera();
				}else
					if(valor1.equals("X")&& valor5.equals("X") && valor9.equals("X"))
					{
						setTitle("Gano el jugador X");
						inabilitarOHabilitarBotones("1,5,9");
						colorear("1,5,9");
						marcador1();
						bandera=1;
						reiniciarBandera();
					}else
						if(valor3.equals("X")&& valor5.equals("X") && valor7.equals("X"))
						{
							setTitle("Gano el jugador X");
							inabilitarOHabilitarBotones("3,5,7");
							colorear("3,5,7");
							marcador1();
							bandera=1;
							reiniciarBandera();
						}else
							if(valor1.equals("X")&& valor4.equals("X") && valor7.equals("X"))
							{
								setTitle("Gano el jugador X");
								inabilitarOHabilitarBotones("1,4,7");
								colorear("1,4,7");
								marcador1();
								bandera=1;
								reiniciarBandera();
							}else
								if(valor2.equals("X")&& valor5.equals("X") && valor8.equals("X"))
								{
									setTitle("Gano el jugador X");
									inabilitarOHabilitarBotones("2,5,8");
									colorear("2,5,8");
									marcador1();
									bandera=1;
									reiniciarBandera();
								}else
									if(valor3.equals("X")&& valor6.equals("X") && valor9.equals("X"))
									{
										setTitle("Gano el jugador X");
										inabilitarOHabilitarBotones("3,6,9");
										colorear("3,6,9");
										marcador1();
										bandera=1;
										reiniciarBandera();
									}
		
//		_____________________ JUGADOR O______________________
		
										else
										if(valor1.equals("O")&& valor2.equals("O") && valor3.equals("O"))
										{
											setTitle("Gano el jugador O");
											inabilitarOHabilitarBotones("1,2,3");
											colorear("1,2,3");
											
											marcador2();
											bandera=1;
											reiniciarBandera();
										}else
											if(valor4.equals("O")&& valor5.equals("O") && valor6.equals("O"))
											{
												setTitle("Gano el jugador O");
												inabilitarOHabilitarBotones("4,5,6");
												colorear("4,5,6");
												marcador2();
												bandera=1;
												reiniciarBandera();
											}else
												if(valor7.equals("O")&& valor8.equals("O") && valor9.equals("O"))
												{
													setTitle("Gano el jugador O");
													inabilitarOHabilitarBotones("7,8,9");
													colorear("7,8,9");
													marcador2();
													bandera=1;
													reiniciarBandera();
												}else
													if(valor1.equals("O")&& valor5.equals("O") && valor9.equals("O"))
													{
														setTitle("Gano el jugador O");
														inabilitarOHabilitarBotones("1,5,9");
														colorear("1,5,9");
														marcador2();
														bandera=1;
														reiniciarBandera();
													}else
														if(valor3.equals("O")&& valor5.equals("O") && valor7.equals("O"))
														{
															setTitle("Gano el jugador O");
															inabilitarOHabilitarBotones("3,5,7");
															colorear("3,5,7");
															marcador2();
															bandera=1;
															reiniciarBandera();
														}else
															if(valor1.equals("O")&& valor4.equals("O") && valor7.equals("O"))
															{
																setTitle("Gano el jugador O");
																inabilitarOHabilitarBotones("1,4,7");
																colorear("1,4,7");
																marcador2();
																bandera=1;
																reiniciarBandera();
															}else
																if(valor2.equals("O")&& valor5.equals("O") && valor8.equals("O"))
																{
																	setTitle("Gano el jugador O");
																	inabilitarOHabilitarBotones("2,5,8");
																	colorear("2,5,8");
																	marcador2();
																	bandera=1;
																	reiniciarBandera();
																}else
																	if(valor3.equals("O")&& valor6.equals("O") && valor9.equals("O"))
																	{
																		setTitle("Gano el jugador O");
																		inabilitarOHabilitarBotones("3,6,9");
																		colorear("3,6,9");
																		marcador2();
																		bandera=1;
																		reiniciarBandera();
																		
																	}
																	else
																	{
																		bandera=0;
																		
																	}

	}
	
	
}




