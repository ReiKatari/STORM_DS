package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lz2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lz2 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.qz2 B;
    public final /* synthetic */ int L;
    public final /* synthetic */ java.util.List R;

    public /* synthetic */ lz2(defpackage.qz2 r2, int r3, java.util.List r4) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            return
    }

    public /* synthetic */ lz2(defpackage.qz2 r1, int r2, java.util.List r3, boolean r4) {
            r0 = this;
            r4 = 1
            r0.A = r4
            r0.<init>()
            r0.B = r1
            r0.L = r2
            r0.R = r3
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r3 = this;
            int r0 = r3.A
            switch(r0) {
                case 0: goto L27;
                default: goto L5;
            }
        L5:
            qz2 r0 = r3.B
            int r3 = r3.L
            d90 r1 = r0.g0
            r1.getClass()
            yz2 r1 = r0.s0     // Catch: java.io.IOException -> L24
            a62 r2 = defpackage.a62.CANCEL     // Catch: java.io.IOException -> L24
            r1.v(r3, r2)     // Catch: java.io.IOException -> L24
            monitor-enter(r0)     // Catch: java.io.IOException -> L24
            java.util.LinkedHashSet r1 = r0.u0     // Catch: java.lang.Throwable -> L21
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L21
            r1.remove(r3)     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)     // Catch: java.io.IOException -> L24
            goto L24
        L21:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.io.IOException -> L24
            throw r3     // Catch: java.io.IOException -> L24
        L24:
            jg7 r3 = defpackage.jg7.a
            return r3
        L27:
            qz2 r0 = r3.B
            int r3 = r3.L
            d90 r1 = r0.g0
            r1.getClass()
            yz2 r1 = r0.s0     // Catch: java.io.IOException -> L46
            a62 r2 = defpackage.a62.CANCEL     // Catch: java.io.IOException -> L46
            r1.v(r3, r2)     // Catch: java.io.IOException -> L46
            monitor-enter(r0)     // Catch: java.io.IOException -> L46
            java.util.LinkedHashSet r1 = r0.u0     // Catch: java.lang.Throwable -> L43
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L43
            r1.remove(r3)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)     // Catch: java.io.IOException -> L46
            goto L46
        L43:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.io.IOException -> L46
            throw r3     // Catch: java.io.IOException -> L46
        L46:
            jg7 r3 = defpackage.jg7.a
            return r3
    }
}
