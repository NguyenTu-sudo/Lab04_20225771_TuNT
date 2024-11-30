package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.disc.DVD;
public class TestPassingParameter {
    public static void main(String[] args) {
        DVD jungleDVD = new DVD("Jungle", null, null, 0, 0);
        DVD cinderellaDVD = new DVD("Cinderella", null, null, 0, 0);

        DVD[] dvds = {jungleDVD, cinderellaDVD};
        swap(dvds);
        System.out.println("jungle dvd title: " + dvds[0].getTitle());
        System.out.println("cinderella dvd title: " + dvds[1].getTitle());

       
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(DVD[] dvds) {
        DVD tmp = dvds[0];
        dvds[0] = dvds[1];
        dvds[1] = tmp;
    }

    public static void changeTitle(DVD dvd, String title) {
        dvd.setTitle(title);
    }
}
