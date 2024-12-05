public class box{
        double length;
        double breadth;
        double height;  
        box(){
            this.length = 2;
            this.breadth = 2;
            this.height = 2;
        }
        box(double side){
            this.length = side;
            this.breadth = side;
            this.height = side;
    }
    public void format(){
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
        System.out.println("Height: "+height);
    }
    public static void main(String[] args) {
        // box b1 = new box();
        // box b2 = new box(3);
        // b1.format();
        // b2.format();
        
        boxWeight bw1 = new boxWeight();
        System.out.println("Weight: "+bw1.weight + " Length: "+bw1.length);
    }
}
