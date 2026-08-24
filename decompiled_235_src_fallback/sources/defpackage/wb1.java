package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wb1  reason: default package */
/* loaded from: classes.dex */
public final class wb1 implements defpackage.bk3 {
    public final /* synthetic */ int a;
    public final java.util.LinkedHashMap b;

    public wb1(int r3) {
            r2 = this;
            r0 = 5
            r2.a = r0
            r2.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 3
            if (r3 >= r1) goto Le
            int r3 = r3 + 1
            goto L1e
        Le:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 >= r1) goto L1b
            float r3 = (float) r3
            r1 = 1061158912(0x3f400000, float:0.75)
            float r3 = r3 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 + r1
            int r3 = (int) r3
            goto L1e
        L1b:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L1e:
            r0.<init>(r3)
            r2.b = r0
            return
    }

    public wb1(int r3, byte r4) {
            r2 = this;
            r2.a = r3
            switch(r3) {
                case 1: goto L56;
                case 2: goto L4b;
                case 3: goto L40;
                case 4: goto L31;
                case 5: goto L5;
                case 6: goto L5;
                case 7: goto L26;
                case 8: goto L1b;
                case 9: goto L10;
                default: goto L5;
            }
        L5:
            r2.<init>()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r2.b = r3
            return
        L10:
            r2.<init>()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r2.b = r3
            return
        L1b:
            r2.<init>()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r2.b = r3
            return
        L26:
            r2.<init>()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r2.b = r3
            return
        L31:
            r2.<init>()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r4 = 1
            r0 = 0
            r1 = 1061158912(0x3f400000, float:0.75)
            r3.<init>(r0, r1, r4)
            r2.b = r3
            return
        L40:
            r2.<init>()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r2.b = r3
            return
        L4b:
            r2.<init>()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r2.b = r3
            return
        L56:
            r2.<init>()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            r2.b = r3
            return
    }

    public wb1(defpackage.ps4 r2) {
            r1 = this;
            r0 = 6
            r1.a = r0
            r1.<init>()
            java.util.Map r2 = r2.A
            java.util.LinkedHashMap r2 = defpackage.c14.t0(r2)
            r1.b = r2
            return
    }

    @Override // defpackage.bk3
    public defpackage.ak3 a(defpackage.nj3 r9) {
            r8 = this;
            int r0 = r8.a
            r1 = 5
            r2 = 4
            r3 = 3
            java.util.LinkedHashMap r8 = r8.b
            r4 = 0
            r5 = 2
            r6 = 1
            r9.getClass()
            switch(r0) {
                case 1: goto L54;
                default: goto L10;
            }
        L10:
            java.lang.Object r0 = r8.get(r9)
            if (r0 != 0) goto L51
            int[] r0 = defpackage.x26.a
            int r7 = r9.ordinal()
            r0 = r0[r7]
            if (r0 == r6) goto L49
            if (r0 == r5) goto L43
            if (r0 == r3) goto L3a
            if (r0 == r2) goto L34
            if (r0 == r1) goto L2e
            hs1 r0 = new hs1
            r0.<init>(r9)
            goto L4e
        L2e:
            p90 r0 = new p90
            r0.<init>(r4)
            goto L4e
        L34:
            p90 r0 = new p90
            r0.<init>(r6)
            goto L4e
        L3a:
            c36 r0 = new c36
            r1 = 1059760811(0x3f2aaaab, float:0.6666667)
            r0.<init>(r1)
            goto L4e
        L43:
            c36 r0 = new c36
            r0.<init>()
            goto L4e
        L49:
            c36 r0 = new c36
            r0.<init>()
        L4e:
            r8.put(r9, r0)
        L51:
            ak3 r0 = (defpackage.ak3) r0
            return r0
        L54:
            java.lang.Object r0 = r8.get(r9)
            if (r0 != 0) goto La1
            int[] r0 = defpackage.ks1.a
            int r7 = r9.ordinal()
            r0 = r0[r7]
            if (r0 == r6) goto L99
            if (r0 == r5) goto L93
            if (r0 == r3) goto L8d
            if (r0 == r2) goto L82
            if (r0 == r1) goto L77
            hs1 r0 = new hs1
            hs1 r1 = new hs1
            r1.<init>(r9)
            r0.<init>(r1)
            goto L9e
        L77:
            hs1 r0 = new hs1
            p90 r1 = new p90
            r1.<init>(r4)
            r0.<init>(r1)
            goto L9e
        L82:
            hs1 r0 = new hs1
            p90 r1 = new p90
            r1.<init>(r6)
            r0.<init>(r1)
            goto L9e
        L8d:
            p90 r0 = new p90
            r0.<init>(r5)
            goto L9e
        L93:
            e60 r0 = new e60
            r0.<init>(r4)
            goto L9e
        L99:
            e60 r0 = new e60
            r0.<init>(r6)
        L9e:
            r8.put(r9, r0)
        La1:
            ak3 r0 = (defpackage.ak3) r0
            return r0
    }

    public void b(defpackage.ar0 r2, defpackage.qn2 r3) {
            r1 = this;
            r3.getClass()
            java.util.LinkedHashMap r1 = r1.b
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L14
            so7 r0 = new so7
            r0.<init>(r2, r3)
            r1.put(r2, r0)
            return
        L14:
            java.lang.String r1 = r2.b()
            r2 = 46
            java.lang.String r3 = "A `initializer` with the same `clazz` has already been added: "
            defpackage.e41.j(r3, r2, r1)
            return
    }

    public void c(defpackage.i64 r4) {
            r3 = this;
            r4.getClass()
            int r0 = r4.a
            int r1 = r4.b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.LinkedHashMap r3 = r3.b
            java.lang.Object r2 = r3.get(r0)
            if (r2 != 0) goto L1b
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            r3.put(r0, r2)
        L1b:
            java.util.TreeMap r2 = (java.util.TreeMap) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            boolean r3 = r2.containsKey(r3)
            if (r3 == 0) goto L4a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Overriding migration "
            r3.<init>(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r2.get(r0)
            r3.append(r0)
            java.lang.String r0 = " with "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "ROOM"
            android.util.Log.w(r0, r3)
        L4a:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2.put(r3, r4)
            return
    }

    public defpackage.m9 d() {
            r2 = this;
            java.util.LinkedHashMap r2 = r2.b
            java.util.Collection r2 = r2.values()
            r2.getClass()
            m9 r0 = new m9
            r1 = 0
            so7[] r1 = new defpackage.so7[r1]
            java.lang.Object[] r2 = r2.toArray(r1)
            so7[] r2 = (defpackage.so7[]) r2
            int r1 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)
            so7[] r2 = (defpackage.so7[]) r2
            r1 = 2
            r0.<init>(r2, r1)
            return r0
    }

    public defpackage.xb1 e() {
            r1 = this;
            xb1 r0 = new xb1
            java.util.LinkedHashMap r1 = r1.b
            r0.<init>(r1)
            defpackage.u24.H(r0)
            return r0
    }

    public java.util.Map f() {
            r1 = this;
            java.util.LinkedHashMap r1 = r1.b
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            return r1
        Lb:
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            return r1
    }

    public void g(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.util.LinkedHashMap r0 = r0.b
            r0.put(r1, r2)
            return
    }

    public void h(java.lang.Object r6, java.lang.String r7) {
            r5 = this;
            r7.getClass()
            if (r6 != 0) goto L8
            r6 = 0
            goto L186
        L8:
            java.lang.Class r0 = r6.getClass()
            ar0 r0 = defpackage.gh5.a(r0)
            java.lang.Class r1 = java.lang.Boolean.TYPE
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L186
            java.lang.Class r1 = java.lang.Byte.TYPE
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L186
            java.lang.Class r1 = java.lang.Integer.TYPE
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L186
            java.lang.Class r1 = java.lang.Long.TYPE
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L186
            java.lang.Class r1 = java.lang.Float.TYPE
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L186
            java.lang.Class r1 = java.lang.Double.TYPE
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L186
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L186
            java.lang.Class<java.lang.Boolean[]> r1 = java.lang.Boolean[].class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L186
            java.lang.Class<java.lang.Byte[]> r1 = java.lang.Byte[].class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L186
            java.lang.Class<java.lang.Integer[]> r1 = java.lang.Integer[].class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L186
            java.lang.Class<java.lang.Long[]> r1 = java.lang.Long[].class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L186
            java.lang.Class<java.lang.Float[]> r1 = java.lang.Float[].class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L186
            java.lang.Class<java.lang.Double[]> r1 = java.lang.Double[].class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L186
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Lba
            goto L186
        Lba:
            java.lang.Class<boolean[]> r1 = boolean[].class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r0.equals(r1)
            r2 = 0
            if (r1 == 0) goto Lde
            boolean[] r6 = (boolean[]) r6
            java.lang.String r0 = defpackage.ac1.a
            int r0 = r6.length
            java.lang.Boolean[] r1 = new java.lang.Boolean[r0]
        Lce:
            if (r2 >= r0) goto Ldb
            boolean r3 = r6[r2]
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lce
        Ldb:
            r6 = r1
            goto L186
        Lde:
            java.lang.Class<byte[]> r1 = byte[].class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Lfe
            byte[] r6 = (byte[]) r6
            java.lang.String r0 = defpackage.ac1.a
            int r0 = r6.length
            java.lang.Byte[] r1 = new java.lang.Byte[r0]
        Lf1:
            if (r2 >= r0) goto Ldb
            r3 = r6[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lf1
        Lfe:
            java.lang.Class<int[]> r1 = int[].class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L11e
            int[] r6 = (int[]) r6
            java.lang.String r0 = defpackage.ac1.a
            int r0 = r6.length
            java.lang.Integer[] r1 = new java.lang.Integer[r0]
        L111:
            if (r2 >= r0) goto Ldb
            r3 = r6[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L111
        L11e:
            java.lang.Class<long[]> r1 = long[].class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L13e
            long[] r6 = (long[]) r6
            java.lang.String r0 = defpackage.ac1.a
            int r0 = r6.length
            java.lang.Long[] r1 = new java.lang.Long[r0]
        L131:
            if (r2 >= r0) goto Ldb
            r3 = r6[r2]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L131
        L13e:
            java.lang.Class<float[]> r1 = float[].class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L15e
            float[] r6 = (float[]) r6
            java.lang.String r0 = defpackage.ac1.a
            int r0 = r6.length
            java.lang.Float[] r1 = new java.lang.Float[r0]
        L151:
            if (r2 >= r0) goto Ldb
            r3 = r6[r2]
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L151
        L15e:
            java.lang.Class<double[]> r1 = double[].class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L17e
            double[] r6 = (double[]) r6
            java.lang.String r0 = defpackage.ac1.a
            int r0 = r6.length
            java.lang.Double[] r1 = new java.lang.Double[r0]
        L171:
            if (r2 >= r0) goto Ldb
            r3 = r6[r2]
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L171
        L17e:
            java.lang.String r5 = "Key "
            java.lang.String r6 = " has invalid type "
            defpackage.fa6.f(r5, r7, r6, r0)
            return
        L186:
            java.util.LinkedHashMap r5 = r5.b
            r5.put(r7, r6)
            return
    }

    public void i(java.lang.String r1, defpackage.df3 r2) {
            r0 = this;
            r2.getClass()
            java.util.LinkedHashMap r0 = r0.b
            java.lang.Object r0 = r0.put(r1, r2)
            de3 r0 = (defpackage.de3) r0
            return
    }

    public void j(java.util.HashMap r3) {
            r2 = this;
            r3.getClass()
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            r2.h(r0, r1)
            goto Lb
        L25:
            return
    }

    public defpackage.jp6 k(defpackage.gw7 r1) {
            r0 = this;
            r1.getClass()
            java.util.LinkedHashMap r0 = r0.b
            java.lang.Object r0 = r0.remove(r1)
            jp6 r0 = (defpackage.jp6) r0
            return r0
    }

    public java.util.List l(java.lang.String r5) {
            r4 = this;
            r5.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.LinkedHashMap r4 = r4.b
            java.util.Set r1 = r4.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            gw7 r3 = (defpackage.gw7) r3
            java.lang.String r3 = r3.a
            boolean r3 = defpackage.nb3.k(r3, r5)
            if (r3 == 0) goto L12
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r0.put(r3, r2)
            goto L12
        L38:
            java.util.Set r5 = r0.keySet()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L42:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r5.next()
            gw7 r1 = (defpackage.gw7) r1
            r4.remove(r1)
            goto L42
        L52:
            java.util.Collection r4 = r0.values()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r4 = defpackage.gt0.k1(r4)
            return r4
    }

    public defpackage.jp6 m(defpackage.gw7 r2) {
            r1 = this;
            java.util.LinkedHashMap r1 = r1.b
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L10
            jp6 r0 = new jp6
            r0.<init>(r2)
            r1.put(r2, r0)
        L10:
            jp6 r0 = (defpackage.jp6) r0
            return r0
    }
}
