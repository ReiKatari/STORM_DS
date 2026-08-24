package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ej1  reason: default package */
/* loaded from: classes.dex */
public final class ej1 implements defpackage.eo2 {
    public final /* synthetic */ defpackage.sb4 A;
    public final /* synthetic */ defpackage.ij1 B;
    public final /* synthetic */ defpackage.o46 L;
    public final /* synthetic */ defpackage.mm6 R;
    public final /* synthetic */ defpackage.hj1 X;

    public ej1(defpackage.sb4 r1, defpackage.ij1 r2, defpackage.p46 r3, defpackage.mm6 r4, defpackage.hj1 r5) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            px0 r5 = (defpackage.px0) r5
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r6 = r6 & 3
            r0 = 2
            if (r6 != r0) goto L1b
            r6 = r5
            xq2 r6 = (defpackage.xq2) r6
            boolean r0 = r6.E()
            if (r0 != 0) goto L17
            goto L1b
        L17:
            r6.V()
            goto L5b
        L1b:
            xq2 r5 = (defpackage.xq2) r5
            sb4 r6 = r4.A
            boolean r0 = r5.h(r6)
            ij1 r1 = r4.B
            boolean r2 = r5.h(r1)
            r0 = r0 | r2
            java.lang.Object r2 = r5.P()
            if (r0 != 0) goto L34
            vs0 r0 = defpackage.ox0.a
            if (r2 != r0) goto L40
        L34:
            t00 r2 = new t00
            r0 = 9
            mm6 r3 = r4.R
            r2.<init>(r3, r6, r1, r0)
            r5.l0(r2)
        L40:
            qn2 r2 = (defpackage.qn2) r2
            defpackage.mb3.d(r6, r2, r5)
            dj1 r0 = new dj1
            hj1 r1 = r4.X
            r2 = 0
            r0.<init>(r2, r1, r6)
            r1 = -497631156(0xffffffffe256c04c, float:-9.903649E20)
            zv0 r0 = defpackage.n16.I(r1, r0, r5)
            r1 = 384(0x180, float:5.38E-43)
            o46 r4 = r4.L
            defpackage.kn2.f(r6, r4, r0, r5, r1)
        L5b:
            jg7 r4 = defpackage.jg7.a
            return r4
    }
}
