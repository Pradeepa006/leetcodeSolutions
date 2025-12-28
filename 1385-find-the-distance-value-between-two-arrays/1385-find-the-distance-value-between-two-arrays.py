class Solution:
    def isDistance(self ,arr1: List[int], arr2: List[int],i: int , d: int ) ->bool:
        for j in range (0 , len(arr2)):
            if(abs(arr1[i] - arr2[j]) <= d):
                return False
        return True


    def findTheDistanceValue(self, arr1: List[int], arr2: List[int], d: int) -> int:
        count = 0
        for i in range (0 , len(arr1)):
            if(self.isDistance(arr1 , arr2 , i , d)):
                count += 1    
        return count