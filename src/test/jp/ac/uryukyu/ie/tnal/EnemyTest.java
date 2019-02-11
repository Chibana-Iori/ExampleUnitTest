package jp.ac.uryukyu.ie.e185746;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {

    @Test
    void attack() {
        int heroHP = 10;
        Hero hero = new Hero();
        Enemy enemy = new Enemy();
        enemy.setDead(true);
        for(int i = 0; i<10; i++); {
            enemy.attack(hero);
        }
        assertEquals(heroHP, hero.getHitPoint());
    }
}
