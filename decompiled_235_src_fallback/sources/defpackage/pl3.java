package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pl3  reason: default package */
/* loaded from: classes.dex */
public final class pl3 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.yl3 Z;
    public final /* synthetic */ java.util.UUID d0;

    public /* synthetic */ pl3(defpackage.yl3 r1, java.util.UUID r2, defpackage.r41 r3, int r4) {
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
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            pl3 r2 = (defpackage.pl3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            pl3 r2 = (defpackage.pl3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            java.util.UUID r0 = r2.d0
            yl3 r2 = r2.Z
            switch(r4) {
                case 0: goto L10;
                default: goto L9;
            }
        L9:
            pl3 r4 = new pl3
            r1 = 1
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            pl3 r4 = new pl3
            r1 = 0
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            int r1 = r0.X
            jg7 r2 = defpackage.jg7.a
            java.util.UUID r3 = r0.d0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            yl3 r6 = r0.Z
            r7 = 0
            switch(r1) {
                case 0: goto L7e;
                default: goto L11;
            }
        L11:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r0.Y
            if (r8 == 0) goto L24
            if (r8 != r5) goto L1f
            defpackage.oi2.Y(r18)
            r0 = r18
            goto L35
        L1f:
            defpackage.i.m(r4)
            r2 = r7
            goto L7d
        L24:
            defpackage.oi2.Y(r18)
            wa3 r4 = r6.b
            java.util.UUID r8 = defpackage.fk3.h
            r0.Y = r5
            java.lang.Object r0 = r4.d(r8, r0)
            if (r0 != r1) goto L35
            r2 = r1
            goto L7d
        L35:
            r8 = r0
            fk3 r8 = (defpackage.fk3) r8
            if (r8 == 0) goto L57
            java.util.UUID r0 = defpackage.fk3.h
            boolean r0 = defpackage.nb3.k(r3, r0)
            if (r0 == 0) goto L46
            java.lang.String r0 = "Пользовательский (на основе стандарта)"
        L44:
            r10 = r0
            goto L49
        L46:
            java.lang.String r0 = "Пользовательская раскладка"
            goto L44
        L49:
            dk3 r11 = defpackage.dk3.CUSTOM
            r15 = 0
            r16 = 120(0x78, float:1.68E-43)
            r9 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            fk3 r0 = defpackage.fk3.a(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L73
        L57:
            fk3 r8 = new fk3
            dk3 r11 = defpackage.dk3.CUSTOM
            ck3 r12 = defpackage.ck3.FOLLOW_SYSTEM
            r14 = 50
            zt1 r15 = defpackage.zt1.A
            r9 = 0
            r10 = 0
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r15 = 0
            r16 = 125(0x7d, float:1.75E-43)
            java.lang.String r10 = "Пользовательская раскладка"
            r11 = 0
            r12 = 0
            r14 = 0
            fk3 r0 = defpackage.fk3.a(r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L73:
            r6.g = r0
            tp6 r1 = r6.i
            r1.getClass()
            r1.m(r7, r0)
        L7d:
            return r2
        L7e:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r0.Y
            if (r8 == 0) goto L91
            if (r8 != r5) goto L8c
            defpackage.oi2.Y(r18)
            r0 = r18
            goto La0
        L8c:
            defpackage.i.m(r4)
            r2 = r7
            goto La9
        L91:
            defpackage.oi2.Y(r18)
            wa3 r4 = r6.b
            r0.Y = r5
            java.lang.Object r0 = r4.d(r3, r0)
            if (r0 != r1) goto La0
            r2 = r1
            goto La9
        La0:
            fk3 r0 = (defpackage.fk3) r0
            r6.g = r0
            tp6 r1 = r6.i
            r1.l(r0)
        La9:
            return r2
    }
}
