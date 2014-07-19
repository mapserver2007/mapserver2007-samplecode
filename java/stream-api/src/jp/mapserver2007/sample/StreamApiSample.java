package jp.mapserver2007.sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Stream APIサンプル
 * @author mapserver2007
 */
public class StreamApiSample {

    public StreamApiSample() {
    }

    /**
     * サンプル1
     * ListをStreamにする
     */
    public void listToStream() {
        // Java8のリスト定義
        List<String> list = new ArrayList<>();
        list.add("honoka");
        list.add("kotori");
        list.add("umi");

        // list -> stream
        print(list);
    }

    /**
     * サンプル2
     * SetをStreamにする
     */
    public void setToStraem() {
        Set<String> set = new HashSet<>();
        set.add("hanayo");
        set.add("rin");
        set.add("maki");

        // set -> stream
        print(set);
    }

    /**
     * サンプル3
     * MapをSetにしてからStraemにする
     */
    public void mapToStream() {
        HashMap<String, String> map = new HashMap<>();
        map.put("printemps", "honoka");
        map.put("bibi", "elichika");
        map.put("lilywhite", "umi");

        // Mapの場合、直接streamメソッドを叩けない。
        // entrySetでstreamを取得
        Set<Entry<String, String>> set = map.entrySet();

        print(set);
    }

    /**
     * Streamの内容を出力
     * @param stream
     */
    private void print(Collection<?> collection) {
        Stream<?> stream = collection.stream();
        stream.forEach(s -> System.out.println(s.toString()));
        System.out.println("-------------------------------");
    }

}
