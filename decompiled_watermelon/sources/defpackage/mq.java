package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mq  reason: default package */
/* loaded from: classes.dex */
public abstract class mq {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static gr3 b(Configuration configuration) {
        return gr3.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(gr3 gr3Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(gr3Var.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, gr3 gr3Var) {
        configuration.setLocales(LocaleList.forLanguageTags(gr3Var.a.a.toLanguageTags()));
    }
}
