package uj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f13569a;

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f13570b;

    static {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(b.class.getResourceAsStream("/org/commonmark/internal/util/entities.properties"), Charset.forName("UTF-8")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (readLine.length() != 0) {
                        int indexOf = readLine.indexOf("=");
                        hashMap.put(readLine.substring(0, indexOf), readLine.substring(indexOf + 1));
                    }
                } else {
                    bufferedReader.close();
                    hashMap.put("NewLine", "\n");
                    f13569a = hashMap;
                    f13570b = Pattern.compile("^&#[Xx]?");
                    return;
                }
            }
        } catch (IOException e6) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e6);
        }
    }

    public static String a(String str) {
        int i2;
        Matcher matcher = f13570b.matcher(str);
        if (matcher.find()) {
            if (matcher.end() == 2) {
                i2 = 10;
            } else {
                i2 = 16;
            }
            try {
                int parseInt = Integer.parseInt(str.substring(matcher.end(), str.length() - 1), i2);
                if (parseInt != 0) {
                    return new String(Character.toChars(parseInt));
                }
                return "�";
            } catch (IllegalArgumentException unused) {
                return "�";
            }
        }
        String str2 = (String) f13569a.get(str.substring(1, str.length() - 1));
        if (str2 != null) {
            return str2;
        }
        return str;
    }
}
