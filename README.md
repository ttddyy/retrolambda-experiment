
Retrolambda playground

# Command

```shell
 ./mvnw clean package
 jenv local 1.8
 java -jar target/retrolambda-experiment-1.0-SNAPSHOT.jar
 jenv local 1.6
 java -jar target/retrolambda-experiment-1.0-SNAPSHOT.jar
```

```shell
 > jar tvf target/retrolambda-experiment-1.0-SNAPSHOT.jar

   0 Fri Nov 16 22:22:10 GMT-08:00 2018 META-INF/
 164 Fri Nov 16 22:22:08 GMT-08:00 2018 META-INF/MANIFEST.MF
   0 Fri Nov 16 22:22:08 GMT-08:00 2018 net/
   0 Fri Nov 16 22:22:10 GMT-08:00 2018 net/ttddyy/
 502 Fri Nov 16 22:22:10 GMT-08:00 2018 net/ttddyy/App$$Lambda$6.class
 514 Fri Nov 16 22:22:10 GMT-08:00 2018 net/ttddyy/App$$Lambda$4.class
 993 Fri Nov 16 22:22:10 GMT-08:00 2018 net/ttddyy/Foo.class
 506 Fri Nov 16 22:22:10 GMT-08:00 2018 net/ttddyy/App$$Lambda$5.class
1180 Fri Nov 16 22:22:10 GMT-08:00 2018 net/ttddyy/App.class
 228 Fri Nov 16 22:22:10 GMT-08:00 2018 net/ttddyy/MySupplier.class
 514 Fri Nov 16 22:22:10 GMT-08:00 2018 net/ttddyy/App$$Lambda$1.class
   0 Fri Nov 16 22:22:10 GMT-08:00 2018 META-INF/maven/
   0 Fri Nov 16 22:22:10 GMT-08:00 2018 META-INF/maven/net.ttddyy/
   0 Fri Nov 16 22:22:10 GMT-08:00 2018 META-INF/maven/net.ttddyy/retrolambda-experiment/
2791 Fri Nov 16 14:17:00 GMT-08:00 2018 META-INF/maven/net.ttddyy/retrolambda-experiment/pom.xml
 124 Fri Nov 16 22:22:10 GMT-08:00 2018 META-INF/maven/net.ttddyy/retrolambda-experiment/pom.properties
```