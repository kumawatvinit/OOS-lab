import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Meeting {
    private String meetingTitle;
    private String meetingDate;
    private String meetingStartTime;
    private String meetingEndTime;
    private String meetingDescription;

    public Meeting(String title, String date, String startTime, String endTime, String description) {
        this.meetingTitle = title;
        this.meetingDate = date;
        this.meetingStartTime = startTime;
        this.meetingEndTime = endTime;
        this.meetingDescription = description;
    }

    public String getMeetingDate() {
        return meetingDate;
    }

    public String toString() {
        return "On " + meetingDate + ", from " + meetingStartTime + " to " + meetingEndTime +
                " : " + meetingTitle + " : " + meetingDescription;
    }

    public boolean isColliding(Meeting other) {
        if (!meetingDate.equals(other.meetingDate)) {
            return false;
        }

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        try {
            Date start1 = timeFormat.parse(meetingStartTime);
            Date end1 = timeFormat.parse(meetingEndTime);
            Date start2 = timeFormat.parse(other.meetingStartTime);
            Date end2 = timeFormat.parse(other.meetingEndTime);

            return !(end1.before(start2) || start1.after(end2));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

public class Q3 {
    private ArrayList<Meeting> meetings;

    public Q3() {
        meetings = new ArrayList<>();
    }

    public void scheduleMeeting(String title, String date, String startTime, String endTime, String description) {
        Meeting newMeeting = new Meeting(title, date, startTime, endTime, description);
        boolean collision = false;

        for (Meeting existingMeeting : meetings) {
            if (newMeeting.isColliding(existingMeeting)) {
                collision = true;
                break;
            }
        }

        if (!collision) {
            meetings.add(newMeeting);
            System.out.println("Scheduled successfully");
        } else {
            System.out.println("Collision! Already another meeting is scheduled");
        }
    }

    public void displayMeetings(String listDate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for (Meeting meeting : meetings) {
            if (meeting.getMeetingDate().equals(listDate)) {
                System.out.println(meeting);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Q3 scheduler = new Q3();

        while (true) {
            System.out.println("1. Schedule Meeting\n2. List Meetings\nEnter your choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.print("Title - ");
                String title = scanner.nextLine();
                System.out.print("Date (dd/MM/yyyy) - ");
                String date = scanner.nextLine();
                System.out.print("Start time (HH:mm) - ");
                String startTime = scanner.nextLine();
                System.out.print("End time (HH:mm) - ");
                String endTime = scanner.nextLine();
                System.out.print("Description - ");
                String description = scanner.nextLine();

                scheduler.scheduleMeeting(title, date, startTime, endTime, description);
            } else if (choice == 2) {
                System.out.print("Enter date to list meetings (dd/MM/yyyy) - ");
                String listDate = scanner.nextLine();
                scheduler.displayMeetings(listDate);
                break;
            } else {
                break;
            }
        }
    }
}
