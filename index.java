int colorR = 130;
int colorG = 220;
int colorB = 40;
int bgColor = 255;
int strokeColor = 0;
int canvasSize = 500;

int posx1 = 125;
int posx2 = 275;
int posy1 = 125;
int posy2 = 275;
int radius = 100;

int shrinkMultiplier = 2;

void setup() {
	size(canvasSize, canvasSize);
  ellipseMode(CENTER);
}

void draw() {
// Step 1: Write code that draws the screenshot in the files 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 
// Try different expressions and see what happens!

  background(bgColor);
  stroke(strokeColor);
  fill(colorR, colorG, colorB);

  ellipse(posx1, posy1, radius, radius);
  ellipse(posx2, posy1, radius, radius);
  ellipse(posx1, posy2, radius, radius);
  ellipse(posx2, posy2, radius, radius);
  

  //remove this to see the circles exist for more than half a second lol
  radius /= shrinkMultiplier;
}