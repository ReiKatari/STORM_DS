package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rn0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rn0 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.xn0 B;
    public final /* synthetic */ defpackage.on2 L;
    public final /* synthetic */ defpackage.on2 R;

    public /* synthetic */ rn0(defpackage.xn0 r1, defpackage.on2 r2, defpackage.on2 r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r35, java.lang.Object r36) {
            r34 = this;
            r0 = r34
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            on2 r3 = r0.R
            on2 r4 = r0.L
            xn0 r0 = r0.B
            r5 = 0
            r6 = 2
            r7 = 1
            switch(r1) {
                case 0: goto L85;
                default: goto L12;
            }
        L12:
            r1 = r35
            px0 r1 = (defpackage.px0) r1
            r8 = r36
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r9 = r8 & 3
            if (r9 == r6) goto L24
            r9 = r7
            goto L25
        L24:
            r9 = r5
        L25:
            r8 = r8 & r7
            xq2 r1 = (defpackage.xq2) r1
            boolean r8 = r1.S(r8, r9)
            if (r8 == 0) goto L7f
            nq6 r8 = defpackage.vt0.a
            java.lang.Object r8 = r1.j(r8)
            ut0 r8 = (defpackage.ut0) r8
            long r15 = r8.j()
            java.util.WeakHashMap r8 = defpackage.dv7.w
            dv7 r8 = defpackage.th7.d(r1)
            ig7 r8 = r8.l
            r9 = 15
            r9 = r9 | 16
            qu3 r11 = new qu3
            r11.<init>(r8, r9)
            nn0 r8 = new nn0
            r8.<init>(r0, r7)
            r0 = -2035792789(0xffffffff86a8446b, float:-6.329511E-35)
            zv0 r10 = defpackage.n16.I(r0, r8, r1)
            j10 r0 = new j10
            r0.<init>(r4, r6, r5)
            r4 = 585222318(0x22e1c8ae, float:6.119885E-18)
            zv0 r13 = defpackage.n16.I(r4, r0, r1)
            h5 r0 = new h5
            r0.<init>(r6, r3)
            r3 = 1389562135(0x52d30917, float:4.531953E11)
            zv0 r14 = defpackage.n16.I(r3, r0, r1)
            r21 = 12610566(0xc06c06, float:1.7671167E-38)
            r22 = 68
            r12 = 0
            r17 = 0
            r19 = 0
            r20 = r1
            defpackage.gq.b(r10, r11, r12, r13, r14, r15, r17, r19, r20, r21, r22)
            goto L84
        L7f:
            r20 = r1
            r20.V()
        L84:
            return r2
        L85:
            r1 = r35
            px0 r1 = (defpackage.px0) r1
            r8 = r36
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r9 = r8 & 3
            if (r9 == r6) goto L96
            r5 = r7
        L96:
            r6 = r8 & 1
            xq2 r1 = (defpackage.xq2) r1
            boolean r5 = r1.S(r6, r5)
            if (r5 == 0) goto Lee
            lc2 r9 = defpackage.dj6.c
            nq6 r5 = defpackage.vt0.a
            java.lang.Object r5 = r1.j(r5)
            ut0 r5 = (defpackage.ut0) r5
            long r25 = r5.j()
            java.util.WeakHashMap r5 = defpackage.dv7.w
            dv7 r5 = defpackage.th7.d(r1)
            ig7 r8 = r5.l
            rn0 r5 = new rn0
            r5.<init>(r0, r4, r3, r7)
            r4 = 790802855(0x2f22b1a7, float:1.4796929E-10)
            zv0 r11 = defpackage.n16.I(r4, r5, r1)
            on0 r4 = new on0
            r4.<init>(r0, r3, r7)
            r0 = -913206642(0xffffffffc991928e, float:-1192529.8)
            zv0 r29 = defpackage.n16.I(r0, r4, r1)
            r32 = 100663296(0x6000000, float:2.4074124E-35)
            r33 = 196596(0x2fff4, float:2.7549E-40)
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r27 = 0
            r31 = 3120(0xc30, float:4.372E-42)
            r30 = r1
            defpackage.v56.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r23, r25, r27, r29, r30, r31, r32, r33)
            goto Lf3
        Lee:
            r30 = r1
            r30.V()
        Lf3:
            return r2
    }
}
