import java.util.*;

public class Problem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number Of Names: ");
        int numberOfNames = input.nextInt();

        if (numberOfNames <= 100000 && numberOfNames >= 1){

            Set<String> setOfNames = new TreeSet<>();
            List<String> check = new ArrayList<>();
            input.nextLine();

            while (numberOfNames != 0){

                String name = input.nextLine().toLowerCase().trim();

                if (!name.isEmpty() && name.length() <= 32){

                    if (setOfNames.add(name)){

                        check.add("Ok");

                    }else {

                        for (int i = 1; i <= 32; i++){

                            if (setOfNames.add(name+i)){

                                check.add(name+i);
                                break;

                            }

                        }

                    }

                    numberOfNames -= 1;

                }else {

                    System.out.println("Input Not Supported!");

                }

            }

            check.stream().forEach(x ->{

                System.out.println(x);

            });

        }

    }

}
