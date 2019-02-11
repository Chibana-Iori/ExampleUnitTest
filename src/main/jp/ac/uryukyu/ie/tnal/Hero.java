package jp.ac.uryukyu.ie.tnal;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing {
   public Hero(){
       super("勇者",10,5);
   }
    /**String name;
    int hitPoint;
    int attack;
    boolean dead;*/
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは倒れた。\n", name);
        }
    }
}
