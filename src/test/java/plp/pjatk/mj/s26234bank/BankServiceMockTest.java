package plp.pjatk.mj.s26234bank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BankServiceMockTest {

    @Mock
    private BankStorage bankStorage;
    @Mock
    private ClientStorage clientStorage;
    @InjectMocks
    private BankService bankService;

    @Test
    void registerUserSuccesfulRegistrationMock() {
        boolean result = bankService.registerUser("Adam", "Bodnar", 1, 2000);
        assertTrue(result);
    }




}
