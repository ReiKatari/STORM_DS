package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d25  reason: default package */
/* loaded from: classes.dex */
public abstract class d25 {
    public static final defpackage.c25 a = null;

    static {
            java.lang.String r0 = android.os.Build.FINGERPRINT
            if (r0 == 0) goto L1b
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            r0.getClass()
            java.lang.String r1 = "robolectric"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1b
            c25 r0 = new c25
            r0.<init>()
            goto L1c
        L1b:
            r0 = 0
        L1c:
            defpackage.d25.a = r0
            return
    }
}
