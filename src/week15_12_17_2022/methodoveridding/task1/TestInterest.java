package week15_12_17_2022.methodoveridding.task1;

public class TestInterest {

    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.calculateTheInterest();
        System.out.println("================================");
        AkBank akBank = new AkBank();
        akBank.calculateTheInterest();

        System.out.println("===========================");

        GarantiBank garantiBank = new GarantiBank();
        garantiBank.calculateTheInterest();

        System.out.println("=================================");

        INGBank ingBank = new INGBank();
        ingBank.calculateTheInterest();
    }

}
