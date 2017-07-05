# About Project
This is just a sample project for testing allure report integration.

#Framework
* TestNG
* Selenium
* Maven
* Git
* Allure Reports

# Configuring allure report in maven
## Repository
```xml
<repository>
            <id>jcenter</id>
            <name>bintray</name>
            <url>http://jcenter.bintray.com</url>
</repository>
```

## Dependency

```xml
        <dependency>
            <groupId>org.aspectj</groupId>
            <artifactId>aspectjweaver</artifactId>
            <version>${aspectj.version}</version>
        </dependency>
        <dependency>
            <groupId>ru.yandex.qatools.allure</groupId>
            <artifactId>allure-testng-adaptor</artifactId>
            <version>1.5.4</version>
        </dependency>
```

## Surefire plugin
```xml
        <plugin>
            <groupId> org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>2.20</version>
            <configuration>
                <argLine>-javaagent:${settings.localRepository}/org/aspectj/aspectjweaver/${aspectj.version}/aspectjweaver-${aspectj.version}.jar
                </argLine>
                <properties>
                    <property>
                        <name>listener</name>
                        <value>ru.yandex.qatools.allure.testng.AllureTestListener</value>
                    </property>
                </properties>
                <suiteXmlFiles>testng.xml</suiteXmlFiles>
                <testFailureIgnore>false</testFailureIgnore>
            </configuration>
        </plugin>
```