package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fc4  reason: default package */
/* loaded from: classes.dex */
public final class fc4 {
    public static final defpackage.xh5 m = null;
    public static final defpackage.xh5 n = null;
    public static final defpackage.xh5 o = null;
    public static final defpackage.xh5 p = null;
    public static final defpackage.xh5 q = null;
    public static final defpackage.xh5 r = null;
    public final java.lang.String a;
    public final java.util.ArrayList b;
    public final java.lang.String c;
    public final defpackage.ex6 d;
    public final defpackage.ex6 e;
    public final defpackage.go3 f;
    public boolean g;
    public final defpackage.go3 h;
    public final defpackage.go3 i;
    public final defpackage.go3 j;
    public final defpackage.ex6 k;
    public final boolean l;

    static {
            xh5 r0 = new xh5
            java.lang.String r1 = "^[a-zA-Z]+[+\\w\\-.]*:"
            r0.<init>(r1)
            defpackage.fc4.m = r0
            xh5 r0 = new xh5
            java.lang.String r1 = "\\{(.+?)\\}"
            r0.<init>(r1)
            defpackage.fc4.n = r0
            xh5 r0 = new xh5
            java.lang.String r1 = "http[s]?://"
            r0.<init>(r1)
            defpackage.fc4.o = r0
            xh5 r0 = new xh5
            java.lang.String r1 = ".*"
            r0.<init>(r1)
            defpackage.fc4.p = r0
            xh5 r0 = new xh5
            java.lang.String r1 = "([^/]*?|)"
            r0.<init>(r1)
            defpackage.fc4.q = r0
            xh5 r0 = new xh5
            java.lang.String r1 = "^[^?#]+\\?([^#]*).*"
            r0.<init>(r1)
            defpackage.fc4.r = r0
            return
    }

    public fc4(java.lang.String r7) {
            r6 = this;
            r6.<init>()
            r6.a = r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.b = r0
            cc4 r1 = new cc4
            r2 = 0
            r1.<init>(r6, r2)
            ex6 r3 = new ex6
            r3.<init>(r1)
            r6.d = r3
            cc4 r1 = new cc4
            r3 = 1
            r1.<init>(r6, r3)
            ex6 r4 = new ex6
            r4.<init>(r1)
            r6.e = r4
            xr3 r1 = defpackage.xr3.NONE
            cc4 r4 = new cc4
            r5 = 2
            r4.<init>(r6, r5)
            go3 r4 = defpackage.kj2.M(r1, r4)
            r6.f = r4
            cc4 r4 = new cc4
            r5 = 3
            r4.<init>(r6, r5)
            go3 r4 = defpackage.kj2.M(r1, r4)
            r6.h = r4
            cc4 r4 = new cc4
            r5 = 4
            r4.<init>(r6, r5)
            go3 r4 = defpackage.kj2.M(r1, r4)
            r6.i = r4
            cc4 r4 = new cc4
            r5 = 5
            r4.<init>(r6, r5)
            go3 r1 = defpackage.kj2.M(r1, r4)
            r6.j = r1
            cc4 r1 = new cc4
            r4 = 6
            r1.<init>(r6, r4)
            ex6 r4 = new ex6
            r4.<init>(r1)
            r6.k = r4
            cc4 r1 = new cc4
            r4 = 7
            r1.<init>(r6, r4)
            ex6 r4 = new ex6
            r4.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "^"
            r1.<init>(r4)
            xh5 r4 = defpackage.fc4.m
            java.util.regex.Pattern r4 = r4.A
            java.util.regex.Matcher r4 = r4.matcher(r7)
            boolean r4 = r4.find()
            if (r4 != 0) goto L93
            xh5 r4 = defpackage.fc4.o
            java.util.regex.Pattern r4 = r4.A
            java.lang.String r4 = r4.pattern()
            r4.getClass()
            r1.append(r4)
        L93:
            java.lang.String r4 = "(\\?|#|$)"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            r4.getClass()
            java.util.regex.Matcher r4 = r4.matcher(r7)
            r4.getClass()
            n14 r4 = defpackage.kn2.k(r4, r2, r7)
            if (r4 == 0) goto Lda
            l93 r4 = r4.b()
            int r4 = r4.A
            java.lang.String r7 = r7.substring(r2, r4)
            a(r7, r0, r1)
            xh5 r7 = defpackage.fc4.p
            java.util.regex.Pattern r7 = r7.A
            java.util.regex.Matcher r7 = r7.matcher(r1)
            boolean r7 = r7.find()
            if (r7 != 0) goto Ld3
            xh5 r7 = defpackage.fc4.q
            java.util.regex.Pattern r7 = r7.A
            java.util.regex.Matcher r7 = r7.matcher(r1)
            boolean r7 = r7.find()
            if (r7 != 0) goto Ld3
            r2 = r3
        Ld3:
            r6.l = r2
            java.lang.String r7 = "($|(\\?(.)*)|(#(.)*))"
            r1.append(r7)
        Lda:
            java.lang.String r7 = r1.toString()
            java.lang.String r7 = h(r7)
            r6.c = r7
            return
    }

    public static void a(java.lang.String r4, java.util.ArrayList r5, java.lang.StringBuilder r6) {
            xh5 r0 = defpackage.fc4.n
            r0.getClass()
            java.util.regex.Pattern r0 = r0.A
            java.util.regex.Matcher r0 = r0.matcher(r4)
            r0.getClass()
            r1 = 0
            n14 r0 = defpackage.kn2.k(r0, r1, r4)
        L13:
            if (r0 == 0) goto L5a
            m14 r2 = r0.c
            r3 = 1
            k14 r2 = r2.b(r3)
            r2.getClass()
            java.lang.String r2 = r2.a
            r5.add(r2)
            l93 r2 = r0.b()
            int r2 = r2.A
            if (r2 <= r1) goto L40
            l93 r2 = r0.b()
            int r2 = r2.A
            java.lang.String r1 = r4.substring(r1, r2)
            java.lang.String r1 = java.util.regex.Pattern.quote(r1)
            r1.getClass()
            r6.append(r1)
        L40:
            xh5 r1 = defpackage.fc4.q
            java.util.regex.Pattern r1 = r1.A
            java.lang.String r1 = r1.pattern()
            r1.getClass()
            r6.append(r1)
            l93 r1 = r0.b()
            int r1 = r1.B
            int r1 = r1 + r3
            n14 r0 = r0.c()
            goto L13
        L5a:
            int r5 = r4.length()
            if (r1 >= r5) goto L6e
            java.lang.String r4 = r4.substring(r1)
            java.lang.String r4 = java.util.regex.Pattern.quote(r4)
            r4.getClass()
            r6.append(r4)
        L6e:
            return
    }

    public static void g(android.os.Bundle r0, java.lang.String r1, java.lang.String r2, defpackage.rb4 r3) {
            if (r3 == 0) goto Lf
            fd4 r3 = r3.a
            r1.getClass()
            java.lang.Object r2 = r3.d(r2)
            r3.e(r0, r1, r2)
            return
        Lf:
            r1.getClass()
            r0.putString(r1, r2)
            return
    }

    public static java.lang.String h(java.lang.String r3) {
            java.lang.String r0 = "\\Q"
            r1 = 0
            boolean r0 = defpackage.qs6.j0(r3, r0, r1)
            java.lang.String r2 = ".*"
            if (r0 == 0) goto L1a
            java.lang.String r0 = "\\E"
            boolean r0 = defpackage.qs6.j0(r3, r0, r1)
            if (r0 == 0) goto L1a
            java.lang.String r0 = "\\E.*\\Q"
            java.lang.String r3 = defpackage.xs6.e0(r3, r2, r0)
            return r3
        L1a:
            java.lang.String r0 = "\\.\\*"
            boolean r1 = defpackage.qs6.j0(r3, r0, r1)
            if (r1 == 0) goto L26
            java.lang.String r3 = defpackage.xs6.e0(r3, r0, r2)
        L26:
            return r3
    }

    public final int b(android.net.Uri r1) {
            r0 = this;
            if (r1 == 0) goto L1c
            java.util.List r1 = r1.getPathSegments()
            java.lang.String r0 = r0.a
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r0.getClass()
            java.util.List r0 = r0.getPathSegments()
            java.util.LinkedHashSet r0 = defpackage.gt0.M0(r1, r0)
            int r0 = r0.size()
            return r0
        L1c:
            r0 = 0
            return r0
    }

    public final java.util.ArrayList c() {
            r3 = this;
            go3 r0 = r3.f
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.util.Collection r0 = r0.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.next()
            ec4 r2 = (defpackage.ec4) r2
            java.util.ArrayList r2 = r2.b
            defpackage.gt0.A0(r1, r2)
            goto L17
        L29:
            java.util.ArrayList r0 = r3.b
            java.util.ArrayList r0 = defpackage.gt0.V0(r0, r1)
            go3 r3 = r3.i
            java.lang.Object r3 = r3.getValue()
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r3 = defpackage.gt0.V0(r0, r3)
            return r3
    }

    public final android.os.Bundle d(android.net.Uri r9, java.util.LinkedHashMap r10) {
            r8 = this;
            r9.getClass()
            r10.getClass()
            ex6 r0 = r8.d
            java.lang.Object r0 = r0.getValue()
            xh5 r0 = (defpackage.xh5) r0
            r1 = 0
            if (r0 == 0) goto Lc5
            java.lang.String r2 = r9.toString()
            n14 r0 = r0.c(r2)
            if (r0 != 0) goto L1d
            goto Lc5
        L1d:
            r2 = 0
            vr4[] r3 = new defpackage.vr4[r2]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r2)
            vr4[] r3 = (defpackage.vr4[]) r3
            android.os.Bundle r3 = defpackage.jw2.l(r3)
            boolean r0 = r8.e(r0, r3, r10)
            if (r0 != 0) goto L32
            goto Lc5
        L32:
            ex6 r0 = r8.e
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L48
            boolean r0 = r8.f(r9, r3, r10)
            if (r0 != 0) goto L48
            goto Lc5
        L48:
            java.lang.String r9 = r9.getFragment()
            ex6 r0 = r8.k
            java.lang.Object r0 = r0.getValue()
            xh5 r0 = (defpackage.xh5) r0
            if (r0 == 0) goto Lb4
            java.lang.String r9 = java.lang.String.valueOf(r9)
            n14 r9 = r0.c(r9)
            if (r9 != 0) goto L61
            goto Lb4
        L61:
            go3 r8 = r8.i
            java.lang.Object r8 = r8.getValue()
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.ht0.v0(r8, r4)
            r0.<init>(r4)
            java.util.Iterator r8 = r8.iterator()
            r4 = r2
        L79:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto Lb4
            java.lang.Object r5 = r8.next()
            int r6 = r4 + 1
            if (r4 < 0) goto Lb0
            java.lang.String r5 = (java.lang.String) r5
            m14 r4 = r9.c
            k14 r4 = r4.b(r6)
            if (r4 == 0) goto L9b
            java.lang.String r4 = r4.a
            java.lang.String r4 = android.net.Uri.decode(r4)
            r4.getClass()
            goto L9c
        L9b:
            r4 = r1
        L9c:
            if (r4 != 0) goto La0
            java.lang.String r4 = ""
        La0:
            java.lang.Object r7 = r10.get(r5)
            rb4 r7 = (defpackage.rb4) r7
            g(r3, r5, r4, r7)     // Catch: java.lang.IllegalArgumentException -> Lb4
            jg7 r4 = defpackage.jg7.a
            r0.add(r4)
            r4 = r6
            goto L79
        Lb0:
            defpackage.hf.q0()
            throw r1
        Lb4:
            dc4 r8 = new dc4
            r8.<init>(r2, r3)
            java.util.ArrayList r8 = defpackage.xk2.C(r10, r8)
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto Lc4
            goto Lc5
        Lc4:
            return r3
        Lc5:
            return r1
    }

    public final boolean e(defpackage.n14 r9, android.os.Bundle r10, java.util.Map r11) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            java.util.ArrayList r8 = r8.b
            int r1 = defpackage.ht0.v0(r8, r1)
            r0.<init>(r1)
            int r1 = r8.size()
            r2 = 0
            r3 = r2
            r4 = r3
        L14:
            if (r4 >= r1) goto L4d
            java.lang.Object r5 = r8.get(r4)
            int r4 = r4 + 1
            int r6 = r3 + 1
            r7 = 0
            if (r3 < 0) goto L49
            java.lang.String r5 = (java.lang.String) r5
            m14 r3 = r9.c
            k14 r3 = r3.b(r6)
            if (r3 == 0) goto L34
            java.lang.String r3 = r3.a
            java.lang.String r7 = android.net.Uri.decode(r3)
            r7.getClass()
        L34:
            if (r7 != 0) goto L38
            java.lang.String r7 = ""
        L38:
            java.lang.Object r3 = r11.get(r5)
            rb4 r3 = (defpackage.rb4) r3
            g(r10, r5, r7, r3)     // Catch: java.lang.IllegalArgumentException -> L48
            jg7 r3 = defpackage.jg7.a
            r0.add(r3)
            r3 = r6
            goto L14
        L48:
            return r2
        L49:
            defpackage.hf.q0()
            throw r7
        L4d:
            r8 = 1
            return r8
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto L15
            boolean r0 = r2 instanceof defpackage.fc4
            if (r0 != 0) goto L7
            goto L15
        L7:
            fc4 r2 = (defpackage.fc4) r2
            java.lang.String r2 = r2.a
            java.lang.String r1 = r1.a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L15
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public final boolean f(android.net.Uri r20, android.os.Bundle r21, java.util.Map r22) {
            r19 = this;
            r0 = r19
            r1 = r22
            go3 r2 = r0.f
            java.lang.Object r2 = r2.getValue()
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L14:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L15d
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.getValue()
            ec4 r3 = (defpackage.ec4) r3
            r6 = r20
            java.util.List r5 = r6.getQueryParameters(r5)
            boolean r7 = r0.g
            if (r7 == 0) goto L4a
            java.lang.String r7 = r6.getQuery()
            if (r7 == 0) goto L4a
            java.lang.String r8 = r6.toString()
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L4a
            java.util.List r5 = defpackage.hf.b0(r7)
        L4a:
            jg7 r7 = defpackage.jg7.a
            r8 = 0
            vr4[] r9 = new defpackage.vr4[r8]
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r8)
            vr4[] r9 = (defpackage.vr4[]) r9
            android.os.Bundle r9 = defpackage.jw2.l(r9)
            java.util.ArrayList r10 = r3.b
            int r11 = r10.size()
            r12 = r8
        L60:
            if (r12 >= r11) goto L8b
            java.lang.Object r14 = r10.get(r12)
            int r12 = r12 + 1
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r1.get(r14)
            rb4 r15 = (defpackage.rb4) r15
            if (r15 == 0) goto L77
            fd4 r13 = r15.a
        L74:
            r16 = 1
            goto L79
        L77:
            r13 = 0
            goto L74
        L79:
            boolean r4 = r13 instanceof defpackage.dt0
            if (r4 == 0) goto L60
            boolean r4 = r15.c
            if (r4 != 0) goto L60
            dt0 r13 = (defpackage.dt0) r13
            java.lang.Object r4 = r13.g()
            r13.e(r9, r14, r4)
            goto L60
        L8b:
            r16 = 1
            java.util.Iterator r4 = r5.iterator()
        L91:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L152
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r10 = r3.a
            if (r10 == 0) goto Lbf
            java.util.regex.Pattern r10 = java.util.regex.Pattern.compile(r10)
            r10.getClass()
            r5.getClass()
            java.util.regex.Matcher r10 = r10.matcher(r5)
            r10.getClass()
            boolean r11 = r10.matches()
            if (r11 != 0) goto Lb9
            goto Lbf
        Lb9:
            n14 r11 = new n14
            r11.<init>(r10, r5)
            goto Lc0
        Lbf:
            r11 = 0
        Lc0:
            if (r11 != 0) goto Lc3
            return r8
        Lc3:
            java.util.ArrayList r5 = r3.b
            java.util.ArrayList r10 = new java.util.ArrayList
            r12 = 10
            int r12 = defpackage.ht0.v0(r5, r12)
            r10.<init>(r12)
            int r12 = r5.size()
            r14 = r8
            r15 = r14
        Ld6:
            if (r15 >= r12) goto L14c
            java.lang.Object r17 = r5.get(r15)
            int r15 = r15 + 1
            int r8 = r14 + 1
            if (r14 < 0) goto L146
            r14 = r17
            java.lang.String r14 = (java.lang.String) r14
            r17 = 0
            m14 r13 = r11.c
            k14 r13 = r13.b(r8)
            if (r13 == 0) goto Lf3
            java.lang.String r13 = r13.a
            goto Lf5
        Lf3:
            r13 = r17
        Lf5:
            if (r13 != 0) goto Lf9
            java.lang.String r13 = ""
        Lf9:
            java.lang.Object r18 = r1.get(r14)
            r0 = r18
            rb4 r0 = (defpackage.rb4) r0
            r14.getClass()     // Catch: java.lang.IllegalArgumentException -> L13b
            boolean r18 = r9.containsKey(r14)     // Catch: java.lang.IllegalArgumentException -> L13b
            if (r18 != 0) goto L10e
            g(r9, r14, r13, r0)     // Catch: java.lang.IllegalArgumentException -> L13b
            goto L13b
        L10e:
            boolean r18 = r9.containsKey(r14)     // Catch: java.lang.IllegalArgumentException -> L13b
            if (r18 != 0) goto L117
            r0 = r16
            goto L136
        L117:
            if (r0 == 0) goto L135
            fd4 r0 = r0.a     // Catch: java.lang.IllegalArgumentException -> L13b
            java.lang.Object r1 = r0.a(r9, r14)     // Catch: java.lang.IllegalArgumentException -> L13b
            boolean r18 = r9.containsKey(r14)     // Catch: java.lang.IllegalArgumentException -> L13b
            if (r18 == 0) goto L12d
            java.lang.Object r1 = r0.c(r1, r13)     // Catch: java.lang.IllegalArgumentException -> L13b
            r0.e(r9, r14, r1)     // Catch: java.lang.IllegalArgumentException -> L13b
            goto L135
        L12d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L13b
            java.lang.String r1 = "There is no previous value in this savedState."
            r0.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L13b
            throw r0     // Catch: java.lang.IllegalArgumentException -> L13b
        L135:
            r0 = 0
        L136:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.IllegalArgumentException -> L13b
            goto L13c
        L13b:
            r0 = r7
        L13c:
            r10.add(r0)
            r0 = r19
            r1 = r22
            r14 = r8
            r8 = 0
            goto Ld6
        L146:
            r17 = 0
            defpackage.hf.q0()
            throw r17
        L14c:
            r0 = r19
            r1 = r22
            goto L91
        L152:
            r0 = r21
            r0.putAll(r9)
            r0 = r19
            r1 = r22
            goto L14
        L15d:
            r16 = 1
            return r16
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.a
            int r0 = r0.hashCode()
            int r0 = r0 * 961
            return r0
    }
}
