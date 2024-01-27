package plp.pjatk.mj.s26234bank;

public class Banker {
    private Client client;
    private int id;
    private String status;
    private double saldo;



    public Banker(Client client, int id, String status, double saldo) {
        this.client = client;
        this.id = id;
        this.status = status;
        this.saldo = saldo;


    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public String setStatus(String status) {
        this.status = status;
        return status;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }





    @Override
    public String toString() {
        return "Banker{" +
                "client=" + client +
                ", saldo=" + saldo +
                ", status='" + status + '\'' +
                ", id=" + id +
                '}';
    }



}
