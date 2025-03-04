from typing import List

class Solution:
    def maximalSquare(self, matrix: List[List[str]]) -> int:
        x = len(matrix)
        # 确保x比y大
        y = len(matrix[0]) 
        if x < y:
            x,y = y,x

        max_side = x if x > y else y
        for side in range(max_side,0,-1):
            for i in range(x-side+1):
                for j in range(y-side+1):
                    flag = False
                    for k in range(i,i+side):
                        for l in range(j,j+side):
                            if matrix[k][l] == "0":
                                flag = True
                                break
                        if flag:
                            break
                    if not flag:
                        return side*side
        return 0


