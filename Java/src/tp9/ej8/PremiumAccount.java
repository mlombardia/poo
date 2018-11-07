package tp9.ej8;

public class PremiumAccount extends CheckingAccount{
    private ShopDiscountsProvider discounts;
    public PremiumAccount(Integer id, double draft, ShopDiscountsProvider discounts) {
        super(id, draft);
        this.discounts = discounts;
    }

    public double extract(int amount, String shop) {
        return super.extract(
                new PremiumBankAccountMovement(BankAccountMovementType.EXTRACTION,
                        amount * (1 - discounts.getDiscount(shop)), shop));
    }
}
