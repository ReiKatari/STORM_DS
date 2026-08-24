package defpackage;

import android.os.LocaleList;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hy3  reason: default package */
/* loaded from: classes.dex */
public final class hy3 {
    public static final hy3 b = new hy3(new iy3(new LocaleList(new Locale[0])));
    public final iy3 a;

    public hy3(iy3 iy3Var) {
        this.a = iy3Var;
    }

    public static hy3 a(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i = 0; i < length; i++) {
                localeArr[i] = Locale.forLanguageTag(split[i]);
            }
            return new hy3(new iy3(new LocaleList(localeArr)));
        }
        return b;
    }

    public final Locale b(int i) {
        return this.a.a.get(i);
    }

    public final int c() {
        return this.a.a.size();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hy3) {
            if (this.a.equals(((hy3) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
