package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j93  reason: default package */
/* loaded from: classes.dex */
public class j93 implements java.lang.Iterable, defpackage.zf3 {
    public final int A;
    public final int B;
    public final int L;

    public j93(int r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            if (r4 == 0) goto L1b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L14
            r1.A = r2
            int r2 = defpackage.nj2.s(r2, r3, r4)
            r1.B = r2
            r1.L = r4
            return
        L14:
            java.lang.String r1 = "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."
            defpackage.i.h(r1)
            r1 = 0
            throw r1
        L1b:
            java.lang.String r1 = "Step must be non-zero."
            defpackage.i.h(r1)
            r1 = 0
            throw r1
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.j93
            if (r0 == 0) goto L29
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            j93 r0 = (defpackage.j93) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
        L13:
            j93 r3 = (defpackage.j93) r3
            int r0 = r3.A
            int r1 = r2.A
            if (r1 != r0) goto L29
            int r0 = r2.B
            int r1 = r3.B
            if (r0 != r1) goto L29
            int r2 = r2.L
            int r3 = r3.L
            if (r2 != r3) goto L29
        L27:
            r2 = 1
            return r2
        L29:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r2 = -1
            return r2
        L8:
            int r0 = r2.A
            int r0 = r0 * 31
            int r1 = r2.B
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r2.L
            int r0 = r0 + r2
            return r0
    }

    public boolean isEmpty() {
            r4 = this;
            r0 = 0
            r1 = 1
            int r2 = r4.B
            int r3 = r4.L
            int r4 = r4.A
            if (r3 <= 0) goto Le
            if (r4 <= r2) goto Ld
            return r1
        Ld:
            return r0
        Le:
            if (r4 >= r2) goto L11
            return r1
        L11:
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            k93 r0 = new k93
            int r1 = r3.B
            int r2 = r3.L
            int r3 = r3.A
            r0.<init>(r3, r1, r2)
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = " step "
            int r1 = r4.B
            int r2 = r4.L
            int r4 = r4.A
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            if (r2 <= 0) goto L25
            r3.<init>()
            r3.append(r4)
            java.lang.String r4 = ".."
            r3.append(r4)
            r3.append(r1)
            r3.append(r0)
            r3.append(r2)
        L20:
            java.lang.String r4 = r3.toString()
            return r4
        L25:
            r3.<init>()
            r3.append(r4)
            java.lang.String r4 = " downTo "
            r3.append(r4)
            r3.append(r1)
            r3.append(r0)
            int r4 = -r2
            r3.append(r4)
            goto L20
    }
}
