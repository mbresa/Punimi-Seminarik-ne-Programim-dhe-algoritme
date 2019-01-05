public class Testd {
  public static void main(String[] args) {

    int tempDay1 = 21;
    int tempDay2 = 22;
    int tempDay3 = 28;
    int tempDay4 = 30;
    int tempDay5 = 18;
    int tempDay6 = 10;
    
    PointGraphWriter e = new PointGraphWriter();
    e.setAxes(50, 110, 90, "5", "40");
    int scale_factor = 3;
    e.setPoint1(tempDay1*scale_factor);
    e.setPoint2(tempDay2*scale_factor);
    e.setPoint3(tempDay3*scale_factor);
    e.setPoint4(tempDay4*scale_factor);
    e.setPoint5(tempDay5*scale_factor);
    e.setPoint6(tempDay6*scale_factor);
  }
}
