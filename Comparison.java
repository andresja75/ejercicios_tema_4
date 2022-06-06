package ejercicios_tema_4;

public class Comparison {

    public static void main(String args[])
    {
        compare(1);
        loop_while(0);
        loop_do_while(1);
        loop_for();
        switch_statement("Spring");
    }

    private static void compare(int numeroIf)
    {

        if(numeroIf > 0 )
        {
            System.out.println(numeroIf + ": es positivo");
        }
        else if(numeroIf == 0)
        {
            System.out.println(numeroIf);
        }else
        {
            System.out.println(numeroIf + ": es negativo");
        }

    }

    private static void loop_while(int numeroWhile)
    {
        while(numeroWhile < 3)
        {
            System.out.println("numeroWhile: " + numeroWhile);
            numeroWhile++;
        }

    }

    private static void loop_do_while(int numeroWhile)
    {
        do {
            System.out.println("numeroWhile: " + numeroWhile);
            numeroWhile++;
            break;
        }while(true);

    }

    private static void loop_for()
    {

        for(int numeroFor = 0;numeroFor <= 3; numeroFor++)
        {
            System.out.println("numeroFor: " + numeroFor);

        }
    }

    private static void switch_statement(String season)
    {
        switch(season)
        {

            case "Spring":
                System.out.println("The season is Spring");
                break;

            case "Summer":
                System.out.println("The season is Summer");
                break;

            case "Autumn":
                System.out.println("The season is Autumn");
                break;

            case "Winter":
                System.out.println("The season is Winter");
                break;

            default:
                System.out.println("That season doesnt exists");
        }

    }
}
