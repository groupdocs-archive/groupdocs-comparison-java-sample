#GroupDocs.Comparison for Java Samples
![Alt text](https://media.licdn.com/media/p/7/005/059/258/39b2da3.png "GroupDocs")

<br/>
This sample solution demonstrate the usage of [GroupDocs.Comparison for Java library]( http://groupdocs.com/java/document-comparison-library). 

### Run all tests
Just run maven command

`mvn clean compile exec:java -e -Dhttps.protocols=TLSv1.2`

### Run one test
Just pass test name as parameter to main method.
In maven command add `-Dexec.args=TEST_NAME` replacing `TEST_NAME`
 with real name of test you'd like to run. Note: avoid having two tests with the same name. 

Full command:

`mvn clean compile exec:java -e -Dhttps.protocols=TLSv1.2 -Dexec.args=TEST_NAME`

### Memory parameters
`-Xmx2048m -Xms256m -XX:PermSize=256m -XX:MaxPermSize=512m`