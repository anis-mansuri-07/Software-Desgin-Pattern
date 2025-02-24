package OS;


public abstract class Abstract_Factory {

    public abstract IButton getButton();

    public abstract ICheckBox getCheckBox();

    public abstract IRadioButton getRadioButton();

    public static Abstract_Factory getOsName(String osName) {

        return switch (osName.toLowerCase()) {
            case "mac" -> new Mac_Fact();
            case "windows" -> new Windows_Fact();
            case "linux" -> new Linux_Fact();
            default -> throw new IllegalArgumentException("Invalid Choice Os");
        };
    }

    public static String resultString(Abstract_Factory abs , String productName){
        String result;
        switch (productName.toLowerCase()){
            case "button":
                IButton bt = abs.getButton();
                result = bt.createButton();
                break;

            case "checkbox":
                ICheckBox cb = abs.getCheckBox();
                result = cb.createCheckBox();
                break;

            case "radiobutton":
                IRadioButton rb = abs.getRadioButton();
                result = rb.createRadioButton();
                break;

            default:
                 throw new IllegalArgumentException("Invalid Choice Products");
        }
        return result;
    }
}
