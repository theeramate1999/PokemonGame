import java.util.*;
    class Trainer {
    private String name;
    private String sex;
    private final ArrayList<Pokemon> bag;
    private int money;
    private int potion;
    private int highpotion;
    private int Either;
    private int pokeball;
    private int greatball;
    private int ultraball;
    private int masterball;

    public Trainer(final String name) {
        this.name = name;
        money = 100;
        pokeball = 5;
        potion = 1;
        highpotion = 0;
        Either = 0;
        greatball = 1;
        ultraball = 1;
        masterball = 1;
        bag = new ArrayList<Pokemon>();
        assert potion >= 0;
        assert highpotion >= 0;
        assert Either >= 0;
        assert pokeball >= 0;
        assert greatball >= 0;
        assert ultraball >= 0;

    }

    public void printPokemon(final ArrayList<Pokemon> pokemon) {
        System.out.print("Pokemon in Bag");
        for (final Pokemon p : bag) {
            System.out.println(p);
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Pokemon> getBag() {
        return bag;
    }

    public void setSex(final int e) {
        if (e == 0) {
            sex = "Male";
            System.out.print("" + sex);
        } else if (e == 1) {
            sex = "Female";
            System.out.print("" + sex);
        }

    }

    public void setName(final String name) {
        this.name = name;
    }

    public void addPokemon(final Pokemon pokemon) {
        bag.add(pokemon);
    }

    public String getSex() {
        return sex;
    }

    public int getPotion(final int p) {
        switch (p) {
            case 1:
                return potion;

            case 2:
                return highpotion;

            case 3:
                return Either;
        }
        return potion;
    }

    public int getPokeball(final int p) {

        switch (p) {
            case 1:
                return pokeball;

            case 2:
                return greatball;

            case 3:
                return ultraball;

            case 4:
                return masterball;
        }
        return pokeball;
    }

public int getMoney() {
    return money;
}

    public void setMoney(final int money) {
        this.money = money;
    }

    public void addMoney(final int money) {
        this.money += money;
    }

    public void addPotion(final int p) {
        switch (p) {
            case 1:
                potion += 1;
                break;
            case 2:
                highpotion += 1;
                break;
            case 3:
                Either += 1;
                break;
        }
    }

    public void usePotion(final int p){
        switch (p) {
            case 1:
                potion -= 1;
                break;
            case 2:
                highpotion -= 1;
                break;
            case 3:
                Either -= 1;
                break;
        }
    }

    public void addPokeball(final int p) {
        switch (p) {
            case 1:
                pokeball += 1;
                break;
            case 2:
                greatball += 1;
                break;
            case 3:
                ultraball += 1;
                break;
            case 4:
                masterball += 1;
                break;
        }
    }

    public void addGacha(final int p) {
        switch (p) {
            case 1:
                pokeball -= 1;
                break;
            case 2:
                greatball -= 1;
                break;
            case 3:
                ultraball -= 1;
                break;
            case 4:
                masterball -= 1;
                break;
        }

    }

    public Pokemon GetPokemon(final int num) {
        System.out.println(""+bag.get(num).getName());
        return bag.get(num);
    }

}

