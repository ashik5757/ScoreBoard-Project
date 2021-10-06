# Live Cricket Scoreboard Project

This is a JavaFX application with mySql database.

<br>
  
## Developments :

<br>

## Features

-	User can start a new match every time after finish a match.
-	User can choose the number of overs.
-	User can set the two team names and players name as well.
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

## Setup :


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


- ### Update Out by player : 

<p align="center" width="100%">
    <img src="https://user-images.githubusercontent.com/81816852/136248929-5da07d31-3d40-417e-b2e1-61ff3e3ce114.png">
</p>

> Update the player name who got the catch or stramped or throws the ball for run out.

<br>












