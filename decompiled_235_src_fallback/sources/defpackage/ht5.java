package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ht5  reason: default package */
/* loaded from: classes.dex */
public final class ht5 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ defpackage.hp0 Y;
    public final /* synthetic */ me.magnum.melonds.domain.model.Cheat Z;
    public final /* synthetic */ boolean d0;
    public final /* synthetic */ defpackage.w61 e0;
    public final /* synthetic */ android.content.Context f0;
    public final /* synthetic */ defpackage.pq5 g0;
    public final /* synthetic */ me.magnum.melonds.database.MelonDatabase h0;
    public final /* synthetic */ defpackage.qa4 i0;
    public final /* synthetic */ defpackage.qa4 j0;
    public final /* synthetic */ defpackage.qa4 k0;
    public final /* synthetic */ defpackage.qa4 l0;
    public final /* synthetic */ defpackage.om6 m0;

    public ht5(defpackage.hp0 r1, me.magnum.melonds.domain.model.Cheat r2, boolean r3, defpackage.w61 r4, android.content.Context r5, defpackage.pq5 r6, me.magnum.melonds.database.MelonDatabase r7, defpackage.qa4 r8, defpackage.qa4 r9, defpackage.qa4 r10, defpackage.qa4 r11, defpackage.om6 r12, defpackage.r41 r13) {
            r0 = this;
            r0.Y = r1
            r0.Z = r2
            r0.d0 = r3
            r0.e0 = r4
            r0.f0 = r5
            r0.g0 = r6
            r0.h0 = r7
            r0.i0 = r8
            r0.j0 = r9
            r0.k0 = r10
            r0.l0 = r11
            r0.m0 = r12
            r1 = 2
            r0.<init>(r1, r13)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            ht5 r0 = (defpackage.ht5) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r15, java.lang.Object r16) {
            r14 = this;
            ht5 r0 = new ht5
            qa4 r11 = r14.l0
            om6 r12 = r14.m0
            hp0 r1 = r14.Y
            me.magnum.melonds.domain.model.Cheat r2 = r14.Z
            boolean r3 = r14.d0
            w61 r4 = r14.e0
            android.content.Context r5 = r14.f0
            pq5 r6 = r14.g0
            me.magnum.melonds.database.MelonDatabase r7 = r14.h0
            qa4 r8 = r14.i0
            qa4 r9 = r14.j0
            qa4 r10 = r14.k0
            r13 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r14) {
            r13 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r13.X
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Ld
            defpackage.oi2.Y(r14)
            goto L39
        Ld:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r13)
            r13 = 0
            return r13
        L14:
            defpackage.oi2.Y(r14)
            r11 = 31
            r12 = 0
            me.magnum.melonds.domain.model.Cheat r3 = r13.Z
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            boolean r10 = r13.d0
            me.magnum.melonds.domain.model.Cheat r14 = me.magnum.melonds.domain.model.Cheat.copy$default(r3, r4, r5, r7, r8, r9, r10, r11, r12)
            java.util.List r14 = defpackage.hf.b0(r14)
            r13.X = r2
            hp0 r1 = r13.Y
            h16 r1 = (defpackage.h16) r1
            java.lang.Object r14 = r1.n(r14, r13)
            if (r14 != r0) goto L39
            return r0
        L39:
            qa4 r6 = r13.l0
            om6 r8 = r13.m0
            hp0 r1 = r13.Y
            w61 r2 = r13.e0
            qa4 r3 = r13.i0
            qa4 r4 = r13.j0
            qa4 r5 = r13.k0
            pq5 r7 = r13.g0
            android.content.Context r9 = r13.f0
            me.magnum.melonds.database.MelonDatabase r10 = r13.h0
            defpackage.vy7.H(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            jg7 r13 = defpackage.jg7.a
            return r13
    }
}
