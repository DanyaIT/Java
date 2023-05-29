public class lesson_1 {
    
    public static int[] SortingByCounting(int[] nums)
    {
        SortedDictionary<int, int> tempDict = new SortedDictionary<int, int>();
        for (int i = 0; i < nums.Length; i++)
        {
            if (tempDict.ContainsKey(nums[i])){
                tempDict[nums[i]]++;
            } else
            {
                tempDict.Add(nums[i], 1);
            }
        }

        int counter = 0;
        foreach (int i in tempDict.Keys)
        {
            int temp = counter;
            for (int j = counter; j < tempDict[i] + temp; j++)
            {
                nums[j] = i;
                counter++;
            }
        }
        return nums;
    }
}

