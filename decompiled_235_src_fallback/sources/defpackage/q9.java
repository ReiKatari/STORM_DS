package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q9  reason: default package */
/* loaded from: classes.dex */
public final class q9 implements defpackage.jr2 {
    public final defpackage.mv0 A;
    public final defpackage.mv0 B;
    public volatile defpackage.pb1 L;
    public final java.lang.Object R;

    public q9(defpackage.mv0 r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.R = r0
            r1.A = r2
            r1.B = r2
            return
    }

    public static defpackage.os0 a(defpackage.bp7 r3, android.content.Context r4) {
            os0 r0 = new os0
            m9 r1 = new m9
            r2 = 0
            r1.<init>(r4, r2)
            r3.getClass()
            ap7 r4 = r3.getViewModelStore()
            boolean r2 = r3 instanceof defpackage.mw2
            if (r2 == 0) goto L1a
            mw2 r3 = (defpackage.mw2) r3
            j71 r3 = r3.getDefaultViewModelCreationExtras()
            goto L1c
        L1a:
            h71 r3 = defpackage.h71.b
        L1c:
            r0.<init>(r4, r1, r3)
            return r0
    }

    @Override // defpackage.jr2
    public final java.lang.Object c() {
            r3 = this;
            pb1 r0 = r3.L
            if (r0 != 0) goto L2a
            java.lang.Object r0 = r3.R
            monitor-enter(r0)
            pb1 r1 = r3.L     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L26
            mv0 r1 = r3.A     // Catch: java.lang.Throwable -> L24
            mv0 r2 = r3.B     // Catch: java.lang.Throwable -> L24
            os0 r1 = a(r1, r2)     // Catch: java.lang.Throwable -> L24
            java.lang.Class<o9> r2 = defpackage.o9.class
            ar0 r2 = defpackage.gh5.a(r2)     // Catch: java.lang.Throwable -> L24
            qo7 r1 = r1.Z(r2)     // Catch: java.lang.Throwable -> L24
            o9 r1 = (defpackage.o9) r1     // Catch: java.lang.Throwable -> L24
            pb1 r1 = r1.b     // Catch: java.lang.Throwable -> L24
            r3.L = r1     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r3 = move-exception
            goto L28
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            goto L2a
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r3
        L2a:
            pb1 r3 = r3.L
            return r3
    }
}
