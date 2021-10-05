/**
 *     | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 *     | JDK                                                                 |
 *     |                                                                     |
 *     |                                                                     |
 *     |  | | | | | | | | | | | | | | | | | | | | | | | | | | | | |          |
 *     |  | JRE                                                   |          |
 *     |  |                                                       |          |
 *     |  |  | | | | | | | | | | | | | | | | | | | | | | |        |          |
 *     |  |  |  JVM                                      |        |          |
 *     |  |  |                                           |        |          |
 *     |  |  |                                           |        |          |
 *     |  |  |                                           |        |          |
 *     |  |  | | | | | | | | | | | | | | | | | | | | | | |        |          |
 *     |  |                                                       |          |
 *     |  | | | | | | | | | | | | | | | | | | | | | | | | | | | | |          |
 *     |                                                                     |
 *     | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 *
 *     JDK = JRE + DEV tools (Javac Compiler etc.)
 *     JRE = JVM + Java SE standard library
 *     
 *
 *    | | |          Java Language                                                                             Java Language
 *    |              Tools & Tool APIs              java           javac           javadoc             jar             javap           jdeps          Scripting
 *    |                                             Security       Monitoring      JConsole            JMC             JFR
 *    |                                             JPDA           JVM TI          IDL                 RMI             JAVA DB         Deployment
 *    |                                             Internationalization           Web Service             Troubleshooting
 *    |    | | |     Deployment                     Java Web Start             Applet / Java Plug-in
 *    |    |         User Interface Toolkits        JavaFX
 *    |    |                                        Swing          Java 2D             AWT             Accessibility                                             | | | | | | | | | |
 *    |    |                                        Drag and Drop              Input Methods           Image I/O           Print Service           Sound                           |
 *    | JDK|         Integration Libraries          IDL            JDBC            JNDI            RMI             RMI-IIOP            Scripting                 | | | | |         |
 *    |    |                                        Beans          Security                Serialization           Extension Mechanism                                   |         |
 *    |    |JRE      Other Base Libraries           JMX            XML JAXP                Networking              Override Mechanism                                    |         |
 *    |    |                                        JNI            Date and Time           Input/Output            Internationalization                          Compact |  Java SE|
 *    |    |         lang and util Base Libraries   lang and util                                                                                                Profiles|    API  |
 *    |    |                                        Math                   Collections             Ref Objects                 Regular Expressions                       |         |
 *    |    |                                        Logging                Management              Instrumentation             Concurrency Utilities                     |         |
 *    |    |                                        Reflection             Versioning              Preferences API             JAR             Zip               | | | | | | | | | |
 *    | |  | | |     Java Virtual Machine          Java HotSpot Client and Server VM
 *
 *    Keyword in Java
 *
 *    | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |                        | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 *    |data type                                                                                  |                        |control flow                                                                               |
 *    |-------------------------------------------------------------------------------------------|                        |-------------------------------------------------------------------------------------------|
 *    |class             interface               enum                byte                short    |                        |if                   else                switch              case                default   |
 *    |int               long                    float               double              char     |                        |while                do                  for                 break               continue  |
 *    |boolean           void                                                                     |                        |return                                                                                     |
 *    | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |                        | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 *
 *    | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |                        | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 *    |access modifier                                                                            |                        |for class/method/variable                                                                  |
 *    |-------------------------------------------------------------------------------------------|                        |-------------------------------------------------------------------------------------------|
 *    |private              protected               public                default                 |                        |abstract                 final                   static                  synchronized      |
 *    | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |                        | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 *
 *    | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |                        | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 *    |inheritance                                                                                |                        |instantiation                                                                              |
 *    |-------------------------------------------------------------------------------------------|                        |-------------------------------------------------------------------------------------------|
 *    |extends              implements                                                            |                        |new              this                super               instanceof                        |
 *    | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |                        | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 *
 *    | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |                        | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 *    |exception                                                                                  |                        |package                                                                                    |
 *    |-------------------------------------------------------------------------------------------|                        |-------------------------------------------------------------------------------------------|
 *    |try              catch               finally             throw               throws        |                        |package             import                                                                 |
 *    | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |                        | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 *
 *    | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |                        | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 *    |Others                                                                                     |                    *** |data type as keyword                                                                        |
 *    |-------------------------------------------------------------------------------------------|                        |-------------------------------------------------------------------------------------------|
 *    |native               strictfp                transient               volatile              |                        |true            false               null                                                   |
 *    |assert                                                                                     |                        | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 *    | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 *
 *    Method Name           Time Complexity         Worst Case          Best Case           Space Complexity            Stable
 *    Insertion sort        O(n^2)                  O(n^2)              O(n)                O(1)                        yes
 *    Shell sort            O(n^1.3)                O(n^2)              O(n)                O(1)                        no
 *    Selection sort        O(n^2)                  O(n^2)              O(n^2)              O(1)                        no
 *    Heap sort             O(nlogn)                O(n^2)              O(nlogn)            O(1)                        no
 *    Bubble sort           O(n^2)                  O(n^2)              O(n)                O(1)                        yes
 *    Quick sort            O(nlogn)                O(n^2)              O(nlogn)            O(nlogn)                    no
 *    Merge sort            O(nlogn)                O(n^2)              O(nlogn)            O(n)                        yes
 *    Counting sort         O(n+k)                  O(n^2)              O(n+k)              O(n+k)                      yes
 *    Bucket sort           O(n+k)                  O(n^2)              O(n)                O(n+k)                      yes
 *    Radix sort            O(n*k)                  O(n^2)              O(n*k)              O(n*k)                      yes
 *
 *     | | | | | | | | | | |                  | | | | | | | | | | |                                                                                                                                             | | | | | | | | | | |
 *     |  .CLASS File      |                  |   Class Loader    |                                                                                                                                             |  .class File      |
 *     |                   | ---------------->|                   |                                                                                                                                             |                   |
 *     |                   |                  |                   |                                                                                                                                             |                   |
 *     | | | | | | | | | | |                  | | | | | | | | | | |                                                                                                                                             | | | | | | | | | | |
 *                                                |         ^                                                                                                                                                             |
 *                                                |         |                                                                                                                                                             |
 *                                                |         |                                                                                                                                                             |
 *                                                V         |                                                                                            | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | || | | | | | | | | | |
 *    | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |                                                            |                                                                |                   |
 *    |                                                                                     |                                                            |                                                                V                   |
 *    |                               Memory Area (RAM)                                     |                                                            |                                                       | | | | | | | | | | |        |
 *    |                                                                                     |                                                            |     | | | | | | | | | | |                             |   Class Loader    |        |
 *    |      | | | | | | | | | | |     | | | | | | | | | | |     | | | | | | | | | | |      |                                                            |     |  Object Instance  |                             |                   |        |
 *    |      |  Method Area      |     |  VM Stack         |     | Native Method     |      |                                                            |     |                   |                             |                   |        |
 *    |      |                   |     |                   |     |    stack          |      |                       | | | | | | | | | | |                |     | ||||||||||||||    |                             | | | | | | | | | | |        |
 *    |      |                   |     |                   |     |                   |      |                       | Garbage Collector |                |     | |   car 1    |    |                                   |                      |
 *    |      |                   |     |                   |     |                   |      |                       |                   |                |     | ||||||||||||||    |             load and initialize   |                      |
 *    |      |                   |     |                   |     |                   |      | ------------------->  |                   |                |     |                   |                                   |                      |
 *    |      | | | | | | | | | | |     | | | | | | | | | | |     | | | | | | | | | | |      |                       |                   |                |     | ||||||||||||||    |                                   |                      |
 *    |                                                                                     |                       |                   |                |     | |   car 2    |    |                                   V                      |
 *    |      | | | | | | | | | | |      | | | | | | | | | | |                               |                       | | | | | | | | | | |                |     | ||||||||||||||    |                    | | | | | | | | | | |                 |
 *    |      |  Heap             |      |  Program Counter  |                               |                                                            |     |                   | <----------------- |   Car Class       |                 |
 *    |      |                   |      |     Register      |                               |                                                            |     | ||||||||||||||    |   Instantiate      |                   |                 |
 *    |      |                   |      |                   |                               |                                                            |     | |   car 3    |    |                    |                   |                 |
 *    |      |                   |      |                   |                               |                                                            |     | ||||||||||||||    |                    | | | | | | | | | | |                 |
 *    |      |                   |      |                   |                               |                                                            |     | | | | | | | | | | |                                                          |
 *    |      | | | | | | | | | | |      | | | | | | | | | | |                               |                                                            |                                                                                    |
 *    |                         RunTime Data Memory Area                                    |                                                            | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |  |
 *    | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |                                            
 *              |         ^                       |         ^                                                                            
 *              |         |                       |         |                                                                            
 *              |         |                       |         |                                                                            
 *              V         |                       V         |                                                                                                           | | | | | | | | | | |
 *        | | | | | | | | | | |             | | | | | | | | | | |                    | | | | | | | | | | |                                                              |     BootStrap     |
 *        | Execution Engine  |             |     native        |                    | Local Library     |                                                              |   Class Loader    |  C++
 *        |                   |             |    Interface      |                    |                   |                                                              |                   |
 *        |                   |             |                   | -----------------> |                   |                                                              | | | | | | | | | | |
 *        |                   |             |                   |                    |                   |                                                                         ^
 *        |                   |             |                   |                    |                   |                                                                         |
 *        | | | | | | | | | | |             | | | | | | | | | | |                    | | | | | | | | | | |                                                                         |                                                                                                             
 *                                                                                                                                                                       | | | | | | | | | | |
 *                                                                                                                                                                       |      Extension    |
 *                                                                                                                                                                       |    Class Loader   | Java
 *                                                                                                                                                                       |                   |
 *                                                                                                                                                                       | | | | | | | | | | |
 *                                                                                                                                                                                 ^
 *                                                                                                                                                                                 |
 *                                                                                                                                                                                 |
 *                                                                                                                                                                        | | | | | | | | | | |
 *                                                                                                                                                                        |    Application    |
 *                                                                                                                                                                        |    Class Loader   |
 *                                                                                                                                                                        |                   |
 *                                                                                                                                                                        | | | | | | | | | | |
 *                                                                                                                                                                           ^            ^
 *                                                                                                                                                                          |              \
 *                                                                                                                                                                         |                \
 *                                                                                                                                                                        |                  \
 *                                                                                                                                                                       |                    \
 *                                                                                                                                                                      |                      \
 *                                                                                                                                                         | | | | | | | | | | |      | | | | | | | | | | |
 *                                                                                                                                                         |    User-Defined   |      |    User-Defined   |
 *                                                                                                                                                         |    Class Loader   |      |    Class Loader   |
 *                                                                                                                                                         |                   |      |                   |
 *                                                                                                                                                         | | | | | | | | | | |      | | | | | | | | | | |
 *                                                                                                                                                                   ^
 *                                                                                                                                                                   |
 *                                                                                                                                                                   |
 *                                                                                                                                                        | | | | | | | | | | |
 *                                                                                                                                                        |    User-Defined   |
 *                                                                                                                                                        |    Class Loader   |
 *                                                                                                                                                        |                   |
 *                                                                                                                                                        | | | | | | | | | | |
 *
 *
 *
 *
 */







public class JavaDemo {
}

// github test Charlie Wrote
// second line
