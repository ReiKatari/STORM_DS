package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mz2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mz2 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ mz2(int r2, defpackage.ls0 r3) {
            r1 = this;
            r0 = 2
            r1.A = r0
            r1.<init>()
            r1.L = r3
            r1.B = r2
            return
    }

    public /* synthetic */ mz2(int r2, defpackage.on2 r3) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            return
    }

    public /* synthetic */ mz2(defpackage.qz2 r1, int r2, defpackage.a62 r3) {
            r0 = this;
            r3 = 0
            r0.A = r3
            r0.<init>()
            r0.L = r1
            r0.B = r2
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r3 = this;
            int r0 = r3.A
            switch(r0) {
                case 0: goto L27;
                case 1: goto L1a;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.L
            ls0 r0 = (defpackage.ls0) r0
            int r3 = r3.B
            java.lang.Object r0 = r0.e
            a47 r0 = (defpackage.a47) r0
            v84 r0 = r0.b
            int r3 = r0.d(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L1a:
            int r0 = r3.B
            java.lang.Object r3 = r3.L
            on2 r3 = (defpackage.on2) r3
            ue1 r1 = new ue1
            r2 = 0
            r1.<init>(r0, r2, r3)
            return r1
        L27:
            java.lang.Object r0 = r3.L
            qz2 r0 = (defpackage.qz2) r0
            int r3 = r3.B
            d90 r1 = r0.g0
            r1.getClass()
            monitor-enter(r0)
            java.util.LinkedHashSet r1 = r0.u0     // Catch: java.lang.Throwable -> L40
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L40
            r1.remove(r3)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)
            jg7 r3 = defpackage.jg7.a
            return r3
        L40:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }
}
