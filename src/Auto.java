public class Auto {
    private String model;
    private Integer releaseDate;

    public Auto(Integer releaseDate) {
        this.model = "Lexus";
        this.releaseDate = releaseDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }
}
