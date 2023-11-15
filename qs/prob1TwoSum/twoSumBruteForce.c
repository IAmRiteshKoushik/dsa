#include <stdlib.h>
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    *returnSize = 2; // Setting space for 2 integer array
    int* res = (int*)malloc(*returnSize * sizeof(int)); // Allocating memory
    for(int i = 0; i < numsSize - 1; i++){
        for(int j = i + 1; j < numsSize; j++){
            if (target == nums[i] + nums[j]){
                res[0] = i;
                res[1] = j;
                return res;
            }
        }
    }
    // *returnSize = 0; // Removing return size
    // return NULL; // Returning null pointer

    // Alternate 
    res[0] = -1;
    res[1] = -1;
    return res;

}
