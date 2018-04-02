# selenium-with-chrome - Linux Enviroment

Jenkin Set-Up:-
https://www.digitalocean.com/community/tutorials/how-to-install-jenkins-on-ubuntu-16-04

``` Chrome Driver Depends On Browser Version: ```

https://sites.google.com/a/chromium.org/chromedriver/downloads

``` Below information for Reference:- ```

``` Checking jenkin Start and Status Command ```

   ```sudo systemctl start jenkins ```
   ```sudo systemctl status jenkins ```
 
 
To change the jenkins user, open the /etc/sysconfig/jenkins (in debian this file is created in /etc/default) and change the JENKINS_USER to whatever you want. Make sure that user exists in the system (you can check the user in the /etc/passwd file ).
  $JENKINS_USER="akshay"
  
Then change the ownership of the Jenkins home, Jenkins webroot and logs.
```
  chown -R akshay:akshay /var/lib/jenkins 
  chown -R akshay:akshay /var/cache/jenkins
  chown -R akshay:akshay /var/log/jenkins
  ```
  ```
  Then restarted the Jenkins jenkins and check the user has changed using a ps command
  /etc/init.d/jenkins restart
  ps -ef | grep jenkins
  
  ````
 #  Refrance link 
 
``` https://fabianlee.org/2017/01/17/selenium-running-headless-automated-tests-on-ubuntu/ ```
``` https://stackoverflow.com/questions/6754974/usage-of-maven-enforcer-plugin ```

Change OwnerShip depend On User Default As a Login-user
using this Command you will change ownership

  chown -R akshay:akshay your_sourcecode_location ```
  
 #  In jenkins Setup:-
  
  ``` config -> Global properties ->Environment variables :```
   ```  Name :DISPLAY  value: :0 ```

