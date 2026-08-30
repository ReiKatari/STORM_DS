package u5;

import android.os.LocaleList;
import java.util.Locale;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final c f13490b = new c(new d(new LocaleList(new Locale[0])));

    /* renamed from: a  reason: collision with root package name */
    public final d f13491a;

    public c(d dVar) {
        this.f13491a = dVar;
    }

    public static c a(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i2 = 0; i2 < length; i2++) {
                String str2 = split[i2];
                int i10 = b.f13489a;
                localeArr[i2] = Locale.forLanguageTag(str2);
            }
            return new c(new d(new LocaleList(localeArr)));
        }
        return f13490b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (this.f13491a.equals(((c) obj).f13491a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13491a.f13492a.hashCode();
    }

    public final String toString() {
        return this.f13491a.f13492a.toString();
    }
}
