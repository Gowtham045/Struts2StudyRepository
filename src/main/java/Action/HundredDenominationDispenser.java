package Action;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public class HundredDenominationDispenser implements Command {
    @Override
    public boolean execute(Context context) throws Exception {
        int amountLeftToBeWithdrawn = (int) context.get("amountLeftToBeWithdrawn");
        if (amountLeftToBeWithdrawn >= 100) {
            context.put("noOfHundredsDispensed", amountLeftToBeWithdrawn / 100);
            context.put("amountLeftToBeWithdrawn", amountLeftToBeWithdrawn % 100);
        }
        return false;
    }
}
