package OS;

public class Windows_Fact extends Abstract_Factory {
    @Override
    public IButton getButton() {

        return new Window_Button();
    }

    @Override
    public ICheckBox getCheckBox()
    {
        return new Window_CheckBox();
    }

    @Override
    public IRadioButton getRadioButton() {
        return new Window_RadioButton();
    }
}
