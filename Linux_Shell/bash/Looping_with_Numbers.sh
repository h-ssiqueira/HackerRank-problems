for i in {1..50}
do
    echo $i
done

for ((i = 1 ; i <= 50 ; i++))
do
    echo $i
done

declare -i x=1
while [[ $x -le 50 ]]
do
echo $x
x=$( x + 1 )
done