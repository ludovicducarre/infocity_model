package business;

import java.util.Calendar;

public class Advert {
    private int id;
    private String title;
    private String message;
    private Calendar date;
    private Calendar time;
    private String location;
    private String type;
    private Town town;


    private Advert() {
    }

    private Advert(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.message = builder.message;
        this.town = builder.town;
        this.date = builder.date;
        this.time = builder.time;
        this.type = builder.type;
        this.location = builder.location;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public Calendar getDate() {
        return date;
    }

    public Calendar getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public Town getTown() {
        return town;
    }

    @Override
    public String toString() {
        return "Advert{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", town=" + town +
                ", type=" + type +
                ", date=" + date +
                ", time=" + time +
                '}';
    }

    public static class Builder {
        private int id;
        private String title;
        private String message;
        private Calendar date;
        private Calendar time;
        private String location;
        private String type;
        private Town town;


        public Advert build() {
            this.setId(id);
            this.setMessage(message);
            this.setTown(town);
            this.setTime(time);
            this.setDate(date);
            this.setTitle(title);
            this.setLocation(location);
            this.setType(type);
            return new Advert(this);
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setTown(Town town) {
            this.town = town;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setDate(Calendar date) {
            this.date = date;
            return this;
        }

        public Builder setTime(Calendar time) {
            this.time = time;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }
    }


}
