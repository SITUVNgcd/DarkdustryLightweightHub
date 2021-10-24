package inside;

import java.util.Arrays;
import java.util.List;

public class Config {

    /** List with {@link HostData}. */
    public List<HostData> servers = Arrays.asList(
            new HostData(1000, 7, 22, 37, 200, 320),
            new HostData(2000, 7, 7, 22, 80, 200),
            new HostData(3000, 7, 22, 7, 200, 80),
            new HostData(4000, 7, 37, 23, 320, 200)
    );
}
