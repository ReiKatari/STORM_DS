package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mg3  reason: default package */
/* loaded from: classes.dex */
public final class mg3 extends defpackage.jg3 {
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
    public float r;
    public float s;

    public mg3() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.e = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r1.f = r0
            r1.g = r0
            r1.h = r0
            r1.i = r0
            r1.j = r0
            r1.k = r0
            r1.l = r0
            r1.m = r0
            r1.n = r0
            r1.o = r0
            r1.p = r0
            r1.q = r0
            r1.r = r0
            r1.s = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.d = r0
            return
    }

    @Override // defpackage.jg3
    public final void a(java.util.HashMap r7) {
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e2
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            qp7 r2 = (defpackage.qp7) r2
            if (r2 != 0) goto L1d
            goto L8
        L1d:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L3e
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap r3 = r6.d
            java.lang.Object r1 = r3.get(r1)
            j11 r1 = (defpackage.j11) r1
            if (r1 == 0) goto L8
            np7 r2 = (defpackage.np7) r2
            int r3 = r6.a
            android.util.SparseArray r2 = r2.f
            r2.append(r3, r1)
            goto L8
        L3e:
            int r3 = r1.hashCode()
            r5 = -1
            switch(r3) {
                case -1249320806: goto Le4;
                case -1249320805: goto Ld8;
                case -1225497657: goto Lcc;
                case -1225497656: goto Lc0;
                case -1225497655: goto Lb5;
                case -1001078227: goto Laa;
                case -908189618: goto L9f;
                case -908189617: goto L96;
                case -760884510: goto L8a;
                case -760884509: goto L7d;
                case -40300674: goto L70;
                case -4379043: goto L63;
                case 37232917: goto L56;
                case 92909918: goto L49;
                default: goto L46;
            }
        L46:
            r4 = r5
            goto Lef
        L49:
            java.lang.String r3 = "alpha"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L52
            goto L46
        L52:
            r4 = 13
            goto Lef
        L56:
            java.lang.String r3 = "transitionPathRotate"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L5f
            goto L46
        L5f:
            r4 = 12
            goto Lef
        L63:
            java.lang.String r3 = "elevation"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L6c
            goto L46
        L6c:
            r4 = 11
            goto Lef
        L70:
            java.lang.String r3 = "rotation"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L79
            goto L46
        L79:
            r4 = 10
            goto Lef
        L7d:
            java.lang.String r3 = "transformPivotY"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L86
            goto L46
        L86:
            r4 = 9
            goto Lef
        L8a:
            java.lang.String r3 = "transformPivotX"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L93
            goto L46
        L93:
            r4 = 8
            goto Lef
        L96:
            java.lang.String r3 = "scaleY"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lef
            goto L46
        L9f:
            java.lang.String r3 = "scaleX"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto La8
            goto L46
        La8:
            r4 = 6
            goto Lef
        Laa:
            java.lang.String r3 = "progress"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lb3
            goto L46
        Lb3:
            r4 = 5
            goto Lef
        Lb5:
            java.lang.String r3 = "translationZ"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lbe
            goto L46
        Lbe:
            r4 = 4
            goto Lef
        Lc0:
            java.lang.String r3 = "translationY"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lca
            goto L46
        Lca:
            r4 = 3
            goto Lef
        Lcc:
            java.lang.String r3 = "translationX"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Ld6
            goto L46
        Ld6:
            r4 = 2
            goto Lef
        Ld8:
            java.lang.String r3 = "rotationY"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Le2
            goto L46
        Le2:
            r4 = 1
            goto Lef
        Le4:
            java.lang.String r3 = "rotationX"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lee
            goto L46
        Lee:
            r4 = 0
        Lef:
            switch(r4) {
                case 0: goto L1d1;
                case 1: goto L1c0;
                case 2: goto L1af;
                case 3: goto L19e;
                case 4: goto L18d;
                case 5: goto L17c;
                case 6: goto L16b;
                case 7: goto L15a;
                case 8: goto L149;
                case 9: goto L138;
                case 10: goto L127;
                case 11: goto L116;
                case 12: goto L105;
                case 13: goto Lf4;
                default: goto Lf2;
            }
        Lf2:
            goto L8
        Lf4:
            float r1 = r6.f
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.a
            float r3 = r6.f
            r2.b(r1, r3)
            goto L8
        L105:
            float r1 = r6.m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.a
            float r3 = r6.m
            r2.b(r1, r3)
            goto L8
        L116:
            float r1 = r6.g
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.a
            float r3 = r6.g
            r2.b(r1, r3)
            goto L8
        L127:
            float r1 = r6.h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.a
            float r3 = r6.h
            r2.b(r1, r3)
            goto L8
        L138:
            float r1 = r6.j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.a
            float r3 = r6.l
            r2.b(r1, r3)
            goto L8
        L149:
            float r1 = r6.i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.a
            float r3 = r6.k
            r2.b(r1, r3)
            goto L8
        L15a:
            float r1 = r6.o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.a
            float r3 = r6.o
            r2.b(r1, r3)
            goto L8
        L16b:
            float r1 = r6.n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.a
            float r3 = r6.n
            r2.b(r1, r3)
            goto L8
        L17c:
            float r1 = r6.s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.a
            float r3 = r6.s
            r2.b(r1, r3)
            goto L8
        L18d:
            float r1 = r6.r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.a
            float r3 = r6.r
            r2.b(r1, r3)
            goto L8
        L19e:
            float r1 = r6.q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.a
            float r3 = r6.q
            r2.b(r1, r3)
            goto L8
        L1af:
            float r1 = r6.p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.a
            float r3 = r6.p
            r2.b(r1, r3)
            goto L8
        L1c0:
            float r1 = r6.j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.a
            float r3 = r6.j
            r2.b(r1, r3)
            goto L8
        L1d1:
            float r1 = r6.i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L8
            int r1 = r6.a
            float r3 = r6.i
            r2.b(r1, r3)
            goto L8
        L1e2:
            return
    }

    @Override // defpackage.jg3
    public final defpackage.jg3 b() {
            r2 = this;
            mg3 r0 = new mg3
            r0.<init>()
            super.c(r2)
            int r1 = r2.e
            r0.e = r1
            float r1 = r2.f
            r0.f = r1
            float r1 = r2.g
            r0.g = r1
            float r1 = r2.h
            r0.h = r1
            float r1 = r2.i
            r0.i = r1
            float r1 = r2.j
            r0.j = r1
            float r1 = r2.k
            r0.k = r1
            float r1 = r2.l
            r0.l = r1
            float r1 = r2.m
            r0.m = r1
            float r1 = r2.n
            r0.n = r1
            float r1 = r2.o
            r0.o = r1
            float r1 = r2.p
            r0.p = r1
            float r1 = r2.q
            r0.q = r1
            float r1 = r2.r
            r0.r = r1
            float r2 = r2.s
            r0.s = r2
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
            float r0 = r3.k
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "transformPivotX"
            r4.add(r0)
        L4e:
            float r0 = r3.l
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "transformPivotY"
            r4.add(r0)
        L5b:
            float r0 = r3.p
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "translationX"
            r4.add(r0)
        L68:
            float r0 = r3.q
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L75
            java.lang.String r0 = "translationY"
            r4.add(r0)
        L75:
            float r0 = r3.r
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L82
            java.lang.String r0 = "translationZ"
            r4.add(r0)
        L82:
            float r0 = r3.m
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8f
            java.lang.String r0 = "transitionPathRotate"
            r4.add(r0)
        L8f:
            float r0 = r3.n
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L9c
            java.lang.String r0 = "scaleX"
            r4.add(r0)
        L9c:
            float r0 = r3.o
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto La9
            java.lang.String r0 = "scaleY"
            r4.add(r0)
        La9:
            float r0 = r3.s
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb6
            java.lang.String r0 = "progress"
            r4.add(r0)
        Lb6:
            java.util.HashMap r0 = r3.d
            int r0 = r0.size()
            if (r0 <= 0) goto Le6
            java.util.HashMap r3 = r3.d
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        Lc8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Le6
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "CUSTOM,"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.add(r0)
            goto Lc8
        Le6:
            return
    }

    @Override // defpackage.jg3
    public final void e(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            int[] r0 = defpackage.e75.e
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r0)
            android.util.SparseIntArray r7 = defpackage.lg3.a
            int r7 = r6.getIndexCount()
            r0 = 0
        Ld:
            if (r0 >= r7) goto L110
            int r1 = r6.getIndex(r0)
            android.util.SparseIntArray r2 = defpackage.lg3.a
            int r3 = r2.get(r1)
            switch(r3) {
                case 1: goto L104;
                case 2: goto Lfb;
                case 3: goto L1c;
                case 4: goto Lf2;
                case 5: goto Le9;
                case 6: goto Le0;
                case 7: goto Ld7;
                case 8: goto Lce;
                case 9: goto Lca;
                case 10: goto L9b;
                case 11: goto L1c;
                case 12: goto L91;
                case 13: goto L87;
                case 14: goto L7d;
                case 15: goto L73;
                case 16: goto L69;
                case 17: goto L5f;
                case 18: goto L55;
                case 19: goto L4b;
                case 20: goto L41;
                default: goto L1c;
            }
        L1c:
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
            java.lang.String r2 = "KeyAttribute"
            android.util.Log.e(r2, r1)
            goto L10c
        L41:
            float r2 = r5.l
            float r1 = r6.getDimension(r1, r2)
            r5.l = r1
            goto L10c
        L4b:
            float r2 = r5.k
            float r1 = r6.getDimension(r1, r2)
            r5.k = r1
            goto L10c
        L55:
            float r2 = r5.s
            float r1 = r6.getFloat(r1, r2)
            r5.s = r1
            goto L10c
        L5f:
            float r2 = r5.r
            float r1 = r6.getDimension(r1, r2)
            r5.r = r1
            goto L10c
        L69:
            float r2 = r5.q
            float r1 = r6.getDimension(r1, r2)
            r5.q = r1
            goto L10c
        L73:
            float r2 = r5.p
            float r1 = r6.getDimension(r1, r2)
            r5.p = r1
            goto L10c
        L7d:
            float r2 = r5.o
            float r1 = r6.getFloat(r1, r2)
            r5.o = r1
            goto L10c
        L87:
            int r2 = r5.e
            int r1 = r6.getInteger(r1, r2)
            r5.e = r1
            goto L10c
        L91:
            int r2 = r5.a
            int r1 = r6.getInt(r1, r2)
            r5.a = r1
            goto L10c
        L9b:
            boolean r2 = androidx.constraintlayout.motion.widget.MotionLayout.t1
            if (r2 == 0) goto Lb1
            int r2 = r5.b
            int r2 = r6.getResourceId(r1, r2)
            r5.b = r2
            r3 = -1
            if (r2 != r3) goto L10c
            java.lang.String r1 = r6.getString(r1)
            r5.c = r1
            goto L10c
        Lb1:
            android.util.TypedValue r2 = r6.peekValue(r1)
            int r2 = r2.type
            r3 = 3
            if (r2 != r3) goto Lc1
            java.lang.String r1 = r6.getString(r1)
            r5.c = r1
            goto L10c
        Lc1:
            int r2 = r5.b
            int r1 = r6.getResourceId(r1, r2)
            r5.b = r1
            goto L10c
        Lca:
            r6.getString(r1)
            goto L10c
        Lce:
            float r2 = r5.m
            float r1 = r6.getFloat(r1, r2)
            r5.m = r1
            goto L10c
        Ld7:
            float r2 = r5.n
            float r1 = r6.getFloat(r1, r2)
            r5.n = r1
            goto L10c
        Le0:
            float r2 = r5.j
            float r1 = r6.getFloat(r1, r2)
            r5.j = r1
            goto L10c
        Le9:
            float r2 = r5.i
            float r1 = r6.getFloat(r1, r2)
            r5.i = r1
            goto L10c
        Lf2:
            float r2 = r5.h
            float r1 = r6.getFloat(r1, r2)
            r5.h = r1
            goto L10c
        Lfb:
            float r2 = r5.g
            float r1 = r6.getDimension(r1, r2)
            r5.g = r1
            goto L10c
        L104:
            float r2 = r5.f
            float r1 = r6.getFloat(r1, r2)
            r5.f = r1
        L10c:
            int r0 = r0 + 1
            goto Ld
        L110:
            return
    }

    @Override // defpackage.jg3
    public final void f(java.util.HashMap r4) {
            r3 = this;
            int r0 = r3.e
            r1 = -1
            if (r0 != r1) goto L7
            goto L13f
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
            float r0 = r3.k
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L79
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "transformPivotX"
            r4.put(r1, r0)
        L79:
            float r0 = r3.l
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8c
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "transformPivotY"
            r4.put(r1, r0)
        L8c:
            float r0 = r3.p
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L9f
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationX"
            r4.put(r1, r0)
        L9f:
            float r0 = r3.q
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb2
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationY"
            r4.put(r1, r0)
        Lb2:
            float r0 = r3.r
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lc5
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "translationZ"
            r4.put(r1, r0)
        Lc5:
            float r0 = r3.m
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Ld8
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "transitionPathRotate"
            r4.put(r1, r0)
        Ld8:
            float r0 = r3.n
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Leb
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleX"
            r4.put(r1, r0)
        Leb:
            float r0 = r3.o
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lfe
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "scaleY"
            r4.put(r1, r0)
        Lfe:
            float r0 = r3.s
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L111
            int r0 = r3.e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "progress"
            r4.put(r1, r0)
        L111:
            java.util.HashMap r0 = r3.d
            int r0 = r0.size()
            if (r0 <= 0) goto L13f
            java.util.HashMap r0 = r3.d
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L123:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L13f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "CUSTOM,"
            java.lang.String r1 = defpackage.i61.m(r2, r1)
            int r2 = r3.e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.put(r1, r2)
            goto L123
        L13f:
            return
    }
}
