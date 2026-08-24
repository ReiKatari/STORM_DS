package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nm6  reason: default package */
/* loaded from: classes.dex */
public final class nm6 extends defpackage.hq6 {
    public defpackage.yv4 c;
    public int d;

    public nm6(long r1, defpackage.yv4 r3) {
            r0 = this;
            r0.<init>(r1)
            r0.c = r3
            return
    }

    @Override // defpackage.hq6
    public final void a(defpackage.hq6 r3) {
            r2 = this;
            r3.getClass()
            nm6 r3 = (defpackage.nm6) r3
            java.lang.Object r0 = defpackage.ak7.g
            monitor-enter(r0)
            yv4 r1 = r3.c     // Catch: java.lang.Throwable -> L12
            r2.c = r1     // Catch: java.lang.Throwable -> L12
            int r3 = r3.d     // Catch: java.lang.Throwable -> L12
            r2.d = r3     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return
        L12:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.hq6
    public final defpackage.hq6 b(long r2) {
            r1 = this;
            nm6 r0 = new nm6
            yv4 r1 = r1.c
            r0.<init>(r2, r1)
            return r0
    }
}
