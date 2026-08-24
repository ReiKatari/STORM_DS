package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ic1  reason: default package */
/* loaded from: classes.dex */
public final class ic1 {
    public static final defpackage.ic1 a = null;
    public static final defpackage.hb4 b = null;

    static {
            ic1 r0 = new ic1
            r0.<init>()
            defpackage.ic1.a = r0
            hb4 r0 = new hb4
            r0.<init>()
            defpackage.ic1.b = r0
            return
    }

    public final java.lang.Object a(defpackage.ad r7, defpackage.s41 r8) {
            r6 = this;
            boolean r0 = r8 instanceof defpackage.hc1
            if (r0 == 0) goto L13
            r0 = r8
            hc1 r0 = (defpackage.hc1) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L18
        L13:
            hc1 r0 = new hc1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r6 = r0.Z
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r0.e0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L42
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2f
            fb4 r7 = r0.X
            defpackage.oi2.Y(r6)     // Catch: java.lang.Throwable -> L2d
            goto L69
        L2d:
            r6 = move-exception
            goto L71
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r4
        L35:
            int r7 = r0.Y
            fb4 r1 = r0.X
            ad r3 = r0.R
            defpackage.oi2.Y(r6)
            r6 = r1
            r1 = r7
            r7 = r3
            goto L57
        L42:
            defpackage.oi2.Y(r6)
            r0.R = r7
            hb4 r6 = defpackage.ic1.b
            r0.X = r6
            r1 = 0
            r0.Y = r1
            r0.e0 = r3
            java.lang.Object r3 = r6.e(r0)
            if (r3 != r8) goto L57
            goto L65
        L57:
            r0.R = r4     // Catch: java.lang.Throwable -> L6d
            r0.X = r6     // Catch: java.lang.Throwable -> L6d
            r0.Y = r1     // Catch: java.lang.Throwable -> L6d
            r0.e0 = r2     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r7 = r7.g(r0)     // Catch: java.lang.Throwable -> L6d
            if (r7 != r8) goto L66
        L65:
            return r8
        L66:
            r5 = r7
            r7 = r6
            r6 = r5
        L69:
            r7.h(r4)
            return r6
        L6d:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L71:
            r7.h(r4)
            throw r6
    }
}
