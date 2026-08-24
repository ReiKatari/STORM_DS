package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qg3  reason: default package */
/* loaded from: classes.dex */
public final class qg3 extends defpackage.jg3 {
    public int e;
    public int f;
    public java.lang.String g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;

    public qg3() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.e = r0
            r0 = -1
            r3.f = r0
            r1 = 0
            r3.g = r1
            r1 = 2143289344(0x7fc00000, float:NaN)
            r3.h = r1
            r2 = 0
            r3.i = r2
            r3.j = r2
            r3.k = r1
            r3.l = r0
            r3.m = r1
            r3.n = r1
            r3.o = r1
            r3.p = r1
            r3.q = r1
            r3.r = r1
            r3.s = r1
            r3.t = r1
            r3.u = r1
            r3.v = r1
            r3.w = r1
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.d = r0
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
            qg3 r0 = new qg3
            r0.<init>()
            super.c(r2)
            int r1 = r2.e
            r0.e = r1
            int r1 = r2.f
            r0.f = r1
            java.lang.String r1 = r2.g
            r0.g = r1
            float r1 = r2.h
            r0.h = r1
            float r1 = r2.i
            r0.i = r1
            float r1 = r2.j
            r0.j = r1
            float r1 = r2.k
            r0.k = r1
            int r1 = r2.l
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
            float r1 = r2.s
            r0.s = r1
            float r1 = r2.t
            r0.t = r1
            float r1 = r2.u
            r0.u = r1
            float r1 = r2.v
            r0.v = r1
            float r2 = r2.w
            r0.w = r2
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
            float r0 = r3.m
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Ld
            java.lang.String r0 = "alpha"
            r4.add(r0)
        Ld:
            float r0 = r3.n
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "elevation"
            r4.add(r0)
        L1a:
            float r0 = r3.o
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L27
            java.lang.String r0 = "rotation"
            r4.add(r0)
        L27:
            float r0 = r3.q
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L34
            java.lang.String r0 = "rotationX"
            r4.add(r0)
        L34:
            float r0 = r3.r
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L41
            java.lang.String r0 = "rotationY"
            r4.add(r0)
        L41:
            float r0 = r3.s
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L4e
            java.lang.String r0 = "scaleX"
            r4.add(r0)
        L4e:
            float r0 = r3.t
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "scaleY"
            r4.add(r0)
        L5b:
            float r0 = r3.p
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L68
            java.lang.String r0 = "transitionPathRotate"
            r4.add(r0)
        L68:
            float r0 = r3.u
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L75
            java.lang.String r0 = "translationX"
            r4.add(r0)
        L75:
            float r0 = r3.v
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L82
            java.lang.String r0 = "translationY"
            r4.add(r0)
        L82:
            float r0 = r3.w
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L8f
            java.lang.String r0 = "translationZ"
            r4.add(r0)
        L8f:
            java.util.HashMap r0 = r3.d
            int r0 = r0.size()
            if (r0 <= 0) goto Lbf
            java.util.HashMap r3 = r3.d
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        La1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lbf
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "CUSTOM,"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.add(r0)
            goto La1
        Lbf:
            return
    }

    @Override // defpackage.jg3
    public final void e(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            int[] r0 = defpackage.e75.f
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r7, r0)
            android.util.SparseIntArray r7 = defpackage.pg3.a
            int r7 = r6.getIndexCount()
            r0 = 0
        Ld:
            if (r0 >= r7) goto L156
            int r1 = r6.getIndex(r0)
            android.util.SparseIntArray r2 = defpackage.pg3.a
            int r3 = r2.get(r1)
            r4 = 3
            switch(r3) {
                case 1: goto L125;
                case 2: goto L11c;
                case 3: goto L118;
                case 4: goto L10f;
                case 5: goto Lf4;
                case 6: goto Leb;
                case 7: goto Ld1;
                case 8: goto Lc7;
                case 9: goto Lbd;
                case 10: goto Lb3;
                case 11: goto La9;
                case 12: goto L9f;
                case 13: goto L95;
                case 14: goto L8b;
                case 15: goto L81;
                case 16: goto L77;
                case 17: goto L6d;
                case 18: goto L63;
                case 19: goto L59;
                case 20: goto L4f;
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
            java.lang.String r2 = "KeyCycle"
            android.util.Log.e(r2, r1)
            goto L152
        L42:
            float r2 = r5.j
            float r1 = r6.getFloat(r1, r2)
            r2 = 1135869952(0x43b40000, float:360.0)
            float r1 = r1 / r2
            r5.j = r1
            goto L152
        L4f:
            float r2 = r5.k
            float r1 = r6.getFloat(r1, r2)
            r5.k = r1
            goto L152
        L59:
            float r2 = r5.w
            float r1 = r6.getDimension(r1, r2)
            r5.w = r1
            goto L152
        L63:
            float r2 = r5.v
            float r1 = r6.getDimension(r1, r2)
            r5.v = r1
            goto L152
        L6d:
            float r2 = r5.u
            float r1 = r6.getDimension(r1, r2)
            r5.u = r1
            goto L152
        L77:
            float r2 = r5.t
            float r1 = r6.getFloat(r1, r2)
            r5.t = r1
            goto L152
        L81:
            float r2 = r5.s
            float r1 = r6.getFloat(r1, r2)
            r5.s = r1
            goto L152
        L8b:
            float r2 = r5.p
            float r1 = r6.getFloat(r1, r2)
            r5.p = r1
            goto L152
        L95:
            float r2 = r5.r
            float r1 = r6.getFloat(r1, r2)
            r5.r = r1
            goto L152
        L9f:
            float r2 = r5.q
            float r1 = r6.getFloat(r1, r2)
            r5.q = r1
            goto L152
        La9:
            float r2 = r5.o
            float r1 = r6.getFloat(r1, r2)
            r5.o = r1
            goto L152
        Lb3:
            float r2 = r5.n
            float r1 = r6.getDimension(r1, r2)
            r5.n = r1
            goto L152
        Lbd:
            float r2 = r5.m
            float r1 = r6.getFloat(r1, r2)
            r5.m = r1
            goto L152
        Lc7:
            int r2 = r5.l
            int r1 = r6.getInt(r1, r2)
            r5.l = r1
            goto L152
        Ld1:
            android.util.TypedValue r2 = r6.peekValue(r1)
            int r2 = r2.type
            float r3 = r5.i
            r4 = 5
            if (r2 != r4) goto Le4
            float r1 = r6.getDimension(r1, r3)
            r5.i = r1
            goto L152
        Le4:
            float r1 = r6.getFloat(r1, r3)
            r5.i = r1
            goto L152
        Leb:
            float r2 = r5.h
            float r1 = r6.getFloat(r1, r2)
            r5.h = r1
            goto L152
        Lf4:
            android.util.TypedValue r2 = r6.peekValue(r1)
            int r2 = r2.type
            if (r2 != r4) goto L106
            java.lang.String r1 = r6.getString(r1)
            r5.g = r1
            r1 = 7
            r5.f = r1
            goto L152
        L106:
            int r2 = r5.f
            int r1 = r6.getInt(r1, r2)
            r5.f = r1
            goto L152
        L10f:
            int r2 = r5.e
            int r1 = r6.getInteger(r1, r2)
            r5.e = r1
            goto L152
        L118:
            r6.getString(r1)
            goto L152
        L11c:
            int r2 = r5.a
            int r1 = r6.getInt(r1, r2)
            r5.a = r1
            goto L152
        L125:
            boolean r2 = androidx.constraintlayout.motion.widget.MotionLayout.t1
            if (r2 == 0) goto L13b
            int r2 = r5.b
            int r2 = r6.getResourceId(r1, r2)
            r5.b = r2
            r3 = -1
            if (r2 != r3) goto L152
            java.lang.String r1 = r6.getString(r1)
            r5.c = r1
            goto L152
        L13b:
            android.util.TypedValue r2 = r6.peekValue(r1)
            int r2 = r2.type
            if (r2 != r4) goto L14a
            java.lang.String r1 = r6.getString(r1)
            r5.c = r1
            goto L152
        L14a:
            int r2 = r5.b
            int r1 = r6.getResourceId(r1, r2)
            r5.b = r1
        L152:
            int r0 = r0 + 1
            goto Ld
        L156:
            return
    }

    public final void g(java.util.HashMap r15) {
            r14 = this;
            java.util.Set r0 = r15.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "CUSTOM"
            boolean r3 = r1.startsWith(r2)
            r4 = 7
            r5 = -1
            if (r3 == 0) goto L64
            java.lang.String r2 = r1.substring(r4)
            java.util.HashMap r3 = r14.d
            java.lang.Object r2 = r3.get(r2)
            j11 r2 = (defpackage.j11) r2
            if (r2 == 0) goto L8
            i11 r3 = r2.c
            i11 r4 = defpackage.i11.FLOAT_TYPE
            if (r3 == r4) goto L33
            goto L8
        L33:
            java.lang.Object r1 = r15.get(r1)
            hp7 r1 = (defpackage.hp7) r1
            if (r1 != 0) goto L3c
            goto L8
        L3c:
            int r11 = r14.a
            int r3 = r14.f
            java.lang.String r4 = r14.g
            int r12 = r14.l
            float r7 = r14.h
            float r8 = r14.i
            float r9 = r14.j
            float r10 = r2.a()
            java.util.ArrayList r13 = r1.f
            rg3 r6 = new rg3
            r6.<init>(r7, r8, r9, r10, r11)
            r13.add(r6)
            if (r12 == r5) goto L5c
            r1.e = r12
        L5c:
            r1.c = r3
            r1.c(r2)
            r1.d = r4
            goto L8
        L64:
            int r3 = r1.hashCode()
            switch(r3) {
                case -1249320806: goto L109;
                case -1249320805: goto Lfd;
                case -1225497657: goto Lf1;
                case -1225497656: goto Le5;
                case -1225497655: goto Lda;
                case -1001078227: goto Lcf;
                case -908189618: goto Lc4;
                case -908189617: goto Lbb;
                case -40300674: goto Laf;
                case -4379043: goto La2;
                case 37232917: goto L95;
                case 92909918: goto L88;
                case 156108012: goto L7b;
                case 1530034690: goto L6e;
                default: goto L6b;
            }
        L6b:
            r4 = r5
            goto L114
        L6e:
            java.lang.String r3 = "wavePhase"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L77
            goto L6b
        L77:
            r4 = 13
            goto L114
        L7b:
            java.lang.String r3 = "waveOffset"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L84
            goto L6b
        L84:
            r4 = 12
            goto L114
        L88:
            java.lang.String r3 = "alpha"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L91
            goto L6b
        L91:
            r4 = 11
            goto L114
        L95:
            java.lang.String r3 = "transitionPathRotate"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L9e
            goto L6b
        L9e:
            r4 = 10
            goto L114
        La2:
            java.lang.String r3 = "elevation"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lab
            goto L6b
        Lab:
            r4 = 9
            goto L114
        Laf:
            java.lang.String r3 = "rotation"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lb8
            goto L6b
        Lb8:
            r4 = 8
            goto L114
        Lbb:
            java.lang.String r3 = "scaleY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L114
            goto L6b
        Lc4:
            java.lang.String r3 = "scaleX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lcd
            goto L6b
        Lcd:
            r4 = 6
            goto L114
        Lcf:
            java.lang.String r3 = "progress"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Ld8
            goto L6b
        Ld8:
            r4 = 5
            goto L114
        Lda:
            java.lang.String r3 = "translationZ"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Le3
            goto L6b
        Le3:
            r4 = 4
            goto L114
        Le5:
            java.lang.String r3 = "translationY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lef
            goto L6b
        Lef:
            r4 = 3
            goto L114
        Lf1:
            java.lang.String r3 = "translationX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lfb
            goto L6b
        Lfb:
            r4 = 2
            goto L114
        Lfd:
            java.lang.String r3 = "rotationY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L107
            goto L6b
        L107:
            r4 = 1
            goto L114
        L109:
            java.lang.String r3 = "rotationX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L113
            goto L6b
        L113:
            r4 = 0
        L114:
            switch(r4) {
                case 0: goto L153;
                case 1: goto L150;
                case 2: goto L14d;
                case 3: goto L14a;
                case 4: goto L147;
                case 5: goto L144;
                case 6: goto L141;
                case 7: goto L13e;
                case 8: goto L13b;
                case 9: goto L138;
                case 10: goto L135;
                case 11: goto L132;
                case 12: goto L12f;
                case 13: goto L12c;
                default: goto L117;
            }
        L117:
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L128
            java.lang.String r2 = "  UNKNOWN  "
            java.lang.String r2 = r2.concat(r1)
            java.lang.String r3 = "WARNING! KeyCycle"
            android.util.Log.v(r3, r2)
        L128:
            r2 = 2143289344(0x7fc00000, float:NaN)
        L12a:
            r10 = r2
            goto L156
        L12c:
            float r2 = r14.j
            goto L12a
        L12f:
            float r2 = r14.i
            goto L12a
        L132:
            float r2 = r14.m
            goto L12a
        L135:
            float r2 = r14.p
            goto L12a
        L138:
            float r2 = r14.n
            goto L12a
        L13b:
            float r2 = r14.o
            goto L12a
        L13e:
            float r2 = r14.t
            goto L12a
        L141:
            float r2 = r14.s
            goto L12a
        L144:
            float r2 = r14.k
            goto L12a
        L147:
            float r2 = r14.w
            goto L12a
        L14a:
            float r2 = r14.v
            goto L12a
        L14d:
            float r2 = r14.u
            goto L12a
        L150:
            float r2 = r14.r
            goto L12a
        L153:
            float r2 = r14.q
            goto L12a
        L156:
            boolean r2 = java.lang.Float.isNaN(r10)
            if (r2 == 0) goto L15e
            goto L8
        L15e:
            java.lang.Object r1 = r15.get(r1)
            hp7 r1 = (defpackage.hp7) r1
            if (r1 != 0) goto L168
            goto L8
        L168:
            int r11 = r14.a
            int r2 = r14.f
            java.lang.String r3 = r14.g
            int r4 = r14.l
            float r7 = r14.h
            float r8 = r14.i
            float r9 = r14.j
            java.util.ArrayList r12 = r1.f
            rg3 r6 = new rg3
            r6.<init>(r7, r8, r9, r10, r11)
            r12.add(r6)
            if (r4 == r5) goto L184
            r1.e = r4
        L184:
            r1.c = r2
            r1.d = r3
            goto L8
        L18a:
            return
    }
}
