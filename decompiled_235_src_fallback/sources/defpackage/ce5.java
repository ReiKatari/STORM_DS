package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ce5  reason: default package */
/* loaded from: classes.dex */
public final class ce5 extends defpackage.vl6 {
    public final defpackage.qn2 e;
    public int f;

    public ce5(long r1, defpackage.zl6 r3, defpackage.qn2 r4) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.e = r4
            r1 = 1
            r0.f = r1
            return
    }

    @Override // defpackage.vl6
    public final void c() {
            r1 = this;
            boolean r0 = r1.c
            if (r0 != 0) goto L15
            r1.l()
            r0 = 1
            r1.c = r0
            java.lang.Object r0 = defpackage.bm6.c
            monitor-enter(r0)
            r1.o()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return
        L12:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L15:
            return
    }

    @Override // defpackage.vl6
    public final defpackage.qn2 e() {
            r0 = this;
            qn2 r0 = r0.e
            return r0
    }

    @Override // defpackage.vl6
    public final boolean f() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.vl6
    public final defpackage.qn2 i() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.vl6
    public final void k() {
            r1 = this;
            int r0 = r1.f
            int r0 = r0 + 1
            r1.f = r0
            return
    }

    @Override // defpackage.vl6
    public final void l() {
            r1 = this;
            int r0 = r1.f
            int r0 = r0 + (-1)
            r1.f = r0
            if (r0 != 0) goto Lb
            r1.a()
        Lb:
            return
    }

    @Override // defpackage.vl6
    public final void m() {
            r0 = this;
            return
    }

    @Override // defpackage.vl6
    public final void n(defpackage.eq6 r1) {
            r0 = this;
            r76 r0 = defpackage.bm6.a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot modify a state object in a read-only snapshot"
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.vl6
    public final defpackage.vl6 u(defpackage.qn2 r7) {
            r6 = this;
            defpackage.bm6.c(r6)
            yd4 r0 = new yd4
            long r1 = r6.b
            zl6 r3 = r6.a
            qn2 r4 = r6.e
            r5 = 1
            qn2 r4 = defpackage.bm6.k(r7, r4, r5)
            r5 = r6
            r0.<init>(r1, r3, r4, r5)
            return r0
    }
}
