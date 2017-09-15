import java.util.regex.Pattern;

public class Validator {
    /**
     * 正则表达式：验证用户名
     * ^表示输入字符串的开始位置，$匹配输入字符串的结尾位置
     * \\w表示匹配任何字类字符（相当于[a-zA-Z0-9_]）
     */
    public static final String REGEX_USERNAME = "^[a-zA-Z]\\w{5,17}$"; //字母开头，字符串由6到18位字母、数字和下划线组成

    /**
     * 正则表达式：验证密码
     */
    public static final String REGEX_PASSWORD = "^[a-zA-Z0-9]{6,16}$";  //由6到16位数字或字母组成

    /**
     * 正则表达式：验证手机号
     * [^4,\\D]表示除4以外的数字
     * 130-139、15开头的除了154、180和185-189开头的号码
     */
    public static final String REGEX_MOBILE = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";

    /**
     * +表示出现过一次或多次，-|\\.表示匹配-或.,?表示零次或一次，
     * 正则表达式：验证邮箱
     * 以数字或字母开头，@的左边允许有-或者.，@右边以若干字母或数字开头，后面可以有-号，再加上字母或数字，也可以没有，再加上.,最后加上2个以上的字母结尾
     */
    public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

    /**
     * 正则表达式：验证汉字
     * 表示匹配四位十六进制数表示的 Unicode 字符，中文字符的范围就是4e00-9fa5
     */
    public static final String REGEX_CHINESE = "^[\u4e00-\u9fa5],{0,}$";

    /**
     * 正则表达式：验证身份证
     * \\d是匹配数字字符，表示身份证号可取15或18位
     */
    public static final String REGEX_ID_CARD = "(^\\d{18}$)|(^\\d{15}$)";

    /**
     * 正则表达式：验证URL
     * http或https开头，.号前的数字，字母或下划线出现一次或多次，.后面出现一个或多个字母
     */
    public static final String REGEX_URL = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?";

    /**
     * 正则表达式：验证IP地址
     * 25开头，如251、252但是不能超过255。。。
     */
    public static final String REGEX_IP_ADDR = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";

    /**
     * 校验用户名
     *
     * @param username
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isUsername(String username) {
        return Pattern.matches(REGEX_USERNAME, username);
    }

    /**
     * 校验密码
     *
     * @param password
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isPassword(String password) {
        return Pattern.matches(REGEX_PASSWORD, password);
    }

    /**
     * 校验手机号
     *
     * @param mobile
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isMobile(String mobile) {
        return Pattern.matches(REGEX_MOBILE, mobile);
    }

    /**
     * 校验邮箱
     *
     * @param email
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isEmail(String email) {
        return Pattern.matches(REGEX_EMAIL, email);
    }

    /**
     * 校验汉字
     *
     * @param chinese
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isChinese(String chinese) {
        return Pattern.matches(REGEX_CHINESE, chinese);
    }

    /**
     * 校验身份证
     *
     * @param idCard
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isIDCard(String idCard) {
        return Pattern.matches(REGEX_ID_CARD, idCard);
    }

    /**
     * 校验URL
     *
     * @param url
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isUrl(String url) {
        return Pattern.matches(REGEX_URL, url);
    }

    /**
     * 校验IP地址
     *
     * @param ipAddr
     * @return
     */
    public static boolean isIPAddr(String ipAddr) {
        return Pattern.matches(REGEX_IP_ADDR, ipAddr);
    }

    public static void main(String[] args) {
        String username = "http://baidu.com";
        System.out.println(Validator.isUsername(username));
        System.out.println(Validator.isChinese(username));
        System.out.println(Validator.isUrl(username));
    }
}