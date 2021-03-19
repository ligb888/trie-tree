# 字典树

简单的字典树模型，用于查找关键词、敏感词等

# 测试

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

打印如下：
```
true
true
true
false
和平
未来
那咋办嘛
null
```

## 效率对比

测试设备：2014年macbook pro，i5 4258U，8G

测试参数1：2500关键词，10万次查询：

|样本类型|for循环|字典树|
|----|----|----|
|前匹配-长度20|1308毫秒|96毫秒|
|不匹配-长度20|14186毫秒|149毫秒|
|不匹配-长度100|32715毫秒|556毫秒|

测试参数2：56000关键词，10万次查询：

|样本类型|for循环|字典树|
|----|----|----|
|前匹配-长度20|73088毫秒|132毫秒|
|不匹配-长度20|225387毫秒|210毫秒|
|不匹配-长度100|452902毫秒|549毫秒|

可以看到在关键词较多时，循环的效率下降非常快，字典树的效率几乎不受关键词数量影响，但他们都受到文本长度影响。

