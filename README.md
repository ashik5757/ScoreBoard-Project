# Live Cricket Scoreboard Project

This is a JavaFX application with mySql database.


<br>

## Features

-	User can start a new match every time after finish a match.
-	User can choose the number of overs.
-	User can set the two team names and players name as well.
-	AutoTextFill - team and player names will be suggested in textfield option.
-	User can set the team which is going to bat first and also set the striker and non-striker.
-	Live visualize of the scoreboard with control panel
-	Update any type of run (by bat or Extra) by clicking button or by choose from the option
-	User can switch the sticker batsman.
-	Update wide ball or no ball.
-	User can set the bowler.
-	User can set the outed batsman.
-	Update out type and out info by choice option.
-	Update new batsman.
-	Save all the match info in the database.
-	User can view the saved match data in the database inside the application.
-	User can search the player’s name in match info.


<br>

## Tools Used :

- Java [JDK 16.0.1]
- IntelliJ IDEA
- SceneBuilder
- XAMPP

<br>

## Setup (JAR) :

- ### _Tools required_ :
  - Java [JDK 8+]
  - MySql database (XAMPP Recommended)

<br>

> Just download the latest jar file from release tag and run it by JVM. (Make sure mySql database is running in the background)

<br>

## Setup (IDE) :

- ### _Tools required :_
  - Java [JDK 16.0.1] or Latest 
  - IntelliJ IDEA
  - MySql database (XAMPP Recommended)

<br>

- ### _Download :_
  - JavaFX (sdk-16 or Latest)
  - JDBC (mysql-connector-java-8.0.26 or Latest)
  - ControlFX (controlsfx-11.1.0 or Latest)

> All the files are available in **_Config_** folder.

<br>

- ### _Process_ :

  - Open new project in IntelliJ IDEA.
  - Attach lib folder directory of javafx-sdk to Libraries in project structure.
  - Attach **JDBC** and **ControlFX** jar file in module dependency in project structure.
  - Put all the code files/folder in src folder. [ ClassFile, DatabaseFile, FXML_FIle, TableViewFiles, FakeLauncher.java, LaunchApp.java ]
  - Put all the files of **_data_** folder outside of the src folder. (In main project directory)
  - Now run the **FakeLauncher.java** or **LaunchApp.java**.

If the program does not run and shows an error like following line, then update the VM option in run configuration.

    Error: JavaFX runtime components are missing, and are required to run this application

<br>

Go to the Run -> Edit Configurations... of **FakeLauncher.java** or **LaunchApp.java** and paste the following line in _Add VM option_ from _Modify option_.

~~~
--module-path
"F:\Download\Soft\Java\JavaFx\javafx-sdk-16\lib"
--add-modules
javafx.controls,javafx.fxml
--add-exports
javafx.base/com.sun.javafx.event=ALL-UNNAMED
~~~

> NOTE : Must change the directory path for javafx-sdk-16\lib.

<br>

It is better to add VM option in run config to omit unnecessary error :

    WARNING: Unsupported JavaFX configuration: classes were loaded from 'unnamed module @4b7d8551'


<br>
  
## Developments :

- ### Md. Iftekhar Hossain Khan  [<img width="25px" src="https://cdn.jsdelivr.net/npm/simple-icons@3.13.0/icons/github.svg">][github-1] [<img width="25px" src="https://cdn.jsdelivr.net/npm/simple-icons@3.13.0/icons/facebook.svg" />][facebook-1]
- ### Nur Adnan Chowdhury Anik [<img width="25px" src="https://cdn.jsdelivr.net/npm/simple-icons@3.13.0/icons/github.svg">][github-2] [<img width="25px" src="https://cdn.jsdelivr.net/npm/simple-icons@3.13.0/icons/facebook.svg" />][facebook-2]
- ### Md. Ashikur Rahoman [<img width="25px" src="https://cdn.jsdelivr.net/npm/simple-icons@3.13.0/icons/github.svg">][github-3] [<img width="25px" src="https://cdn.jsdelivr.net/npm/simple-icons@3.13.0/icons/facebook.svg" />][facebook-3]


<br>


## Screenshot of Functionalities :

<br>

- ### _Homepage_ :

  - **New Match :** User can start a new match every time after finish a match.
  - **Saved Match :** After complete a match, all match data will be visible in saved match option from database.
  - **EXIT :** Programme will terminate. 

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136234799-f2aca916-9058-4c46-a06b-80b95ff1eb2d.png">
</p>

<br>

- ### _Over-option Selection_ : 
  - 5-Over
  - 10-Over
  - T-20
  - ODI
  

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136235757-ca868e03-0228-4374-9d3e-25b99637bfc9.png">
</p>

<br>

> **HomePage Button :** User can go to the homepage from that scene wherever this button is available.

<br>

- ### _Team and all player name_ : 
  -	User can input all the team and players names which will be use in further step.
  -	User don’t have to input anything in further step.

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136237136-c7a4c429-a65a-4a1d-9269-94bc0e0bcbdc.png">
    <img src="https://user-images.githubusercontent.com/81816852/136237152-bc34e251-cb3d-4957-adcd-0a33bba8e130.png">
</p>

<br>


- ###	_Set Batsman Option_ :
  -	**Batting Team :** User can select the team which team will be bat first.
  -	**Striker** : User can select the striker batsman.
  -	**Non-Striker** : User can select the non-striker batsman.

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136237945-9e3b523f-ca0e-4900-ae08-bc83b48cce78.png">
    <img src="https://user-images.githubusercontent.com/81816852/136237964-a4d36c3c-b5c2-45d6-b796-96d671c391c2.png">
</p>

<br>

- ###	_Live visualize of the scoreboard with control panel_ :
  - Total
  - Extra
  - CRR (Current Run Rate)
  - Over

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136238921-a0c3fd87-e0c3-4b69-83e1-7deee6e70cef.png">
</p>


<br>

> **Control Panel** : User can control everything about the match.
  
<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136239286-423d14f8-a12a-4f7a-bbe0-832aa01dccbb.png">
</p>

<br>

- ### _Update Run_ : 

  -	**1,2,3 Button** : These buttons are for single, two and three runs.
  -	**4 & 6 Button** : These buttons will update the number of four and six of striker batsman as well updating the run info.
  -	**No Run Button** : This button will only increase the number of total ball played.
  -	**Select Run Option** : If the fielders throws the ball while the taking the single and it pass the boundary as bye four, then batsman will get 5 runs and bowler will the same run as well. <br> Similarly, as 6 and 7 run batsman and bowler will get the same run.
  -	**Extra Run** : This button will update only extra run. It will not update the number of total ball played.

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136241673-7a54cf39-5995-4168-bee3-47ecf8edfa9d.png">
    <img src="https://user-images.githubusercontent.com/81816852/136241689-017a8ad8-a83b-4a48-aee3-afe9a96d24b9.png">
</p>


> By pressing these button batsman, bowlers and total run will update automatically along with increasing the total counted ball.

<br>

- ### _Switch-No-Wide_ :

  - **Switch Batsman :** This button will change the striker batsman.
  -	**Wide Ball :** This button will add one extra run and increase the number of wide ball of the bowler.
  - **No Ball :** This button will add one extra run and increase the number of no ball of the bowler.

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136242492-18717711-7a1e-49f5-ab98-31fbcd4dbc35.png">
</p>


<br>


- ###	_Update bowler_ : 

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136243053-a6949e1b-c5a0-4447-99aa-17030b95c658.png">
</p>

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136243084-53f92e66-d155-4ca3-8d26-b696581a5a68.png">
</p>

> User can change the current bowler anytime by selecting the bowler name and clicking the Set Bowler button. Programme will give an alert every time after finish an over. 

<br>

- ### _Update the outed batsman_ : 

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136248170-6b9592d0-10a3-4300-b3ed-e59912fe83ea.png">
</p>

> In this option there will be two batsman name, striker and non-striker. User can select one of them and by selecting out button, selected batsman will be out.

<br>

- ### _Update out type and out info_ : 

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136248898-c9bfca02-b786-4d9f-90e1-1fac1e1512ae.png">
</p>

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136248908-361f2527-c3aa-4040-8cc8-2897db40079d.png">
</p>

> **Out Type :** There will 5 types of out which are Bowled, LBW, Run Out, Catch Out and Stamp. Out by player option will be only enable if out type is Run out, catch out or stamp out.


- ### _Update Out by player_ : 

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136248929-5da07d31-3d40-417e-b2e1-61ff3e3ce114.png">
</p>

> Update the player name who got the catch or stamped or throws the ball for run out.

<br>



- ### _Update new batsman_ : 

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136276816-49ddc8f9-b73b-479a-94be-56314c98dce1.png">
</p>

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136276845-d7356a29-557c-4e80-8611-95d9fada2276.png">
</p>

> User can select the next batsman and add the batsman to the scoreboard.

<br>


- ### _2nd Innings Confirmation_ :  

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136277140-f965bd6d-750c-4ff8-9003-1b7909f76470.png">
</p>

> After complete first innings, user will lose the access of the control panel and programme will force the user to go to next scene.

<br>

- ### _2nd Innings scoreboard_ : 

  - Target
  - RRR (Required Run Rate)
  - Information about remaining run and ball


<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136277537-251581b5-307f-4e65-9293-c8458d0b6aed.png">
</p>

<br>


- ###	_Match End confirmation_: 

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136277812-55769bb7-65df-4c80-a3e1-ce03c6ab74f2.png">
</p>

> User will lose the access of control panel after completing 2nd innings and programme will force the user to go to homepage.

<br>

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136277974-78ace886-3d91-4c40-9a56-251b3a207727.png">
</p>

> Also, the match info will be stored in database as two team names with date.

<br>


- ### _Saved Match_ :

<p align="center" width="100%">
    <img width="47%" src="https://user-images.githubusercontent.com/81816852/136278355-15c8fec7-9688-4c2c-b8ca-50aa0a65e394.png">
    <img width="47%" src="https://user-images.githubusercontent.com/81816852/136278369-239bd9c6-c13d-415a-a71f-455606519e4c.png">
</p>

> In this option, user can select any saved match to see the all match data stored in the database.

<br>

- ### _Match Data from the Database_ : 

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136279403-2c7f91c8-8ad2-40ef-9293-62897a6b5191.png">
</p>

> After completing a match, 1st and 2nd innings match info will be stored in the database and in the saved match option, user can see all the match info of 1st and 2nd innings together.

<br>


- ### _Search option_ :

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136279590-6a5e1364-3099-479f-b961-35df6e3d5623.png">
</p>

> User can search any player by their name. Only searched player will be visible in the specific table if the searched name match with any player name. 

<br>

- ### WARNING :

<br>

> Same batsman selection warning :

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136280105-48d6a1bc-19da-44d2-a210-514b9c946722.png">
</p>

<br>

> Same bowler selection warning :

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136280526-b5eca8cf-999e-4907-8ea6-e16315bcec39.png">
</p>

<br>

> Click the submit button without select any option :

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136280545-b07bb965-aeb7-4eb6-b441-d8c5dda2b63f.png">
    <img src="https://user-images.githubusercontent.com/81816852/136280559-bb53b4ee-c565-4290-b754-7e97f2c82193.png">
</p>

<br>

> Empty text field Warning :

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136280615-46fcdeb0-80e1-431e-a9bd-233a94899fae.png">
</p>


[github-1]: https://github.com/ihkcreations
[facebook-1]: https://www.facebook.com/ihk.786

[github-2]: https://github.com/NUR01854311260
[facebook-2]: https://www.facebook.com/nuradnanchowdhury

[github-3]: https://github.com/ashik5757
[facebook-3]: https://www.facebook.com/ashik.rahman5757/
