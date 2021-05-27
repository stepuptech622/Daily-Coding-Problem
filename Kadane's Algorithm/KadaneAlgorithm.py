arr = [-2,-3,4,-1,-2,1,5,-3]
local_maxima = arr[0]
global_maxima = arr[0]
for i in range(1,len(arr)):
    local_maxima = max(arr[i], arr[i] + local_maxima)
    global_maxima = max(local_maxima,global_maxima)
    
print("The Largest Subarray Sum is",global_maxima)