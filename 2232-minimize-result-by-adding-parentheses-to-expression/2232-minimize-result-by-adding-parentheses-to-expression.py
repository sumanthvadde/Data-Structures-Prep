class Solution:
    def minimizeResult(self, expression: str) -> str:
        left, right = expression.split("+")
        smallest_val = float("inf")
        smallest_expression = ""
        for i in range(len(left)):
            for j in range(1, len(right)+1):
                a = 1 if i == 0 else int(left[:i])
                b = int(left[i:])
                c = int(right[:j])
                d = 1 if j == len(right) else int(right[j:])
                expression_val = a*(b+c)*d
                expression = left[:i]+'('+left[i:]+'+'+right[:j]+')'+right[j:]
                if expression_val < smallest_val:
                    smallest_val = expression_val
                    smallest_expression = expression
        return smallest_expression