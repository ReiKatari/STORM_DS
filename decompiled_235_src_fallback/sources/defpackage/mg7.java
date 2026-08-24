package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mg7  reason: default package */
/* loaded from: classes.dex */
public final class mg7 {
    public static final defpackage.mg7 f = null;
    public int a;
    public int[] b;
    public java.lang.Object[] c;
    public int d;
    public boolean e;

    static {
            mg7 r0 = new mg7
            r1 = 0
            int[] r2 = new int[r1]
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0.<init>(r1, r2, r3, r1)
            defpackage.mg7.f = r0
            return
    }

    public mg7(int r2, int[] r3, java.lang.Object[] r4, boolean r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.d = r0
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.e = r5
            return
    }

    public static defpackage.mg7 b() {
            mg7 r0 = new mg7
            r1 = 8
            int[] r2 = new int[r1]
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 1
            r4 = 0
            r0.<init>(r4, r2, r1, r3)
            return r0
    }

    public final int a() {
            r6 = this;
            int r0 = r6.d
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            r0 = 0
            r1 = r0
        L8:
            int r2 = r6.a
            if (r0 >= r2) goto L7e
            int[] r2 = r6.b
            r2 = r2[r0]
            int r3 = r2 >>> 3
            r2 = r2 & 7
            if (r2 == 0) goto L68
            r4 = 1
            if (r2 == r4) goto L5a
            r4 = 2
            if (r2 == r4) goto L4f
            r5 = 3
            if (r2 == r5) goto L3c
            r4 = 5
            if (r2 != r4) goto L32
            java.lang.Object[] r2 = r6.c
            r2 = r2[r0]
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.getClass()
            int r2 = defpackage.ms0.c(r3)
        L2f:
            int r2 = r2 + r1
            r1 = r2
            goto L7b
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            tb3 r0 = defpackage.ub3.b()
            r6.<init>(r0)
            throw r6
        L3c:
            int r2 = defpackage.ms0.h(r3)
            int r2 = r2 * r4
            java.lang.Object[] r3 = r6.c
            r3 = r3[r0]
            mg7 r3 = (defpackage.mg7) r3
            int r3 = r3.a()
        L4b:
            int r3 = r3 + r2
            int r3 = r3 + r1
            r1 = r3
            goto L7b
        L4f:
            java.lang.Object[] r2 = r6.c
            r2 = r2[r0]
            ea0 r2 = (defpackage.ea0) r2
            int r2 = defpackage.ms0.a(r3, r2)
            goto L2f
        L5a:
            java.lang.Object[] r2 = r6.c
            r2 = r2[r0]
            java.lang.Long r2 = (java.lang.Long) r2
            r2.getClass()
            int r2 = defpackage.ms0.d(r3)
            goto L2f
        L68:
            java.lang.Object[] r2 = r6.c
            r2 = r2[r0]
            java.lang.Long r2 = (java.lang.Long) r2
            long r4 = r2.longValue()
            int r2 = defpackage.ms0.h(r3)
            int r3 = defpackage.ms0.j(r4)
            goto L4b
        L7b:
            int r0 = r0 + 1
            goto L8
        L7e:
            r6.d = r1
            return r1
    }

    public final void c(int r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r3.e
            if (r0 == 0) goto L31
            int r0 = r3.a
            int[] r1 = r3.b
            int r2 = r1.length
            if (r0 != r2) goto L22
            r2 = 4
            if (r0 >= r2) goto L11
            r2 = 8
            goto L13
        L11:
            int r2 = r0 >> 1
        L13:
            int r0 = r0 + r2
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.b = r1
            java.lang.Object[] r1 = r3.c
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.c = r0
        L22:
            int[] r0 = r3.b
            int r1 = r3.a
            r0[r1] = r4
            java.lang.Object[] r4 = r3.c
            r4[r1] = r5
            int r1 = r1 + 1
            r3.a = r1
            return
        L31:
            defpackage.e41.t()
            return
    }

    public final void d(defpackage.os0 r7) {
            r6 = this;
            int r0 = r6.a
            if (r0 != 0) goto L5
            goto L6c
        L5:
            r7.getClass()
            cy7 r0 = defpackage.cy7.ASCENDING
            r0 = 0
        Lb:
            int r1 = r6.a
            if (r0 >= r1) goto L6c
            int[] r1 = r6.b
            r1 = r1[r0]
            java.lang.Object[] r2 = r6.c
            r2 = r2[r0]
            int r3 = r1 >>> 3
            r1 = r1 & 7
            if (r1 == 0) goto L60
            r4 = 1
            if (r1 == r4) goto L56
            r4 = 2
            if (r1 == r4) goto L50
            r4 = 3
            if (r1 == r4) goto L3d
            r4 = 5
            if (r1 != r4) goto L33
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            r7.l0(r3, r1)
            goto L69
        L33:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            tb3 r7 = defpackage.ub3.b()
            r6.<init>(r7)
            throw r6
        L3d:
            java.lang.Object r1 = r7.B
            ms0 r1 = (defpackage.ms0) r1
            cy7 r5 = defpackage.cy7.ASCENDING
            r1.r(r3, r4)
            mg7 r2 = (defpackage.mg7) r2
            r2.d(r7)
            r2 = 4
            r1.r(r3, r2)
            goto L69
        L50:
            ea0 r2 = (defpackage.ea0) r2
            r7.i0(r3, r2)
            goto L69
        L56:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            r7.m0(r3, r1)
            goto L69
        L60:
            java.lang.Long r2 = (java.lang.Long) r2
            long r1 = r2.longValue()
            r7.q0(r3, r1)
        L69:
            int r0 = r0 + 1
            goto Lb
        L6c:
            return
    }

    public final boolean equals(java.lang.Object r9) {
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 != 0) goto L8
            return r1
        L8:
            boolean r2 = r9 instanceof defpackage.mg7
            if (r2 != 0) goto Ld
            return r1
        Ld:
            mg7 r9 = (defpackage.mg7) r9
            int r2 = r8.a
            int r3 = r9.a
            if (r2 != r3) goto L3e
            int[] r3 = r8.b
            int[] r4 = r9.b
            r5 = r1
        L1a:
            if (r5 >= r2) goto L26
            r6 = r3[r5]
            r7 = r4[r5]
            if (r6 == r7) goto L23
            goto L3e
        L23:
            int r5 = r5 + 1
            goto L1a
        L26:
            java.lang.Object[] r2 = r8.c
            java.lang.Object[] r9 = r9.c
            int r8 = r8.a
            r3 = r1
        L2d:
            if (r3 >= r8) goto L3d
            r4 = r2[r3]
            r5 = r9[r3]
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L3a
            goto L3e
        L3a:
            int r3 = r3 + 1
            goto L2d
        L3d:
            return r0
        L3e:
            return r1
    }

    public final int hashCode() {
            r8 = this;
            int r0 = r8.a
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int[] r2 = r8.b
            r3 = 17
            r4 = 0
            r6 = r3
            r5 = r4
        Le:
            if (r5 >= r0) goto L18
            int r6 = r6 * 31
            r7 = r2[r5]
            int r6 = r6 + r7
            int r5 = r5 + 1
            goto Le
        L18:
            int r1 = r1 + r6
            int r1 = r1 * 31
            java.lang.Object[] r0 = r8.c
            int r8 = r8.a
        L1f:
            if (r4 >= r8) goto L2d
            int r3 = r3 * 31
            r2 = r0[r4]
            int r2 = r2.hashCode()
            int r3 = r3 + r2
            int r4 = r4 + 1
            goto L1f
        L2d:
            int r1 = r1 + r3
            return r1
    }
}
