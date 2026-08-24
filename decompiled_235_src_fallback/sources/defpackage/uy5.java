package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uy5  reason: default package */
/* loaded from: classes.dex */
public final class uy5 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public final /* synthetic */ me.magnum.melonds.ui.romlist.a Y;
    public final /* synthetic */ defpackage.pq5 Z;
    public final /* synthetic */ defpackage.w61 d0;
    public final /* synthetic */ defpackage.qa4 e0;
    public final /* synthetic */ defpackage.qa4 f0;

    public uy5(me.magnum.melonds.ui.romlist.a r1, defpackage.pq5 r2, defpackage.w61 r3, defpackage.qa4 r4, defpackage.qa4 r5, defpackage.r41 r6) {
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
            uy5 r0 = (defpackage.uy5) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r8, java.lang.Object r9) {
            r7 = this;
            uy5 r0 = new uy5
            qa4 r4 = r7.e0
            qa4 r5 = r7.f0
            me.magnum.melonds.ui.romlist.a r1 = r7.Y
            pq5 r2 = r7.Z
            w61 r3 = r7.d0
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r7) {
            r6 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r6.X
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 != r3) goto Le
            defpackage.oi2.Y(r7)
            goto L45
        Le:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r2
        L14:
            defpackage.oi2.Y(r7)
            me.magnum.melonds.ui.romlist.a r7 = r6.Y
            android.content.Context r7 = r7.requireContext()
            r7.getClass()
            pq5 r1 = r6.Z
            android.net.Uri r1 = r1.d
            x31 r4 = new x31
            r5 = 23
            r4.<init>(r5)
            me.magnum.melonds.MelonRomDecryptor r5 = me.magnum.melonds.MelonRomDecryptor.a
            me.magnum.melonds.MelonRomDecryptor$a r7 = r5.b(r7, r1, r4)
            xe1 r1 = defpackage.xk1.a
            jv2 r1 = defpackage.e04.a
            ty5 r4 = new ty5
            qa4 r5 = r6.f0
            r4.<init>(r7, r5, r2)
            r6.X = r3
            java.lang.Object r6 = defpackage.hv.d0(r1, r4, r6)
            if (r6 != r0) goto L45
            return r0
        L45:
            jg7 r6 = defpackage.jg7.a
            return r6
    }
}
