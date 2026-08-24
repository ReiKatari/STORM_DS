package defpackage;

import android.os.Build;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a90  reason: default package */
/* loaded from: classes.dex */
public abstract class a90 {
    public static final /* synthetic */ int a = 0;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            q2.e(30);
        }
        if (i >= 30) {
            q2.e(31);
        }
        if (i >= 30) {
            q2.e(33);
        }
        if (i >= 30) {
            q2.e(1000000);
        }
    }

    public static final boolean a(String str) {
        Integer num;
        String str2 = Build.VERSION.CODENAME;
        Integer num2 = 0;
        str2.getClass();
        if (!"REL".equals(str2)) {
            Locale locale = Locale.ROOT;
            String upperCase = str2.toUpperCase(locale);
            upperCase.getClass();
            if (upperCase.equals("BAKLAVA")) {
                num = num2;
            } else {
                num = null;
            }
            String upperCase2 = str.toUpperCase(locale);
            upperCase2.getClass();
            if (!upperCase2.equals("BAKLAVA")) {
                num2 = null;
            }
            if (num != null && num2 != null) {
                if (num.intValue() >= num2.intValue()) {
                    return true;
                }
            } else if (num == null && num2 == null) {
                String upperCase3 = str2.toUpperCase(locale);
                upperCase3.getClass();
                String upperCase4 = str.toUpperCase(locale);
                upperCase4.getClass();
                if (upperCase3.compareTo(upperCase4) >= 0) {
                    return true;
                }
            } else if (num != null) {
                return true;
            }
        }
        return false;
    }
}
