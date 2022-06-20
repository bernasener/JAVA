import java.util.List;
import java.util.ArrayList;


class Main {
  public static void main(String[] args) {
    

  int arr[]= {4,7,6,12,5,9,40,10};
  for (int i=0; i<arr.length; i++){
    if(i==0){
      arr[0]=(arr[1]*arr[2]*arr[3]*arr[4]*arr[5]*arr[6]*arr[7]);
    System.out.println("Birinci eleman= "+arr[0]);
    }
    if(i==1){

    arr[1]=(arr[2]*arr[3]*arr[4]*arr[5]*arr[6]*arr[7]);
    System.out.println("İkinci eleman= "+arr[1]);
    }
    if(i==2){

    arr[2]=(arr[3]*arr[4]*arr[5]*arr[6]*arr[7]);
    System.out.println("Üçüncü eleman= "+arr[2]);
    }

    if(i==3){

    arr[3]=(arr[4]*arr[5]*arr[6]*arr[7]);
    System.out.println("Dördüncü eleman= "+arr[3]);
    }
    if(i==4){

    arr[4]=(arr[5]*arr[6]*arr[7]);
    System.out.println("Beşinci eleman= "+arr[4]);
    }
    if(i==5){

    arr[5]=(arr[6]*arr[7]);
    System.out.println("Altıncı eleman= "+arr[5]);
    }
    if(i==6){

    arr[6]=(arr[7]);
    System.out.println("Yedinci eleman= "+arr[6]);
    }

 
    
  }
       
    
  }
}