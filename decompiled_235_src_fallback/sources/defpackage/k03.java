package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k03  reason: default package */
/* loaded from: classes.dex */
public final class k03 extends defpackage.oi2 {
    public boolean e;
    public final defpackage.o03 f;
    public final defpackage.m42 g;
    public final defpackage.m42 h;
    public int i;
    public byte[] j;
    public int k;
    public final /* synthetic */ defpackage.n03 l;

    public k03(defpackage.n03 r1, defpackage.o03 r2, int[] r3, int[] r4) {
            r0 = this;
            r0.<init>()
            r0.l = r1
            byte[] r1 = defpackage.q60.b
            r0.j = r1
            r0.f = r2
            m42 r1 = defpackage.n03.e(r3)
            r0.g = r1
            m42 r1 = defpackage.n03.e(r4)
            r0.h = r1
            return
    }

    @Override // defpackage.oi2
    public final boolean G() {
            r0 = this;
            boolean r0 = r0.e
            r0 = r0 ^ 1
            return r0
    }

    @Override // defpackage.oi2
    public final int T(byte[] r20, int r21, int r22) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            java.lang.String r4 = "Argument too large or result overflows"
            r5 = 0
            if (r3 != 0) goto Le
            return r5
        Le:
            boolean r6 = r0.e
            if (r6 == 0) goto L14
            r0 = -1
            return r0
        L14:
            int r6 = r0.k
            int r7 = r0.i
            int r6 = r6 - r7
            if (r6 <= 0) goto L2c
            int r6 = java.lang.Math.min(r3, r6)
            byte[] r7 = r0.j
            int r8 = r0.i
            java.lang.System.arraycopy(r7, r8, r1, r2, r6)
            int r7 = r0.i
            int r7 = r7 + r6
            r0.i = r7
            goto L2d
        L2c:
            r6 = r5
        L2d:
            if (r6 >= r3) goto L137
            n03 r7 = r0.l
            n40 r8 = r7.L
            q r9 = r7.X
            java.lang.Object r10 = r9.c
            byte[] r10 = (byte[]) r10
            m42 r11 = r0.g
            int r8 = defpackage.n03.k(r8, r11)
            r11 = 65535(0xffff, float:9.1834E-41)
            r12 = 1
            r13 = 256(0x100, float:3.59E-43)
            if (r8 >= r13) goto L63
            int r7 = r6 + 1
            int r6 = r6 + r2
            byte r8 = (byte) r8
            int r13 = r9.a
            r10[r13] = r8
            int r10 = r13 + 1
            r10 = r10 & r11
            boolean r11 = r9.b
            if (r11 != 0) goto L5a
            if (r10 >= r13) goto L5a
            r9.b = r12
        L5a:
            r9.a = r10
            r1[r6] = r8
            r16 = r5
        L60:
            r6 = r7
            goto L117
        L63:
            if (r8 <= r13) goto L135
            short[] r13 = defpackage.n03.Y
            int r8 = r8 + (-257)
            short r8 = r13[r8]
            int r13 = r8 >>> 5
            r8 = r8 & 31
            n40 r14 = r7.L
            long r14 = defpackage.n03.n(r14, r8)
            int r8 = java.lang.Math.toIntExact(r14)     // Catch: java.lang.ArithmeticException -> L12e
            int r8 = java.lang.Math.addExact(r13, r8)     // Catch: java.lang.ArithmeticException -> L12e
            n40 r13 = r7.L
            m42 r14 = r0.h
            int r13 = defpackage.n03.k(r13, r14)
            int[] r14 = defpackage.n03.Z
            r13 = r14[r13]
            int r14 = r13 >>> 4
            r13 = r13 & 15
            n40 r7 = r7.L
            long r15 = defpackage.n03.n(r7, r13)
            int r7 = java.lang.Math.toIntExact(r15)     // Catch: java.lang.ArithmeticException -> L127
            int r7 = java.lang.Math.addExact(r14, r7)     // Catch: java.lang.ArithmeticException -> L127
            byte[] r13 = r0.j
            int r13 = r13.length
            if (r13 >= r8) goto La4
            byte[] r13 = new byte[r8]
            r0.j = r13
        La4:
            r0.k = r8
            r0.i = r5
            byte[] r13 = r0.j
            int r14 = r10.length
            if (r7 > r14) goto L11b
            int r14 = r9.a
            int r15 = r14 - r7
            r15 = r15 & r11
            r16 = r5
            boolean r5 = r9.b
            if (r5 != 0) goto Lc5
            if (r15 >= r14) goto Lbb
            goto Lc5
        Lbb:
            java.lang.String r0 = "Attempt to read beyond memory: dist="
            java.lang.String r0 = defpackage.lb1.g(r7, r0)
            defpackage.i.m(r0)
            return r16
        Lc5:
            r5 = r16
        Lc7:
            if (r5 >= r8) goto Lf6
            r7 = r10[r15]
            int r14 = r9.a
            r10[r14] = r7
            int r17 = r14 + 1
            r18 = r11
            r11 = r17 & r18
            boolean r12 = r9.b
            if (r12 != 0) goto Lde
            if (r11 >= r14) goto Lde
            r12 = 1
            r9.b = r12
        Lde:
            r9.a = r11
            r13[r5] = r7
            int r5 = r5 + 1
            int r7 = r15 + 1
            r7 = r7 & r18
            boolean r11 = r9.b
            if (r11 != 0) goto Lf1
            if (r7 >= r15) goto Lf1
            r12 = 1
            r9.b = r12
        Lf1:
            r15 = r7
            r11 = r18
            r12 = 1
            goto Lc7
        Lf6:
            int r5 = r2 + r6
            int r7 = r3 - r6
            int r8 = r0.k
            int r9 = r0.i
            int r8 = r8 - r9
            if (r8 <= 0) goto L112
            int r7 = java.lang.Math.min(r7, r8)
            byte[] r8 = r0.j
            int r9 = r0.i
            java.lang.System.arraycopy(r8, r9, r1, r5, r7)
            int r5 = r0.i
            int r5 = r5 + r7
            r0.i = r5
            goto L114
        L112:
            r7 = r16
        L114:
            int r7 = r7 + r6
            goto L60
        L117:
            r5 = r16
            goto L2d
        L11b:
            r16 = r5
            java.lang.String r0 = "Illegal distance parameter: "
            java.lang.String r0 = defpackage.lb1.g(r7, r0)
            defpackage.i.m(r0)
            return r16
        L127:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r4, r0)
            throw r1
        L12e:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r4, r0)
            throw r1
        L135:
            r0.e = r12
        L137:
            return r6
    }

    @Override // defpackage.oi2
    public final defpackage.o03 W() {
            r1 = this;
            boolean r0 = r1.e
            if (r0 == 0) goto L7
            o03 r1 = defpackage.o03.INITIAL
            return r1
        L7:
            o03 r1 = r1.f
            return r1
    }

    @Override // defpackage.oi2
    public final int j() {
            r1 = this;
            int r0 = r1.k
            int r1 = r1.i
            int r0 = r0 - r1
            return r0
    }
}
