package oopsProperties.encapsulation;

public class main {
    public static void main(String[] args) {
bank raj = new bank();
        System.out.println(raj.getBalance());
        raj.setBalance(1001);
        System.out.println(raj.getBalance());
        bank loga = new bank();
    }
}
class bank {
private  int balance=500;
public int getBalance(){
    return this.balance;
}

public void setBalance(int money){
    if(money>1000)
    this.balance=money;
}
}
