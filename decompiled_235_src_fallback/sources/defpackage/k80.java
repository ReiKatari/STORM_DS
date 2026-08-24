package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k80  reason: default package */
/* loaded from: classes.dex */
public final class k80 implements defpackage.z80, defpackage.y80, java.lang.Cloneable, java.nio.channels.ByteChannel {
    public defpackage.o96 A;
    public long B;

    public final long A(byte r9, long r10, long r12) {
            r8 = this;
            r0 = 0
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 > 0) goto Lb5
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 > 0) goto Lb5
            long r2 = r8.B
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 <= 0) goto L11
            r12 = r2
        L11:
            int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r4 != 0) goto L17
            goto Lb2
        L17:
            o96 r8 = r8.A
            if (r8 != 0) goto L1d
            goto Lb2
        L1d:
            long r4 = r2 - r10
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L6a
        L23:
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto L34
            o96 r8 = r8.g
            r8.getClass()
            int r0 = r8.c
            int r1 = r8.b
            int r0 = r0 - r1
            long r0 = (long) r0
            long r2 = r2 - r0
            goto L23
        L34:
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 >= 0) goto Lb2
            byte[] r0 = r8.a
            int r1 = r8.c
            long r4 = (long) r1
            int r1 = r8.b
            long r6 = (long) r1
            long r6 = r6 + r12
            long r6 = r6 - r2
            long r4 = java.lang.Math.min(r4, r6)
            int r1 = (int) r4
            int r4 = r8.b
            long r4 = (long) r4
            long r4 = r4 + r10
            long r4 = r4 - r2
            int r10 = (int) r4
        L4d:
            if (r10 >= r1) goto L5c
            r11 = r0[r10]
            if (r11 != r9) goto L59
            int r8 = r8.b
            int r10 = r10 - r8
            long r8 = (long) r10
            long r8 = r8 + r2
            return r8
        L59:
            int r10 = r10 + 1
            goto L4d
        L5c:
            int r10 = r8.c
            int r11 = r8.b
            int r10 = r10 - r11
            long r10 = (long) r10
            long r2 = r2 + r10
            o96 r8 = r8.f
            r8.getClass()
            r10 = r2
            goto L34
        L6a:
            int r2 = r8.c
            int r3 = r8.b
            int r2 = r2 - r3
            long r2 = (long) r2
            long r2 = r2 + r0
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 > 0) goto L7c
            o96 r8 = r8.f
            r8.getClass()
            r0 = r2
            goto L6a
        L7c:
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 >= 0) goto Lb2
            byte[] r2 = r8.a
            int r3 = r8.c
            long r3 = (long) r3
            int r5 = r8.b
            long r5 = (long) r5
            long r5 = r5 + r12
            long r5 = r5 - r0
            long r3 = java.lang.Math.min(r3, r5)
            int r3 = (int) r3
            int r4 = r8.b
            long r4 = (long) r4
            long r4 = r4 + r10
            long r4 = r4 - r0
            int r10 = (int) r4
        L95:
            if (r10 >= r3) goto La4
            r11 = r2[r10]
            if (r11 != r9) goto La1
            int r8 = r8.b
            int r10 = r10 - r8
            long r8 = (long) r10
            long r8 = r8 + r0
            return r8
        La1:
            int r10 = r10 + 1
            goto L95
        La4:
            int r10 = r8.c
            int r11 = r8.b
            int r10 = r10 - r11
            long r10 = (long) r10
            long r0 = r0 + r10
            o96 r8 = r8.f
            r8.getClass()
            r10 = r0
            goto L7c
        Lb2:
            r8 = -1
            return r8
        Lb5:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "size="
            r9.<init>(r0)
            long r0 = r8.B
            r9.append(r0)
            java.lang.String r8 = " fromIndex="
            java.lang.String r0 = " toIndex="
            defpackage.xg6.B(r9, r8, r10, r0)
            r9.append(r12)
            java.lang.String r8 = r9.toString()
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
    }

    @Override // defpackage.y80
    public final /* bridge */ /* synthetic */ defpackage.y80 B(byte[] r1, int r2) {
            r0 = this;
            r0.l0(r1, r2)
            return r0
    }

    @Override // defpackage.z80
    public final long C(defpackage.y80 r5) {
            r4 = this;
            long r0 = r4.B
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto Lb
            r5.O(r4, r0)
        Lb:
            return r0
    }

    public final long D(defpackage.da0 r12) {
            r11 = this;
            r12.getClass()
            o96 r0 = r11.A
            if (r0 != 0) goto L9
            goto L11c
        L9:
            long r1 = r11.B
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 2
            r7 = 0
            r8 = 1
            if (r5 >= 0) goto L9a
        L14:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L25
            o96 r0 = r0.g
            r0.getClass()
            int r5 = r0.c
            int r9 = r0.b
            int r5 = r5 - r9
            long r9 = (long) r5
            long r1 = r1 - r9
            goto L14
        L25:
            int r5 = r12.d()
            if (r5 != r6) goto L63
            byte r5 = r12.i(r7)
            byte r12 = r12.i(r8)
        L33:
            long r6 = r11.B
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 >= 0) goto L11c
            byte[] r6 = r0.a
            int r7 = r0.b
            long r7 = (long) r7
            long r7 = r7 + r3
            long r7 = r7 - r1
            int r3 = (int) r7
            int r4 = r0.c
        L43:
            if (r3 >= r4) goto L55
            r7 = r6[r3]
            if (r7 == r5) goto L4f
            if (r7 != r12) goto L4c
            goto L4f
        L4c:
            int r3 = r3 + 1
            goto L43
        L4f:
            int r11 = r0.b
        L51:
            int r3 = r3 - r11
            long r11 = (long) r3
            long r11 = r11 + r1
            return r11
        L55:
            int r3 = r0.c
            int r4 = r0.b
            int r3 = r3 - r4
            long r3 = (long) r3
            long r3 = r3 + r1
            o96 r0 = r0.f
            r0.getClass()
            r1 = r3
            goto L33
        L63:
            byte[] r12 = r12.h()
        L67:
            long r5 = r11.B
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 >= 0) goto L11c
            byte[] r5 = r0.a
            int r6 = r0.b
            long r8 = (long) r6
            long r8 = r8 + r3
            long r8 = r8 - r1
            int r3 = (int) r8
            int r4 = r0.c
        L77:
            if (r3 >= r4) goto L8c
            r6 = r5[r3]
            int r8 = r12.length
            r9 = r7
        L7d:
            if (r9 >= r8) goto L89
            r10 = r12[r9]
            if (r6 != r10) goto L86
        L83:
            int r11 = r0.b
            goto L51
        L86:
            int r9 = r9 + 1
            goto L7d
        L89:
            int r3 = r3 + 1
            goto L77
        L8c:
            int r3 = r0.c
            int r4 = r0.b
            int r3 = r3 - r4
            long r3 = (long) r3
            long r3 = r3 + r1
            o96 r0 = r0.f
            r0.getClass()
            r1 = r3
            goto L67
        L9a:
            r1 = r3
        L9b:
            int r5 = r0.c
            int r9 = r0.b
            int r5 = r5 - r9
            long r9 = (long) r5
            long r9 = r9 + r1
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 > 0) goto Lad
            o96 r0 = r0.f
            r0.getClass()
            r1 = r9
            goto L9b
        Lad:
            int r5 = r12.d()
            if (r5 != r6) goto Le6
            byte r5 = r12.i(r7)
            byte r12 = r12.i(r8)
        Lbb:
            long r6 = r11.B
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 >= 0) goto L11c
            byte[] r6 = r0.a
            int r7 = r0.b
            long r7 = (long) r7
            long r7 = r7 + r3
            long r7 = r7 - r1
            int r3 = (int) r7
            int r4 = r0.c
        Lcb:
            if (r3 >= r4) goto Ld8
            r7 = r6[r3]
            if (r7 == r5) goto L4f
            if (r7 != r12) goto Ld5
            goto L4f
        Ld5:
            int r3 = r3 + 1
            goto Lcb
        Ld8:
            int r3 = r0.c
            int r4 = r0.b
            int r3 = r3 - r4
            long r3 = (long) r3
            long r3 = r3 + r1
            o96 r0 = r0.f
            r0.getClass()
            r1 = r3
            goto Lbb
        Le6:
            byte[] r12 = r12.h()
        Lea:
            long r5 = r11.B
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 >= 0) goto L11c
            byte[] r5 = r0.a
            int r6 = r0.b
            long r8 = (long) r6
            long r8 = r8 + r3
            long r8 = r8 - r1
            int r3 = (int) r8
            int r4 = r0.c
        Lfa:
            if (r3 >= r4) goto L10e
            r6 = r5[r3]
            int r8 = r12.length
            r9 = r7
        L100:
            if (r9 >= r8) goto L10b
            r10 = r12[r9]
            if (r6 != r10) goto L108
            goto L83
        L108:
            int r9 = r9 + 1
            goto L100
        L10b:
            int r3 = r3 + 1
            goto Lfa
        L10e:
            int r3 = r0.c
            int r4 = r0.b
            int r3 = r3 - r4
            long r3 = (long) r3
            long r3 = r3 + r1
            o96 r0 = r0.f
            r0.getClass()
            r1 = r3
            goto Lea
        L11c:
            r11 = -1
            return r11
    }

    public final boolean F(int r10, long r11, defpackage.da0 r13) {
            r9 = this;
            r13.getClass()
            if (r10 >= 0) goto L6
            goto L33
        L6:
            r0 = 0
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L33
            long r0 = (long) r10
            long r0 = r0 + r11
            long r2 = r9.B
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L15
            goto L33
        L15:
            int r0 = r13.d()
            if (r10 <= r0) goto L1c
            goto L33
        L1c:
            if (r10 != 0) goto L1f
            goto L31
        L1f:
            r0 = 1
            long r6 = r11 + r0
            r2 = r9
            r8 = r10
            r4 = r11
            r3 = r13
            long r9 = defpackage.b.a(r2, r3, r4, r6, r8)
            r11 = -1
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L33
        L31:
            r9 = 1
            return r9
        L33:
            r9 = 0
            return r9
    }

    @Override // defpackage.y80
    public final /* bridge */ /* synthetic */ defpackage.y80 H(java.lang.String r1) {
            r0 = this;
            r0.t0(r1)
            return r0
    }

    public final defpackage.i80 J(defpackage.i80 r2) {
            r1 = this;
            r2.getClass()
            byte[] r0 = defpackage.b.a
            i80 r0 = defpackage.hf.a
            if (r2 != r0) goto Le
            i80 r2 = new i80
            r2.<init>()
        Le:
            k80 r0 = r2.A
            if (r0 != 0) goto L18
            r2.A = r1
            r1 = 1
            r2.B = r1
            return r2
        L18:
            java.lang.String r1 = "already attached to a buffer"
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    @Override // defpackage.z80
    public final void K(defpackage.k80 r4, long r5) {
            r3 = this;
            long r0 = r3.B
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto La
            r4.O(r3, r5)
            return
        La:
            r4.O(r3, r0)
            defpackage.i.n()
            return
    }

    @Override // defpackage.z80
    public final java.lang.String M(java.nio.charset.Charset r3) {
            r2 = this;
            r3.getClass()
            long r0 = r2.B
            java.lang.String r2 = r2.a0(r0, r3)
            return r2
    }

    public final byte[] N(long r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L1f
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L1f
            long r0 = r2.B
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L1a
            int r3 = (int) r3
            byte[] r3 = new byte[r3]
            r2.readFully(r3)
            return r3
        L1a:
            defpackage.i.n()
        L1d:
            r2 = 0
            return r2
        L1f:
            java.lang.String r2 = "byteCount: "
            java.lang.String r2 = defpackage.lb1.h(r3, r2)
            defpackage.i.f(r2)
            goto L1d
    }

    @Override // defpackage.ui6
    public final void O(defpackage.k80 r10, long r11) {
            r9 = this;
            r10.getClass()
            if (r10 == r9) goto L115
            long r0 = r10.B
            r2 = 0
            r4 = r11
            defpackage.hf.D(r0, r2, r4)
        Ld:
            r0 = 0
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 <= 0) goto L114
            o96 r0 = r10.A
            r0.getClass()
            int r0 = r0.c
            o96 r1 = r10.A
            r1.getClass()
            int r1 = r1.b
            int r0 = r0 - r1
            long r0 = (long) r0
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r1 = 0
            if (r0 >= 0) goto La1
            o96 r0 = r9.A
            if (r0 == 0) goto L2f
            o96 r0 = r0.g
            goto L30
        L2f:
            r0 = 0
        L30:
            if (r0 == 0) goto L5e
            boolean r2 = r0.e
            if (r2 == 0) goto L5e
            int r2 = r0.c
            long r2 = (long) r2
            long r2 = r2 + r11
            boolean r4 = r0.d
            if (r4 == 0) goto L40
            r4 = r1
            goto L42
        L40:
            int r4 = r0.b
        L42:
            long r4 = (long) r4
            long r2 = r2 - r4
            r4 = 8192(0x2000, double:4.0474E-320)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L5e
            o96 r1 = r10.A
            r1.getClass()
            int r2 = (int) r11
            r1.d(r0, r2)
            long r0 = r10.B
            long r0 = r0 - r11
            r10.B = r0
            long r0 = r9.B
            long r0 = r0 + r11
            r9.B = r0
            return
        L5e:
            o96 r0 = r10.A
            r0.getClass()
            int r2 = (int) r11
            if (r2 <= 0) goto L9b
            int r3 = r0.c
            int r4 = r0.b
            int r3 = r3 - r4
            if (r2 > r3) goto L9b
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L76
            o96 r3 = r0.c()
            goto L86
        L76:
            o96 r3 = defpackage.r96.b()
            byte[] r4 = r0.a
            byte[] r5 = r3.a
            int r6 = r0.b
            int r7 = r6 + r2
            r8 = 2
            defpackage.fv.u0(r6, r7, r8, r4, r5)
        L86:
            int r4 = r3.b
            int r4 = r4 + r2
            r3.c = r4
            int r4 = r0.b
            int r4 = r4 + r2
            r0.b = r4
            o96 r0 = r0.g
            r0.getClass()
            r0.b(r3)
            r10.A = r3
            goto La1
        L9b:
            java.lang.String r9 = "byteCount out of range"
            defpackage.i.h(r9)
            return
        La1:
            o96 r0 = r10.A
            r0.getClass()
            int r2 = r0.c
            int r3 = r0.b
            int r2 = r2 - r3
            long r2 = (long) r2
            o96 r4 = r0.a()
            r10.A = r4
            o96 r4 = r9.A
            if (r4 != 0) goto Lbd
            r9.A = r0
            r0.g = r0
            r0.f = r0
            goto L102
        Lbd:
            o96 r4 = r4.g
            r4.getClass()
            r4.b(r0)
            o96 r4 = r0.g
            if (r4 == r0) goto L10f
            r4.getClass()
            boolean r4 = r4.e
            if (r4 != 0) goto Ld1
            goto L102
        Ld1:
            int r4 = r0.c
            int r5 = r0.b
            int r4 = r4 - r5
            o96 r5 = r0.g
            r5.getClass()
            int r5 = r5.c
            int r5 = 8192 - r5
            o96 r6 = r0.g
            r6.getClass()
            boolean r6 = r6.d
            if (r6 == 0) goto Le9
            goto Lf0
        Le9:
            o96 r1 = r0.g
            r1.getClass()
            int r1 = r1.b
        Lf0:
            int r5 = r5 + r1
            if (r4 <= r5) goto Lf4
            goto L102
        Lf4:
            o96 r1 = r0.g
            r1.getClass()
            r0.d(r1, r4)
            r0.a()
            defpackage.r96.a(r0)
        L102:
            long r0 = r10.B
            long r0 = r0 - r2
            r10.B = r0
            long r0 = r9.B
            long r0 = r0 + r2
            r9.B = r0
            long r11 = r11 - r2
            goto Ld
        L10f:
            java.lang.String r9 = "cannot compact"
            defpackage.i.m(r9)
        L114:
            return
        L115:
            java.lang.String r9 = "source == this"
            defpackage.i.h(r9)
            return
    }

    @Override // defpackage.y80
    public final /* bridge */ /* synthetic */ defpackage.y80 P(defpackage.da0 r1) {
            r0 = this;
            r0.k0(r1)
            return r0
    }

    @Override // defpackage.z80
    public final boolean T(long r3) {
            r2 = this;
            long r0 = r2.B
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L8
            r2 = 1
            return r2
        L8:
            r2 = 0
            return r2
    }

    public final long U() {
            r19 = this;
            r0 = r19
            long r1 = r0.B
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto Ld3
            r1 = 0
            r5 = -7
            r2 = r1
            r8 = r3
            r6 = r5
            r5 = r2
        L11:
            o96 r10 = r0.A
            r10.getClass()
            byte[] r11 = r10.a
            int r12 = r10.b
            int r13 = r10.c
        L1c:
            if (r12 >= r13) goto L78
            r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L63
            r14 = 57
            if (r15 > r14) goto L63
            int r14 = 48 - r15
            r16 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r16 < 0) goto L43
            r17 = r3
            if (r16 != 0) goto L3d
            long r3 = (long) r14
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L3d
            goto L43
        L3d:
            r3 = 10
            long r8 = r8 * r3
            long r3 = (long) r14
            long r8 = r8 + r3
            goto L6f
        L43:
            k80 r0 = new k80
            r0.<init>()
            r0.o0(r8)
            r0.n0(r15)
            if (r2 != 0) goto L53
            r0.readByte()
        L53:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.c0()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L63:
            r17 = r3
            r3 = 45
            if (r15 != r3) goto L76
            if (r1 != 0) goto L76
            r2 = 1
            long r6 = r6 - r2
            r2 = 1
        L6f:
            int r12 = r12 + 1
            int r1 = r1 + 1
            r3 = r17
            goto L1c
        L76:
            r5 = 1
            goto L7a
        L78:
            r17 = r3
        L7a:
            if (r12 != r13) goto L86
            o96 r3 = r10.a()
            r0.A = r3
            defpackage.r96.a(r10)
            goto L88
        L86:
            r10.b = r12
        L88:
            if (r5 != 0) goto L93
            o96 r3 = r0.A
            if (r3 != 0) goto L8f
            goto L93
        L8f:
            r3 = r17
            goto L11
        L93:
            long r3 = r0.B
            long r5 = (long) r1
            long r3 = r3 - r5
            r0.B = r3
            if (r2 == 0) goto L9d
            r14 = 2
            goto L9e
        L9d:
            r14 = 1
        L9e:
            if (r1 >= r14) goto Lce
            int r1 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r1 == 0) goto Lc8
            if (r2 == 0) goto La9
            java.lang.String r1 = "Expected a digit"
            goto Lab
        La9:
            java.lang.String r1 = "Expected a digit or '-'"
        Lab:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r3 = " but was 0x"
            java.lang.StringBuilder r1 = defpackage.i61.r(r1, r3)
            r3 = r17
            byte r0 = r0.v(r3)
            java.lang.String r0 = defpackage.hf.s0(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            throw r2
        Lc8:
            r3 = r17
            defpackage.i.n()
            return r3
        Lce:
            if (r2 == 0) goto Ld1
            return r8
        Ld1:
            long r0 = -r8
            return r0
        Ld3:
            defpackage.i.n()
            return r3
    }

    public final long X() {
            r14 = this;
            long r0 = r14.B
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L94
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            o96 r6 = r14.A
            r6.getClass()
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L16:
            if (r8 >= r9) goto L79
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L25
            r11 = 57
            if (r10 > r11) goto L25
            int r11 = r10 + (-48)
            goto L3a
        L25:
            r11 = 97
            if (r10 < r11) goto L30
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L30
            int r11 = r10 + (-87)
            goto L3a
        L30:
            r11 = 65
            if (r10 < r11) goto L65
            r11 = 70
            if (r10 > r11) goto L65
            int r11 = r10 + (-55)
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L16
        L4a:
            k80 r14 = new k80
            r14.<init>()
            r14.p0(r4)
            r14.n0(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r14 = r14.c0()
            java.lang.String r1 = "Number too large: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        L65:
            if (r0 == 0) goto L69
            r1 = 1
            goto L79
        L69:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.String r0 = defpackage.hf.s0(r10)
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r14.<init>(r0)
            throw r14
        L79:
            if (r8 != r9) goto L85
            o96 r7 = r6.a()
            r14.A = r7
            defpackage.r96.a(r6)
            goto L87
        L85:
            r6.b = r8
        L87:
            if (r1 != 0) goto L8d
            o96 r6 = r14.A
            if (r6 != 0) goto Lb
        L8d:
            long r1 = r14.B
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.B = r1
            return r4
        L94:
            defpackage.i.n()
            return r2
    }

    public final short Z() {
            r1 = this;
            short r1 = r1.readShort()
            r0 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r1
            int r0 = r0 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r1 = r1 | r0
            short r1 = (short) r1
            return r1
    }

    @Override // defpackage.z80
    public final defpackage.k80 a() {
            r0 = this;
            return r0
    }

    public final java.lang.String a0(long r7, java.nio.charset.Charset r9) {
            r6 = this;
            r9.getClass()
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L5a
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 > 0) goto L5a
            long r2 = r6.B
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 < 0) goto L56
            if (r0 != 0) goto L1c
            java.lang.String r6 = ""
            return r6
        L1c:
            o96 r0 = r6.A
            r0.getClass()
            int r1 = r0.b
            long r2 = (long) r1
            long r2 = r2 + r7
            int r4 = r0.c
            long r4 = (long) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L36
            java.lang.String r0 = new java.lang.String
            byte[] r6 = r6.N(r7)
            r0.<init>(r6, r9)
            return r0
        L36:
            java.lang.String r2 = new java.lang.String
            byte[] r3 = r0.a
            int r4 = (int) r7
            r2.<init>(r3, r1, r4, r9)
            int r9 = r0.b
            int r9 = r9 + r4
            r0.b = r9
            long r3 = r6.B
            long r3 = r3 - r7
            r6.B = r3
            int r7 = r0.c
            if (r9 != r7) goto L55
            o96 r7 = r0.a()
            r6.A = r7
            defpackage.r96.a(r0)
        L55:
            return r2
        L56:
            defpackage.i.n()
            return r1
        L5a:
            java.lang.String r6 = "byteCount: "
            java.lang.String r6 = defpackage.lb1.h(r7, r6)
            defpackage.i.f(r6)
            return r1
    }

    @Override // defpackage.in6
    public final defpackage.b67 b() {
            r0 = this;
            a67 r0 = defpackage.b67.d
            return r0
    }

    @Override // defpackage.in6
    public final long b0(defpackage.k80 r5, long r6) {
            r4 = this;
            r5.getClass()
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L1b
            long r2 = r4.B
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L12
            r4 = -1
            return r4
        L12:
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L17
            r6 = r2
        L17:
            r5.O(r4, r6)
            return r6
        L1b:
            java.lang.String r4 = "byteCount < 0: "
            java.lang.String r4 = defpackage.lb1.h(r6, r4)
            defpackage.i.f(r4)
            return r0
    }

    public final java.lang.String c0() {
            r3 = this;
            long r0 = r3.B
            java.nio.charset.Charset r2 = defpackage.qm0.a
            java.lang.String r3 = r3.a0(r0, r2)
            return r3
    }

    public final java.lang.Object clone() {
            r6 = this;
            k80 r0 = new k80
            r0.<init>()
            long r1 = r6.B
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto Le
            return r0
        Le:
            o96 r1 = r6.A
            r1.getClass()
            o96 r2 = r1.c()
            r0.A = r2
            r2.g = r2
            r2.f = r2
            o96 r3 = r1.f
        L1f:
            if (r3 == r1) goto L33
            o96 r4 = r2.g
            r4.getClass()
            r3.getClass()
            o96 r5 = r3.c()
            r4.b(r5)
            o96 r3 = r3.f
            goto L1f
        L33:
            long r1 = r6.B
            r0.B = r1
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.ui6
    public final void close() {
            r0 = this;
            return
    }

    public final void e() {
            r2 = this;
            long r0 = r2.B
            r2.skip(r0)
            return
    }

    public final defpackage.da0 e0(int r8) {
            r7 = this;
            if (r8 != 0) goto L5
            da0 r7 = defpackage.da0.R
            return r7
        L5:
            long r0 = r7.B
            r2 = 0
            long r4 = (long) r8
            defpackage.hf.D(r0, r2, r4)
            o96 r0 = r7.A
            r1 = 0
            r2 = r1
            r3 = r2
        L12:
            if (r2 >= r8) goto L2c
            r0.getClass()
            int r4 = r0.c
            int r5 = r0.b
            if (r4 == r5) goto L24
            int r4 = r4 - r5
            int r2 = r2 + r4
            int r3 = r3 + 1
            o96 r0 = r0.f
            goto L12
        L24:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = "s.limit == s.pos"
            r7.<init>(r8)
            throw r7
        L2c:
            byte[][] r0 = new byte[r3]
            int r2 = r3 * 2
            int[] r2 = new int[r2]
            o96 r7 = r7.A
            r4 = r1
        L35:
            if (r1 >= r8) goto L57
            r7.getClass()
            byte[] r5 = r7.a
            r0[r4] = r5
            int r5 = r7.c
            int r6 = r7.b
            int r5 = r5 - r6
            int r1 = r1 + r5
            int r5 = java.lang.Math.min(r1, r8)
            r2[r4] = r5
            int r5 = r4 + r3
            int r6 = r7.b
            r2[r5] = r6
            r5 = 1
            r7.d = r5
            int r4 = r4 + r5
            o96 r7 = r7.f
            goto L35
        L57:
            s96 r7 = new s96
            r7.<init>(r0, r2)
            return r7
    }

    public final boolean equals(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r0 != r1) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof defpackage.k80
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            long r5 = r0.B
            k80 r1 = (defpackage.k80) r1
            long r7 = r1.B
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L19
            return r4
        L19:
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L20
            return r2
        L20:
            o96 r3 = r0.A
            r3.getClass()
            o96 r1 = r1.A
            r1.getClass()
            int r5 = r3.b
            int r6 = r1.b
            r9 = r7
        L2f:
            long r11 = r0.B
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L74
            int r11 = r3.c
            int r11 = r11 - r5
            int r12 = r1.c
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L41:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L5c
            byte[] r15 = r3.a
            int r16 = r5 + 1
            r5 = r15[r5]
            byte[] r15 = r1.a
            int r17 = r6 + 1
            r6 = r15[r6]
            if (r5 == r6) goto L54
            return r4
        L54:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L41
        L5c:
            int r13 = r3.c
            if (r5 != r13) goto L67
            o96 r3 = r3.f
            r3.getClass()
            int r5 = r3.b
        L67:
            int r13 = r1.c
            if (r6 != r13) goto L72
            o96 r1 = r1.f
            r1.getClass()
            int r6 = r1.b
        L72:
            long r9 = r9 + r11
            goto L2f
        L74:
            return r2
    }

    @Override // defpackage.y80, defpackage.ui6, java.io.Flushable
    public final void flush() {
            r0 = this;
            return
    }

    @Override // defpackage.z80
    public final void g0(long r3) {
            r2 = this;
            long r0 = r2.B
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L7
            return
        L7:
            defpackage.i.n()
            return
    }

    @Override // defpackage.y80
    public final /* bridge */ /* synthetic */ defpackage.y80 h0(long r1) {
            r0 = this;
            r0.o0(r1)
            return r0
    }

    public final int hashCode() {
            r5 = this;
            o96 r0 = r5.A
            if (r0 != 0) goto L6
            r5 = 0
            return r5
        L6:
            r1 = 1
        L7:
            int r2 = r0.b
            int r3 = r0.c
        Lb:
            if (r2 >= r3) goto L17
            int r1 = r1 * 31
            byte[] r4 = r0.a
            r4 = r4[r2]
            int r1 = r1 + r4
            int r2 = r2 + 1
            goto Lb
        L17:
            o96 r0 = r0.f
            r0.getClass()
            o96 r2 = r5.A
            if (r0 != r2) goto L7
            return r1
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
            r0 = this;
            r0 = 1
            return r0
    }

    public final defpackage.o96 j0(int r3) {
            r2 = this;
            r0 = 1
            if (r3 < r0) goto L2e
            r0 = 8192(0x2000, float:1.148E-41)
            if (r3 > r0) goto L2e
            o96 r1 = r2.A
            if (r1 != 0) goto L16
            o96 r3 = defpackage.r96.b()
            r2.A = r3
            r3.g = r3
            r3.f = r3
            return r3
        L16:
            o96 r2 = r1.g
            r2.getClass()
            int r1 = r2.c
            int r1 = r1 + r3
            if (r1 > r0) goto L26
            boolean r3 = r2.e
            if (r3 != 0) goto L25
            goto L26
        L25:
            return r2
        L26:
            o96 r3 = defpackage.r96.b()
            r2.b(r3)
            return r3
        L2e:
            java.lang.String r2 = "unexpected capacity"
            defpackage.i.h(r2)
            r2 = 0
            return r2
    }

    public final long k() {
            r5 = this;
            long r0 = r5.B
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            return r2
        L9:
            o96 r5 = r5.A
            r5.getClass()
            o96 r5 = r5.g
            r5.getClass()
            int r2 = r5.c
            r3 = 8192(0x2000, float:1.148E-41)
            if (r2 >= r3) goto L22
            boolean r3 = r5.e
            if (r3 == 0) goto L22
            int r5 = r5.b
            int r2 = r2 - r5
            long r2 = (long) r2
            long r0 = r0 - r2
        L22:
            return r0
    }

    public final void k0(defpackage.da0 r2) {
            r1 = this;
            r2.getClass()
            int r0 = r2.d()
            r2.t(r1, r0)
            return
    }

    @Override // defpackage.z80
    public final defpackage.da0 l(long r5) {
            r4 = this;
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L31
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 > 0) goto L31
            long r2 = r4.B
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L2d
            r0 = 4096(0x1000, double:2.0237E-320)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L23
            int r0 = (int) r5
            da0 r0 = r4.e0(r0)
            r4.skip(r5)
            return r0
        L23:
            da0 r0 = new da0
            byte[] r4 = r4.N(r5)
            r0.<init>(r4)
            return r0
        L2d:
            defpackage.i.n()
            return r1
        L31:
            java.lang.String r4 = "byteCount: "
            java.lang.String r4 = defpackage.lb1.h(r5, r4)
            defpackage.i.f(r4)
            return r1
    }

    public final void l0(byte[] r9, int r10) {
            r8 = this;
            r9.getClass()
            int r0 = r9.length
            long r1 = (long) r0
            long r5 = (long) r10
            r3 = 0
            defpackage.hf.D(r1, r3, r5)
            r0 = 0
        Lc:
            if (r0 >= r10) goto L2d
            r1 = 1
            o96 r1 = r8.j0(r1)
            int r2 = r10 - r0
            int r3 = r1.c
            int r3 = 8192 - r3
            int r2 = java.lang.Math.min(r2, r3)
            byte[] r3 = r1.a
            int r4 = r1.c
            int r7 = r0 + r2
            defpackage.fv.q0(r4, r0, r7, r9, r3)
            int r0 = r1.c
            int r0 = r0 + r2
            r1.c = r0
            r0 = r7
            goto Lc
        L2d:
            long r9 = r8.B
            long r9 = r9 + r5
            r8.B = r9
            return
    }

    public final void m0(defpackage.in6 r5) {
            r4 = this;
            r5.getClass()
        L3:
            r0 = 8192(0x2000, double:4.0474E-320)
            long r0 = r5.b0(r4, r0)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L10
            goto L3
        L10:
            return
    }

    public final void n(defpackage.k80 r7, long r8, long r10) {
            r6 = this;
            r7.getClass()
            long r0 = r6.B
            r2 = r8
            r4 = r10
            defpackage.hf.D(r0, r2, r4)
            r8 = 0
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 != 0) goto L11
            goto L63
        L11:
            long r10 = r7.B
            long r10 = r10 + r4
            r7.B = r10
            o96 r6 = r6.A
        L18:
            r6.getClass()
            int r10 = r6.c
            int r11 = r6.b
            int r10 = r10 - r11
            long r10 = (long) r10
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 < 0) goto L29
            long r2 = r2 - r10
            o96 r6 = r6.f
            goto L18
        L29:
            r10 = r4
        L2a:
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L63
            r6.getClass()
            o96 r0 = r6.c()
            int r1 = r0.b
            int r2 = (int) r2
            int r1 = r1 + r2
            r0.b = r1
            int r2 = (int) r10
            int r1 = r1 + r2
            int r2 = r0.c
            int r1 = java.lang.Math.min(r1, r2)
            r0.c = r1
            o96 r1 = r7.A
            if (r1 != 0) goto L50
            r0.g = r0
            r0.f = r0
            r7.A = r0
            goto L58
        L50:
            o96 r1 = r1.g
            r1.getClass()
            r1.b(r0)
        L58:
            int r1 = r0.c
            int r0 = r0.b
            int r1 = r1 - r0
            long r0 = (long) r1
            long r10 = r10 - r0
            o96 r6 = r6.f
            r2 = r8
            goto L2a
        L63:
            return
    }

    public final void n0(int r5) {
            r4 = this;
            r0 = 1
            o96 r0 = r4.j0(r0)
            byte[] r1 = r0.a
            int r2 = r0.c
            int r3 = r2 + 1
            r0.c = r3
            byte r5 = (byte) r5
            r1[r2] = r5
            long r0 = r4.B
            r2 = 1
            long r0 = r0 + r2
            r4.B = r0
            return
    }

    public final void o0(long r12) {
            r11 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 != 0) goto Lc
            r12 = 48
            r11.n0(r12)
            return
        Lc:
            r3 = 0
            r4 = 1
            if (r2 >= 0) goto L1d
            long r12 = -r12
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1b
            java.lang.String r12 = "-9223372036854775808"
            r11.t0(r12)
            return
        L1b:
            r2 = r4
            goto L1e
        L1d:
            r2 = r3
        L1e:
            byte[] r5 = defpackage.b.a
            int r5 = java.lang.Long.numberOfLeadingZeros(r12)
            int r5 = 64 - r5
            int r5 = r5 * 10
            int r5 = r5 >>> 5
            long[] r6 = defpackage.b.b
            r7 = r6[r5]
            int r6 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r6 <= 0) goto L33
            r3 = r4
        L33:
            int r5 = r5 + r3
            if (r2 == 0) goto L38
            int r5 = r5 + 1
        L38:
            o96 r3 = r11.j0(r5)
            byte[] r4 = r3.a
            int r6 = r3.c
            int r6 = r6 + r5
        L41:
            int r7 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r7 == 0) goto L54
            r7 = 10
            long r9 = r12 % r7
            int r9 = (int) r9
            int r6 = r6 + (-1)
            byte[] r10 = defpackage.b.a
            r9 = r10[r9]
            r4[r6] = r9
            long r12 = r12 / r7
            goto L41
        L54:
            if (r2 == 0) goto L5c
            int r6 = r6 + (-1)
            r12 = 45
            r4[r6] = r12
        L5c:
            int r12 = r3.c
            int r12 = r12 + r5
            r3.c = r12
            long r12 = r11.B
            long r0 = (long) r5
            long r12 = r12 + r0
            r11.B = r12
            return
    }

    public final void p0(long r13) {
            r12 = this;
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc
            r13 = 48
            r12.n0(r13)
            return
        Lc:
            r0 = 1
            long r1 = r13 >>> r0
            long r1 = r1 | r13
            r3 = 2
            long r4 = r1 >>> r3
            long r1 = r1 | r4
            r4 = 4
            long r5 = r1 >>> r4
            long r1 = r1 | r5
            r5 = 8
            long r6 = r1 >>> r5
            long r1 = r1 | r6
            r6 = 16
            long r7 = r1 >>> r6
            long r1 = r1 | r7
            r7 = 32
            long r8 = r1 >>> r7
            long r1 = r1 | r8
            long r8 = r1 >>> r0
            r10 = 6148914691236517205(0x5555555555555555, double:1.1945305291614955E103)
            long r8 = r8 & r10
            long r1 = r1 - r8
            long r8 = r1 >>> r3
            r10 = 3689348814741910323(0x3333333333333333, double:4.667261458395856E-62)
            long r8 = r8 & r10
            long r1 = r1 & r10
            long r8 = r8 + r1
            long r1 = r8 >>> r4
            long r1 = r1 + r8
            r8 = 1085102592571150095(0xf0f0f0f0f0f0f0f, double:3.815736827118017E-236)
            long r1 = r1 & r8
            long r8 = r1 >>> r5
            long r1 = r1 + r8
            long r5 = r1 >>> r6
            long r1 = r1 + r5
            r5 = 63
            long r8 = r1 & r5
            long r1 = r1 >>> r7
            long r1 = r1 & r5
            long r8 = r8 + r1
            r1 = 3
            long r8 = r8 + r1
            r1 = 4
            long r8 = r8 / r1
            int r1 = (int) r8
            o96 r2 = r12.j0(r1)
            byte[] r3 = r2.a
            int r5 = r2.c
            int r6 = r5 + r1
            int r6 = r6 - r0
        L62:
            if (r6 < r5) goto L72
            byte[] r0 = defpackage.b.a
            r7 = 15
            long r7 = r7 & r13
            int r7 = (int) r7
            r0 = r0[r7]
            r3[r6] = r0
            long r13 = r13 >>> r4
            int r6 = r6 + (-1)
            goto L62
        L72:
            int r13 = r2.c
            int r13 = r13 + r1
            r2.c = r13
            long r13 = r12.B
            long r0 = (long) r1
            long r13 = r13 + r0
            r12.B = r13
            return
    }

    @Override // defpackage.z80
    public final byte[] q() {
            r2 = this;
            long r0 = r2.B
            byte[] r2 = r2.N(r0)
            return r2
    }

    public final void q0(int r8) {
            r7 = this;
            r0 = 4
            o96 r1 = r7.j0(r0)
            byte[] r2 = r1.a
            int r3 = r1.c
            int r4 = r3 + 1
            int r5 = r8 >>> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r2[r3] = r5
            int r5 = r3 + 2
            int r6 = r8 >>> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 3
            int r6 = r8 >>> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r2[r5] = r6
            int r3 = r3 + r0
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r2[r4] = r8
            r1.c = r3
            long r0 = r7.B
            r2 = 4
            long r0 = r0 + r2
            r7.B = r0
            return
    }

    public final void r0(int r7) {
            r6 = this;
            r0 = 2
            o96 r1 = r6.j0(r0)
            byte[] r2 = r1.a
            int r3 = r1.c
            int r4 = r3 + 1
            int r5 = r7 >>> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r2[r3] = r5
            int r3 = r3 + r0
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r2[r4] = r7
            r1.c = r3
            long r0 = r6.B
            r2 = 2
            long r0 = r0 + r2
            r6.B = r0
            return
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer r7) {
            r6 = this;
            r7.getClass()
            o96 r0 = r6.A
            if (r0 != 0) goto L9
            r6 = -1
            return r6
        L9:
            int r1 = r7.remaining()
            int r2 = r0.c
            int r3 = r0.b
            int r2 = r2 - r3
            int r1 = java.lang.Math.min(r1, r2)
            byte[] r2 = r0.a
            int r3 = r0.b
            r7.put(r2, r3, r1)
            int r7 = r0.b
            int r7 = r7 + r1
            r0.b = r7
            long r2 = r6.B
            long r4 = (long) r1
            long r2 = r2 - r4
            r6.B = r2
            int r2 = r0.c
            if (r7 != r2) goto L35
            o96 r7 = r0.a()
            r6.A = r7
            defpackage.r96.a(r0)
        L35:
            return r1
    }

    public final int read(byte[] r8, int r9, int r10) {
            r7 = this;
            r8.getClass()
            int r0 = r8.length
            long r1 = (long) r0
            long r3 = (long) r9
            long r5 = (long) r10
            defpackage.hf.D(r1, r3, r5)
            o96 r0 = r7.A
            if (r0 != 0) goto L10
            r7 = -1
            return r7
        L10:
            int r1 = r0.c
            int r2 = r0.b
            int r1 = r1 - r2
            int r10 = java.lang.Math.min(r10, r1)
            byte[] r1 = r0.a
            int r2 = r0.b
            int r3 = r2 + r10
            defpackage.fv.q0(r9, r2, r3, r1, r8)
            int r8 = r0.b
            int r8 = r8 + r10
            r0.b = r8
            long r1 = r7.B
            long r3 = (long) r10
            long r1 = r1 - r3
            r7.B = r1
            int r9 = r0.c
            if (r8 != r9) goto L3a
            o96 r8 = r0.a()
            r7.A = r8
            defpackage.r96.a(r0)
        L3a:
            return r10
    }

    @Override // defpackage.z80
    public final byte readByte() {
            r9 = this;
            long r0 = r9.B
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L2d
            o96 r0 = r9.A
            r0.getClass()
            int r1 = r0.b
            int r2 = r0.c
            byte[] r3 = r0.a
            int r4 = r1 + 1
            r1 = r3[r1]
            long r5 = r9.B
            r7 = 1
            long r5 = r5 - r7
            r9.B = r5
            if (r4 != r2) goto L2a
            o96 r2 = r0.a()
            r9.A = r2
            defpackage.r96.a(r0)
            return r1
        L2a:
            r0.b = r4
            return r1
        L2d:
            defpackage.i.n()
            r9 = 0
            return r9
    }

    @Override // defpackage.z80
    public final void readFully(byte[] r4) {
            r3 = this;
            r4.getClass()
            r0 = 0
        L4:
            int r1 = r4.length
            if (r0 >= r1) goto L15
            int r1 = r4.length
            int r1 = r1 - r0
            int r1 = r3.read(r4, r0, r1)
            r2 = -1
            if (r1 == r2) goto L12
            int r0 = r0 + r1
            goto L4
        L12:
            defpackage.i.n()
        L15:
            return
    }

    @Override // defpackage.z80
    public final int readInt() {
            r9 = this;
            long r0 = r9.B
            r2 = 4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L71
            o96 r0 = r9.A
            r0.getClass()
            int r1 = r0.b
            int r4 = r0.c
            int r5 = r4 - r1
            long r5 = (long) r5
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L3a
            byte r0 = r9.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            byte r1 = r9.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            byte r1 = r9.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            byte r9 = r9.readByte()
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r9 | r0
            return r9
        L3a:
            byte[] r5 = r0.a
            int r6 = r1 + 1
            r7 = r5[r1]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 24
            int r8 = r1 + 2
            r6 = r5[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r6 = r6 | r7
            int r7 = r1 + 3
            r8 = r5[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            r6 = r6 | r8
            int r1 = r1 + 4
            r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            long r6 = r9.B
            long r6 = r6 - r2
            r9.B = r6
            if (r1 != r4) goto L6e
            o96 r1 = r0.a()
            r9.A = r1
            defpackage.r96.a(r0)
            return r5
        L6e:
            r0.b = r1
            return r5
        L71:
            defpackage.i.n()
            r9 = 0
            return r9
    }

    @Override // defpackage.z80
    public final long readLong() {
            r15 = this;
            long r0 = r15.B
            r2 = 8
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L92
            o96 r0 = r15.A
            r0.getClass()
            int r1 = r0.b
            int r4 = r0.c
            int r5 = r4 - r1
            long r5 = (long) r5
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 32
            if (r5 >= 0) goto L2e
            int r0 = r15.readInt()
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = r0 << r6
            int r15 = r15.readInt()
            long r4 = (long) r15
            long r2 = r2 & r4
            long r0 = r0 | r2
            return r0
        L2e:
            byte[] r5 = r0.a
            int r7 = r1 + 1
            r8 = r5[r1]
            long r8 = (long) r8
            r10 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r10
            r12 = 56
            long r8 = r8 << r12
            int r12 = r1 + 2
            r7 = r5[r7]
            long r13 = (long) r7
            long r13 = r13 & r10
            r7 = 48
            long r13 = r13 << r7
            long r7 = r8 | r13
            int r9 = r1 + 3
            r12 = r5[r12]
            long r12 = (long) r12
            long r12 = r12 & r10
            r14 = 40
            long r12 = r12 << r14
            long r7 = r7 | r12
            int r12 = r1 + 4
            r9 = r5[r9]
            long r13 = (long) r9
            long r13 = r13 & r10
            long r13 = r13 << r6
            long r6 = r7 | r13
            int r8 = r1 + 5
            r9 = r5[r12]
            long r12 = (long) r9
            long r12 = r12 & r10
            r9 = 24
            long r12 = r12 << r9
            long r6 = r6 | r12
            int r9 = r1 + 6
            r8 = r5[r8]
            long r12 = (long) r8
            long r12 = r12 & r10
            r8 = 16
            long r12 = r12 << r8
            long r6 = r6 | r12
            int r8 = r1 + 7
            r9 = r5[r9]
            long r12 = (long) r9
            long r12 = r12 & r10
            r9 = 8
            long r12 = r12 << r9
            long r6 = r6 | r12
            int r1 = r1 + r9
            r5 = r5[r8]
            long r8 = (long) r5
            long r8 = r8 & r10
            long r5 = r6 | r8
            long r7 = r15.B
            long r7 = r7 - r2
            r15.B = r7
            if (r1 != r4) goto L8f
            o96 r1 = r0.a()
            r15.A = r1
            defpackage.r96.a(r0)
            return r5
        L8f:
            r0.b = r1
            return r5
        L92:
            defpackage.i.n()
            r0 = 0
            return r0
    }

    @Override // defpackage.z80
    public final short readShort() {
            r9 = this;
            long r0 = r9.B
            r2 = 2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L4c
            o96 r0 = r9.A
            r0.getClass()
            int r1 = r0.b
            int r4 = r0.c
            int r5 = r4 - r1
            r6 = 2
            if (r5 >= r6) goto L27
            byte r0 = r9.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            byte r9 = r9.readByte()
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r9 | r0
            short r9 = (short) r9
            return r9
        L27:
            byte[] r5 = r0.a
            int r7 = r1 + 1
            r8 = r5[r1]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            int r1 = r1 + r6
            r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r8
            long r6 = r9.B
            long r6 = r6 - r2
            r9.B = r6
            if (r1 != r4) goto L48
            o96 r1 = r0.a()
            r9.A = r1
            defpackage.r96.a(r0)
            goto L4a
        L48:
            r0.b = r1
        L4a:
            short r9 = (short) r5
            return r9
        L4c:
            defpackage.i.n()
            r9 = 0
            return r9
    }

    public final void s0(int r10, int r11, java.lang.String r12) {
            r9 = this;
            r12.getClass()
            if (r10 < 0) goto L138
            if (r11 < r10) goto L12c
            int r0 = r12.length()
            if (r11 > r0) goto L10f
        Ld:
            if (r10 >= r11) goto L10e
            char r0 = r12.charAt(r10)
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L4b
            r2 = 1
            o96 r2 = r9.j0(r2)
            byte[] r3 = r2.a
            int r4 = r2.c
            int r4 = r4 - r10
            int r5 = 8192 - r4
            int r5 = java.lang.Math.min(r11, r5)
            int r6 = r10 + 1
            int r10 = r10 + r4
            byte r0 = (byte) r0
            r3[r10] = r0
        L2d:
            r10 = r6
            if (r10 >= r5) goto L3d
            char r0 = r12.charAt(r10)
            if (r0 >= r1) goto L3d
            int r6 = r10 + 1
            int r10 = r10 + r4
            byte r0 = (byte) r0
            r3[r10] = r0
            goto L2d
        L3d:
            int r4 = r4 + r10
            int r0 = r2.c
            int r4 = r4 - r0
            int r0 = r0 + r4
            r2.c = r0
            long r0 = r9.B
            long r2 = (long) r4
            long r0 = r0 + r2
            r9.B = r0
            goto Ld
        L4b:
            r2 = 2048(0x800, float:2.87E-42)
            if (r0 >= r2) goto L74
            r2 = 2
            o96 r3 = r9.j0(r2)
            byte[] r4 = r3.a
            int r5 = r3.c
            int r6 = r0 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            r4[r6] = r0
            int r5 = r5 + r2
            r3.c = r5
            long r0 = r9.B
            r2 = 2
            long r0 = r0 + r2
            r9.B = r0
        L71:
            int r10 = r10 + 1
            goto Ld
        L74:
            r2 = 55296(0xd800, float:7.7486E-41)
            r3 = 63
            if (r0 < r2) goto Le1
            r2 = 57343(0xdfff, float:8.0355E-41)
            if (r0 <= r2) goto L81
            goto Le1
        L81:
            int r2 = r10 + 1
            if (r2 >= r11) goto L8a
            char r4 = r12.charAt(r2)
            goto L8b
        L8a:
            r4 = 0
        L8b:
            r5 = 56319(0xdbff, float:7.892E-41)
            if (r0 > r5) goto Ldb
            r5 = 56320(0xdc00, float:7.8921E-41)
            if (r5 > r4) goto Ldb
            r5 = 57344(0xe000, float:8.0356E-41)
            if (r4 >= r5) goto Ldb
            r0 = r0 & 1023(0x3ff, float:1.434E-42)
            int r0 = r0 << 10
            r2 = r4 & 1023(0x3ff, float:1.434E-42)
            r0 = r0 | r2
            r2 = 65536(0x10000, float:9.1835E-41)
            int r0 = r0 + r2
            r2 = 4
            o96 r4 = r9.j0(r2)
            byte[] r5 = r4.a
            int r6 = r4.c
            int r7 = r0 >> 18
            r7 = r7 | 240(0xf0, float:3.36E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            int r7 = r6 + 1
            int r8 = r0 >> 12
            r8 = r8 & r3
            r8 = r8 | r1
            byte r8 = (byte) r8
            r5[r7] = r8
            int r7 = r6 + 2
            int r8 = r0 >> 6
            r8 = r8 & r3
            r8 = r8 | r1
            byte r8 = (byte) r8
            r5[r7] = r8
            int r7 = r6 + 3
            r0 = r0 & r3
            r0 = r0 | r1
            byte r0 = (byte) r0
            r5[r7] = r0
            int r6 = r6 + r2
            r4.c = r6
            long r0 = r9.B
            r2 = 4
            long r0 = r0 + r2
            r9.B = r0
            int r10 = r10 + 2
            goto Ld
        Ldb:
            r9.n0(r3)
            r10 = r2
            goto Ld
        Le1:
            r2 = 3
            o96 r4 = r9.j0(r2)
            byte[] r5 = r4.a
            int r6 = r4.c
            int r7 = r0 >> 12
            r7 = r7 | 224(0xe0, float:3.14E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            int r7 = r6 + 1
            int r8 = r0 >> 6
            r3 = r3 & r8
            r3 = r3 | r1
            byte r3 = (byte) r3
            r5[r7] = r3
            int r3 = r6 + 2
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            r5[r3] = r0
            int r6 = r6 + r2
            r4.c = r6
            long r0 = r9.B
            r2 = 3
            long r0 = r0 + r2
            r9.B = r0
            goto L71
        L10e:
            return
        L10f:
            java.lang.String r9 = "endIndex > string.length: "
            java.lang.String r10 = " > "
            java.lang.StringBuilder r9 = defpackage.xg6.t(r9, r11, r10)
            int r10 = r12.length()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L12c:
            java.lang.String r9 = "endIndex < beginIndex: "
            java.lang.String r12 = " < "
            java.lang.String r9 = defpackage.lb1.j(r9, r11, r10, r12)
            defpackage.i.f(r9)
            return
        L138:
            java.lang.String r9 = "beginIndex < 0: "
            java.lang.String r9 = defpackage.lb1.g(r10, r9)
            defpackage.i.f(r9)
            return
    }

    @Override // defpackage.z80
    public final void skip(long r7) {
            r6 = this;
        L0:
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L32
            o96 r0 = r6.A
            if (r0 == 0) goto L2f
            int r1 = r0.c
            int r2 = r0.b
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r7, r1)
            int r1 = (int) r1
            long r2 = r6.B
            long r4 = (long) r1
            long r2 = r2 - r4
            r6.B = r2
            long r7 = r7 - r4
            int r2 = r0.b
            int r2 = r2 + r1
            r0.b = r2
            int r1 = r0.c
            if (r2 != r1) goto L0
            o96 r1 = r0.a()
            r6.A = r1
            defpackage.r96.a(r0)
            goto L0
        L2f:
            defpackage.i.n()
        L32:
            return
    }

    @Override // defpackage.z80
    public final int t(defpackage.eo4 r4) {
            r3 = this;
            r4.getClass()
            r0 = 0
            int r0 = defpackage.b.d(r3, r4, r0)
            r1 = -1
            if (r0 != r1) goto Lc
            return r1
        Lc:
            da0[] r4 = r4.A
            r4 = r4[r0]
            int r4 = r4.d()
            long r1 = (long) r4
            r3.skip(r1)
            return r0
    }

    public final void t0(java.lang.String r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            int r1 = r3.length()
            r2.s0(r0, r1, r3)
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            long r0 = r4.B
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L13
            int r0 = (int) r0
            da0 r4 = r4.e0(r0)
            java.lang.String r4 = r4.toString()
            return r4
        L13:
            long r0 = r4.B
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "size > Int.MAX_VALUE: "
            r4.<init>(r2)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public final boolean u() {
            r4 = this;
            long r0 = r4.B
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto La
            r4 = 1
            return r4
        La:
            r4 = 0
            return r4
    }

    public final void u0(int r9) {
            r8 = this;
            r0 = 128(0x80, float:1.8E-43)
            if (r9 >= r0) goto L8
            r8.n0(r9)
            return
        L8:
            r1 = 2048(0x800, float:2.87E-42)
            r2 = 63
            if (r9 >= r1) goto L30
            r1 = 2
            o96 r3 = r8.j0(r1)
            byte[] r4 = r3.a
            int r5 = r3.c
            int r6 = r9 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.c = r5
            long r0 = r8.B
            r2 = 2
            long r0 = r0 + r2
            r8.B = r0
            return
        L30:
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r1 > r9) goto L3e
            r1 = 57344(0xe000, float:8.0356E-41)
            if (r9 >= r1) goto L3e
            r8.n0(r2)
            return
        L3e:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r9 >= r1) goto L6d
            r1 = 3
            o96 r3 = r8.j0(r1)
            byte[] r4 = r3.a
            int r5 = r3.c
            int r6 = r9 >> 12
            r6 = r6 | 224(0xe0, float:3.14E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            int r7 = r9 >> 6
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 2
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.c = r5
            long r0 = r8.B
            r2 = 3
            long r0 = r0 + r2
            r8.B = r0
            return
        L6d:
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r9 > r1) goto La6
            r1 = 4
            o96 r3 = r8.j0(r1)
            byte[] r4 = r3.a
            int r5 = r3.c
            int r6 = r9 >> 18
            r6 = r6 | 240(0xf0, float:3.36E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            int r7 = r9 >> 12
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 2
            int r7 = r9 >> 6
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 3
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.c = r5
            long r0 = r8.B
            r2 = 4
            long r0 = r0 + r2
            r8.B = r0
            return
        La6:
            java.lang.String r8 = defpackage.hf.t0(r9)
            java.lang.String r9 = "Unexpected code point: 0x"
            java.lang.String r8 = r9.concat(r8)
            defpackage.i.h(r8)
            return
    }

    public final byte v(long r7) {
            r6 = this;
            long r0 = r6.B
            r4 = 1
            r2 = r7
            defpackage.hf.D(r0, r2, r4)
            o96 r7 = r6.A
            r7.getClass()
            long r0 = r6.B
            long r4 = r0 - r2
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L31
        L15:
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 <= 0) goto L26
            o96 r7 = r7.g
            r7.getClass()
            int r6 = r7.c
            int r8 = r7.b
            int r6 = r6 - r8
            long r4 = (long) r6
            long r0 = r0 - r4
            goto L15
        L26:
            byte[] r6 = r7.a
            int r7 = r7.b
            long r7 = (long) r7
            long r7 = r7 + r2
            long r7 = r7 - r0
            int r7 = (int) r7
            r6 = r6[r7]
            return r6
        L31:
            r0 = 0
        L33:
            int r6 = r7.c
            int r8 = r7.b
            int r6 = r6 - r8
            long r4 = (long) r6
            long r4 = r4 + r0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L45
            o96 r7 = r7.f
            r7.getClass()
            r0 = r4
            goto L33
        L45:
            byte[] r6 = r7.a
            long r7 = (long) r8
            long r7 = r7 + r2
            long r7 = r7 - r0
            int r7 = (int) r7
            r6 = r6[r7]
            return r6
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer r7) {
            r6 = this;
            r7.getClass()
            int r0 = r7.remaining()
            r1 = r0
        L8:
            if (r1 <= 0) goto L25
            r2 = 1
            o96 r2 = r6.j0(r2)
            int r3 = r2.c
            int r3 = 8192 - r3
            int r3 = java.lang.Math.min(r1, r3)
            byte[] r4 = r2.a
            int r5 = r2.c
            r7.get(r4, r5, r3)
            int r1 = r1 - r3
            int r4 = r2.c
            int r4 = r4 + r3
            r2.c = r4
            goto L8
        L25:
            long r1 = r6.B
            long r3 = (long) r0
            long r1 = r1 + r3
            r6.B = r1
            return r0
    }

    @Override // defpackage.y80
    public final defpackage.y80 write(byte[] r2) {
            r1 = this;
            r2.getClass()
            int r0 = r2.length
            r1.l0(r2, r0)
            return r1
    }

    @Override // defpackage.y80
    public final /* bridge */ /* synthetic */ defpackage.y80 writeByte(int r1) {
            r0 = this;
            r0.n0(r1)
            return r0
    }

    @Override // defpackage.y80
    public final /* bridge */ /* synthetic */ defpackage.y80 writeInt(int r1) {
            r0 = this;
            r0.q0(r1)
            return r0
    }

    @Override // defpackage.y80
    public final /* bridge */ /* synthetic */ defpackage.y80 writeShort(int r1) {
            r0 = this;
            r0.r0(r1)
            return r0
    }

    @Override // defpackage.z80
    public final java.lang.String y(long r12) {
            r11 = this;
            r0 = 0
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 < 0) goto L8b
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r7 = 1
            if (r2 != 0) goto L13
        L11:
            r4 = r0
            goto L16
        L13:
            long r0 = r12 + r7
            goto L11
        L16:
            r1 = 10
            r2 = 0
            r0 = r11
            long r1 = r0.A(r1, r2, r4)
            r9 = -1
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 == 0) goto L2a
            java.lang.String r0 = defpackage.b.c(r11, r1)
            return r0
        L2a:
            long r1 = r11.B
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 >= 0) goto L47
            long r1 = r4 - r7
            byte r1 = r11.v(r1)
            r2 = 13
            if (r1 != r2) goto L47
            byte r1 = r11.v(r4)
            r2 = 10
            if (r1 != r2) goto L47
            java.lang.String r0 = defpackage.b.c(r11, r4)
            return r0
        L47:
            k80 r1 = new k80
            r1.<init>()
            long r2 = r11.B
            r4 = 32
            long r4 = java.lang.Math.min(r4, r2)
            r2 = 0
            r0 = r11
            r0.n(r1, r2, r4)
            java.io.EOFException r2 = new java.io.EOFException
            long r3 = r11.B
            long r3 = java.lang.Math.min(r3, r12)
            long r5 = r1.B
            da0 r0 = r1.l(r5)
            java.lang.String r0 = r0.e()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "\\n not found: limit="
            r1.<init>(r5)
            r1.append(r3)
            java.lang.String r3 = " content="
            r1.append(r3)
            r1.append(r0)
            r0 = 8230(0x2026, float:1.1533E-41)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            throw r2
        L8b:
            java.lang.String r0 = "limit < 0: "
            java.lang.String r0 = defpackage.lb1.h(r12, r0)
            defpackage.i.f(r0)
            r0 = 0
            return r0
    }
}
