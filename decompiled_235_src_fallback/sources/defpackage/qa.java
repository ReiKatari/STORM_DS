package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qa  reason: default package */
/* loaded from: classes.dex */
public final class qa implements defpackage.nr6, defpackage.lo {
    public final /* synthetic */ int A;
    public long B;
    public java.lang.Object L;
    public java.lang.Object R;
    public java.lang.Object X;
    public java.lang.Object Y;
    public java.lang.Object Z;
    public java.lang.Object d0;
    public java.lang.Object e0;

    public qa() {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r0 = 0
            long[] r0 = new long[r0]
            r1.L = r0
            fi2[] r0 = defpackage.fi2.j
            r1.Y = r0
            md6[] r0 = defpackage.md6.q
            r1.d0 = r0
            return
    }

    public qa(defpackage.oc1 r11, defpackage.wc7 r12, java.lang.Object r13, defpackage.ap r14) {
            r10 = this;
            r0 = 2
            r10.A = r0
            eb r0 = new eb
            s35 r11 = r11.a
            r1 = 26
            r0.<init>(r11, r1)
            r10.<init>()
            r10.L = r0
            r10.R = r12
            r10.X = r13
            qn2 r11 = r12.a
            java.lang.Object r11 = r11.g(r13)
            ap r11 = (defpackage.ap) r11
            r10.Y = r11
            ap r13 = defpackage.nw7.R(r14)
            r10.Z = r13
            qn2 r12 = r12.b
            ap r13 = r0.E(r11, r14)
            java.lang.Object r12 = r12.g(r13)
            r10.e0 = r12
            java.lang.Object r12 = r0.R
            ap r12 = (defpackage.ap) r12
            if (r12 != 0) goto L3d
            ap r12 = r11.c()
            r0.R = r12
        L3d:
            java.lang.Object r12 = r0.R
            ap r12 = (defpackage.ap) r12
            if (r12 == 0) goto Lbb
            int r12 = r12.b()
            r13 = 0
            r1 = 0
            r3 = r13
        L4b:
            if (r3 >= r12) goto L7d
            java.lang.Object r4 = r0.B
            s35 r4 = (defpackage.s35) r4
            r11.getClass()
            float r5 = r14.a(r3)
            java.lang.Object r4 = r4.A
            gv r4 = (defpackage.gv) r4
            double r4 = r4.b(r5)
            float r6 = defpackage.ud2.a
            double r6 = (double) r6
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = r6 - r8
            double r4 = r4 / r6
            double r4 = java.lang.Math.exp(r4)
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 * r6
            long r4 = (long) r4
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r6
            long r1 = java.lang.Math.max(r1, r4)
            int r3 = r3 + 1
            goto L4b
        L7d:
            r10.B = r1
            java.lang.Object r11 = r10.L
            eb r11 = (defpackage.eb) r11
            java.lang.Object r12 = r10.Y
            ap r12 = (defpackage.ap) r12
            ap r11 = r11.F(r1, r12, r14)
            ap r11 = defpackage.nw7.R(r11)
            r10.d0 = r11
            int r11 = r11.b()
        L95:
            if (r13 >= r11) goto Lba
            java.lang.Object r12 = r10.d0
            ap r12 = (defpackage.ap) r12
            float r14 = r12.a(r13)
            java.lang.Object r0 = r10.L
            eb r0 = (defpackage.eb) r0
            r0.getClass()
            java.lang.Object r0 = r10.L
            eb r0 = (defpackage.eb) r0
            r0.getClass()
            r0 = 0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            float r14 = defpackage.gi2.p(r14, r1, r0)
            r12.e(r13, r14)
            int r13 = r13 + 1
            goto L95
        Lba:
            return
        Lbb:
            java.lang.String r10 = "velocityVector"
            defpackage.nb3.a0(r10)
            r10 = 0
            throw r10
    }

    public qa(defpackage.ra r8, byte[] r9) {
            r7 = this;
            r0 = 0
            r7.A = r0
            r7.<init>()
            r7.e0 = r8
            r1 = 0
            r7.B = r1
            p42 r3 = defpackage.p42.e
            java.lang.String r4 = "AES/CTR/NoPadding"
            java.lang.Object r3 = r3.a(r4)
            javax.crypto.Cipher r3 = (javax.crypto.Cipher) r3
            r7.X = r3
            p42 r3 = defpackage.p42.f
            java.lang.String r4 = r8.b
            java.lang.Object r3 = r3.a(r4)
            javax.crypto.Mac r3 = (javax.crypto.Mac) r3
            r7.Y = r3
            r7.B = r1
            int r1 = r8.a
            byte[] r2 = defpackage.nd5.a(r1)
            r3 = 7
            byte[] r3 = defpackage.nd5.a(r3)
            r7.Z = r3
            int r5 = r8.e()
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r5)
            r7.d0 = r5
            int r6 = r8.e()
            byte r6 = (byte) r6
            r5.put(r6)
            r5.put(r2)
            r5.put(r3)
            r5.flip()
            int r3 = r1 + 32
            java.lang.String r5 = r8.f
            byte[] r8 = r8.g
            byte[] r8 = defpackage.gi2.v(r5, r8, r2, r9, r3)
            javax.crypto.spec.SecretKeySpec r9 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r2 = "AES"
            r9.<init>(r8, r0, r1, r2)
            r7.L = r9
            javax.crypto.spec.SecretKeySpec r9 = new javax.crypto.spec.SecretKeySpec
            r0 = 32
            r9.<init>(r8, r1, r0, r4)
            r7.R = r9
            return
    }

    @Override // defpackage.lo
    public boolean a() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.lo
    public long b() {
            r2 = this;
            long r0 = r2.B
            return r0
    }

    @Override // defpackage.lo
    public defpackage.wc7 c() {
            r0 = this;
            java.lang.Object r0 = r0.R
            wc7 r0 = (defpackage.wc7) r0
            return r0
    }

    @Override // defpackage.lo
    public defpackage.ap d(long r3) {
            r2 = this;
            boolean r0 = r2.e(r3)
            if (r0 != 0) goto L17
            java.lang.Object r0 = r2.L
            eb r0 = (defpackage.eb) r0
            java.lang.Object r1 = r2.Y
            ap r1 = (defpackage.ap) r1
            java.lang.Object r2 = r2.Z
            ap r2 = (defpackage.ap) r2
            ap r2 = r0.F(r3, r1, r2)
            return r2
        L17:
            java.lang.Object r2 = r2.d0
            ap r2 = (defpackage.ap) r2
            return r2
    }

    @Override // defpackage.nr6
    public synchronized void f(java.nio.ByteBuffer r9, java.nio.ByteBuffer r10, java.nio.ByteBuffer r11) {
            r8 = this;
            monitor-enter(r8)
            int r0 = r11.position()     // Catch: java.lang.Throwable -> L70
            java.lang.Object r1 = r8.e0     // Catch: java.lang.Throwable -> L70
            ra r1 = (defpackage.ra) r1     // Catch: java.lang.Throwable -> L70
            java.lang.Object r2 = r8.Z     // Catch: java.lang.Throwable -> L70
            byte[] r2 = (byte[]) r2     // Catch: java.lang.Throwable -> L70
            long r3 = r8.B     // Catch: java.lang.Throwable -> L70
            r5 = 0
            byte[] r1 = defpackage.ra.i(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r2 = r8.X     // Catch: java.lang.Throwable -> L70
            javax.crypto.Cipher r2 = (javax.crypto.Cipher) r2     // Catch: java.lang.Throwable -> L70
            java.lang.Object r3 = r8.L     // Catch: java.lang.Throwable -> L70
            javax.crypto.spec.SecretKeySpec r3 = (javax.crypto.spec.SecretKeySpec) r3     // Catch: java.lang.Throwable -> L70
            javax.crypto.spec.IvParameterSpec r4 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L70
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L70
            r6 = 1
            r2.init(r6, r3, r4)     // Catch: java.lang.Throwable -> L70
            long r2 = r8.B     // Catch: java.lang.Throwable -> L70
            r6 = 1
            long r2 = r2 + r6
            r8.B = r2     // Catch: java.lang.Throwable -> L70
            java.lang.Object r2 = r8.X     // Catch: java.lang.Throwable -> L70
            javax.crypto.Cipher r2 = (javax.crypto.Cipher) r2     // Catch: java.lang.Throwable -> L70
            r2.update(r9, r11)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r9 = r8.X     // Catch: java.lang.Throwable -> L70
            javax.crypto.Cipher r9 = (javax.crypto.Cipher) r9     // Catch: java.lang.Throwable -> L70
            r9.doFinal(r10, r11)     // Catch: java.lang.Throwable -> L70
            java.nio.ByteBuffer r9 = r11.duplicate()     // Catch: java.lang.Throwable -> L70
            r9.flip()     // Catch: java.lang.Throwable -> L70
            r9.position(r0)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r10 = r8.Y     // Catch: java.lang.Throwable -> L70
            javax.crypto.Mac r10 = (javax.crypto.Mac) r10     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r8.R     // Catch: java.lang.Throwable -> L70
            javax.crypto.spec.SecretKeySpec r0 = (javax.crypto.spec.SecretKeySpec) r0     // Catch: java.lang.Throwable -> L70
            r10.init(r0)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r10 = r8.Y     // Catch: java.lang.Throwable -> L70
            javax.crypto.Mac r10 = (javax.crypto.Mac) r10     // Catch: java.lang.Throwable -> L70
            r10.update(r1)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r10 = r8.Y     // Catch: java.lang.Throwable -> L70
            javax.crypto.Mac r10 = (javax.crypto.Mac) r10     // Catch: java.lang.Throwable -> L70
            r10.update(r9)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r9 = r8.Y     // Catch: java.lang.Throwable -> L70
            javax.crypto.Mac r9 = (javax.crypto.Mac) r9     // Catch: java.lang.Throwable -> L70
            byte[] r9 = r9.doFinal()     // Catch: java.lang.Throwable -> L70
            java.lang.Object r10 = r8.e0     // Catch: java.lang.Throwable -> L70
            ra r10 = (defpackage.ra) r10     // Catch: java.lang.Throwable -> L70
            int r10 = r10.c     // Catch: java.lang.Throwable -> L70
            r11.put(r9, r5, r10)     // Catch: java.lang.Throwable -> L70
            monitor-exit(r8)
            return
        L70:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L70
            throw r9
    }

    @Override // defpackage.lo
    public java.lang.Object g(long r19) {
            r18 = this;
            r0 = r18
            boolean r1 = r18.e(r19)
            if (r1 != 0) goto L8d
            java.lang.Object r1 = r0.R
            wc7 r1 = (defpackage.wc7) r1
            qn2 r1 = r1.b
            java.lang.Object r2 = r0.L
            eb r2 = (defpackage.eb) r2
            java.lang.Object r3 = r0.Y
            ap r3 = (defpackage.ap) r3
            java.lang.Object r0 = r0.Z
            ap r0 = (defpackage.ap) r0
            java.lang.Object r4 = r2.L
            ap r4 = (defpackage.ap) r4
            if (r4 != 0) goto L26
            ap r4 = r3.c()
            r2.L = r4
        L26:
            java.lang.Object r4 = r2.L
            ap r4 = (defpackage.ap) r4
            r5 = 0
            java.lang.String r6 = "valueVector"
            if (r4 == 0) goto L89
            int r4 = r4.b()
            r7 = 0
        L34:
            java.lang.Object r8 = r2.L
            ap r8 = (defpackage.ap) r8
            if (r7 >= r4) goto L7e
            if (r8 == 0) goto L7a
            java.lang.Object r9 = r2.B
            s35 r9 = (defpackage.s35) r9
            float r10 = r3.a(r7)
            float r11 = r0.a(r7)
            r12 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r19 / r12
            java.lang.Object r9 = r9.A
            gv r9 = (defpackage.gv) r9
            td2 r9 = r9.a(r11)
            long r14 = r9.c
            r16 = 0
            int r11 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r11 <= 0) goto L61
            float r11 = (float) r12
            float r12 = (float) r14
            float r11 = r11 / r12
            goto L63
        L61:
            r11 = 1065353216(0x3f800000, float:1.0)
        L63:
            float r12 = r9.b
            float r9 = r9.a
            float r9 = java.lang.Math.signum(r9)
            float r9 = r9 * r12
            ph r11 = defpackage.qh.a(r11)
            float r11 = r11.a
            float r9 = r9 * r11
            float r9 = r9 + r10
            r8.e(r7, r9)
            int r7 = r7 + 1
            goto L34
        L7a:
            defpackage.nb3.a0(r6)
            throw r5
        L7e:
            if (r8 == 0) goto L85
            java.lang.Object r0 = r1.g(r8)
            return r0
        L85:
            defpackage.nb3.a0(r6)
            throw r5
        L89:
            defpackage.nb3.a0(r6)
            throw r5
        L8d:
            java.lang.Object r0 = r0.e0
            return r0
    }

    @Override // defpackage.lo
    public java.lang.Object h() {
            r0 = this;
            java.lang.Object r0 = r0.e0
            return r0
    }

    @Override // defpackage.nr6
    public java.nio.ByteBuffer i() {
            r0 = this;
            java.lang.Object r0 = r0.d0
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            return r0
    }

    @Override // defpackage.nr6
    public synchronized void j(java.nio.ByteBuffer r7, java.nio.ByteBuffer r8) {
            r6 = this;
            monitor-enter(r6)
            int r0 = r8.position()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = r6.e0     // Catch: java.lang.Throwable -> L69
            ra r1 = (defpackage.ra) r1     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = r6.Z     // Catch: java.lang.Throwable -> L69
            byte[] r2 = (byte[]) r2     // Catch: java.lang.Throwable -> L69
            long r3 = r6.B     // Catch: java.lang.Throwable -> L69
            r5 = 1
            byte[] r1 = defpackage.ra.i(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = r6.X     // Catch: java.lang.Throwable -> L69
            javax.crypto.Cipher r2 = (javax.crypto.Cipher) r2     // Catch: java.lang.Throwable -> L69
            java.lang.Object r3 = r6.L     // Catch: java.lang.Throwable -> L69
            javax.crypto.spec.SecretKeySpec r3 = (javax.crypto.spec.SecretKeySpec) r3     // Catch: java.lang.Throwable -> L69
            javax.crypto.spec.IvParameterSpec r4 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L69
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L69
            r2.init(r5, r3, r4)     // Catch: java.lang.Throwable -> L69
            long r2 = r6.B     // Catch: java.lang.Throwable -> L69
            r4 = 1
            long r2 = r2 + r4
            r6.B = r2     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = r6.X     // Catch: java.lang.Throwable -> L69
            javax.crypto.Cipher r2 = (javax.crypto.Cipher) r2     // Catch: java.lang.Throwable -> L69
            r2.doFinal(r7, r8)     // Catch: java.lang.Throwable -> L69
            java.nio.ByteBuffer r7 = r8.duplicate()     // Catch: java.lang.Throwable -> L69
            r7.flip()     // Catch: java.lang.Throwable -> L69
            r7.position(r0)     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r6.Y     // Catch: java.lang.Throwable -> L69
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = r6.R     // Catch: java.lang.Throwable -> L69
            javax.crypto.spec.SecretKeySpec r2 = (javax.crypto.spec.SecretKeySpec) r2     // Catch: java.lang.Throwable -> L69
            r0.init(r2)     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r6.Y     // Catch: java.lang.Throwable -> L69
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0     // Catch: java.lang.Throwable -> L69
            r0.update(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r6.Y     // Catch: java.lang.Throwable -> L69
            javax.crypto.Mac r0 = (javax.crypto.Mac) r0     // Catch: java.lang.Throwable -> L69
            r0.update(r7)     // Catch: java.lang.Throwable -> L69
            java.lang.Object r7 = r6.Y     // Catch: java.lang.Throwable -> L69
            javax.crypto.Mac r7 = (javax.crypto.Mac) r7     // Catch: java.lang.Throwable -> L69
            byte[] r7 = r7.doFinal()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r6.e0     // Catch: java.lang.Throwable -> L69
            ra r0 = (defpackage.ra) r0     // Catch: java.lang.Throwable -> L69
            int r0 = r0.c     // Catch: java.lang.Throwable -> L69
            r1 = 0
            r8.put(r7, r1, r0)     // Catch: java.lang.Throwable -> L69
            monitor-exit(r6)
            return
        L69:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L69
            throw r7
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.A
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r3 = super.toString()
            return r3
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Archive with packed streams starting at offset "
            r0.<init>(r1)
            long r1 = r3.B
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.Object r1 = r3.L
            long[] r1 = (long[]) r1
            int r1 = r1.length
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r0.append(r1)
            java.lang.String r1 = " pack sizes, "
            r0.append(r1)
            java.lang.Object r1 = r3.X
            long[] r1 = (long[]) r1
            java.lang.String r2 = "(null)"
            if (r1 != 0) goto L36
            r1 = r2
            goto L3b
        L36:
            int r1 = r1.length
            java.lang.String r1 = java.lang.Integer.toString(r1)
        L3b:
            r0.append(r1)
            java.lang.String r1 = " CRCs, "
            r0.append(r1)
            java.lang.Object r1 = r3.Y
            fi2[] r1 = (defpackage.fi2[]) r1
            int r1 = r1.length
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r0.append(r1)
            java.lang.String r1 = " folders, "
            r0.append(r1)
            java.lang.Object r1 = r3.d0
            md6[] r1 = (defpackage.md6[]) r1
            if (r1 != 0) goto L5b
            goto L60
        L5b:
            int r1 = r1.length
            java.lang.String r2 = java.lang.Integer.toString(r1)
        L60:
            r0.append(r2)
            java.lang.String r1 = " files and "
            r0.append(r1)
            java.lang.Object r3 = r3.e0
            eb r3 = (defpackage.eb) r3
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
