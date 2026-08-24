package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u81  reason: default package */
/* loaded from: classes.dex */
public final class u81 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ defpackage.l61 Y;
    public final /* synthetic */ defpackage.m16 Z;
    public final /* synthetic */ boolean d0;
    public final /* synthetic */ boolean e0;
    public final /* synthetic */ defpackage.qn2 f0;

    public u81(defpackage.l61 r1, defpackage.m16 r2, boolean r3, boolean r4, defpackage.qn2 r5, defpackage.r41 r6) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r3
            r0.e0 = r4
            r0.f0 = r5
            r1 = 2
            r0.<init>(r1, r6)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            u81 r0 = (defpackage.u81) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r8, java.lang.Object r9) {
            r7 = this;
            u81 r0 = new u81
            boolean r4 = r7.e0
            qn2 r5 = r7.f0
            l61 r1 = r7.Y
            m16 r2 = r7.Z
            boolean r3 = r7.d0
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r10) {
            r9 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r9.X
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Ld
            defpackage.oi2.Y(r10)
            return r10
        Ld:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            r9 = 0
            return r9
        L14:
            defpackage.oi2.Y(r10)
            t81 r3 = new t81
            qn2 r7 = r9.f0
            r8 = 0
            m16 r4 = r9.Z
            boolean r5 = r9.d0
            boolean r6 = r9.e0
            r3.<init>(r4, r5, r6, r7, r8)
            r9.X = r2
            l61 r10 = r9.Y
            java.lang.Object r9 = defpackage.hv.d0(r10, r3, r9)
            if (r9 != r0) goto L30
            return r0
        L30:
            return r9
    }
}
