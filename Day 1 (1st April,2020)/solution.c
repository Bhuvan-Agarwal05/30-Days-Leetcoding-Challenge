int singleNumber(int* nums, int numsSize){
   int num=0;
    int i;
    for(i=0;i<numsSize;i++)
        num ^= nums[i];
    return num;
}


