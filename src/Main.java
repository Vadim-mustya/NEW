public class Main
{


    public static void main(String[] args) {
        Worker[] workArr = new Worker[5];

        workArr[0] = new Worker("Иванов Иван","Инженер","ivanivanov@mail.ru","88888888899",21321,34);
        workArr[1] = new Worker("Олешкин Константин","Старший Инженер","sdfk5@mail.ru","88345235636",32434,52);
        workArr[2] = new Worker("Михайлов Антон","Электрик","xfcgd@mail.ru","84235256299",45223,42);
        workArr[3] = new Worker("Самойлов Игорь","Систменый администратор","sisadmin@mail.ru","82356623429",56845,56);
        workArr[4] = new Worker("Рыжиков Сергей","Охранник","jfi4ffsw@mail.ru","83567354345",23462,32);
        for(int i = 0;i < workArr.length;i++) {
            if(workArr[i].getWorkerAge() > 40) {
                workArr[i].fetInfoOffWorker();
                System.out.println("-----------------------------------------");
            }
        }
    }
}

