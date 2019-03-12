package pacote;

public class Segmento {
	private int sequence_number;
	private int ack_number;
	private short connection_id;
	private boolean a;//ACK
	private boolean s;//SYN
	private boolean f;//FIN
	private byte[] payload;//dados
	
	
	public Segmento() {
		
	}
	
	public int getSequence_number() {
		return sequence_number;
	}
	public void setSequence_number(int sequence_number) {
		this.sequence_number = sequence_number;
	}
	public int getAck_number() {
		return ack_number;
	}
	public void setAck_number(int ack_number) {
		this.ack_number = ack_number;
	}
	public short getConnection_id() {
		return connection_id;
	}
	public void setConnection_id(short connection_id) {
		this.connection_id = connection_id;
	}
	public boolean isA() {
		return a;
	}
	public void setA(boolean a) {
		this.a = a;
	}
	public boolean isS() {
		return s;
	}
	public void setS(boolean s) {
		this.s = s;
	}
	public boolean isF() {
		return f;
	}
	public void setF(boolean f) {
		this.f = f;
	}
	public byte[] getPayload() {
		return payload;
	}
	public void setPayload(byte[] payload) {
		this.payload = payload;
	}
	
	
}
