package ragna.goodbye;

/**
 * Created by ragnarokkrr on 5/3/16.
 */
public class Goodbye {
    private final String instanceId;
    private final long id;
    private final String content;

    public Goodbye(String instanceId, long id, String content) {
        this.instanceId = instanceId;
        this.id = id;
        this.content = content;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Goodbye{" +
                "instanceId='" + instanceId + '\'' +
                ", id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
