package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cz6  reason: default package */
/* loaded from: classes.dex */
public final class cz6 extends defpackage.dm5 implements defpackage.eo2 {
    public int L;
    public /* synthetic */ java.lang.Object R;
    public final /* synthetic */ defpackage.w61 X;
    public final /* synthetic */ defpackage.j25 Y;
    public final /* synthetic */ defpackage.qn2 Z;
    public final /* synthetic */ defpackage.qn2 d0;
    public final /* synthetic */ defpackage.fo2 e0;
    public final /* synthetic */ defpackage.qn2 f0;

    public cz6(defpackage.w61 r1, defpackage.j25 r2, defpackage.qn2 r3, defpackage.qn2 r4, defpackage.fo2 r5, defpackage.qn2 r6, defpackage.r41 r7) {
            r0 = this;
            r0.X = r1
            r0.Y = r2
            r0.Z = r3
            r0.d0 = r4
            r0.e0 = r5
            r0.f0 = r6
            r1 = 2
            r0.<init>(r1, r7)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            mw6 r1 = (defpackage.mw6) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            cz6 r0 = (defpackage.cz6) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r9, java.lang.Object r10) {
            r8 = this;
            cz6 r0 = new cz6
            fo2 r5 = r8.e0
            qn2 r6 = r8.f0
            w61 r1 = r8.X
            j25 r2 = r8.Y
            qn2 r3 = r8.Z
            qn2 r4 = r8.d0
            r7 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0.R = r10
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r12) {
            r11 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r11.L
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Ld
            defpackage.oi2.Y(r12)
            goto L32
        Ld:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            r11 = 0
            return r11
        L14:
            defpackage.oi2.Y(r12)
            java.lang.Object r12 = r11.R
            r3 = r12
            mw6 r3 = (defpackage.mw6) r3
            r11.L = r2
            w61 r4 = r11.X
            j25 r5 = r11.Y
            qn2 r6 = r11.Z
            qn2 r7 = r11.d0
            fo2 r8 = r11.e0
            qn2 r9 = r11.f0
            r10 = r11
            java.lang.Object r11 = defpackage.hz6.g(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r11 != r0) goto L32
            return r0
        L32:
            jg7 r11 = defpackage.jg7.a
            return r11
    }
}
