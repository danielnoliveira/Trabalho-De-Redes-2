# Trabalho-De-Redes-2
Implementação de um protocolo TCP usando apenas o protocolo UDP.

#Divisão do trabalho
cliente
servidor
sequenciamento de dados
reconhecimento cumulativo
controle de congestionamento
pacote
  |___cabeçalho de 12 bytes(96 bits)
          |___sequence number(32 bits)
	  |___ack number(32 bits)
	  |___connection ID(16 bits)
	  |___not used(13 bits)
	  |___A(1 bit)
	  |___S(1 bit)
	  |___F(1 bit)
#Dicas para o trabalho
First, assume there is no packet loss. Just have the server send a packet, the receiver respond with an ACK, and so on.

Second, introduce a large file transmission. This means you must divide the file into multiple packets and transmit the packets based on the current congestion window size.

Third, introduce packet loss. Now you have to add a timer at the first sent and unacked packet. There should be one timeout whenever data segments are sent out. Also congestion control features should be implemented for the successful file transmission.
