package server;

import java.net.DatagramSocket;
import java.net.SocketException;

public class Servidor {
	private int porta;
	private String file_dir;
	public static long MAX_LENGTH_ARQUIVE = 100000000;//em bytes
	private int CONNECT_ID = 1;
	private DatagramSocket ds;
	public Servidor(int porta, String file_dir) {
		this.porta = porta;
		this.file_dir = file_dir;
		try {
			this.ds = new DatagramSocket(this.porta);
			
		} catch (SocketException e) {
			System.out.println("Porta não disponivel!!!\nSistema encerrando!!!");
			System.exit(0);
		}
		this.executa();
	}

	private void executa() {
		while(true) {
			
		}
		
	}
	
	public static void main(String[] args) {
		int porta = 12345;
		String file_dir = "DiretorioDeArquivos/";
		new Servidor(porta,file_dir).executa();
	}

}
