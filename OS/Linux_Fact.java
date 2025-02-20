package OS;

public class Linux_Fact extends Abstract_Factory{
    @Override
    public IButton getButton() {
        return new Linux_Button();
    }

    @Override
    public ICheckBox getCheckBox() {
        return new Linux_Checkbox();
    }

    @Override
    public IRadioButton getRadioButton() {
        return new Linux_RadioButton();
    }
}
