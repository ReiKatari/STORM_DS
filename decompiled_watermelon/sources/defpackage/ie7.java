package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ie7  reason: default package */
/* loaded from: classes.dex */
public abstract class ie7 {
    public static final void a(vq2 vq2Var, String str, String str2) {
        vq2Var.getClass();
        str.getClass();
        str2.getClass();
        ArrayList arrayList = vq2Var.b;
        arrayList.add(str);
        arrayList.add(zg6.Z0(str2).toString());
    }

    public static final void b(String str) {
        str.getClass();
        if (str.length() > 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ('!' > charAt || charAt >= 127) {
                    StringBuilder sb = new StringBuilder("Unexpected char 0x");
                    iq2.g(16);
                    String num = Integer.toString(charAt, 16);
                    num.getClass();
                    if (num.length() < 2) {
                        num = "0".concat(num);
                    }
                    sb.append(num);
                    sb.append(" at ");
                    sb.append(i);
                    sb.append(" in header name: ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
            return;
        }
        i.i("name is empty");
    }

    public static final void c(String str, String str2) {
        String concat;
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                iq2.g(16);
                String num = Integer.toString(charAt, 16);
                num.getClass();
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(i);
                sb.append(" in ");
                sb.append(str2);
                sb.append(" value");
                if (gk7.l(str2)) {
                    concat = "";
                } else {
                    concat = ": ".concat(str);
                }
                sb.append(concat);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static void d(Window window, boolean z) {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            o2.i(window, z);
        } else if (i2 >= 30) {
            o2.h(window, z);
        } else {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility & (-1793);
            } else {
                i = systemUiVisibility | 1792;
            }
            decorView.setSystemUiVisibility(i);
        }
    }
}
