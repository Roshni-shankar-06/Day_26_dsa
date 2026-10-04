class Solution:
    def checkValidString(self, s: str) -> bool:
        min_open = 0
        max_open = 0
        
        for char in s:
            if char == '(':
                min_open += 1
                max_open += 1
            elif char == ')':
                min_open -= 1
                max_open -= 1
            elif char == '*':
                min_open -= 1  # treating * as ')'
                max_open += 1  # treating * as '('
            
            # If max_open is negative, there are too many ')'
            if max_open < 0:
                return False
                
            # min_open shouldn't fall below 0 because we can choose to treat * as ""
            if min_open < 0:
               
