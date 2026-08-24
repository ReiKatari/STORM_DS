package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ex6  reason: default package */
/* loaded from: classes.dex */
public final class ex6 implements defpackage.go3, java.io.Serializable {
    public defpackage.on2 A;
    public volatile java.lang.Object B;
    public final java.lang.Object L;

    public ex6(defpackage.on2 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            xd5 r1 = defpackage.xd5.u0
            r0.B = r1
            r0.L = r0
            return
    }

    public final boolean a() {
            r1 = this;
            java.lang.Object r1 = r1.B
            xd5 r0 = defpackage.xd5.u0
            if (r1 == r0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // defpackage.go3
    public final java.lang.Object getValue() {
            r3 = this;
            java.lang.Object r0 = r3.B
            xd5 r1 = defpackage.xd5.u0
            if (r0 == r1) goto L7
            return r0
        L7:
            java.lang.Object r0 = r3.L
            monitor-enter(r0)
            java.lang.Object r2 = r3.B     // Catch: java.lang.Throwable -> L1f
            if (r2 == r1) goto Lf
            goto L1d
        Lf:
            on2 r1 = r3.A     // Catch: java.lang.Throwable -> L1f
            r1.getClass()     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r1.c()     // Catch: java.lang.Throwable -> L1f
            r3.B = r2     // Catch: java.lang.Throwable -> L1f
            r1 = 0
            r3.A = r1     // Catch: java.lang.Throwable -> L1f
        L1d:
            monitor-exit(r0)
            return r2
        L1f:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public final java.lang.String toString() {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 == 0) goto Lf
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
        Lf:
            java.lang.String r1 = "Lazy value not initialized yet."
            return r1
    }
}
