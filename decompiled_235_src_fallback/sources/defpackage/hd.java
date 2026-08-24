package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hd  reason: default package */
/* loaded from: classes.dex */
public abstract class hd {
    public static final java.lang.Class a = null;
    public static final boolean b = false;

    static {
            java.lang.String r0 = "libcore.io.Memory"
            r1 = 0
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L8
            goto L9
        L8:
            r0 = r1
        L9:
            defpackage.hd.a = r0
            java.lang.String r0 = "org.robolectric.Robolectric"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L11
        L11:
            if (r1 == 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            defpackage.hd.b = r0
            return
    }

    public static boolean a() {
            java.lang.Class r0 = defpackage.hd.a
            if (r0 == 0) goto La
            boolean r0 = defpackage.hd.b
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
