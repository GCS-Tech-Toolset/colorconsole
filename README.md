# ColorConsole
This project creates an appender with alternate color schemes for logback

# Changing colors
set the desired colors with the following:

```java
LogbackColorConsole.TRACE = ANSIConstants.YELLOW_FG;
LogbackColorConsole.DEBUG = ANSIConstants.WHITE_FG;
etc...
```


# POM
add the following to your pom.xml


### repo added
```xml
<repositories>
  <repository>
    <snapshots>
      <enabled>false</enabled>
    </snapshots>
    <id>central</id>
    <name>q5id-libs-release</name>
    <url>https://gcsrepo.jfrog.io/artifactory/q5id-libs-release</url>
  </repository>
  <repository>
    <snapshots />
    <id>snapshots</id>
    <name>q5id-libs-snapshot</name>
    <url>https://gcsrepo.jfrog.io/artifactory/q5id-libs-snapshot</url>
  </repository>
</repositories>
```



### dependencies
```xml
<dependency>
    <groupId>com.gcs</groupId>
    <artifactId>logging.colorconsole</artifactId>
    <version>1.8.0</version>
    <type>pom</type>
</dependency>
```

# Adding to logback
add the folliwing snippet to the `root` location of `logback.xml`


```xml
<conversionRule conversionWord="color" converterClass="com.gcs.utils.logging.LogbackColorConsole" />
```


Next, add the color conversionRule to the desired location... for example:


```xml
  <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
    <withJansi>true</withJansi>
    <encoder>
      <pattern>%d{HH:mm:ss:SSS} %color([%-5level]) [%X{X-Correlation-ID}] - %msg%n</pattern>
    </encoder>
  </appender>
```

Notice the `%color` in the level of the XML snippet above.



