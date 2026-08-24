package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nh7  reason: default package */
/* loaded from: classes.dex */
public final class nh7 {
    public static final defpackage.wo f = null;
    public final defpackage.il7 a;
    public long b;
    public defpackage.wo c;
    public boolean d;
    public float e;

    static {
            wo r0 = new wo
            r1 = 0
            r0.<init>(r1)
            defpackage.nh7.f = r0
            return
    }

    public nh7(defpackage.to r3) {
            r2 = this;
            r2.<init>()
            wc7 r0 = defpackage.nw7.e0
            il7 r3 = r3.a(r0)
            r2.a = r3
            r0 = -9223372036854775808
            r2.b = r0
            wo r3 = defpackage.nh7.f
            r2.c = r3
            return
    }

    public final java.lang.Object a(defpackage.t00 r17, defpackage.u6 r18, defpackage.s41 r19) {
            r16 = this;
            r1 = r16
            r0 = r19
            boolean r2 = r0 instanceof defpackage.mh7
            if (r2 == 0) goto L17
            r2 = r0
            mh7 r2 = (defpackage.mh7) r2
            int r3 = r2.e0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.e0 = r3
            goto L1c
        L17:
            mh7 r2 = new mh7
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.Z
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.e0
            r5 = 0
            wo r6 = defpackage.nh7.f
            r7 = -9223372036854775808
            r9 = 0
            r10 = 2
            r11 = 0
            r12 = 1
            if (r4 == 0) goto L54
            if (r4 == r12) goto L43
            if (r4 != r10) goto L3d
            ao2 r2 = r2.R
            on2 r2 = (defpackage.on2) r2
            defpackage.oi2.Y(r0)     // Catch: java.lang.Throwable -> L3a
            goto Ld7
        L3a:
            r0 = move-exception
            goto Le3
        L3d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r5
        L43:
            float r4 = r2.Y
            on2 r13 = r2.X
            ao2 r14 = r2.R
            qn2 r14 = (defpackage.qn2) r14
            defpackage.oi2.Y(r0)     // Catch: java.lang.Throwable -> L3a
            r0 = r4
            r4 = r2
            r2 = r13
            r13 = r0
            r0 = r14
            goto La9
        L54:
            defpackage.oi2.Y(r0)
            boolean r0 = r1.d
            if (r0 == 0) goto L60
            java.lang.String r0 = "animateToZero called while previous animation is running"
            defpackage.s53.c(r0)
        L60:
            l61 r0 = r2.B
            r0.getClass()
            cs1 r4 = defpackage.cs1.f0
            j61 r0 = r0.Z(r4)
            n74 r0 = (defpackage.n74) r0
            if (r0 == 0) goto L74
            float r0 = r0.F()
            goto L76
        L74:
            r0 = 1065353216(0x3f800000, float:1.0)
        L76:
            r1.d = r12
            r13 = r0
            r4 = r2
            r0 = r17
            r2 = r18
        L7e:
            float r14 = r1.e     // Catch: java.lang.Throwable -> L3a
            float r14 = java.lang.Math.abs(r14)     // Catch: java.lang.Throwable -> L3a
            r15 = 1008981770(0x3c23d70a, float:0.01)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 >= 0) goto L8c
            goto Lb0
        L8c:
            uf r14 = new uf     // Catch: java.lang.Throwable -> L3a
            r14.<init>(r1, r13, r0)     // Catch: java.lang.Throwable -> L3a
            r4.R = r0     // Catch: java.lang.Throwable -> L3a
            r4.X = r2     // Catch: java.lang.Throwable -> L3a
            r4.Y = r13     // Catch: java.lang.Throwable -> L3a
            r4.e0 = r12     // Catch: java.lang.Throwable -> L3a
            l61 r15 = r4.B     // Catch: java.lang.Throwable -> L3a
            r15.getClass()     // Catch: java.lang.Throwable -> L3a
            um r15 = defpackage.ii2.x(r15)     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r14 = r15.a(r14, r4)     // Catch: java.lang.Throwable -> L3a
            if (r14 != r3) goto La9
            goto Ld6
        La9:
            r2.c()     // Catch: java.lang.Throwable -> L3a
            int r14 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r14 != 0) goto L7e
        Lb0:
            float r12 = r1.e     // Catch: java.lang.Throwable -> L3a
            float r12 = java.lang.Math.abs(r12)     // Catch: java.lang.Throwable -> L3a
            int r9 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r9 != 0) goto Lbb
            goto Lda
        Lbb:
            ja7 r9 = new ja7     // Catch: java.lang.Throwable -> L3a
            r12 = 5
            r9.<init>(r12, r1, r0)     // Catch: java.lang.Throwable -> L3a
            r4.R = r2     // Catch: java.lang.Throwable -> L3a
            r4.X = r5     // Catch: java.lang.Throwable -> L3a
            r4.e0 = r10     // Catch: java.lang.Throwable -> L3a
            l61 r0 = r4.B     // Catch: java.lang.Throwable -> L3a
            r0.getClass()     // Catch: java.lang.Throwable -> L3a
            um r0 = defpackage.ii2.x(r0)     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r0 = r0.a(r9, r4)     // Catch: java.lang.Throwable -> L3a
            if (r0 != r3) goto Ld7
        Ld6:
            return r3
        Ld7:
            r2.c()     // Catch: java.lang.Throwable -> L3a
        Lda:
            r1.b = r7
            r1.c = r6
            r1.d = r11
            jg7 r0 = defpackage.jg7.a
            return r0
        Le3:
            r1.b = r7
            r1.c = r6
            r1.d = r11
            throw r0
    }
}
