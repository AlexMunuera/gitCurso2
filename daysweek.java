public class daysweek {
    public static void main(String[] args) {
        int num = 7;

        int roll = (int) (Math.random() * num) + 1;

        if ( roll == 1 ) System.out.println("Mi día favorito de la semana es el \"lunes\".");
        else if (roll == 2 ) System.out.println("Mi día favorito de la semana es el \"martes\".");
        else if (roll == 3 ) System.out.println("Mi día favorito de la semana es el \"miercoles\".");
        else if (roll == 4 ) System.out.println("Mi día favorito de la semana es el \"jueves\".");
        else if (roll == 5 ) System.out.println("Mi día favorito de la semana es el \"viernes\".");
        else if (roll == 6 ) System.out.println("Mi día favorito de la semana es el \"sábado\".");
        else System.out.println("Mi día favorito de la semana es el \"domingo\".");

    }
}
