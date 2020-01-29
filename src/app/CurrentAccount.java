package app;

public class CurrentAccount extends Account {

    public CurrentAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public boolean drawOut (double value) {
        if (this.getAgency() >= value){
            super.drawOut(value + 0.10);
            return true;
        } else {
            return false;
        }
    }
}