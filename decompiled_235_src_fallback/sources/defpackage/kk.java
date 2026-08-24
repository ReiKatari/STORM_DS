package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kk  reason: default package */
/* loaded from: classes.dex */
public final class kk implements defpackage.g36 {
    public final /* synthetic */ int A;
    public long B;
    public java.lang.Object L;

    public kk() {
            r2 = this;
            r0 = 1
            r2.A = r0
            r2.<init>()
            r0 = 0
            r2.B = r0
            return
    }

    public kk(long r2, defpackage.lo4 r4) {
            r1 = this;
            r0 = 4
            r1.A = r0
            r1.<init>()
            r1.L = r4
            r1.B = r2
            return
    }

    public kk(defpackage.fe5 r3) {
            r2 = this;
            r0 = 2
            r2.A = r0
            r3.getClass()
            r2.<init>()
            r2.L = r3
            r0 = 262144(0x40000, double:1.295163E-318)
            r2.B = r0
            return
    }

    public /* synthetic */ kk(java.lang.Object r1, long r2, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r2
            r0.L = r1
            r0.<init>()
            return
    }

    public /* synthetic */ kk(defpackage.lo4 r3) {
            r2 = this;
            r0 = 4
            r2.A = r0
            r0 = 0
            r2.<init>(r0, r3)
            return
    }

    public void a(int r5) {
            r4 = this;
            r0 = 64
            if (r5 < r0) goto Lf
            java.lang.Object r4 = r4.L
            kk r4 = (defpackage.kk) r4
            if (r4 == 0) goto Le
            int r5 = r5 - r0
            r4.a(r5)
        Le:
            return
        Lf:
            long r0 = r4.B
            r2 = 1
            long r2 = r2 << r5
            long r2 = ~r2
            long r0 = r0 & r2
            r4.B = r0
            return
    }

    @Override // defpackage.g36
    public java.lang.Object apply(java.lang.Object r7) {
            r6 = this;
            long r0 = r6.B
            java.lang.Object r6 = r6.L
            fz r6 = (defpackage.fz) r6
            android.database.sqlite.SQLiteDatabase r7 = (android.database.sqlite.SQLiteDatabase) r7
            c42 r2 = defpackage.i36.X
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>()
            java.lang.String r3 = "next_request_ms"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r3, r0)
            java.lang.String r0 = r6.a
            b35 r6 = r6.c
            int r1 = defpackage.d35.a(r6)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String[] r1 = new java.lang.String[]{r0, r1}
            java.lang.String r3 = "transport_contexts"
            java.lang.String r4 = "backend_name = ? and priority = ?"
            int r1 = r7.update(r3, r2, r4, r1)
            r4 = 1
            r5 = 0
            if (r1 >= r4) goto L49
            java.lang.String r1 = "backend_name"
            r2.put(r1, r0)
            int r6 = defpackage.d35.a(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r0 = "priority"
            r2.put(r0, r6)
            r7.insert(r3, r5, r2)
        L49:
            return r5
    }

    public int b(int r7) {
            r6 = this;
            java.lang.Object r0 = r6.L
            kk r0 = (defpackage.kk) r0
            r1 = 64
            r2 = 1
            if (r0 != 0) goto L1c
            long r4 = r6.B
            if (r7 < r1) goto L13
            int r6 = java.lang.Long.bitCount(r4)
            return r6
        L13:
            long r6 = r2 << r7
            long r6 = r6 - r2
            long r6 = r6 & r4
            int r6 = java.lang.Long.bitCount(r6)
            return r6
        L1c:
            if (r7 >= r1) goto L29
            long r0 = r6.B
            long r6 = r2 << r7
            long r6 = r6 - r2
            long r6 = r6 & r0
            int r6 = java.lang.Long.bitCount(r6)
            return r6
        L29:
            int r7 = r7 - r1
            int r7 = r0.b(r7)
            long r0 = r6.B
            int r6 = java.lang.Long.bitCount(r0)
            int r6 = r6 + r7
            return r6
    }

    public void c() {
            r1 = this;
            java.lang.Object r0 = r1.L
            kk r0 = (defpackage.kk) r0
            if (r0 != 0) goto Ld
            kk r0 = new kk
            r0.<init>()
            r1.L = r0
        Ld:
            return
    }

    public boolean d(int r5) {
            r4 = this;
            r0 = 64
            if (r5 < r0) goto L11
            r4.c()
            java.lang.Object r4 = r4.L
            kk r4 = (defpackage.kk) r4
            int r5 = r5 - r0
            boolean r4 = r4.d(r5)
            return r4
        L11:
            long r0 = r4.B
            r2 = 1
            long r4 = r2 << r5
            long r4 = r4 & r0
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 == 0) goto L20
            r4 = 1
            return r4
        L20:
            r4 = 0
            return r4
    }

    public long e(float r5, long r6, boolean r8) {
            r4 = this;
            long r0 = r4.B
            if (r8 == 0) goto Lb
            long r6 = defpackage.jk4.f(r0, r6)
            r4.B = r6
            goto Lf
        Lb:
            long r6 = defpackage.jk4.f(r0, r6)
        Lf:
            java.lang.Object r8 = r4.L
            lo4 r8 = (defpackage.lo4) r8
            if (r8 != 0) goto L1a
            float r6 = defpackage.jk4.d(r6)
            goto L22
        L1a:
            float r6 = r4.g(r6)
            float r6 = java.lang.Math.abs(r6)
        L22:
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 < 0) goto L8d
            java.lang.Object r6 = r4.L
            lo4 r6 = (defpackage.lo4) r6
            long r7 = r4.B
            if (r6 != 0) goto L41
            float r6 = defpackage.jk4.d(r7)
            long r6 = defpackage.jk4.b(r6, r7)
            long r5 = defpackage.jk4.g(r5, r6)
            long r7 = r4.B
            long r4 = defpackage.jk4.e(r7, r5)
            return r4
        L41:
            float r6 = r4.g(r7)
            long r7 = r4.B
            float r7 = r4.g(r7)
            float r7 = java.lang.Math.signum(r7)
            float r7 = r7 * r5
            float r6 = r6 - r7
            long r7 = r4.B
            java.lang.Object r5 = r4.L
            lo4 r5 = (defpackage.lo4) r5
            lo4 r0 = defpackage.lo4.Horizontal
            r1 = 32
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r5 != r0) goto L69
            long r7 = r7 & r2
        L63:
            int r5 = (int) r7
            float r5 = java.lang.Float.intBitsToFloat(r5)
            goto L6b
        L69:
            long r7 = r7 >> r1
            goto L63
        L6b:
            java.lang.Object r4 = r4.L
            lo4 r4 = (defpackage.lo4) r4
            if (r4 != r0) goto L7f
            int r4 = java.lang.Float.floatToRawIntBits(r6)
            long r6 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            long r6 = r6 << r1
            long r4 = r4 & r2
            long r4 = r4 | r6
            return r4
        L7f:
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r6 = (long) r6
            long r4 = r4 << r1
            long r6 = r6 & r2
            long r4 = r4 | r6
            return r4
        L8d:
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            return r4
    }

    public void f(int r10, boolean r11) {
            r9 = this;
            r0 = 64
            if (r10 < r0) goto L10
            r9.c()
            java.lang.Object r9 = r9.L
            kk r9 = (defpackage.kk) r9
            int r10 = r10 - r0
            r9.f(r10, r11)
            return
        L10:
            long r0 = r9.B
            r2 = -9223372036854775808
            long r2 = r2 & r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1f
            r2 = r4
            goto L20
        L1f:
            r2 = r3
        L20:
            r5 = 1
            long r7 = r5 << r10
            long r7 = r7 - r5
            long r5 = r0 & r7
            long r7 = ~r7
            long r0 = r0 & r7
            long r0 = r0 << r4
            long r0 = r0 | r5
            r9.B = r0
            if (r11 == 0) goto L33
            r9.j(r10)
            goto L36
        L33:
            r9.a(r10)
        L36:
            if (r2 != 0) goto L40
            java.lang.Object r10 = r9.L
            kk r10 = (defpackage.kk) r10
            if (r10 == 0) goto L3f
            goto L40
        L3f:
            return
        L40:
            r9.c()
            java.lang.Object r9 = r9.L
            kk r9 = (defpackage.kk) r9
            r9.f(r3, r2)
            return
    }

    public float g(long r3) {
            r2 = this;
            java.lang.Object r2 = r2.L
            lo4 r2 = (defpackage.lo4) r2
            lo4 r0 = defpackage.lo4.Horizontal
            if (r2 != r0) goto L12
            r2 = 32
            long r2 = r3 >> r2
        Lc:
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            return r2
        L12:
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r3 & r0
            goto Lc
    }

    public boolean h(int r11) {
            r10 = this;
            r0 = 64
            if (r11 < r0) goto L11
            r10.c()
            java.lang.Object r10 = r10.L
            kk r10 = (defpackage.kk) r10
            int r11 = r11 - r0
            boolean r10 = r10.h(r11)
            return r10
        L11:
            r0 = 1
            long r2 = r0 << r11
            long r4 = r10.B
            long r6 = r4 & r2
            r8 = 0
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r6 = 1
            r7 = 0
            if (r11 == 0) goto L23
            r11 = r6
            goto L24
        L23:
            r11 = r7
        L24:
            long r8 = ~r2
            long r4 = r4 & r8
            r10.B = r4
            long r2 = r2 - r0
            long r0 = r4 & r2
            long r2 = ~r2
            long r2 = r2 & r4
            long r2 = java.lang.Long.rotateRight(r2, r6)
            long r0 = r0 | r2
            r10.B = r0
            java.lang.Object r0 = r10.L
            kk r0 = (defpackage.kk) r0
            if (r0 == 0) goto L4c
            boolean r0 = r0.d(r7)
            if (r0 == 0) goto L45
            r0 = 63
            r10.j(r0)
        L45:
            java.lang.Object r10 = r10.L
            kk r10 = (defpackage.kk) r10
            r10.h(r7)
        L4c:
            return r11
    }

    public void i() {
            r2 = this;
            r0 = 0
            r2.B = r0
            java.lang.Object r2 = r2.L
            kk r2 = (defpackage.kk) r2
            if (r2 == 0) goto Ld
            r2.i()
        Ld:
            return
    }

    public void j(int r5) {
            r4 = this;
            r0 = 64
            if (r5 < r0) goto L10
            r4.c()
            java.lang.Object r4 = r4.L
            kk r4 = (defpackage.kk) r4
            int r5 = r5 - r0
            r4.j(r5)
            return
        L10:
            long r0 = r4.B
            r2 = 1
            long r2 = r2 << r5
            long r0 = r0 | r2
            r4.B = r0
            return
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
            java.lang.Object r0 = r3.L
            kk r0 = (defpackage.kk) r0
            if (r0 != 0) goto L17
            long r0 = r3.B
            java.lang.String r3 = java.lang.Long.toBinaryString(r0)
            goto L39
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r3.L
            kk r1 = (defpackage.kk) r1
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "xx"
            r0.append(r1)
            long r1 = r3.B
            java.lang.String r3 = java.lang.Long.toBinaryString(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L39:
            return r3
    }
}
