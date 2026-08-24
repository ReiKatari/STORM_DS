package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zt6  reason: default package */
/* loaded from: classes.dex */
public final class zt6 implements defpackage.ry3 {
    public final java.lang.String A;
    public volatile defpackage.ry3 B;
    public java.lang.Boolean L;
    public java.lang.reflect.Method R;
    public defpackage.bt X;
    public final java.util.Queue Y;
    public final boolean Z;

    public zt6(java.lang.String r1, java.util.concurrent.LinkedBlockingQueue r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.Y = r2
            r0.Z = r3
            return
    }

    @Override // defpackage.ry3
    public final void a(java.lang.Long r1, java.lang.Long r2) {
            r0 = this;
            ry3 r0 = r0.c()
            r0.a(r1, r2)
            return
    }

    @Override // defpackage.ry3
    public final void b(java.lang.Object r1, java.lang.String r2) {
            r0 = this;
            ry3 r0 = r0.c()
            r0.b(r1, r2)
            return
    }

    public final defpackage.ry3 c() {
            r4 = this;
            ry3 r0 = r4.B
            if (r0 == 0) goto L7
            ry3 r4 = r4.B
            return r4
        L7:
            boolean r0 = r4.Z
            if (r0 == 0) goto Le
            mb4 r4 = defpackage.mb4.A
            return r4
        Le:
            bt r0 = r4.X
            if (r0 != 0) goto L26
            bt r0 = new bt
            java.util.Queue r1 = r4.Y
            r2 = 21
            r3 = 0
            r0.<init>(r2, r3)
            r0.L = r4
            java.lang.String r2 = r4.A
            r0.B = r2
            r0.R = r1
            r4.X = r0
        L26:
            bt r4 = r4.X
            return r4
    }

    @Override // defpackage.ry3
    public final void d(java.lang.Object r1, java.io.IOException r2) {
            r0 = this;
            ry3 r0 = r0.c()
            r0.d(r1, r2)
            return
    }

    @Override // defpackage.ry3
    public final boolean e() {
            r0 = this;
            ry3 r0 = r0.c()
            boolean r0 = r0.e()
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1b
        L3:
            if (r3 == 0) goto L1d
            java.lang.Class<zt6> r0 = defpackage.zt6.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Le
            goto L1d
        Le:
            zt6 r3 = (defpackage.zt6) r3
            java.lang.String r2 = r2.A
            java.lang.String r3 = r3.A
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1b
            goto L1d
        L1b:
            r2 = 1
            return r2
        L1d:
            r2 = 0
            return r2
    }

    public final boolean f() {
            r3 = this;
            java.lang.Boolean r0 = r3.L
            if (r0 == 0) goto L9
            boolean r3 = r0.booleanValue()
            return r3
        L9:
            ry3 r0 = r3.B     // Catch: java.lang.NoSuchMethodException -> L22
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.NoSuchMethodException -> L22
            java.lang.String r1 = "log"
            java.lang.Class<au6> r2 = defpackage.au6.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L22
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L22
            r3.R = r0     // Catch: java.lang.NoSuchMethodException -> L22
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.NoSuchMethodException -> L22
            r3.L = r0     // Catch: java.lang.NoSuchMethodException -> L22
            goto L26
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.L = r0
        L26:
            java.lang.Boolean r3 = r3.L
            boolean r3 = r3.booleanValue()
            return r3
    }

    @Override // defpackage.ry3
    public final java.lang.String getName() {
            r0 = this;
            java.lang.String r0 = r0.A
            return r0
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.A
            int r0 = r0.hashCode()
            return r0
    }

    @Override // defpackage.ry3
    public final void i() {
            r0 = this;
            ry3 r0 = r0.c()
            r0.i()
            return
    }

    @Override // defpackage.ry3
    public final void l(java.lang.Object... r1) {
            r0 = this;
            ry3 r0 = r0.c()
            r0.l(r1)
            return
    }

    @Override // defpackage.ry3
    public final void o(java.lang.String r1) {
            r0 = this;
            ry3 r0 = r0.c()
            r0.o(r1)
            return
    }

    @Override // defpackage.ry3
    public final void p(java.lang.Exception r1) {
            r0 = this;
            ry3 r0 = r0.c()
            r0.p(r1)
            return
    }

    @Override // defpackage.ry3
    public final void q(java.lang.String r1) {
            r0 = this;
            ry3 r0 = r0.c()
            r0.q(r1)
            return
    }

    @Override // defpackage.ry3
    public final void t(java.lang.Object r1) {
            r0 = this;
            ry3 r0 = r0.c()
            r0.t(r1)
            return
    }

    @Override // defpackage.ry3
    public final void u(java.lang.Object r1) {
            r0 = this;
            ry3 r0 = r0.c()
            r0.u(r1)
            return
    }

    @Override // defpackage.ry3
    public final void v(java.lang.String r1, java.lang.Exception r2) {
            r0 = this;
            ry3 r0 = r0.c()
            r0.v(r1, r2)
            return
    }

    @Override // defpackage.ry3
    public final void x(java.lang.Object... r1) {
            r0 = this;
            ry3 r0 = r0.c()
            r0.x(r1)
            return
    }
}
