package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fp5  reason: default package */
/* loaded from: classes.dex */
public abstract class fp5 {
    public static final defpackage.xh5 a = null;
    public static final defpackage.xh5 b = null;
    public static final defpackage.xh5 c = null;
    public static final defpackage.xh5 d = null;
    public static final defpackage.xh5 e = null;
    public static final defpackage.xh5 f = null;
    public static final defpackage.xh5 g = null;
    public static final defpackage.xh5 h = null;

    static {
            xh5 r0 = new xh5
            yh5 r1 = defpackage.yh5.IGNORE_CASE
            java.lang.String r2 = "shader\\d+"
            r0.<init>(r2, r1)
            defpackage.fp5.a = r0
            xh5 r0 = new xh5
            yh5 r2 = defpackage.yh5.MULTILINE
            java.util.Set r3 = defpackage.ii2.R(r2)
            java.lang.String r4 = "^\\s*#\\s*include\\s+\"([^\"]+)\""
            r0.<init>(r4, r3)
            defpackage.fp5.b = r0
            xh5 r0 = new xh5
            java.lang.String r3 = "^\\s*#\\s*reference\\s+\"?([^\"\\r\\n]+)\"?"
            java.util.Set r2 = defpackage.ii2.R(r2)
            r0.<init>(r3, r2)
            defpackage.fp5.c = r0
            xh5 r0 = new xh5
            java.lang.String r2 = "sourcesize\\.(?:xy|x|y)\\s*[^;\\n]*outputsize\\.zw|outputsize\\.zw\\s*[^;\\n]*sourcesize\\.(?:xy|x|y)"
            r0.<init>(r2, r1)
            defpackage.fp5.d = r0
            xh5 r0 = new xh5
            java.lang.String r2 = "originalsize\\.(?:xy|x|y)\\s*[^;\\n]*outputsize\\.zw|outputsize\\.zw\\s*[^;\\n]*originalsize\\.(?:xy|x|y)"
            r0.<init>(r2, r1)
            defpackage.fp5.e = r0
            xh5 r0 = new xh5
            java.lang.String r2 = "outputsize\\.xy\\s*[^;\\n]*(?:sourcesize|originalsize)\\.zw|(?:sourcesize|originalsize)\\.zw\\s*[^;\\n]*outputsize\\.xy"
            r0.<init>(r2, r1)
            defpackage.fp5.f = r0
            xh5 r0 = new xh5
            java.lang.String r2 = "(?:fract|floor)\\s*\\([^;\\n]*sourcesize\\.xy|sourcesize\\.xy\\s*[^;\\n]*(?:fract|floor)"
            r0.<init>(r2, r1)
            defpackage.fp5.g = r0
            xh5 r0 = new xh5
            java.lang.String r2 = "(?:fract|floor|sin|modf)\\s*\\([^;\\n]*originalsize\\.xy|originalsize\\.xy\\s*[^;\\n]*(?:fract|floor|sin|modf)"
            r0.<init>(r2, r1)
            defpackage.fp5.h = r0
            return
    }

    public static java.util.List a(java.lang.String r3) {
            xh5 r0 = defpackage.fp5.b
            qd2 r3 = defpackage.xh5.a(r0, r3)
            gn5 r0 = new gn5
            r1 = 3
            r0.<init>(r1)
            pc2 r3 = defpackage.sb6.b0(r3, r0)
            gn5 r0 = new gn5
            r1 = 4
            r0.<init>(r1)
            pc2 r1 = new pc2
            r2 = 1
            r1.<init>(r3, r2, r0)
            java.util.List r3 = defpackage.sb6.c0(r1)
            return r3
    }

    public static java.util.LinkedHashMap b(java.lang.String r6) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r6.length()
            if (r1 >= r2) goto Lf9
            char r2 = r6.charAt(r1)
            r3 = 35
            if (r2 != r3) goto L2f
            r2 = 10
            r3 = 4
            int r1 = defpackage.qs6.s0(r2, r1, r3, r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            if (r1 < 0) goto L22
            goto L23
        L22:
            r2 = 0
        L23:
            if (r2 == 0) goto L2a
            int r1 = r2.intValue()
            goto L6
        L2a:
            int r1 = r6.length()
            goto L6
        L2f:
            boolean r4 = java.lang.Character.isLetterOrDigit(r2)
            r5 = 95
            if (r4 != 0) goto L3c
            if (r2 == r5) goto L3c
            int r1 = r1 + 1
            goto L6
        L3c:
            r2 = r1
        L3d:
            int r4 = r6.length()
            if (r2 >= r4) goto L56
            char r4 = r6.charAt(r2)
            boolean r4 = java.lang.Character.isLetterOrDigit(r4)
            if (r4 != 0) goto L53
            char r4 = r6.charAt(r2)
            if (r4 != r5) goto L56
        L53:
            int r2 = r2 + 1
            goto L3d
        L56:
            java.lang.String r1 = r6.substring(r1, r2)
        L5a:
            int r4 = r6.length()
            if (r2 >= r4) goto L6d
            char r4 = r6.charAt(r2)
            boolean r4 = defpackage.g04.J(r4)
            if (r4 == 0) goto L6d
            int r2 = r2 + 1
            goto L5a
        L6d:
            int r4 = r6.length()
            if (r2 >= r4) goto Lf6
            char r4 = r6.charAt(r2)
            r5 = 61
            if (r4 == r5) goto L7d
            goto Lf6
        L7d:
            int r2 = r2 + 1
            int r4 = r6.length()
            if (r2 >= r4) goto L90
            char r4 = r6.charAt(r2)
            boolean r4 = defpackage.g04.J(r4)
            if (r4 == 0) goto L90
            goto L7d
        L90:
            int r4 = r6.length()
            if (r2 >= r4) goto Lc3
            char r4 = r6.charAt(r2)
            r5 = 34
            if (r4 != r5) goto Lc3
            int r2 = r2 + 1
            r3 = r2
        La1:
            int r4 = r6.length()
            if (r3 >= r4) goto Lb0
            char r4 = r6.charAt(r3)
            if (r4 == r5) goto Lb0
            int r3 = r3 + 1
            goto La1
        Lb0:
            java.lang.String r2 = r6.substring(r2, r3)
            int r4 = r6.length()
            if (r3 >= r4) goto Le2
            char r4 = r6.charAt(r3)
            if (r4 != r5) goto Le2
            int r3 = r3 + 1
            goto Le2
        Lc3:
            r4 = r2
        Lc4:
            int r5 = r6.length()
            if (r4 >= r5) goto Ldd
            char r5 = r6.charAt(r4)
            boolean r5 = defpackage.g04.J(r5)
            if (r5 != 0) goto Ldd
            char r5 = r6.charAt(r4)
            if (r5 == r3) goto Ldd
            int r4 = r4 + 1
            goto Lc4
        Ldd:
            java.lang.String r2 = r6.substring(r2, r4)
            r3 = r4
        Le2:
            java.lang.CharSequence r2 = defpackage.qs6.T0(r2)
            java.lang.String r2 = r2.toString()
            boolean r4 = defpackage.qs6.v0(r1)
            if (r4 != 0) goto Lf3
            r0.put(r1, r2)
        Lf3:
            r1 = r3
            goto L6
        Lf6:
            r1 = r2
            goto L6
        Lf9:
            return r0
    }

    public static int c(java.util.LinkedHashMap r1) {
            java.lang.String r0 = "shaders"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L18
            java.lang.Integer r0 = defpackage.xs6.h0(r0)
            if (r0 == 0) goto L18
            int r1 = r0.intValue()
            if (r1 >= 0) goto L17
            r1 = 0
        L17:
            return r1
        L18:
            java.util.ArrayList r1 = e(r1)
            int r1 = r1.size()
            return r1
    }

    public static java.lang.String d(java.lang.String r11, java.lang.String r12) {
            r11.getClass()
            r12.getClass()
            r0 = 92
            r1 = 47
            java.lang.String r12 = r12.replace(r0, r1)
            r12.getClass()
            java.lang.CharSequence r12 = defpackage.qs6.T0(r12)
            java.lang.String r12 = r12.toString()
            r0 = 1
            char[] r2 = new char[r0]
            r3 = 34
            r4 = 0
            r2[r4] = r3
            java.lang.String r12 = defpackage.qs6.U0(r12, r2)
            boolean r2 = defpackage.qs6.v0(r12)
            if (r2 != 0) goto Lcc
            boolean r2 = defpackage.qs6.L0(r12, r1)
            if (r2 != 0) goto Lcc
            java.lang.String r2 = "://"
            boolean r2 = defpackage.qs6.j0(r12, r2, r4)
            if (r2 == 0) goto L3b
            goto Lcc
        L3b:
            pu r5 = new pu
            r5.<init>()
            java.lang.String r2 = ""
            java.lang.String r11 = defpackage.qs6.R0(r1, r11, r2)
            char[] r2 = new char[r0]
            r2[r4] = r1
            r3 = 6
            java.util.List r11 = defpackage.qs6.J0(r11, r2, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r11 = r11.iterator()
        L58:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L6f
            java.lang.Object r6 = r11.next()
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = defpackage.qs6.v0(r7)
            if (r7 != 0) goto L58
            r2.add(r6)
            goto L58
        L6f:
            int r11 = r2.size()
            r6 = r4
        L74:
            if (r6 >= r11) goto L82
            java.lang.Object r7 = r2.get(r6)
            int r6 = r6 + 1
            java.lang.String r7 = (java.lang.String) r7
            r5.addLast(r7)
            goto L74
        L82:
            char[] r11 = new char[r0]
            r11[r4] = r1
            java.util.List r11 = defpackage.qs6.J0(r12, r11, r3)
            java.util.Iterator r11 = r11.iterator()
        L8e:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lc0
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            boolean r0 = defpackage.qs6.v0(r12)
            if (r0 != 0) goto L8e
            java.lang.String r0 = "."
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto La9
            goto L8e
        La9:
            java.lang.String r0 = ".."
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto Lbc
            boolean r12 = r5.isEmpty()
            if (r12 == 0) goto Lb8
            goto Lcc
        Lb8:
            r5.removeLast()
            goto L8e
        Lbc:
            r5.addLast(r12)
            goto L8e
        Lc0:
            r9 = 0
            r10 = 62
            java.lang.String r6 = "/"
            r7 = 0
            r8 = 0
            java.lang.String r11 = defpackage.gt0.P0(r5, r6, r7, r8, r9, r10)
            return r11
        Lcc:
            r11 = 0
            return r11
    }

    public static java.util.ArrayList e(java.util.LinkedHashMap r5) {
            java.util.Set r5 = r5.entrySet()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        Lf:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r5.next()
            r2 = r1
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            xh5 r3 = defpackage.fp5.a
            boolean r2 = r3.d(r2)
            if (r2 == 0) goto Lf
            r0.add(r1)
            goto Lf
        L2e:
            zh2 r5 = new zh2
            r1 = 29
            r5.<init>(r1)
            java.util.List r5 = defpackage.gt0.d1(r0, r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.ht0.v0(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L48:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto L48
        L5e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r1 = r0.size()
            r2 = 0
        L68:
            if (r2 >= r1) goto L7d
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = defpackage.qs6.v0(r4)
            if (r4 != 0) goto L68
            r5.add(r3)
            goto L68
        L7d:
            return r5
    }

    public static java.util.List f(java.util.LinkedHashMap r7) {
            java.lang.String r0 = "textures"
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L9c
            r1 = 1
            char[] r1 = new char[r1]
            r2 = 59
            r3 = 0
            r1[r3] = r2
            r2 = 6
            java.util.List r0 = defpackage.qs6.J0(r0, r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ht0.v0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = defpackage.qs6.T0(r2)
            java.lang.String r2 = r2.toString()
            r1.add(r2)
            goto L26
        L3e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r1.size()
            r4 = r3
        L48:
            if (r4 >= r2) goto L5d
            java.lang.Object r5 = r1.get(r4)
            int r4 = r4 + 1
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = defpackage.qs6.v0(r6)
            if (r6 != 0) goto L48
            r0.add(r5)
            goto L48
        L5d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.size()
            r4 = r3
        L67:
            if (r4 >= r2) goto L7d
            java.lang.Object r5 = r0.get(r4)
            int r4 = r4 + 1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r7.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L67
            r1.add(r5)
            goto L67
        L7d:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r0 = r1.size()
        L86:
            if (r3 >= r0) goto L9b
            java.lang.Object r2 = r1.get(r3)
            int r3 = r3 + 1
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = defpackage.qs6.v0(r4)
            if (r4 != 0) goto L86
            r7.add(r2)
            goto L86
        L9b:
            return r7
        L9c:
            yt1 r7 = defpackage.yt1.A
            return r7
    }

    public static defpackage.ep5 g(java.lang.String r10, defpackage.qn2 r11) {
            r10.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            pu r1 = new pu
            java.util.List r10 = defpackage.hf.b0(r10)
            r1.<init>(r10)
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
        L16:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L80
            int r2 = r0.size()
            r3 = 16
            if (r2 >= r3) goto L80
            java.lang.Object r2 = r1.removeFirst()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r10.add(r2)
            if (r3 != 0) goto L31
            goto L16
        L31:
            java.lang.Object r3 = r11.g(r2)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L3a
            goto L16
        L3a:
            dp5 r4 = new dp5
            java.util.LinkedHashMap r5 = b(r3)
            r4.<init>(r2, r5)
            r0.add(r4)
            xh5 r4 = defpackage.fp5.c
            qd2 r3 = defpackage.xh5.a(r4, r3)
            gn5 r4 = new gn5
            r5 = 5
            r4.<init>(r5)
            pc2 r3 = defpackage.sb6.b0(r3, r4)
            gn5 r4 = new gn5
            r5 = 6
            r4.<init>(r5)
            pc2 r5 = new pc2
            r6 = 1
            r5.<init>(r3, r6, r4)
            java.util.List r3 = defpackage.sb6.c0(r5)
            java.util.Iterator r3 = r3.iterator()
        L6a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L16
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = d(r2, r4)
            if (r4 == 0) goto L6a
            r1.addLast(r4)
            goto L6a
        L80:
            boolean r10 = r0.isEmpty()
            if (r10 == 0) goto L8a
            yt1 r10 = defpackage.yt1.A
            goto L16e
        L8a:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L95:
            if (r3 >= r1) goto Lcc
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            dp5 r4 = (defpackage.dp5) r4
            java.util.LinkedHashMap r5 = r4.b
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        La9:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L95
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r6.getValue()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r8 = r4.a
            vr4 r9 = new vr4
            r9.<init>(r6, r8)
            r10.putIfAbsent(r7, r9)
            goto La9
        Lcc:
            java.lang.String r0 = "shaders"
            java.lang.Object r0 = r10.get(r0)
            vr4 r0 = (defpackage.vr4) r0
            r1 = 0
            if (r0 == 0) goto Lf0
            java.lang.Object r0 = r0.A
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lf0
            java.lang.Integer r0 = defpackage.xs6.h0(r0)
            if (r0 == 0) goto Lf0
            int r0 = r0.intValue()
            if (r0 >= 0) goto Lea
            goto Leb
        Lea:
            r2 = r0
        Leb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto Lf1
        Lf0:
            r0 = r1
        Lf1:
            java.util.Set r2 = r10.keySet()
            r2.getClass()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L103:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L11f
            java.lang.Object r4 = r2.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            xh5 r6 = defpackage.fp5.a
            boolean r5 = r6.d(r5)
            if (r5 == 0) goto L103
            r3.add(r4)
            goto L103
        L11f:
            zh2 r2 = new zh2
            r4 = 28
            r2.<init>(r4)
            java.util.List r2 = defpackage.gt0.d1(r3, r2)
            if (r0 == 0) goto L134
            int r0 = r0.intValue()
            java.util.List r2 = defpackage.gt0.e1(r2, r0)
        L134:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L13d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L16d
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = defpackage.c14.j0(r10, r3)
            vr4 r3 = (defpackage.vr4) r3
            java.lang.Object r4 = r3.A
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.B
            java.lang.String r3 = (java.lang.String) r3
            boolean r5 = defpackage.qs6.v0(r4)
            if (r5 != 0) goto L15e
            goto L15f
        L15e:
            r4 = r1
        L15f:
            if (r4 == 0) goto L166
            java.lang.String r3 = d(r3, r4)
            goto L167
        L166:
            r3 = r1
        L167:
            if (r3 == 0) goto L13d
            r0.add(r3)
            goto L13d
        L16d:
            r10 = r0
        L16e:
            pu r0 = new pu
            r0.<init>(r10)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r2 = 0
        L17a:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L1ba
            java.lang.Object r4 = r0.removeFirst()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = r1.add(r4)
            if (r5 != 0) goto L18d
            goto L17a
        L18d:
            java.lang.Object r5 = r11.g(r4)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L196
            goto L17a
        L196:
            int r6 = r5.length()
            long r6 = (long) r6
            long r2 = r2 + r6
            java.util.List r5 = a(r5)
            java.util.Iterator r5 = r5.iterator()
        L1a4:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L17a
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = d(r4, r6)
            if (r6 == 0) goto L1a4
            r0.addLast(r6)
            goto L1a4
        L1ba:
            ep5 r11 = new ep5
            int r10 = r10.size()
            r11.<init>(r10, r2)
            return r11
    }
}
