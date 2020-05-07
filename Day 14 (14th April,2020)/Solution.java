class Solution{
	public static String stringShift(String s,int[][] shift){
		if(s.length()<=1)
			return s;

		int leftShifts=0;
		int rightShifts=0;
		StringBuffer str = new StringBuffer("");
		for(int[] v:shift)
		{
			if(v[0]==0)
				leftShifts += v[1];
			else
				rightShifts +=v[1];
		}

		if(leftShifts>rightShifts)
		{
			leftShifts -= rightShifts;
			leftShifts %= s.length();
			str.append(s.substring(leftShifts,s.length()));
			str.append(s.substring(0,leftShifts));
		}
		else
		{
			rightShifts -= leftShifts;
			rightShifts %= s.length();
			System.out.println(s.length()-rightShifts);
			System.out.println(rightShifts);
			str.append(s.substring((s.length()-rightShifts),s.length()));
			str.append(s.substring(0,s.length()-rightShifts));
		}
		return str.toString();
	}
	public static void main(String[] args)
	{
		int[][] shift = {{0,4},{1,2}};
		System.out.println(stringShift("abc",shift));
		int[][] s2 = {{1,1},{1,1},{0,2},{1,3}};
		System.out.println(stringShift("abcdefg",s2));
	}
}