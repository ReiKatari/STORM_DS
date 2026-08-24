package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: za3  reason: default package */
/* loaded from: classes.dex */
public final class za3 extends defpackage.dt0 {
    public final /* synthetic */ int q;

    public /* synthetic */ za3(boolean r1, int r2) {
            r0 = this;
            r0.q = r2
            r0.<init>(r1)
            return
    }

    @Override // defpackage.fd4
    public final java.lang.Object a(android.os.Bundle r5, java.lang.String r6) {
            r4 = this;
            int r4 = r4.q
            q50 r0 = defpackage.fd4.n
            r1 = 0
            switch(r4) {
                case 0: goto L91;
                case 1: goto L75;
                case 2: goto L42;
                default: goto L8;
            }
        L8:
            boolean r4 = defpackage.i61.C(r5, r6, r6)
            if (r4 == 0) goto L41
            boolean r4 = defpackage.uj2.X(r5, r6)
            if (r4 != 0) goto L41
            java.lang.String[] r4 = defpackage.uj2.Q(r5, r6)
            java.util.List r4 = defpackage.fv.T0(r4)
            java.util.ArrayList r1 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.ht0.v0(r4, r5)
            r1.<init>(r5)
            java.util.Iterator r4 = r4.iterator()
        L2b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L41
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.d(r5)
            java.lang.String r5 = (java.lang.String) r5
            r1.add(r5)
            goto L2b
        L41:
            return r1
        L42:
            boolean r4 = defpackage.i61.C(r5, r6, r6)
            if (r4 == 0) goto L74
            boolean r4 = defpackage.uj2.X(r5, r6)
            if (r4 != 0) goto L74
            java.lang.String[] r4 = defpackage.uj2.Q(r5, r6)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r4.length
            r5.<init>(r6)
            int r6 = r4.length
            r1 = 0
            r2 = r1
        L5b:
            if (r2 >= r6) goto L6b
            r3 = r4[r2]
            java.lang.Object r3 = r0.d(r3)
            java.lang.String r3 = (java.lang.String) r3
            r5.add(r3)
            int r2 = r2 + 1
            goto L5b
        L6b:
            java.lang.String[] r4 = new java.lang.String[r1]
            java.lang.Object[] r4 = r5.toArray(r4)
            r1 = r4
            java.lang.String[] r1 = (java.lang.String[]) r1
        L74:
            return r1
        L75:
            boolean r4 = defpackage.i61.C(r5, r6, r6)
            if (r4 == 0) goto L90
            boolean r4 = defpackage.uj2.X(r5, r6)
            if (r4 != 0) goto L90
            double[] r4 = r5.getDoubleArray(r6)
            if (r4 == 0) goto L8c
            java.util.List r1 = defpackage.fv.Q0(r4)
            goto L90
        L8c:
            defpackage.xk2.B(r6)
            throw r1
        L90:
            return r1
        L91:
            boolean r4 = defpackage.i61.C(r5, r6, r6)
            if (r4 == 0) goto La9
            boolean r4 = defpackage.uj2.X(r5, r6)
            if (r4 != 0) goto La9
            double[] r4 = r5.getDoubleArray(r6)
            if (r4 == 0) goto La5
            r1 = r4
            goto La9
        La5:
            defpackage.xk2.B(r6)
            throw r1
        La9:
            return r1
    }

    @Override // defpackage.fd4
    public final java.lang.String b() {
            r0 = this;
            int r0 = r0.q
            switch(r0) {
                case 0: goto Le;
                case 1: goto Lb;
                case 2: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "List<String?>"
            return r0
        L8:
            java.lang.String r0 = "string_nullable[]"
            return r0
        Lb:
            java.lang.String r0 = "List<Double>"
            return r0
        Le:
            java.lang.String r0 = "double[]"
            return r0
    }

    @Override // defpackage.fd4
    public final java.lang.Object c(java.lang.Object r6, java.lang.String r7) {
            r5 = this;
            int r5 = r5.q
            q50 r0 = defpackage.fd4.n
            r1 = 1
            r2 = 0
            switch(r5) {
                case 0: goto L61;
                case 1: goto L3f;
                case 2: goto L23;
                default: goto L9;
            }
        L9:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L1a
            java.lang.Object r5 = r0.d(r7)
            java.util.List r5 = defpackage.hf.b0(r5)
            java.util.ArrayList r5 = defpackage.gt0.V0(r6, r5)
            goto L22
        L1a:
            java.lang.Object r5 = r0.d(r7)
            java.util.List r5 = defpackage.hf.b0(r5)
        L22:
            return r5
        L23:
            java.lang.String[] r6 = (java.lang.String[]) r6
            if (r6 == 0) goto L36
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.Object r7 = r0.d(r7)
            r5[r2] = r7
            java.lang.Object[] r5 = defpackage.fv.N0(r6, r5)
            java.lang.String[] r5 = (java.lang.String[]) r5
            goto L3e
        L36:
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.Object r6 = r0.d(r7)
            r5[r2] = r6
        L3e:
            return r5
        L3f:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L54
            double r0 = java.lang.Double.parseDouble(r7)
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            java.util.List r5 = defpackage.hf.b0(r5)
            java.util.ArrayList r5 = defpackage.gt0.V0(r6, r5)
            goto L60
        L54:
            double r5 = java.lang.Double.parseDouble(r7)
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            java.util.List r5 = defpackage.hf.b0(r5)
        L60:
            return r5
        L61:
            double[] r6 = (double[]) r6
            if (r6 == 0) goto L78
            double r3 = java.lang.Double.parseDouble(r7)
            double[] r5 = new double[r1]
            r5[r2] = r3
            int r7 = r6.length
            int r0 = r7 + 1
            double[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.lang.System.arraycopy(r5, r2, r6, r7, r1)
            goto L81
        L78:
            double r5 = java.lang.Double.parseDouble(r7)
            double[] r7 = new double[r1]
            r7[r2] = r5
            r6 = r7
        L81:
            return r6
    }

    @Override // defpackage.fd4
    public final java.lang.Object d(java.lang.String r4) {
            r3 = this;
            int r3 = r3.q
            r0 = 0
            r1 = 1
            q50 r2 = defpackage.fd4.n
            switch(r3) {
                case 0: goto L28;
                case 1: goto L1b;
                case 2: goto L12;
                default: goto L9;
            }
        L9:
            java.lang.Object r3 = r2.d(r4)
            java.util.List r3 = defpackage.hf.b0(r3)
            return r3
        L12:
            java.lang.String[] r3 = new java.lang.String[r1]
            java.lang.Object r4 = r2.d(r4)
            r3[r0] = r4
            return r3
        L1b:
            double r3 = java.lang.Double.parseDouble(r4)
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            java.util.List r3 = defpackage.hf.b0(r3)
            return r3
        L28:
            double r3 = java.lang.Double.parseDouble(r4)
            double[] r1 = new double[r1]
            r1[r0] = r3
            return r1
    }

    @Override // defpackage.fd4
    public final void e(android.os.Bundle r6, java.lang.String r7, java.lang.Object r8) {
            r5 = this;
            int r5 = r5.q
            java.lang.String r0 = "null"
            r1 = 0
            r2 = 0
            switch(r5) {
                case 0: goto La3;
                case 1: goto L74;
                case 2: goto L45;
                default: goto L9;
            }
        L9:
            java.util.List r8 = (java.util.List) r8
            r7.getClass()
            if (r8 != 0) goto L14
            r6.putString(r7, r2)
            goto L44
        L14:
            java.util.ArrayList r5 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ht0.v0(r8, r2)
            r5.<init>(r2)
            java.util.Iterator r8 = r8.iterator()
        L23:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r8.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L32
            r2 = r0
        L32:
            r5.add(r2)
            goto L23
        L36:
            java.lang.String[] r8 = new java.lang.String[r1]
            java.lang.Object[] r5 = r5.toArray(r8)
            java.lang.String[] r5 = (java.lang.String[]) r5
            r5.getClass()
            r6.putStringArray(r7, r5)
        L44:
            return
        L45:
            java.lang.String[] r8 = (java.lang.String[]) r8
            r7.getClass()
            if (r8 != 0) goto L50
            r6.putString(r7, r2)
            goto L73
        L50:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r2 = r8.length
            r5.<init>(r2)
            int r2 = r8.length
            r3 = r1
        L58:
            if (r3 >= r2) goto L65
            r4 = r8[r3]
            if (r4 != 0) goto L5f
            r4 = r0
        L5f:
            r5.add(r4)
            int r3 = r3 + 1
            goto L58
        L65:
            java.lang.String[] r8 = new java.lang.String[r1]
            java.lang.Object[] r5 = r5.toArray(r8)
            java.lang.String[] r5 = (java.lang.String[]) r5
            r5.getClass()
            r6.putStringArray(r7, r5)
        L73:
            return
        L74:
            java.util.List r8 = (java.util.List) r8
            r7.getClass()
            if (r8 != 0) goto L7f
            r6.putString(r7, r2)
            goto La2
        L7f:
            int r5 = r8.size()
            double[] r5 = new double[r5]
            java.util.Iterator r8 = r8.iterator()
        L89:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L9f
            java.lang.Object r0 = r8.next()
            java.lang.Number r0 = (java.lang.Number) r0
            double r2 = r0.doubleValue()
            int r0 = r1 + 1
            r5[r1] = r2
            r1 = r0
            goto L89
        L9f:
            r6.putDoubleArray(r7, r5)
        La2:
            return
        La3:
            double[] r8 = (double[]) r8
            r7.getClass()
            if (r8 != 0) goto Lae
            r6.putString(r7, r2)
            goto Lb1
        Lae:
            r6.putDoubleArray(r7, r8)
        Lb1:
            return
    }

    @Override // defpackage.dt0
    public final java.lang.Object g() {
            r2 = this;
            int r2 = r2.q
            r0 = 0
            yt1 r1 = defpackage.yt1.A
            switch(r2) {
                case 0: goto Ld;
                case 1: goto Lc;
                case 2: goto L9;
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
            double[] r2 = new double[r0]
            return r2
    }

    @Override // defpackage.dt0
    public final java.util.List h(java.lang.Object r6) {
            r5 = this;
            int r5 = r5.q
            java.lang.String r0 = "null"
            r1 = 0
            r2 = 10
            yt1 r3 = defpackage.yt1.A
            switch(r5) {
                case 0: goto L85;
                case 1: goto L5b;
                case 2: goto L39;
                default: goto Lc;
            }
        Lc:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L38
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = defpackage.ht0.v0(r6, r2)
            r3.<init>(r5)
            java.util.Iterator r5 = r6.iterator()
        L1d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L38
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L33
            java.lang.String r6 = android.net.Uri.encode(r6, r1)
            r6.getClass()
            goto L34
        L33:
            r6 = r0
        L34:
            r3.add(r6)
            goto L1d
        L38:
            return r3
        L39:
            java.lang.String[] r6 = (java.lang.String[]) r6
            if (r6 == 0) goto L5a
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = r6.length
            r3.<init>(r5)
            int r5 = r6.length
            r2 = 0
        L45:
            if (r2 >= r5) goto L5a
            r4 = r6[r2]
            if (r4 == 0) goto L53
            java.lang.String r4 = android.net.Uri.encode(r4, r1)
            r4.getClass()
            goto L54
        L53:
            r4 = r0
        L54:
            r3.add(r4)
            int r2 = r2 + 1
            goto L45
        L5a:
            return r3
        L5b:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L84
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = defpackage.ht0.v0(r6, r2)
            r3.<init>(r5)
            java.util.Iterator r5 = r6.iterator()
        L6c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L84
            java.lang.Object r6 = r5.next()
            java.lang.Number r6 = (java.lang.Number) r6
            double r0 = r6.doubleValue()
            java.lang.String r6 = java.lang.String.valueOf(r0)
            r3.add(r6)
            goto L6c
        L84:
            return r3
        L85:
            double[] r6 = (double[]) r6
            if (r6 == 0) goto Lb2
            java.util.List r5 = defpackage.fv.Q0(r6)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r6 = defpackage.ht0.v0(r5, r2)
            r3.<init>(r6)
            java.util.Iterator r5 = r5.iterator()
        L9a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lb2
            java.lang.Object r6 = r5.next()
            java.lang.Number r6 = (java.lang.Number) r6
            double r0 = r6.doubleValue()
            java.lang.String r6 = java.lang.String.valueOf(r0)
            r3.add(r6)
            goto L9a
        Lb2:
            return r3
    }
}
