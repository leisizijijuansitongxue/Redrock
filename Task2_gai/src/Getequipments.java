public class Getequipments {

    Equipment equipments = new Equipment("" , 0,0,0,0,0,0,0);

    public Equipment getequipments(){

        Equipment equipment1 = new Equipment("阿莫斯之弓",0.0 , 0.0, 0.0, 0.4, 3.0, 0.5, 1.0);
        Equipment equipment2 = new Equipment("贯虹之槊",0.5 , 0.5, 0.8, 0.2, 0, 0.2, 0);
        Equipment equipment3 = new Equipment("苍古自由之誓",0.0 , 0.0, 0.6, 0.4 , 5.0, 0.0, 0.0);
        Equipment equipment4 = new Equipment("冬极白星",0.0 , 0.0, 0.0, 0.5 , 0.5, 0.5 , 0.6);
        Equipment equipment5 = new Equipment("松籁响起之时",0.0  , 0.0, 0.0, 0.2, 4.0, 0.4,1.2);
        Equipment equipment6 = new Equipment("狼的末路",0.0  , 0.0, 0.4, 0.8, 0, 0,0.05);
        Equipment equipment7 = new Equipment("终末嗟叹之诗",0.25  , 0.25, 0.3, 0.0, 0.0, 0.1,0.1 );
        Equipment equipment8 = new Equipment("不灭月华",0.3  , 0.3, 0.65, 0.1, 0.0, 0.0,0.0);
        Equipment equipment9 = new Equipment("护摩之杖",0.2  , 0.2, 0.0, 0.3, 0.0, 0.3,1.5);
        Equipment equipment10 = new Equipment("薙草之稻光",0.0  , 0.0, 0.4, 0.15, 3.0, 0.5,0.85);

        Equipment[] equipment = new Equipment[11];

        equipment[0] = equipment10;
        equipment[1] = equipment1;
        equipment[2] = equipment2;
        equipment[3] = equipment3;
        equipment[4] = equipment4;
        equipment[5] = equipment5;
        equipment[6] = equipment6;
        equipment[7] = equipment7;
        equipment[8] = equipment8;
        equipment[9] = equipment9;
        equipment[10] = equipment10;

        int num = (int) (Math.random() * 10);
            equipments = equipment[num];

            return equipments;

    }
}
