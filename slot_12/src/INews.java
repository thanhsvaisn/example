import java.util.ArrayList;

public interface INews {
    void display();
    void setId(int id);
    void setTitle(String title);
    void setPublicDate(String publicDate);
    void setAuthor(String author);
    void setContent(String content);
}

class News implements INews {
    private int id;
    private String title;
    private String publicDate;
    private String author;
    private String content;
    private float averageRate;
    private ArrayList<Integer> rateList;

    // Constructor
    public News() {
        this.rateList = new ArrayList<>();
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Publish Date: " + publicDate);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
        System.out.println("Average Rate: " + averageRate);
    }

    public void calculate() {
        if (rateList.size() > 0) {
            float sum = 0;
            for (int rate : rateList) {
                sum += rate;
            }
            this.averageRate = sum / rateList.size();
        }
    }

    public void inputRate(int rate) {
        if (rate >= 1 && rate <= 5) {
            rateList.add(rate);
            calculate();
        } else {
            System.out.println("Đánh giá không hợp lệ. Vui lòng nhập giá trị từ 1 đến 5.");
        }
    }
}
