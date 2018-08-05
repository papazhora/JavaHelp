package BoostBrain.Arrays;

public class Accounts {
    public static final class Account {
        private float money;
        private String name;

        public float getMoney() {
            return money;
        }

        public void setMoney(float money) {
            this.money = money;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Account [] accounts = new Account[3];

        accounts[0] = new Account();
        accounts[0].setName("Egor Malinin");
        accounts[0].setMoney(1000000f);

        accounts[1] = new Account();
        accounts[1].setName("Eva Braun");
        accounts[1].setMoney(100f);

        accounts[2] = new Account();
        accounts[2].setName("Elga Magra");
        accounts[2].setMoney(10f);
    }

}


