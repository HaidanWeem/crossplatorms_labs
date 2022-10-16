import java.io.FileNotFoundException;

interface ChoiceTemp{
    void choiceTemp(Temperature temperature);
}


public class GasStove extends KitchenStove implements ChoiceTemp{

    private StovesButton OvenButton;
    private Temperature temperature;

    public GasStove() throws FileNotFoundException {
        OvenButton = new StovesButton(Location.Central);
        temperature=Temperature.t100;
    }

    public void turnOnOvenButton() {
        OvenButton.turnOnButton(3);
    }

    public void turnOffOvenButton() {
        OvenButton.turnOffButton();
    }

    public void choiceTemp(Temperature _temperature){
        temperature=_temperature;
    }


}
