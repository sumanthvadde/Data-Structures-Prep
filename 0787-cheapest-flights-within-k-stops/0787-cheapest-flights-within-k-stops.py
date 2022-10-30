class Solution(object):
    def findCheapestPrice(self, n, flights, src, dst, K):
        adj = collections.defaultdict(list)
        for u,v,w in flights: adj[v].append([u,w])
            
        mem = {}
        res = self.f(dst, K + 1 , adj , src , mem)
        
        return res if res < float('inf') else -1
    
    def f(self,v,k,adj,s,mem):
        if k < 0: return +float('inf')
        if v == s: return 0
        
        if (v,k) not in mem:
            mem[(v,k)] = min([ self.f(u, k - 1, adj , s , mem) + w for u,w in adj[v]] or [ +float('inf') ])
        return mem[(v,k)]
        
        