

public class Event {
    String eventId;
    String eventName;
    String eventDescription;

    public Event(String eventId, String eventName, String eventDescription) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDescription = eventDescription;
    }

    public String getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    // Convert event to a line to save in a file
    public String toFileString() {
        return eventId + "," + eventName + "," + eventDescription;
    }

    // Convert a line from file to Event object
    public static Event fromFileString(String line) {
        String[] parts = line.split(",", 3);
        if (parts.length == 3) {
            return new Event(parts[0], parts[1], parts[2]);
        } else {
            return null;
        }
    }

    public String toString() {
        return "Event ID: " + eventId + ", Name: " + eventName + ", Description: " + eventDescription;
    }
}

