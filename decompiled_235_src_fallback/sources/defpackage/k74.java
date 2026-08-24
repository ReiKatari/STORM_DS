package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k74  reason: default package */
/* loaded from: classes.dex */
public final class k74 implements java.lang.Comparable {
    public float A;
    public int B;
    public int L;
    public final java.util.LinkedHashMap R;
    public float X;
    public float Y;
    public float Z;
    public float d0;
    public float e0;
    public float f0;
    public float g0;
    public float h0;
    public float i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;

    public k74() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.A = r0
            r1 = 0
            r2.B = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r2.R = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.X = r1
            r2.Y = r0
            r2.Z = r0
            r2.d0 = r0
            r2.e0 = r1
            r2.f0 = r1
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2.g0 = r1
            r2.h0 = r1
            r2.i0 = r0
            r2.j0 = r0
            r2.k0 = r0
            r2.l0 = r1
            r2.m0 = r1
            return
    }

    public static boolean b(float r1, float r2) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L1a
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 == 0) goto Ld
            goto L1a
        Ld:
            float r1 = r1 - r2
            float r1 = java.lang.Math.abs(r1)
            r2 = 897988541(0x358637bd, float:1.0E-6)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L26
            goto L24
        L1a:
            boolean r1 = java.lang.Float.isNaN(r1)
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r1 == r2) goto L26
        L24:
            r1 = 1
            return r1
        L26:
            r1 = 0
            return r1
    }

    public final void a(java.util.HashMap r8, int r9) {
            r7 = this;
            java.util.Set r0 = r8.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.get(r1)
            qp7 r2 = (defpackage.qp7) r2
            if (r2 != 0) goto L1d
            goto L8
        L1d:
            r1.getClass()
            int r3 = r1.hashCode()
            r4 = 1
            r5 = -1
            switch(r3) {
                case -1249320806: goto Lcc;
                case -1249320805: goto Lc1;
                case -1225497657: goto Lb6;
                case -1225497656: goto Lab;
                case -1225497655: goto La0;
                case -1001078227: goto L95;
                case -908189618: goto L8a;
                case -908189617: goto L7f;
                case -760884510: goto L71;
                case -760884509: goto L63;
                case -40300674: goto L55;
                case -4379043: goto L47;
                case 37232917: goto L39;
                case 92909918: goto L2b;
                default: goto L29;
            }
        L29:
            goto Ld6
        L2b:
            java.lang.String r3 = "alpha"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L35
            goto Ld6
        L35:
            r5 = 13
            goto Ld6
        L39:
            java.lang.String r3 = "transitionPathRotate"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L43
            goto Ld6
        L43:
            r5 = 12
            goto Ld6
        L47:
            java.lang.String r3 = "elevation"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L51
            goto Ld6
        L51:
            r5 = 11
            goto Ld6
        L55:
            java.lang.String r3 = "rotation"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L5f
            goto Ld6
        L5f:
            r5 = 10
            goto Ld6
        L63:
            java.lang.String r3 = "transformPivotY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L6d
            goto Ld6
        L6d:
            r5 = 9
            goto Ld6
        L71:
            java.lang.String r3 = "transformPivotX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L7b
            goto Ld6
        L7b:
            r5 = 8
            goto Ld6
        L7f:
            java.lang.String r3 = "scaleY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L88
            goto Ld6
        L88:
            r5 = 7
            goto Ld6
        L8a:
            java.lang.String r3 = "scaleX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L93
            goto Ld6
        L93:
            r5 = 6
            goto Ld6
        L95:
            java.lang.String r3 = "progress"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L9e
            goto Ld6
        L9e:
            r5 = 5
            goto Ld6
        La0:
            java.lang.String r3 = "translationZ"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto La9
            goto Ld6
        La9:
            r5 = 4
            goto Ld6
        Lab:
            java.lang.String r3 = "translationY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lb4
            goto Ld6
        Lb4:
            r5 = 3
            goto Ld6
        Lb6:
            java.lang.String r3 = "translationX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lbf
            goto Ld6
        Lbf:
            r5 = 2
            goto Ld6
        Lc1:
            java.lang.String r3 = "rotationY"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Lca
            goto Ld6
        Lca:
            r5 = r4
            goto Ld6
        Lcc:
            java.lang.String r3 = "rotationX"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto Ld5
            goto Ld6
        Ld5:
            r5 = 0
        Ld6:
            r3 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            switch(r5) {
                case 0: goto L20c;
                case 1: goto L1fc;
                case 2: goto L1ec;
                case 3: goto L1dc;
                case 4: goto L1cc;
                case 5: goto L1bc;
                case 6: goto L1ac;
                case 7: goto L19c;
                case 8: goto L18c;
                case 9: goto L17c;
                case 10: goto L16c;
                case 11: goto L15c;
                case 12: goto L14c;
                case 13: goto L13c;
                default: goto Ldc;
            }
        Ldc:
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            java.lang.String r5 = "MotionPaths"
            if (r3 == 0) goto L131
            java.lang.String r3 = ","
            java.lang.String[] r3 = r1.split(r3)
            r3 = r3[r4]
            java.util.LinkedHashMap r4 = r7.R
            boolean r6 = r4.containsKey(r3)
            if (r6 == 0) goto L8
            java.lang.Object r3 = r4.get(r3)
            j11 r3 = (defpackage.j11) r3
            boolean r4 = r2 instanceof defpackage.np7
            if (r4 == 0) goto L109
            np7 r2 = (defpackage.np7) r2
            android.util.SparseArray r1 = r2.f
            r1.append(r9, r3)
            goto L8
        L109:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = " ViewSpline not a CustomSet frame = "
            r4.append(r1)
            r4.append(r9)
            java.lang.String r1 = ", value"
            r4.append(r1)
            float r1 = r3.a()
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            android.util.Log.e(r5, r1)
            goto L8
        L131:
            java.lang.String r2 = "UNKNOWN spline "
            java.lang.String r1 = r2.concat(r1)
            android.util.Log.e(r5, r1)
            goto L8
        L13c:
            float r1 = r7.X
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L145
            goto L147
        L145:
            float r3 = r7.X
        L147:
            r2.b(r9, r3)
            goto L8
        L14c:
            float r1 = r7.l0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L155
            goto L157
        L155:
            float r6 = r7.l0
        L157:
            r2.b(r9, r6)
            goto L8
        L15c:
            float r1 = r7.Y
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L165
            goto L167
        L165:
            float r6 = r7.Y
        L167:
            r2.b(r9, r6)
            goto L8
        L16c:
            float r1 = r7.Z
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L175
            goto L177
        L175:
            float r6 = r7.Z
        L177:
            r2.b(r9, r6)
            goto L8
        L17c:
            float r1 = r7.h0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L185
            goto L187
        L185:
            float r6 = r7.h0
        L187:
            r2.b(r9, r6)
            goto L8
        L18c:
            float r1 = r7.g0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L195
            goto L197
        L195:
            float r6 = r7.g0
        L197:
            r2.b(r9, r6)
            goto L8
        L19c:
            float r1 = r7.f0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1a5
            goto L1a7
        L1a5:
            float r3 = r7.f0
        L1a7:
            r2.b(r9, r3)
            goto L8
        L1ac:
            float r1 = r7.e0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1b5
            goto L1b7
        L1b5:
            float r3 = r7.e0
        L1b7:
            r2.b(r9, r3)
            goto L8
        L1bc:
            float r1 = r7.m0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1c5
            goto L1c7
        L1c5:
            float r6 = r7.m0
        L1c7:
            r2.b(r9, r6)
            goto L8
        L1cc:
            float r1 = r7.k0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1d5
            goto L1d7
        L1d5:
            float r6 = r7.k0
        L1d7:
            r2.b(r9, r6)
            goto L8
        L1dc:
            float r1 = r7.j0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1e5
            goto L1e7
        L1e5:
            float r6 = r7.j0
        L1e7:
            r2.b(r9, r6)
            goto L8
        L1ec:
            float r1 = r7.i0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L1f5
            goto L1f7
        L1f5:
            float r6 = r7.i0
        L1f7:
            r2.b(r9, r6)
            goto L8
        L1fc:
            float r1 = r7.A
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L205
            goto L207
        L205:
            float r6 = r7.A
        L207:
            r2.b(r9, r6)
            goto L8
        L20c:
            float r1 = r7.d0
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 == 0) goto L215
            goto L217
        L215:
            float r6 = r7.d0
        L217:
            r2.b(r9, r6)
            goto L8
        L21c:
            return
    }

    public final void c(android.graphics.Rect r4, defpackage.z11 r5, int r6, int r7) {
            r3 = this;
            r4.width()
            r4.height()
            u11 r4 = r5.h(r7)
            x11 r5 = r4.c
            w11 r7 = r4.d
            int r0 = r5.c
            r3.B = r0
            int r1 = r5.b
            r3.L = r1
            if (r1 == 0) goto L1c
            if (r0 != 0) goto L1c
            r5 = 0
            goto L1e
        L1c:
            float r5 = r5.d
        L1e:
            r3.X = r5
            y11 r5 = r4.f
            boolean r0 = r5.m
            float r0 = r5.n
            r3.Y = r0
            float r0 = r5.b
            r3.Z = r0
            float r0 = r5.c
            r3.d0 = r0
            float r0 = r5.d
            r3.A = r0
            float r0 = r5.e
            r3.e0 = r0
            float r0 = r5.f
            r3.f0 = r0
            float r0 = r5.g
            r3.g0 = r0
            float r0 = r5.h
            r3.h0 = r0
            float r0 = r5.j
            r3.i0 = r0
            float r0 = r5.k
            r3.j0 = r0
            float r5 = r5.l
            r3.k0 = r5
            java.lang.String r5 = r7.d
            defpackage.gr1.c(r5)
            float r5 = r7.h
            r3.l0 = r5
            x11 r5 = r4.c
            float r5 = r5.e
            r3.m0 = r5
            java.util.HashMap r5 = r4.g
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L69:
            boolean r7 = r5.hasNext()
            r0 = 4
            if (r7 == 0) goto L92
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            java.util.HashMap r1 = r4.g
            java.lang.Object r1 = r1.get(r7)
            j11 r1 = (defpackage.j11) r1
            i11 r2 = r1.c
            int r2 = r2.ordinal()
            if (r2 == r0) goto L69
            r0 = 5
            if (r2 == r0) goto L69
            r0 = 7
            if (r2 == r0) goto L69
            java.util.LinkedHashMap r0 = r3.R
            r0.put(r7, r1)
            goto L69
        L92:
            r4 = 1
            r5 = 1119092736(0x42b40000, float:90.0)
            if (r6 == r4) goto Lb1
            r4 = 2
            if (r6 == r4) goto La0
            r4 = 3
            if (r6 == r4) goto Lb1
            if (r6 == r0) goto La0
            goto Lb0
        La0:
            float r4 = r3.Z
            float r4 = r4 + r5
            r3.Z = r4
            r5 = 1127481344(0x43340000, float:180.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto Lb0
            r5 = 1135869952(0x43b40000, float:360.0)
            float r4 = r4 - r5
            r3.Z = r4
        Lb0:
            return
        Lb1:
            float r4 = r3.Z
            float r4 = r4 - r5
            r3.Z = r4
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r1) {
            r0 = this;
            k74 r1 = (defpackage.k74) r1
            r1.getClass()
            r0 = 0
            int r0 = java.lang.Float.compare(r0, r0)
            return r0
    }
}
