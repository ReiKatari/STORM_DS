package defpackage;

import android.os.LocaleList;
import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gr3  reason: default package */
/* loaded from: classes.dex */
public final class gr3 {
    public static final gr3 b = new gr3(new hr3(new LocaleList(new Locale[0])));
    public final hr3 a;

    public gr3(hr3 hr3Var) {
        this.a = hr3Var;
    }

    public static gr3 a(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i = 0; i < length; i++) {
                localeArr[i] = Locale.forLanguageTag(split[i]);
            }
            return new gr3(new hr3(new LocaleList(localeArr)));
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gr3) {
            if (this.a.equals(((gr3) obj).a)) {
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
