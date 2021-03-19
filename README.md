# 字典树

简单的字典树模型，用于查找关键词、敏感词等

# 运行

编写测试类以测试：

```
public class TrieTreeTest {
    public static void main(String[] args) {
        TrieTreeUtil trieTreeUtil = new TrieTreeUtil();
        trieTreeUtil.add("和平");
        trieTreeUtil.add("未来");
        trieTreeUtil.add("守护");
        trieTreeUtil.add("那咋办嘛");

        //只返回结果（效率更高）
        System.out.println(trieTreeUtil.contains("我的愿望是世界和平~~"));
        System.out.println(trieTreeUtil.contains("技术日新月异，未来会出现什么技术谁也不知道"));
        System.out.println(trieTreeUtil.contains("只见他又又又又又说到：“那咋办嘛”"));
        System.out.println(trieTreeUtil.contains("可口可乐好喝还是百事可乐好喝"));

        //返回关键词
        System.out.println(trieTreeUtil.containsReturn("我的愿望是世界和平~~"));
        System.out.println(trieTreeUtil.containsReturn("技术日新月异，未来会出现什么技术谁也不知道"));
        System.out.println(trieTreeUtil.containsReturn("只见他又又又又又说到：“那咋办嘛”"));
        System.out.println(trieTreeUtil.containsReturn("可口可乐好喝还是百事可乐好喝"));
    }
}
```
