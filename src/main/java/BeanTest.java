import java.util.Scanner;

public class BeanTest {

    private static final Scanner scan = new Scanner(System.in);
    private static long id = 0;

    public static void main(String[] args) {
        Album myAlbum = createAlbum(id);

        System.out.printf("Artist: %s%nName: %s%nDate: %d%nSales: $%.2f%nGenre: %s%n", myAlbum.getArtist(), myAlbum.getName(), myAlbum.getReleaseDate(), myAlbum.getSales(), myAlbum.getGenre());

        Album newAlbum = createAlbum();

        System.out.printf("Artist: %s%nName: %s%nDate: %d%nSales: $%.2f%nGenre: %s%n", newAlbum.getArtist(), newAlbum.getName(), newAlbum.getReleaseDate(), newAlbum.getSales(), newAlbum.getGenre());
    }

    public static Album createAlbum(long id){
        System.out.println("Enter Album Artist");
        String artist = scan.nextLine();
        System.out.println("Enter Album Name");
        String name = scan.nextLine();
        System.out.println("Enter Album Release Date(YYYY)");
        int date = Integer.parseInt(scan.nextLine());
        System.out.println("Enter Album Sales");
        double sales = Double.parseDouble(scan.nextLine());
        System.out.println("Enter Album Genre");
        String genre = scan.nextLine();

        return new Album(id, artist, name, date, sales, genre);
    }

    public static Album createAlbum(){
        System.out.println("Enter Album Artist");
        String artist = scan.nextLine();
        System.out.println("Enter Album Name");
        String name = scan.nextLine();
        System.out.println("Enter Album Release Date(YYYY)");
        int date = Integer.parseInt(scan.nextLine());
        System.out.println("Enter Album Sales");
        double sales = Double.parseDouble(scan.nextLine());
        System.out.println("Enter Album Genre");
        String genre = scan.nextLine();

        return new Album(artist, name, date, sales, genre);
    }
}
