package Lec11;

public class Gas_Station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas = { 1, 2, 3, 4, 5 };
		int[] cost = { 1, 2, 3, 4, 5 };

	}

	public static int CompleteCircuit(int[] gas, int[] cost) {
		int total = 0;
		for (int i = 0; i < cost.length; i++) {
			total = total + (gas[i] - cost[i]);

		}
		if (total < 0) {
			return -1;
		}
		int curr = 0;
		int pos = 0;
		for (int i = 0; i < cost.length; i++) {
			curr += (gas[i] - cost[i]);// +ve | -ve
			if (curr < 0) {
				pos = i + 1;
				curr = 0;
			}
		}
		return pos;

	}

}
