package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sq  reason: default package */
/* loaded from: classes.dex */
public abstract class sq {
    public static android.os.LocaleList a(java.lang.Object r0) {
            android.app.LocaleManager r0 = (android.app.LocaleManager) r0
            android.os.LocaleList r0 = r0.getApplicationLocales()
            return r0
    }

    public static void b(java.lang.Object r0, android.os.LocaleList r1) {
            android.app.LocaleManager r0 = (android.app.LocaleManager) r0
            r0.setApplicationLocales(r1)
            return
    }
}
