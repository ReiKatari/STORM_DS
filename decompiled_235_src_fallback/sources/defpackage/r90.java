package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r90  reason: default package */
/* loaded from: classes.dex */
public final class r90 implements defpackage.nt, defpackage.mk4, defpackage.kl7 {
    public int A;
    public int B;
    public final java.lang.Object L;

    public r90() {
            r1 = this;
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            r90[] r0 = new defpackage.r90[r0]
            r1.L = r0
            r0 = 0
            r1.A = r0
            r1.B = r0
            return
    }

    public r90(int r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.L = r0
            r1.A = r2
            r2 = r3 & 7
            if (r2 != 0) goto Le
            r2 = 8
        Le:
            r1.B = r2
            return
    }

    public r90(int r3, int r4, defpackage.hr1 r5) {
            r2 = this;
            r2.<init>()
            r2.A = r3
            r2.B = r4
            eb r0 = new eb
            ee2 r1 = new ee2
            r1.<init>(r3, r4, r5)
            r0.<init>(r1)
            r2.L = r0
            return
    }

    public r90(int r1, int r2, defpackage.on2 r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            return
    }

    public r90(android.view.View r1) {
            r0 = this;
            r0.<init>()
            r0.L = r1
            return
    }

    public r90(defpackage.mk4 r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.L = r1
            r0.A = r2
            r0.B = r3
            return
    }

    public r90(defpackage.nt r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.L = r1
            r0.A = r2
            return
    }

    public r90(byte[] r1, int r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.L = r1
            r0.A = r2
            return
    }

    @Override // defpackage.nt
    public void c(int r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Object r0 = r2.L
            nt r0 = (defpackage.nt) r0
            int r1 = r2.B
            if (r1 != 0) goto Lb
            int r2 = r2.A
            goto Lc
        Lb:
            r2 = 0
        Lc:
            int r3 = r3 + r2
            r0.c(r3, r4)
            return
    }

    @Override // defpackage.nt
    public void d(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.B
            int r0 = r0 + 1
            r1.B = r0
            java.lang.Object r1 = r1.L
            nt r1 = (defpackage.nt) r1
            r1.d(r2)
            return
    }

    @Override // defpackage.nt
    public void e() {
            r0 = this;
            java.lang.Object r0 = r0.L
            nt r0 = (defpackage.nt) r0
            r0.e()
            return
    }

    @Override // defpackage.nt
    public void f(int r2, int r3, int r4) {
            r1 = this;
            int r0 = r1.B
            if (r0 != 0) goto L7
            int r0 = r1.A
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.Object r1 = r1.L
            nt r1 = (defpackage.nt) r1
            int r2 = r2 + r0
            int r3 = r3 + r0
            r1.f(r2, r3, r4)
            return
    }

    @Override // defpackage.nt
    public void g(int r3, int r4) {
            r2 = this;
            java.lang.Object r0 = r2.L
            nt r0 = (defpackage.nt) r0
            int r1 = r2.B
            if (r1 != 0) goto Lb
            int r2 = r2.A
            goto Lc
        Lb:
            r2 = 0
        Lc:
            int r3 = r3 + r2
            r0.g(r3, r4)
            return
    }

    @Override // defpackage.il7
    public defpackage.ap h(long r7, defpackage.ap r9, defpackage.ap r10, defpackage.ap r11) {
            r6 = this;
            java.lang.Object r6 = r6.L
            r0 = r6
            eb r0 = (defpackage.eb) r0
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            ap r6 = r0.h(r1, r3, r4, r5)
            return r6
    }

    @Override // defpackage.mk4
    public int i(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.L
            mk4 r0 = (defpackage.mk4) r0
            int r0 = r0.i(r3)
            if (r3 < 0) goto L13
            int r1 = r2.B
            if (r3 > r1) goto L13
            int r2 = r2.A
            defpackage.jk7.c(r0, r2, r3)
        L13:
            return r0
    }

    @Override // defpackage.nt
    public void j() {
            r1 = this;
            int r0 = r1.B
            if (r0 <= 0) goto L5
            goto La
        L5:
            java.lang.String r0 = "OffsetApplier up called with no corresponding down"
            defpackage.tx0.a(r0)
        La:
            int r0 = r1.B
            int r0 = r0 + (-1)
            r1.B = r0
            java.lang.Object r1 = r1.L
            nt r1 = (defpackage.nt) r1
            r1.j()
            return
    }

    @Override // defpackage.nt
    public void k(int r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Object r0 = r2.L
            nt r0 = (defpackage.nt) r0
            int r1 = r2.B
            if (r1 != 0) goto Lb
            int r2 = r2.A
            goto Lc
        Lb:
            r2 = 0
        Lc:
            int r3 = r3 + r2
            r0.k(r3, r4)
            return
    }

    @Override // defpackage.nt
    public java.lang.Object m() {
            r0 = this;
            java.lang.Object r0 = r0.L
            nt r0 = (defpackage.nt) r0
            java.lang.Object r0 = r0.m()
            return r0
    }

    @Override // defpackage.nt
    public void n(defpackage.eo2 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r0 = r0.L
            nt r0 = (defpackage.nt) r0
            r0.n(r1, r2)
            return
    }

    @Override // defpackage.kl7
    public int o() {
            r0 = this;
            int r0 = r0.B
            return r0
    }

    @Override // defpackage.kl7
    public int p() {
            r0 = this;
            int r0 = r0.A
            return r0
    }

    @Override // defpackage.il7
    public defpackage.ap q(long r7, defpackage.ap r9, defpackage.ap r10, defpackage.ap r11) {
            r6 = this;
            java.lang.Object r6 = r6.L
            r0 = r6
            eb r0 = (defpackage.eb) r0
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            ap r6 = r0.q(r1, r3, r4, r5)
            return r6
    }

    @Override // defpackage.mk4
    public int s(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.L
            mk4 r0 = (defpackage.mk4) r0
            int r0 = r0.s(r3)
            if (r3 < 0) goto L13
            int r1 = r2.A
            if (r3 > r1) goto L13
            int r2 = r2.B
            defpackage.jk7.b(r0, r2, r3)
        L13:
            return r0
    }

    public void t(int r4) {
            r3 = this;
            int r0 = r3.A
            int r1 = r3.B
            int r1 = r0 - r1
            if (r4 > r1) goto L9
            return
        L9:
            fc6 r1 = new fc6
            int r3 = r3.B
            int r0 = r0 - r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected EOF, available "
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = " bytes, requested: "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3)
            throw r1
    }

    public int u() {
            r3 = this;
            int r0 = r3.B
            int r1 = r3.A
            if (r0 >= r1) goto L13
            java.lang.Object r1 = r3.L
            byte[] r1 = (byte[]) r1
            int r2 = r0 + 1
            r3.B = r2
            r3 = r1[r0]
            r3 = r3 & 255(0xff, float:3.57E-43)
            return r3
        L13:
            r3 = -1
            return r3
    }

    public long v(boolean r9) {
            r8 = this;
            int r0 = r8.B
            int r1 = r8.A
            if (r0 != r1) goto L13
            if (r9 == 0) goto Lb
            r8 = -1
            return r8
        Lb:
            fc6 r8 = new fc6
            java.lang.String r9 = "Unexpected EOF"
            r8.<init>(r9)
            throw r8
        L13:
            java.lang.Object r9 = r8.L
            byte[] r9 = (byte[]) r9
            int r2 = r0 + 1
            r3 = r9[r0]
            long r3 = (long) r3
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L25
            r8.B = r2
            return r3
        L25:
            int r1 = r1 - r0
            r7 = 1
            if (r1 <= r7) goto L3b
            int r0 = r0 + 2
            r9 = r9[r2]
            long r1 = (long) r9
            r9 = 7
            long r1 = r1 << r9
            long r1 = r1 ^ r3
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 >= 0) goto L3b
            r8.B = r0
            r8 = -128(0xffffffffffffff80, double:NaN)
            long r8 = r8 ^ r1
            return r8
        L3b:
            r9 = 0
        L3c:
            r0 = 64
            if (r9 >= r0) goto L51
            int r0 = r8.u()
            r1 = r0 & 127(0x7f, float:1.78E-43)
            long r1 = (long) r1
            long r1 = r1 << r9
            long r5 = r5 | r1
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 != 0) goto L4e
            return r5
        L4e:
            int r9 = r9 + 7
            goto L3c
        L51:
            fc6 r8 = new fc6
            java.lang.String r9 = "Input stream is malformed: Varint too long (exceeded 64 bits)"
            r8.<init>(r9)
            throw r8
    }
}
