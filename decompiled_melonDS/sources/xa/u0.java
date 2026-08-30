package xa;

import java.util.Locale;
import java.util.StringTokenizer;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class u0 extends ua.u {
    @Override // ua.u
    public final Object b(cb.a aVar) {
        String str;
        String str2;
        String str3 = null;
        if (aVar.d0() == cb.b.NULL) {
            aVar.Z();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(aVar.b0(), "_");
        if (stringTokenizer.hasMoreElements()) {
            str = stringTokenizer.nextToken();
        } else {
            str = null;
        }
        if (stringTokenizer.hasMoreElements()) {
            str2 = stringTokenizer.nextToken();
        } else {
            str2 = null;
        }
        if (stringTokenizer.hasMoreElements()) {
            str3 = stringTokenizer.nextToken();
        }
        if (str2 == null && str3 == null) {
            return new Locale(str);
        }
        if (str3 == null) {
            return new Locale(str, str2);
        }
        return new Locale(str, str2, str3);
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        String locale;
        Locale locale2 = (Locale) obj;
        if (locale2 == null) {
            locale = null;
        } else {
            locale = locale2.toString();
        }
        cVar.Y(locale);
    }
}
