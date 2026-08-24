package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uu6  reason: default package */
/* loaded from: classes.dex */
public final class uu6 extends defpackage.wu6 {
    public int[] R;
    public long[] X;
    public double[] Y;
    public java.lang.String[] Z;
    public byte[][] d0;
    public android.database.Cursor e0;

    public uu6(defpackage.vm2 r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>(r1, r2)
            r1 = 0
            int[] r2 = new int[r1]
            r0.R = r2
            long[] r2 = new long[r1]
            r0.X = r2
            double[] r2 = new double[r1]
            r0.Y = r2
            java.lang.String[] r2 = new java.lang.String[r1]
            r0.Z = r2
            byte[][] r1 = new byte[r1]
            r0.d0 = r1
            return
    }

    public static void n(android.database.Cursor r0, int r1) {
            if (r1 < 0) goto L9
            int r0 = r0.getColumnCount()
            if (r1 >= r0) goto L9
            return
        L9:
            r0 = 25
            java.lang.String r1 = "column index out of range"
            defpackage.ii2.T(r0, r1)
            r0 = 0
            throw r0
    }

    @Override // defpackage.j36
    public final java.lang.String R(int r1) {
            r0 = this;
            r0.e()
            android.database.Cursor r0 = r0.r()
            n(r0, r1)
            java.lang.String r0 = r0.getString(r1)
            r0.getClass()
            return r0
    }

    @Override // defpackage.j36
    public final void c(int r3, long r4) {
            r2 = this;
            r2.e()
            r0 = 1
            r2.h(r0, r3)
            int[] r1 = r2.R
            r1[r3] = r0
            long[] r2 = r2.X
            r2[r3] = r4
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            boolean r0 = r1.L
            if (r0 != 0) goto La
            r1.g()
            r1.reset()
        La:
            r0 = 1
            r1.L = r0
            return
    }

    @Override // defpackage.j36
    public final void d(byte[] r3, int r4) {
            r2 = this;
            r2.e()
            r0 = 4
            r2.h(r0, r4)
            int[] r1 = r2.R
            r1[r4] = r0
            byte[][] r2 = r2.d0
            r2[r4] = r3
            return
    }

    @Override // defpackage.j36
    public final void f(int r2) {
            r1 = this;
            r1.e()
            r0 = 5
            r1.h(r0, r2)
            int[] r1 = r1.R
            r1[r2] = r0
            return
    }

    @Override // defpackage.j36
    public final boolean f0() {
            r0 = this;
            r0.e()
            r0.k()
            android.database.Cursor r0 = r0.e0
            if (r0 == 0) goto Lf
            boolean r0 = r0.moveToNext()
            return r0
        Lf:
            java.lang.String r0 = "Required value was null."
            defpackage.i.m(r0)
            r0 = 0
            return r0
    }

    @Override // defpackage.wu6, defpackage.j36
    public final void g() {
            r2 = this;
            r2.e()
            r0 = 0
            int[] r1 = new int[r0]
            r2.R = r1
            long[] r1 = new long[r0]
            r2.X = r1
            double[] r1 = new double[r0]
            r2.Y = r1
            java.lang.String[] r1 = new java.lang.String[r0]
            r2.Z = r1
            byte[][] r0 = new byte[r0]
            r2.d0 = r0
            return
    }

    @Override // defpackage.j36
    public final byte[] getBlob(int r1) {
            r0 = this;
            r0.e()
            android.database.Cursor r0 = r0.r()
            n(r0, r1)
            byte[] r0 = r0.getBlob(r1)
            r0.getClass()
            return r0
    }

    @Override // defpackage.j36
    public final int getColumnCount() {
            r0 = this;
            r0.e()
            r0.k()
            android.database.Cursor r0 = r0.e0
            if (r0 == 0) goto Lf
            int r0 = r0.getColumnCount()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    @Override // defpackage.j36
    public final java.lang.String getColumnName(int r1) {
            r0 = this;
            r0.e()
            r0.k()
            android.database.Cursor r0 = r0.e0
            if (r0 == 0) goto L15
            n(r0, r1)
            java.lang.String r0 = r0.getColumnName(r1)
            r0.getClass()
            return r0
        L15:
            java.lang.String r0 = "Required value was null."
            defpackage.i.m(r0)
            r0 = 0
            return r0
    }

    @Override // defpackage.j36
    public final long getLong(int r1) {
            r0 = this;
            r0.e()
            android.database.Cursor r0 = r0.r()
            n(r0, r1)
            long r0 = r0.getLong(r1)
            return r0
    }

    public final void h(int r4, int r5) {
            r3 = this;
            r0 = 1
            int r5 = r5 + r0
            int[] r1 = r3.R
            int r2 = r1.length
            if (r2 >= r5) goto Ld
            int[] r1 = java.util.Arrays.copyOf(r1, r5)
            r3.R = r1
        Ld:
            if (r4 == r0) goto L41
            r0 = 2
            if (r4 == r0) goto L35
            r0 = 3
            if (r4 == r0) goto L27
            r0 = 4
            if (r4 == r0) goto L19
            goto L4c
        L19:
            byte[][] r4 = r3.d0
            int r0 = r4.length
            if (r0 >= r5) goto L4c
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            byte[][] r4 = (byte[][]) r4
            r3.d0 = r4
            return
        L27:
            java.lang.String[] r4 = r3.Z
            int r0 = r4.length
            if (r0 >= r5) goto L4c
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r3.Z = r4
            return
        L35:
            double[] r4 = r3.Y
            int r0 = r4.length
            if (r0 >= r5) goto L4c
            double[] r4 = java.util.Arrays.copyOf(r4, r5)
            r3.Y = r4
            return
        L41:
            long[] r4 = r3.X
            int r0 = r4.length
            if (r0 >= r5) goto L4c
            long[] r4 = java.util.Arrays.copyOf(r4, r5)
            r3.X = r4
        L4c:
            return
    }

    @Override // defpackage.j36
    public final boolean isNull(int r1) {
            r0 = this;
            r0.e()
            android.database.Cursor r0 = r0.r()
            n(r0, r1)
            boolean r0 = r0.isNull(r1)
            return r0
    }

    public final void k() {
            r2 = this;
            android.database.Cursor r0 = r2.e0
            if (r0 != 0) goto L11
            s35 r0 = new s35
            r0.<init>(r2)
            vm2 r1 = r2.A
            android.database.Cursor r0 = r1.x(r0)
            r2.e0 = r0
        L11:
            return
    }

    public final android.database.Cursor r() {
            r1 = this;
            android.database.Cursor r1 = r1.e0
            if (r1 == 0) goto L5
            return r1
        L5:
            r1 = 21
            java.lang.String r0 = "no row"
            defpackage.ii2.T(r1, r0)
            r1 = 0
            throw r1
    }

    @Override // defpackage.wu6, defpackage.j36
    public final void reset() {
            r1 = this;
            r1.e()
            android.database.Cursor r0 = r1.e0
            if (r0 == 0) goto La
            r0.close()
        La:
            r0 = 0
            r1.e0 = r0
            return
    }

    @Override // defpackage.j36
    public final void w(int r3, java.lang.String r4) {
            r2 = this;
            r4.getClass()
            r2.e()
            r0 = 3
            r2.h(r0, r3)
            int[] r1 = r2.R
            r1[r3] = r0
            java.lang.String[] r2 = r2.Z
            r2[r3] = r4
            return
    }
}
