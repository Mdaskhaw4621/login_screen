package proj_aula;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class App extends  JFrame
{
	JLabel lbl_email, lbl_senha, lbl_logo;
	JTextField txf_email;
	JPasswordField senha;
	JButton btn_entrar, btn_cadastrar;
	
	
	public App() {
		super("RPM Mechanical");
		Container screen = getContentPane();
		screen.setLayout(null);
		
	ImageIcon logo = new ImageIcon("Logo_33.jpg");
	
	 screen.setBackground(Color.white);
	//instanciando e definido a posicao do logo
	 lbl_logo = new JLabel(logo);
	 lbl_logo.setBounds(60, -60, 100, 100);
	 lbl_logo.setSize(500,500);	
	//instanciando os elementos
	lbl_email = new JLabel("E-mail: ");
	lbl_senha = new JLabel("Senha: ");
	txf_email = new JTextField("");
	senha = new JPasswordField();
	btn_entrar = new JButton("Entrar");
	btn_cadastrar = new JButton("Cadastrar-se"); 
	
	//definindo a posicao do elementos
	lbl_email.setBounds(195, 260, 150, 150);
	lbl_senha.setBounds(192, 287, 150, 150);
	txf_email.setBounds(255, 325, 165, 20);
	senha.setBounds(255, 352, 165, 20);
	btn_entrar.setBounds(148, 415, 150, 40);
	btn_cadastrar.setBounds(315, 415, 150, 40);
	
	JMenuBar bar = new JMenuBar();
	setJMenuBar(bar);
	JMenu about = new JMenu("Sobre");
	bar.add(about);
	
	
	
	about.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					Inicial aboutscreen = new Inicial
				}
			});
	
	//adicionando elementos na tela
	screen.add(lbl_email);
	screen.add(lbl_senha);
	screen.add(txf_email);
	screen.add(senha);
	screen.add(btn_entrar);
	screen.add(btn_cadastrar);
	screen.add(lbl_logo);
	screen.add(bar);
	
	
	setSize(600,550);
	setVisible(true);
	
	}
	
    public static void main( String[] args )
    {
    	AboutScreen app1 = new AboutScreen();
    	app1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	App app = new App();
    	app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private  AboutScreen {
		super("Sobre RPM Mechanical");
		Container screen = getContentPane();
		screen.setLayout(null);
		
		JLabel info = new JLabel("RPM Mechanical \n "
				+ "Version: 1.0 /n Projeto criado e desenvolvido por: "
				+ "3IIA Turma: B");
		
		setSize(500,500);
		setVisible(true);
}
