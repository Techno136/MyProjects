package com.example.proje_1;

public class caradapter {

    public static void main(String[] args) {
        //

        Car car1= new Car();


        // Aşağıdaki kısım car class ı public iken çalışır
        /* car1.color="gümüş";
        car1.doors=4;
        car1.engine=1.6;
        car1.model= "Renault megane";

        System.out.println("Arabanın rengi= "+ car1.color);
        System.out.println("Arabanın kapı sayısı= "+car1.doors);
        System.out.println("Arabanın motor gücü= "+car1.engine);
        System.out.println("Arabanın modeli= "+car1.model);

         */

        // Aşağıdaki kısım ise class private olursa erişim için

        car1.setColor("gümüş");
        car1.setModel("Hyndai getz");
        car1.setDoors(2); // kapı sayısı için car classında şart koştuk. 2 veya 4 dışında uyarı yazısı gelecek.
        car1.setEngine(1.5); // Böylece yanlışlıkla başka bir çalışan tarafından değiştirilmesini engellemiş olduk.
        // yani encapsülation yaptık.




        System.out.println("Arabanın rengi= "+ car1.getColor());
        System.out.println("Arabanın kapı sayısı= "+car1.getDoors());
        System.out.println("Arabanın motor gücü= "+car1.getEngine());
        System.out.println("Arabanın modeli= "+car1.getModel());

        car1.start(); // dersek önceden tanımlı yazıyıyı otomatik yazacak
        car1.stop();










    }
}
