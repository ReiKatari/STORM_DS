package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hr3  reason: default package */
/* loaded from: classes.dex */
public final class hr3 extends defpackage.gx0 {
    public final defpackage.fr3 b;
    public final defpackage.fq3 c;
    public final long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ defpackage.fq3 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ defpackage.c40 i;
    public final /* synthetic */ defpackage.d40 j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ long m;
    public final /* synthetic */ defpackage.pr3 n;

    public hr3(long r1, boolean r3, defpackage.fr3 r4, defpackage.fq3 r5, int r6, int r7, defpackage.c40 r8, defpackage.d40 r9, int r10, int r11, long r12, defpackage.pr3 r14) {
            r0 = this;
            r0.e = r3
            r0.f = r5
            r0.g = r6
            r0.h = r7
            r0.i = r8
            r0.j = r9
            r0.k = r10
            r0.l = r11
            r0.m = r12
            r0.n = r14
            r6 = 1
            r0.<init>(r6)
            r0.b = r4
            r0.c = r5
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == 0) goto L26
            int r5 = defpackage.q21.h(r1)
            goto L27
        L26:
            r5 = r4
        L27:
            if (r3 != 0) goto L2d
            int r4 = defpackage.q21.g(r1)
        L2d:
            r1 = 5
            r2 = 0
            long r1 = defpackage.s21.b(r2, r5, r2, r4, r1)
            r0.d = r1
            return
    }

    public final defpackage.kr3 o(int r18, long r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            fr3 r2 = r0.b
            java.lang.Object r12 = r2.c(r1)
            er3 r2 = r2.b
            java.lang.Object r13 = r2.H(r1)
            fq3 r2 = r0.c
            r3 = r19
            java.util.List r2 = r0.g(r2, r1, r3)
            int r5 = r0.g
            int r5 = r5 + (-1)
            if (r1 != r5) goto L21
            r5 = 0
        L1f:
            r9 = r5
            goto L24
        L21:
            int r5 = r0.h
            goto L1f
        L24:
            kr3 r5 = new kr3
            fq3 r6 = r0.f
            qt6 r6 = r6.B
            kk3 r6 = r6.getLayoutDirection()
            pr3 r7 = r0.n
            zp3 r14 = r7.o
            boolean r3 = r0.e
            c40 r4 = r0.i
            r7 = r5
            d40 r5 = r0.j
            r8 = r7
            int r7 = r0.k
            r10 = r8
            int r8 = r0.l
            long r0 = r0.m
            r15 = r0
            r0 = r10
            r10 = r15
            r1 = r18
            r15 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15)
            return r0
    }
}
