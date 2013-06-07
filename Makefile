build:
	javac -d bin/ -sourcepath src/ src/*.java
run:
	make build
	java -cp bin/ MontyHall 100
