package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wb2  reason: default package */
/* loaded from: classes.dex */
public final class wb2 extends defpackage.hw6 implements defpackage.eo2 {
    public android.net.Uri[] X;
    public int Y;
    public int Z;
    public int d0;
    public /* synthetic */ java.lang.Object e0;
    public final /* synthetic */ defpackage.xb2 f0;
    public final /* synthetic */ java.util.Set g0;

    public wb2(defpackage.xb2 r1, java.util.Set r2, defpackage.r41 r3) {
            r0 = this;
            r0.f0 = r1
            r0.g0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ne2 r1 = (defpackage.ne2) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            wb2 r0 = (defpackage.wb2) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            wb2 r0 = new wb2
            xb2 r1 = r2.f0
            java.util.Set r2 = r2.g0
            r0.<init>(r1, r2, r3)
            r0.e0 = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r12) {
            r11 = this;
            java.lang.Object r0 = r11.e0
            ne2 r0 = (defpackage.ne2) r0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r11.d0
            r3 = 1
            r4 = 0
            xb2 r5 = r11.f0
            if (r2 == 0) goto L21
            if (r2 != r3) goto L1b
            int r2 = r11.Z
            int r6 = r11.Y
            android.net.Uri[] r7 = r11.X
            defpackage.oi2.Y(r12)
            goto L8b
        L1b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            return r4
        L21:
            defpackage.oi2.Y(r12)
            kd6 r12 = r5.c
            ng6 r12 = (defpackage.ng6) r12
            android.net.Uri[] r12 = r12.r()
            r5.C(r12)
            int r2 = r12.length
            r6 = 0
            r7 = r12
        L32:
            if (r6 >= r2) goto L8d
            r12 = r7[r6]
            java.lang.String r8 = r12.toString()
            r8.getClass()
            java.util.Set r9 = r11.g0
            if (r9 == 0) goto L48
            boolean r8 = r9.contains(r8)
            if (r8 != 0) goto L48
            goto L8b
        L48:
            boolean r8 = r5.p(r12)
            if (r8 != 0) goto L74
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "ROM directory permission is missing; reauthorization required for "
            r8.<init>(r9)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "FSRomsRepository"
            android.util.Log.w(r9, r8)
            kb2 r8 = r5.j(r12)
            if (r8 == 0) goto L6f
            long r8 = r8.c
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r8)
            goto L70
        L6f:
            r10 = r4
        L70:
            r5.s(r12, r10)
            goto L8b
        L74:
            android.content.Context r8 = r5.a
            qi6 r8 = defpackage.zl1.h(r8, r12)
            r11.e0 = r0
            r11.X = r7
            r11.Y = r6
            r11.Z = r2
            r11.d0 = r3
            java.lang.Object r12 = defpackage.xb2.c(r5, r12, r8, r0, r11)
            if (r12 != r1) goto L8b
            return r1
        L8b:
            int r6 = r6 + r3
            goto L32
        L8d:
            jg7 r11 = defpackage.jg7.a
            return r11
    }
}
