package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nz6  reason: default package */
/* loaded from: classes.dex */
public final class nz6 extends defpackage.mz6 {
    public final java.lang.Runnable L;

    public nz6(java.lang.Runnable r1, long r2, boolean r4) {
            r0 = this;
            r0.<init>(r2, r4)
            r0.L = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r0 = this;
            java.lang.Runnable r0 = r0.L
            r0.run()
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Task["
            r0.<init>(r1)
            java.lang.Runnable r1 = r4.L
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            r2 = 64
            r0.append(r2)
            java.lang.String r1 = defpackage.nc1.P(r1)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            long r2 = r4.A
            r0.append(r2)
            r0.append(r1)
            boolean r4 = r4.B
            if (r4 == 0) goto L34
            java.lang.String r4 = "Blocking"
            goto L36
        L34:
            java.lang.String r4 = "Non-blocking"
        L36:
            r1 = 93
            java.lang.String r4 = defpackage.lb1.q(r0, r4, r1)
            return r4
    }
}
