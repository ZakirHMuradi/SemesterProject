# UCA Semester Project

# Purpose of the App
The purpose of a calorie calculator is to help you estimate the number of calories you need per day to maintain, gain, or lose weight.
Calories are a unit of energy that we get from the food and drinks we consume. The number of calories we need per day depends on several factors, including our age, gender, weight, height, and activity level.

If we consume more calories than we need, our bodies will store the excess energy as fat, leading to weight gain. If we consume fewer calories than we need, our bodies will use stored fat as energy, leading to weight loss.
A calorie calculator can help you determine how many calories you need per day based on your individual characteristics and goals. It can also help you track your daily calorie intake and make sure you are getting the right amount of energy from your diet.


# How it works
Determine your basal metabolic rate (BMR), which is the number of calories your body needs to function at rest. You can use a formula or an online calculator to estimate your BMR.
Consider your activity level. Are you sedentary, lightly active, moderately active, very active, or extremely active?
Multiply your BMR by your activity level factor to determine your total daily energy expenditure (TDEE). There are different factors for each activity level.
Adjust your calorie intake based on your goals. If you want to lose weight, you will need to create a calorie deficit by consuming fewer calories than your TDEE. If you want to gain weight, you will need to consume more calories than your TDEE. If you want to maintain your weight, you should aim to consume roughly the same number of calories as your TDEE.
Remember, these are just rough estimates, and your actual calorie needs may vary based on factors such as your age, body composition, and genetics. It's always a good idea to consult with a healthcare professional or a registered dietitian to determine the best calorie intake for you.

# Software
JavaFX SDK 19 - https://openjfx.io/

Scene Builder 19.0.0 - https://gluonhq.com/products/scene-builder/

IntelliJ IDEA - https://www.jetbrains.com/idea/

JavaFX config for IntelliJ - https://openjfx.io/openjfx-docs/

Change VM options: --module-path PATH_TO_FX --add-modules javafx.controls,javafx.fxml

PATH_TO_FX - path to JavaFX lib folder

# How to run the application
Download the project from the repository or just simply copy the code file and paste it in your code editor.
Open the project in your favorite editor (preferable IntelliJ IDEA)
Run the application


# Calculation Method
To calculate the number of calories you need per day, you can use the following formula:

Determine your basal metabolic rate (BMR), which is the number of calories your body needs to function at rest. You can use the following formula to calculate your BMR:
For men: BMR = 66 + (6.2 x weight in pounds) + (12.7 x height in inches) - (6.76 x age in years)

For women: BMR = 655 + (4.35 x weight in pounds) + (4.7 x height in inches) - (4.7 x age in years)

Determine your activity level. You can use the following categories to estimate your activity level:
Sedentary: little or no exercise
Lightly active: light exercise 1-3 days/week
Moderately active: moderate exercise 3-5 days/week
Very active: hard exercise 6-7 days/week
Extremely active: very hard exercise and physical job or 2x training
Multiply your BMR by your activity level factor to determine your total daily energy expenditure (TDEE). The factors for each activity level are as follows:
Sedentary: BMR x 1.2
Lightly active: BMR x 1.375
Moderately active: BMR x 1.55
Very active: BMR x 1.725
Extremely active: BMR x 1.9
For example, if you are a 30-year-old woman who weighs 150 pounds, is 5'5" tall, and has a sedentary job, your BMR would be: 655 + (4.35 x 150) + (4.7 x 65) - (4.7 x 30) = 1462 calories/day

Your TDEE would then be 1462 x 1.2 = 1754 calories/day.

This is just a rough estimate, and your actual calorie needs may be different depending on a variety of factors such as your age, body composition, and goals. It's always a good idea to consult with a healthcare professional or a registered dietitian to determine the best calorie intake for you.


# ScreenShots
<img width="960" alt="image" src="https://user-images.githubusercontent.com/86466557/209962779-2325be9f-0900-407e-a7a6-9b7f233e0e79.png">
<img width="959" alt="image" src="https://user-images.githubusercontent.com/86466557/209962472-128f3665-172a-41d0-9bf0-b6e3ae15b799.png">
<img width="957" alt="image" src="https://user-images.githubusercontent.com/86466557/209962587-b256cec1-8854-4bd4-b33e-a961946615d8.png">

# List of features to be add in Phase 2

1) The protype will look as below 
<img width="388" alt="image" src="https://user-images.githubusercontent.com/86466557/209974189-26396395-3396-4427-903a-cc4160f23e76.png">
2) Also specify how much calories needed in specific food items

# Triangle_3D

# Description (Other mini project for learning purpose)
A triangle mesh is a type of 3D computer graphics model that is composed of a set of triangles. It is often used to represent the surface of a 3D object or a 3D environment. In a triangle mesh, each vertex (or corner) of the triangle is represented by a 3D coordinate in space, and each triangle is defined by the three vertices that make up its corners. The edges of the triangles are called edges, and the area inside the triangle is called a face.

Triangle meshes are used in a variety of applications, including computer-aided design (CAD), 3D printing, video games, and computer graphics. They are efficient to represent and process, as they require fewer vertices than other types of meshes such as quadrilateral meshes. However, they are not as smooth as other types of meshes and may produce visible edges or "stepping" when viewed at a distance. There are various algorithms and techniques for creating, modifying, and rendering triangle meshes, including mesh smoothing, mesh optimization, and mesh simplification.

# Procedure
1) Build your Scene and Camera
2) Create a Pyramid with a color and add to the Scene. Lets assume our height is 100 and our width (hypotenuse) at the base is 50.  
3) Create and transform a Pyramid using DrawMode FILL and it can be translated and rotated like a primitive
4) Add color and a Mouse Handler for Rotations
5) Calculate the angle when the button has been pressed
6) Create a viewable MeshView to be added to the scene and add a TriangleMesh to a 3D scene you need a MeshView container object which allows you to control how the TriangleMesh is rendered

# Note: 
This application does not have FXML file as all elements were created using only JAVA code.

# Screenshot
<img width="955" alt="image" src="https://user-images.githubusercontent.com/86466557/209967658-f0905fac-9dfe-476b-bd79-b7ef64b601ba.png">
<img width="960" alt="image" src="https://user-images.githubusercontent.com/86466557/209967751-2a748626-c4fa-4976-a66c-bb3f2edff418.png">

# Contributions
Anyone can contribute to this repository. If you want to contribute, please follow the steps below:
1)  Fork this repository
2)  Clone the forked repository
3)  Create a new branch
4)  Make changes to the code
5)  Commit the changes
6)  Push the changes to the forked repository
7)  Create a pull request
8)  Wait for the pull request to be merged
9)  Celebrate your contribution to this repository
10) Repeat steps 1-9


# Contact
Any questions or suggestions? Feel free to contact me at

https://www.linkedin.com/in/zakir-hussain-muradi-uca/
