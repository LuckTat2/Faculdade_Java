package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;

public class MenuPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal frame = new MenuPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1138, 881);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(128, 128, 128));
		setJMenuBar(menuBar);
		
		JMenu MenuCadastro = new JMenu("Cadastro");
		MenuCadastro.setForeground(new Color(0, 0, 0));
		MenuCadastro.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		MenuCadastro.setBackground(new Color(128, 128, 128));
		menuBar.add(MenuCadastro);
		
		JMenuItem Cliente = new JMenuItem("Cliente");
		Cliente.setForeground(new Color(0, 0, 0));
		Cliente.setBackground(new Color(128, 128, 128));
		Cliente.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		Cliente.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/View/Imagens/icons/cliente-icon.png")));
		MenuCadastro.add(Cliente);
		
		JMenuItem Servico = new JMenuItem("Serviço");
		Servico.setForeground(new Color(0, 0, 0));
		Servico.setBackground(new Color(128, 128, 128));
		Servico.setFont(new Font("Segoe UI Black", Font.BOLD, 12));
		Servico.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/View/Imagens/icons/tesoura-icon.png")));
		MenuCadastro.add(Servico);
		
		JMenu Operacao = new JMenu("Operação");
		Operacao.setForeground(new Color(0, 0, 0));
		Operacao.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		Operacao.setBackground(new Color(128, 128, 128));
		menuBar.add(Operacao);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 64, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFundoMenuPrincipal = new JLabel("");
		lblFundoMenuPrincipal.setIcon(new ImageIcon(MenuPrincipal.class.getResource("/View/Imagens/fundomenu1.jpg")));
		lblFundoMenuPrincipal.setBounds(0, -21, 1122, 841);
		contentPane.add(lblFundoMenuPrincipal);
	}
}
