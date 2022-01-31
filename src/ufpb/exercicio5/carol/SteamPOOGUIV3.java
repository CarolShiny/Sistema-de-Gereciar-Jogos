package ufpb.exercicio5.carol;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SteamPOOGUIV3 extends JFrame{
	JLabel linha1, linha2;
	ImageIcon jogosImg = new ImageIcon("./imgs/jogos_digitais.jpg");
	ImageIcon addImg = new ImageIcon("./imgs/add.jpg");
	ImageIcon pesqImg = new ImageIcon("./imgs/search.jpg");
	ImageIcon addCategorImg = new ImageIcon("./imgs/addCategoria.jpg");
	JButton botaoAdicionar, botaoPesquisar, botaoCategoria;
	
	SteamPOOHash gerenciador = new SteamPOOHash();
	
	public SteamPOOGUIV3 () {
		setTitle("Gerenciador de Jogos Steam");
		setSize(800,600);
		setLocation(150,150);
		setResizable(false);
		getContentPane().setBackground(Color.black);
		linha1 = new JLabel("Meu Gerenciador de Jogos", JLabel.CENTER);
		linha1.setForeground(Color.CYAN);
		linha1.setFont(new Font("Serif", Font.BOLD, 24));
		linha2 = new JLabel(jogosImg, JLabel.CENTER);
		botaoAdicionar = new JButton("Adicionar",addImg);
		botaoAdicionar.addActionListener(new GerenciadorAddController(gerenciador));
		botaoPesquisar = new JButton("Pesquisar",pesqImg);
		botaoPesquisar.addActionListener(new GerenciadorSearchController(gerenciador));
		botaoCategoria = new JButton("Adicionar Categoria do Jogo",addCategorImg);
		botaoCategoria.addActionListener(new GerenciadorAddCategoriaController(gerenciador));
		
				
		getContentPane().setLayout(new GridLayout(3,1));
		getContentPane().add(linha1);
		getContentPane().add(botaoAdicionar);
		getContentPane().add(linha2);
		getContentPane().add(botaoPesquisar);
		getContentPane().add(new JLabel());
		getContentPane().add(botaoCategoria);
		}
	
	public static void main (String [] args) {
		JFrame janela = new SteamPOOGUIV3();
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
}
