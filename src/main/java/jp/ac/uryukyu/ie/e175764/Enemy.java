package jp.ac.uryukyu.ie.e175764;



public class Enemy extends LivingThings {

    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    public void attack(LivingThings opponent) {
        int damage = (int) (Math.random() * getAttack() );
        int critical=(int)(Math.random()*10);
        if (!isDead()) {
            if(critical<=3) {
                System.out.printf("%sの攻撃！痛恨の一撃！！%sに%dのダメージを与えた！！\n",getName(), opponent.getName(), damage);
                damage*=2;
                opponent.wounded(damage);
            }else if(damage==0) {
                System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n",getName(), opponent.getName(), damage);
            }else {
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
                opponent.wounded(damage);
            }
        }
    }
}
