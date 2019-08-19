package Vjezbe;

import java.util.ArrayList;
import java.util.Arrays;

public class shuffleArrayList extends Number implements Comparable<Number> {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Number> list = new ArrayList<Number>();
		for(int i = 1; i < 11; i++){
			list.add(i);
		}
		
		System.out.println(list.toString());
		shuffle(list);
		System.out.println(list.toString());
		sort(list);
		System.out.println(list.toString());
	}
		
		public static void shuffle(ArrayList<Number> list){
	        for (int i = 0; i < list.size() - 1; i++) {
	            int switchValue = (int) (Math.random() * list.size());
	            System.out.print("SwitchValue: " + switchValue + " ");
	            Number temp = list.get(switchValue);
	            System.out.print("Temp: " + temp + " ");
	            list.set(switchValue, list.get(i));
	            System.out.print("list.get(i): " + list.get(i) + " ");
	            list.set(i, temp);
	            System.out.print("i value: " + i + " ");
	            System.out.println();
	        }
		}
		
		public static void sort(ArrayList<Number> list){
	        for (int i = 0; i < list.size(); i++) { 
	            Number currentMin = list.get(i); 
	            int currentMinIndex = i;

	            for (int j = i + 1; j < list.size(); j++) {
	                if (currentMin.doubleValue() > list.get(j).doubleValue()) {
	                    currentMin = list.get(j);
	                    currentMinIndex = j;
	                }
	            }   

	            if (currentMinIndex != i) {
	                list.set(currentMinIndex, list.get(i));
	                list.set(i, currentMin);
	            }
	        }
			
		}

		@Override
		public int compareTo(Number arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double doubleValue() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public float floatValue() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int intValue() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public long longValue() {
			// TODO Auto-generated method stub
			return 0;
		}
	}
