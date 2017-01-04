import java.util.ArrayList;

class Record{
	int size, occupied, price, music, location, vip, favbeer,enjoy;
	
	Record(int size, int occupied, int price, int music, int location, int vip, int favbeer,int enjoy) {
		this.size = size;
		this.occupied = occupied;
		this.price = price;
		this.music = music;
		this.location = location;
		this.vip = vip;
		this.favbeer = favbeer;
		this.enjoy = enjoy;
	}
}


public class DecisionTree {
	
	public double infoGainSize(Record[] recordlist, int[][] limitationList) {
		double enjoyYesCount=0, enjoyNoCount=0, LYesCount=0, LNoCount=0, MYesCount=0, MNoCount=0, SYesCount=0, SNoCount=0;
		for (Record record : recordlist) {
			if (record.enjoy == 1) {
				enjoyYesCount += 1;
			}else if (record.enjoy == 0) {
				enjoyNoCount += 1;
			}
		}
		for (Record record : recordlist) {
			if (limitationList[0][0] == 0) {
				if (record.size == 1 && record.enjoy == 1){
					LYesCount += 1;
				}else if (record.size == 1 && record.enjoy == 0) {
					LNoCount += 1;
				}
			}
			if (limitationList[0][1] == 0) {
				if (record.size == 2 && record.enjoy == 1){
					MYesCount += 1;
				}else if (record.size == 2 && record.enjoy == 0) {
					MNoCount += 1;
				}
			}
			if (limitationList[0][2] == 0) {
				if (record.size == 3 && record.enjoy == 1){
					SYesCount += 1;
				}else if (record.size == 3 && record.enjoy == 0) {
					SNoCount += 1;
				}
			}
		}
		double count = enjoyYesCount + enjoyNoCount;
		double InformationBefore = (enjoyYesCount / count) * (Math.log(count / enjoyYesCount) / Math.log(2))
				+ (enjoyNoCount / count) * (Math.log(count / enjoyNoCount) / Math.log(2));
		double Information1After = (LYesCount / (LYesCount + LNoCount)) * (Math.log((LYesCount + LNoCount) / LYesCount) / Math.log(2))
				+ (LNoCount / (LYesCount + LNoCount)) * (Math.log((LYesCount + LNoCount) / LNoCount) / Math.log(2));
		double Information2After = (MYesCount / (MYesCount + MNoCount)) * (Math.log((MYesCount + MNoCount) / MYesCount) / Math.log(2))
				+ (MNoCount / (MYesCount + MNoCount)) * (Math.log((MYesCount + MNoCount) / MNoCount) / Math.log(2));
		double Information3After = (SYesCount / (SYesCount + SNoCount)) * (Math.log((SYesCount + SNoCount) / SYesCount) / Math.log(2))
				+ (SNoCount / (SYesCount + SNoCount)) * (Math.log((SYesCount + SNoCount) / SNoCount) / Math.log(2));
		double InformationAfter = ((LYesCount + LNoCount)/count) * Information1After 
									+ ((MYesCount + MNoCount)/count) * Information2After 
									+ ((SYesCount + SNoCount)/count) * Information3After;
		double InformationGainSize = InformationBefore - InformationAfter;
		return InformationGainSize;
	}
	
	public double infoGainOccupied(Record[] recordlist, int[][] limitationList) {
		double enjoyYesCount=0, enjoyNoCount=0, HYesCount=0, HNoCount=0, MYesCount=0, MNoCount=0, LYesCount=0, LNoCount=0;
		for (Record record : recordlist) {
			if (record.enjoy == 1) {
				enjoyYesCount += 1;
			}else if (record.enjoy == 0) {
				enjoyNoCount += 1;
			}
		}
		for (Record record : recordlist) {
			if (limitationList[1][0] == 0) {
				if (record.occupied == 1 && record.enjoy == 1){
					HYesCount += 1;
				}else if (record.occupied == 1 && record.enjoy == 0) {
					HNoCount += 1;
				}
			}
			if (limitationList[1][1] == 0) {
				if (record.occupied == 2 && record.enjoy == 1){
					MYesCount += 1;
				}else if (record.occupied == 2 && record.enjoy == 0) {
					MNoCount += 1;
				}
			}
			if (limitationList[1][2] == 0) {
				if (record.occupied == 3 && record.enjoy == 1){
					LYesCount += 1;
				}else if (record.occupied == 3 && record.enjoy == 0) {
					LNoCount += 1;
				}
			}
		}
		double count = enjoyYesCount + enjoyNoCount;
		double InformationBefore = (enjoyYesCount / count) * (Math.log(count / enjoyYesCount) / Math.log(2))
				+ (enjoyNoCount / count) * (Math.log(count / enjoyNoCount) / Math.log(2));
		double Information1After = (HYesCount / (HYesCount + HNoCount)) * (Math.log((HYesCount + HNoCount) / HYesCount) / Math.log(2))
				+ (HNoCount / (HYesCount + HNoCount)) * (Math.log((HYesCount + HNoCount) / HNoCount) / Math.log(2));
		double Information2After = (MYesCount / (MYesCount + MNoCount)) * (Math.log((MYesCount + MNoCount) / MYesCount) / Math.log(2))
				+ (MNoCount / (MYesCount + MNoCount)) * (Math.log((MYesCount + MNoCount) / MNoCount) / Math.log(2));
		double Information3After = (LYesCount / (LYesCount + LNoCount)) * (Math.log((LYesCount + LNoCount) / LYesCount) / Math.log(2))
				+ (LNoCount / (LYesCount + LNoCount)) * (Math.log((LYesCount + LNoCount) / LNoCount) / Math.log(2));
		double InformationAfter = ((HYesCount + HNoCount)/count) * Information1After 
									+ ((MYesCount + MNoCount)/count) * Information2After 
									+ ((LYesCount + LNoCount)/count) * Information3After;
		double InformationGainOccupize = InformationBefore - InformationAfter;
		return InformationGainOccupize;
	}

	public double infoGainPrice(Record[] recordlist, int[][] limitationList) {
		double enjoyYesCount=0, enjoyNoCount=0, EYesCount=0, ENoCount=0, NYesCount=0, NNoCount=0, CYesCount=0, CNoCount=0;
		for (Record record : recordlist) {
			if (record.enjoy == 1) {
				enjoyYesCount += 1;
			}else if (record.enjoy == 0) {
				enjoyNoCount += 1;
			}
		}
		for (Record record : recordlist) {
			if (limitationList[2][0] == 0) {
				if (record.price == 1 && record.enjoy == 1){
					EYesCount += 1;
				}else if (record.price == 1 && record.enjoy == 0) {
					ENoCount += 1;
				}
			}
			if (limitationList[2][1] == 0) {
				if (record.price == 2 && record.enjoy == 1){
					NYesCount += 1;
				}else if (record.price == 2 && record.enjoy == 0) {
					NNoCount += 1;
				}
			}
			if (limitationList[2][2] == 0) {
				if (record.price == 3 && record.enjoy == 1){
					CYesCount += 1;
				}else if (record.price == 3 && record.enjoy == 0) {
					CNoCount += 1;
				}
			}
		}
		double count = enjoyYesCount + enjoyNoCount;
		double InformationBefore = (enjoyYesCount / count) * (Math.log(count / enjoyYesCount) / Math.log(2))
				+ (enjoyNoCount / count) * (Math.log(count / enjoyNoCount) / Math.log(2));
		double Information1After = (EYesCount / (EYesCount + ENoCount)) * (Math.log((EYesCount + ENoCount) / EYesCount) / Math.log(2))
				+ (ENoCount / (EYesCount + ENoCount)) * (Math.log((EYesCount + ENoCount) / ENoCount) / Math.log(2));
		double Information2After = (NYesCount / (NYesCount + NNoCount)) * (Math.log((NYesCount + NNoCount) / NYesCount) / Math.log(2))
				+ (NNoCount / (NYesCount + NNoCount)) * (Math.log((NYesCount + NNoCount) / NNoCount) / Math.log(2));
		double Information3After = (CYesCount / (CYesCount + CNoCount)) * (Math.log((CYesCount + CNoCount) / CYesCount) / Math.log(2))
				+ (CNoCount / (CYesCount + CNoCount)) * (Math.log((CYesCount + CNoCount) / CNoCount) / Math.log(2));
		double InformationAfter = ((EYesCount + ENoCount)/count) * Information1After 
									+ ((NYesCount + NNoCount)/count) * Information2After 
									+ ((CYesCount + CNoCount)/count) * Information3After;
		double InformationGainPrice = InformationBefore - InformationAfter;
		return InformationGainPrice;
	}
	
	public double infoGainMusic(Record[] recordlist, int[][] limitationList) {
		double enjoyYesCount=0, enjoyNoCount=0, LYesCount=0, LNoCount=0, QYesCount=0, QNoCount=0;
		for (Record record : recordlist) {
			if (record.enjoy == 1) {
				enjoyYesCount += 1;
			}else if (record.enjoy == 0) {
				enjoyNoCount += 1;
			}
		}
		for (Record record : recordlist) {
			if (limitationList[3][0] == 0) {
				if (record.music == 1 && record.enjoy == 1){
					LYesCount += 1;
				}else if (record.music == 1 && record.enjoy == 0) {
					LNoCount += 1;
				}
			}
			if (limitationList[3][1] == 0) {
				if (record.music == 2 && record.enjoy == 1){
					QYesCount += 1;
				}else if (record.music == 2 && record.enjoy == 0) {
					QNoCount += 1;
				}
			}
			
		}
		double count = enjoyYesCount + enjoyNoCount;
		double InformationBefore = (enjoyYesCount / count) * (Math.log(count / enjoyYesCount) / Math.log(2))
				+ (enjoyNoCount / count) * (Math.log(count / enjoyNoCount) / Math.log(2));
		double Information1After = (LYesCount / (LYesCount + LNoCount)) * (Math.log((LYesCount + LNoCount) / LYesCount) / Math.log(2))
				+ (LNoCount / (LYesCount + LNoCount)) * (Math.log((LYesCount + LNoCount) / LNoCount) / Math.log(2));
		double Information2After = (QYesCount / (QYesCount + QNoCount)) * (Math.log((QYesCount + QNoCount) / QYesCount) / Math.log(2))
				+ (QNoCount / (QYesCount + QNoCount)) * (Math.log((QYesCount + QNoCount) / QNoCount) / Math.log(2));
		double InformationAfter = ((LYesCount + LNoCount)/count) * Information1After 
									+ ((QYesCount + QNoCount)/count) * Information2After;
		double InformationGainPrice = InformationBefore - InformationAfter;
		return InformationGainPrice;
	}
	
	public double infoGainLocation(Record[] recordlist, int[][] limitationList) {
		double enjoyYesCount=0, enjoyNoCount=0, OneYesCount=0, OneNoCount=0, TwoYesCount=0, TwoNoCount=0, 
				ThreeYesCount=0, ThreeNoCount=0, FourYesCount=0, FourNoCount=0, FiveYesCount=0, FiveNoCount=0;
		for (Record record : recordlist) {
			if (record.enjoy == 1) {
				enjoyYesCount += 1;
			}else if (record.enjoy == 0) {
				enjoyNoCount += 1;
			}
		}
		for (Record record : recordlist) {
			if (limitationList[4][0] == 0) {
				if (record.location == 1 && record.enjoy == 1){
					OneYesCount += 1;
				}else if (record.location == 1 && record.enjoy == 0) {
					OneNoCount += 1;
				}
			}
			if (limitationList[4][1] == 0) {
				if (record.location == 2 && record.enjoy == 1){
					TwoYesCount += 1;
				}else if (record.location == 2 && record.enjoy == 0) {
					TwoNoCount += 1;
				}
			}
			if (limitationList[4][2] == 0) {
				if (record.location == 3 && record.enjoy == 1){
					ThreeYesCount += 1;
				}else if (record.location == 3 && record.enjoy == 0) {
					ThreeNoCount += 1;
				}
			}
			if (limitationList[4][3] == 0) {
				if (record.location == 4 && record.enjoy == 1){
					FourYesCount += 1;
				}else if (record.location == 4 && record.enjoy == 0) {
					FourNoCount += 1;
				}
			}
			if (limitationList[4][4] == 0) {
				if (record.location == 5 && record.enjoy == 1){
					FiveYesCount += 1;
				}else if (record.location == 5 && record.enjoy == 0) {
					FiveNoCount += 1;
				}
			}
		}
		double count = enjoyYesCount + enjoyNoCount;
		double InformationBefore = (enjoyYesCount / count) * (Math.log(count / enjoyYesCount) / Math.log(2))
				+ (enjoyNoCount / count) * (Math.log(count / enjoyNoCount) / Math.log(2));
		double Information1After = (OneYesCount / (OneYesCount + OneNoCount)) * (Math.log((OneYesCount + OneNoCount) / OneYesCount) / Math.log(2))
				+ (OneNoCount / (OneYesCount + OneNoCount)) * (Math.log((OneYesCount + OneNoCount) / OneNoCount) / Math.log(2));
		double Information2After = (TwoYesCount / (TwoYesCount + TwoNoCount)) * (Math.log((TwoYesCount + TwoNoCount) / TwoYesCount) / Math.log(2))
				+ (TwoNoCount / (TwoYesCount + TwoNoCount)) * (Math.log((TwoYesCount + TwoNoCount) / TwoNoCount) / Math.log(2));
		double Information3After = (ThreeYesCount / (ThreeYesCount + ThreeNoCount)) * (Math.log((ThreeYesCount + ThreeNoCount) / ThreeYesCount) / Math.log(2))
				+ (ThreeNoCount / (ThreeYesCount + ThreeNoCount)) * (Math.log((ThreeYesCount + ThreeNoCount) / ThreeNoCount) / Math.log(2));
		double Information4After = (FourYesCount / (FourYesCount + FourNoCount)) * (Math.log((FourYesCount + FourNoCount) / FourYesCount) / Math.log(2))
				+ (FourNoCount / (FourYesCount + FourNoCount)) * (Math.log((FourYesCount + FourNoCount) / FourNoCount) / Math.log(2));
		double Information5After = (FiveYesCount / (FiveYesCount + FiveNoCount)) * (Math.log((FiveYesCount + FiveNoCount) / FiveYesCount) / Math.log(2))
				+ (FiveNoCount / (FiveYesCount + FiveNoCount)) * (Math.log((FiveYesCount + FiveNoCount) / FiveNoCount) / Math.log(2));
		double InformationAfter = ((OneYesCount + OneNoCount)/count) * Information1After 
									+ ((TwoYesCount + TwoNoCount)/count) * Information2After 
									+ ((ThreeYesCount + ThreeNoCount)/count) * Information3After
									+ ((FourYesCount + FourNoCount)/count) * Information4After 
									+ ((FiveYesCount + FiveNoCount)/count) * Information5After;
		double InformationGainPrice = InformationBefore - InformationAfter;
		return InformationGainPrice;
	}
	
	public double infoGainVIP(Record[] recordlist, int[][] limitationList) {
		double enjoyYesCount=0, enjoyNoCount=0, NYesCount=0, NNoCount=0, YYesCount=0, YNoCount=0;
		for (Record record : recordlist) {
			if (record.enjoy == 1) {
				enjoyYesCount += 1;
			}else if (record.enjoy == 0) {
				enjoyNoCount += 1;
			}
		}
		for (Record record : recordlist) {
			if (limitationList[5][0] == 0) {
				if (record.vip == 0 && record.enjoy == 1){
					NYesCount += 1;
				}else if (record.vip == 0 && record.enjoy == 0) {
					NNoCount += 1;
				}
			}
			if (limitationList[5][1] == 0) {
				if (record.vip == 1 && record.enjoy == 1){
					YYesCount += 1;
				}else if (record.vip == 1 && record.enjoy == 0) {
					YNoCount += 1;
				}
			}
			
		}
		double count = enjoyYesCount + enjoyNoCount;
		double InformationBefore = (enjoyYesCount / count) * (Math.log(count / enjoyYesCount) / Math.log(2))
				+ (enjoyNoCount / count) * (Math.log(count / enjoyNoCount) / Math.log(2));
		double Information1After = (NYesCount / (NYesCount + NNoCount)) * (Math.log((NYesCount + NNoCount) / NYesCount) / Math.log(2))
				+ (NNoCount / (NYesCount + NNoCount)) * (Math.log((NYesCount + NNoCount) / NNoCount) / Math.log(2));
		double Information2After = (YYesCount / (YYesCount + YNoCount)) * (Math.log((YYesCount + YNoCount) / YYesCount) / Math.log(2))
				+ (YNoCount / (YYesCount + YNoCount)) * (Math.log((YYesCount + YNoCount) / YNoCount) / Math.log(2));
		double InformationAfter = ((NYesCount + NNoCount)/count) * Information1After 
									+ ((YYesCount + YNoCount)/count) * Information2After;
		double InformationGainPrice = InformationBefore - InformationAfter;
		return InformationGainPrice;
	}
	
	public double infoGainFavBeer(Record[] recordlist, int[][] limitationList) {
		double enjoyYesCount=0, enjoyNoCount=0, NYesCount=0, NNoCount=0, YYesCount=0, YNoCount=0;
		for (Record record : recordlist) {
			if (record.enjoy == 1) {
				enjoyYesCount += 1;
			}else if (record.enjoy == 0) {
				enjoyNoCount += 1;
			}
		}
		for (Record record : recordlist) {
			if (limitationList[6][0] == 0) {
				if (record.favbeer == 0 && record.enjoy == 1){
					NYesCount += 1;
				}else if (record.favbeer == 0 && record.enjoy == 0) {
					NNoCount += 1;
				}
			}
			if (limitationList[6][1] == 0) {
				if (record.favbeer == 1 && record.enjoy == 1){
					YYesCount += 1;
				}else if (record.favbeer == 1 && record.enjoy == 0) {
					YNoCount += 1;
				}
			}
			
		}
		double count = enjoyYesCount + enjoyNoCount;
		double InformationBefore = (enjoyYesCount / count) * (Math.log(count / enjoyYesCount) / Math.log(2))
				+ (enjoyNoCount / count) * (Math.log(count / enjoyNoCount) / Math.log(2));
		double Information1After = (NYesCount / (NYesCount + NNoCount)) * (Math.log((NYesCount + NNoCount) / NYesCount) / Math.log(2))
				+ (NNoCount / (NYesCount + NNoCount)) * (Math.log((NYesCount + NNoCount) / NNoCount) / Math.log(2));
		double Information2After = (YYesCount / (YYesCount + YNoCount)) * (Math.log((YYesCount + YNoCount) / YYesCount) / Math.log(2))
				+ (YNoCount / (YYesCount + YNoCount)) * (Math.log((YYesCount + YNoCount) / YNoCount) / Math.log(2));
		double InformationAfter = ((NYesCount + NNoCount)/count) * Information1After 
									+ ((YYesCount + YNoCount)/count) * Information2After;
		double InformationGainPrice = InformationBefore - InformationAfter;
		return InformationGainPrice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecisionTree decisiontree = new DecisionTree();
		Record record1 = new Record(1,1,1,1,1,0,0,0);
		Record record2 = new Record(1,1,1,1,2,1,0,1);
		Record record3 = new Record(1,2,2,2,2,0,1,1);
		Record record4 = new Record(2,2,1,2,3,0,0,0);
		Record record5 = new Record(1,2,1,2,3,1,1,1);
		Record record6 = new Record(3,2,2,2,4,0,0,1);
		Record record7 = new Record(1,3,2,2,4,0,0,0);
		Record record8 = new Record(3,2,3,1,5,0,0,1);
		Record record9 = new Record(2,1,1,1,2,1,1,1);
		Record record10 = new Record(2,3,3,2,2,0,0,0);
		Record record11 = new Record(1,2,3,1,1,0,1,0);
		Record record12 = new Record(1,3,3,2,1,1,1,0);
		Record record13 = new Record(2,2,1,2,5,0,1,1);
		Record record14 = new Record(2,1,2,1,5,1,1,1);
		Record record15 = new Record(1,2,2,1,4,0,1,1);
		Record record16 = new Record(3,1,2,2,3,0,0,0);
		Record record17 = new Record(1,1,3,1,2,0,1,1);
		Record record18 = new Record(3,3,2,2,2,0,0,0);
		Record record19 = new Record(2,3,1,1,5,0,0,0);
		Record record20 = new Record(2,2,2,2,1,0,0,1);
		Record record21 = new Record(2,3,2,2,2,0,0,1);
		
		Record[] recordlist = {record1, record2, record3, record4, record5, record6, record7, record8, 
							   record9, record10, record11, record12, record13, record14, record15, 
							   record16, record17, record18, record19, record20, record21};
		
		int[][] limitationList = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}, {0, 0}, {0, 0, 0, 0, 0}, {0, 0}, {0, 0}};
		
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] attribultNum = {3, 3, 3, 2, 5, 2, 2};
		boolean[] attribultUsed = {false, false, false, false, false, false, false};
		
		System.out.println(decisiontree.infoGainSize(recordlist, limitationList));
		System.out.println(decisiontree.infoGainOccupied(recordlist, limitationList));
		System.out.println(decisiontree.infoGainPrice(recordlist, limitationList));
		System.out.println(decisiontree.infoGainMusic(recordlist, limitationList));
		System.out.println(decisiontree.infoGainLocation(recordlist, limitationList));
		System.out.println(decisiontree.infoGainVIP(recordlist, limitationList));
		System.out.println(decisiontree.infoGainFavBeer(recordlist, limitationList));
		decisiontree.Helper(recordlist, limitationList, res, list, attribultNum, attribultUsed);
		for (int i = 0; i< res.size(); i++) {
			for (int j = 0; j < res.get(i).size(); j++) {
				System.out.println(res.get(i).get(j));
			}
			System.out.println();
		}

	}
	
	public void Helper(Record[] recordlist, int[][] limitationList, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list, int[] attribultNum, boolean[] attribultUsed) {
		ArrayList<Double> findMaxGain = new ArrayList<Double>();
		findMaxGain.add(infoGainSize(recordlist, limitationList));
		findMaxGain.add(infoGainOccupied(recordlist, limitationList));
		findMaxGain.add(infoGainPrice(recordlist, limitationList));
		findMaxGain.add(infoGainMusic(recordlist, limitationList));
		findMaxGain.add(infoGainLocation(recordlist, limitationList));
		findMaxGain.add(infoGainVIP(recordlist, limitationList));
		findMaxGain.add(infoGainFavBeer(recordlist, limitationList));
		
		double maxValue = findMaxGain.get(0);
		int maxValueIndex = 0;
		for (double infoGain : findMaxGain) {
			if (infoGain > maxValue) {
				maxValue = infoGain;
				maxValueIndex = findMaxGain.indexOf(infoGain);
			}
		}
		System.out.println(maxValueIndex);
		list.add(maxValueIndex);
		for (int i = 0; i < attribultNum[maxValueIndex]; i++) {
			if (attribultUsed[maxValueIndex] == true) {
				continue;
			}
			limitationList[maxValueIndex][i] = 1;
			//Helper(recordlist, limitationList, res, list, attribultNum, attribultUsed);
			limitationList[maxValueIndex][i] = 0;
			
		}
		attribultUsed[maxValueIndex] = true;
		if (list.size() == maxValueIndex) {
			res.add(new ArrayList<>(list));
		}
		
		int attriUsed = 0;
		for (int i = 0; i < attribultUsed.length; i++) {
			if (attribultUsed[i] == true) {
				attriUsed += 1;
			}
		}
		if (attriUsed == 7) {
			return;
		}
	}

}
