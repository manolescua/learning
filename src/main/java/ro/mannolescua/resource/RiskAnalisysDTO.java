package ro.mannolescua.resource;

/**
 * Created by Aurelian on 10/8/2015.
 */
public class RiskAnalisysDTO {

       private final long id;
       private final String content;

        public RiskAnalisysDTO(long id, String content) {
            this.id = id;
            this.content = content;
        }

        public long getId() {
            return id;
        }

        public String getContent() {
            return content;
        }

}
