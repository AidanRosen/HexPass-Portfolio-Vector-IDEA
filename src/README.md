
# Week of 11/17
# How to run VectorCalculatorUI:
    
![alt text](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/master/src/2020-11-22%2012-01-13.gif)
NOTE: ***please type in lengths in the two blue squares of the vector calculator between 50~ and 650~. Any larger is too big and renders past the monitor, and any smaller is generally unoticeable.
        Press the pink AC button in order to clear the calculator. You may open as many vector frames as you like by clicking the blue, square button in the lower right. 
        
1. Apologies for grainy quality. Upon pressing play, a blue menu window will open --> click VectorCalculator in the top right --> type in the two adjacent squares beneath the label --> press the large blue square to the lower right --> check the new window behind the current one (frames display behind current frames) --> see the vector created

# How to run AJGraphingCalculator:

First open the graphing calculator from the main menu.
You will see an empty text box, and two buttons. If you are trying to do 
a normal calculation, click "normal" then input your calculation and click caclulate

If you are putting in a function, here are the rules for the calculator to avoid errors:

1. try to use basic functions, the calculator can handle most simple operations,
but not parethesis or other functions such as square root, or trig functions.

2. Only use x as your variable, the calculator isn't set up to use both x and y, or other variables.

3.After imputting your function, click calculate and a screen with a graph will appear.
Please wait here, the graph can take a small amount of time(around a minute at most) to generate.

# How To Run Atharva/Alex Graphing Calculator:

When you run the code, a menu will pop up asking for which type of equation you want to graph. Choose the appropriate equation.

1. Enter all the terms you want. For example, if you want to graph 5sin θ - tan^2 θ, use Trig and enter 5 for the coefficient of term 1, 1 as the exponent and sin as the function. For term 2, enter -1 as the coefficient and 2 as the exponent.
If you want to graph (x^3)/(-5x^0.5 + 0.1x + 7), use Rational and enter 1 for coefficient and 3 as exponent of term 1. Then, click the button to switch to the denominator. There, you enter -5 for coefficient and 0.5 for exponent of term 1; 0.1 coefficient and 1 exponent for term 2 and 7 coefficient 0 exponent for term 3.
The user input will be saved whenever you press any button except for the trig functions.

2. Enter the magnitudes and smoothness: magnitude is like the zoom level of each axis; eg. an X-Magnitude of 10 will zoom out the x-axis by 10 times; ie. each horizontal grid space will represent a value of 10 rather than 1. Conversely, a magnitude less than 1 represents zooming in. So if your x-mag is 5 and your y-mag is 0.5, you graph will appear 10 times thinner than normal.
Smoothness is how connected the line is; a smoothness value of 1 means that points will only spawn every integer x-value; while smaller smoothnesses like 0.01 means that every 0.01 increase/decrease in x-value, a new y-value will be generated. This can cause multiple y-values for a single x-value or vice versa as the 2D array is limited to whole numbers (unless your magnitude is a decimal).

3. Click "graph" and if your user input was correct, a new JFrame window will pop up with the graph. The original window will also display some information such as approximate intercepts. If you entered non-numerical or invalid inputs, the graph will not be generated and an error message will be generated at the bottom of the window, prompting you to try again.

4. Every time you click "Graph", all existing user inputs stored in the arraylists are cleared.

# Features
| Project portion | neat features | 
| ---------------  | :------------:|
| Vector Calculator | When resizing the window of the drawn vector, [the colors change randomly](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/1aee9d1e48f390d460f701281b9224f5653af82e/src/vector_calc/VectorDraw.java#L43). Do this by grabbing the side of the JFrame window and resizing. Also, [the JFrame adjusts automatically to any size of the vector dynamically](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/1aee9d1e48f390d460f701281b9224f5653af82e/src/vector_calc/VectorCanvas.java#L22). Vectors, an extension of stack, [are used to render objects](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/01896045b03db84a90dd989e097d44927798d3ed/src/vector_calc/VectorCanvas.java#L12)
| AJGraphing Calculator | The graph draws itself by using recursion in paint
| A&A Graphing Calculator | The graph supports as complicated equations as you like and has a unique method of user input. It also calculates approximate intercepts with a wrap text function.

# Video
[Video](https://drive.google.com/file/d/1phIvOBFDWPhBOPkg7f3a6cDzGLOLfMEJ/view?usp=sharing)

# Critical thinking: 
| Project Portion        | Code description hyperlinked           | Online resource hyperlinked if applicable  |
| ------------- |:-------------:| -----:|
| Vector Calculator     | [Drawing triangles as polygons and doing geometric translations](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/0e31c41c766d907fe75bf340e8b4ad91d18f4cf0/src/vector_calc/HeadDraw.java#L36)  | [Refer to line with "g2d.rotate(Math.toRadians(45), 75, 75);"](http://www.java2s.com/Code/Java/2D-Graphics-GUI/RotationAboutCenter.htm) | 
| Vector Calculator    | [Use of fifth parameter necessary to define end y-value and make the horizontal component render horizontally](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/0e31c41c766d907fe75bf340e8b4ad91d18f4cf0/src/vector_calc/VectorCanvas.java#L31)  |  No resource used |
| Vector Calculator | [Use of objects rendered all at once in a for loop to have a complete grasp of graphics rendering](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/86f7b88f514b693559aeeecb13ae7402fab164a9/src/vector_calc/VectorCanvas.java#L52)|  [Great Stack Overflow Explanation](https://stackoverflow.com/questions/22123266/drawing-multiple-jcomponents-to-a-frame)|
| Vector Calculator | [MVC by passing in objects](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/d4969d3e931a5a505a3932660d1a1d7627dbaf74/src/vector_calc/VectorControl.java#L12) and [using getter and setter to connect between all those portions of MVC](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/d4969d3e931a5a505a3932660d1a1d7627dbaf74/src/vector_calc/VectorControl.java#L38) | [BlueJ photo of finalized connections](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/master/src/newMVC.PNG) | 
| Vector Calculator | [Convetting degrees to radians](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/master/src/vector_calc/HeadDraw.java#L33) so the computer has the correct rotation based on the angle given | Refrenced math examples online |
| Vector Calculator | [Cartesian coordinates for the triangle](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/master/src/vector_calc/HeadDraw.java#L38) and [Cartesian coordinates for lines](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/master/src/vector_calc/ResultantDraw.java#L31) | [Drawing Triangles](https://stackoverflow.com/questions/29447994/how-do-i-draw-a-triangle-in-java) |
| Vector Calculator | Making [dashed lines for the compoents](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/master/src/vector_calc/VectorDraw.java#L34) | [Dashed lines in Java](http://www.java2s.com/Tutorials/Java/Graphics/Graphics_Settings/Use_dashed_stroke_to_draw_dashed_line_in_Java.htm) |
| AJGraphing Calculator | Generating the graph
| AJGraphing Calculator | Seperating the function
| AJGraphing Calculator | handling the function
| AJGraphing Calculator | using MVC for creating UI parameters
| A&A Graphing Calculator | [using very specific algorithms to label axes based on magnitude and especially for trig labeling in radians](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/master/src/Graphing_Calculator/Model_Files/GraphTrig.java#L204)
| A&A Graphing Calculator | [Finding a way to calculate y-outputs for every x-input when there is a variable number of terms in the equation](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/master/src/Graphing_Calculator/Model_Files/GraphPoly.java#L184)
| A&A Graphing Calculator | [Converting Cartesian coordinates into 2D array where the origin is at 51, 51](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/master/src/Graphing_Calculator/Model_Files/GraphPoly.java#L189)
| A&A Graphing Calculator | [Wrapping text around the edges of the window manually without any predefined functions](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/master/src/Graphing_Calculator/Model_Files/GraphPoly.java#L209)
| A&A Graphing Calculator | [Checking if a String is numerical using exceptions](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/master/src/Graphing_Calculator/Model_Files/GraphPoly.java#L130) | [Online resource](https://www.baeldung.com/java-check-string-number) 

# Collaboration:

Scrum masters method of self evaluation: Despite how many of us were independent of each other, please try and link some evidence like a photo of code collaboration, a detailed slack message, late facetime calls, etc. along with the impact of the link i.e "with this [evidence] I was supported to XYZ". I will need details on MVP awards before deciding on the best way to handle those. - Aidan 

Self-grade: 
|name and self grade |peer 1 name and grade given| peer 2 name and grade given | peer 3 name and grade given | peer 4 name and grade given | 
| ------------- |:-------------:| :-------------: | :-------------: | :-------------: |
| Aidan [Diagrams in MS paint which helped clarify graphics math between all members](https://docs.google.com/document/d/1tpO2c3qkdsvuKmP1z2kaieqsh3c0ZXMnNC4YMyD1iuk/edit#bookmark=id.k0bmoxvc0qzb) and [overall slack communication clarification of general guidelines](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/master/src/slackEv.PNG) 25%| Andrew Hale: Aidan did a great job adding to the [journal](https://docs.google.com/document/d/1tpO2c3qkdsvuKmP1z2kaieqsh3c0ZXMnNC4YMyD1iuk/edit#) and also would consitantly put in work over weekend or after school making the [vector componets](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/master/src/vector_calc/VectorDraw.java) and many other parts to the calculator 5/5 | Atharva Kudrimoti: Aidan is extremely dedicated in what he does and many of the group members including myself can see this. He makes heavy contributions (in the vector calculator) and facilitates the group well 5/5.|Andrew Joseph: Aidan worked tirelessly on the Journal and made sure every meeting to get project updates, and make plans for the week [see weekly reflections](https://docs.google.com/document/d/1tpO2c3qkdsvuKmP1z2kaieqsh3c0ZXMnNC4YMyD1iuk/edit) 5/5| Alex Hu: Aidan is a very focused and commited scrum leader who would always make sure that everyone did what they needed to do and kept everyone on track with the journals and readmes 5/5.
| Andrew Hale made [video]() and worked after school for multiple hours over zoom with Aidan 4/5 | Aidan Rosen: Andrew did work really hard on this project and he worked really well in a team environ. He asked really good questions, attended tutorial, and [helped lead others](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/master/src/hale.PNG)5/5.|Andrew Joseph: Andrew Hale spent a lot of time researching UI and other subjects for help getting the project done [see research](https://docs.google.com/document/d/1tpO2c3qkdsvuKmP1z2kaieqsh3c0ZXMnNC4YMyD1iuk/edit), he also worked heavily on the project with Aidian to complete the [UI](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/f2477af403665293e3ddc5d42b388678e7293f07/src/vector_calc/VectorDraw.java#L9) for the vector 5/5| Alex Hu: Andrew spent a lot of time in class helping his teammates figure out how to do stuff like change colors and was very focused 5/5.| Atharva Kudrimoti: Andrew Hale was definitely the most involved person in this project. He has made countless contributions to the vector calculator through his critical thinking and responds to Slack messages almost instantly 5/5.
| Andrew Joseph collaborated some with Aidan and Andrew Hale to understand UI. Shared plans, and planned, with Alex and Atharva on how to create a graphing calculator. 4/5 | Andrew Hale: Andrew helped us many time with draw and lines in java during zoom calls. I cannot cite a specific artifact because most of it was from talking during class 5/5 | Aidan Rosen: Andrew Joseph really improved his communication skills over the course of this project and, despite mostly being independent, worked really well when he needed to with others 5/5 | Alex Hu: Andrew really showed his ability to work independently and created an impressive product. He was able to do self-guided research on paint functions and the like in Java 5/5.| Atharva Kudrimoti: Andrew seemed to collaborate very well with others within the group. He was able to independently make his calculator with some help from others. He has truly shown his critical thinking skills and that has benefited this project 5/5.|
| Alex worked in and out of class with Atharva to work out the logic with the graphing calculator and testing it for different edge cases. We spent a lot of time on the calculator as there were many functions to create and there were a lot of bugs with things such as Null Pointer Exceptions, bad logic in labeling axes and graphs generating as y=0. Overall I felt that I contributed a lot to the project 5/5.| Andrew Hale: Alex did an amazing job. He always responded quickly to slack messages and never ceased to deliver. Alex was responsible for most of the creation of our [N@TM Section](http://ntm.nighthawkcoders.cf/period1/). 5/5 | Aidan Rosen: Alex is very prompt with his responses and is skilled in working with others. Despite working on separate ends of our project, he kept his part on track with Atharva. As to an artifact, refer to Andrew Hale's link 5/5| Atharva Kudrimoti: Alex has been nothing short of a great leader in this project. Within our pair, he has guided me through writing code and explained the meaning behind it. He has made heavy contributions to N@TM: (http://ntm.nighthawkcoders.cf/period1/) 5/5. | Andrew Joseph: Alex worked with me to create a comprehensive plan of what the graphing calculator was going to look like. Though we ended up doing seperate graphing calculators, this combined plan was at least partially integrated into both of our designs. [Plan](https://docs.google.com/presentation/d/1WK289219G0Ghy-Gx8RGlxnLjarwmvXKdLWXgoxYw74c/edit#slide=id.ga37d9b1d11_2_35) 5/5
| Atharva communicated with Alex both inside and outside of the classroom over Zoom and relayed information over to other groups within Scrum team. Remained involved in project, wrote pieces of MVC code like GraphExpo (model file) and GraphExpoControl. Contributed to making final [video](https://drive.google.com/file/d/1phIvOBFDWPhBOPkg7f3a6cDzGLOLfMEJ/view?usp=sharing) for project, due to growth througout trimester from zero coding experience 5/5. | Andrew Hale: During zoom calls Atharva was always working to help. His project with Alex is super cool and his part in the [video](https://drive.google.com/file/d/1phIvOBFDWPhBOPkg7f3a6cDzGLOLfMEJ/view?usp=sharing) is well made. However, he is not the best at responding to slack messages. 4/5 | Aidan Rosen: Atharva does his work but involvement and contribution certainly leaves much to be desired. 4/5 | Alex Hu: Despite not being as familiar with Java and programming in general, Atharva aleays tried his best to finish the code and always tried to pull out time to Zoom together so that I could help him with the coding. He has put a lot of time into this project 5/5. | Andrew Joseph: Atharva worked well with communicating with the group to make sure that everyone was up to date on the projects and assignments 4/5.

# Creativity
Please look to the [random color generation for the vector rendering which also rerenders a new color each time the window is resized](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/3fa57c093665a689139de163a7c5a0f05a661dae/src/vector_calc/VectorDraw.java#L43)
[Special user input](https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/master/src/Graphing_Calculator/Control_Files/GraphTrigControl.java)


# TODO's from journal: 
[Weekly reflections and projections](https://docs.google.com/document/d/1tpO2c3qkdsvuKmP1z2kaieqsh3c0ZXMnNC4YMyD1iuk/edit#bookmark=id.cc009gc78h7o) and [stuff to add list](https://docs.google.com/document/d/1tpO2c3qkdsvuKmP1z2kaieqsh3c0ZXMnNC4YMyD1iuk/edit#bookmark=id.cfgj4ujjlrx0). Please open in new tab. Book mark opens towards bottom of the screen. Title is on left side of table. 


# OLD (Week of early November)
# How to run VectorCalculatorUI:

    1.Upon running the application, click at the top right of the menu on "VectorCalculator". A new window will open with the 

    2.After entering the calculator, you will see two blue squares. Click on them and type a number into each. 

    3.After typing into both boxes, press the blue bottom on the lower right. '
    
    4.After clicking the blue button in the lower right, A new window will open BEHIND the vectorCalculator. Please move vectorCalculator to see it.
    This window contains a drawn rectangle representing the magnitude of the vector calculated in the calculator.
    
    5.End the program by exiting all windows and pressing stop

NOTE: please be realistic with values because this vector calculator also creates a calculator measured in pixels,
so please use an appropriate number of pixels! (I.e don't type in "5", because that is too small to see, or "2000", because that is too large)

 

NOTES and future work: 
    Add an arrow head to the drawn vector
    Cause the drawn vector to rotate according to the angle input into the calculator
    Add old terminal project to portfolio

# How to run graphing calculator:

    1. Choose a graphing option from the main menu. Type in the corresponding number of the type of function you would like to graph. 
    
    2. A new window will pop up that requires user input. If you fail to input a valid value (eg. you put in text instead of a number), the program will restart.
    (ex. If you were graphing and polynomial, and you wanted to graph 2x^3, you would enter in 2 and 3 in their corresponding boxes.
    
    3. When you are finished inputting the equation, click "Graph" or follow the instructions to create the graph.
    
    4. A graph of the function will be displayed in a new window (points without a line). 
    
    5. You may still go back to the second window to edit your inputs to create a new graph, or back to the first window to choose a different type of graph.
        *Smoothness refers to the horizontal distance between each coordinate that is shown in the graph. Smaller values mean a more connected line.
        *Magintude refers to what each coordinate represents; eg. if you put in a magnitude of 10 for y-axis, the y-axis will be "zoomed out" by 10 times and each row in the 
        display will represent a value of 10.

 <br /> <br /> <br />

# %%%%%%Links to code + Goals met

NOTE: Grades are marked with a ***

# Aidan:
   
Here is the link to my menu code, and the whole file is linked because I built it all: https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/master/src/centralMenu.java 

    One of our goals this week was to build a JFrame menu (in our project plan, not the Slack message sent). This was completed and done with both menu buttons and menuItem buttons 
        
Here is the link to my JFrame draw code, whole file linked because I built it all: https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/master/src/vector_calc/VectorDraw.java
    
    Another goal was to actually render a shape based on the calculated magnitude. This was achieved with the above code. 
        
Here is the link to the line where the bug about having to press enter twice was fixed: https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/blob/a75d771e4fb7696ac2c3416842405e865760e910/src/vector_calc/VectorCalculatorUI.java#L224
    
    By changing the "SaveValueArg1" and "SaveValueArg2"calls from being after typing to just when the button to calculate the vector is pressed, the bug was fixed.
    Notice how it says only "saveValueOfArg1(textField_vert);" and "saveValueOfArg1(textField_horiz);" only within this listener. That's how the bug was fixed     

***Grade: 5/5. Worked hard with keeping everyone on track, goals set. Worked hard individually on menu code and drawing code 

# Alex: 

Here is the link to the graphing calculator section of the portfolio project that I worked on: https://github.com/AidanRosen/HexPass-Portfolio-Vector-IDEA/tree/master/src/Graphing_Calculator

Some of our goals this week included completeing the UI, figuring out how to create a new JFrame window post-frame creation, and create new graph options.

    I completed the UI for the main menu of the graphing calculator.
    
    I also figured out how to create more JFrames: create a new class extending JFrame, and call that class' contructor which will automatically call JFrame's constructor as well and create a new JFrame. This was implemented in the Graphing Calculator UI file which creates a new Frame to display the graph.
    
    Although we did not get around to creating a new graph option, I was able to convert the code to mvc format. I also worked on creating logic guidelines for Atharva as he has never done Java before this class and I think it should be more important for him to practice writing code right now rather than figuring out logic and program flow.
    
***Grade: 5/5. Contributed heavily to the graphing calculator code.

 <br /> <br />
# ##########Links to Journals################

Aidan, Andrew Hale, Andrew Joseph: https://docs.google.com/document/d/1tpO2c3qkdsvuKmP1z2kaieqsh3c0ZXMnNC4YMyD1iuk/edit?usp=sharing

Atharva, Alex: https://docs.google.com/document/d/10XEXkkcqk-_1BDuC3DMJvTe5CAeD7eNABT_isg3faxM/edit?usp=sharing


 <br /> <br /> <br /> <br />
+++++++++++++++++++++++++++++++++++++++++

# OLD, week of 10/19 

Notes for the future:
    Next week, we must create a main menu. Per the project plan, it will begin in the terminal then go into the menu. 

This code was worked on by Aidan Rosen and Andrew Hale, and can all be found under the vector_calc folder. 
        Andrew built the VectorcalculatorUI file
        Aidan built the VectorCreate file which contains all the trig functions used
        Aidan also helped refine the VectorCalculatorUI by adding the directionality button and making sure the 
        arguments could be typed in instead of just being button presses 
        
        Self-grades for 10/23 are below:
        Aidan:
                This week I engaged in my assignment by spending LOTS of time refining the VectorCalculatorUI
                and building the trig functions in VectorCreate. I put lots of effort into analyzing Andrew Hale's 
                base VectorCalculatorUI code and fixing it to allow typing the values of components in, especially
                since our knowledge of buttons and text fields is very limited and we could really benefit from 
                a lecture on listeners and button listeners. This took me hours and there are STILL bugs to mull over 
                but I laid the groundwork to ensure its success. I deserve a 5/5 for working hard in communication and keeping 
                the team on track while also working on the project itself.  
                
        Andrew Hale:
                This week I learne how to use InteliJ, GitHub, and JFrame. I had a lot of prooblems in setting up Intelij
                many of my files either wern't installed or in the wrong place. My scrum team really helped me out in fixing
                these issues. They helped me get the correct SDK installed and also fix the issue with building the program.
                I also learned how to push, pull, and commit with Git using InteliJ. The knowlage from last year's Computer
                Scieince class definently helped me and I was able to help out other memebers of my scrum group who wern't
                as familiar with GitHub. Lastly, I mainly worked on learning Java and JFrame. This week started out with
                me using your calculator in order to learn how to edit JFrame buttons but by the end of the week I added
                text fields. This included adding a new import and adding a new JFrame type. I believe I deserve a 5/5
                this week becaouse of the amount of time I spent fixing issues with the program and working on our new
                projects layout.
                
                
        
IMPORTANT NOTE: This doesn't work yet, the calculation is still
being finalized, and many more bugfixes and optimizations
will be needed before functional. I plan to do these this coming week.

UI will be set up after this, though I already have a plan in mind
so it should not take much time.

FUNCTIONALITY
-------------

How the graphing calculator works:
type in your input using basic math functions (plus, minus, multiply, divide, squareroot, squared, 
more in the future) and click "calculate" which will 
generate points for a graph, then will graph it.


JUSTIFICATION
-------------

During this week I focused on my graphing 
calculator and, while isn't functional yet, 
I feel that  I was able to get a decent portion of it
done. I mainly focused on making sure that the 
“points”, which I will eventually use to create the
graph, are calculated correctly. To do this I created 
two classes: Point and Separator. Point is a simple 
class as it acts as a setter that runs the calculate
method to calculate y through a recognizable format. 
It is the job of separator to make it recognizable, 
and it does so by iterating through the input and 
separating out the numbers and operators into arrays. 
These arrays are returned and used to calculate y, 
though like I previously said it isn’t perfect yet.
I plan to clean up the code, add an order of operations, 
and work on the UI next week. 

GRADING
-------

Overall I think I should get a 4/5 on this because 
the project isn't complete and I didn't meet my goals
for the week, however I was off from my goal by only
a few bugs. Since the majority of this goal is complete
and only needs to be cleaned up and bugfixed, errors
that I feel are more minor than major, 1 point seems
like an appropriate deduction for these slight mistakes.


Readme justifications (Week 7) for Alex and Atharva:

Alex-this week I worked on making a main menu for the graphing calculator part of the main project. I also worked on splitting Mr. M's calculator code into mvc for Calculator 2, and I guided Atharva to make a text-based Calculator UI for Calculator 2 (link to calculator 2: https://github.com/AlexH04/Calculator2-MVC--Alex-Atharva). Next ween I plan to organize the main project as mvc now that I have more experience with how it works.
  Individual block of code: src/Graphing_Calculator/GraphCubic was imported from the previous calculator project and src/Graphing_Calculator/GraphMain was coded my me this week.
  Self-grade: 4/5. I could have paid more attention to the calculator 2 minilab instead of pushing it to the end of the week; but I think I did a good job for the main portfolio assignment.
 
Atharva- This week I worked on making the text based UI for the calculator and Alex guided me on how to do so, since I have little experience with coding. Next week, I plan to contribute more to our portfolio and communicate strongly both in and out of the classroom (by using Zoom when necessary).
Individual block of code: Calculator2-MVC--Alex-Atharva/mvc-idea/src/view_control/CalculatorTextUI.java 
Self-grade: 4/5 because I could have probably communicated better this week and checked slack on a regular basis; I would only check after long periods of time, which made communication slightly harder for my teammates. I will make sure to improve on this for next week.
