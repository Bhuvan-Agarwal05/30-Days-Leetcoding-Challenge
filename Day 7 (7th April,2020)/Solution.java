class Solution{
	public int countElements(int[] arr){
		ArrayList list = new ArrayList();
		for(int i:arr)
			list.add(i);

		int count=0;
		for(int i=0;i<list.size();i++)
		{
			if(list.contains(arr[i]+1))
				count++;
		}
		return count;
	}
}