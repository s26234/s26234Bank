package plp.pjatk.mj.s26234bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class BankStorage {
    private List<Banker> bankerList = new ArrayList<>();

    public List<Banker> getBankerList() {
        return bankerList;
    }

    public void addBanker(Banker banker) {
        bankerList.add(banker);
    }

    public Banker getBankerById(int id) {
        for (Banker banker :bankerList) {
            if (banker.getId() == id) {
                return banker;
            }
        } return null;
    }
}
