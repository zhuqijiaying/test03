package comTwo.houserent.service;

import comTwo.houserent.domain.House;

public class HouseService {
    private House houses[];//保存House对象
    private int housesnum = 1;//记录有多少个房屋信息
    private int idCounter = 1;//记录当前的id增长

    public HouseService(int size){
        houses = new House[size];//当创建HouseService对象，指定数组大小
        houses[0] = new House(1,"jack","1234","海淀区",2000,"未出租");
    }

    //find方法，返回House对象或者null
    public House findById(int findId){
        for (int i = 0; i <housesnum ; i++) {
            if(findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }


    //del方法，删除一个房屋信息
    public boolean del(int delId){
        int index = -1;
        for (int i = 0; i <housesnum ; i++) {
            if(delId == houses[i].getId()){
                index = i;
            }
        }
        if(index == -1){
            return false;
        }
        for (int i = 0; i <housesnum-1 ; i++) {
            houses[i]= houses[i+1];
        }
        houses[--housesnum] = null;
        return true;
    }

    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse){
        if(housesnum>=houses.length){
            System.out.println("数组已满");
            return false;
        }
        houses[housesnum++]=newHouse;
        //数组id自增长,更新newHouse的id
        newHouse.setId(++idCounter);
        return true;
    }


    //list方法，返回houses
    public House[] list(){
        return houses;
    }
}
