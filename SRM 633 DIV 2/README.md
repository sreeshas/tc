Notes:

The most interesting solution i came across was
```
for(int i=0; i< n; i++) {
			for(int j=0;j<n;j++) {
				if(max(abs(i-(n/2)), abs(j-(n/2))) %2 == 0) {
					target[i][j] = '#';
				}
			}
 }
 
 ```
 I don't think it is very intuitive, but exploits the structure as opposed to naive implementation.
