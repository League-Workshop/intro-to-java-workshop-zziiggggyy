void setup() {
  size(1000,1000);
  
  
  
}

void draw() {
  if(mousePressed && mouseButton==RIGHT) {
  fill(#000000);
}

  else if(mousePressed && mouseButton==LEFT) {
  fill(#FF0900);
}
else {
  fill(#FFFFFF);
}
ellipse(500,500,800,800);
}