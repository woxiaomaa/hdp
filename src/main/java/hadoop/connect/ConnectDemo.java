package hadoop.connect;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;



/**
 * Created by mh on 2018/6/24.
 */
public class ConnectDemo {
    FileSystem fs;

    public  void init() throws IOException {
        Configuration conf = new Configuration();
        fs = FileSystem.get(conf);
    }

    public void testUpload() throws IOException {
        fs.copyFromLocalFile(new Path(""),new Path(""));
    }
}
