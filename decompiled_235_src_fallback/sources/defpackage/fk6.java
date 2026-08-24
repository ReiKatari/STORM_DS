package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fk6  reason: default package */
/* loaded from: classes.dex */
public final class fk6 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ float Z;
    public final /* synthetic */ float d0;
    public final /* synthetic */ float e0;

    public fk6(float r1, float r2, float r3, defpackage.r41 r4) {
            r0 = this;
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            cd r1 = (defpackage.cd) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            fk6 r0 = (defpackage.fk6) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r4, java.lang.Object r5) {
            r3 = this;
            fk6 r0 = new fk6
            float r1 = r3.d0
            float r2 = r3.e0
            float r3 = r3.Z
            r0.<init>(r3, r1, r2, r4)
            r0.Y = r5
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r13) {
            r12 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r12.X
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Ld
            defpackage.oi2.Y(r13)
            goto L6b
        Ld:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            r12 = 0
            return r12
        L14:
            defpackage.oi2.Y(r13)
            java.lang.Object r13 = r12.Y
            cd r13 = (defpackage.cd) r13
            ah5 r1 = new ah5
            r1.<init>()
            float r3 = r12.Z
            r1.A = r3
            gn r5 = defpackage.nb3.b(r3)
            java.lang.Float r10 = new java.lang.Float
            float r3 = r12.d0
            r10.<init>(r3)
            sc7 r7 = defpackage.jk6.b
            java.lang.Float r3 = new java.lang.Float
            float r4 = r12.e0
            r3.<init>(r4)
            qk4 r4 = new qk4
            r6 = 18
            r4.<init>(r6, r13, r1)
            r12.X = r2
            java.lang.Object r9 = r5.d()
            wc7 r8 = defpackage.nw7.e0
            jz6 r6 = new jz6
            qn2 r13 = r8.a
            java.lang.Object r13 = r13.g(r3)
            r11 = r13
            ap r11 = (defpackage.ap) r11
            r6.<init>(r7, r8, r9, r10, r11)
            uo r13 = r5.c
            long r8 = r13.R
            eb4 r13 = r5.f
            r10 = r4
            dn r4 = new dn
            r11 = 0
            r7 = r6
            r6 = r3
            r4.<init>(r5, r6, r7, r8, r10, r11)
            java.lang.Object r12 = defpackage.eb4.a(r13, r4, r12)
            if (r12 != r0) goto L6b
            return r0
        L6b:
            jg7 r12 = defpackage.jg7.a
            return r12
    }
}
