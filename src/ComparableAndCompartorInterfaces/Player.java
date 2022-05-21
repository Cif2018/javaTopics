package ComparableAndCompartorInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Player implements Comparable<Player> {

	private String name;
	private int raking;
	
	@Override
	public String toString() {
		return name;}

	public Player(String name, int raking) {
		this.name = name;
		this.raking = raking;
	}

	public static void main(String[] args) {
		
		List<Player> list=new ArrayList<>();
		

		list.add(new Player("A Gigi", 100));
		list.add(new Player("B Gigi", 200));
		list.add(new Player("C Gigi", 50));
		list.add(new Player("D Gigi", 100));
		
		System.out.println(list);
		Collections.sort(list);		
		System.out.println(list);


	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRaking() {
		return raking;
	}

	public void setRaking(int raking) {
		this.raking = raking;
	}

	@Override
	public int compareTo(Player o) {
		return o.getRaking()-this.raking;
	}

}
