package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: en6  reason: default package */
/* loaded from: classes.dex */
public final class en6 implements java.lang.Comparable {
    public boolean A;
    public int B;
    public int L;
    public int R;
    public float X;
    public boolean Y;
    public final float[] Z;
    public final float[] d0;
    public defpackage.dn6 e0;
    public defpackage.yu[] f0;
    public int g0;
    public int h0;

    public en6(defpackage.dn6 r4) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.B = r0
            r3.L = r0
            r0 = 0
            r3.R = r0
            r3.Y = r0
            r1 = 9
            float[] r2 = new float[r1]
            r3.Z = r2
            float[] r1 = new float[r1]
            r3.d0 = r1
            r1 = 16
            yu[] r1 = new defpackage.yu[r1]
            r3.f0 = r1
            r3.g0 = r0
            r3.h0 = r0
            r3.e0 = r4
            return
    }

    public final void a(defpackage.yu r4) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.g0
            yu[] r2 = r3.f0
            if (r0 >= r1) goto Lf
            r1 = r2[r0]
            if (r1 != r4) goto Lc
            return
        Lc:
            int r0 = r0 + 1
            goto L1
        Lf:
            int r0 = r2.length
            if (r1 < r0) goto L1d
            int r0 = r2.length
            int r0 = r0 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            yu[] r0 = (defpackage.yu[]) r0
            r3.f0 = r0
        L1d:
            yu[] r0 = r3.f0
            int r1 = r3.g0
            r0[r1] = r4
            int r1 = r1 + 1
            r3.g0 = r1
            return
    }

    public final void b(defpackage.yu r5) {
            r4 = this;
            int r0 = r4.g0
            r1 = 0
        L3:
            if (r1 >= r0) goto L23
            yu[] r2 = r4.f0
            r2 = r2[r1]
            if (r2 != r5) goto L20
        Lb:
            int r5 = r0 + (-1)
            if (r1 >= r5) goto L19
            yu[] r5 = r4.f0
            int r2 = r1 + 1
            r3 = r5[r2]
            r5[r1] = r3
            r1 = r2
            goto Lb
        L19:
            int r5 = r4.g0
            int r5 = r5 + (-1)
            r4.g0 = r5
            return
        L20:
            int r1 = r1 + 1
            goto L3
        L23:
            return
    }

    public final void c() {
            r6 = this;
            dn6 r0 = defpackage.dn6.UNKNOWN
            r6.e0 = r0
            r0 = 0
            r6.R = r0
            r1 = -1
            r6.B = r1
            r6.L = r1
            r1 = 0
            r6.X = r1
            r6.Y = r0
            int r2 = r6.g0
            r3 = r0
        L14:
            if (r3 >= r2) goto L1e
            yu[] r4 = r6.f0
            r5 = 0
            r4[r3] = r5
            int r3 = r3 + 1
            goto L14
        L1e:
            r6.g0 = r0
            r6.h0 = r0
            r6.A = r0
            float[] r6 = r6.d0
            java.util.Arrays.fill(r6, r1)
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r1) {
            r0 = this;
            en6 r1 = (defpackage.en6) r1
            int r0 = r0.B
            int r1 = r1.B
            int r0 = r0 - r1
            return r0
    }

    public final void d(defpackage.jv3 r4, float r5) {
            r3 = this;
            r3.X = r5
            r5 = 1
            r3.Y = r5
            int r5 = r3.g0
            r0 = -1
            r3.L = r0
            r0 = 0
            r1 = r0
        Lc:
            if (r1 >= r5) goto L18
            yu[] r2 = r3.f0
            r2 = r2[r1]
            r2.h(r4, r3, r0)
            int r1 = r1 + 1
            goto Lc
        L18:
            r3.g0 = r0
            return
    }

    public final void e(defpackage.jv3 r5, defpackage.yu r6) {
            r4 = this;
            int r0 = r4.g0
            r1 = 0
            r2 = r1
        L4:
            if (r2 >= r0) goto L10
            yu[] r3 = r4.f0
            r3 = r3[r2]
            r3.i(r5, r6, r1)
            int r2 = r2 + 1
            goto L4
        L10:
            r4.g0 = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            int r2 = r2.B
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
