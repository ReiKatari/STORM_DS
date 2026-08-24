package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aq1 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ float B;

    public /* synthetic */ aq1(int r1, float r2) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r21) {
            r20 = this;
            r0 = r20
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0.B
            switch(r1) {
                case 0: goto L142;
                default: goto Ld;
            }
        Ld:
            r4 = r21
            no1 r4 = (defpackage.no1) r4
            r4.getClass()
            r5 = 4278782477(0xff090a0d, double:2.113999428E-314)
            long r5 = defpackage.hv.c(r5)
            r12 = 0
            r13 = 126(0x7e, float:1.77E-43)
            r7 = 0
            r9 = 0
            r11 = 0
            defpackage.no1.F(r4, r5, r7, r9, r11, r12, r13)
            r1 = 0
            int r5 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r5 <= 0) goto L141
            r5 = 4281022546(0xff2b3852, double:2.115106169E-314)
            long r5 = defpackage.hv.c(r5)
            r7 = 1057803469(0x3f0ccccd, float:0.55)
            float r7 = r7 * r0
            long r5 = defpackage.kt0.c(r7, r5)
            kt0 r8 = new kt0
            r8.<init>(r5)
            r5 = 4279309599(0xff11151f, double:2.114259861E-314)
            long r5 = defpackage.hv.c(r5)
            long r5 = defpackage.kt0.c(r7, r5)
            kt0 r7 = new kt0
            r7.<init>(r5)
            kt0[] r5 = new defpackage.kt0[]{r8, r7}
            java.util.List r5 = defpackage.hf.c0(r5)
            r6 = 14
            bv3 r5 = defpackage.d90.m(r5, r1, r1, r6)
            r11 = 0
            r12 = 126(0x7e, float:1.77E-43)
            r6 = 0
            r8 = 0
            r10 = 0
            defpackage.no1.D0(r4, r5, r6, r8, r10, r11, r12)
            r5 = 1077936128(0x40400000, float:3.0)
            float r5 = r4.e0(r5)
            float r6 = r4.e0(r3)
            float r6 = r6 / r5
            float r6 = defpackage.gi2.p(r6, r1, r3)
            java.lang.Float r7 = java.lang.Float.valueOf(r1)
            long r8 = defpackage.kt0.b
            r10 = 1039516303(0x3df5c28f, float:0.12)
            float r0 = r0 * r10
            long r10 = defpackage.kt0.c(r0, r8)
            kt0 r12 = new kt0
            r12.<init>(r10)
            vr4 r10 = new vr4
            r10.<init>(r7, r12)
            java.lang.Float r7 = java.lang.Float.valueOf(r6)
            long r8 = defpackage.kt0.c(r0, r8)
            kt0 r0 = new kt0
            r0.<init>(r8)
            vr4 r8 = new vr4
            r8.<init>(r7, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r6)
            long r6 = defpackage.kt0.g
            kt0 r9 = new kt0
            r9.<init>(r6)
            vr4 r11 = new vr4
            r11.<init>(r0, r9)
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            kt0 r3 = new kt0
            r3.<init>(r6)
            vr4 r6 = new vr4
            r6.<init>(r0, r3)
            vr4[] r0 = new defpackage.vr4[]{r10, r8, r11, r6}
            r3 = 4
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            vr4[] r0 = (defpackage.vr4[]) r0
            int r3 = java.lang.Float.floatToRawIntBits(r1)
            long r6 = (long) r3
            int r3 = java.lang.Float.floatToRawIntBits(r1)
            long r8 = (long) r3
            r3 = 32
            long r6 = r6 << r3
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r10
            long r15 = r6 | r8
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r6 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r5)
            long r8 = (long) r1
            long r5 = r6 << r3
            long r7 = r8 & r10
            long r17 = r5 | r7
            int r1 = r0.length
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r1)
            r3 = 0
            r5 = r3
        Lfd:
            if (r5 >= r1) goto L112
            r6 = r0[r5]
            java.lang.Object r6 = r6.B
            kt0 r6 = (defpackage.kt0) r6
            long r6 = r6.a
            kt0 r8 = new kt0
            r8.<init>(r6)
            r13.add(r8)
            int r5 = r5 + 1
            goto Lfd
        L112:
            int r1 = r0.length
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r1)
        L118:
            if (r3 >= r1) goto L12e
            r5 = r0[r3]
            java.lang.Object r5 = r5.A
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r14.add(r5)
            int r3 = r3 + 1
            goto L118
        L12e:
            bv3 r5 = new bv3
            r19 = 1
            r12 = r5
            r12.<init>(r13, r14, r15, r17, r19)
            r11 = 0
            r12 = 126(0x7e, float:1.77E-43)
            r6 = 0
            r8 = 0
            r10 = 0
            defpackage.no1.D0(r4, r5, r6, r8, r10, r11, r12)
        L141:
            return r2
        L142:
            r1 = r21
            op5 r1 = (defpackage.op5) r1
            r1.getClass()
            float r3 = r3 - r0
            qh1 r4 = r1.l0
            float r4 = r4.a()
            r5 = 1102053376(0x41b00000, float:22.0)
            float r4 = r4 * r5
            float r4 = r4 * r3
            r1.t(r4)
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            float r0 = r0 * r3
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            float r0 = r0 + r3
            r1.c(r0)
            return r2
    }
}
