package plp.pjatk.mj.s26234bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S26234BankApplication {

    private final BankService bankService;
    public S26234BankApplication(BankService bankService) {
        this.bankService = bankService;

        bankService.registerUser("Michal", "Jach", 1, 1500);
       System.out.println(bankService.getBankerOfId(1));
        bankService.makeTransfer(1, 233.5);
        System.out.println(bankService.getBankerOfId(1));
        bankService.depositMoney(1,50);
        System.out.println(bankService.getBankerOfId(1));

        bankService.registerUser("Anna", "Podolska", 2, 3500);
        bankService.makeTransfer(2, 765.4);
        System.out.println(bankService.getBankerOfId(2));
    }




    public static void main(String[] args) {
        SpringApplication.run(S26234BankApplication.class, args);
    }

}
