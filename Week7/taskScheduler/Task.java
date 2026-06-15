package Week7.taskScheduler;

public class Task {
    private String name;
    private String status;

    public Task(String name) {
        this.name = name;
        this.status="pending";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void markTaskCompleted(){
        this.status="completed";
    }
}
