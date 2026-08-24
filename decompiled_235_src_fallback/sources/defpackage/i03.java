package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i03  reason: default package */
/* loaded from: classes.dex */
public final class i03 {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final int e;
    public final java.util.ArrayList f;
    public final java.util.List g;
    public final java.lang.String h;
    public final java.lang.String i;

    static {
            return
    }

    public i03(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, java.util.ArrayList r6, java.util.ArrayList r7, java.lang.String r8, java.lang.String r9) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            return
    }

    public final java.lang.String a() {
            r4 = this;
            java.lang.String r0 = r4.c
            int r0 = r0.length()
            if (r0 != 0) goto Lb
            java.lang.String r4 = ""
            return r4
        Lb:
            java.lang.String r0 = r4.a
            int r0 = r0.length()
            int r0 = r0 + 3
            r1 = 4
            r2 = 58
            java.lang.String r4 = r4.i
            int r0 = defpackage.qs6.s0(r2, r0, r1, r4)
            int r0 = r0 + 1
            r1 = 0
            r2 = 6
            r3 = 64
            int r1 = defpackage.qs6.s0(r3, r1, r2, r4)
            java.lang.String r4 = r4.substring(r0, r1)
            return r4
    }

    public final java.lang.String b() {
            r3 = this;
            java.lang.String r0 = r3.a
            int r0 = r0.length()
            int r0 = r0 + 3
            r1 = 4
            r2 = 47
            java.lang.String r3 = r3.i
            int r0 = defpackage.qs6.s0(r2, r0, r1, r3)
            java.lang.String r1 = "?#"
            int r2 = r3.length()
            int r1 = defpackage.yy7.f(r3, r0, r2, r1)
            java.lang.String r3 = r3.substring(r0, r1)
            return r3
    }

    public final java.util.ArrayList c() {
            r5 = this;
            java.lang.String r0 = r5.a
            int r0 = r0.length()
            int r0 = r0 + 3
            r1 = 4
            r2 = 47
            java.lang.String r5 = r5.i
            int r0 = defpackage.qs6.s0(r2, r0, r1, r5)
            java.lang.String r1 = "?#"
            int r3 = r5.length()
            int r1 = defpackage.yy7.f(r5, r0, r3, r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L20:
            if (r0 >= r1) goto L31
            int r0 = r0 + 1
            int r4 = defpackage.yy7.e(r5, r2, r0, r1)
            java.lang.String r0 = r5.substring(r0, r4)
            r3.add(r0)
            r0 = r4
            goto L20
        L31:
            return r3
    }

    public final java.lang.String d() {
            r3 = this;
            java.util.List r0 = r3.g
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            r0 = 0
            r1 = 6
            r2 = 63
            java.lang.String r3 = r3.i
            int r0 = defpackage.qs6.s0(r2, r0, r1, r3)
            int r0 = r0 + 1
            r1 = 35
            int r2 = r3.length()
            int r1 = defpackage.yy7.e(r3, r1, r0, r2)
            java.lang.String r3 = r3.substring(r0, r1)
            return r3
    }

    public final java.lang.String e() {
            r3 = this;
            java.lang.String r0 = r3.b
            int r0 = r0.length()
            if (r0 != 0) goto Lb
            java.lang.String r3 = ""
            return r3
        Lb:
            java.lang.String r0 = r3.a
            int r0 = r0.length()
            int r0 = r0 + 3
            java.lang.String r1 = ":@"
            java.lang.String r3 = r3.i
            int r2 = r3.length()
            int r1 = defpackage.yy7.f(r3, r0, r2, r1)
            java.lang.String r3 = r3.substring(r0, r1)
            return r3
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.i03
            if (r0 == 0) goto L12
            i03 r2 = (defpackage.i03) r2
            java.lang.String r2 = r2.i
            java.lang.String r1 = r1.i
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final boolean f() {
            r1 = this;
            java.lang.String r1 = r1.a
            java.lang.String r0 = "https"
            boolean r1 = defpackage.nb3.k(r1, r0)
            return r1
    }

    public final java.lang.String g() {
            r5 = this;
            java.lang.String r0 = "/..."
            r1 = 0
            h03 r2 = new h03     // Catch: java.lang.IllegalArgumentException -> Lc
            r2.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> Lc
            r2.e(r5, r0)     // Catch: java.lang.IllegalArgumentException -> Lc
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r2.getClass()
            java.lang.String r5 = ""
            java.lang.String r0 = " \"':;<=>@[]^`{}|/\\?#"
            r3 = 123(0x7b, float:1.72E-43)
            java.lang.String r4 = defpackage.jw2.m(r5, r1, r1, r0, r3)
            r2.d = r4
            java.lang.String r5 = defpackage.jw2.m(r5, r1, r1, r0, r3)
            r2.e = r5
            i03 r5 = r2.b()
            java.lang.String r5 = r5.i
            return r5
    }

    public final java.net.URI h() {
            r10 = this;
            h03 r0 = new h03
            r1 = 0
            r0.<init>(r1)
            java.lang.Object r2 = r0.h
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.String r3 = r10.a
            r0.c = r3
            java.lang.String r4 = r10.e()
            r0.d = r4
            java.lang.String r4 = r10.a()
            r0.e = r4
            java.lang.String r4 = r10.d
            r0.f = r4
            r3.getClass()
            java.lang.String r4 = "http"
            boolean r4 = r3.equals(r4)
            r5 = -1
            if (r4 == 0) goto L2d
            r3 = 80
            goto L39
        L2d:
            java.lang.String r4 = "https"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L38
            r3 = 443(0x1bb, float:6.21E-43)
            goto L39
        L38:
            r3 = r5
        L39:
            int r4 = r10.e
            if (r4 == r3) goto L3e
            r5 = r4
        L3e:
            r0.b = r5
            r2.clear()
            java.util.ArrayList r3 = r10.c()
            r2.addAll(r3)
            java.lang.String r3 = r10.d()
            r4 = 0
            if (r3 == 0) goto L5e
            java.lang.String r5 = " \"'<>#"
            r6 = 83
            java.lang.String r3 = defpackage.jw2.m(r3, r1, r1, r5, r6)
            java.util.ArrayList r3 = defpackage.h03.f(r3)
            goto L5f
        L5e:
            r3 = r4
        L5f:
            r0.i = r3
            java.lang.String r3 = r10.h
            r5 = 35
            if (r3 != 0) goto L69
            r10 = r4
            goto L76
        L69:
            r3 = 6
            java.lang.String r10 = r10.i
            int r3 = defpackage.qs6.s0(r5, r1, r3, r10)
            int r3 = r3 + 1
            java.lang.String r10 = r10.substring(r3)
        L76:
            r0.g = r10
            java.lang.Object r10 = r0.f
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r3 = ""
            if (r10 == 0) goto L87
            java.lang.String r6 = "[\"<>^`{|}]"
            java.lang.String r10 = defpackage.lb1.z(r6, r10, r3)
            goto L88
        L87:
            r10 = r4
        L88:
            r0.f = r10
            int r10 = r2.size()
            r6 = r1
        L8f:
            if (r6 >= r10) goto La5
            java.lang.Object r7 = r2.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "[]"
            r9 = 99
            java.lang.String r7 = defpackage.jw2.m(r7, r1, r1, r8, r9)
            r2.set(r6, r7)
            int r6 = r6 + 1
            goto L8f
        La5:
            java.lang.Object r10 = r0.i
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r10 == 0) goto Lca
            int r2 = r10.size()
            r6 = r1
        Lb0:
            if (r6 >= r2) goto Lca
            java.lang.Object r7 = r10.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto Lc3
            java.lang.String r8 = "\\^`{|}"
            r9 = 67
            java.lang.String r7 = defpackage.jw2.m(r7, r1, r1, r8, r9)
            goto Lc4
        Lc3:
            r7 = r4
        Lc4:
            r10.set(r6, r7)
            int r6 = r6 + 1
            goto Lb0
        Lca:
            java.lang.Object r10 = r0.g
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto Ld6
            java.lang.String r2 = " \"#<>\\^`{|}"
            java.lang.String r4 = defpackage.jw2.m(r10, r1, r1, r2, r5)
        Ld6:
            r0.g = r4
            java.lang.String r10 = r0.toString()
            java.net.URI r0 = new java.net.URI     // Catch: java.net.URISyntaxException -> Le2
            r0.<init>(r10)     // Catch: java.net.URISyntaxException -> Le2
            return r0
        Le2:
            r0 = move-exception
            java.lang.String r1 = "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)     // Catch: java.lang.Exception -> Lff
            r1.getClass()     // Catch: java.lang.Exception -> Lff
            java.util.regex.Matcher r10 = r1.matcher(r10)     // Catch: java.lang.Exception -> Lff
            java.lang.String r10 = r10.replaceAll(r3)     // Catch: java.lang.Exception -> Lff
            r10.getClass()     // Catch: java.lang.Exception -> Lff
            java.net.URI r10 = java.net.URI.create(r10)     // Catch: java.lang.Exception -> Lff
            r10.getClass()
            return r10
        Lff:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            r10.<init>(r0)
            throw r10
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.i
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.i
            return r0
    }
}
