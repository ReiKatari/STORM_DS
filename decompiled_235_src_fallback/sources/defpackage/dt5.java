package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dt5  reason: default package */
/* loaded from: classes.dex */
public final class dt5 implements defpackage.go2 {
    public final /* synthetic */ java.util.ArrayList A;
    public final /* synthetic */ defpackage.w61 B;
    public final /* synthetic */ defpackage.hp0 L;
    public final /* synthetic */ defpackage.qa4 R;
    public final /* synthetic */ android.content.Context X;
    public final /* synthetic */ defpackage.pq5 Y;
    public final /* synthetic */ defpackage.qa4 Z;
    public final /* synthetic */ me.magnum.melonds.database.MelonDatabase d0;
    public final /* synthetic */ defpackage.qa4 e0;
    public final /* synthetic */ defpackage.qa4 f0;
    public final /* synthetic */ defpackage.om6 g0;

    public dt5(java.util.ArrayList r1, defpackage.w61 r2, defpackage.hp0 r3, defpackage.qa4 r4, android.content.Context r5, defpackage.pq5 r6, defpackage.qa4 r7, me.magnum.melonds.database.MelonDatabase r8, defpackage.qa4 r9, defpackage.qa4 r10, defpackage.om6 r11) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            r0.Y = r6
            r0.Z = r7
            r0.d0 = r8
            r0.e0 = r9
            r0.f0 = r10
            r0.g0 = r11
            return
    }

    @Override // defpackage.go2
    public final java.lang.Object l(java.lang.Object r21, java.lang.Object r22, java.lang.Object r23, java.lang.Object r24) {
            r20 = this;
            r0 = r20
            r1 = r21
            lp3 r1 = (defpackage.lp3) r1
            r2 = r22
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r23
            px0 r3 = (defpackage.px0) r3
            r4 = r24
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = r4 & 6
            if (r5 != 0) goto L2c
            r5 = r3
            xq2 r5 = (defpackage.xq2) r5
            boolean r1 = r5.f(r1)
            if (r1 == 0) goto L29
            r1 = 4
            goto L2a
        L29:
            r1 = 2
        L2a:
            r1 = r1 | r4
            goto L2d
        L2c:
            r1 = r4
        L2d:
            r4 = r4 & 48
            if (r4 != 0) goto L40
            r4 = r3
            xq2 r4 = (defpackage.xq2) r4
            boolean r4 = r4.d(r2)
            if (r4 == 0) goto L3d
            r4 = 32
            goto L3f
        L3d:
            r4 = 16
        L3f:
            r1 = r1 | r4
        L40:
            r4 = r1 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            r6 = 1
            r7 = 0
            if (r4 == r5) goto L4a
            r4 = r6
            goto L4b
        L4a:
            r4 = r7
        L4b:
            r1 = r1 & r6
            xq2 r3 = (defpackage.xq2) r3
            boolean r1 = r3.S(r1, r4)
            if (r1 == 0) goto Le3
            java.util.ArrayList r1 = r0.A
            java.lang.Object r1 = r1.get(r2)
            r9 = r1
            me.magnum.melonds.domain.model.Cheat r9 = (me.magnum.melonds.domain.model.Cheat) r9
            r1 = 125486896(0x77ac730, float:1.8866446E-34)
            r3.b0(r1)
            w61 r1 = r0.B
            boolean r1 = r3.h(r1)
            hp0 r2 = r0.L
            boolean r2 = r3.h(r2)
            r1 = r1 | r2
            qa4 r2 = r0.R
            boolean r2 = r3.f(r2)
            r1 = r1 | r2
            android.content.Context r2 = r0.X
            boolean r2 = r3.h(r2)
            r1 = r1 | r2
            pq5 r2 = r0.Y
            boolean r2 = r3.h(r2)
            r1 = r1 | r2
            qa4 r2 = r0.Z
            boolean r4 = r3.f(r2)
            r1 = r1 | r4
            me.magnum.melonds.database.MelonDatabase r4 = r0.d0
            boolean r4 = r3.h(r4)
            r1 = r1 | r4
            qa4 r4 = r0.e0
            boolean r4 = r3.f(r4)
            r1 = r1 | r4
            qa4 r4 = r0.f0
            boolean r4 = r3.f(r4)
            r1 = r1 | r4
            om6 r4 = r0.g0
            boolean r4 = r3.f(r4)
            r1 = r1 | r4
            boolean r4 = r3.f(r9)
            r1 = r1 | r4
            java.lang.Object r4 = r3.P()
            if (r1 != 0) goto Lb7
            vs0 r1 = defpackage.ox0.a
            if (r4 != r1) goto Lda
        Lb7:
            at5 r8 = new at5
            qa4 r1 = r0.f0
            om6 r4 = r0.g0
            w61 r10 = r0.B
            hp0 r11 = r0.L
            android.content.Context r12 = r0.X
            pq5 r13 = r0.Y
            me.magnum.melonds.database.MelonDatabase r14 = r0.d0
            qa4 r15 = r0.R
            qa4 r0 = r0.e0
            r17 = r0
            r18 = r1
            r16 = r2
            r19 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3.l0(r8)
            r4 = r8
        Lda:
            qn2 r4 = (defpackage.qn2) r4
            defpackage.vy7.A(r9, r4, r3, r7)
            r3.p(r7)
            goto Le6
        Le3:
            r3.V()
        Le6:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
