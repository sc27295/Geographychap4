public class Geography {
public static void main(String[][] args)
    {
    //Atlanta,Georgia
    double x1=51.5138505182;
    double y1=-0.156690922737098845;

    //Orland,Florida
        double x2=28.5383355;
        double y2=-81.379236499999;

        //Savannah, Georgia
        double x3=32.0835407;
        double y3=-81.099834199998;
        //Charlotte,North Carolina

        double x4=35.2270969;
        double y4=-80.84321669999997;

        //calculating 1st triangle:p1, p2, p3

        double side1=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        double side2=Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
        double side3=Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));

        double s=(side1+side2+side3)/2;
        double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

        //Calculate 3nd triangle; p1,p2 and p4
        side1=Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
        side2=Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2));
        side3=Math.sqrt(Math.pow(x1-x4,2)+Math.pow(y1-y4,2));
        s=(side1+side2+side3)/2;
        area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3))+area;
        //display the area enclosed by 4cities

        System.out.println("The area enclosed by 4cities is: "+area+"km^2");
    }

}
