package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bt5  reason: default package */
/* loaded from: classes.dex */
public final class bt5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ defpackage.zg5 Y;
    public final /* synthetic */ android.content.Context Z;
    public final /* synthetic */ defpackage.qa4 d0;
    public final /* synthetic */ defpackage.w61 e0;
    public final /* synthetic */ defpackage.pq5 f0;
    public final /* synthetic */ me.magnum.melonds.database.MelonDatabase g0;
    public final /* synthetic */ defpackage.hp0 h0;
    public final /* synthetic */ defpackage.qa4 i0;
    public final /* synthetic */ defpackage.qa4 j0;
    public final /* synthetic */ defpackage.qa4 k0;
    public final /* synthetic */ defpackage.qa4 l0;
    public final /* synthetic */ defpackage.om6 m0;

    public bt5(boolean r1, defpackage.zg5 r2, android.content.Context r3, defpackage.qa4 r4, defpackage.w61 r5, defpackage.pq5 r6, me.magnum.melonds.database.MelonDatabase r7, defpackage.hp0 r8, defpackage.qa4 r9, defpackage.qa4 r10, defpackage.qa4 r11, defpackage.qa4 r12, defpackage.om6 r13, defpackage.r41 r14) {
            r0 = this;
            r0.X = r1
            r0.Y = r2
            r0.Z = r3
            r0.d0 = r4
            r0.e0 = r5
            r0.f0 = r6
            r0.g0 = r7
            r0.h0 = r8
            r0.i0 = r9
            r0.j0 = r10
            r0.k0 = r11
            r0.l0 = r12
            r0.m0 = r13
            r1 = 2
            r0.<init>(r1, r14)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            bt5 r0 = (defpackage.bt5) r0
            jg7 r1 = defpackage.jg7.a
            r0.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r16, java.lang.Object r17) {
            r15 = this;
            bt5 r0 = new bt5
            qa4 r12 = r15.l0
            om6 r13 = r15.m0
            boolean r1 = r15.X
            zg5 r2 = r15.Y
            android.content.Context r3 = r15.Z
            qa4 r4 = r15.d0
            w61 r5 = r15.e0
            pq5 r6 = r15.f0
            me.magnum.melonds.database.MelonDatabase r7 = r15.g0
            hp0 r8 = r15.h0
            qa4 r9 = r15.i0
            qa4 r10 = r15.j0
            qa4 r11 = r15.k0
            r14 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r11) {
            r10 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r11)
            qa4 r11 = r10.d0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r11.setValue(r0)
            boolean r11 = r10.X
            r0 = 1
            android.content.Context r1 = r10.Z
            if (r11 != 0) goto L24
            zg5 r11 = r10.Y
            boolean r11 = r11.A
            if (r11 == 0) goto L1a
            goto L24
        L1a:
            java.lang.String r11 = "Чит-коды подключены из встроенной базы Action Replay."
            android.widget.Toast r11 = android.widget.Toast.makeText(r1, r11, r0)
            r11.show()
            goto L2d
        L24:
            java.lang.String r11 = "База читов Action Replay успешно синхронизирована!"
            android.widget.Toast r11 = android.widget.Toast.makeText(r1, r11, r0)
            r11.show()
        L2d:
            qa4 r5 = r10.l0
            om6 r7 = r10.m0
            hp0 r0 = r10.h0
            w61 r1 = r10.e0
            qa4 r2 = r10.i0
            qa4 r3 = r10.j0
            qa4 r4 = r10.k0
            pq5 r6 = r10.f0
            android.content.Context r8 = r10.Z
            me.magnum.melonds.database.MelonDatabase r9 = r10.g0
            defpackage.vy7.H(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            jg7 r10 = defpackage.jg7.a
            return r10
    }
}
