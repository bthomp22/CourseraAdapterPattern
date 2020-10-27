
public class CoffeeTouchScreenAdapter implements CoffeeMachineInterface{
	private OldCoffeeMachine old = new OldCoffeeMachine();
	@Override
	public void chooseFirstSelection() {
		old.SelectA();
		
	}

	@Override
	public void chooseSecondSelection() {
		old.SelectB();
		
	}

}
