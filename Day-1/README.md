# Day 1

## Installing our tools
### Java Software Development Kit (JDK)
1. Go the [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk9-downloads-3848520.html)
2. Click the circle for "Accept License Agreement"
3. Click the download for either macOS or Windows corresponding to your computer. 4. Since we are using macbook so we pick Mac OS X x64.
In your downloads folder, open the installer and progress through it as normal. 

[Download_SDK_1](images/Download_SDK_1.png)
[Download_SDK_2](images/Download_SDK_2.png)
    
### Is Java installed successfully?
If your computer already has Java, you can determine which version of the JDK is the default by typing java -version in a Terminal window.
#### Open launchpad
[Launchpad](images/Launchpad.png)

#### Search Terminal 
[Search_Terminal](images/Search_Terminal.png)

#### Type `java -version` into terminal and hit Enter
[Java_Version](images/Java_Version.png)
**Tada you got Java running in your computer!**

### Editor 
Eclipse is really popularity cool editor for Java application development
#### To install Eclipse:
1. Goto http://www.eclipse.org/downloads/. 

2. Under "Get Eclipse Photon" ⇒ Click "Download Packages". 
[Download_Eclipse_1](images/Download_Eclipse_1.png)

3. Find "Eclipse IDE for Java Developers" and get “Mac Cocoa 64-bit”
You will receive a DMG file
[Download_Eclipse_2](images/Download_Eclipse_2.png)
4. Double-click the downloaded Disk Image (DMG) file. Follow the screen instructions to install Eclipse. Eclipse will be installed under "/Applications/eclipse". (To confirm!)


## Writing our First Program
### Set up Eclipse
1. Open Eclipse. 
Eclipse will ask you for your workspace (where on your computer the projects you are working on will be stored.) Click on the Browse... button to navigate to the directory of your choice.
[Eclipse_Setting_1](images/Eclipse_Setting_1.png)

2. Create your first project.
* File -> New -> Java project
[Eclipse_Setting_2](images/Eclipse_Setting_2.png)

3. Give it a cool name
[Eclipse_Setting_3](images/Eclipse_Setting_3.png)

4. Skip creating module
[Eclipse_Setting_4](images/Eclipse_Setting_4.png)

5. We will see this
[Eclipse_Setting_5](images/Eclipse_Setting_5.png)

6. Create a class to write your first program
Right click on ‘src’ -> New -> Class
[Eclipse_Setting_6](images/Eclipse_Setting_6.png)

7. Create your first java file
[Eclipse_Setting_7](images/Eclipse_Setting_7.png)

### Your first program

#### Hello world? 
In programming tradition, it's best to write a simple program that prints "hello world" to the screen, it is everyone’s first program. This is to prove that our system is setup correctly and that we can safely run programs. Put this into Eclipse:
```Java
    public class helloWorld {
        public static void main(String[] args) {
            // Prints "Hello, World" to the terminal window.
            System.out.println("Hello, World");
        }
    }
```

#### How to run it?
[First_Program_1](images/First_Program_1.png)
[First_Program_2](images/First_Program_2.png)

#### Where to see it runs?
[First_Program_3](images/First_Program_3.png)

#### What does this code mean?
This is called the println (print line) function. It prints text to the console. Note that I say it says "prints" text to the console. This is not "output". "output" means something very different that we'll cover later.
    
#### Wanna play with “println”?
1. Create new java file “PlayWithPrintln”
[First_Program_4](images/First_Program_4.png)

2. Input this code
```Java
    public class PlayWithPrintln {
        public static void main(String[] args) {
            System.out.println("");
        }
    } 
```
3. Replace “” with everything you want to print to the console

* If I want to print out “I am Annie”
```Java
    public class PlayWithPrintln {
            public static void main(String[] args) {
                System.out.println("I am Annie");
            }
    }
```
[First_Program_5](images/First_Program_5.png)

* If I want to see a rabbit

```Java
    public class PlayWithPrintln {
        public static void main(String[] args) {
            System.out.println("           \\.\\ /,/\n" +
                    "            Y Y f\n" +
                    "            |. .|\n" +
                    "           (\"_, l\n" +
                    "            ,- , \\\n" +
                    "           (_)(_) Y,.\n" +
                    "            _j _j |,'\n" +
                    "           (_,(__,'");
        }
    }
```
[First_Program_6](images/First_Program_6.png)


**There are many cool art texts, you can easily find them [here](https://asciiart.website//index.php?art=animals/rabbits)**


