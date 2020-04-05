import java.net.*;
class GetIP{
	public static void main(String[] args) throws Exception {
		InetAddress mi=InetAddress.getLocalHost();
		System.out.println("my ip address is : "+mi.getHostAddress());
	}
}
