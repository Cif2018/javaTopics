package ComparableAndCompartorInterfaces;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Player2 {

	private String name;
	private int ranking;

	static class NameComparator implements Comparator<Player2> {

		@Override
		public int compare(Player2 o1, Player2 o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}

	static class rankingComparator implements Comparator<Player2> {

		@Override
		public int compare(Player2 o1, Player2 o2) {
			return -Integer.compare(o1.getranking(), o2.getranking());
		}
	}

	@Override
	public String toString() {
		return name+"//"+ranking;
	}

	public Player2(String name, int ranking) {
		this.name = name;
		this.ranking = ranking;
	}

	public static void main(String[] args) {

		List<Player2> list = new ArrayList<>();

		list.add(new Player2("B Gigi", 200));
		list.add(new Player2("C Gigi", 50));
		list.add(new Player2("D Gigi", 100));
		list.add(new Player2("A Gigi", 100));

		System.out.println(list+" original list");
		Collections.sort(list, new NameComparator());
		System.out.println(list+" ordered by name (asc)");
		Collections.sort(list, new rankingComparator());
		System.out.println(list+" ordered by ranking (desc)");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getranking() {
		return ranking;
	}

	public void setranking(int ranking) {
		this.ranking = ranking;
	}

}
