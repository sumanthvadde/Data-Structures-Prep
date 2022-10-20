class Solution(object):
    def minimizeResult(self, e: str) -> str:
        res = '('+e+')'
        e = e.split('+')
        mn = int(e[0])+int(e[1])
        
        m, n = len(e[0]), len(e[1])
        
        for i in range(-1,m-1):
            a = int(e[0][:i+1]) if i>=0 else 1
            b = int(e[0][i+1:])
            
            for j in range(n):
                c = int(e[1][:j+1])
                d = int(e[1][j+1:]) if j+1 < n else 1
                calc = a*(b+c)*d
                print(a,b,c,d,calc)
                if mn > calc:
                    res = (str(a) if i>=0 else '')+'('+str(b)+'+'+str(c)+')'+(str(d) if j+1 < n else '')
                    mn = calc
        return res
        