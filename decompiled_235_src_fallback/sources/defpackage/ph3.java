package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ph3  reason: default package */
/* loaded from: classes.dex */
public final class ph3 extends defpackage.jg3 {
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public int r;
    public float s;
    public float t;

    public ph3() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.e = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r2.f = r0
            r2.g = r0
            r2.h = r0
            r2.i = r0
            r2.j = r0
            r2.k = r0
            r2.l = r0
            r2.m = r0
            r2.n = r0
            r2.o = r0
            r2.p = r0
            r2.q = r0
            r1 = 0
            r2.r = r1
            r2.s = r0
            r0 = 0
            r2.t = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.d = r0
            return
    }

    @Override // defpackage.jg3
    public final void a(java.util.HashMap r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // defpackage.jg3
    public final defpackage.jg3 b() {
            r2 = this;
            ph3 r0 = new ph3
            r0.<init>()
            super.c(r2)
            int r1 = r2.e
            r0.e = r1
            int r1 = r2.r
            r0.r = r1
            float r1 = r2.s
            r0.s = r1
            float r1 = r2.t
            r0.t = r1
            float r1 = r2.q
            r0.q = r1
            float r1 = r2.f
            r0.f = r1
            float r1 = r2.g
            r0.g = r1
            float r1 = r2.h
            r0.h = r1
            float r1 = r2.k
            r0.k = r1
            float r1 = r2.i
            r0.i = r1
            float r1 = r2.j
            r0.j = r1
            float r1 = r2.l
            r0.l = r1
            float r1 = r2.m
            r0.m = r1
            float r1 = r2.n
            r0.n = r1
            float r1 = r2.o
            r0.o = r1
            float r2 = r2.p
            r0.p = r2
            return r0
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
            r0 = this;
            jg3 r0 = r0.b()
            return r0
    }

    @Override // defpackage.jg3
    public final void d(java.util.HashSet r4) {
            r3 = this;
            float r0 = r3.f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Ld
            java.lang.String r0 = "alpha"
            r4.add(r0)
        Ld:
            float r0 = r3.g
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "elevation"
            r4.add(r0)
        L1a:
            float r0 = r3.h
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L27
            java.lang.String r0 = "rotation"
            r4.add(r0)
        L27:
            float r0 = r3.i
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L34
            java.lang.String r0 = "rotationX"
            r4.add(r0)
        L34:
            float r0 = r3.j
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L41
            java.lang.String r0 = "rotationY"
            r4.add(r0)
        L41:
            float r0 = r3.n
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "translationX"
            r4.add(r0)
        L4e:
            float r0 = r3.o
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "translationY"
            r4.add(r0)
        L5b:
            float r0 = r3.p
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "translationZ"
            r4.add(r0)
        L68:
            float r0 = r3.k
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L75
            java.lang.String r0 = "transitionPathRotate"
            r4.add(r0)
        L75:
            float r0 = r3.l
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L82
            java.lang.String r0 = "scaleX"
            r4.add(r0)
        L82:
            float r0 = r3.m
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8f
            java.lang.String r0 = "scaleY"
            r4.add(r0)
        L8f:
            float r0 = r3.q
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L9c
            java.lang.String r0 = "progress"
            r4.add(r0)
        L9c:
            java.util.HashMap r0 = r3.d
            int r0 = r0.size()
            if (r0 <= 0) goto Lcc
            java.util.HashMap r3 = r3.d
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        Lae:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lcc
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "CUSTOM,"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.add(r0)
            goto Lae
        Lcc:
            return
    }

    @Override // defpackage.jg3
    public final void e(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            int[] r0 = defpackage.e75.h
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r0)
            android.util.SparseIntArray r7 = defpackage.oh3.a
            int r7 = r6.getIndexCount()
            r0 = 0
        Ld:
            if (r0 >= r7) goto L13b
            int r1 = r6.getIndex(r0)
            android.util.SparseIntArray r2 = defpackage.oh3.a
            int r3 = r2.get(r1)
            r4 = 3
            switch(r3) {
                case 1: goto L12f;
                case 2: goto L126;
                case 3: goto L1d;
                case 4: goto L11d;
                case 5: goto L114;
                case 6: goto L10b;
                case 7: goto L102;
                case 8: goto Lf9;
                case 9: goto Lf5;
                case 10: goto Lc7;
                case 11: goto L1d;
                case 12: goto Lbd;
                case 13: goto Lb3;
                case 14: goto La9;
                case 15: goto L9f;
                case 16: goto L95;
                case 17: goto L8b;
                case 18: goto L81;
                case 19: goto L67;
                case 20: goto L5d;
                case 21: goto L42;
                default: goto L1d;
            }
        L1d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "unused attribute 0x"
            r3.<init>(r4)
            java.lang.String r4 = java.lang.Integer.toHexString(r1)
            r3.append(r4)
            java.lang.String r4 = "   "
            r3.append(r4)
            int r1 = r2.get(r1)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "KeyTimeCycle"
            android.util.Log.e(r2, r1)
            goto L137
        L42:
            android.util.TypedValue r2 = r6.peekValue(r1)
            int r2 = r2.type
            float r3 = r5.t
            r4 = 5
            if (r2 != r4) goto L55
            float r1 = r6.getDimension(r1, r3)
            r5.t = r1
            goto L137
        L55:
            float r1 = r6.getFloat(r1, r3)
            r5.t = r1
            goto L137
        L5d:
            float r2 = r5.s
            float r1 = r6.getFloat(r1, r2)
            r5.s = r1
            goto L137
        L67:
            android.util.TypedValue r2 = r6.peekValue(r1)
            int r2 = r2.type
            if (r2 != r4) goto L77
            r6.getString(r1)
            r1 = 7
            r5.r = r1
            goto L137
        L77:
            int r2 = r5.r
            int r1 = r6.getInt(r1, r2)
            r5.r = r1
            goto L137
        L81:
            float r2 = r5.q
            float r1 = r6.getFloat(r1, r2)
            r5.q = r1
            goto L137
        L8b:
            float r2 = r5.p
            float r1 = r6.getDimension(r1, r2)
            r5.p = r1
            goto L137
        L95:
            float r2 = r5.o
            float r1 = r6.getDimension(r1, r2)
            r5.o = r1
            goto L137
        L9f:
            float r2 = r5.n
            float r1 = r6.getDimension(r1, r2)
            r5.n = r1
            goto L137
        La9:
            float r2 = r5.m
            float r1 = r6.getFloat(r1, r2)
            r5.m = r1
            goto L137
        Lb3:
            int r2 = r5.e
            int r1 = r6.getInteger(r1, r2)
            r5.e = r1
            goto L137
        Lbd:
            int r2 = r5.a
            int r1 = r6.getInt(r1, r2)
            r5.a = r1
            goto L137
        Lc7:
            boolean r2 = androidx.constraintlayout.motion.widget.MotionLayout.t1
            if (r2 == 0) goto Ldd
            int r2 = r5.b
            int r2 = r6.getResourceId(r1, r2)
            r5.b = r2
            r3 = -1
            if (r2 != r3) goto L137
            java.lang.String r1 = r6.getString(r1)
            r5.c = r1
            goto L137
        Ldd:
            android.util.TypedValue r2 = r6.peekValue(r1)
            int r2 = r2.type
            if (r2 != r4) goto Lec
            java.lang.String r1 = r6.getString(r1)
            r5.c = r1
            goto L137
        Lec:
            int r2 = r5.b
            int r1 = r6.getResourceId(r1, r2)
            r5.b = r1
            goto L137
        Lf5:
            r6.getString(r1)
            goto L137
        Lf9:
            float r2 = r5.k
            float r1 = r6.getFloat(r1, r2)
            r5.k = r1
            goto L137
        L102:
            float r2 = r5.l
            float r1 = r6.getFloat(r1, r2)
            r5.l = r1
            goto L137
        L10b:
            float r2 = r5.j
            float r1 = r6.getFloat(r1, r2)
            r5.j = r1
            goto L137
        L114:
            float r2 = r5.i
            float r1 = r6.getFloat(r1, r2)
            r5.i = r1
            goto L137
        L11d:
            float r2 = r5.h
            float r1 = r6.getFloat(r1, r2)
            r5.h = r1
            goto L137
        L126:
            float r2 = r5.g
            float r1 = r6.getDimension(r1, r2)
            r5.g = r1
            goto L137
        L12f:
            float r2 = r5.f
            float r1 = r6.getFloat(r1, r2)
            r5.f = r1
        L137:
            int r0 = r0 + 1
            goto Ld
        L13b:
            return
    }

    @Override // defpackage.jg3
    public final void f(java.util.HashMap r4) {
            r3 = this;
            int r0 = r3.e
            r1 = -1
            if (r0 != r1) goto L7
            goto L119
        L7:
            float r0 = r3.f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L1a
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "alpha"
            r4.put(r1, r0)
        L1a:
            float r0 = r3.g
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L2d
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "elevation"
            r4.put(r1, r0)
        L2d:
            float r0 = r3.h
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L40
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotation"
            r4.put(r1, r0)
        L40:
            float r0 = r3.i
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L53
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotationX"
            r4.put(r1, r0)
        L53:
            float r0 = r3.j
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L66
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "rotationY"
            r4.put(r1, r0)
        L66:
            float r0 = r3.n
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L79
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationX"
            r4.put(r1, r0)
        L79:
            float r0 = r3.o
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8c
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationY"
            r4.put(r1, r0)
        L8c:
            float r0 = r3.p
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L9f
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationZ"
            r4.put(r1, r0)
        L9f:
            float r0 = r3.k
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb2
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "transitionPathRotate"
            r4.put(r1, r0)
        Lb2:
            float r0 = r3.l
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lc5
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleX"
            r4.put(r1, r0)
        Lc5:
            float r0 = r3.l
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Ld8
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleY"
            r4.put(r1, r0)
        Ld8:
            float r0 = r3.q
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Leb
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "progress"
            r4.put(r1, r0)
        Leb:
            java.util.HashMap r0 = r3.d
            int r0 = r0.size()
            if (r0 <= 0) goto L119
            java.util.HashMap r0 = r3.d
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lfd:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L119
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "CUSTOM,"
            java.lang.String r1 = defpackage.i61.m(r2, r1)
            int r2 = r3.e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.put(r1, r2)
            goto Lfd
        L119:
            return
    }

    public final void g(java.util.HashMap r12) {
            r11 = this;
            java.util.Set r0 = r12.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L222
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r12.get(r1)
            r3 = r2
            wp7 r3 = (defpackage.wp7) r3
            if (r3 != 0) goto L1e
            goto L8
        L1e:
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 1
            r5 = 0
            r6 = 2
            r7 = 7
            if (r2 == 0) goto L5b
            java.lang.String r1 = r1.substring(r7)
            java.util.HashMap r2 = r11.d
            java.lang.Object r1 = r2.get(r1)
            j11 r1 = (defpackage.j11) r1
            if (r1 == 0) goto L8
            tp7 r3 = (defpackage.tp7) r3
            int r2 = r11.a
            float r7 = r11.s
            int r8 = r11.r
            float r9 = r11.t
            android.util.SparseArray r10 = r3.l
            r10.append(r2, r1)
            android.util.SparseArray r1 = r3.m
            float[] r6 = new float[r6]
            r6[r5] = r7
            r6[r4] = r9
            r1.append(r2, r6)
            int r1 = r3.b
            int r1 = java.lang.Math.max(r1, r8)
            r3.b = r1
            goto L8
        L5b:
            int r2 = r1.hashCode()
            r8 = -1
            switch(r2) {
                case -1249320806: goto Le6;
                case -1249320805: goto Ldc;
                case -1225497657: goto Ld1;
                case -1225497656: goto Lc6;
                case -1225497655: goto Lbb;
                case -1001078227: goto Lb0;
                case -908189618: goto La5;
                case -908189617: goto L9a;
                case -40300674: goto L8d;
                case -4379043: goto L80;
                case 37232917: goto L73;
                case 92909918: goto L66;
                default: goto L63;
            }
        L63:
            r4 = r8
            goto Lf1
        L66:
            java.lang.String r2 = "alpha"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L6f
            goto L63
        L6f:
            r4 = 11
            goto Lf1
        L73:
            java.lang.String r2 = "transitionPathRotate"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L7c
            goto L63
        L7c:
            r4 = 10
            goto Lf1
        L80:
            java.lang.String r2 = "elevation"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L89
            goto L63
        L89:
            r4 = 9
            goto Lf1
        L8d:
            java.lang.String r2 = "rotation"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L96
            goto L63
        L96:
            r4 = 8
            goto Lf1
        L9a:
            java.lang.String r2 = "scaleY"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto La3
            goto L63
        La3:
            r4 = r7
            goto Lf1
        La5:
            java.lang.String r2 = "scaleX"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Lae
            goto L63
        Lae:
            r4 = 6
            goto Lf1
        Lb0:
            java.lang.String r2 = "progress"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Lb9
            goto L63
        Lb9:
            r4 = 5
            goto Lf1
        Lbb:
            java.lang.String r2 = "translationZ"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Lc4
            goto L63
        Lc4:
            r4 = 4
            goto Lf1
        Lc6:
            java.lang.String r2 = "translationY"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Lcf
            goto L63
        Lcf:
            r4 = 3
            goto Lf1
        Ld1:
            java.lang.String r2 = "translationX"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Lda
            goto L63
        Lda:
            r4 = r6
            goto Lf1
        Ldc:
            java.lang.String r2 = "rotationY"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Lf1
            goto L63
        Le6:
            java.lang.String r2 = "rotationX"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto Lf0
            goto L63
        Lf0:
            r4 = r5
        Lf1:
            switch(r4) {
                case 0: goto L20b;
                case 1: goto L1f4;
                case 2: goto L1dd;
                case 3: goto L1c6;
                case 4: goto L1af;
                case 5: goto L198;
                case 6: goto L181;
                case 7: goto L16a;
                case 8: goto L153;
                case 9: goto L13c;
                case 10: goto L125;
                case 11: goto L10e;
                default: goto Lf4;
            }
        Lf4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "KeyTimeCycles"
            android.util.Log.e(r2, r1)
            goto L8
        L10e:
            float r1 = r11.f
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r11.a
            float r5 = r11.f
            float r6 = r11.s
            int r7 = r11.r
            float r8 = r11.t
            r3.c(r4, r5, r6, r7, r8)
            goto L8
        L125:
            float r1 = r11.k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r11.a
            float r5 = r11.k
            float r6 = r11.s
            int r7 = r11.r
            float r8 = r11.t
            r3.c(r4, r5, r6, r7, r8)
            goto L8
        L13c:
            float r1 = r11.g
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r11.a
            float r5 = r11.g
            float r6 = r11.s
            int r7 = r11.r
            float r8 = r11.t
            r3.c(r4, r5, r6, r7, r8)
            goto L8
        L153:
            float r1 = r11.h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r11.a
            float r5 = r11.h
            float r6 = r11.s
            int r7 = r11.r
            float r8 = r11.t
            r3.c(r4, r5, r6, r7, r8)
            goto L8
        L16a:
            float r1 = r11.m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r11.a
            float r5 = r11.m
            float r6 = r11.s
            int r7 = r11.r
            float r8 = r11.t
            r3.c(r4, r5, r6, r7, r8)
            goto L8
        L181:
            float r1 = r11.l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r11.a
            float r5 = r11.l
            float r6 = r11.s
            int r7 = r11.r
            float r8 = r11.t
            r3.c(r4, r5, r6, r7, r8)
            goto L8
        L198:
            float r1 = r11.q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r11.a
            float r5 = r11.q
            float r6 = r11.s
            int r7 = r11.r
            float r8 = r11.t
            r3.c(r4, r5, r6, r7, r8)
            goto L8
        L1af:
            float r1 = r11.p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r11.a
            float r5 = r11.p
            float r6 = r11.s
            int r7 = r11.r
            float r8 = r11.t
            r3.c(r4, r5, r6, r7, r8)
            goto L8
        L1c6:
            float r1 = r11.o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r11.a
            float r5 = r11.o
            float r6 = r11.s
            int r7 = r11.r
            float r8 = r11.t
            r3.c(r4, r5, r6, r7, r8)
            goto L8
        L1dd:
            float r1 = r11.n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r11.a
            float r5 = r11.n
            float r6 = r11.s
            int r7 = r11.r
            float r8 = r11.t
            r3.c(r4, r5, r6, r7, r8)
            goto L8
        L1f4:
            float r1 = r11.j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r11.a
            float r5 = r11.j
            float r6 = r11.s
            int r7 = r11.r
            float r8 = r11.t
            r3.c(r4, r5, r6, r7, r8)
            goto L8
        L20b:
            float r1 = r11.i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r4 = r11.a
            float r5 = r11.i
            float r6 = r11.s
            int r7 = r11.r
            float r8 = r11.t
            r3.c(r4, r5, r6, r7, r8)
            goto L8
        L222:
            return
    }
}
