package plp.pjatk.mj.s26234bank;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BankService {
    private ClientStorage clientStorage;
    private BankStorage bankStorage;

    public BankService(ClientStorage clientStorage, BankStorage bankStorage) {
        this.clientStorage = clientStorage;
        this.bankStorage = bankStorage;
    }
    public boolean registerUser(String name, String surname, int id, double saldo) {
        if (clientStorage.getClientById(id) != null) {
            System.out.println("Client with ID exist");
            return false;
        }
        Client client = new Client(name, surname);
        clientStorage.addClient(client);

        Banker banker = new Banker(client, id, "ACCEPTED", saldo);
        bankStorage.addBanker(banker);
        System.out.println("Registration succesful");
        return true;
    }
    public boolean makeTransfer(int senderId, double amount) {
        Banker sender = bankStorage.getBankerById(senderId);
        if (sender == null) {
            System.out.println("Client not found");
            return false;
        }
        double newSaldo = sender.getSaldo() - amount;

        if (newSaldo < 0) {
            System.out.println("Not enough money");
            return false;
        }
        sender.setSaldo(newSaldo);
        sender.setStatus("ACCEPTED");
        System.out.println("Transaction succesful");
            return true;
    }

    public boolean depositMoney (int receiverId, double amount) {
        Banker receiver = bankStorage.getBankerById(receiverId);
        if (receiver == null) {
            System.out.println("Client not found");
            return false;
        }

        double newSaldo = receiver.getSaldo() + amount;
        receiver.setSaldo(newSaldo);
        receiver.setStatus("ACCEPTED");

        System.out.println("Deposit succesful");
        return true;
    }

    public Banker getBankerOfId(int id) {
        return bankStorage.getBankerById(id);
    }

    public List<Client> getAllClients() {
        return clientStorage.getClientList();
    }

    public List<Banker> getAllBankers() {
        return bankStorage.getBankerList();
    }

}
