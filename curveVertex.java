void setup(){
  size(600, 600);
}

void draw(){
background(255);
noFill();

stroke(0, 255, 0);
beginShape();
curveVertex(300, 50);
curveVertex(300, 50);
curveVertex(250, 100);
curveVertex(300, 150);
curveVertex(250, 200);
curveVertex(mouseX, mouseY);
curveVertex(mouseX, mouseY);
println("X Cooordinate " + mouseX + "Y Coordinate " + mouseY);
endShape();

stroke(0, 200, 200);
beginShape();
curveVertex(300, 50);
curveVertex(300, 50);
curveVertex(250, 100);
curveVertex(300, 150);
curveVertex(250, 200);
endShape();
}
