package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h03  reason: default package */
/* loaded from: classes.dex */
public final class h03 {
    public final /* synthetic */ int a;
    public int b;
    public java.lang.Object c;
    public java.io.Serializable d;
    public java.io.Serializable e;
    public java.lang.Object f;
    public java.lang.Object g;
    public java.lang.Object h;
    public java.lang.Object i;

    public h03(int r2) {
            r1 = this;
            r1.a = r2
            switch(r2) {
                case 1: goto L1c;
                default: goto L5;
            }
        L5:
            r1.<init>()
            java.lang.String r2 = ""
            r1.d = r2
            r1.e = r2
            r0 = -1
            r1.b = r0
            java.lang.String[] r2 = new java.lang.String[]{r2}
            java.util.ArrayList r2 = defpackage.hf.d0(r2)
            r1.h = r2
            return
        L1c:
            r1.<init>()
            return
    }

    public h03(defpackage.me6 r2) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r1.d()
            int[] r0 = android.util.StateSet.WILD_CARD
            r1.a(r0, r2)
            return
    }

    public static java.util.ArrayList f(java.lang.String r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r6.length()
            if (r1 > r2) goto L44
            r2 = 38
            r3 = 4
            int r2 = defpackage.qs6.s0(r2, r1, r3, r6)
            r4 = -1
            if (r2 != r4) goto L1a
            int r2 = r6.length()
        L1a:
            r5 = 61
            int r3 = defpackage.qs6.s0(r5, r1, r3, r6)
            if (r3 == r4) goto L36
            if (r3 <= r2) goto L25
            goto L36
        L25:
            java.lang.String r1 = r6.substring(r1, r3)
            r0.add(r1)
            int r3 = r3 + 1
            java.lang.String r1 = r6.substring(r3, r2)
            r0.add(r1)
            goto L41
        L36:
            java.lang.String r1 = r6.substring(r1, r2)
            r0.add(r1)
            r1 = 0
            r0.add(r1)
        L41:
            int r1 = r2 + 1
            goto L6
        L44:
            return r0
    }

    public void a(int[] r6, defpackage.me6 r7) {
            r5 = this;
            int r0 = r5.b
            if (r0 == 0) goto L7
            int r1 = r6.length
            if (r1 != 0) goto L9
        L7:
            r5.c = r7
        L9:
            java.io.Serializable r1 = r5.d
            int[][] r1 = (int[][]) r1
            int r2 = r1.length
            if (r0 < r2) goto L25
            int r2 = r0 + 10
            int[][] r3 = new int[r2]
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r3, r4, r0)
            r5.d = r3
            me6[] r1 = new defpackage.me6[r2]
            java.io.Serializable r2 = r5.e
            me6[] r2 = (defpackage.me6[]) r2
            java.lang.System.arraycopy(r2, r4, r1, r4, r0)
            r5.e = r1
        L25:
            java.io.Serializable r0 = r5.d
            int[][] r0 = (int[][]) r0
            int r1 = r5.b
            r0[r1] = r6
            java.io.Serializable r6 = r5.e
            me6[] r6 = (defpackage.me6[]) r6
            r6[r1] = r7
            int r1 = r1 + 1
            r5.b = r1
            return
    }

    public defpackage.i03 b() {
            r15 = this;
            java.lang.Object r0 = r15.c
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            r0 = 0
            if (r2 == 0) goto L98
            java.io.Serializable r1 = r15.d
            java.lang.String r1 = (java.lang.String) r1
            r3 = 0
            r4 = 7
            java.lang.String r1 = defpackage.jw2.x(r3, r3, r4, r1)
            java.io.Serializable r5 = r15.e
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = defpackage.jw2.x(r3, r3, r4, r5)
            java.lang.Object r6 = r15.f
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L92
            r7 = r4
            r4 = r5
            r5 = r6
            int r6 = r15.c()
            java.lang.Object r8 = r15.h
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r9 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r10 = 10
            int r11 = defpackage.ht0.v0(r8, r10)
            r7.<init>(r11)
            int r11 = r8.size()
            r12 = r3
        L3c:
            if (r12 >= r11) goto L4e
            java.lang.Object r13 = r8.get(r12)
            int r12 = r12 + 1
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r13 = defpackage.jw2.x(r3, r3, r9, r13)
            r7.add(r13)
            goto L3c
        L4e:
            java.lang.Object r8 = r15.i
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 == 0) goto L7b
            java.util.ArrayList r11 = new java.util.ArrayList
            int r10 = defpackage.ht0.v0(r8, r10)
            r11.<init>(r10)
            int r10 = r8.size()
            r12 = r3
        L62:
            if (r12 >= r10) goto L79
            java.lang.Object r13 = r8.get(r12)
            int r12 = r12 + 1
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto L74
            r14 = 3
            java.lang.String r13 = defpackage.jw2.x(r3, r3, r14, r13)
            goto L75
        L74:
            r13 = r0
        L75:
            r11.add(r13)
            goto L62
        L79:
            r8 = r11
            goto L7c
        L7b:
            r8 = r0
        L7c:
            java.lang.Object r10 = r15.g
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L86
            java.lang.String r0 = defpackage.jw2.x(r3, r3, r9, r10)
        L86:
            r9 = r0
            java.lang.String r10 = r15.toString()
            r3 = r1
            i03 r1 = new i03
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r1
        L92:
            java.lang.String r15 = "host == null"
            defpackage.i.m(r15)
            return r0
        L98:
            java.lang.String r15 = "scheme == null"
            defpackage.i.m(r15)
            return r0
    }

    public int c() {
            r2 = this;
            int r0 = r2.b
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            java.lang.Object r2 = r2.c
            java.lang.String r2 = (java.lang.String) r2
            r2.getClass()
            java.lang.String r0 = "http"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L18
            r1 = 80
            goto L22
        L18:
            java.lang.String r0 = "https"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L22
            r1 = 443(0x1bb, float:6.21E-43)
        L22:
            return r1
    }

    public void d() {
            r2 = this;
            me6 r0 = new me6
            r0.<init>()
            r2.c = r0
            r0 = 10
            int[][] r1 = new int[r0]
            r2.d = r1
            me6[] r0 = new defpackage.me6[r0]
            r2.e = r0
            return
    }

    public void e(defpackage.i03 r18, java.lang.String r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Object r3 = r0.h
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r2.getClass()
            byte[] r4 = defpackage.yy7.a
            int r4 = r2.length()
            r5 = 0
            int r4 = defpackage.yy7.j(r5, r4, r2)
            int r6 = r2.length()
            int r6 = defpackage.yy7.k(r4, r6, r2)
            int r7 = r6 - r4
            r8 = 48
            r9 = 91
            r10 = 58
            r11 = -1
            r12 = 2
            if (r7 >= r12) goto L2e
        L2c:
            r7 = r11
            goto L81
        L2e:
            char r7 = r2.charAt(r4)
            r13 = 97
            int r14 = defpackage.nb3.p(r7, r13)
            r15 = 65
            if (r14 < 0) goto L44
            r14 = 122(0x7a, float:1.71E-43)
            int r14 = defpackage.nb3.p(r7, r14)
            if (r14 <= 0) goto L53
        L44:
            int r14 = defpackage.nb3.p(r7, r15)
            if (r14 < 0) goto L2c
            r14 = 90
            int r7 = defpackage.nb3.p(r7, r14)
            if (r7 <= 0) goto L53
            goto L2c
        L53:
            int r7 = r4 + 1
        L55:
            if (r7 >= r6) goto L2c
            char r14 = r2.charAt(r7)
            if (r13 > r14) goto L62
            r13 = 123(0x7b, float:1.72E-43)
            if (r14 >= r13) goto L62
            goto L7c
        L62:
            if (r15 > r14) goto L67
            if (r14 >= r9) goto L67
            goto L7c
        L67:
            if (r8 > r14) goto L6c
            if (r14 >= r10) goto L6c
            goto L7c
        L6c:
            r13 = 43
            if (r14 == r13) goto L7c
            r13 = 45
            if (r14 == r13) goto L7c
            r13 = 46
            if (r14 != r13) goto L79
            goto L7c
        L79:
            if (r14 != r10) goto L2c
            goto L81
        L7c:
            int r7 = r7 + 1
            r13 = 97
            goto L55
        L81:
            java.lang.String r13 = "http"
            java.lang.String r14 = "https"
            r15 = 1
            if (r7 == r11) goto Lbf
            java.lang.String r8 = "https:"
            boolean r8 = defpackage.xs6.f0(r2, r8, r4, r15)
            if (r8 == 0) goto L95
            r0.c = r14
            int r4 = r4 + 6
            goto Lc5
        L95:
            java.lang.String r8 = "http:"
            boolean r8 = defpackage.xs6.f0(r2, r8, r4, r15)
            if (r8 == 0) goto La2
            r0.c = r13
            int r4 = r4 + 5
            goto Lc5
        La2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r2.substring(r5, r7)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected URL scheme 'http' or 'https' but was '"
            r2.<init>(r3)
            r2.append(r1)
            r1 = 39
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        Lbf:
            if (r1 == 0) goto L34f
            java.lang.String r7 = r1.a
            r0.c = r7
        Lc5:
            r7 = r4
            r8 = r5
            r16 = r15
        Lc9:
            r15 = 92
            r9 = 47
            if (r7 >= r6) goto Le1
            char r10 = r2.charAt(r7)
            if (r10 == r9) goto Ld8
            if (r10 == r15) goto Ld8
            goto Le1
        Ld8:
            int r8 = r8 + 1
            int r7 = r7 + 1
            r9 = 91
            r10 = 58
            goto Lc9
        Le1:
            java.lang.String r10 = " \"'<>#"
            java.lang.String r7 = ""
            r15 = 35
            if (r8 >= r12) goto L134
            if (r1 == 0) goto L134
            java.lang.String r12 = r1.a
            java.lang.Object r9 = r0.c
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = defpackage.nb3.k(r12, r9)
            if (r9 != 0) goto Lf8
            goto L134
        Lf8:
            java.lang.String r8 = r1.e()
            r0.d = r8
            java.lang.String r8 = r1.a()
            r0.e = r8
            java.lang.String r8 = r1.d
            r0.f = r8
            int r8 = r1.e
            r0.b = r8
            r3.clear()
            java.util.ArrayList r8 = r1.c()
            r3.addAll(r8)
            if (r4 == r6) goto L11e
            char r8 = r2.charAt(r4)
            if (r8 != r15) goto L246
        L11e:
            java.lang.String r1 = r1.d()
            if (r1 == 0) goto L12f
            r8 = 83
            java.lang.String r1 = defpackage.jw2.m(r1, r5, r5, r10, r8)
            java.util.ArrayList r1 = f(r1)
            goto L130
        L12f:
            r1 = 0
        L130:
            r0.i = r1
            goto L246
        L134:
            int r4 = r4 + r8
            r1 = r5
            r8 = r1
        L137:
            java.lang.String r9 = "@/\\?#"
            int r9 = defpackage.yy7.f(r2, r4, r6, r9)
            if (r9 == r6) goto L144
            char r12 = r2.charAt(r9)
            goto L145
        L144:
            r12 = r11
        L145:
            if (r12 == r11) goto L1c3
            if (r12 == r15) goto L1c3
            r5 = 47
            if (r12 == r5) goto L1c3
            r5 = 92
            if (r12 == r5) goto L1c3
            r5 = 63
            if (r12 == r5) goto L1c3
            r5 = 64
            if (r12 == r5) goto L15b
            r5 = 0
            goto L137
        L15b:
            java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
            java.lang.String r12 = "%40"
            if (r1 != 0) goto L19b
            r15 = 58
            int r11 = defpackage.yy7.e(r2, r15, r4, r9)
            r15 = 112(0x70, float:1.57E-43)
            java.lang.String r4 = defpackage.jw2.m(r2, r4, r11, r5, r15)
            if (r8 == 0) goto L185
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.io.Serializable r15 = r0.d
            java.lang.String r15 = (java.lang.String) r15
            r8.append(r15)
            r8.append(r12)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
        L185:
            r0.d = r4
            if (r11 == r9) goto L196
            int r11 = r11 + 1
            r15 = 112(0x70, float:1.57E-43)
            java.lang.String r1 = defpackage.jw2.m(r2, r11, r9, r5, r15)
            r0.e = r1
            r1 = r16
            goto L198
        L196:
            r15 = 112(0x70, float:1.57E-43)
        L198:
            r8 = r16
            goto L1bb
        L19b:
            r15 = 112(0x70, float:1.57E-43)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.io.Serializable r15 = r0.e
            java.lang.String r15 = (java.lang.String) r15
            r11.append(r15)
            r11.append(r12)
            r15 = 112(0x70, float:1.57E-43)
            java.lang.String r4 = defpackage.jw2.m(r2, r4, r9, r5, r15)
            r11.append(r4)
            java.lang.String r4 = r11.toString()
            r0.e = r4
        L1bb:
            int r4 = r9 + 1
            r5 = 0
            r11 = -1
            r15 = 35
            goto L137
        L1c3:
            r1 = r4
        L1c4:
            if (r1 >= r9) goto L1e2
            char r5 = r2.charAt(r1)
            r15 = 58
            if (r5 == r15) goto L1e3
            r8 = 91
            if (r5 == r8) goto L1d3
            goto L1df
        L1d3:
            int r1 = r1 + 1
            if (r1 >= r9) goto L1df
            char r5 = r2.charAt(r1)
            r11 = 93
            if (r5 != r11) goto L1d3
        L1df:
            int r1 = r1 + 1
            goto L1c4
        L1e2:
            r1 = r9
        L1e3:
            int r5 = r1 + 1
            r8 = 4
            r11 = 34
            if (r5 >= r9) goto L218
            java.lang.String r8 = defpackage.jw2.x(r4, r1, r8, r2)
            java.lang.String r8 = defpackage.wy7.b(r8)
            r0.f = r8
            r8 = 120(0x78, float:1.68E-43)
            java.lang.String r8 = defpackage.jw2.m(r2, r5, r9, r7, r8)     // Catch: java.lang.NumberFormatException -> L207
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> L207
            r12 = r16
            if (r12 > r8) goto L207
            r12 = 65536(0x10000, float:9.1835E-41)
            if (r8 >= r12) goto L207
            goto L208
        L207:
            r8 = -1
        L208:
            r0.b = r8
            r12 = -1
            if (r8 == r12) goto L20e
            goto L23f
        L20e:
            java.lang.String r0 = "Invalid URL port: \""
            java.lang.String r1 = r2.substring(r5, r9)
            defpackage.e41.j(r0, r11, r1)
            return
        L218:
            r12 = -1
            java.lang.String r5 = defpackage.jw2.x(r4, r1, r8, r2)
            java.lang.String r5 = defpackage.wy7.b(r5)
            r0.f = r5
            java.lang.Object r5 = r0.c
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            boolean r8 = r5.equals(r13)
            if (r8 == 0) goto L233
            r5 = 80
            goto L23d
        L233:
            boolean r5 = r5.equals(r14)
            if (r5 == 0) goto L23c
            r5 = 443(0x1bb, float:6.21E-43)
            goto L23d
        L23c:
            r5 = r12
        L23d:
            r0.b = r5
        L23f:
            java.lang.Object r5 = r0.f
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L345
            r4 = r9
        L246:
            java.lang.String r1 = "?#"
            int r1 = defpackage.yy7.f(r2, r4, r6, r1)
            if (r4 != r1) goto L250
            goto L30f
        L250:
            char r5 = r2.charAt(r4)
            r8 = 47
            if (r5 == r8) goto L268
            r8 = 92
            if (r5 == r8) goto L268
            int r5 = r3.size()
            r16 = 1
            int r5 = r5 + (-1)
            r3.set(r5, r7)
            goto L270
        L268:
            r3.clear()
            r3.add(r7)
            int r4 = r4 + 1
        L270:
            if (r4 >= r1) goto L30f
            java.lang.String r5 = "/\\"
            int r5 = defpackage.yy7.f(r2, r4, r1, r5)
            if (r5 >= r1) goto L27c
            r12 = 1
            goto L27d
        L27c:
            r12 = 0
        L27d:
            java.lang.String r8 = " \"<>^`{}|/\\?#"
            r15 = 112(0x70, float:1.57E-43)
            java.lang.String r4 = defpackage.jw2.m(r2, r4, r5, r8, r15)
            java.lang.String r8 = "."
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L306
            java.lang.String r8 = "%2e"
            boolean r8 = r4.equalsIgnoreCase(r8)
            if (r8 == 0) goto L297
            goto L306
        L297:
            java.lang.String r8 = ".."
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L2df
            java.lang.String r8 = "%2e."
            boolean r8 = r4.equalsIgnoreCase(r8)
            if (r8 != 0) goto L2df
            java.lang.String r8 = ".%2e"
            boolean r8 = r4.equalsIgnoreCase(r8)
            if (r8 != 0) goto L2df
            java.lang.String r8 = "%2e%2e"
            boolean r8 = r4.equalsIgnoreCase(r8)
            if (r8 == 0) goto L2b8
            goto L2df
        L2b8:
            int r8 = r3.size()
            r16 = 1
            int r8 = r8 + (-1)
            java.lang.Object r8 = r3.get(r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            int r8 = r8.length()
            if (r8 != 0) goto L2d6
            int r8 = r3.size()
            int r8 = r8 + (-1)
            r3.set(r8, r4)
            goto L2d9
        L2d6:
            r3.add(r4)
        L2d9:
            if (r12 == 0) goto L306
            r3.add(r7)
            goto L306
        L2df:
            int r4 = r3.size()
            r16 = 1
            int r4 = r4 + (-1)
            java.lang.Object r4 = r3.remove(r4)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            if (r4 != 0) goto L303
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L303
            int r4 = r3.size()
            int r4 = r4 + (-1)
            r3.set(r4, r7)
            goto L306
        L303:
            r3.add(r7)
        L306:
            if (r12 == 0) goto L30c
            int r4 = r5 + 1
            goto L270
        L30c:
            r4 = r5
            goto L270
        L30f:
            if (r1 >= r6) goto L32e
            char r3 = r2.charAt(r1)
            r5 = 63
            if (r3 != r5) goto L32e
            r3 = 35
            int r4 = defpackage.yy7.e(r2, r3, r1, r6)
            int r1 = r1 + 1
            r3 = 80
            java.lang.String r1 = defpackage.jw2.m(r2, r1, r4, r10, r3)
            java.util.ArrayList r1 = f(r1)
            r0.i = r1
            r1 = r4
        L32e:
            if (r1 >= r6) goto L344
            char r3 = r2.charAt(r1)
            r4 = 35
            if (r3 != r4) goto L344
            r16 = 1
            int r1 = r1 + 1
            r3 = 48
            java.lang.String r1 = defpackage.jw2.m(r2, r1, r6, r7, r3)
            r0.g = r1
        L344:
            return
        L345:
            java.lang.String r0 = "Invalid URL host: \""
            java.lang.String r1 = r2.substring(r4, r1)
            defpackage.e41.j(r0, r11, r1)
            return
        L34f:
            int r0 = r2.length()
            r1 = 6
            if (r0 <= r1) goto L361
            java.lang.String r0 = defpackage.qs6.S0(r1, r2)
            java.lang.String r1 = "..."
            java.lang.String r0 = r0.concat(r1)
            goto L362
        L361:
            r0 = r2
        L362:
            java.lang.String r1 = "Expected URL scheme 'http' or 'https' but no scheme was found for "
            java.lang.String r0 = r1.concat(r0)
            defpackage.i.h(r0)
            return
    }

    public java.lang.String toString() {
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r6 = super.toString()
            return r6
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r6.c
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L1e
            r0.append(r1)
            java.lang.String r1 = "://"
            r0.append(r1)
            goto L23
        L1e:
            java.lang.String r1 = "//"
            r0.append(r1)
        L23:
            java.io.Serializable r1 = r6.d
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            r2 = 58
            if (r1 <= 0) goto L30
            goto L3a
        L30:
            java.io.Serializable r1 = r6.e
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L5a
        L3a:
            java.io.Serializable r1 = r6.d
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.io.Serializable r1 = r6.e
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L55
            r0.append(r2)
            java.io.Serializable r1 = r6.e
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
        L55:
            r1 = 64
            r0.append(r1)
        L5a:
            java.lang.Object r1 = r6.f
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L7f
            boolean r1 = defpackage.qs6.k0(r1, r2)
            if (r1 == 0) goto L78
            r1 = 91
            r0.append(r1)
            java.lang.Object r1 = r6.f
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            goto L7f
        L78:
            java.lang.Object r1 = r6.f
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
        L7f:
            int r1 = r6.b
            r3 = -1
            if (r1 != r3) goto L8a
            java.lang.Object r1 = r6.c
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lb1
        L8a:
            int r1 = r6.c()
            java.lang.Object r4 = r6.c
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto Lab
            java.lang.String r5 = "http"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L9f
            r3 = 80
            goto La9
        L9f:
            java.lang.String r5 = "https"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto La9
            r3 = 443(0x1bb, float:6.21E-43)
        La9:
            if (r1 == r3) goto Lb1
        Lab:
            r0.append(r2)
            r0.append(r1)
        Lb1:
            java.lang.Object r1 = r6.h
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            r3 = 0
        Lba:
            if (r3 >= r2) goto Lcd
            r4 = 47
            r0.append(r4)
            java.lang.Object r4 = r1.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            int r3 = r3 + 1
            goto Lba
        Lcd:
            java.lang.Object r1 = r6.i
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 == 0) goto Le2
            r1 = 63
            r0.append(r1)
            java.lang.Object r1 = r6.i
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.getClass()
            defpackage.x31.o(r1, r0)
        Le2:
            java.lang.Object r1 = r6.g
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Lf4
            r1 = 35
            r0.append(r1)
            java.lang.Object r6 = r6.g
            java.lang.String r6 = (java.lang.String) r6
            r0.append(r6)
        Lf4:
            java.lang.String r6 = r0.toString()
            return r6
    }
}
