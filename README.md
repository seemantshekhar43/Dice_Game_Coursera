# Dice_Game_Coursera
Note: This is an assignment of "Build Your First Android App (Project-Centered Course)" course on Coursera

## Dice Game
Dice App is basically a fun app developed by me to consolidated all the past topics covered till now in this course.
- You can generate a random number on screen by tapping GENERATE button. 
- You can display that number as a toast by tapping TOAST button.
- You can pass the number to next screen and display that number there by tapping NEXT SCREEN button
- From next screen you can navigate back to main screen by tapping PREVIOUS SCREEN button.

## In this app, there are two activities:

1. MainActivity:
  - 1 Image view to display dice image
  - 3 buttons: 
    - Generate button: to generate random nos between 1-6 and change the image of imageview accordingly.
    - Toast button: to display a toast which contains the current displayed number on dice.                                                           
    - NextScreen button: to navigate to new activity
2. NextActivity:
  - 1 TextView : to display number present on dice image in previous screen
  - 1 button: to navigate back to previous activity

## Components used are:
- button which triggers an action when clicked
- display a pop-up message ("toast")
- use at least 2 layouts (vertical or horizontal LinearLayout, or RelativeLayout)
- display an image
- composed of at least 2 linked activities
- pass information from one activity to the next


## Screenshots:

![Screen 1](screenshots/screen1.png?raw=true)
![Screen 2](screenshots/screen2.png?raw=true)
![Screen 3](screenshots/screen3.png?raw=true)

## Apk link (debug-apk)
https://github.com/seemantshekhar43/Dice_Game_Coursera/blob/master/apk/app-debug.apk?raw=true
