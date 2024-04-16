package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;

public class ViewLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField Senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin frame = new ViewLogin();
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
	public ViewLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1138, 889);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1122, 850);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Senha = new JPasswordField();
		Senha.setBounds(496, 535, 153, 31);
		panel.add(Senha);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(new Color(255, 255, 255));
		lblSenha.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
		lblSenha.setBounds(534, 491, 73, 44);
		panel.add(lblSenha);
		
		JTextArea Usuario = new JTextArea();
		Usuario.setBounds(496, 449, 153, 31);
		panel.add(Usuario);
		
		JLabel lbUsuario = new JLabel("Usuário");
		lbUsuario.setForeground(new Color(255, 255, 255));
		lbUsuario.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
		lbUsuario.setBounds(529, 407, 95, 31);
		panel.add(lbUsuario);
		
		JLabel lblLoginTexto = new JLabel("Login");
		lblLoginTexto.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
		lblLoginTexto.setForeground(new Color(255, 255, 255));
		lblLoginTexto.setBounds(534, 297, 73, 44);
		panel.add(lblLoginTexto);
		
		JLabel lblPainelLogin = new JLabel("");
		lblPainelLogin.setIcon(new ImageIcon(ViewLogin.class.getResource("/View/Imagens/painel-login.png")));
		lblPainelLogin.setBounds(285, 193, 613, 493);
		panel.add(lblPainelLogin);
		
		JLabel lblFundo = new JLabel("");
		lblFundo.setIcon(new ImageIcon(ViewLogin.class.getResource("/View/Imagens/logo1.jpg")));
		lblFundo.setBounds(-113, -55, 1392, 956);
		panel.add(lblFundo);
	}
}
