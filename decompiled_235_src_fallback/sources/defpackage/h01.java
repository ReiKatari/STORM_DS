package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h01  reason: default package */
/* loaded from: classes.dex */
public abstract class h01 {
    public static boolean a() {
            org.conscrypt.Conscrypt$Version r0 = org.conscrypt.Conscrypt.version()
            if (r0 != 0) goto L7
            goto L2a
        L7:
            int r1 = r0.major()
            r2 = 2
            r3 = 1
            if (r1 == r2) goto L16
            int r0 = r0.major()
            if (r0 <= r2) goto L2a
            goto L29
        L16:
            int r1 = r0.minor()
            if (r1 == r3) goto L23
            int r0 = r0.minor()
            if (r0 <= r3) goto L2a
            goto L29
        L23:
            int r0 = r0.patch()
            if (r0 < 0) goto L2a
        L29:
            return r3
        L2a:
            r0 = 0
            return r0
    }
}
