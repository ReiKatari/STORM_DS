package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fv  reason: default package */
/* loaded from: classes.dex */
public abstract class fv extends defpackage.nc1 {
    public static void A0(long[] r2, long r3) {
            int r0 = r2.length
            r2.getClass()
            r1 = 0
            java.util.Arrays.fill(r2, r1, r0, r3)
            return
    }

    public static /* synthetic */ void B0(java.lang.Object[] r2, defpackage.gr1 r3) {
            r0 = 0
            int r1 = r2.length
            z0(r0, r1, r3, r2)
            return
    }

    public static java.util.ArrayList C0(java.lang.Object[] r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r4.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L13
            r3 = r4[r2]
            if (r3 == 0) goto L10
            r0.add(r3)
        L10:
            int r2 = r2 + 1
            goto L7
        L13:
            return r0
    }

    public static java.lang.Object D0(java.lang.Object[] r1) {
            r1.getClass()
            int r0 = r1.length
            if (r0 == 0) goto La
            r0 = 0
            r1 = r1[r0]
            return r1
        La:
            java.lang.String r1 = "Array is empty."
            defpackage.fa6.e(r1)
            r1 = 0
            return r1
    }

    public static java.lang.Object E0(java.lang.Object[] r1) {
            r1.getClass()
            int r0 = r1.length
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r0 = 0
            r1 = r1[r0]
            return r1
    }

    public static defpackage.l93 F0(int[] r3) {
            l93 r0 = new l93
            int r3 = r3.length
            r1 = 1
            int r3 = r3 - r1
            r2 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static defpackage.l93 G0(java.lang.Object[] r3) {
            r3.getClass()
            l93 r0 = new l93
            int r3 = r3.length
            r1 = 1
            int r3 = r3 - r1
            r2 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static int H0(long[] r0) {
            r0.getClass()
            int r0 = r0.length
            int r0 = r0 + (-1)
            return r0
    }

    public static java.lang.Integer I0(int[] r1, int r2) {
            if (r2 < 0) goto Lc
            int r0 = r1.length
            if (r2 >= r0) goto Lc
            r1 = r1[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static java.lang.Object J0(int r1, java.lang.Object[] r2) {
            r2.getClass()
            if (r1 < 0) goto Lb
            int r0 = r2.length
            if (r1 >= r0) goto Lb
            r1 = r2[r1]
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static int K0(java.lang.Object[] r3, java.lang.Object r4) {
            r3.getClass()
            r0 = 0
            if (r4 != 0) goto L11
            int r4 = r3.length
        L7:
            if (r0 >= r4) goto L20
            r1 = r3[r0]
            if (r1 != 0) goto Le
            return r0
        Le:
            int r0 = r0 + 1
            goto L7
        L11:
            int r1 = r3.length
        L12:
            if (r0 >= r1) goto L20
            r2 = r3[r0]
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L1d
            return r0
        L1d:
            int r0 = r0 + 1
            goto L12
        L20:
            r3 = -1
            return r3
    }

    public static java.lang.String L0(byte[] r7, defpackage.qn2 r8) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            int r2 = r7.length
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L28
            r5 = r7[r3]
            r6 = 1
            int r4 = r4 + r6
            if (r4 <= r6) goto L18
            r0.append(r1)
        L18:
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            java.lang.Object r5 = r8.g(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r0.append(r5)
            int r3 = r3 + 1
            goto Ld
        L28:
            r0.append(r1)
            java.lang.String r7 = r0.toString()
            return r7
    }

    public static java.lang.String M0(java.lang.Object[] r4, java.lang.String r5, java.lang.String r6, defpackage.vn0 r7, int r8) {
            r8 = r8 & 32
            if (r8 == 0) goto L5
            r7 = 0
        L5:
            r4.getClass()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            int r5 = r4.length
            r0 = 0
            r1 = r0
        L13:
            if (r0 >= r5) goto L26
            r2 = r4[r0]
            r3 = 1
            int r1 = r1 + r3
            if (r1 <= r3) goto L20
            java.lang.String r3 = ", "
            r8.append(r3)
        L20:
            defpackage.hi2.s(r8, r2, r7)
            int r0 = r0 + 1
            goto L13
        L26:
            r8.append(r6)
            java.lang.String r4 = r8.toString()
            return r4
    }

    public static java.lang.Object[] N0(java.lang.Object[] r3, java.lang.Object[] r4) {
            r3.getClass()
            r4.getClass()
            int r0 = r3.length
            int r1 = r4.length
            int r2 = r0 + r1
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r2)
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r3, r0, r1)
            return r3
    }

    public static char O0(char[] r3) {
            int r0 = r3.length
            r1 = 0
            if (r0 == 0) goto L10
            r2 = 1
            if (r0 != r2) goto La
            char r3 = r3[r1]
            return r3
        La:
            java.lang.String r3 = "Array has more than one element."
            defpackage.i.h(r3)
            return r1
        L10:
            java.lang.String r3 = "Array is empty."
            defpackage.fa6.e(r3)
            return r1
    }

    public static final void P0(java.lang.Object[] r3, java.util.LinkedHashSet r4) {
            r3.getClass()
            int r0 = r3.length
            r1 = 0
        L5:
            if (r1 >= r0) goto Lf
            r2 = r3[r1]
            r4.add(r2)
            int r1 = r1 + 1
            goto L5
        Lf:
            return
    }

    public static java.util.List Q0(double[] r5) {
            r5.getClass()
            int r0 = r5.length
            if (r0 == 0) goto L2b
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L20
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r5.length
            r0.<init>(r2)
            int r2 = r5.length
        L11:
            if (r1 >= r2) goto L1f
            r3 = r5[r1]
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r0.add(r3)
            int r1 = r1 + 1
            goto L11
        L1f:
            return r0
        L20:
            r0 = r5[r1]
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            java.util.List r5 = defpackage.hf.b0(r5)
            return r5
        L2b:
            yt1 r5 = defpackage.yt1.A
            return r5
    }

    public static java.util.List R0(float[] r4) {
            r4.getClass()
            int r0 = r4.length
            if (r0 == 0) goto L2b
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L20
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r4.length
            r0.<init>(r2)
            int r2 = r4.length
        L11:
            if (r1 >= r2) goto L1f
            r3 = r4[r1]
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.add(r3)
            int r1 = r1 + 1
            goto L11
        L1f:
            return r0
        L20:
            r4 = r4[r1]
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.util.List r4 = defpackage.hf.b0(r4)
            return r4
        L2b:
            yt1 r4 = defpackage.yt1.A
            return r4
    }

    public static java.util.List S0(long[] r5) {
            r5.getClass()
            int r0 = r5.length
            if (r0 == 0) goto L2b
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L20
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r5.length
            r0.<init>(r2)
            int r2 = r5.length
        L11:
            if (r1 >= r2) goto L1f
            r3 = r5[r1]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.add(r3)
            int r1 = r1 + 1
            goto L11
        L1f:
            return r0
        L20:
            r0 = r5[r1]
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            java.util.List r5 = defpackage.hf.b0(r5)
            return r5
        L2b:
            yt1 r5 = defpackage.yt1.A
            return r5
    }

    public static java.util.List T0(java.lang.Object[] r2) {
            r2.getClass()
            int r0 = r2.length
            if (r0 == 0) goto L1e
            r1 = 1
            if (r0 == r1) goto L16
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.util.List r2 = java.util.Arrays.asList(r2)
            r2.getClass()
            return r2
        L16:
            r0 = 0
            r2 = r2[r0]
            java.util.List r2 = defpackage.hf.b0(r2)
            return r2
        L1e:
            yt1 r2 = defpackage.yt1.A
            return r2
    }

    public static java.util.List U0(boolean[] r4) {
            r4.getClass()
            int r0 = r4.length
            if (r0 == 0) goto L2b
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L20
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r4.length
            r0.<init>(r2)
            int r2 = r4.length
        L11:
            if (r1 >= r2) goto L1f
            boolean r3 = r4[r1]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0.add(r3)
            int r1 = r1 + 1
            goto L11
        L1f:
            return r0
        L20:
            boolean r4 = r4[r1]
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.util.List r4 = defpackage.hf.b0(r4)
            return r4
        L2b:
            yt1 r4 = defpackage.yt1.A
            return r4
    }

    public static java.util.Set V0(java.lang.Object[] r2) {
            r2.getClass()
            int r0 = r2.length
            if (r0 == 0) goto L1f
            r1 = 1
            if (r0 == r1) goto L17
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r2.length
            int r1 = defpackage.c14.k0(r1)
            r0.<init>(r1)
            P0(r2, r0)
            return r0
        L17:
            r0 = 0
            r2 = r2[r0]
            java.util.Set r2 = defpackage.ii2.R(r2)
            return r2
        L1f:
            du1 r2 = defpackage.du1.A
            return r2
    }

    public static java.lang.Integer[] W0(int[] r4) {
            r4.getClass()
            int r0 = r4.length
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            int r1 = r4.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L15
            r3 = r4[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            int r2 = r2 + 1
            goto L8
        L15:
            return r0
    }

    public static java.util.ArrayList X0(java.lang.Object[] r6, java.lang.Object[] r7) {
            int r0 = r6.length
            int r1 = r7.length
            int r0 = java.lang.Math.min(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        Lc:
            if (r2 >= r0) goto L1d
            r3 = r6[r2]
            r4 = r7[r2]
            vr4 r5 = new vr4
            r5.<init>(r3, r4)
            r1.add(r5)
            int r2 = r2 + 1
            goto Lc
        L1d:
            return r1
    }

    public static java.util.List l0(java.lang.Object[] r0) {
            r0.getClass()
            java.util.List r0 = java.util.Arrays.asList(r0)
            r0.getClass()
            return r0
    }

    public static boolean m0(int[] r4, int r5) {
            r4.getClass()
            int r0 = r4.length
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L10
            r3 = r4[r2]
            if (r5 != r3) goto Ld
            goto L11
        Ld:
            int r2 = r2 + 1
            goto L6
        L10:
            r2 = -1
        L11:
            if (r2 < 0) goto L15
            r4 = 1
            return r4
        L15:
            return r1
    }

    public static boolean n0(long[] r5, long r6) {
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto Lf
            r3 = r5[r2]
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 != 0) goto Lc
            goto L10
        Lc:
            int r2 = r2 + 1
            goto L3
        Lf:
            r2 = -1
        L10:
            if (r2 < 0) goto L14
            r5 = 1
            return r5
        L14:
            return r1
    }

    public static boolean o0(java.lang.Object[] r0, java.lang.Object r1) {
            r0.getClass()
            int r0 = K0(r0, r1)
            if (r0 < 0) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static boolean p0(java.lang.Object[] r6, java.lang.Object[] r7) {
            if (r6 != r7) goto L4
            goto L13c
        L4:
            r0 = 0
            if (r6 == 0) goto L13e
            if (r7 == 0) goto L13e
            int r1 = r6.length
            int r2 = r7.length
            if (r1 == r2) goto Lf
            goto L13e
        Lf:
            int r1 = r6.length
            r2 = r0
        L11:
            if (r2 >= r1) goto L13c
            r3 = r6[r2]
            r4 = r7[r2]
            if (r3 != r4) goto L1b
            goto L138
        L1b:
            if (r3 == 0) goto L13e
            if (r4 != 0) goto L21
            goto L13e
        L21:
            boolean r5 = r3 instanceof java.lang.Object[]
            if (r5 == 0) goto L35
            boolean r5 = r4 instanceof java.lang.Object[]
            if (r5 == 0) goto L35
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            boolean r3 = p0(r3, r4)
            if (r3 != 0) goto L138
            goto L13e
        L35:
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L49
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L49
            byte[] r3 = (byte[]) r3
            byte[] r4 = (byte[]) r4
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 != 0) goto L138
            goto L13e
        L49:
            boolean r5 = r3 instanceof short[]
            if (r5 == 0) goto L5d
            boolean r5 = r4 instanceof short[]
            if (r5 == 0) goto L5d
            short[] r3 = (short[]) r3
            short[] r4 = (short[]) r4
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 != 0) goto L138
            goto L13e
        L5d:
            boolean r5 = r3 instanceof int[]
            if (r5 == 0) goto L71
            boolean r5 = r4 instanceof int[]
            if (r5 == 0) goto L71
            int[] r3 = (int[]) r3
            int[] r4 = (int[]) r4
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 != 0) goto L138
            goto L13e
        L71:
            boolean r5 = r3 instanceof long[]
            if (r5 == 0) goto L85
            boolean r5 = r4 instanceof long[]
            if (r5 == 0) goto L85
            long[] r3 = (long[]) r3
            long[] r4 = (long[]) r4
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 != 0) goto L138
            goto L13e
        L85:
            boolean r5 = r3 instanceof float[]
            if (r5 == 0) goto L99
            boolean r5 = r4 instanceof float[]
            if (r5 == 0) goto L99
            float[] r3 = (float[]) r3
            float[] r4 = (float[]) r4
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 != 0) goto L138
            goto L13e
        L99:
            boolean r5 = r3 instanceof double[]
            if (r5 == 0) goto Lad
            boolean r5 = r4 instanceof double[]
            if (r5 == 0) goto Lad
            double[] r3 = (double[]) r3
            double[] r4 = (double[]) r4
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 != 0) goto L138
            goto L13e
        Lad:
            boolean r5 = r3 instanceof char[]
            if (r5 == 0) goto Lc1
            boolean r5 = r4 instanceof char[]
            if (r5 == 0) goto Lc1
            char[] r3 = (char[]) r3
            char[] r4 = (char[]) r4
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 != 0) goto L138
            goto L13e
        Lc1:
            boolean r5 = r3 instanceof boolean[]
            if (r5 == 0) goto Ld5
            boolean r5 = r4 instanceof boolean[]
            if (r5 == 0) goto Ld5
            boolean[] r3 = (boolean[]) r3
            boolean[] r4 = (boolean[]) r4
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 != 0) goto L138
            goto L13e
        Ld5:
            boolean r5 = r3 instanceof defpackage.af7
            if (r5 == 0) goto Lec
            boolean r5 = r4 instanceof defpackage.af7
            if (r5 == 0) goto Lec
            af7 r3 = (defpackage.af7) r3
            byte[] r3 = r3.A
            af7 r4 = (defpackage.af7) r4
            byte[] r4 = r4.A
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 != 0) goto L138
            goto L13e
        Lec:
            boolean r5 = r3 instanceof defpackage.yf7
            if (r5 == 0) goto L103
            boolean r5 = r4 instanceof defpackage.yf7
            if (r5 == 0) goto L103
            yf7 r3 = (defpackage.yf7) r3
            short[] r3 = r3.A
            yf7 r4 = (defpackage.yf7) r4
            short[] r4 = r4.A
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 != 0) goto L138
            goto L13e
        L103:
            boolean r5 = r3 instanceof defpackage.nf7
            if (r5 == 0) goto L11a
            boolean r5 = r4 instanceof defpackage.nf7
            if (r5 == 0) goto L11a
            nf7 r3 = (defpackage.nf7) r3
            int[] r3 = r3.A
            nf7 r4 = (defpackage.nf7) r4
            int[] r4 = r4.A
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 != 0) goto L138
            goto L13e
        L11a:
            boolean r5 = r3 instanceof defpackage.sf7
            if (r5 == 0) goto L131
            boolean r5 = r4 instanceof defpackage.sf7
            if (r5 == 0) goto L131
            sf7 r3 = (defpackage.sf7) r3
            long[] r3 = r3.A
            sf7 r4 = (defpackage.sf7) r4
            long[] r4 = r4.A
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 != 0) goto L138
            goto L13e
        L131:
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L138
            goto L13e
        L138:
            int r2 = r2 + 1
            goto L11
        L13c:
            r6 = 1
            return r6
        L13e:
            return r0
    }

    public static void q0(int r0, int r1, int r2, byte[] r3, byte[] r4) {
            r3.getClass()
            r4.getClass()
            int r2 = r2 - r1
            java.lang.System.arraycopy(r3, r1, r4, r0, r2)
            return
    }

    public static void r0(int r0, int r1, int r2, int[] r3, int[] r4) {
            r3.getClass()
            r4.getClass()
            int r2 = r2 - r1
            java.lang.System.arraycopy(r3, r1, r4, r0, r2)
            return
    }

    public static void s0(long[] r0, long[] r1, int r2, int r3, int r4) {
            r0.getClass()
            r1.getClass()
            int r4 = r4 - r3
            java.lang.System.arraycopy(r0, r3, r1, r2, r4)
            return
    }

    public static void t0(java.lang.Object[] r0, java.lang.Object[] r1, int r2, int r3, int r4) {
            r0.getClass()
            r1.getClass()
            int r4 = r4 - r3
            java.lang.System.arraycopy(r0, r3, r1, r2, r4)
            return
    }

    public static /* synthetic */ void u0(int r2, int r3, int r4, byte[] r5, byte[] r6) {
            r0 = r4 & 4
            r1 = 0
            if (r0 == 0) goto L6
            r2 = r1
        L6:
            r4 = r4 & 8
            if (r4 == 0) goto Lb
            int r3 = r5.length
        Lb:
            q0(r1, r2, r3, r5, r6)
            return
    }

    public static /* synthetic */ void v0(int r2, int r3, int r4, int[] r5, int[] r6) {
            r0 = r4 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r2 = r1
        L6:
            r4 = r4 & 8
            if (r4 == 0) goto Lb
            int r3 = r5.length
        Lb:
            r0(r2, r1, r3, r5, r6)
            return
    }

    public static /* synthetic */ void w0(java.lang.Object[] r2, java.lang.Object[] r3, int r4, int r5, int r6) {
            r0 = r6 & 4
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r6 = r6 & 8
            if (r6 == 0) goto Lb
            int r5 = r2.length
        Lb:
            t0(r2, r3, r1, r4, r5)
            return
    }

    public static byte[] x0(byte[] r1, int r2, int r3) {
            r1.getClass()
            int r0 = r1.length
            defpackage.nc1.I(r3, r0)
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            r1.getClass()
            return r1
    }

    public static java.lang.Object[] y0(java.lang.Object[] r1, int r2, int r3) {
            r1.getClass()
            int r0 = r1.length
            defpackage.nc1.I(r3, r0)
            java.lang.Object[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            r1.getClass()
            return r1
    }

    public static void z0(int r0, int r1, java.lang.Object r2, java.lang.Object[] r3) {
            r3.getClass()
            java.util.Arrays.fill(r3, r0, r1, r2)
            return
    }
}
