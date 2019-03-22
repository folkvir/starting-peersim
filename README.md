# starting-peersim
Starting point for experimenting with [PeerSim](http://peersim.sourceforge.net/) (Cyclon, Scamp and Spray implemented)

# Install and test
````bash
mvn clean package
java -jar target/starting-peersim.jar --config configs/cyclon.conf > myresult.csv
# java -jar target/starting-peersim.jar --config configs/scamp.conf > myresult.csv
# java -jar target/starting-peersim.jar --config configs/spray.conf > myresult.csv
cat myresult.csv
````

# References

Spray: Nédelec, Brice, et al. 
"An adaptive peer-sampling protocol for building networks of browsers."
 World Wide Web 21.3 (2018): 629-661.

Cyclon: Voulgaris, Spyros, Daniela Gavidia, and Maarten Van Steen. 
"Cyclon: Inexpensive membership management for unstructured p2p overlays." 
Journal of Network and systems Management 13.2 (2005): 197-217.

Scamp: Ganesh, Ayalvadi J., Anne-Marie Kermarrec, and Laurent Massoulié. 
"Scamp: Peer-to-peer lightweight membership service for large-scale group communication." 
International Workshop on Networked Group Communication. Springer, Berlin, Heidelberg, 2001.