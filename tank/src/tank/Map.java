package tank;

public class Map {
	static int[][] arr_map = {			// location of the blocks
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{ 0, 0, 0, 0, 3, 3, 3, 3, 3, 0, 0, 0, 0},
			{ 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{ 1, 1, 1, 0, 1, 1, 2, 1, 1, 0, 2, 2, 2},
			{ 0, 0, 0, 0, 1, 1, 2, 1, 1, 1, 1, 0, 0},
			{ 0, 0, 1, 1, 2, 2, 2, 2, 2, 1, 1, 0, 0},
			{ 0, 0, 1, 1, 1, 1, 2, 1, 1, 0, 0, 0, 0},
			{ 2, 2, 2, 0, 1, 1, 2, 1, 1, 0, 1, 1, 1},
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1},
			{ 0, 0, 0, 0, 3, 3, 3, 3, 3, 0, 0, 0, 0},
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} };

	public static int[][] sendmap() {	//send the map by a function
		return arr_map;
	}
}