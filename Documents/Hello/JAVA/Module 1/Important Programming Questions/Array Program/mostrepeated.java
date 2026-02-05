class mostrepeated{
	public static void main(String[] args) {
		int a[] = {1,1,2,2,2,3,3,4,4,4,5,6,7,7,7,7};

		int mostrepeated = 0;
		int maxCount = 0;

		for(int i = 0; i<=a.length-1;i++){
			int count = 1;
			for(int j = i+1;j<=a.length-1;j++){
				if(a[i]==a[j]){
					count++;
				}
			}
			if(count>maxCount){
				maxCount=count;
				mostrepeated=a[i];
			}
		}
		System.out.println(mostrepeated + " - " + maxCount +" times");
	}
}