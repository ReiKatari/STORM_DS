package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yl6  reason: default package */
/* loaded from: classes.dex */
public final class yl6 extends defpackage.dm5 implements defpackage.eo2 {
    public long[] L;
    public int R;
    public int X;
    public int Y;
    public /* synthetic */ java.lang.Object Z;
    public final /* synthetic */ defpackage.zl6 d0;

    public yl6(defpackage.zl6 r1, defpackage.r41 r2) {
            r0 = this;
            r0.d0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            rb6 r1 = (defpackage.rb6) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            yl6 r0 = (defpackage.yl6) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            yl6 r0 = new yl6
            zl6 r1 = r1.d0
            r0.<init>(r1, r2)
            r0.Z = r3
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r23) {
            r22 = this;
            r0 = r22
            zl6 r1 = r0.d0
            long r2 = r1.A
            long r4 = r1.L
            long r6 = r1.B
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            int r9 = r0.Y
            r10 = 0
            r13 = 64
            r14 = 3
            r15 = 2
            r16 = 0
            r17 = 0
            r19 = 1
            r11 = 1
            if (r9 == 0) goto L4f
            if (r9 == r11) goto L40
            if (r9 == r15) goto L34
            if (r9 != r14) goto L2e
            int r1 = r0.R
            java.lang.Object r6 = r0.Z
            rb6 r6 = (defpackage.rb6) r6
            defpackage.oi2.Y(r23)
            r9 = r14
            goto Ldc
        L2e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r10
        L34:
            int r1 = r0.R
            java.lang.Object r9 = r0.Z
            rb6 r9 = (defpackage.rb6) r9
            defpackage.oi2.Y(r23)
            r10 = r15
            goto La9
        L40:
            int r1 = r0.X
            int r9 = r0.R
            long[] r12 = r0.L
            java.lang.Object r14 = r0.Z
            rb6 r14 = (defpackage.rb6) r14
            defpackage.oi2.Y(r23)
            r10 = r11
            goto L7c
        L4f:
            defpackage.oi2.Y(r23)
            java.lang.Object r9 = r0.Z
            rb6 r9 = (defpackage.rb6) r9
            long[] r1 = r1.R
            if (r1 == 0) goto L82
            int r12 = r1.length
            r14 = r12
            r12 = r1
            r1 = r14
            r14 = r9
            r9 = r16
        L61:
            if (r9 >= r1) goto L81
            r10 = r12[r9]
            java.lang.Long r15 = new java.lang.Long
            r15.<init>(r10)
            r0.Z = r14
            r0.L = r12
            r0.R = r9
            r0.X = r1
            r10 = 1
            r0.Y = r10
            x61 r11 = r14.c(r0, r15)
            if (r11 != r8) goto L7c
            goto Ldb
        L7c:
            int r9 = r9 + r10
            r11 = r10
            r10 = 0
            r15 = 2
            goto L61
        L81:
            r9 = r14
        L82:
            int r1 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r1 == 0) goto Lb1
            r1 = r16
        L88:
            if (r1 >= r13) goto Lb1
            long r10 = r19 << r1
            long r10 = r10 & r6
            int r10 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r10 == 0) goto Lac
            long r10 = (long) r1
            long r10 = r10 + r4
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r10)
            r0.Z = r9
            r10 = 0
            r0.L = r10
            r0.R = r1
            r10 = 2
            r0.Y = r10
            x61 r11 = r9.c(r0, r12)
            if (r11 != r8) goto La9
            goto Ldb
        La9:
            r21 = 1
            goto Lae
        Lac:
            r10 = 2
            goto La9
        Lae:
            int r1 = r1 + 1
            goto L88
        Lb1:
            int r1 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r1 == 0) goto Le5
            r6 = r9
            r1 = r16
        Lb8:
            if (r1 >= r13) goto Le5
            long r9 = r19 << r1
            long r9 = r9 & r2
            int r7 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r7 == 0) goto Ldf
            long r9 = (long) r1
            long r9 = r9 + r4
            r11 = 64
            long r9 = r9 + r11
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r9)
            r0.Z = r6
            r10 = 0
            r0.L = r10
            r0.R = r1
            r9 = 3
            r0.Y = r9
            x61 r7 = r6.c(r0, r7)
            if (r7 != r8) goto Ldc
        Ldb:
            return r8
        Ldc:
            r21 = 1
            goto Le2
        Ldf:
            r9 = 3
            r10 = 0
            goto Ldc
        Le2:
            int r1 = r1 + 1
            goto Lb8
        Le5:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
