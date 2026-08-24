package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yq  reason: default package */
/* loaded from: classes.dex */
public abstract class yq {
    public static void a(android.content.res.Configuration r1, android.content.res.Configuration r2, android.content.res.Configuration r3) {
            android.os.LocaleList r1 = r1.getLocales()
            android.os.LocaleList r0 = r2.getLocales()
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L15
            r3.setLocales(r0)
            java.util.Locale r1 = r2.locale
            r3.locale = r1
        L15:
            return
    }

    public static defpackage.hy3 b(android.content.res.Configuration r0) {
            android.os.LocaleList r0 = r0.getLocales()
            java.lang.String r0 = r0.toLanguageTags()
            hy3 r0 = defpackage.hy3.a(r0)
            return r0
    }

    public static void c(defpackage.hy3 r0) {
            iy3 r0 = r0.a
            android.os.LocaleList r0 = r0.a
            java.lang.String r0 = r0.toLanguageTags()
            android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r0)
            android.os.LocaleList.setDefault(r0)
            return
    }

    public static void d(android.content.res.Configuration r0, defpackage.hy3 r1) {
            iy3 r1 = r1.a
            android.os.LocaleList r1 = r1.a
            java.lang.String r1 = r1.toLanguageTags()
            android.os.LocaleList r1 = android.os.LocaleList.forLanguageTags(r1)
            r0.setLocales(r1)
            return
    }
}
