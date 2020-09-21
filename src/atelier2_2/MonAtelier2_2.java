package atelier2_2;

import tutoriels.atelier2_2.Atelier2_2;

public class MonAtelier2_2 extends Atelier2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MonAtelier2_2().valider();
	}

	@Override
	public Object fournirBouledogue() {
		// TODO Auto-generated method stub
		return new Bouledogue();
	}

	@Override
	public Object fournirChatGoutiere() {
		// TODO Auto-generated method stub
		return new ChatGouttiere();
	}

	@Override
	public Object fournirChatPersan() {
		// TODO Auto-generated method stub
		return new ChatPersan();
	}

	@Override
	public Object fournirDalamtien() {
		// TODO Auto-generated method stub
		return new Dalmatien();
	}

	@Override
	public Object fournirShihtzu() {
		// TODO Auto-generated method stub
		return new Shihtzu();
	}

}
