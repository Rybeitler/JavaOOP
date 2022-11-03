package com.ryanb.zookeeper.main;

import com.ryanb.zookeeper.models.Bat;
import com.ryanb.zookeeper.models.Gorilla;

public class ZookeeperTest {

	public static void main(String[] args) {
		Gorilla hank = new Gorilla();
		Bat trogdor = new Bat();
		
		hank.throwSomething();
		hank.throwSomething();
		hank.throwSomething();
		hank.eatBananas();
		hank.eatBananas();
		hank.climb();
		trogdor.attackTown();
		trogdor.attackTown();
		trogdor.eatHumans();
		trogdor.fly();
		trogdor.fly();
	}

}
