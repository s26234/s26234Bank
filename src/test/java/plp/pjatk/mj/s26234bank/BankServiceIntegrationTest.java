package plp.pjatk.mj.s26234bank;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

public class BankServiceIntegrationTest {
    @Autowired
    private BankService bankService;
    @Test
    void registerUserAndMakeTransferSuccesful() {
        bankService.registerUser("Adam", "Bodnar", 1, 3000);
        boolean transferResult = bankService.makeTransfer(1, 500);
        assertTrue(transferResult);
    }


}
