import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Video {
    private String title;
    private boolean rented;

    public Video(String title) {
        this.title = title;
        this.rented = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isRented() {
        return rented;
    }

    public void rent() {
        rented = true;
    }

    public void returnVideo() {
        rented = false;
    }

    @Override
    public String toString() {
        return title;
    }
}

class VideoStore {
    private List<Video> inventory;

    public VideoStore() {
        inventory = new ArrayList<>();
    }

    public void addVideo(String title) {
        Video video = new Video(title);
        inventory.add(video);
    }

    public boolean checkAvailability(String title) {
        for (Video video : inventory) {
            if (video.getTitle().equals(title)) {
                return !video.isRented();
            }
        }
        return false;
    }

    public boolean rentVideo(String title) {
        for (Video video : inventory) {
            if (video.getTitle().equals(title) && !video.isRented()) {
                video.rent();
                return true;
            }
        }
        return false;
    }

    public boolean returnVideo(String title) {
        for (Video video : inventory) {
            if (video.getTitle().equals(title) && video.isRented()) {
                video.returnVideo();
                return true;
            }
        }
        return false;
    }

    public void listInventory() {
        for (Video video : inventory) {
            System.out.print("\""+video + "\", ");
        }
    }
}

public class Q9 {
    public static void main(String[] args) {
        VideoStore videoStore = new VideoStore();
        Scanner scanner = new Scanner(System.in);
    
        while (true) {
            
            System.out.println("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("N: ");
                    int n = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Title: ");
                    for (int i = 0; i < n; i++) {
                        String title = scanner.nextLine();
                        videoStore.addVideo(title);
                    }
                    System.out.print("\n");
                    break;
                case 2:
                    System.out.println("Title: ");
                    String checkTitle = scanner.nextLine();
                    boolean available = videoStore.checkAvailability(checkTitle);
                    System.out.println(available ? "Available" : "NotAvailable");
                    System.out.print("\n");
                    break;
                case 3:
                    System.out.println("Title: ");
                    String rentTitle = scanner.nextLine();
                    boolean res = videoStore.rentVideo(rentTitle);
                    System.out.print(res ? "\n" : "\n");
                    break;
                case 4:
                    System.out.println("Title: ");
                    String returnTitle = scanner.nextLine();
                    boolean returned = videoStore.returnVideo(returnTitle);
                    if (returned) {
                        System.out.println("Available");
                    } else {
                        System.out.println("NotAvailable");
                    }
                    System.out.print("\n");

                    break;
                case 5:
                    videoStore.listInventory();
                    System.out.print("\n");
                    break;
                case 6:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}