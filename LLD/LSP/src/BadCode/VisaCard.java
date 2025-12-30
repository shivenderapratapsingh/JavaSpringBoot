package BadCode;

import GoodCode.InternatioPaymnetCompatible;

public class VisaCard extends CreditCard implements InternatioPaymnetCompatible {
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay Implementation");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer Implementation");

    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay Implementation");

    }

    @Override
    public void mandatePayments() {
        System.out.println("mandatePayment Implementation");

    }
}
