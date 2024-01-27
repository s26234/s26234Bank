package plp.pjatk.mj.s26234bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class BankServiceTest {
    @Test
    void registerUserSuccesfulRegistration() {
        ClientStorage clientStorage = new ClientStorage();
        BankStorage bankStorage = new BankStorage();
        BankService bankService = new BankService(clientStorage, bankStorage);

         boolean result = bankService.registerUser("Adam", "Bodnar", 1, 1000);
         assertTrue(result);
    }

}
