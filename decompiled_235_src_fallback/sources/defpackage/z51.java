package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z51  reason: default package */
/* loaded from: classes.dex */
public final class z51 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.zy4 Z;
    public final /* synthetic */ defpackage.g17 d0;

    public /* synthetic */ z51(defpackage.zy4 r1, defpackage.g17 r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Z = r1
            r0.d0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L21;
                case 1: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            z51 r2 = (defpackage.z51) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            z51 r2 = (defpackage.z51) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            z51 r2 = (defpackage.z51) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            switch(r4) {
                case 0: goto L1b;
                case 1: goto L10;
                default: goto L5;
            }
        L5:
            z51 r4 = new z51
            g17 r0 = r2.d0
            r1 = 2
            zy4 r2 = r2.Z
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            z51 r4 = new z51
            g17 r0 = r2.d0
            r1 = 1
            zy4 r2 = r2.Z
            r4.<init>(r2, r0, r3, r1)
            return r4
        L1b:
            z51 r4 = new z51
            g17 r0 = r2.d0
            r1 = 0
            zy4 r2 = r2.Z
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.X
            g17 r1 = r14.d0
            zy4 r2 = r14.Z
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            jg7 r4 = defpackage.jg7.a
            r5 = 0
            r6 = 1
            switch(r0) {
                case 0: goto L93;
                case 1: goto L6c;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r14.Y
            if (r7 == 0) goto L20
            if (r7 != r6) goto L1b
            defpackage.oi2.Y(r15)
            goto L6b
        L1b:
            defpackage.i.m(r3)
            r4 = r5
            goto L6b
        L20:
            defpackage.oi2.Y(r15)
            r14.Y = r6
            cz3 r15 = new cz3
            r3 = 0
            r15.<init>(r1, r3)
            dz3 r5 = new dz3
            r5.<init>(r1, r3)
            dz3 r11 = new dz3
            r11.<init>(r1, r6)
            z5 r10 = new z5
            r3 = 18
            r10.<init>(r1, r3)
            float r1 = defpackage.sn1.a
            ov4 r9 = new ov4
            r1 = 6
            r9.<init>(r15, r1)
            k0 r12 = new k0
            r15 = 21
            r12.<init>(r5, r15)
            c5 r8 = new c5
            r15 = 28
            r8.<init>(r15)
            on1 r7 = new on1
            r13 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.lang.Object r14 = defpackage.uj2.o(r2, r7, r14)
            if (r14 != r0) goto L5f
            goto L60
        L5f:
            r14 = r4
        L60:
            if (r14 != r0) goto L63
            goto L64
        L63:
            r14 = r4
        L64:
            if (r14 != r0) goto L67
            goto L68
        L67:
            r14 = r4
        L68:
            if (r14 != r0) goto L6b
            r4 = r0
        L6b:
            return r4
        L6c:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r14.Y
            if (r7 == 0) goto L7d
            if (r7 != r6) goto L78
            defpackage.oi2.Y(r15)
            goto L92
        L78:
            defpackage.i.m(r3)
            r4 = r5
            goto L92
        L7d:
            defpackage.oi2.Y(r15)
            r14.Y = r6
            tj2 r15 = new tj2
            r15.<init>(r1, r5, r6)
            java.lang.Object r14 = defpackage.uj2.o(r2, r15, r14)
            if (r14 != r0) goto L8e
            goto L8f
        L8e:
            r14 = r4
        L8f:
            if (r14 != r0) goto L92
            r4 = r0
        L92:
            return r4
        L93:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r14.Y
            if (r7 == 0) goto La4
            if (r7 != r6) goto L9f
            defpackage.oi2.Y(r15)
            goto Lbb
        L9f:
            defpackage.i.m(r3)
            r4 = r5
            goto Lbb
        La4:
            defpackage.oi2.Y(r15)
            r14.Y = r6
            ag r15 = new ag
            r3 = 9
            r15.<init>(r2, r1, r5, r3)
            java.lang.Object r14 = defpackage.g04.C(r15, r14)
            if (r14 != r0) goto Lb7
            goto Lb8
        Lb7:
            r14 = r4
        Lb8:
            if (r14 != r0) goto Lbb
            r4 = r0
        Lbb:
            return r4
    }
}
