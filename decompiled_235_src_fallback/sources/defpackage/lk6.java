package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lk6  reason: default package */
/* loaded from: classes.dex */
public final class lk6 {
    public final defpackage.mk6 a;
    public final int[] b;
    public final int c;
    public java.lang.Object[] d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public final defpackage.r93 j;
    public int k;
    public int l;
    public int m;
    public boolean n;

    public lk6(defpackage.mk6 r3) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            int[] r0 = r3.A
            r2.b = r0
            int r0 = r3.B
            r2.c = r0
            java.lang.Object[] r1 = r3.L
            r2.d = r1
            int r3 = r3.R
            r2.e = r3
            r2.h = r0
            r3 = -1
            r2.i = r3
            r93 r3 = new r93
            r3.<init>()
            r2.j = r3
            return
    }

    public final defpackage.sq2 a(int r3) {
            r2 = this;
            mk6 r0 = r2.a
            java.util.ArrayList r0 = r0.e0
            int r2 = r2.c
            int r2 = defpackage.ok6.e(r0, r3, r2)
            if (r2 >= 0) goto L18
            sq2 r1 = new sq2
            r1.<init>(r3)
            int r2 = r2 + 1
            int r2 = -r2
            r0.add(r2, r1)
            return r1
        L18:
            java.lang.Object r2 = r0.get(r2)
            sq2 r2 = (defpackage.sq2) r2
            return r2
    }

    public final java.lang.Object b(int[] r3, int r4) {
            r2 = this;
            int r4 = r4 * 5
            int r0 = r4 + 1
            r0 = r3[r0]
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r1 = r1 & r0
            if (r1 == 0) goto L20
            java.lang.Object[] r2 = r2.d
            int r1 = r3.length
            if (r4 < r1) goto L12
            int r3 = r3.length
            goto L1d
        L12:
            int r4 = r4 + 4
            r3 = r3[r4]
            int r4 = r0 >> 29
            int r4 = java.lang.Integer.bitCount(r4)
            int r3 = r3 + r4
        L1d:
            r2 = r2[r3]
            return r2
        L20:
            vs0 r2 = defpackage.ox0.a
            return r2
    }

    public final void c() {
            r2 = this;
            r0 = 1
            r2.f = r0
            mk6 r0 = r2.a
            int r1 = r0.X
            if (r1 <= 0) goto La
            goto Lf
        La:
            java.lang.String r1 = "Unexpected reader close()"
            defpackage.tx0.a(r1)
        Lf:
            int r1 = r0.X
            int r1 = r1 + (-1)
            r0.X = r1
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.d = r0
            return
    }

    public final boolean d(int r2) {
            r1 = this;
            int r2 = r2 * 5
            r0 = 1
            int r2 = r2 + r0
            int[] r1 = r1.b
            r1 = r1[r2]
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r2
            if (r1 == 0) goto Le
            return r0
        Le:
            r1 = 0
            return r1
    }

    public final void e() {
            r4 = this;
            int r0 = r4.k
            if (r0 != 0) goto L4c
            int r0 = r4.g
            int r1 = r4.h
            if (r0 != r1) goto Lb
            goto L10
        Lb:
            java.lang.String r0 = "endGroup() not called at the end of a group"
            defpackage.tx0.a(r0)
        L10:
            int r0 = r4.i
            int r0 = r0 * 5
            int r0 = r0 + 2
            int[] r1 = r4.b
            r0 = r1[r0]
            r4.i = r0
            int r2 = r4.c
            if (r0 >= 0) goto L22
            r3 = r2
            goto L29
        L22:
            int r3 = r0 * 5
            int r3 = r3 + 3
            r3 = r1[r3]
            int r3 = r3 + r0
        L29:
            r4.h = r3
            r93 r3 = r4.j
            int r3 = r3.b()
            if (r3 >= 0) goto L39
            r0 = 0
            r4.l = r0
            r4.m = r0
            return
        L39:
            r4.l = r3
            int r2 = r2 + (-1)
            if (r0 < r2) goto L42
            int r0 = r4.e
            goto L4a
        L42:
            int r0 = r0 + 1
            int r0 = r0 * 5
            int r0 = r0 + 4
            r0 = r1[r0]
        L4a:
            r4.m = r0
        L4c:
            return
    }

    public final java.lang.Object f() {
            r2 = this;
            int r0 = r2.g
            int r1 = r2.h
            if (r0 >= r1) goto Ld
            int[] r1 = r2.b
            java.lang.Object r2 = r2.b(r1, r0)
            return r2
        Ld:
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }

    public final int g() {
            r2 = this;
            int r0 = r2.g
            int r1 = r2.h
            if (r0 >= r1) goto Ld
            int r0 = r0 * 5
            int[] r2 = r2.b
            r2 = r2[r0]
            return r2
        Ld:
            r2 = 0
            return r2
    }

    public final java.lang.Object h(int r4, int r5) {
            r3 = this;
            int[] r0 = r3.b
            int r1 = defpackage.ok6.b(r0, r4)
            int r4 = r4 + 1
            int r2 = r3.c
            if (r4 >= r2) goto L13
            int r4 = r4 * 5
            int r4 = r4 + 4
            r4 = r0[r4]
            goto L15
        L13:
            int r4 = r3.e
        L15:
            int r1 = r1 + r5
            if (r1 >= r4) goto L1d
            java.lang.Object[] r3 = r3.d
            r3 = r3[r1]
            return r3
        L1d:
            vs0 r3 = defpackage.ox0.a
            return r3
    }

    public final int i(int r1) {
            r0 = this;
            int r1 = r1 * 5
            int[] r0 = r0.b
            r0 = r0[r1]
            return r0
    }

    public final boolean j(int r2) {
            r1 = this;
            int r2 = r2 * 5
            r0 = 1
            int r2 = r2 + r0
            int[] r1 = r1.b
            r1 = r1[r2]
            r2 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 & r2
            if (r1 == 0) goto Le
            return r0
        Le:
            r1 = 0
            return r1
    }

    public final boolean k(int r2) {
            r1 = this;
            int r2 = r2 * 5
            r0 = 1
            int r2 = r2 + r0
            int[] r1 = r1.b
            r1 = r1[r2]
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r2
            if (r1 == 0) goto Le
            return r0
        Le:
            r1 = 0
            return r1
    }

    public final boolean l(int r2) {
            r1 = this;
            int r2 = r2 * 5
            r0 = 1
            int r2 = r2 + r0
            int[] r1 = r1.b
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto Le
            return r0
        Le:
            r1 = 0
            return r1
    }

    public final java.lang.Object m() {
            r3 = this;
            int r0 = r3.k
            if (r0 > 0) goto L17
            int r0 = r3.l
            int r1 = r3.m
            if (r0 < r1) goto Lb
            goto L17
        Lb:
            r1 = 1
            r3.n = r1
            java.lang.Object[] r1 = r3.d
            int r2 = r0 + 1
            r3.l = r2
            r3 = r1[r0]
            return r3
        L17:
            r0 = 0
            r3.n = r0
            vs0 r3 = defpackage.ox0.a
            return r3
    }

    public final java.lang.Object n(int r4) {
            r3 = this;
            int r4 = r4 * 5
            int r0 = r4 + 1
            int[] r1 = r3.b
            r0 = r1[r0]
            r2 = 1073741824(0x40000000, float:2.0)
            r0 = r0 & r2
            if (r0 == 0) goto L1b
            if (r0 == 0) goto L18
            java.lang.Object[] r3 = r3.d
            int r4 = r4 + 4
            r4 = r1[r4]
            r3 = r3[r4]
            return r3
        L18:
            vs0 r3 = defpackage.ox0.a
            return r3
        L1b:
            r3 = 0
            return r3
    }

    public final int o(int r1) {
            r0 = this;
            int r1 = r1 * 5
            int r1 = r1 + 1
            int[] r0 = r0.b
            r0 = r0[r1]
            r1 = 67108863(0x3ffffff, float:1.5046327E-36)
            r0 = r0 & r1
            return r0
    }

    public final java.lang.Object p(int[] r3, int r4) {
            r2 = this;
            int r4 = r4 * 5
            int r0 = r4 + 1
            r0 = r3[r0]
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L1b
            java.lang.Object[] r2 = r2.d
            int r4 = r4 + 4
            r3 = r3[r4]
            int r4 = r0 >> 30
            int r4 = java.lang.Integer.bitCount(r4)
            int r4 = r4 + r3
            r2 = r2[r4]
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public final int q(int r1) {
            r0 = this;
            int r1 = r1 * 5
            int r1 = r1 + 2
            int[] r0 = r0.b
            r0 = r0[r1]
            return r0
    }

    public final void r(int r4) {
            r3 = this;
            int r0 = r3.k
            if (r0 != 0) goto L5
            goto La
        L5:
            java.lang.String r0 = "Cannot reposition while in an empty region"
            defpackage.tx0.a(r0)
        La:
            r3.g = r4
            int[] r0 = r3.b
            int r1 = r3.c
            if (r4 >= r1) goto L19
            int r4 = r4 * 5
            int r4 = r4 + 2
            r4 = r0[r4]
            goto L1a
        L19:
            r4 = -1
        L1a:
            int r2 = r3.i
            if (r4 == r2) goto L33
            r3.i = r4
            if (r4 >= 0) goto L25
            r3.h = r1
            goto L2e
        L25:
            int r1 = r4 * 5
            int r1 = r1 + 3
            r0 = r0[r1]
            int r0 = r0 + r4
            r3.h = r0
        L2e:
            r4 = 0
            r3.l = r4
            r3.m = r4
        L33:
            return
    }

    public final int s() {
            r5 = this;
            int r0 = r5.k
            if (r0 != 0) goto L5
            goto La
        L5:
            java.lang.String r0 = "Cannot skip while in an empty region"
            defpackage.tx0.a(r0)
        La:
            int r0 = r5.g
            int r1 = r0 * 5
            int r2 = r1 + 1
            int[] r3 = r5.b
            r2 = r3[r2]
            r4 = 1073741824(0x40000000, float:2.0)
            r4 = r4 & r2
            if (r4 == 0) goto L1b
            r2 = 1
            goto L1f
        L1b:
            r4 = 67108863(0x3ffffff, float:1.5046327E-36)
            r2 = r2 & r4
        L1f:
            int r1 = r1 + 3
            r1 = r3[r1]
            int r1 = r1 + r0
            r5.g = r1
            return r2
    }

    public final void t() {
            r2 = this;
            int r0 = r2.k
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = r1
        L8:
            if (r0 != 0) goto Lf
            java.lang.String r0 = "Cannot skip the enclosing group while in an empty region"
            defpackage.tx0.a(r0)
        Lf:
            int r0 = r2.h
            r2.g = r0
            r2.l = r1
            r2.m = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SlotReader(current="
            r0.<init>(r1)
            int r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", key="
            r0.append(r1)
            int r1 = r2.g()
            r0.append(r1)
            java.lang.String r1 = ", parent="
            r0.append(r1)
            int r1 = r2.i
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            int r2 = r2.h
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }

    public final void u() {
            r6 = this;
            int r0 = r6.k
            if (r0 > 0) goto L4e
            int r0 = r6.i
            int r1 = r6.g
            int r2 = r1 * 5
            int r3 = r2 + 2
            int[] r4 = r6.b
            r3 = r4[r3]
            if (r3 != r0) goto L13
            goto L18
        L13:
            java.lang.String r0 = "Invalid slot table detected"
            defpackage.r05.a(r0)
        L18:
            int r0 = r6.l
            int r3 = r6.m
            r93 r5 = r6.j
            if (r0 != 0) goto L27
            if (r3 != 0) goto L27
            r0 = -1
            r5.c(r0)
            goto L2a
        L27:
            r5.c(r0)
        L2a:
            r6.i = r1
            int r2 = r2 + 3
            r0 = r4[r2]
            int r0 = r0 + r1
            r6.h = r0
            int r0 = r1 + 1
            r6.g = r0
            int r2 = defpackage.ok6.b(r4, r1)
            r6.l = r2
            int r2 = r6.c
            int r2 = r2 + (-1)
            if (r1 < r2) goto L46
            int r0 = r6.e
            goto L4c
        L46:
            int r0 = r0 * 5
            int r0 = r0 + 4
            r0 = r4[r0]
        L4c:
            r6.m = r0
        L4e:
            return
    }
}
