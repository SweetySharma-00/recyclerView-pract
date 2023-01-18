package com.example.pract;

public class Model {
    private int image1;
    private String Text1;
    private String Text2;
    private String Text3;
    private String divider;



    Model(int image1, String Text1, String Text2, String Text3, String divider){
          this.image1=image1;
          this.Text1=Text1;
          this.Text2=Text2;
          this.Text3=Text3;
          this.divider=divider;
      }


    public int getImage1() {
        return image1;
    }

    public String getText1() {
        return Text1;
    }

    public String getText2() {
        return Text2;
    }

    public String getText3() {
        return Text3;
    }


    public String getDivider() {
        return divider;
    }
}
