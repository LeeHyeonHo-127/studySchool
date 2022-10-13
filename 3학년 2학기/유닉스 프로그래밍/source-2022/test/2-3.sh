num=2
gob=1
res=1

while ((num <= 9))
do
	while((gob <= 9))
  	do
		(( res=num*gob ))
		(( gob=gob+1 ))
		printf "%3d" $res
	done
	let gob=1
	(( num=num+1 ))
	printf "\n"
done
