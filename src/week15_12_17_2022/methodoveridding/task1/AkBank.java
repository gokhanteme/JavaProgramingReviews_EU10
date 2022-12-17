package week15_12_17_2022.methodoveridding.task1;

public class AkBank extends Bank{

    @Override
    public void calculateTheInterest() {
        super.calculateTheInterest();
        System.out.println(getCapital() * 7 / 100);
    }
}
