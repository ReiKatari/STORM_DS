package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p50  reason: default package */
/* loaded from: classes.dex */
public final class p50 extends defpackage.dt0 {
    public final /* synthetic */ int q;

    public /* synthetic */ p50(boolean r1, int r2) {
            r0 = this;
            r0.q = r2
            r0.<init>(r1)
            return
    }

    public static int[] i(java.lang.String r1) {
            q50 r0 = defpackage.fd4.b
            java.lang.Object r1 = r0.d(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int[] r1 = new int[]{r1}
            return r1
    }

    public static long[] j(java.lang.String r3) {
            q50 r0 = defpackage.fd4.e
            java.lang.Object r3 = r0.d(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            r3 = 1
            long[] r3 = new long[r3]
            r2 = 0
            r3[r2] = r0
            return r3
    }

    public static boolean[] k(java.lang.String r2) {
            q50 r0 = defpackage.fd4.k
            java.lang.Object r2 = r0.d(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0 = 1
            boolean[] r0 = new boolean[r0]
            r1 = 0
            r0[r1] = r2
            return r0
    }

    @Override // defpackage.fd4
    public final java.lang.Object a(android.os.Bundle r3, java.lang.String r4) {
            r2 = this;
            int r2 = r2.q
            r0 = 0
            switch(r2) {
                case 0: goto L115;
                case 1: goto Lf8;
                case 2: goto Lde;
                case 3: goto Lc1;
                case 4: goto La7;
                case 5: goto L65;
                case 6: goto L4b;
                case 7: goto L2e;
                case 8: goto L1c;
                default: goto L6;
            }
        L6:
            boolean r2 = defpackage.i61.C(r3, r4, r4)
            if (r2 == 0) goto L1b
            boolean r2 = defpackage.uj2.X(r3, r4)
            if (r2 == 0) goto L13
            goto L1b
        L13:
            java.lang.String[] r2 = defpackage.uj2.Q(r3, r4)
            java.util.List r0 = defpackage.fv.T0(r2)
        L1b:
            return r0
        L1c:
            boolean r2 = defpackage.i61.C(r3, r4, r4)
            if (r2 == 0) goto L2d
            boolean r2 = defpackage.uj2.X(r3, r4)
            if (r2 == 0) goto L29
            goto L2d
        L29:
            java.lang.String[] r0 = defpackage.uj2.Q(r3, r4)
        L2d:
            return r0
        L2e:
            boolean r2 = defpackage.i61.C(r3, r4, r4)
            if (r2 == 0) goto L4a
            boolean r2 = defpackage.uj2.X(r3, r4)
            if (r2 == 0) goto L3b
            goto L4a
        L3b:
            long[] r2 = r3.getLongArray(r4)
            if (r2 == 0) goto L46
            java.util.List r0 = defpackage.fv.S0(r2)
            goto L4a
        L46:
            defpackage.xk2.B(r4)
            throw r0
        L4a:
            return r0
        L4b:
            boolean r2 = defpackage.i61.C(r3, r4, r4)
            if (r2 == 0) goto L64
            boolean r2 = defpackage.uj2.X(r3, r4)
            if (r2 == 0) goto L58
            goto L64
        L58:
            long[] r2 = r3.getLongArray(r4)
            if (r2 == 0) goto L60
            r0 = r2
            goto L64
        L60:
            defpackage.xk2.B(r4)
            throw r0
        L64:
            return r0
        L65:
            boolean r2 = defpackage.i61.C(r3, r4, r4)
            if (r2 == 0) goto La6
            boolean r2 = defpackage.uj2.X(r3, r4)
            if (r2 == 0) goto L72
            goto La6
        L72:
            int[] r2 = r3.getIntArray(r4)
            if (r2 == 0) goto La2
            int r3 = r2.length
            if (r3 == 0) goto L9f
            r4 = 0
            r0 = 1
            if (r3 == r0) goto L94
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = r2.length
            r0.<init>(r3)
            int r3 = r2.length
        L86:
            if (r4 >= r3) goto La6
            r1 = r2[r4]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            int r4 = r4 + 1
            goto L86
        L94:
            r2 = r2[r4]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.List r0 = defpackage.hf.b0(r2)
            goto La6
        L9f:
            yt1 r0 = defpackage.yt1.A
            goto La6
        La2:
            defpackage.xk2.B(r4)
            throw r0
        La6:
            return r0
        La7:
            boolean r2 = defpackage.i61.C(r3, r4, r4)
            if (r2 == 0) goto Lc0
            boolean r2 = defpackage.uj2.X(r3, r4)
            if (r2 == 0) goto Lb4
            goto Lc0
        Lb4:
            int[] r2 = r3.getIntArray(r4)
            if (r2 == 0) goto Lbc
            r0 = r2
            goto Lc0
        Lbc:
            defpackage.xk2.B(r4)
            throw r0
        Lc0:
            return r0
        Lc1:
            boolean r2 = defpackage.i61.C(r3, r4, r4)
            if (r2 == 0) goto Ldd
            boolean r2 = defpackage.uj2.X(r3, r4)
            if (r2 == 0) goto Lce
            goto Ldd
        Lce:
            float[] r2 = r3.getFloatArray(r4)
            if (r2 == 0) goto Ld9
            java.util.List r0 = defpackage.fv.R0(r2)
            goto Ldd
        Ld9:
            defpackage.xk2.B(r4)
            throw r0
        Ldd:
            return r0
        Lde:
            boolean r2 = defpackage.i61.C(r3, r4, r4)
            if (r2 == 0) goto Lf7
            boolean r2 = defpackage.uj2.X(r3, r4)
            if (r2 == 0) goto Leb
            goto Lf7
        Leb:
            float[] r2 = r3.getFloatArray(r4)
            if (r2 == 0) goto Lf3
            r0 = r2
            goto Lf7
        Lf3:
            defpackage.xk2.B(r4)
            throw r0
        Lf7:
            return r0
        Lf8:
            boolean r2 = defpackage.i61.C(r3, r4, r4)
            if (r2 == 0) goto L114
            boolean r2 = defpackage.uj2.X(r3, r4)
            if (r2 == 0) goto L105
            goto L114
        L105:
            boolean[] r2 = r3.getBooleanArray(r4)
            if (r2 == 0) goto L110
            java.util.List r0 = defpackage.fv.U0(r2)
            goto L114
        L110:
            defpackage.xk2.B(r4)
            throw r0
        L114:
            return r0
        L115:
            boolean r2 = defpackage.i61.C(r3, r4, r4)
            if (r2 == 0) goto L12e
            boolean r2 = defpackage.uj2.X(r3, r4)
            if (r2 == 0) goto L122
            goto L12e
        L122:
            boolean[] r2 = r3.getBooleanArray(r4)
            if (r2 == 0) goto L12a
            r0 = r2
            goto L12e
        L12a:
            defpackage.xk2.B(r4)
            throw r0
        L12e:
            return r0
    }

    @Override // defpackage.fd4
    public final java.lang.String b() {
            r0 = this;
            int r0 = r0.q
            switch(r0) {
                case 0: goto L20;
                case 1: goto L1d;
                case 2: goto L1a;
                case 3: goto L17;
                case 4: goto L14;
                case 5: goto L11;
                case 6: goto Le;
                case 7: goto Lb;
                case 8: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "List<String>"
            return r0
        L8:
            java.lang.String r0 = "string[]"
            return r0
        Lb:
            java.lang.String r0 = "List<Long>"
            return r0
        Le:
            java.lang.String r0 = "long[]"
            return r0
        L11:
            java.lang.String r0 = "List<Int>"
            return r0
        L14:
            java.lang.String r0 = "integer[]"
            return r0
        L17:
            java.lang.String r0 = "List<Float>"
            return r0
        L1a:
            java.lang.String r0 = "float[]"
            return r0
        L1d:
            java.lang.String r0 = "List<Boolean>"
            return r0
        L20:
            java.lang.String r0 = "boolean[]"
            return r0
    }

    @Override // defpackage.fd4
    public final java.lang.Object c(java.lang.Object r4, java.lang.String r5) {
            r3 = this;
            int r3 = r3.q
            r0 = 0
            r1 = 1
            switch(r3) {
                case 0: goto Lf3;
                case 1: goto Ld7;
                case 2: goto Lb7;
                case 3: goto L95;
                case 4: goto L7d;
                case 5: goto L61;
                case 6: goto L49;
                case 7: goto L2d;
                case 8: goto L19;
                default: goto L7;
            }
        L7:
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L14
            java.util.List r3 = defpackage.hf.b0(r5)
            java.util.ArrayList r3 = defpackage.gt0.V0(r4, r3)
            goto L18
        L14:
            java.util.List r3 = defpackage.hf.b0(r5)
        L18:
            return r3
        L19:
            java.lang.String[] r4 = (java.lang.String[]) r4
            if (r4 == 0) goto L28
            java.lang.String[] r3 = new java.lang.String[]{r5}
            java.lang.Object[] r3 = defpackage.fv.N0(r4, r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            goto L2c
        L28:
            java.lang.String[] r3 = new java.lang.String[]{r5}
        L2c:
            return r3
        L2d:
            java.util.List r4 = (java.util.List) r4
            q50 r3 = defpackage.fd4.e
            if (r4 == 0) goto L40
            java.lang.Object r3 = r3.d(r5)
            java.util.List r3 = defpackage.hf.b0(r3)
            java.util.ArrayList r3 = defpackage.gt0.V0(r4, r3)
            goto L48
        L40:
            java.lang.Object r3 = r3.d(r5)
            java.util.List r3 = defpackage.hf.b0(r3)
        L48:
            return r3
        L49:
            long[] r4 = (long[]) r4
            if (r4 == 0) goto L5c
            long[] r3 = j(r5)
            int r5 = r4.length
            int r2 = r5 + 1
            long[] r4 = java.util.Arrays.copyOf(r4, r2)
            java.lang.System.arraycopy(r3, r0, r4, r5, r1)
            goto L60
        L5c:
            long[] r4 = j(r5)
        L60:
            return r4
        L61:
            java.util.List r4 = (java.util.List) r4
            q50 r3 = defpackage.fd4.b
            if (r4 == 0) goto L74
            java.lang.Object r3 = r3.d(r5)
            java.util.List r3 = defpackage.hf.b0(r3)
            java.util.ArrayList r3 = defpackage.gt0.V0(r4, r3)
            goto L7c
        L74:
            java.lang.Object r3 = r3.d(r5)
            java.util.List r3 = defpackage.hf.b0(r3)
        L7c:
            return r3
        L7d:
            int[] r4 = (int[]) r4
            if (r4 == 0) goto L90
            int[] r3 = i(r5)
            int r5 = r4.length
            int r2 = r5 + 1
            int[] r4 = java.util.Arrays.copyOf(r4, r2)
            java.lang.System.arraycopy(r3, r0, r4, r5, r1)
            goto L94
        L90:
            int[] r4 = i(r5)
        L94:
            return r4
        L95:
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto Laa
            float r3 = java.lang.Float.parseFloat(r5)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.util.List r3 = defpackage.hf.b0(r3)
            java.util.ArrayList r3 = defpackage.gt0.V0(r4, r3)
            goto Lb6
        Laa:
            float r3 = java.lang.Float.parseFloat(r5)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.util.List r3 = defpackage.hf.b0(r3)
        Lb6:
            return r3
        Lb7:
            float[] r4 = (float[]) r4
            if (r4 == 0) goto Lce
            float r3 = java.lang.Float.parseFloat(r5)
            float[] r5 = new float[r1]
            r5[r0] = r3
            int r3 = r4.length
            int r2 = r3 + 1
            float[] r4 = java.util.Arrays.copyOf(r4, r2)
            java.lang.System.arraycopy(r5, r0, r4, r3, r1)
            goto Ld6
        Lce:
            float r3 = java.lang.Float.parseFloat(r5)
            float[] r4 = new float[r1]
            r4[r0] = r3
        Ld6:
            return r4
        Ld7:
            java.util.List r4 = (java.util.List) r4
            q50 r3 = defpackage.fd4.k
            if (r4 == 0) goto Lea
            java.lang.Object r3 = r3.d(r5)
            java.util.List r3 = defpackage.hf.b0(r3)
            java.util.ArrayList r3 = defpackage.gt0.V0(r4, r3)
            goto Lf2
        Lea:
            java.lang.Object r3 = r3.d(r5)
            java.util.List r3 = defpackage.hf.b0(r3)
        Lf2:
            return r3
        Lf3:
            boolean[] r4 = (boolean[]) r4
            if (r4 == 0) goto L106
            boolean[] r3 = k(r5)
            int r5 = r4.length
            int r2 = r5 + 1
            boolean[] r4 = java.util.Arrays.copyOf(r4, r2)
            java.lang.System.arraycopy(r3, r0, r4, r5, r1)
            goto L10a
        L106:
            boolean[] r4 = k(r5)
        L10a:
            return r4
    }

    @Override // defpackage.fd4
    public final java.lang.Object d(java.lang.String r2) {
            r1 = this;
            int r1 = r1.q
            switch(r1) {
                case 0: goto L52;
                case 1: goto L47;
                case 2: goto L3c;
                case 3: goto L2f;
                case 4: goto L2a;
                case 5: goto L1f;
                case 6: goto L1a;
                case 7: goto Lf;
                case 8: goto La;
                default: goto L5;
            }
        L5:
            java.util.List r1 = defpackage.hf.b0(r2)
            return r1
        La:
            java.lang.String[] r1 = new java.lang.String[]{r2}
            return r1
        Lf:
            q50 r1 = defpackage.fd4.e
            java.lang.Object r1 = r1.d(r2)
            java.util.List r1 = defpackage.hf.b0(r1)
            return r1
        L1a:
            long[] r1 = j(r2)
            return r1
        L1f:
            q50 r1 = defpackage.fd4.b
            java.lang.Object r1 = r1.d(r2)
            java.util.List r1 = defpackage.hf.b0(r1)
            return r1
        L2a:
            int[] r1 = i(r2)
            return r1
        L2f:
            float r1 = java.lang.Float.parseFloat(r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.util.List r1 = defpackage.hf.b0(r1)
            return r1
        L3c:
            float r1 = java.lang.Float.parseFloat(r2)
            r2 = 1
            float[] r2 = new float[r2]
            r0 = 0
            r2[r0] = r1
            return r2
        L47:
            q50 r1 = defpackage.fd4.k
            java.lang.Object r1 = r1.d(r2)
            java.util.List r1 = defpackage.hf.b0(r1)
            return r1
        L52:
            boolean[] r1 = k(r2)
            return r1
    }

    @Override // defpackage.fd4
    public final void e(android.os.Bundle r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            int r1 = r1.q
            r0 = 0
            switch(r1) {
                case 0: goto La5;
                case 1: goto L92;
                case 2: goto L83;
                case 3: goto L70;
                case 4: goto L61;
                case 5: goto L52;
                case 6: goto L43;
                case 7: goto L30;
                case 8: goto L21;
                default: goto L6;
            }
        L6:
            java.util.List r4 = (java.util.List) r4
            r3.getClass()
            if (r4 == 0) goto L1d
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r1 = r4.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            r1.getClass()
            r2.putStringArray(r3, r1)
            goto L20
        L1d:
            r2.putString(r3, r0)
        L20:
            return
        L21:
            java.lang.String[] r4 = (java.lang.String[]) r4
            r3.getClass()
            if (r4 == 0) goto L2c
            r2.putStringArray(r3, r4)
            goto L2f
        L2c:
            r2.putString(r3, r0)
        L2f:
            return
        L30:
            java.util.List r4 = (java.util.List) r4
            r3.getClass()
            if (r4 == 0) goto L3f
            long[] r1 = defpackage.gt0.l1(r4)
            r2.putLongArray(r3, r1)
            goto L42
        L3f:
            r2.putString(r3, r0)
        L42:
            return
        L43:
            long[] r4 = (long[]) r4
            r3.getClass()
            if (r4 == 0) goto L4e
            r2.putLongArray(r3, r4)
            goto L51
        L4e:
            r2.putString(r3, r0)
        L51:
            return
        L52:
            java.util.List r4 = (java.util.List) r4
            r3.getClass()
            if (r4 == 0) goto L60
            int[] r1 = defpackage.gt0.j1(r4)
            r2.putIntArray(r3, r1)
        L60:
            return
        L61:
            int[] r4 = (int[]) r4
            r3.getClass()
            if (r4 == 0) goto L6c
            r2.putIntArray(r3, r4)
            goto L6f
        L6c:
            r2.putString(r3, r0)
        L6f:
            return
        L70:
            java.util.List r4 = (java.util.List) r4
            r3.getClass()
            if (r4 == 0) goto L7f
            float[] r1 = defpackage.gt0.i1(r4)
            r2.putFloatArray(r3, r1)
            goto L82
        L7f:
            r2.putString(r3, r0)
        L82:
            return
        L83:
            float[] r4 = (float[]) r4
            r3.getClass()
            if (r4 == 0) goto L8e
            r2.putFloatArray(r3, r4)
            goto L91
        L8e:
            r2.putString(r3, r0)
        L91:
            return
        L92:
            java.util.List r4 = (java.util.List) r4
            r3.getClass()
            if (r4 == 0) goto La1
            boolean[] r1 = defpackage.gt0.g1(r4)
            r2.putBooleanArray(r3, r1)
            goto La4
        La1:
            r2.putString(r3, r0)
        La4:
            return
        La5:
            boolean[] r4 = (boolean[]) r4
            r3.getClass()
            if (r4 == 0) goto Lb0
            r2.putBooleanArray(r3, r4)
            goto Lb3
        Lb0:
            r2.putString(r3, r0)
        Lb3:
            return
    }

    @Override // defpackage.dt0
    public final java.lang.Object g() {
            r2 = this;
            int r2 = r2.q
            r0 = 0
            yt1 r1 = defpackage.yt1.A
            switch(r2) {
                case 0: goto L19;
                case 1: goto L18;
                case 2: goto L15;
                case 3: goto L14;
                case 4: goto L11;
                case 5: goto L10;
                case 6: goto Ld;
                case 7: goto Lc;
                case 8: goto L9;
                default: goto L8;
            }
        L8:
            return r1
        L9:
            java.lang.String[] r2 = new java.lang.String[r0]
            return r2
        Lc:
            return r1
        Ld:
            long[] r2 = new long[r0]
            return r2
        L10:
            return r1
        L11:
            int[] r2 = new int[r0]
            return r2
        L14:
            return r1
        L15:
            float[] r2 = new float[r0]
            return r2
        L18:
            return r1
        L19:
            boolean[] r2 = new boolean[r0]
            return r2
    }

    @Override // defpackage.dt0
    public final java.util.List h(java.lang.Object r5) {
            r4 = this;
            int r4 = r4.q
            r0 = 0
            r1 = 0
            r2 = 10
            yt1 r3 = defpackage.yt1.A
            switch(r4) {
                case 0: goto L1ab;
                case 1: goto L181;
                case 2: goto L153;
                case 3: goto L129;
                case 4: goto Ld9;
                case 5: goto Laf;
                case 6: goto L81;
                case 7: goto L57;
                case 8: goto L37;
                default: goto Lb;
            }
        Lb:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L36
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = defpackage.ht0.v0(r5, r2)
            r3.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L1c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L36
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            java.lang.String r5 = android.net.Uri.encode(r5, r1)
            r5.getClass()
            r3.add(r5)
            goto L1c
        L36:
            return r3
        L37:
            java.lang.String[] r5 = (java.lang.String[]) r5
            if (r5 == 0) goto L56
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r5.length
            r3.<init>(r4)
            int r4 = r5.length
        L42:
            if (r0 >= r4) goto L56
            r2 = r5[r0]
            r2.getClass()
            java.lang.String r2 = android.net.Uri.encode(r2, r1)
            r2.getClass()
            r3.add(r2)
            int r0 = r0 + 1
            goto L42
        L56:
            return r3
        L57:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L80
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = defpackage.ht0.v0(r5, r2)
            r3.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L68:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L80
            java.lang.Object r5 = r4.next()
            java.lang.Number r5 = (java.lang.Number) r5
            long r0 = r5.longValue()
            java.lang.String r5 = java.lang.String.valueOf(r0)
            r3.add(r5)
            goto L68
        L80:
            return r3
        L81:
            long[] r5 = (long[]) r5
            if (r5 == 0) goto Lae
            java.util.List r4 = defpackage.fv.S0(r5)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = defpackage.ht0.v0(r4, r2)
            r3.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L96:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lae
            java.lang.Object r5 = r4.next()
            java.lang.Number r5 = (java.lang.Number) r5
            long r0 = r5.longValue()
            java.lang.String r5 = java.lang.String.valueOf(r0)
            r3.add(r5)
            goto L96
        Lae:
            return r3
        Laf:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto Ld8
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = defpackage.ht0.v0(r5, r2)
            r3.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        Lc0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Ld8
            java.lang.Object r5 = r4.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.add(r5)
            goto Lc0
        Ld8:
            return r3
        Ld9:
            int[] r5 = (int[]) r5
            if (r5 == 0) goto L128
            int r4 = r5.length
            if (r4 == 0) goto L102
            r1 = 1
            if (r4 == r1) goto Lf8
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r5.length
            r3.<init>(r4)
            int r4 = r5.length
        Lea:
            if (r0 >= r4) goto L102
            r1 = r5[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.add(r1)
            int r0 = r0 + 1
            goto Lea
        Lf8:
            r4 = r5[r0]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.List r3 = defpackage.hf.b0(r4)
        L102:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = defpackage.ht0.v0(r3, r2)
            r4.<init>(r5)
            java.util.Iterator r5 = r3.iterator()
        L10f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L127
            java.lang.Object r0 = r5.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4.add(r0)
            goto L10f
        L127:
            r3 = r4
        L128:
            return r3
        L129:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L152
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = defpackage.ht0.v0(r5, r2)
            r3.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L13a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L152
            java.lang.Object r5 = r4.next()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.add(r5)
            goto L13a
        L152:
            return r3
        L153:
            float[] r5 = (float[]) r5
            if (r5 == 0) goto L180
            java.util.List r4 = defpackage.fv.R0(r5)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = defpackage.ht0.v0(r4, r2)
            r3.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L168:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L180
            java.lang.Object r5 = r4.next()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.add(r5)
            goto L168
        L180:
            return r3
        L181:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L1aa
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = defpackage.ht0.v0(r5, r2)
            r3.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L192:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1aa
            java.lang.Object r5 = r4.next()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.add(r5)
            goto L192
        L1aa:
            return r3
        L1ab:
            boolean[] r5 = (boolean[]) r5
            if (r5 == 0) goto L1d8
            java.util.List r4 = defpackage.fv.U0(r5)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = defpackage.ht0.v0(r4, r2)
            r3.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L1c0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L1d8
            java.lang.Object r5 = r4.next()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.add(r5)
            goto L1c0
        L1d8:
            return r3
    }
}
