// Write a program to create an Image class with attributes imageWidth, imageHeight, 
// and colorCode. Add the required constructor, set methods, get methods, and toString
// method. Create the object of the image class using the default and parameterized 
// constructor and print the details of the object.
class Image{
    private int imageWidth;
    private int imageHeight;
    private String colorCode;
    public Image(){
        this.imageWidth=imageWidth;
        this.imageHeight=imageHeight;
        this.colorCode=colorCode;

}
public void setImageWidth(int imageWidth) {
    this.imageWidth = imageWidth;
    }
    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
        }
    public void setColorCode(String colorCode) {
            this.colorCode = colorCode;
            }
    public int getImageWidth() {
         return imageWidth;
                }
    public int getImageHeight() {
       return imageHeight;
                    }
    public String getColorCode() {
            return colorCode;
                        }
    public String toString() {
        return "Image [imageWidth=" + imageWidth + ", imageHeight=" + imageHeight +", colorCode=" + colorCode +"]";
}
}
public class Q4 {
    public static void main(String[] args) {
    
        Image image = new Image();
        System.out.println(image.toString());
        image.setImageWidth(100);
        image.setImageHeight(200);
        image.setColorCode("Red");
        System.out.println(image.toString());
        
    }
    
}
