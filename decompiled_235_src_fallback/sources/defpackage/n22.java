package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n22  reason: default package */
/* loaded from: classes.dex */
public final class n22 extends defpackage.hw6 implements defpackage.qn2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ java.lang.Object d0;
    public final /* synthetic */ java.lang.Object e0;
    public final /* synthetic */ java.lang.Object f0;

    public /* synthetic */ n22(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, defpackage.r41 r5, int r6) {
            r0 = this;
            r0.X = r6
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r0.f0 = r4
            r1 = 1
            r0.<init>(r1, r5)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.X
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r2 = r12.f0
            java.lang.Object r3 = r12.e0
            java.lang.Object r4 = r12.d0
            java.lang.Object r12 = r12.Z
            switch(r0) {
                case 0: goto L29;
                default: goto Lf;
            }
        Lf:
            r10 = r13
            r41 r10 = (defpackage.r41) r10
            n22 r5 = new n22
            r6 = r12
            ri7 r6 = (defpackage.ri7) r6
            r7 = r4
            ki7 r7 = (defpackage.ki7) r7
            r8 = r3
            java.util.Map r8 = (java.util.Map) r8
            r9 = r2
            xy0 r9 = (defpackage.xy0) r9
            r11 = 1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.lang.Object r12 = r5.s(r1)
            return r12
        L29:
            r7 = r13
            r41 r7 = (defpackage.r41) r7
            r13 = r2
            n22 r2 = new n22
            sz1 r12 = (defpackage.sz1) r12
            java.lang.String r4 = (java.lang.String) r4
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            r6 = r13
            java.lang.String r6 = (java.lang.String) r6
            r8 = 0
            r3 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.Object r12 = r2.s(r1)
            return r12
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.X
            java.lang.Object r1 = r9.f0
            java.lang.Object r2 = r9.e0
            java.lang.Object r3 = r9.d0
            java.lang.Object r4 = r9.Z
            r5 = 0
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r7 = 1
            switch(r0) {
                case 0: goto L37;
                default: goto L11;
            }
        L11:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r9.Y
            if (r8 == 0) goto L22
            if (r8 != r7) goto L1d
            defpackage.oi2.Y(r10)
            goto L36
        L1d:
            defpackage.i.m(r6)
            r10 = r5
            goto L36
        L22:
            defpackage.oi2.Y(r10)
            ri7 r4 = (defpackage.ri7) r4
            ki7 r3 = (defpackage.ki7) r3
            java.util.Map r2 = (java.util.Map) r2
            xy0 r1 = (defpackage.xy0) r1
            r9.Y = r7
            java.lang.Object r10 = defpackage.ri7.k(r4, r3, r2, r1, r9)
            if (r10 != r0) goto L36
            r10 = r0
        L36:
            return r10
        L37:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r9.Y
            if (r8 == 0) goto L48
            if (r8 != r7) goto L43
            defpackage.oi2.Y(r10)
            goto L60
        L43:
            defpackage.i.m(r6)
            r10 = r5
            goto L60
        L48:
            defpackage.oi2.Y(r10)
            sz1 r4 = (defpackage.sz1) r4
            pn5 r10 = r4.g
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = (java.lang.String) r1
            r9.Y = r7
            pl r10 = (defpackage.pl) r10
            java.lang.Object r10 = r10.e(r3, r2, r1, r9)
            if (r10 != r0) goto L60
            r10 = r0
        L60:
            return r10
    }
}
