package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zt  reason: default package */
/* loaded from: classes.dex */
public final class zt extends defpackage.np2 {
    public static volatile defpackage.zt f;
    public static final defpackage.yt g = null;
    public final defpackage.sf1 e;

    static {
            yt r0 = new yt
            r1 = 0
            r0.<init>(r1)
            defpackage.zt.g = r0
            return
    }

    public zt() {
            r1 = this;
            r0 = 24
            r1.<init>(r0)
            sf1 r0 = new sf1
            r0.<init>()
            r1.e = r0
            return
    }

    public static defpackage.zt l0() {
            zt r0 = defpackage.zt.f
            if (r0 == 0) goto L7
            zt r0 = defpackage.zt.f
            return r0
        L7:
            java.lang.Class<zt> r0 = defpackage.zt.class
            monitor-enter(r0)
            zt r1 = defpackage.zt.f     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L18
            zt r1 = new zt     // Catch: java.lang.Throwable -> L16
            r1.<init>()     // Catch: java.lang.Throwable -> L16
            defpackage.zt.f = r1     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r1 = move-exception
            goto L1c
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            zt r0 = defpackage.zt.f
            return r0
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1
    }
}
