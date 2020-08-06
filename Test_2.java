import java.util.ArrayList;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[10];
		
		ArrayList<Integer> list = new ArrayList<>();
		
		arr[0] = 100;
		arr[1] = 200;
		
		list.add(100);
		list.add(200);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		//수정
		
		arr[0] = 1000;
		arr[1] = 2000;
		
		list.set(0, 1000);
		list.set(1, 2000);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		for(int i = 0; i < 2; i++) {
			arr[i] = arr[i + 1];
			
		}
		System.out.println(arr[0]);
		
		list.remove(0);
		System.out.println(list.get(0));
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		
		System.out.println(list.size());
		
		
	}

}
