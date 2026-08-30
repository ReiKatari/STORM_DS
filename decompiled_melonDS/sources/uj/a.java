package uj;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k0.g;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f13565a = Pattern.compile("[\\\\&]");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f13566b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f13567c;

    /* renamed from: d  reason: collision with root package name */
    public static final g f13568d;

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, k0.g] */
    static {
        Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
        f13567c = Pattern.compile("[ \t\r\n]+");
        f13568d = new Object();
    }

    public static String a(String str) {
        if (f13565a.matcher(str).find()) {
            Matcher matcher = f13566b.matcher(str);
            if (matcher.find()) {
                StringBuilder sb2 = new StringBuilder(str.length() + 16);
                int i2 = 0;
                do {
                    sb2.append((CharSequence) str, i2, matcher.start());
                    String group = matcher.group();
                    f13568d.getClass();
                    if (group.charAt(0) == '\\') {
                        sb2.append((CharSequence) group, 1, group.length());
                    } else {
                        sb2.append(b.a(group));
                    }
                    i2 = matcher.end();
                } while (matcher.find());
                if (i2 != str.length()) {
                    sb2.append((CharSequence) str, i2, str.length());
                }
                return sb2.toString();
            }
            return str;
        }
        return str;
    }
}
