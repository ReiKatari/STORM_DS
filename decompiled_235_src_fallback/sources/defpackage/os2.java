package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: os2  reason: default package */
/* loaded from: classes.dex */
public final class os2 extends defpackage.oa4 {
    @Override // defpackage.oa4
    public final defpackage.oa4 C(defpackage.qn2 r2, defpackage.qn2 r3) {
            r1 = this;
            r5 r1 = new r5
            r0 = 11
            r1.<init>(r0, r2, r3)
            y00 r2 = new y00
            r3 = 25
            r2.<init>(r3, r1)
            java.lang.Object r1 = defpackage.bm6.e(r2)
            vl6 r1 = (defpackage.vl6) r1
            oa4 r1 = (defpackage.oa4) r1
            return r1
    }

    @Override // defpackage.oa4, defpackage.vl6
    public final void c() {
            r1 = this;
            java.lang.Object r0 = defpackage.bm6.c
            monitor-enter(r0)
            r1.o()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // defpackage.oa4, defpackage.vl6
    public final void k() {
            r0 = this;
            defpackage.ak7.K0()
            r0 = 0
            throw r0
    }

    @Override // defpackage.oa4, defpackage.vl6
    public final void l() {
            r0 = this;
            defpackage.ak7.K0()
            r0 = 0
            throw r0
    }

    @Override // defpackage.oa4, defpackage.vl6
    public final void m() {
            r0 = this;
            defpackage.bm6.a()
            return
    }

    @Override // defpackage.oa4, defpackage.vl6
    public final defpackage.vl6 u(defpackage.qn2 r2) {
            r1 = this;
            ns2 r1 = new ns2
            r0 = 0
            r1.<init>(r0, r2)
            y00 r2 = new y00
            r0 = 25
            r2.<init>(r0, r1)
            java.lang.Object r1 = defpackage.bm6.e(r2)
            vl6 r1 = (defpackage.vl6) r1
            ce5 r1 = (defpackage.ce5) r1
            return r1
    }

    @Override // defpackage.oa4
    public final defpackage.qo2 w() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot"
            r1.<init>(r0)
            throw r1
    }
}
