package jp.mapserver2007.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.IntStream;
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
     * サンプル4
     * Stream#ofを使う
     */
    public void useStreamOf() {
        List<String> list = new ArrayList<>();
        list.add("honoka");
        list.add("kotori");
        list.add("umi");

        // 配列を使うパターン
        String[] array = {"nico", "rin", "pana"};
        print(Stream.of(array));
        // 引数の列挙を使うパターン
        print(Stream.of("maki", "rin", "pana"));
    }

    /**
     * サンプル5
     * 型付されたStream
     */
    public void typedStram() {
        // int型配列をIntStreamにする
        int[] array = {1,2,3,4};
        // Arrays#stramは型制限したStraemを使える
        IntStream intStream = Arrays.stream(array);
        print(intStream);
    }

    /**
     * サンプル6
     * メソッドチェーン
     */
    public void chainedStream() {
        List<String> list = new ArrayList<>();
        list.add("honoka");
        list.add("kotori");
        list.add("umi");
        list.add("maki");
        list.add("rin");
        list.add("hanayo");

        list.stream()
            .filter(s -> s.contains("a")) // aが含まれる
            .map(s -> s.toUpperCase()) // 大文字にする
            .forEach(System.out::println);
    }

    /**
     * サンプル7
     * 並列なStream
     */
    public void parallelStream() {
        List<String> list = new ArrayList<>();
        list.add("☆honoka☆");
        list.add("☆kotori☆");
        list.add("☆umi☆");
        list.add("☆maki☆");
        list.add("☆rin☆");
        list.add("☆hanayo☆");

        list.parallelStream().forEach(System.out::println);
    }

    /**
     * Streamの内容を出力
     * @param stream
     */
    private void print(Stream<?> stream) {
        stream.forEach(s -> System.out.println(s.toString()));
        System.out.println("-------------------------------");
    }

    /**
     * Streamの内容を出力
     * @param stream
     */
    private void print(IntStream stream) {
        stream.forEach(i -> System.out.println(String.valueOf(i)));
        System.out.println("-------------------------------");
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
