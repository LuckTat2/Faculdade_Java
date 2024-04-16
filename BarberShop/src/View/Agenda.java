package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class Agenda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField CampoNome;
	private JTextField CampoValor;
	private JTextField CampoData;
	private JTextField CampoHora;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Agenda frame = new Agenda();
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
	public Agenda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1252, 920);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(198, 563, 844, 97);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(230, 230, 230));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Alan", "Corte", "10", "16/03/2024", "08:00", null},
				{"2", "Abgail", "Corte", "10", "16/03/2024", "08:30", null},
				{"3", "Pedro", "Barba", "20", "16/03/2024", "09:00", null},
				{"4", "Jos\u00E9", "Cabelo + Barba", "25", "16/03/2024", "09:30", null},
			},
			new String[] {
				"id", "Cliente", "Servi\u00E7o", "Valor", "Data", "Hora", "Observa\u00E7\u00E3o"
			}
		));
		table.getColumnModel().getColumn(2).setPreferredWidth(88);
		scrollPane.setViewportView(table);
		
		JComboBox BoxServico = new JComboBox();
		BoxServico.setBackground(new Color(255, 255, 255));
		BoxServico.setFont(new Font("Tahoma", Font.PLAIN, 11));
		BoxServico.setModel(new DefaultComboBoxModel(new String[] {"Barba", "Cabelo", "Barba + Cabelo"}));
		BoxServico.setBounds(296, 318, 153, 24);
		contentPane.add(BoxServico);
		
		JComboBox BoxCliente = new JComboBox();
		BoxCliente.setModel(new DefaultComboBoxModel(new String[] {"Alan", "Pedro", "Abgail", "José"}));
		BoxCliente.setFont(new Font("Tahoma", Font.PLAIN, 11));
		BoxCliente.setBackground(new Color(255, 255, 255));
		BoxCliente.setBounds(296, 272, 153, 24);
		contentPane.add(BoxCliente);
		
		CampoHora = new JTextField();
		CampoHora.setColumns(10);
		CampoHora.setBounds(296, 451, 153, 24);
		contentPane.add(CampoHora);
		
		JLabel Hora = new JLabel("Hora");
		Hora.setForeground(Color.WHITE);
		Hora.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
		Hora.setBounds(198, 451, 88, 24);
		contentPane.add(Hora);
		
		CampoData = new JTextField();
		CampoData.setColumns(10);
		CampoData.setBounds(296, 407, 153, 24);
		contentPane.add(CampoData);
		
		JLabel Data = new JLabel("Data");
		Data.setForeground(Color.WHITE);
		Data.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
		Data.setBounds(198, 407, 88, 24);
		contentPane.add(Data);
		
		CampoValor = new JTextField();
		CampoValor.setColumns(10);
		CampoValor.setBounds(296, 362, 153, 24);
		contentPane.add(CampoValor);
		
		JLabel Valor = new JLabel("Valor");
		Valor.setForeground(Color.WHITE);
		Valor.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
		Valor.setBounds(198, 362, 88, 24);
		contentPane.add(Valor);
		
		JLabel Servico = new JLabel("Serviço");
		Servico.setForeground(Color.WHITE);
		Servico.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
		Servico.setBounds(198, 317, 88, 24);
		contentPane.add(Servico);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(743, 187, 299, 251);
		contentPane.add(textArea);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Agendar");
		tglbtnNewToggleButton.setBackground(new Color(128, 255, 128));
		tglbtnNewToggleButton.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		tglbtnNewToggleButton.setBounds(743, 463, 299, 39);
		contentPane.add(tglbtnNewToggleButton);
		
		CampoNome = new JTextField();
		CampoNome.setBounds(296, 224, 153, 24);
		contentPane.add(CampoNome);
		CampoNome.setColumns(10);
		
		JLabel Cliente = new JLabel("Cliente");
		Cliente.setForeground(Color.WHITE);
		Cliente.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
		Cliente.setBounds(198, 272, 88, 24);
		contentPane.add(Cliente);
		
		JLabel Nome = new JLabel("Nome");
		Nome.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
		Nome.setForeground(new Color(255, 255, 255));
		Nome.setBounds(198, 224, 75, 24);
		contentPane.add(Nome);
		
		JLabel PainelTransparente = new JLabel("");
		PainelTransparente.setFont(new Font("Segoe UI Black", Font.PLAIN, 12));
		PainelTransparente.setIcon(new ImageIcon(Agenda.class.getResource("/View/Imagens/Agenda-PainelFundo.png")));
		PainelTransparente.setBounds(-28, -34, 1320, 915);
		contentPane.add(PainelTransparente);
		
		JLabel FundoAgenda = new JLabel("");
		FundoAgenda.setIcon(new ImageIcon(Agenda.class.getResource("/View/Imagens/fundoagendamento.jpg")));
		FundoAgenda.setBounds(0, 0, 1236, 881);
		contentPane.add(FundoAgenda);
	}
}
