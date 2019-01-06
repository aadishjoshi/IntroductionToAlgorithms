# Median and Order statistics


ith order statistics of a  set of n elements is the ith smallest elements of the set.The minimum of the set element is the first order statistic (i == 1) and the maximum of the set element is the nth order statistic ( i== n).


```

# n comparisons

MINIMUM(A):
	min = A[1];
	for i = 2 to A.length
		if min > A[i]:
			min = A[i]
	return min

```


### Selection in expected linear time theta(n)

```

RANDOMIZED-SELECT(A,p,r,i):
	if p == r:
		return A[p]

	q = RANDOMIZED-PARTITION(A,p,r)
	k = q - p + 1

	if i == k:
		return A[q]
	elseif i < k:
		return RANDOMIZED-SELECT(A,p,q-1,i)
	else:
		return RANDOMIZED-SELECT(A,q+1,r,i-k)

```



```

RANDOMIZED-PARTITION(A,p,r):
	i = RANDOM(p,r)
	exchange(A[r], A[i])
	return PARTITION(A,p,r)

```