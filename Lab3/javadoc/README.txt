Some aliases I like to set up in my bash shell, by adding the following line to my .profile in my home directory.  
(The syntax is the same for MacOS users running the Z-Shell, but the file that these lines go into is ~/.zshrc )

alias javadoc='javadoc -tag custom.require:cm:"Precondition:"  -tag custom.ensure:cm:"Postcondition:" -Xdoclint:none  *.java'

export JUNIT5='/Users/cmsumma/Source/junit/junit-platform-console-standalone-1.8.2.jar'

alias junit='java -jar $JUNIT5 -cp . --select-class'
