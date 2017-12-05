package jp.ac.uryukyu.ie.e175764;

public class LivingThings {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;


    public boolean isDead() {
        return dead;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getHitPoint() {
        return hitPoint;
    }
    public void setHitPoint(int hitPoint){
        this.hitPoint=hitPoint;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void setDead(boolean dead) {
        this.dead = dead;
    }
    public int getAttack() {
        return attack;
    }

    public LivingThings (String name, int maximumHP, int attack){
        setName(name);
        setAttack(attack);
        setHitPoint(maximumHP);
        setDead(false);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public void attack(LivingThings opponent) {
        int damage = (int) (Math.random() * getAttack() );
        if (!isDead()) {
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

}