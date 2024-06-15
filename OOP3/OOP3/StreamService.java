package OOP3;

import java.util.Collections;
import java.util.List;



public class StreamService {
    
    // private StreamService streamService;

    public void sortStream(List<Stream> streams) {
        Collections.sort(streams, new StreamComparator());
    }

    // public StreamService() {
    //     this.streamService = streams;
    // }

    
}

