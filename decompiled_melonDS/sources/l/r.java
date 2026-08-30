package l;

import android.content.res.Configuration;
import android.os.LocaleList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class r {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static u5.c b(Configuration configuration) {
        return u5.c.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(u5.c cVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(cVar.f13491a.f13492a.toLanguageTags()));
    }

    public static void d(Configuration configuration, u5.c cVar) {
        configuration.setLocales(LocaleList.forLanguageTags(cVar.f13491a.f13492a.toLanguageTags()));
    }
}
