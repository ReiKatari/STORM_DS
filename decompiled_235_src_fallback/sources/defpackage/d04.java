package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d04  reason: default package */
/* loaded from: classes.dex */
public abstract class d04 {
    public static final defpackage.fb6 a = null;

    static {
            fb6 r0 = new fb6
            java.lang.String r1 = "MagnifierPositionInRoot"
            r0.<init>(r1)
            defpackage.d04.a = r0
            return
    }

    public static boolean a() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}
