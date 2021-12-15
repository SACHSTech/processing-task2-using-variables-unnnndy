import processing.core.PApplet;

public class Sketch extends PApplet {
	

  public void settings() {
    size(100, 100);
  }

  public void setup() {
    background(100, 100, 100);
  }

  public void draw() {
    //ground
    fill(255,2555,255);
    rect(0,height/1.3f,width,height/1.3f);

    //moon
    fill(240,240,240);
    noStroke();
    ellipse(width/5.3f,height/5.3f,width/5.3f,height/5.3f);
    
    fill(100,100,100);
    noStroke();
    ellipse(width/4,height/5.3f,width/5.3f,height/5.3f);

    //snowman circle body parts (3)
    stroke(20,20,20);
    fill(240,240,240);
    ellipse(width/2,height/1.45f,width/3.2f,height/3.2f);

    stroke(20,20,20);
    fill(240,240,240);
    ellipse(width/2,height/2,width/4,height/4);

    stroke(20,20,20);
    fill(240,240,240);
    ellipse(width/2,height/2.6f,width/5,height/5);

    //snowman arms
    stroke(20,20,20);
    line(width/2.6f,height/2,width/3.07f,height/2.28f);

    stroke(20,20,20);
    line(width/1.6f,height/2,width/1.48f,height/2.28f);

    // eyes
    stroke(20,20,20);
    fill(50,50,50);
    ellipse(width/2.22f,height/2.6f,width/20,height/20);

    stroke(20,20,20);
    fill(50,50,60);
    ellipse(width/1.81f,height/2.6f,width/20,height/20);

    //face parts
    stroke(20,20,20);
    line(width/2.05f,height/2.28f,width/1.95f,height/2.28f);

    stroke(20,20,20);
    line(width/2.28f,height/2.96f,width/2.16f,height/2.96f);

    stroke(20,20,20);
    line(width/1.86f,height/2.96f,width/1.77f,height/2.96f);

    //rocks
    stroke(50,50,50);
    fill(80,80,80);
    triangle(width/5,height/1.25f,width/3.63f,height/1.42f,width/3.33f,height/1.25f);

    stroke(50,50,50);
    fill(80,80,80);
    triangle(width/8,height/1.21f,width/6.15f,height/1.33f,width/5,height/1.21f);

    stroke(50,50,50);
    fill(80,80,80);
    triangle(width/1.6f,height/1.23f,width/1.5f,height/1.29f,width/1.42f,height/1.23f);

    stroke(50,50,50);
    fill(80,80,80);
    triangle(width/1.3f,height/1.21f,width/1.26f,height/1.3f,width/1.21f,height/1.21f);
  }
}
