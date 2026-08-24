package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bq6  reason: default package */
/* loaded from: classes.dex */
public final class bq6 extends defpackage.hq6 {
    public defpackage.h1 c;
    public int d;
    public int e;

    public bq6(long r1, defpackage.h1 r3) {
            r0 = this;
            r0.<init>(r1)
            r0.c = r3
            return
    }

    @Override // defpackage.hq6
    public final void a(defpackage.hq6 r3) {
            r2 = this;
            java.lang.Object r0 = defpackage.ge7.i
            monitor-enter(r0)
            r3.getClass()     // Catch: java.lang.Throwable -> L1c
            r1 = r3
            bq6 r1 = (defpackage.bq6) r1     // Catch: java.lang.Throwable -> L1c
            h1 r1 = r1.c     // Catch: java.lang.Throwable -> L1c
            r2.c = r1     // Catch: java.lang.Throwable -> L1c
            r1 = r3
            bq6 r1 = (defpackage.bq6) r1     // Catch: java.lang.Throwable -> L1c
            int r1 = r1.d     // Catch: java.lang.Throwable -> L1c
            r2.d = r1     // Catch: java.lang.Throwable -> L1c
            bq6 r3 = (defpackage.bq6) r3     // Catch: java.lang.Throwable -> L1c
            int r3 = r3.e     // Catch: java.lang.Throwable -> L1c
            r2.e = r3     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return
        L1c:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.hq6
    public final defpackage.hq6 b(long r2) {
            r1 = this;
            bq6 r0 = new bq6
            h1 r1 = r1.c
            r0.<init>(r2, r1)
            return r0
    }
}
