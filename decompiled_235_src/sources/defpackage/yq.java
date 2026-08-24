package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yq  reason: default package */
/* loaded from: classes.dex */
public abstract class yq {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static hy3 b(Configuration configuration) {
        return hy3.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(hy3 hy3Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(hy3Var.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, hy3 hy3Var) {
        configuration.setLocales(LocaleList.forLanguageTags(hy3Var.a.a.toLanguageTags()));
    }
}
