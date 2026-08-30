package defpackage;

import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dq3  reason: default package */
/* loaded from: classes.dex */
public abstract class dq3 {
    public static String a(int i, mi2 mi2Var, String str, List list) {
        String str2;
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str3 = "";
        if ((i & 2) != 0) {
            str2 = "";
        } else {
            str2 = "[\n\t";
        }
        if ((i & 4) == 0) {
            str3 = "\n]";
        }
        if ((i & 32) != 0) {
            mi2Var = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            boolean z = true;
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            if (mi2Var != null) {
                sb.append((CharSequence) mi2Var.n(obj));
            } else {
                if (obj != null) {
                    z = obj instanceof CharSequence;
                }
                if (z) {
                    sb.append((CharSequence) obj);
                } else if (obj instanceof Character) {
                    sb.append(((Character) obj).charValue());
                } else {
                    sb.append((CharSequence) obj.toString());
                }
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static final Void b(String str) {
        throw new NoSuchElementException(str);
    }

    public static final void c(String str) {
        throw new UnsupportedOperationException(str);
    }
}
