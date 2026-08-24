package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gl5  reason: default package */
/* loaded from: classes.dex */
public final class gl5 {
    public static final double h = 0.0d;
    public final android.util.Size a;
    public final android.util.Rational b;
    public final android.util.Rational c;
    public final java.util.HashSet d;
    public final defpackage.m44 e;
    public final defpackage.cg0 f;
    public final java.util.HashMap g;

    static {
            r0 = 4612520018358382440(0x4002f684bda12f68, double:2.3703703703703702)
            double r0 = java.lang.Math.sqrt(r0)
            defpackage.gl5.h = r0
            return
    }

    public gl5(defpackage.eg0 r7, java.util.HashSet r8) {
            r6 = this;
            cg0 r0 = r7.q()
            android.graphics.Rect r0 = r0.j()
            android.util.Size r0 = defpackage.k97.f(r0)
            cg0 r7 = r7.q()
            m44 r1 = new m44
            r1.<init>(r7, r0)
            r6.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r6.g = r2
            r6.a = r0
            int r2 = r0.getWidth()
            double r2 = (double) r2
            int r4 = r0.getHeight()
            double r4 = (double) r4
            double r2 = r2 / r4
            double r4 = defpackage.gl5.h
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L35
            android.util.Rational r2 = defpackage.mv.c
            goto L37
        L35:
            android.util.Rational r2 = defpackage.mv.a
        L37:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The closer aspect ratio to the sensor size ("
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ") is "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = "."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "ResolutionsMerger"
            defpackage.kj2.t(r3, r0)
            r6.b = r2
            android.util.Rational r0 = defpackage.mv.a
            boolean r3 = r2.equals(r0)
            if (r3 == 0) goto L64
            android.util.Rational r0 = defpackage.mv.c
            goto L6c
        L64:
            android.util.Rational r3 = defpackage.mv.c
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L75
        L6c:
            r6.c = r0
            r6.f = r7
            r6.d = r8
            r6.e = r1
            return
        L75:
            java.lang.String r6 = "Invalid sensor aspect-ratio: "
            defpackage.e41.w(r2, r6)
            r6 = 0
            throw r6
    }

    public static android.graphics.Rect a(android.util.Size r4, android.util.Size r5) {
            android.util.Rational r5 = h(r5)
            int r0 = r4.getWidth()
            int r1 = r4.getHeight()
            android.util.Rational r4 = h(r4)
            float r2 = r5.floatValue()
            float r3 = r4.floatValue()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L25
            android.graphics.RectF r4 = new android.graphics.RectF
            float r5 = (float) r0
            float r0 = (float) r1
            r4.<init>(r3, r3, r5, r0)
            goto L55
        L25:
            float r2 = r5.floatValue()
            float r4 = r4.floatValue()
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r2 = 1073741824(0x40000000, float:2.0)
            if (r4 <= 0) goto L45
            float r4 = (float) r0
            float r5 = r5.floatValue()
            float r5 = r4 / r5
            float r0 = (float) r1
            float r0 = r0 - r5
            float r0 = r0 / r2
            android.graphics.RectF r1 = new android.graphics.RectF
            float r5 = r5 + r0
            r1.<init>(r3, r0, r4, r5)
        L43:
            r4 = r1
            goto L55
        L45:
            float r4 = (float) r1
            float r5 = r5.floatValue()
            float r5 = r5 * r4
            float r0 = (float) r0
            float r0 = r0 - r5
            float r0 = r0 / r2
            android.graphics.RectF r1 = new android.graphics.RectF
            float r5 = r5 + r0
            r1.<init>(r0, r3, r5, r4)
            goto L43
        L55:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r4.round(r5)
            return r5
    }

    public static boolean d(android.util.Size r2, android.util.Size r3) {
            int r0 = r2.getHeight()
            int r1 = r3.getHeight()
            if (r0 > r1) goto L17
            int r2 = r2.getWidth()
            int r3 = r3.getWidth()
            if (r2 <= r3) goto L15
            goto L17
        L15:
            r2 = 0
            return r2
        L17:
            r2 = 1
            return r2
    }

    public static android.util.Rational h(android.util.Size r2) {
            android.util.Rational r0 = new android.util.Rational
            int r1 = r2.getWidth()
            int r2 = r2.getHeight()
            r0.<init>(r1, r2)
            return r0
    }

    public final defpackage.y15 b(defpackage.zi7 r5, android.graphics.Rect r6, int r7, boolean r8) {
            r4 = this;
            boolean r7 = defpackage.k97.c(r7)
            if (r7 == 0) goto L18
            android.graphics.Rect r7 = new android.graphics.Rect
            int r0 = r6.top
            int r1 = r6.left
            int r2 = r6.bottom
            int r6 = r6.right
            r7.<init>(r0, r1, r2, r6)
            r6 = 1
            r3 = r7
            r7 = r6
            r6 = r3
            goto L19
        L18:
            r7 = 0
        L19:
            if (r8 == 0) goto L53
            android.util.Size r8 = defpackage.k97.f(r6)
            java.util.List r4 = r4.c(r5)
            java.util.Iterator r4 = r4.iterator()
        L27:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r4.next()
            android.util.Size r5 = (android.util.Size) r5
            android.graphics.Rect r0 = a(r5, r8)
            android.util.Size r0 = defpackage.k97.f(r0)
            boolean r1 = d(r0, r8)
            if (r1 != 0) goto L27
            android.util.Pair r4 = android.util.Pair.create(r5, r0)
            goto L4a
        L46:
            android.util.Pair r4 = android.util.Pair.create(r8, r8)
        L4a:
            java.lang.Object r5 = r4.first
            android.util.Size r5 = (android.util.Size) r5
            java.lang.Object r4 = r4.second
            android.util.Size r4 = (android.util.Size) r4
            goto Lad
        L53:
            android.util.Size r6 = defpackage.k97.f(r6)
            java.util.List r5 = r4.c(r5)
            java.util.Iterator r8 = r5.iterator()
        L5f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r0 = r8.next()
            android.util.Size r0 = (android.util.Size) r0
            android.util.Rational r1 = defpackage.mv.a
            boolean r2 = defpackage.mv.a(r1, r6)
            if (r2 == 0) goto L74
            goto L81
        L74:
            android.util.Rational r1 = defpackage.mv.c
            boolean r2 = defpackage.mv.a(r1, r6)
            if (r2 == 0) goto L7d
            goto L81
        L7d:
            android.util.Rational r1 = h(r6)
        L81:
            boolean r1 = r4.e(r1, r0)
            if (r1 == 0) goto L88
            goto L5f
        L88:
            boolean r1 = d(r0, r6)
            if (r1 != 0) goto L5f
            r5 = r0
            goto La8
        L90:
            java.util.Iterator r4 = r5.iterator()
        L94:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto La7
            java.lang.Object r5 = r4.next()
            android.util.Size r5 = (android.util.Size) r5
            boolean r8 = d(r5, r6)
            if (r8 != 0) goto L94
            goto La8
        La7:
            r5 = r6
        La8:
            android.graphics.Rect r6 = a(r6, r5)
            r4 = r5
        Lad:
            y15 r8 = new y15
            r8.<init>(r6, r4, r5)
            if (r7 == 0) goto Ld4
            y15 r7 = new y15
            android.graphics.Rect r8 = new android.graphics.Rect
            int r0 = r6.top
            int r1 = r6.left
            int r2 = r6.bottom
            int r6 = r6.right
            r8.<init>(r0, r1, r2, r6)
            android.util.Size r6 = new android.util.Size
            int r0 = r4.getHeight()
            int r4 = r4.getWidth()
            r6.<init>(r0, r4)
            r7.<init>(r8, r6, r5)
            return r7
        Ld4:
            return r8
    }

    public final java.util.List c(defpackage.zi7 r12) {
            r11 = this;
            java.util.HashSet r0 = r11.d
            boolean r0 = r0.contains(r12)
            r1 = 0
            if (r0 == 0) goto L99
            java.util.HashMap r0 = r11.g
            boolean r2 = r0.containsKey(r12)
            if (r2 == 0) goto L1b
            java.lang.Object r11 = r0.get(r12)
            java.util.List r11 = (java.util.List) r11
            java.util.Objects.requireNonNull(r11)
            return r11
        L1b:
            m44 r11 = r11.e
            java.util.ArrayList r11 = r11.u(r12)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r11.size()
            r5 = 0
        L30:
            if (r5 >= r4) goto L95
            java.lang.Object r6 = r11.get(r5)
            int r5 = r5 + 1
            android.util.Size r6 = (android.util.Size) r6
            java.util.Set r7 = r2.keySet()
            java.util.Iterator r7 = r7.iterator()
        L42:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L55
            java.lang.Object r8 = r7.next()
            android.util.Rational r8 = (android.util.Rational) r8
            boolean r9 = defpackage.mv.a(r8, r6)
            if (r9 == 0) goto L42
            goto L56
        L55:
            r8 = r1
        L56:
            if (r8 == 0) goto L8a
            java.lang.Object r7 = r2.get(r8)
            android.util.Size r7 = (android.util.Size) r7
            java.util.Objects.requireNonNull(r7)
            int r9 = r6.getHeight()
            int r10 = r7.getHeight()
            if (r9 > r10) goto L30
            int r9 = r6.getWidth()
            int r10 = r7.getWidth()
            if (r9 > r10) goto L30
            int r9 = r6.getWidth()
            int r10 = r7.getWidth()
            if (r9 != r10) goto L8e
            int r9 = r6.getHeight()
            int r7 = r7.getHeight()
            if (r9 != r7) goto L8e
            goto L30
        L8a:
            android.util.Rational r8 = h(r6)
        L8e:
            r3.add(r6)
            r2.put(r8, r6)
            goto L30
        L95:
            r0.put(r12, r3)
            return r3
        L99:
            java.lang.String r11 = "Invalid child config: "
            defpackage.e41.w(r12, r11)
            return r1
    }

    public final boolean e(android.util.Rational r3, android.util.Size r4) {
            r2 = this;
            android.util.Rational r2 = r2.b
            boolean r0 = r2.equals(r3)
            if (r0 != 0) goto L45
            boolean r0 = defpackage.mv.a(r3, r4)
            if (r0 == 0) goto Lf
            goto L45
        Lf:
            float r2 = r2.floatValue()
            float r3 = r3.floatValue()
            android.util.Rational r0 = defpackage.mv.a
            boolean r1 = defpackage.mv.a(r0, r4)
            if (r1 == 0) goto L20
            goto L2d
        L20:
            android.util.Rational r0 = defpackage.mv.c
            boolean r1 = defpackage.mv.a(r0, r4)
            if (r1 == 0) goto L29
            goto L2d
        L29:
            android.util.Rational r0 = h(r4)
        L2d:
            float r4 = r0.floatValue()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L45
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 != 0) goto L3a
            goto L45
        L3a:
            if (r2 <= 0) goto L41
            int r2 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r2 >= 0) goto L45
            goto L43
        L41:
            if (r0 <= 0) goto L45
        L43:
            r2 = 1
            return r2
        L45:
            r2 = 0
            return r2
    }

    public final java.util.ArrayList f(java.util.List r8, boolean r9) {
            r7 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.util.Rational r1 = defpackage.mv.a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.put(r1, r2)
            android.util.Rational r2 = defpackage.mv.c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.put(r2, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.add(r1)
            r3.add(r2)
            java.util.Iterator r8 = r8.iterator()
        L28:
            boolean r1 = r8.hasNext()
            r2 = 0
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r8.next()
            android.util.Size r1 = (android.util.Size) r1
            int r4 = r1.getHeight()
            if (r4 > 0) goto L3c
            goto L28
        L3c:
            int r4 = r3.size()
        L40:
            if (r2 >= r4) goto L57
            java.lang.Object r5 = r3.get(r2)
            int r2 = r2 + 1
            android.util.Rational r5 = (android.util.Rational) r5
            boolean r6 = defpackage.mv.a(r5, r1)
            if (r6 == 0) goto L40
            java.lang.Object r2 = r0.get(r5)
            java.util.List r2 = (java.util.List) r2
            goto L58
        L57:
            r2 = 0
        L58:
            if (r2 != 0) goto L69
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            android.util.Rational r4 = h(r1)
            r3.add(r4)
            r0.put(r4, r2)
        L69:
            r2.add(r1)
            goto L28
        L6d:
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.Set r1 = r0.keySet()
            r8.<init>(r1)
            android.util.Size r1 = r7.a
            android.util.Rational r1 = h(r1)
            ix1 r3 = new ix1
            r4 = 1
            r3.<init>(r1, r4)
            java.util.Collections.sort(r8, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r8.size()
        L8e:
            if (r2 >= r3) goto Lba
            java.lang.Object r4 = r8.get(r2)
            int r2 = r2 + 1
            android.util.Rational r4 = (android.util.Rational) r4
            android.util.Rational r5 = defpackage.mv.c
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L8e
            android.util.Rational r5 = defpackage.mv.a
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto La9
            goto L8e
        La9:
            java.lang.Object r5 = r0.get(r4)
            java.util.List r5 = (java.util.List) r5
            java.util.Objects.requireNonNull(r5)
            java.util.ArrayList r4 = r7.g(r4, r5, r9)
            r1.addAll(r4)
            goto L8e
        Lba:
            return r1
    }

    public final java.util.ArrayList g(android.util.Rational r12, java.util.List r13, boolean r14) {
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r13 = r13.iterator()
        L9:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r13.next()
            android.util.Size r1 = (android.util.Size) r1
            boolean r2 = defpackage.mv.a(r12, r1)
            if (r2 == 0) goto L9
            r0.add(r1)
            goto L9
        L1f:
            ru0 r13 = new ru0
            r1 = 1
            r13.<init>(r1)
            java.util.Collections.sort(r0, r13)
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>(r0)
            java.util.HashSet r2 = r11.d
            java.util.Iterator r2 = r2.iterator()
        L33:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L11a
            java.lang.Object r3 = r2.next()
            zi7 r3 = (defpackage.zi7) r3
            java.util.List r3 = r11.c(r3)
            if (r14 != 0) goto L66
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L4f:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L65
            java.lang.Object r6 = r3.next()
            android.util.Size r6 = (android.util.Size) r6
            boolean r7 = r11.e(r12, r6)
            if (r7 != 0) goto L4f
            r5.add(r6)
            goto L4f
        L65:
            r3 = r5
        L66:
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L72
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            return r11
        L72:
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto Laf
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L7f
            goto Laf
        L7f:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r0.size()
            r7 = r4
        L89:
            if (r7 >= r6) goto Lad
            java.lang.Object r8 = r0.get(r7)
            int r7 = r7 + 1
            android.util.Size r8 = (android.util.Size) r8
            java.util.Iterator r9 = r3.iterator()
        L97:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L89
            java.lang.Object r10 = r9.next()
            android.util.Size r10 = (android.util.Size) r10
            boolean r10 = d(r10, r8)
            if (r10 != 0) goto L97
            r5.add(r8)
            goto L89
        Lad:
            r0 = r5
            goto Lb4
        Laf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lb4:
            boolean r5 = r3.isEmpty()
            if (r5 != 0) goto L110
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto Lc1
            goto L110
        Lc1:
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto Lc9
            r5 = r0
            goto Ld3
        Lc9:
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>(r0)
            r5.<init>(r6)
        Ld3:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r5.size()
        Ldc:
            if (r4 >= r7) goto L101
            java.lang.Object r8 = r5.get(r4)
            int r4 = r4 + 1
            android.util.Size r8 = (android.util.Size) r8
            java.util.Iterator r9 = r3.iterator()
        Lea:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lfd
            java.lang.Object r10 = r9.next()
            android.util.Size r10 = (android.util.Size) r10
            boolean r10 = d(r10, r8)
            if (r10 == 0) goto Lea
            goto Ldc
        Lfd:
            r6.add(r8)
            goto Ldc
        L101:
            boolean r3 = r6.isEmpty()
            if (r3 != 0) goto L115
            int r3 = r6.size()
            int r3 = r3 - r1
            r6.remove(r3)
            goto L115
        L110:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L115:
            r13.retainAll(r6)
            goto L33
        L11a:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r12 = r0.size()
        L123:
            if (r4 >= r12) goto L137
            java.lang.Object r14 = r0.get(r4)
            int r4 = r4 + 1
            android.util.Size r14 = (android.util.Size) r14
            boolean r1 = r13.contains(r14)
            if (r1 != 0) goto L123
            r11.add(r14)
            goto L123
        L137:
            return r11
    }
}
