package OS;

public class Mac_Fact extends Abstract_Factory{
    @Override
    public IButton getButton() {
        return new Mac_Button();
    }

    @Override
    public ICheckBox getCheckBox() {
        return new Mac_CheckBox();
    }

    @Override
    public IRadioButton getRadioButton() {
        return new Mac_RadioButton();
    }
}
