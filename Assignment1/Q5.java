class ImageLibrary{
    Image img[];
    int maxsize;// Array size that the user will give 
    int index;//this is array index as Img[index(0)]
    ImageLibrary(int maxsize){
        this.maxsize=maxsize;//declarin the array to reserve the memory
        img =new Image[maxsize];
        index=0;
    }
    public void Add_Img(Image im){
         if (index<maxsize){
             img[index]=im;
                index++;
         }
         else{
             System.out.println("Can't insert as the array is full");
            }
    }
    public void display(){
        if (index==0){
            System.out.println("Array is empty");
        }
        else{
            for (int i=0;i<index;i++){
                System.out.println(img[i]);
            }
        }
    }    
     Image Search(Image secImg){
        if (index==0){
            System.out.println("Th array is emptu");
        }   
        else{
            for (int i=0;i<index;i++){
                if (img[i].equals(secImg))
                return  img[i];
            }
        }  
            return null;
        
    }
    Image getElementByIndex(int index){
        if(index<0 && index>=maxsize){
            System.out.println("invalid index");

        }
        else{
            return img[index];
        }
              return null;
    }
    
    
}
 class Q5 {
    public static void main(String[] args) {
        Image ob1=new Image(); 
        Image ob2=new Image(3,5,"black");       
        ImageLibrary lb= new ImageLibrary(5);
        lb.Add_Img(ob1);
        lb.Add_Img(ob2);
        lb.display();
        lb.Search(ob1);
        lb.getElementByIndex(0);
    }
    
}
