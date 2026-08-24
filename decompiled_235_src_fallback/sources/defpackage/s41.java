package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s41  reason: default package */
/* loaded from: classes.dex */
public abstract class s41 extends defpackage.d20 {
    public final defpackage.l61 B;
    public transient defpackage.r41 L;

    public s41(defpackage.r41 r2) {
            r1 = this;
            if (r2 == 0) goto L7
            l61 r0 = r2.b()
            goto L8
        L7:
            r0 = 0
        L8:
            r1.<init>(r2, r0)
            return
    }

    public s41(defpackage.r41 r1, defpackage.l61 r2) {
            r0 = this;
            r0.<init>(r1)
            r0.B = r2
            return
    }

    @Override // defpackage.r41
    public defpackage.l61 b() {
            r0 = this;
            l61 r0 = r0.B
            r0.getClass()
            return r0
    }

    @Override // defpackage.d20
    public void u() {
            r3 = this;
            r41 r0 = r3.L
            if (r0 == 0) goto L23
            if (r0 == r3) goto L23
            l61 r1 = r3.b()
            d90 r2 = defpackage.d90.r0
            j61 r1 = r1.Z(r2)
            r1.getClass()
            n61 r1 = (defpackage.n61) r1
            nk1 r0 = (defpackage.nk1) r0
            r0.l()
            rj0 r0 = r0.n()
            if (r0 == 0) goto L23
            r0.o()
        L23:
            zu0 r0 = defpackage.zu0.B
            r3.L = r0
            return
    }
}
