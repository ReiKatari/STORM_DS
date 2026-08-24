package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: am1  reason: default package */
/* loaded from: classes.dex */
public final class am1 {
    public static final java.util.LinkedHashSet p = null;
    public static final java.util.Map q = null;
    public java.lang.CharSequence a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public final java.util.List i;
    public final defpackage.q61 j;
    public final java.util.List k;
    public final defpackage.yl1 l;
    public final java.util.LinkedHashMap m;
    public final java.util.ArrayList n;
    public final java.util.LinkedHashSet o;

    static {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.lang.Class<gw3> r6 = defpackage.gw3.class
            java.lang.Class<i43> r7 = defpackage.i43.class
            java.lang.Class<e50> r1 = defpackage.e50.class
            java.lang.Class<zw2> r2 = defpackage.zw2.class
            java.lang.Class<ha2> r3 = defpackage.ha2.class
            java.lang.Class<zy2> r4 = defpackage.zy2.class
            java.lang.Class<d57> r5 = defpackage.d57.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r2, r3, r4, r5, r6, r7}
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            defpackage.am1.p = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            f50 r1 = new f50
            r2 = 0
            r1.<init>(r2)
            java.lang.Class<e50> r2 = defpackage.e50.class
            r0.put(r2, r1)
            f50 r1 = new f50
            r2 = 2
            r1.<init>(r2)
            java.lang.Class<zw2> r2 = defpackage.zw2.class
            r0.put(r2, r1)
            f50 r1 = new f50
            r2 = 1
            r1.<init>(r2)
            java.lang.Class<ha2> r2 = defpackage.ha2.class
            r0.put(r2, r1)
            f50 r1 = new f50
            r2 = 3
            r1.<init>(r2)
            java.lang.Class<zy2> r2 = defpackage.zy2.class
            r0.put(r2, r1)
            f50 r1 = new f50
            r2 = 6
            r1.<init>(r2)
            java.lang.Class<d57> r2 = defpackage.d57.class
            r0.put(r2, r1)
            f50 r1 = new f50
            r2 = 5
            r1.<init>(r2)
            java.lang.Class<gw3> r2 = defpackage.gw3.class
            r0.put(r2, r1)
            f50 r1 = new f50
            r2 = 4
            r1.<init>(r2)
            java.lang.Class<i43> r2 = defpackage.i43.class
            r0.put(r2, r1)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            defpackage.am1.q = r0
            return
    }

    public am1(java.util.ArrayList r3, defpackage.q61 r4, java.util.ArrayList r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.b = r0
            r2.c = r0
            r2.e = r0
            r2.f = r0
            r2.g = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.m = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.n = r0
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r2.o = r1
            r2.i = r3
            r2.j = r4
            r2.k = r5
            yl1 r3 = new yl1
            r4 = 0
            r3.<init>(r4)
            r2.l = r3
            r0.add(r3)
            r1.add(r3)
            return
    }

    public final void a(defpackage.u r3) {
            r2 = this;
        L0:
            u r0 = r2.h()
            a50 r1 = r3.d()
            boolean r0 = r0.b(r1)
            if (r0 != 0) goto L16
            u r0 = r2.h()
            r2.e(r0)
            goto L0
        L16:
            u r0 = r2.h()
            a50 r0 = r0.d()
            a50 r1 = r3.d()
            r0.b(r1)
            java.util.ArrayList r0 = r2.n
            r0.add(r3)
            java.util.LinkedHashSet r2 = r2.o
            r2.add(r3)
            return
    }

    public final void b(defpackage.cs4 r8) {
            r7 = this;
            tv3 r0 = r8.b
            r0.a()
            java.util.ArrayList r0 = r0.c
            int r1 = r0.size()
            r2 = 0
        Lc:
            if (r2 >= r1) goto L45
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            qv3 r3 = (defpackage.qv3) r3
            xr4 r4 = r8.a
            r3.j()
            java.lang.Object r5 = r4.e
            a21 r5 = (defpackage.a21) r5
            r3.e = r5
            if (r5 == 0) goto L25
            r5.f = r3
        L25:
            r3.f = r4
            r4.e = r3
            java.lang.Object r4 = r4.b
            a21 r4 = (defpackage.a21) r4
            r3.b = r4
            java.lang.Object r5 = r3.e
            a21 r5 = (defpackage.a21) r5
            if (r5 != 0) goto L37
            r4.c = r3
        L37:
            java.lang.String r4 = r3.g
            java.util.LinkedHashMap r5 = r7.m
            boolean r6 = r5.containsKey(r4)
            if (r6 != 0) goto Lc
            r5.put(r4, r3)
            goto Lc
        L45:
            return
    }

    public final void c() {
            r5 = this;
            boolean r0 = r5.d
            if (r0 == 0) goto L35
            int r0 = r5.b
            int r0 = r0 + 1
            java.lang.CharSequence r1 = r5.a
            int r2 = r1.length()
            java.lang.CharSequence r0 = r1.subSequence(r0, r2)
            int r1 = r5.c
            int r1 = r1 % 4
            int r1 = 4 - r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r0.length()
            int r3 = r3 + r1
            r2.<init>(r3)
            r3 = 0
        L23:
            if (r3 >= r1) goto L2d
            r4 = 32
            r2.append(r4)
            int r3 = r3 + 1
            goto L23
        L2d:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L41
        L35:
            java.lang.CharSequence r0 = r5.a
            int r1 = r5.b
            int r2 = r0.length()
            java.lang.CharSequence r0 = r0.subSequence(r1, r2)
        L41:
            u r5 = r5.h()
            r5.a(r0)
            return
    }

    public final void d() {
            r3 = this;
            java.lang.CharSequence r0 = r3.a
            int r1 = r3.b
            char r0 = r0.charAt(r1)
            int r1 = r3.b
            r2 = 9
            if (r0 != r2) goto L1c
            int r1 = r1 + 1
            r3.b = r1
            int r0 = r3.c
            int r1 = r0 % 4
            int r1 = 4 - r1
            int r1 = r1 + r0
            r3.c = r1
            return
        L1c:
            int r1 = r1 + 1
            r3.b = r1
            int r0 = r3.c
            int r0 = r0 + 1
            r3.c = r0
            return
    }

    public final void e(defpackage.u r3) {
            r2 = this;
            u r0 = r2.h()
            if (r0 != r3) goto L11
            java.util.ArrayList r0 = r2.n
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
        L11:
            boolean r0 = r3 instanceof defpackage.cs4
            if (r0 == 0) goto L1b
            r0 = r3
            cs4 r0 = (defpackage.cs4) r0
            r2.b(r0)
        L1b:
            r3.c()
            return
    }

    public final void f(java.util.List r3) {
            r2 = this;
            int r0 = r3.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L14
            java.lang.Object r1 = r3.get(r0)
            u r1 = (defpackage.u) r1
            r2.e(r1)
            int r0 = r0 + (-1)
            goto L6
        L14:
            return
    }

    public final void g() {
            r5 = this;
            int r0 = r5.b
            int r1 = r5.c
            r2 = 1
            r5.h = r2
            java.lang.CharSequence r2 = r5.a
            int r2 = r2.length()
        Ld:
            if (r0 >= r2) goto L2e
            java.lang.CharSequence r3 = r5.a
            char r3 = r3.charAt(r0)
            r4 = 9
            if (r3 == r4) goto L26
            r4 = 32
            if (r3 == r4) goto L21
            r2 = 0
            r5.h = r2
            goto L2e
        L21:
            int r0 = r0 + 1
            int r1 = r1 + 1
            goto Ld
        L26:
            int r0 = r0 + 1
            int r3 = r1 % 4
            int r3 = 4 - r3
            int r1 = r1 + r3
            goto Ld
        L2e:
            r5.e = r0
            r5.f = r1
            int r0 = r5.c
            int r1 = r1 - r0
            r5.g = r1
            return
    }

    public final defpackage.u h() {
            r1 = this;
            java.util.ArrayList r1 = r1.n
            int r0 = r1.size()
            int r0 = r0 + (-1)
            java.lang.Object r1 = r1.get(r0)
            u r1 = (defpackage.u) r1
            return r1
    }

    public final void i(java.lang.String r23) {
            r22 = this;
            r0 = r22
            r1 = r23
            int r2 = r1.length()
            r4 = 0
            r5 = r4
            r6 = 0
        Lb:
            if (r5 >= r2) goto L2c
            char r7 = r1.charAt(r5)
            if (r7 == 0) goto L19
            if (r6 == 0) goto L29
            r6.append(r7)
            goto L29
        L19:
            if (r6 != 0) goto L23
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            r6.append(r1, r4, r5)
        L23:
            r7 = 65533(0xfffd, float:9.1831E-41)
            r6.append(r7)
        L29:
            int r5 = r5 + 1
            goto Lb
        L2c:
            if (r6 == 0) goto L32
            java.lang.String r1 = r6.toString()
        L32:
            r0.a = r1
            r0.b = r4
            r0.c = r4
            r0.d = r4
            java.util.ArrayList r1 = r0.n
            int r2 = r1.size()
            r5 = 1
            java.util.List r2 = r1.subList(r5, r2)
            java.util.Iterator r2 = r2.iterator()
            r6 = r5
        L4a:
            boolean r7 = r2.hasNext()
            r8 = -1
            if (r7 == 0) goto L7a
            java.lang.Object r7 = r2.next()
            u r7 = (defpackage.u) r7
            r0.g()
            b50 r9 = r7.g(r0)
            if (r9 == 0) goto L7a
            boolean r10 = r9.c
            if (r10 == 0) goto L68
            r0.e(r7)
            return
        L68:
            int r7 = r9.a
            if (r7 == r8) goto L70
            r0.k(r7)
            goto L77
        L70:
            int r7 = r9.b
            if (r7 == r8) goto L77
            r0.j(r7)
        L77:
            int r6 = r6 + 1
            goto L4a
        L7a:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r7 = r1.size()
            java.util.List r7 = r1.subList(r6, r7)
            r2.<init>(r7)
            int r6 = r6 - r5
            java.lang.Object r6 = r1.get(r6)
            u r6 = (defpackage.u) r6
            boolean r7 = r2.isEmpty()
            a50 r9 = r6.d()
            boolean r9 = r9 instanceof defpackage.xr4
            if (r9 != 0) goto La3
            boolean r9 = r6.e()
            if (r9 == 0) goto La1
            goto La3
        La1:
            r9 = r4
            goto La4
        La3:
            r9 = r5
        La4:
            if (r9 == 0) goto L5f5
            r0.g()
            boolean r10 = r0.h
            if (r10 != 0) goto Lc0
            int r10 = r0.g
            r11 = 4
            if (r10 >= r11) goto Lc4
            java.lang.CharSequence r10 = r0.a
            int r12 = r0.e
            int r10 = java.lang.Character.codePointAt(r10, r12)
            boolean r10 = java.lang.Character.isLetter(r10)
            if (r10 == 0) goto Lc4
        Lc0:
            r21 = r6
            goto L5ef
        Lc4:
            d51 r10 = new d51
            r12 = 11
            r10.<init>(r6, r12)
            java.util.List r12 = r0.i
            java.util.Iterator r12 = r12.iterator()
        Ld1:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L581
            java.lang.Object r13 = r12.next()
            f50 r13 = (defpackage.f50) r13
            int r13 = r13.a
            r14 = 42
            r16 = r4
            r8 = 32
            r3 = 9
            switch(r13) {
                case 0: goto L52b;
                case 1: goto L4b6;
                case 2: goto L383;
                case 3: goto L32b;
                case 4: goto L2f9;
                case 5: goto L164;
                default: goto Lea;
            }
        Lea:
            int r13 = r0.g
            if (r13 < r11) goto Lf0
            goto L15e
        Lf0:
            int r13 = r0.e
            java.lang.CharSequence r11 = r0.a
            int r5 = r11.length()
            r15 = r16
            r20 = r15
            r21 = r20
        Lfe:
            if (r13 >= r5) goto L131
            char r4 = r11.charAt(r13)
            if (r4 == r3) goto L124
            if (r4 == r8) goto L124
            if (r4 == r14) goto L11d
            r8 = 45
            if (r4 == r8) goto L118
            r8 = 95
            if (r4 == r8) goto L113
            goto L15e
        L113:
            r4 = r20
            int r20 = r4 + 1
            goto L12c
        L118:
            r4 = r20
            int r15 = r15 + 1
            goto L12c
        L11d:
            r4 = r20
            r8 = r21
            int r21 = r8 + 1
            goto L12c
        L124:
            r4 = r20
            r8 = r21
            r20 = r4
            r21 = r8
        L12c:
            int r13 = r13 + 1
            r8 = 32
            goto Lfe
        L131:
            r4 = r20
            r8 = r21
            r13 = 3
            if (r15 < r13) goto L13c
            if (r4 != 0) goto L13c
            if (r8 == 0) goto L148
        L13c:
            if (r4 < r13) goto L142
            if (r15 != 0) goto L142
            if (r8 == 0) goto L148
        L142:
            if (r8 < r13) goto L15e
            if (r15 != 0) goto L15e
            if (r4 != 0) goto L15e
        L148:
            yl1 r3 = new yl1
            r4 = 1
            r3.<init>(r4)
            u[] r5 = new defpackage.u[r4]
            r5[r16] = r3
            j50 r3 = new j50
            r3.<init>(r5)
            int r4 = r11.length()
            r3.a = r4
            goto L15f
        L15e:
            r3 = 0
        L15f:
            r21 = r6
        L161:
            r8 = 4
            goto L575
        L164:
            java.lang.Object r4 = r10.B
            u r4 = (defpackage.u) r4
            int r5 = r0.g
            r8 = 4
            if (r5 < r8) goto L171
            r21 = r6
            goto L278
        L171:
            int r8 = r0.e
            int r11 = r0.c
            int r11 = r11 + r5
            boolean r5 = r4 instanceof defpackage.cs4
            if (r5 == 0) goto L187
            r5 = r4
            cs4 r5 = (defpackage.cs4) r5
            tv3 r5 = r5.b
            java.lang.StringBuilder r5 = r5.b
            int r13 = r5.length()
            if (r13 != 0) goto L188
        L187:
            r5 = 0
        L188:
            if (r5 == 0) goto L18c
            r5 = 1
            goto L18e
        L18c:
            r5 = r16
        L18e:
            java.lang.CharSequence r13 = r0.a
            char r15 = r13.charAt(r8)
            if (r15 == r14) goto L200
            r14 = 43
            if (r15 == r14) goto L200
            r14 = 45
            if (r15 == r14) goto L200
            int r14 = r13.length()
            r15 = r8
            r3 = r16
        L1a5:
            r20 = r5
            if (r15 >= r14) goto L1fc
            char r5 = r13.charAt(r15)
            r21 = r6
            r6 = 41
            if (r5 == r6) goto L1c9
            r6 = 46
            if (r5 == r6) goto L1c9
            switch(r5) {
                case 48: goto L1bb;
                case 49: goto L1bb;
                case 50: goto L1bb;
                case 51: goto L1bb;
                case 52: goto L1bb;
                case 53: goto L1bb;
                case 54: goto L1bb;
                case 55: goto L1bb;
                case 56: goto L1bb;
                case 57: goto L1bb;
                default: goto L1ba;
            }
        L1ba:
            goto L1fe
        L1bb:
            int r3 = r3 + 1
            r5 = 9
            if (r3 <= r5) goto L1c2
            goto L1fe
        L1c2:
            int r15 = r15 + 1
            r5 = r20
            r6 = r21
            goto L1a5
        L1c9:
            r6 = 1
            if (r3 < r6) goto L1fe
            int r3 = r15 + 1
            int r6 = r13.length()
            if (r3 >= r6) goto L1e1
            char r6 = r13.charAt(r3)
            r14 = 9
            if (r6 == r14) goto L1e1
            r14 = 32
            if (r6 == r14) goto L1e1
            goto L1fe
        L1e1:
            java.lang.CharSequence r6 = r13.subSequence(r8, r15)
            java.lang.String r6 = r6.toString()
            ho4 r14 = new ho4
            r14.<init>()
            int r6 = java.lang.Integer.parseInt(r6)
            r14.h = r6
            r14.i = r5
            hw3 r5 = new hw3
            r5.<init>(r14, r3)
            goto L226
        L1fc:
            r21 = r6
        L1fe:
            r5 = 0
            goto L226
        L200:
            r20 = r5
            r21 = r6
            int r3 = r8 + 1
            int r5 = r13.length()
            if (r3 >= r5) goto L219
            char r5 = r13.charAt(r3)
            r14 = 9
            if (r5 == r14) goto L219
            r14 = 32
            if (r5 == r14) goto L219
            goto L1fe
        L219:
            h90 r5 = new h90
            r5.<init>()
            r5.h = r15
            hw3 r6 = new hw3
            r6.<init>(r5, r3)
            r5 = r6
        L226:
            if (r5 != 0) goto L229
            goto L266
        L229:
            gw3 r3 = r5.a
            int r5 = r5.b
            int r6 = r5 - r8
            int r6 = r6 + r11
            int r8 = r13.length()
            r11 = r6
        L235:
            if (r5 >= r8) goto L253
            char r14 = r13.charAt(r5)
            r15 = 9
            if (r14 != r15) goto L248
            int r14 = r11 % 4
            r18 = 4
            int r14 = 4 - r14
            int r14 = r14 + r11
            r11 = r14
            goto L24e
        L248:
            r15 = 32
            if (r14 != r15) goto L251
            int r11 = r11 + 1
        L24e:
            int r5 = r5 + 1
            goto L235
        L251:
            r5 = 1
            goto L255
        L253:
            r5 = r16
        L255:
            if (r20 == 0) goto L268
            boolean r8 = r3 instanceof defpackage.ho4
            if (r8 == 0) goto L264
            r8 = r3
            ho4 r8 = (defpackage.ho4) r8
            int r8 = r8.h
            r13 = 1
            if (r8 == r13) goto L264
            goto L266
        L264:
            if (r5 != 0) goto L268
        L266:
            r5 = 0
            goto L276
        L268:
            if (r5 == 0) goto L26f
            int r5 = r11 - r6
            r8 = 4
            if (r5 <= r8) goto L271
        L26f:
            int r11 = r6 + 1
        L271:
            hw3 r5 = new hw3
            r5.<init>(r3, r11)
        L276:
            if (r5 != 0) goto L27b
        L278:
            r3 = 0
            goto L161
        L27b:
            gw3 r3 = r5.a
            int r5 = r5.b
            rw3 r6 = new rw3
            int r8 = r0.c
            int r8 = r5 - r8
            r6.<init>(r8)
            boolean r8 = r4 instanceof defpackage.iw3
            if (r8 == 0) goto L2d0
            iw3 r4 = (defpackage.iw3) r4
            gw3 r4 = r4.a
            boolean r8 = r4 instanceof defpackage.h90
            if (r8 == 0) goto L2ae
            boolean r8 = r3 instanceof defpackage.h90
            if (r8 == 0) goto L2ae
            h90 r4 = (defpackage.h90) r4
            char r4 = r4.h
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r8 = r3
            h90 r8 = (defpackage.h90) r8
            char r8 = r8.h
            java.lang.Character r8 = java.lang.Character.valueOf(r8)
            boolean r4 = r4.equals(r8)
            goto L2ce
        L2ae:
            boolean r8 = r4 instanceof defpackage.ho4
            if (r8 == 0) goto L2cc
            boolean r8 = r3 instanceof defpackage.ho4
            if (r8 == 0) goto L2cc
            ho4 r4 = (defpackage.ho4) r4
            char r4 = r4.i
            java.lang.Character r4 = java.lang.Character.valueOf(r4)
            r8 = r3
            ho4 r8 = (defpackage.ho4) r8
            char r8 = r8.i
            java.lang.Character r8 = java.lang.Character.valueOf(r8)
            boolean r4 = r4.equals(r8)
            goto L2ce
        L2cc:
            r4 = r16
        L2ce:
            if (r4 != 0) goto L2d2
        L2d0:
            r4 = 1
            goto L2e1
        L2d2:
            r4 = 1
            u[] r3 = new defpackage.u[r4]
            r3[r16] = r6
            j50 r6 = new j50
            r6.<init>(r3)
            r6.b = r5
            r3 = r6
            goto L161
        L2e1:
            iw3 r8 = new iw3
            r8.<init>(r3)
            r3.g = r4
            r3 = 2
            u[] r3 = new defpackage.u[r3]
            r3[r16] = r8
            r3[r4] = r6
            j50 r4 = new j50
            r4.<init>(r3)
            r4.b = r5
            r3 = r4
            goto L161
        L2f9:
            r21 = r6
            int r3 = r0.g
            r8 = 4
            if (r3 < r8) goto L328
            boolean r3 = r0.h
            if (r3 != 0) goto L327
            u r3 = r0.h()
            a50 r3 = r3.d()
            boolean r3 = r3 instanceof defpackage.xr4
            if (r3 != 0) goto L327
            ax2 r3 = new ax2
            r3.<init>()
            r4 = 1
            u[] r5 = new defpackage.u[r4]
            r5[r16] = r3
            j50 r3 = new j50
            r3.<init>(r5)
            int r4 = r0.c
            r8 = 4
            int r4 = r4 + r8
            r3.b = r4
            goto L575
        L327:
            r8 = 4
        L328:
            r3 = 0
            goto L575
        L32b:
            r21 = r6
            r8 = r11
            int r3 = r0.e
            java.lang.CharSequence r4 = r0.a
            int r5 = r0.g
            if (r5 >= r8) goto L278
            char r5 = r4.charAt(r3)
            r6 = 60
            if (r5 != r6) goto L278
            r5 = 1
        L33f:
            r6 = 7
            if (r5 > r6) goto L278
            if (r5 != r6) goto L351
            java.lang.Object r6 = r10.B
            u r6 = (defpackage.u) r6
            a50 r6 = r6.d()
            boolean r6 = r6 instanceof defpackage.xr4
            if (r6 == 0) goto L351
            goto L380
        L351:
            java.util.regex.Pattern[][] r6 = defpackage.az2.e
            r6 = r6[r5]
            r8 = r6[r16]
            r13 = 1
            r6 = r6[r13]
            int r11 = r4.length()
            java.lang.CharSequence r11 = r4.subSequence(r3, r11)
            java.util.regex.Matcher r8 = r8.matcher(r11)
            boolean r8 = r8.find()
            if (r8 == 0) goto L380
            az2 r3 = new az2
            r3.<init>(r6)
            u[] r4 = new defpackage.u[r13]
            r4[r16] = r3
            j50 r3 = new j50
            r3.<init>(r4)
            int r4 = r0.b
            r3.a = r4
            goto L161
        L380:
            int r5 = r5 + 1
            goto L33f
        L383:
            r21 = r6
            r3 = 2
            int r4 = r0.g
            r8 = 4
            if (r4 < r8) goto L38d
            goto L278
        L38d:
            java.lang.CharSequence r4 = r0.a
            int r5 = r0.e
            int r6 = r4.length()
            r8 = 35
            int r6 = defpackage.bl2.S(r8, r5, r6, r4)
            int r6 = r6 - r5
            if (r6 == 0) goto L426
            r11 = 6
            if (r6 <= r11) goto L3a3
            goto L426
        L3a3:
            int r11 = r5 + r6
            int r13 = r4.length()
            if (r11 < r13) goto L3b4
            ax2 r8 = new ax2
            java.lang.String r11 = ""
            r8.<init>(r6, r11)
            goto L427
        L3b4:
            char r13 = r4.charAt(r11)
            r14 = 32
            r15 = 9
            if (r13 == r14) goto L3c2
            if (r13 == r15) goto L3c2
            goto L426
        L3c2:
            int r13 = r4.length()
            r19 = 1
            int r13 = r13 + (-1)
        L3ca:
            if (r13 < r11) goto L3dd
            char r3 = r4.charAt(r13)
            if (r3 == r15) goto L3d5
            if (r3 == r14) goto L3d5
            goto L3df
        L3d5:
            int r13 = r13 + (-1)
            r3 = 2
            r14 = 32
            r15 = 9
            goto L3ca
        L3dd:
            int r13 = r11 + (-1)
        L3df:
            r3 = r13
        L3e0:
            if (r3 < r11) goto L3ec
            char r14 = r4.charAt(r3)
            if (r14 == r8) goto L3e9
            goto L3ee
        L3e9:
            int r3 = r3 + (-1)
            goto L3e0
        L3ec:
            int r3 = r11 + (-1)
        L3ee:
            r8 = r3
        L3ef:
            if (r8 < r11) goto L401
            char r14 = r4.charAt(r8)
            r15 = 9
            if (r14 == r15) goto L3fe
            r15 = 32
            if (r14 == r15) goto L3fe
            goto L403
        L3fe:
            int r8 = r8 + (-1)
            goto L3ef
        L401:
            int r8 = r11 + (-1)
        L403:
            if (r8 == r3) goto L416
            ax2 r3 = new ax2
            int r8 = r8 + 1
            java.lang.CharSequence r8 = r4.subSequence(r11, r8)
            java.lang.String r8 = r8.toString()
            r3.<init>(r6, r8)
            r8 = r3
            goto L427
        L416:
            ax2 r8 = new ax2
            int r13 = r13 + 1
            java.lang.CharSequence r3 = r4.subSequence(r11, r13)
            java.lang.String r3 = r3.toString()
            r8.<init>(r6, r3)
            goto L427
        L426:
            r8 = 0
        L427:
            if (r8 == 0) goto L43c
            r13 = 1
            u[] r3 = new defpackage.u[r13]
            r3[r16] = r8
            j50 r5 = new j50
            r5.<init>(r3)
            int r3 = r4.length()
            r5.a = r3
        L439:
            r3 = r5
            goto L161
        L43c:
            char r3 = r4.charAt(r5)
            r14 = 45
            if (r3 == r14) goto L463
            r6 = 61
            if (r3 == r6) goto L449
            goto L47f
        L449:
            int r3 = r5 + 1
            int r8 = r4.length()
            int r3 = defpackage.bl2.S(r6, r3, r8, r4)
            int r6 = r4.length()
            int r3 = defpackage.bl2.T(r4, r3, r6)
            int r6 = r4.length()
            if (r3 < r6) goto L463
            r3 = 1
            goto L481
        L463:
            int r5 = r5 + 1
            int r3 = r4.length()
            r14 = 45
            int r3 = defpackage.bl2.S(r14, r5, r3, r4)
            int r5 = r4.length()
            int r3 = defpackage.bl2.T(r4, r3, r5)
            int r5 = r4.length()
            if (r3 < r5) goto L47f
            r3 = 2
            goto L481
        L47f:
            r3 = r16
        L481:
            if (r3 <= 0) goto L278
            java.lang.Object r5 = r10.B
            u r5 = (defpackage.u) r5
            boolean r6 = r5 instanceof defpackage.cs4
            if (r6 == 0) goto L497
            cs4 r5 = (defpackage.cs4) r5
            tv3 r5 = r5.b
            java.lang.StringBuilder r5 = r5.b
            int r6 = r5.length()
            if (r6 != 0) goto L498
        L497:
            r5 = 0
        L498:
            if (r5 == 0) goto L278
            java.lang.String r5 = r5.toString()
            ax2 r6 = new ax2
            r6.<init>(r3, r5)
            r13 = 1
            u[] r3 = new defpackage.u[r13]
            r3[r16] = r6
            j50 r5 = new j50
            r5.<init>(r3)
            int r3 = r4.length()
            r5.a = r3
            r5.c = r13
            goto L439
        L4b6:
            r21 = r6
            int r3 = r0.g
            r8 = 4
            if (r3 < r8) goto L4bf
            goto L278
        L4bf:
            int r4 = r0.e
            java.lang.CharSequence r5 = r0.a
            int r6 = r5.length()
            r8 = r4
            r11 = r16
            r13 = r11
        L4cb:
            r14 = 126(0x7e, float:1.77E-43)
            r15 = 96
            r17 = r4
            if (r8 >= r6) goto L4db
            char r4 = r5.charAt(r8)
            if (r4 == r15) goto L4e0
            if (r4 == r14) goto L4dd
        L4db:
            r4 = 3
            goto L4e7
        L4dd:
            int r13 = r13 + 1
            goto L4e2
        L4e0:
            int r11 = r11 + 1
        L4e2:
            int r8 = r8 + 1
            r4 = r17
            goto L4cb
        L4e7:
            if (r11 < r4) goto L50a
            if (r13 != 0) goto L509
            int r4 = r17 + r11
            int r6 = r5.length()
        L4f1:
            if (r4 >= r6) goto L4fe
            char r8 = r5.charAt(r4)
            if (r8 != r15) goto L4fb
        L4f9:
            r5 = -1
            goto L500
        L4fb:
            int r4 = r4 + 1
            goto L4f1
        L4fe:
            r4 = -1
            goto L4f9
        L500:
            if (r4 == r5) goto L503
            goto L514
        L503:
            ia2 r4 = new ia2
            r4.<init>(r15, r11, r3)
            goto L515
        L509:
            r4 = 3
        L50a:
            if (r13 < r4) goto L514
            if (r11 != 0) goto L514
            ia2 r4 = new ia2
            r4.<init>(r14, r13, r3)
            goto L515
        L514:
            r4 = 0
        L515:
            if (r4 == 0) goto L278
            r13 = 1
            u[] r3 = new defpackage.u[r13]
            r3[r16] = r4
            j50 r5 = new j50
            r5.<init>(r3)
            ha2 r3 = r4.a
            int r3 = r3.h
            int r4 = r17 + r3
            r5.a = r4
            goto L439
        L52b:
            r21 = r6
            int r3 = r0.e
            java.lang.CharSequence r4 = r0.a
            int r5 = r0.g
            r8 = 4
            if (r5 >= r8) goto L328
            int r5 = r4.length()
            if (r3 >= r5) goto L328
            char r4 = r4.charAt(r3)
            r5 = 62
            if (r4 != r5) goto L328
            int r4 = r0.c
            int r5 = r0.g
            int r4 = r4 + r5
            int r5 = r4 + 1
            java.lang.CharSequence r6 = r0.a
            int r3 = r3 + 1
            int r11 = r6.length()
            if (r3 >= r11) goto L564
            char r3 = r6.charAt(r3)
            r15 = 9
            if (r3 == r15) goto L562
            r14 = 32
            if (r3 == r14) goto L562
            goto L564
        L562:
            int r5 = r4 + 2
        L564:
            g50 r3 = new g50
            r3.<init>()
            r13 = 1
            u[] r4 = new defpackage.u[r13]
            r4[r16] = r3
            j50 r3 = new j50
            r3.<init>(r4)
            r3.b = r5
        L575:
            if (r3 == 0) goto L578
            goto L586
        L578:
            r11 = r8
            r4 = r16
            r6 = r21
            r5 = 1
            r8 = -1
            goto Ld1
        L581:
            r16 = r4
            r21 = r6
            r3 = 0
        L586:
            if (r3 != 0) goto L58f
            int r1 = r0.e
            r0.k(r1)
            goto L5f7
        L58f:
            if (r7 != 0) goto L595
            r0.f(r2)
            r7 = 1
        L595:
            int r4 = r3.a
            r5 = -1
            if (r4 == r5) goto L59e
            r0.k(r4)
            goto L5a5
        L59e:
            int r4 = r3.b
            if (r4 == r5) goto L5a5
            r0.j(r4)
        L5a5:
            boolean r4 = r3.c
            if (r4 == 0) goto L5cf
            u r4 = r0.h()
            int r6 = r1.size()
            r19 = 1
            int r6 = r6 + (-1)
            r1.remove(r6)
            java.util.LinkedHashSet r6 = r0.o
            r6.remove(r4)
            boolean r6 = r4 instanceof defpackage.cs4
            if (r6 == 0) goto L5c7
            r6 = r4
            cs4 r6 = (defpackage.cs4) r6
            r0.b(r6)
        L5c7:
            a50 r4 = r4.d()
            r4.j()
            goto L5d1
        L5cf:
            r19 = 1
        L5d1:
            java.io.Serializable r3 = r3.d
            u[] r3 = (defpackage.u[]) r3
            int r4 = r3.length
            r8 = r16
            r6 = r21
        L5da:
            if (r8 >= r4) goto L5e8
            r6 = r3[r8]
            r0.a(r6)
            boolean r9 = r6.e()
            int r8 = r8 + 1
            goto L5da
        L5e8:
            r8 = r5
            r4 = r16
            r5 = r19
            goto La4
        L5ef:
            int r1 = r0.e
            r0.k(r1)
            goto L5f7
        L5f5:
            r21 = r6
        L5f7:
            if (r7 != 0) goto L60c
            boolean r1 = r0.h
            if (r1 != 0) goto L60c
            u r1 = r0.h()
            r1.getClass()
            boolean r1 = r1 instanceof defpackage.cs4
            if (r1 == 0) goto L60c
            r0.c()
            return
        L60c:
            if (r7 != 0) goto L611
            r0.f(r2)
        L611:
            boolean r1 = r21.e()
            if (r1 != 0) goto L61b
            r0.c()
            return
        L61b:
            boolean r1 = r0.h
            if (r1 != 0) goto L62a
            cs4 r1 = new cs4
            r1.<init>()
            r0.a(r1)
            r0.c()
        L62a:
            return
    }

    public final void j(int r4) {
            r3 = this;
            int r0 = r3.f
            if (r4 < r0) goto La
            int r1 = r3.e
            r3.b = r1
            r3.c = r0
        La:
            java.lang.CharSequence r0 = r3.a
            int r0 = r0.length()
        L10:
            int r1 = r3.c
            if (r1 >= r4) goto L1c
            int r2 = r3.b
            if (r2 == r0) goto L1c
            r3.d()
            goto L10
        L1c:
            if (r1 <= r4) goto L29
            int r0 = r3.b
            r1 = 1
            int r0 = r0 - r1
            r3.b = r0
            r3.c = r4
            r3.d = r1
            return
        L29:
            r4 = 0
            r3.d = r4
            return
    }

    public final void k(int r3) {
            r2 = this;
            int r0 = r2.e
            if (r3 < r0) goto La
            r2.b = r0
            int r0 = r2.f
            r2.c = r0
        La:
            java.lang.CharSequence r0 = r2.a
            int r0 = r0.length()
        L10:
            int r1 = r2.b
            if (r1 >= r3) goto L1a
            if (r1 == r0) goto L1a
            r2.d()
            goto L10
        L1a:
            r3 = 0
            r2.d = r3
            return
    }
}
