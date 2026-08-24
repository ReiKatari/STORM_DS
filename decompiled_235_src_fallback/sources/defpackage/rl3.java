package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rl3  reason: default package */
/* loaded from: classes.dex */
public final class rl3 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.yl3 Z;

    public /* synthetic */ rl3(defpackage.yl3 r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Z = r1
            r1 = 2
            r0.<init>(r1, r2)
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
                case 0: goto L42;
                case 1: goto L37;
                case 2: goto L2c;
                case 3: goto L21;
                case 4: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            rl3 r2 = (defpackage.rl3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            rl3 r2 = (defpackage.rl3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            rl3 r2 = (defpackage.rl3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L2c:
            r41 r2 = r2.q(r4, r3)
            rl3 r2 = (defpackage.rl3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L37:
            r41 r2 = r2.q(r4, r3)
            rl3 r2 = (defpackage.rl3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L42:
            r41 r2 = r2.q(r4, r3)
            rl3 r2 = (defpackage.rl3) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            yl3 r1 = r1.Z
            switch(r3) {
                case 0: goto L2a;
                case 1: goto L23;
                case 2: goto L1c;
                case 3: goto L15;
                case 4: goto Le;
                default: goto L7;
            }
        L7:
            rl3 r3 = new rl3
            r0 = 5
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            rl3 r3 = new rl3
            r0 = 4
            r3.<init>(r1, r2, r0)
            return r3
        L15:
            rl3 r3 = new rl3
            r0 = 3
            r3.<init>(r1, r2, r0)
            return r3
        L1c:
            rl3 r3 = new rl3
            r0 = 2
            r3.<init>(r1, r2, r0)
            return r3
        L23:
            rl3 r3 = new rl3
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        L2a:
            rl3 r3 = new rl3
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            r1 = 16
            yl3 r2 = r8.Z
            r3 = 0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            jg7 r5 = defpackage.jg7.a
            r6 = 1
            switch(r0) {
                case 0: goto L10b;
                case 1: goto Le1;
                case 2: goto Lb0;
                case 3: goto L7f;
                case 4: goto L47;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L20
            if (r7 != r6) goto L1c
            defpackage.oi2.Y(r9)
        L1a:
            r3 = r5
            goto L46
        L1c:
            defpackage.i.m(r4)
            goto L46
        L20:
            defpackage.oi2.Y(r9)
            de5 r9 = r2.p
            tp6 r2 = r2.s
            r8.Y = r6
            a7 r3 = new a7
            r4 = 20
            r3.<init>(r2, r4)
            a7 r2 = new a7
            r2.<init>(r3, r1)
            rp6 r9 = r9.A
            java.lang.Object r8 = r9.b(r2, r8)
            if (r8 != r0) goto L3e
            goto L3f
        L3e:
            r8 = r5
        L3f:
            if (r8 != r0) goto L42
            goto L43
        L42:
            r8 = r5
        L43:
            if (r8 != r0) goto L1a
            r3 = r0
        L46:
            return r3
        L47:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L58
            if (r7 != r6) goto L54
            defpackage.oi2.Y(r9)
        L52:
            r3 = r5
            goto L7e
        L54:
            defpackage.i.m(r4)
            goto L7e
        L58:
            defpackage.oi2.Y(r9)
            de5 r9 = r2.p
            tp6 r2 = r2.q
            r8.Y = r6
            a7 r3 = new a7
            r4 = 19
            r3.<init>(r2, r4)
            a7 r2 = new a7
            r2.<init>(r3, r1)
            rp6 r9 = r9.A
            java.lang.Object r8 = r9.b(r2, r8)
            if (r8 != r0) goto L76
            goto L77
        L76:
            r8 = r5
        L77:
            if (r8 != r0) goto L7a
            goto L7b
        L7a:
            r8 = r5
        L7b:
            if (r8 != r0) goto L52
            r3 = r0
        L7e:
            return r3
        L7f:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.Y
            if (r1 == 0) goto L8f
            if (r1 != r6) goto L8b
            defpackage.oi2.Y(r9)
            goto Lae
        L8b:
            defpackage.i.m(r4)
            goto Laf
        L8f:
            defpackage.oi2.Y(r9)
            tp6 r9 = r2.o
            v83 r1 = new v83
            r3 = 7
            r1.<init>(r3)
            nl1 r9 = defpackage.lb4.s(r9, r1)
            ql3 r1 = new ql3
            r3 = 3
            r1.<init>(r2, r3)
            r8.Y = r6
            java.lang.Object r8 = r9.b(r1, r8)
            if (r8 != r0) goto Lae
            r3 = r0
            goto Laf
        Lae:
            r3 = r5
        Laf:
            return r3
        Lb0:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.Y
            if (r1 == 0) goto Lc0
            if (r1 != r6) goto Lbc
            defpackage.oi2.Y(r9)
            goto Ldf
        Lbc:
            defpackage.i.m(r4)
            goto Le0
        Lc0:
            defpackage.oi2.Y(r9)
            tp6 r9 = r2.o
            v83 r1 = new v83
            r3 = 6
            r1.<init>(r3)
            nl1 r9 = defpackage.lb4.s(r9, r1)
            ql3 r1 = new ql3
            r3 = 2
            r1.<init>(r2, r3)
            r8.Y = r6
            java.lang.Object r8 = r9.b(r1, r8)
            if (r8 != r0) goto Ldf
            r3 = r0
            goto Le0
        Ldf:
            r3 = r5
        Le0:
            return r3
        Le1:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.Y
            if (r1 == 0) goto Lf1
            if (r1 != r6) goto Led
            defpackage.oi2.Y(r9)
            goto L109
        Led:
            defpackage.i.m(r4)
            goto L10a
        Lf1:
            defpackage.oi2.Y(r9)
            ci0 r9 = r2.d
            java.lang.Object r9 = r9.h
            xf2 r9 = (defpackage.xf2) r9
            ql3 r1 = new ql3
            r1.<init>(r2, r6)
            r8.Y = r6
            java.lang.Object r8 = r9.b(r1, r8)
            if (r8 != r0) goto L109
            r3 = r0
            goto L10a
        L109:
            r3 = r5
        L10a:
            return r3
        L10b:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L11c
            if (r7 != r6) goto L118
            defpackage.oi2.Y(r9)
        L116:
            r3 = r5
            goto L139
        L118:
            defpackage.i.m(r4)
            goto L139
        L11c:
            defpackage.oi2.Y(r9)
            tp6 r9 = r2.i
            ql3 r3 = new ql3
            r4 = 0
            r3.<init>(r2, r4)
            r8.Y = r6
            a7 r2 = new a7
            r2.<init>(r3, r1)
            java.lang.Object r8 = r9.b(r2, r8)
            if (r8 != r0) goto L135
            goto L136
        L135:
            r8 = r5
        L136:
            if (r8 != r0) goto L116
            r3 = r0
        L139:
            return r3
    }
}
