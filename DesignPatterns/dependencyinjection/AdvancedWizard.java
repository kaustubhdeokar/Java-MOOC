package dependencyinjection;

public class AdvancedWizard implements Wizard {

    private final Tobacco tobacco;

    public AdvancedWizard(Tobacco tobacco) {
        this.tobacco = tobacco;
    }


    @Override
    public void smoke() {
        tobacco.smoke(this);
    }

    public static void main(String[] args) {

        AdvancedWizard advancedWizard = new AdvancedWizard(new SecondBreakfastTobacco());
        advancedWizard.smoke();

    }
}
