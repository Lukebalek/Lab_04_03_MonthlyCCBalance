public class Main {
    public static void main(String[] args)
    {
        double doubleBalance = 5000;
        double interest = .17;
        double oneMonth =  0;
        double twoMonth = 0;

        oneMonth = doubleBalance - (doubleBalance * interest);
        System.out.println("After one month of interest at 17%, your balance is " + oneMonth);

        twoMonth = oneMonth - (oneMonth * interest);
        System.out.println("After two months of interest at 17%, your balance is " + twoMonth);

    }
}