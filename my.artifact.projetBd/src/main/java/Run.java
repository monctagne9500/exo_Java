import fr.TestDB02;
import fr.TestDB04;
import fr.banque.Client;

public class Run {

	public static void main(String[] args) {


		Client client = new Client();
		TestDB02 testDB02 = new TestDB02();

		/*
		 * System.out.println("debut ok");
		 *
		 * List<Client> clients = testDB02.recupererAllClients();
		 *
		 * for (Client a : clients) { System.out.println(a.toString()); }
		 *
		 * TestDB03 testDB03 = new TestDB03();
		 *
		 * System.out.println("/////" + testDB03.getClass().toString() + "//////////");
		 *
		 * client.setNom("Fargis"); client.setPrenom("Denis");
		 *
		 * System.out.println(client.toString());
		 *
		 * List<Compte> comptes = null;
		 *
		 * comptes = testDB03.getCompteClient(client);
		 *
		 * for (Compte compte : comptes) { System.out.println(compte.toString()); }
		 *
		 * System.out.println("");
		 *
		 * client.setNom("Fanael"); client.setPrenom("Julie");
		 *
		 * System.out.println(client.toString());
		 *
		 * comptes = testDB03.getCompteClient(client);
		 *
		 * for (Compte compte : comptes) { System.out.println(compte.toString()); }
		 *
		 * System.out.println("");
		 *
		 * client.setNom("Iaris"); client.setPrenom("Paul");
		 *
		 * System.out.println(client.toString());
		 *
		 * comptes = testDB03.getCompteClient(client);
		 *
		 * for (Compte compte : comptes) { System.out.println(compte.toString()); }
		 *
		 * System.out.println("");
		 *
		 * client.setNom("Robert"); client.setPrenom("Julie");
		 *
		 * System.out.println(client.toString());
		 *
		 * comptes = testDB03.getCompteClient(client);
		 *
		 * for (Compte compte : comptes) { System.out.println(compte.toString()); }
		 *
		 * System.out.println("/////////fin/////////");
		 */

		TestDB04 testDB04 = new TestDB04();



		client.setNom("Fargis");
		client.setPrenom("Denis");

		testDB04.getAllOperationClient(client);


	}
}






