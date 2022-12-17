package week15_12_17_2022.methodoveridding.task1;

public class GarantiBank extends Bank{

    @Override
    public void calculateTheInterest() {
        System.out.println(getCapital() * 8 / 100);
    }
}
