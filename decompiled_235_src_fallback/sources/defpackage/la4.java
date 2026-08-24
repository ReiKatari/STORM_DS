package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: la4  reason: default package */
/* loaded from: classes.dex */
public final class la4 extends defpackage.dm5 implements defpackage.eo2 {
    public defpackage.rr2 L;
    public defpackage.ma4 R;
    public long[] X;
    public int Y;
    public int Z;
    public int d0;
    public int e0;
    public long f0;
    public int g0;
    public /* synthetic */ java.lang.Object h0;
    public final /* synthetic */ defpackage.ma4 i0;
    public final /* synthetic */ defpackage.rr2 j0;

    public la4(defpackage.ma4 r1, defpackage.rr2 r2, defpackage.r41 r3) {
            r0 = this;
            r0.i0 = r1
            r0.j0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            rb6 r1 = (defpackage.rb6) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            la4 r0 = (defpackage.la4) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            la4 r0 = new la4
            ma4 r1 = r2.i0
            rr2 r2 = r2.j0
            r0.<init>(r1, r2, r3)
            r0.h0 = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r22) {
            r21 = this;
            r0 = r21
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.g0
            r4 = 8
            r5 = 1
            if (r2 == 0) goto L2d
            if (r2 != r5) goto L26
            int r2 = r0.e0
            int r6 = r0.d0
            long r7 = r0.f0
            int r9 = r0.Z
            int r10 = r0.Y
            long[] r11 = r0.X
            ma4 r12 = r0.R
            rr2 r13 = r0.L
            java.lang.Object r14 = r0.h0
            rb6 r14 = (defpackage.rb6) r14
            defpackage.oi2.Y(r22)
            goto L96
        L26:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L2d:
            defpackage.oi2.Y(r22)
            java.lang.Object r2 = r0.h0
            rb6 r2 = (defpackage.rb6) r2
            ma4 r6 = r0.i0
            ka4 r7 = r6.B
            long[] r7 = r7.a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto La6
            rr2 r9 = r0.j0
            r10 = 0
        L42:
            r11 = r7[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto La1
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = r2
            r2 = 0
            r19 = r11
            r12 = r6
            r11 = r7
            r6 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            r7 = r19
        L65:
            if (r2 >= r6) goto L99
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r7
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L96
            int r15 = r9 << 3
            int r15 = r15 + r2
            r13.B = r15
            ka4 r3 = r12.B
            java.lang.Object[] r3 = r3.b
            r3 = r3[r15]
            r0.h0 = r14
            r0.L = r13
            r0.R = r12
            r0.X = r11
            r0.Y = r10
            r0.Z = r9
            r0.f0 = r7
            r0.d0 = r6
            r0.e0 = r2
            r0.g0 = r5
            x61 r3 = r14.c(r0, r3)
            if (r3 != r1) goto L96
            return r1
        L96:
            long r7 = r7 >> r4
            int r2 = r2 + r5
            goto L65
        L99:
            if (r6 != r4) goto La6
            r8 = r10
            r7 = r11
            r6 = r12
            r2 = r14
            r10 = r9
            r9 = r13
        La1:
            if (r10 == r8) goto La6
            int r10 = r10 + 1
            goto L42
        La6:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
