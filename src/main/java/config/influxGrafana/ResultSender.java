package config.influxGrafana;

import java.time.Instant;
import java.util.List;

import com.influxdb.annotations.Column;
import com.influxdb.annotations.Measurement;
import com.influxdb.client.InfluxDBClient;
import com.influxdb.client.InfluxDBClientFactory;
import com.influxdb.client.WriteApi;
import com.influxdb.client.domain.WritePrecision;
import com.influxdb.client.write.Point;
import com.influxdb.query.FluxTable;

public class ResultSender {
    static String token = "";
    static String bucket = "android_test_results";
    static String org = "test";


    static InfluxDBClient client = InfluxDBClientFactory.create("http://localhost:8086", token.toCharArray());


    public static void send(Point point) {
        //String data = "mem,host=added used_percent=23.43234543";
        try (WriteApi writeApi = client.getWriteApi()) {
            writeApi.writeRecord(bucket, org, WritePrecision.MS, point.toLineProtocol());
        }
    }

}
