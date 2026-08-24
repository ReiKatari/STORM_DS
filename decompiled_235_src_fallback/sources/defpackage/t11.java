package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t11  reason: default package */
/* loaded from: classes.dex */
public final class t11 {
    public int[] a;
    public int[] b;
    public int c;
    public int[] d;
    public float[] e;
    public int f;
    public int[] g;
    public java.lang.String[] h;
    public int i;
    public int[] j;
    public boolean[] k;
    public int l;

    public final void a(int r4, float r5) {
            r3 = this;
            int r0 = r3.f
            int[] r1 = r3.d
            int r2 = r1.length
            if (r0 < r2) goto L1b
            int r0 = r1.length
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.d = r0
            float[] r0 = r3.e
            int r1 = r0.length
            int r1 = r1 * 2
            float[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.e = r0
        L1b:
            int[] r0 = r3.d
            int r1 = r3.f
            r0[r1] = r4
            float[] r4 = r3.e
            int r0 = r1 + 1
            r3.f = r0
            r4[r1] = r5
            return
    }

    public final void b(int r4, int r5) {
            r3 = this;
            int r0 = r3.c
            int[] r1 = r3.a
            int r2 = r1.length
            if (r0 < r2) goto L1b
            int r0 = r1.length
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.a = r0
            int[] r0 = r3.b
            int r1 = r0.length
            int r1 = r1 * 2
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.b = r0
        L1b:
            int[] r0 = r3.a
            int r1 = r3.c
            r0[r1] = r4
            int[] r4 = r3.b
            int r0 = r1 + 1
            r3.c = r0
            r4[r1] = r5
            return
    }

    public final void c(int r4, java.lang.String r5) {
            r3 = this;
            int r0 = r3.i
            int[] r1 = r3.g
            int r2 = r1.length
            if (r0 < r2) goto L1d
            int r0 = r1.length
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.g = r0
            java.lang.String[] r0 = r3.h
            int r1 = r0.length
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3.h = r0
        L1d:
            int[] r0 = r3.g
            int r1 = r3.i
            r0[r1] = r4
            java.lang.String[] r4 = r3.h
            int r0 = r1 + 1
            r3.i = r0
            r4[r1] = r5
            return
    }

    public final void d(int r4, boolean r5) {
            r3 = this;
            int r0 = r3.l
            int[] r1 = r3.j
            int r2 = r1.length
            if (r0 < r2) goto L1b
            int r0 = r1.length
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.j = r0
            boolean[] r0 = r3.k
            int r1 = r0.length
            int r1 = r1 * 2
            boolean[] r0 = java.util.Arrays.copyOf(r0, r1)
            r3.k = r0
        L1b:
            int[] r0 = r3.j
            int r1 = r3.l
            r0[r1] = r4
            boolean[] r4 = r3.k
            int r0 = r1 + 1
            r3.l = r0
            r4[r1] = r5
            return
    }

    public final void e(defpackage.u11 r9) {
            r8 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r8.c
            java.lang.String r3 = "Unknown attribute 0x"
            java.lang.String r4 = "ConstraintSet"
            if (r1 >= r2) goto L177
            int[] r2 = r8.a
            r2 = r2[r1]
            int[] r5 = r8.b
            r5 = r5[r1]
            r6 = 6
            if (r2 == r6) goto L16f
            r6 = 7
            if (r2 == r6) goto L16a
            r6 = 8
            if (r2 == r6) goto L165
            r6 = 27
            if (r2 == r6) goto L160
            r6 = 28
            if (r2 == r6) goto L15b
            r6 = 41
            if (r2 == r6) goto L156
            r6 = 42
            if (r2 == r6) goto L151
            r6 = 61
            if (r2 == r6) goto L14c
            r6 = 62
            if (r2 == r6) goto L147
            r6 = 72
            if (r2 == r6) goto L142
            r6 = 73
            if (r2 == r6) goto L13d
            r6 = 2
            if (r2 == r6) goto L138
            r6 = 31
            if (r2 == r6) goto L133
            r6 = 34
            if (r2 == r6) goto L12e
            r6 = 38
            if (r2 == r6) goto L12b
            r6 = 64
            if (r2 == r6) goto L126
            r6 = 66
            if (r2 == r6) goto L121
            r6 = 76
            if (r2 == r6) goto L11c
            r6 = 78
            if (r2 == r6) goto L117
            r6 = 97
            if (r2 == r6) goto L111
            r6 = 93
            if (r2 == r6) goto L10b
            r6 = 94
            if (r2 == r6) goto L105
            switch(r2) {
                case 11: goto Lff;
                case 12: goto Lf9;
                case 13: goto Lf3;
                case 14: goto Led;
                case 15: goto Le7;
                case 16: goto Le1;
                case 17: goto Ldb;
                case 18: goto Ld5;
                default: goto L6a;
            }
        L6a:
            switch(r2) {
                case 21: goto Lcf;
                case 22: goto Lc9;
                case 23: goto Lc3;
                case 24: goto Lbd;
                default: goto L6d;
            }
        L6d:
            switch(r2) {
                case 54: goto Lb7;
                case 55: goto Lb1;
                case 56: goto Lab;
                case 57: goto La5;
                case 58: goto L9f;
                case 59: goto L99;
                default: goto L70;
            }
        L70:
            switch(r2) {
                case 82: goto L93;
                case 83: goto L8d;
                case 84: goto L87;
                default: goto L73;
            }
        L73:
            switch(r2) {
                case 87: goto L173;
                case 88: goto L81;
                case 89: goto L7b;
                default: goto L76;
            }
        L76:
            android.util.Log.w(r4, r3)
            goto L173
        L7b:
            w11 r2 = r9.d
            r2.m = r5
            goto L173
        L81:
            w11 r2 = r9.d
            r2.l = r5
            goto L173
        L87:
            w11 r2 = r9.d
            r2.j = r5
            goto L173
        L8d:
            y11 r2 = r9.f
            r2.i = r5
            goto L173
        L93:
            w11 r2 = r9.d
            r2.c = r5
            goto L173
        L99:
            v11 r2 = r9.e
            r2.d0 = r5
            goto L173
        L9f:
            v11 r2 = r9.e
            r2.c0 = r5
            goto L173
        La5:
            v11 r2 = r9.e
            r2.b0 = r5
            goto L173
        Lab:
            v11 r2 = r9.e
            r2.a0 = r5
            goto L173
        Lb1:
            v11 r2 = r9.e
            r2.Z = r5
            goto L173
        Lb7:
            v11 r2 = r9.e
            r2.Y = r5
            goto L173
        Lbd:
            v11 r2 = r9.e
            r2.G = r5
            goto L173
        Lc3:
            v11 r2 = r9.e
            r2.c = r5
            goto L173
        Lc9:
            x11 r2 = r9.c
            r2.b = r5
            goto L173
        Lcf:
            v11 r2 = r9.e
            r2.d = r5
            goto L173
        Ld5:
            v11 r2 = r9.e
            r2.f = r5
            goto L173
        Ldb:
            v11 r2 = r9.e
            r2.e = r5
            goto L173
        Le1:
            v11 r2 = r9.e
            r2.O = r5
            goto L173
        Le7:
            v11 r2 = r9.e
            r2.S = r5
            goto L173
        Led:
            v11 r2 = r9.e
            r2.P = r5
            goto L173
        Lf3:
            v11 r2 = r9.e
            r2.N = r5
            goto L173
        Lf9:
            v11 r2 = r9.e
            r2.R = r5
            goto L173
        Lff:
            v11 r2 = r9.e
            r2.Q = r5
            goto L173
        L105:
            v11 r2 = r9.e
            r2.T = r5
            goto L173
        L10b:
            v11 r2 = r9.e
            r2.M = r5
            goto L173
        L111:
            v11 r2 = r9.e
            r2.p0 = r5
            goto L173
        L117:
            x11 r2 = r9.c
            r2.c = r5
            goto L173
        L11c:
            w11 r2 = r9.d
            r2.e = r5
            goto L173
        L121:
            w11 r2 = r9.d
            r2.f = r5
            goto L173
        L126:
            w11 r2 = r9.d
            r2.b = r5
            goto L173
        L12b:
            r9.a = r5
            goto L173
        L12e:
            v11 r2 = r9.e
            r2.I = r5
            goto L173
        L133:
            v11 r2 = r9.e
            r2.L = r5
            goto L173
        L138:
            v11 r2 = r9.e
            r2.J = r5
            goto L173
        L13d:
            v11 r2 = r9.e
            r2.h0 = r5
            goto L173
        L142:
            v11 r2 = r9.e
            r2.g0 = r5
            goto L173
        L147:
            v11 r2 = r9.e
            r2.B = r5
            goto L173
        L14c:
            v11 r2 = r9.e
            r2.A = r5
            goto L173
        L151:
            v11 r2 = r9.e
            r2.X = r5
            goto L173
        L156:
            v11 r2 = r9.e
            r2.W = r5
            goto L173
        L15b:
            v11 r2 = r9.e
            r2.H = r5
            goto L173
        L160:
            v11 r2 = r9.e
            r2.F = r5
            goto L173
        L165:
            v11 r2 = r9.e
            r2.K = r5
            goto L173
        L16a:
            v11 r2 = r9.e
            r2.E = r5
            goto L173
        L16f:
            v11 r2 = r9.e
            r2.D = r5
        L173:
            int r1 = r1 + 1
            goto L2
        L177:
            r1 = r0
        L178:
            int r2 = r8.f
            r5 = 87
            if (r1 >= r2) goto L23b
            int[] r2 = r8.d
            r2 = r2[r1]
            float[] r6 = r8.e
            r6 = r6[r1]
            r7 = 19
            if (r2 == r7) goto L233
            r7 = 20
            if (r2 == r7) goto L22e
            r7 = 37
            if (r2 == r7) goto L229
            r7 = 60
            if (r2 == r7) goto L224
            r7 = 63
            if (r2 == r7) goto L21f
            r7 = 79
            if (r2 == r7) goto L21a
            r7 = 85
            if (r2 == r7) goto L215
            if (r2 == r5) goto L237
            r5 = 39
            if (r2 == r5) goto L210
            r5 = 40
            if (r2 == r5) goto L20b
            switch(r2) {
                case 43: goto L206;
                case 44: goto L1fe;
                case 45: goto L1f9;
                case 46: goto L1f4;
                case 47: goto L1ef;
                case 48: goto L1ea;
                case 49: goto L1e5;
                case 50: goto L1e0;
                case 51: goto L1db;
                case 52: goto L1d5;
                case 53: goto L1cf;
                default: goto L1af;
            }
        L1af:
            switch(r2) {
                case 67: goto L1c9;
                case 68: goto L1c3;
                case 69: goto L1bd;
                case 70: goto L1b7;
                default: goto L1b2;
            }
        L1b2:
            android.util.Log.w(r4, r3)
            goto L237
        L1b7:
            v11 r2 = r9.e
            r2.f0 = r6
            goto L237
        L1bd:
            v11 r2 = r9.e
            r2.e0 = r6
            goto L237
        L1c3:
            x11 r2 = r9.c
            r2.e = r6
            goto L237
        L1c9:
            w11 r2 = r9.d
            r2.h = r6
            goto L237
        L1cf:
            y11 r2 = r9.f
            r2.l = r6
            goto L237
        L1d5:
            y11 r2 = r9.f
            r2.k = r6
            goto L237
        L1db:
            y11 r2 = r9.f
            r2.j = r6
            goto L237
        L1e0:
            y11 r2 = r9.f
            r2.h = r6
            goto L237
        L1e5:
            y11 r2 = r9.f
            r2.g = r6
            goto L237
        L1ea:
            y11 r2 = r9.f
            r2.f = r6
            goto L237
        L1ef:
            y11 r2 = r9.f
            r2.e = r6
            goto L237
        L1f4:
            y11 r2 = r9.f
            r2.d = r6
            goto L237
        L1f9:
            y11 r2 = r9.f
            r2.c = r6
            goto L237
        L1fe:
            y11 r2 = r9.f
            r2.n = r6
            r5 = 1
            r2.m = r5
            goto L237
        L206:
            x11 r2 = r9.c
            r2.d = r6
            goto L237
        L20b:
            v11 r2 = r9.e
            r2.U = r6
            goto L237
        L210:
            v11 r2 = r9.e
            r2.V = r6
            goto L237
        L215:
            w11 r2 = r9.d
            r2.i = r6
            goto L237
        L21a:
            w11 r2 = r9.d
            r2.g = r6
            goto L237
        L21f:
            v11 r2 = r9.e
            r2.C = r6
            goto L237
        L224:
            y11 r2 = r9.f
            r2.b = r6
            goto L237
        L229:
            v11 r2 = r9.e
            r2.y = r6
            goto L237
        L22e:
            v11 r2 = r9.e
            r2.x = r6
            goto L237
        L233:
            v11 r2 = r9.e
            r2.g = r6
        L237:
            int r1 = r1 + 1
            goto L178
        L23b:
            r1 = r0
        L23c:
            int r2 = r8.i
            if (r1 >= r2) goto L27f
            int[] r2 = r8.g
            r2 = r2[r1]
            java.lang.String[] r6 = r8.h
            r6 = r6[r1]
            r7 = 5
            if (r2 == r7) goto L278
            r7 = 65
            if (r2 == r7) goto L273
            r7 = 74
            if (r2 == r7) goto L26b
            r7 = 77
            if (r2 == r7) goto L266
            if (r2 == r5) goto L27c
            r7 = 90
            if (r2 == r7) goto L261
            android.util.Log.w(r4, r3)
            goto L27c
        L261:
            w11 r2 = r9.d
            r2.k = r6
            goto L27c
        L266:
            v11 r2 = r9.e
            r2.l0 = r6
            goto L27c
        L26b:
            v11 r2 = r9.e
            r2.k0 = r6
            r6 = 0
            r2.j0 = r6
            goto L27c
        L273:
            w11 r2 = r9.d
            r2.d = r6
            goto L27c
        L278:
            v11 r2 = r9.e
            r2.z = r6
        L27c:
            int r1 = r1 + 1
            goto L23c
        L27f:
            int r1 = r8.l
            if (r0 >= r1) goto L2b7
            int[] r1 = r8.j
            r1 = r1[r0]
            boolean[] r2 = r8.k
            boolean r2 = r2[r0]
            r6 = 44
            if (r1 == r6) goto L2b0
            r6 = 75
            if (r1 == r6) goto L2ab
            if (r1 == r5) goto L2b4
            r6 = 80
            if (r1 == r6) goto L2a6
            r6 = 81
            if (r1 == r6) goto L2a1
            android.util.Log.w(r4, r3)
            goto L2b4
        L2a1:
            v11 r1 = r9.e
            r1.n0 = r2
            goto L2b4
        L2a6:
            v11 r1 = r9.e
            r1.m0 = r2
            goto L2b4
        L2ab:
            v11 r1 = r9.e
            r1.o0 = r2
            goto L2b4
        L2b0:
            y11 r1 = r9.f
            r1.m = r2
        L2b4:
            int r0 = r0 + 1
            goto L27f
        L2b7:
            return
    }
}
