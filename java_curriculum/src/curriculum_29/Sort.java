package curriculum_29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class Sort {
	
	PrefecturesBeans pB = new PrefecturesBeans();

	String[] nums;
	//int[] numsInt;
	// List<String> numsSt = new ArrayList<>();
	List<Integer> numsIntCheck = new ArrayList<>();
	List<Integer> numsInt ;
	
	public void numCheck(String textNum) {
		
		// 0-10,以外の入力を受け付けない
		
		if(Objects.isNull(textNum) ||  textNum.isEmpty()) {
			
			System.out.println("何も入力されていません。");
			
		}else {
			
			// 
			
			nums = textNum.split(",");
			for(String num: nums) {
				
				// 文字化数字かチェックする
				// 処理を止めるかもう一度入力するか
				if(Pattern.matches("[0-9]+$", num)) {
					
					int numInt = Integer.parseInt(num);
					
					if(0 < numInt && numInt < 11) {
						
						numsIntCheck.add(numInt);

					}
					
					numsInt = new ArrayList<>(new HashSet<>(numsIntCheck));
					
				}
				else{
					
					System.out.println("数字以外が入力されました。");
					System.exit(0);
					
				}
				
			}
//			numsInt = numsSt.stream()
//            .map(s -> Integer.parseInt(s))
//            .collect(Collectors.toList());
		}
		
	}
	
	public void sortText(String text) {
		
		if(Objects.isNull(text) ||  text.isEmpty()) {
			
			System.out.println("昇順か降順を入力してください");
			
		}else {
			
			switch(text) {
			
			case "昇順" -> {
				
//				Arrays.sort(numsInt);
//				System.out.println(Arrays.toString(numsInt));
				Collections.sort(numsInt);
				for (Integer num : numsInt) {
		            System.out.println(num);//35 72 100
		        }
				
			}
			case "降順" -> {
				
//				sortDesc(numsInt);
				// System.out.println(Arrays.toString(numsInt));
				Collections.sort(numsInt);
		        Collections.reverse(numsInt);
		        for (Integer num : numsInt) {
		            System.out.println(num);//35 72 100
		        }
			}
			
			default -> System.out.println("昇順か降順を入力してください。");
				
			}
			
		}
		
	}
	
	public void separateNum(String textNum,String sortText) {
		
		numCheck(textNum);
		sortText(sortText);
		for (Integer num : numsInt) {
			String preInfo = pB.getPref(num);
			String temp[] = preInfo.split(":");
//			都道府県名：山形県
//			県庁所在地：山形市
//			面積：9323.0km2
			System.out.println("都道府県名：" + temp[0]);
			System.out.println("県庁所在地：" + temp[1]);
			System.out.println("面積：" + temp[2] + "km2\n");
        }
		
		
	}
	
//	public void sortDesc(int[] numsInt) {
//
//        Arrays.sort(numsInt);
//
//        int[] numsTemp = new int[numsInt.length];
//
//        for (int i = 0; i < numsInt.length; i++) {
//            numsTemp[i] = numsInt[numsInt.length - 1 - i];
//        }
//
//        for (int i = 0; i < numsInt.length; i++) {
//        	numsInt[i] = numsTemp[i];
//        }
//
//    }
	
//	public void removeNum() {
//		
//		for(Integer num :numsInt) {
//			
//			int i = 0;
//			
//			if (num < 0 || 10 < num) {
//				
//				numsInt.remove(i);
//				
//			}
//			
//			i ++;
//			
//		}
//		
//	}

}
