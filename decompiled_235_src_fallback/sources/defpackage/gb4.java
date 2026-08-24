package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gb4  reason: default package */
/* loaded from: classes.dex */
public final class gb4 implements defpackage.qj0, defpackage.zr7 {
    public final defpackage.rj0 A;
    public final /* synthetic */ defpackage.hb4 B;

    public gb4(defpackage.hb4 r1, defpackage.rj0 r2) {
            r0 = this;
            r0.<init>()
            r0.B = r1
            r0.A = r2
            return
    }

    @Override // defpackage.zr7
    public final void a(defpackage.p96 r1, int r2) {
            r0 = this;
            rj0 r0 = r0.A
            r0.a(r1, r2)
            return
    }

    @Override // defpackage.r41
    public final defpackage.l61 b() {
            r0 = this;
            rj0 r0 = r0.A
            l61 r0 = r0.X
            return r0
    }

    @Override // defpackage.r41
    public final void i(java.lang.Object r1) {
            r0 = this;
            rj0 r0 = r0.A
            r0.i(r1)
            return
    }

    @Override // defpackage.qj0
    public final defpackage.gr1 j(java.lang.Object r2, defpackage.fo2 r3) {
            r1 = this;
            jg7 r2 = (defpackage.jg7) r2
            ov4 r3 = new ov4
            hb4 r0 = r1.B
            r3.<init>(r0, r1)
            rj0 r1 = r1.A
            gr1 r1 = r1.K(r2, r3)
            if (r1 == 0) goto L17
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.hb4.f0
            r3 = 0
            r2.set(r0, r3)
        L17:
            return r1
    }

    @Override // defpackage.qj0
    public final void t(java.lang.Object r2, defpackage.fo2 r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.hb4.f0
            r3 = 0
            hb4 r0 = r1.B
            r2.set(r0, r3)
            bg2 r2 = new bg2
            r3 = 13
            r2.<init>(r3, r0, r1)
            rj0 r1 = r1.A
            jg7 r3 = defpackage.jg7.a
            r1.G(r3, r2)
            return
    }

    @Override // defpackage.qj0
    public final boolean w(java.lang.Throwable r1) {
            r0 = this;
            rj0 r0 = r0.A
            boolean r0 = r0.w(r1)
            return r0
    }

    @Override // defpackage.qj0
    public final void y(java.lang.Object r1) {
            r0 = this;
            rj0 r0 = r0.A
            r0.y(r1)
            return
    }
}
