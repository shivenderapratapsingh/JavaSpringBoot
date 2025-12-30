package BadCode;

public class Admin implements User {

    @Override
    public boolean canBuyProducts() {
        return false;
    }

    @Override
    public boolean canModifyProduct() {
        return false;
    }

    @Override
    public boolean canAddProduct() {
        return false;
    }

    @Override
    public boolean canApproveProduct() {
        return false;
    }
}
