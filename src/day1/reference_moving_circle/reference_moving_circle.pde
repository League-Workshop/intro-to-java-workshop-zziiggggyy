int xposition = 250;

void setup(){
  size(500,500);
 
  
  
  
  
  
}

void draw() {
   background(220);
  fill(#000000);
   if(mousePressed && mouseButton==RIGHT)  {
   fill(#FFFFFF);
   xposition=xposition+1;
 }
   else if(mousePressed && mouseButton==LEFT)  {
   fill(#FFFFFF);
   xposition=xposition-1;
 }
 
 
   ellipse(xposition,250,100,100);
   
  
  
  
  
  
}