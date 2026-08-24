package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v53  reason: default package */
/* loaded from: classes.dex */
public final class v53 {
    public static final java.util.regex.Pattern i = null;
    public static final java.util.regex.Pattern j = null;
    public static final java.util.regex.Pattern k = null;
    public static final java.util.regex.Pattern l = null;
    public static final java.util.regex.Pattern m = null;
    public static final java.util.regex.Pattern n = null;
    public static final java.util.regex.Pattern o = null;
    public static final java.util.regex.Pattern p = null;
    public static final java.util.regex.Pattern q = null;
    public static final java.util.regex.Pattern r = null;
    public static final java.util.regex.Pattern s = null;
    public static final java.util.regex.Pattern t = null;
    public final java.util.BitSet a;
    public final java.util.BitSet b;
    public final java.util.HashMap c;
    public final defpackage.yc1 d;
    public java.lang.String e;
    public int f;
    public defpackage.mh1 g;
    public defpackage.m70 h;

    static {
            java.lang.String r0 = "^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.v53.i = r0
            java.lang.String r0 = "^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            defpackage.v53.j = r0
            java.lang.String r0 = "^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.v53.k = r0
            java.lang.String r0 = "^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            defpackage.v53.l = r0
            java.lang.String r0 = "`+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.v53.m = r0
            java.lang.String r0 = "^`+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.v53.n = r0
            java.lang.String r0 = "^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.v53.o = r0
            java.lang.String r0 = "^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.v53.p = r0
            java.lang.String r0 = "^ *(?:\n *)?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.v53.q = r0
            java.lang.String r0 = "^[\\p{Zs}\t\r\n\f]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.v53.r = r0
            java.lang.String r0 = "\\s+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.v53.s = r0
            java.lang.String r0 = " *$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.v53.t = r0
            return
    }

    public v53(defpackage.yc1 r7) {
            r6 = this;
            r6.<init>()
            java.lang.Object r0 = r7.A
            java.util.List r0 = (java.util.List) r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            uv r2 = new uv
            r3 = 42
            r2.<init>(r3)
            uv r3 = new uv
            r4 = 95
            r3.<init>(r4)
            r4 = 2
            nh1[] r4 = new defpackage.nh1[r4]
            r5 = 0
            r4[r5] = r2
            r2 = 1
            r4[r2] = r3
            java.util.List r2 = java.util.Arrays.asList(r4)
            b(r2, r1)
            b(r0, r1)
            r6.c = r1
            java.util.Set r0 = r1.keySet()
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L3c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L50
            java.lang.Object r2 = r0.next()
            java.lang.Character r2 = (java.lang.Character) r2
            char r2 = r2.charValue()
            r1.set(r2)
            goto L3c
        L50:
            r6.b = r1
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            r0.or(r1)
            r1 = 10
            r0.set(r1)
            r1 = 96
            r0.set(r1)
            r1 = 91
            r0.set(r1)
            r1 = 93
            r0.set(r1)
            r1 = 92
            r0.set(r1)
            r1 = 33
            r0.set(r1)
            r1 = 60
            r0.set(r1)
            r1 = 38
            r0.set(r1)
            r6.a = r0
            r6.d = r7
            return
    }

    public static void a(char r1, defpackage.nh1 r2, java.util.HashMap r3) {
            java.lang.Character r0 = java.lang.Character.valueOf(r1)
            java.lang.Object r2 = r3.put(r0, r2)
            nh1 r2 = (defpackage.nh1) r2
            if (r2 != 0) goto Ld
            return
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Delimiter processor conflict with delimiter char '"
            r3.<init>(r0)
            r3.append(r1)
            java.lang.String r1 = "'"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
    }

    public static void b(java.lang.Iterable r5, java.util.HashMap r6) {
            java.util.Iterator r5 = r5.iterator()
        L4:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r5.next()
            nh1 r0 = (defpackage.nh1) r0
            char r1 = r0.e()
            char r2 = r0.b()
            if (r1 != r2) goto L4f
            java.lang.Character r2 = java.lang.Character.valueOf(r1)
            java.lang.Object r2 = r6.get(r2)
            nh1 r2 = (defpackage.nh1) r2
            if (r2 == 0) goto L4b
            char r3 = r2.e()
            char r4 = r2.b()
            if (r3 != r4) goto L4b
            boolean r3 = r2 instanceof defpackage.uo6
            if (r3 == 0) goto L37
            uo6 r2 = (defpackage.uo6) r2
            goto L40
        L37:
            uo6 r3 = new uo6
            r3.<init>(r1)
            r3.f(r2)
            r2 = r3
        L40:
            r2.f(r0)
            java.lang.Character r0 = java.lang.Character.valueOf(r1)
            r6.put(r0, r2)
            goto L4
        L4b:
            a(r1, r0, r6)
            goto L4
        L4f:
            a(r1, r0, r6)
            a(r2, r0, r6)
            goto L4
        L56:
            return
    }

    public static void d(defpackage.vz6 r2, defpackage.vz6 r3, int r4) {
            if (r2 == 0) goto L31
            if (r3 == 0) goto L31
            if (r2 == r3) goto L31
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            java.lang.String r4 = r2.g
            r0.append(r4)
            java.lang.Object r4 = r2.f
            a21 r4 = (defpackage.a21) r4
            java.lang.Object r3 = r3.f
            a21 r3 = (defpackage.a21) r3
        L18:
            if (r4 == r3) goto L2b
            r1 = r4
            vz6 r1 = (defpackage.vz6) r1
            java.lang.String r1 = r1.g
            r0.append(r1)
            java.lang.Object r1 = r4.f
            a21 r1 = (defpackage.a21) r1
            r4.j()
            r4 = r1
            goto L18
        L2b:
            java.lang.String r3 = r0.toString()
            r2.g = r3
        L31:
            return
    }

    public static void e(defpackage.a21 r6, defpackage.a21 r7) {
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r2
            r4 = r1
        L5:
            if (r6 == 0) goto L28
            boolean r5 = r6 instanceof defpackage.vz6
            if (r5 == 0) goto L1a
            r3 = r6
            vz6 r3 = (defpackage.vz6) r3
            if (r2 != 0) goto L11
            r2 = r3
        L11:
            java.lang.String r5 = r3.g
            int r5 = r5.length()
            int r5 = r5 + r4
            r4 = r5
            goto L20
        L1a:
            d(r2, r3, r4)
            r2 = r0
            r3 = r2
            r4 = r1
        L20:
            if (r6 != r7) goto L23
            goto L28
        L23:
            java.lang.Object r6 = r6.f
            a21 r6 = (defpackage.a21) r6
            goto L5
        L28:
            d(r2, r3, r4)
            return
    }

    public final java.lang.String c(java.util.regex.Pattern r4) {
            r3 = this;
            int r0 = r3.f
            java.lang.String r1 = r3.e
            int r1 = r1.length()
            r2 = 0
            if (r0 < r1) goto Lc
            return r2
        Lc:
            java.lang.String r0 = r3.e
            java.util.regex.Matcher r4 = r4.matcher(r0)
            int r0 = r3.f
            java.lang.String r1 = r3.e
            int r1 = r1.length()
            r4.region(r0, r1)
            boolean r0 = r4.find()
            if (r0 == 0) goto L2e
            int r0 = r4.end()
            r3.f = r0
            java.lang.String r3 = r4.group()
            return r3
        L2e:
            return r2
    }

    public final void f(java.lang.String r26, defpackage.a21 r27) {
            r25 = this;
            r0 = r25
            r1 = r27
            java.lang.String r2 = r26.trim()
            r0.e = r2
            r2 = 0
            r0.f = r2
            r3 = 0
            r0.g = r3
            r0.h = r3
            r4 = r3
        L13:
            char r7 = r0.g()
            if (r7 != 0) goto L1d
            r6 = r2
        L1a:
            r4 = r3
            goto L549
        L1d:
            java.lang.String r5 = " "
            r11 = 1
            r8 = 10
            if (r7 == r8) goto L4dd
            r4 = 33
            if (r7 == r4) goto L499
            r4 = 38
            if (r7 == r4) goto L487
            r4 = 60
            if (r7 == r4) goto L42c
            r10 = 96
            if (r7 == r10) goto L3be
            switch(r7) {
                case 91: goto L38f;
                case 92: goto L334;
                case 93: goto L153;
                default: goto L37;
            }
        L37:
            java.util.BitSet r4 = r0.b
            boolean r4 = r4.get(r7)
            if (r4 == 0) goto L121
            java.util.HashMap r4 = r0.c
            java.lang.Character r5 = java.lang.Character.valueOf(r7)
            java.lang.Object r4 = r4.get(r5)
            nh1 r4 = (defpackage.nh1) r4
            int r5 = r0.f
            r6 = r2
        L4e:
            char r8 = r0.g()
            if (r8 != r7) goto L5c
            int r6 = r6 + 1
            int r8 = r0.f
            int r8 = r8 + r11
            r0.f = r8
            goto L4e
        L5c:
            int r8 = r4.c()
            if (r6 >= r8) goto L67
            r0.f = r5
            r5 = r3
            goto Lef
        L67:
            java.lang.String r8 = "\n"
            if (r5 != 0) goto L6d
            r9 = r8
            goto L75
        L6d:
            java.lang.String r9 = r0.e
            int r10 = r5 + (-1)
            java.lang.String r9 = r9.substring(r10, r5)
        L75:
            char r10 = r0.g()
            if (r10 != 0) goto L7c
            goto L80
        L7c:
            java.lang.String r8 = java.lang.String.valueOf(r10)
        L80:
            java.util.regex.Pattern r10 = defpackage.v53.i
            java.util.regex.Matcher r12 = r10.matcher(r9)
            boolean r12 = r12.matches()
            java.util.regex.Pattern r13 = defpackage.v53.r
            java.util.regex.Matcher r9 = r13.matcher(r9)
            boolean r9 = r9.matches()
            java.util.regex.Matcher r10 = r10.matcher(r8)
            boolean r10 = r10.matches()
            java.util.regex.Matcher r8 = r13.matcher(r8)
            boolean r8 = r8.matches()
            if (r8 != 0) goto Lae
            if (r10 == 0) goto Lac
            if (r9 != 0) goto Lac
            if (r12 == 0) goto Lae
        Lac:
            r13 = r11
            goto Laf
        Lae:
            r13 = r2
        Laf:
            if (r9 != 0) goto Lb9
            if (r12 == 0) goto Lb7
            if (r8 != 0) goto Lb7
            if (r10 == 0) goto Lb9
        Lb7:
            r8 = r11
            goto Lba
        Lb9:
            r8 = r2
        Lba:
            r9 = 95
            if (r7 != r9) goto Ld1
            if (r13 == 0) goto Lc6
            if (r8 == 0) goto Lc4
            if (r12 == 0) goto Lc6
        Lc4:
            r4 = r11
            goto Lc7
        Lc6:
            r4 = r2
        Lc7:
            if (r8 == 0) goto Lcf
            if (r13 == 0) goto Lcd
            if (r10 == 0) goto Lcf
        Lcd:
            r8 = r11
            goto Le8
        Lcf:
            r8 = r2
            goto Le8
        Ld1:
            if (r13 == 0) goto Ldb
            char r9 = r4.e()
            if (r7 != r9) goto Ldb
            r9 = r11
            goto Ldc
        Ldb:
            r9 = r2
        Ldc:
            if (r8 == 0) goto Le6
            char r4 = r4.b()
            if (r7 != r4) goto Le6
            r8 = r11
            goto Le7
        Le6:
            r8 = r2
        Le7:
            r4 = r9
        Le8:
            r0.f = r5
            u53 r5 = new u53
            r5.<init>(r6, r4, r8)
        Lef:
            if (r5 != 0) goto Lf3
        Lf1:
            r10 = r3
            goto L11e
        Lf3:
            int r4 = r5.a
            int r6 = r0.f
            int r8 = r6 + r4
            r0.f = r8
            java.lang.String r9 = r0.e
            vz6 r10 = new vz6
            java.lang.String r6 = r9.substring(r6, r8)
            r10.<init>(r6)
            mh1 r6 = new mh1
            boolean r8 = r5.c
            boolean r9 = r5.b
            r5 = r6
            r6 = r10
            mh1 r10 = r0.g
            r5.<init>(r6, r7, r8, r9, r10)
            r0.g = r5
            r5.g = r4
            r5.h = r4
            if (r10 == 0) goto L11d
            r10.f = r5
        L11d:
            r10 = r6
        L11e:
            r6 = r2
            goto L532
        L121:
            int r4 = r0.f
            java.lang.String r5 = r0.e
            int r5 = r5.length()
        L129:
            int r6 = r0.f
            if (r6 == r5) goto L142
            java.lang.String r8 = r0.e
            char r6 = r8.charAt(r6)
            java.util.BitSet r8 = r0.a
            boolean r6 = r8.get(r6)
            if (r6 == 0) goto L13c
            goto L142
        L13c:
            int r6 = r0.f
            int r6 = r6 + r11
            r0.f = r6
            goto L129
        L142:
            int r5 = r0.f
            if (r4 == r5) goto Lf1
            java.lang.String r6 = r0.e
            vz6 r8 = new vz6
            java.lang.String r4 = r6.substring(r4, r5)
            r8.<init>(r4)
            r10 = r8
            goto L11e
        L153:
            int r8 = r0.f
            int r8 = r8 + r11
            r0.f = r8
            m70 r10 = r0.h
            java.lang.String r12 = "]"
            if (r10 != 0) goto L166
            vz6 r4 = new vz6
            r4.<init>(r12)
        L163:
            r10 = r4
            goto L331
        L166:
            vz6 r13 = r10.a
            boolean r14 = r10.c
            boolean r15 = r10.f
            if (r15 != 0) goto L178
            m70 r4 = r10.d
            r0.h = r4
            vz6 r4 = new vz6
            r4.<init>(r12)
            goto L163
        L178:
            char r15 = r0.g()
            r3 = 40
            r2 = -1
            if (r15 != r3) goto L23c
            int r15 = r0.f
            int r15 = r15 + r11
            r0.f = r15
            java.util.regex.Pattern r15 = defpackage.v53.q
            r0.c(r15)
            r16 = r11
            java.lang.String r11 = r0.e
            int r6 = r0.f
            int r6 = defpackage.ln2.Y(r6, r11)
            if (r6 != r2) goto L199
            r2 = 0
            goto L1b6
        L199:
            char r11 = r0.g()
            java.lang.String r9 = r0.e
            int r2 = r0.f
            if (r11 != r4) goto L1ac
            int r2 = r2 + 1
            int r4 = r6 + (-1)
            java.lang.String r2 = r9.substring(r2, r4)
            goto L1b0
        L1ac:
            java.lang.String r2 = r9.substring(r2, r6)
        L1b0:
            r0.f = r6
            java.lang.String r2 = defpackage.c62.a(r2)
        L1b6:
            if (r2 == 0) goto L23a
            r0.c(r15)
            java.lang.String r4 = r0.e
            int r6 = r0.f
            int r9 = r6 + (-1)
            java.lang.String r4 = r4.substring(r9, r6)
            java.util.regex.Pattern r6 = defpackage.v53.s
            java.util.regex.Matcher r4 = r6.matcher(r4)
            boolean r4 = r4.matches()
            if (r4 == 0) goto L224
            java.lang.String r4 = r0.e
            int r9 = r0.f
            int r11 = r4.length()
            if (r9 < r11) goto L1de
        L1db:
            r3 = -1
            r9 = -1
            goto L20a
        L1de:
            char r11 = r4.charAt(r9)
            r6 = 34
            if (r11 == r6) goto L1ef
            r6 = 39
            if (r11 == r6) goto L1ef
            if (r11 == r3) goto L1ed
            goto L1db
        L1ed:
            r6 = 41
        L1ef:
            int r9 = r9 + 1
            int r3 = defpackage.ln2.a0(r4, r9, r6)
            r9 = -1
            if (r3 != r9) goto L1f9
            goto L1db
        L1f9:
            int r9 = r4.length()
            if (r3 >= r9) goto L1db
            char r4 = r4.charAt(r3)
            if (r4 == r6) goto L206
            goto L1db
        L206:
            int r3 = r3 + 1
            r9 = r3
            r3 = -1
        L20a:
            if (r9 != r3) goto L20e
            r3 = 0
            goto L220
        L20e:
            java.lang.String r3 = r0.e
            int r4 = r0.f
            int r4 = r4 + 1
            int r6 = r9 + (-1)
            java.lang.String r3 = r3.substring(r4, r6)
            r0.f = r9
            java.lang.String r3 = defpackage.c62.a(r3)
        L220:
            r0.c(r15)
            goto L225
        L224:
            r3 = 0
        L225:
            char r4 = r0.g()
            r6 = 41
            if (r4 != r6) goto L236
            int r4 = r0.f
            int r4 = r4 + 1
            r0.f = r4
            r4 = r16
            goto L240
        L236:
            r0.f = r8
        L238:
            r4 = 0
            goto L240
        L23a:
            r3 = 0
            goto L238
        L23c:
            r16 = r11
            r2 = 0
            goto L23a
        L240:
            if (r4 != 0) goto L2d7
            int r6 = r0.f
            java.lang.String r9 = r0.e
            int r9 = r9.length()
            if (r6 >= r9) goto L284
            java.lang.String r9 = r0.e
            int r11 = r0.f
            char r9 = r9.charAt(r11)
            r11 = 91
            if (r9 == r11) goto L259
            goto L284
        L259:
            int r9 = r0.f
            int r9 = r9 + 1
            java.lang.String r11 = r0.e
            int r11 = defpackage.ln2.Z(r9, r11)
            int r9 = r11 - r9
            r15 = -1
            if (r11 == r15) goto L284
            r15 = 999(0x3e7, float:1.4E-42)
            if (r9 <= r15) goto L26d
            goto L284
        L26d:
            java.lang.String r9 = r0.e
            int r9 = r9.length()
            if (r11 >= r9) goto L284
            java.lang.String r9 = r0.e
            char r9 = r9.charAt(r11)
            r15 = 93
            if (r9 == r15) goto L280
            goto L284
        L280:
            int r11 = r11 + 1
            r0.f = r11
        L284:
            int r9 = r0.f
            int r9 = r9 - r6
            r11 = 2
            if (r9 <= r11) goto L292
            java.lang.String r11 = r0.e
            int r9 = r9 + r6
            java.lang.String r6 = r11.substring(r6, r9)
            goto L2a0
        L292:
            boolean r6 = r10.g
            if (r6 != 0) goto L29f
            java.lang.String r6 = r0.e
            int r9 = r10.b
            java.lang.String r6 = r6.substring(r9, r8)
            goto L2a0
        L29f:
            r6 = 0
        L2a0:
            if (r6 == 0) goto L2d7
            java.util.regex.Pattern r9 = defpackage.c62.a
            int r9 = r6.length()
            int r9 = r9 + (-1)
            r11 = r16
            java.lang.String r6 = r6.substring(r11, r9)
            java.lang.String r6 = r6.trim()
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r9)
            java.util.regex.Pattern r9 = defpackage.c62.c
            java.util.regex.Matcher r6 = r9.matcher(r6)
            java.lang.String r5 = r6.replaceAll(r5)
            yc1 r6 = r0.d
            java.lang.Object r6 = r6.B
            java.util.Map r6 = (java.util.Map) r6
            java.lang.Object r5 = r6.get(r5)
            qv3 r5 = (defpackage.qv3) r5
            if (r5 == 0) goto L2d7
            java.lang.String r2 = r5.h
            java.lang.String r3 = r5.i
            r4 = 1
        L2d7:
            if (r4 == 0) goto L323
            if (r14 == 0) goto L2e5
            m13 r4 = new m13
            r4.<init>()
            r4.g = r2
            r4.h = r3
            goto L2ea
        L2e5:
            mv3 r4 = new mv3
            r4.<init>(r2, r3)
        L2ea:
            java.lang.Object r2 = r13.f
            a21 r2 = (defpackage.a21) r2
        L2ee:
            if (r2 == 0) goto L2f9
            java.lang.Object r3 = r2.f
            a21 r3 = (defpackage.a21) r3
            r4.b(r2)
            r2 = r3
            goto L2ee
        L2f9:
            mh1 r2 = r10.e
            r0.h(r2)
            java.lang.Object r2 = r4.c
            a21 r2 = (defpackage.a21) r2
            java.lang.Object r3 = r4.d
            a21 r3 = (defpackage.a21) r3
            if (r2 != r3) goto L309
            goto L30c
        L309:
            e(r2, r3)
        L30c:
            r13.j()
            m70 r2 = r0.h
            m70 r2 = r2.d
            r0.h = r2
            if (r14 != 0) goto L163
        L317:
            if (r2 == 0) goto L163
            boolean r3 = r2.c
            if (r3 != 0) goto L320
            r3 = 0
            r2.f = r3
        L320:
            m70 r2 = r2.d
            goto L317
        L323:
            r0.f = r8
            m70 r2 = r0.h
            m70 r2 = r2.d
            r0.h = r2
            vz6 r2 = new vz6
            r2.<init>(r12)
        L330:
            r10 = r2
        L331:
            r6 = 0
            goto L532
        L334:
            int r2 = r0.f
            r16 = 1
            int r2 = r2 + 1
            r0.f = r2
            char r2 = r0.g()
            if (r2 != r8) goto L34e
            vv2 r2 = new vv2
            r2.<init>()
            int r3 = r0.f
            int r3 = r3 + 1
            r0.f = r3
            goto L330
        L34e:
            int r2 = r0.f
            java.lang.String r3 = r0.e
            int r3 = r3.length()
            if (r2 >= r3) goto L387
            java.lang.String r2 = r0.e
            int r3 = r0.f
            int r4 = r3 + 1
            java.lang.String r2 = r2.substring(r3, r4)
            java.util.regex.Pattern r3 = defpackage.v53.k
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r2 = r2.matches()
            if (r2 == 0) goto L387
            java.lang.String r2 = r0.e
            int r3 = r0.f
            int r4 = r3 + 1
            vz6 r5 = new vz6
            java.lang.String r2 = r2.substring(r3, r4)
            r5.<init>(r2)
            int r2 = r0.f
            r16 = 1
            int r2 = r2 + 1
            r0.f = r2
            r10 = r5
            goto L331
        L387:
            vz6 r2 = new vz6
            java.lang.String r3 = "\\"
            r2.<init>(r3)
            goto L330
        L38f:
            int r2 = r0.f
            int r3 = r2 + 1
            r0.f = r3
            vz6 r3 = new vz6
            java.lang.String r4 = "["
            r3.<init>(r4)
            m70 r4 = r0.h
            mh1 r5 = r0.g
            m70 r17 = new m70
            r22 = 0
            r19 = r2
            r18 = r3
            r20 = r4
            r21 = r5
            r17.<init>(r18, r19, r20, r21, r22)
            r3 = r17
            r2 = r20
            if (r2 == 0) goto L3b8
            r11 = 1
            r2.g = r11
        L3b8:
            r0.h = r3
            r10 = r18
            goto L331
        L3be:
            java.util.regex.Pattern r2 = defpackage.v53.n
            java.lang.String r2 = r0.c(r2)
            if (r2 != 0) goto L3c9
        L3c6:
            r10 = 0
            goto L331
        L3c9:
            int r3 = r0.f
        L3cb:
            java.util.regex.Pattern r4 = defpackage.v53.m
            java.lang.String r4 = r0.c(r4)
            if (r4 == 0) goto L422
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L3cb
            hs0 r4 = new hs0
            r4.<init>()
            java.lang.String r5 = r0.e
            int r6 = r0.f
            int r2 = r2.length()
            int r6 = r6 - r2
            java.lang.String r2 = r5.substring(r3, r6)
            r3 = 32
            java.lang.String r2 = r2.replace(r8, r3)
            int r5 = r2.length()
            r6 = 3
            if (r5 < r6) goto L41e
            r5 = 0
            char r6 = r2.charAt(r5)
            if (r6 != r3) goto L41e
            int r6 = r2.length()
            r11 = 1
            int r6 = r6 - r11
            char r6 = r2.charAt(r6)
            if (r6 != r3) goto L41e
            int r6 = r2.length()
            int r3 = defpackage.bl2.S(r3, r5, r6, r2)
            if (r3 == r6) goto L41e
            int r3 = r2.length()
            int r3 = r3 - r11
            java.lang.String r2 = r2.substring(r11, r3)
        L41e:
            r4.g = r2
            goto L163
        L422:
            r0.f = r3
            vz6 r3 = new vz6
            r3.<init>(r2)
        L429:
            r10 = r3
            goto L331
        L42c:
            java.util.regex.Pattern r2 = defpackage.v53.o
            java.lang.String r2 = r0.c(r2)
            if (r2 == 0) goto L454
            int r3 = r2.length()
            r11 = 1
            int r3 = r3 - r11
            java.lang.String r2 = r2.substring(r11, r3)
            mv3 r3 = new mv3
            java.lang.String r4 = "mailto:"
            java.lang.String r4 = r4.concat(r2)
            r5 = 0
            r3.<init>(r4, r5)
            vz6 r4 = new vz6
            r4.<init>(r2)
            r3.b(r4)
        L452:
            r10 = r3
            goto L476
        L454:
            java.util.regex.Pattern r2 = defpackage.v53.p
            java.lang.String r2 = r0.c(r2)
            if (r2 == 0) goto L475
            int r3 = r2.length()
            r11 = 1
            int r3 = r3 - r11
            java.lang.String r2 = r2.substring(r11, r3)
            mv3 r3 = new mv3
            r5 = 0
            r3.<init>(r2, r5)
            vz6 r4 = new vz6
            r4.<init>(r2)
            r3.b(r4)
            goto L452
        L475:
            r10 = 0
        L476:
            if (r10 != 0) goto L331
            java.util.regex.Pattern r2 = defpackage.v53.j
            java.lang.String r2 = r0.c(r2)
            if (r2 == 0) goto L3c6
            bz2 r2 = new bz2
            r2.<init>()
            goto L330
        L487:
            java.util.regex.Pattern r2 = defpackage.v53.l
            java.lang.String r2 = r0.c(r2)
            if (r2 == 0) goto L3c6
            java.lang.String r2 = defpackage.yy2.a(r2)
            vz6 r3 = new vz6
            r3.<init>(r2)
            goto L429
        L499:
            int r2 = r0.f
            r11 = 1
            int r2 = r2 + r11
            r0.f = r2
            char r3 = r0.g()
            r4 = 91
            if (r3 != r4) goto L4d4
            int r3 = r0.f
            int r3 = r3 + r11
            r0.f = r3
            vz6 r3 = new vz6
            java.lang.String r4 = "!["
            r3.<init>(r4)
            m70 r4 = r0.h
            mh1 r5 = r0.g
            m70 r19 = new m70
            r24 = 1
            r21 = r2
            r20 = r3
            r22 = r4
            r23 = r5
            r19.<init>(r20, r21, r22, r23, r24)
            r3 = r19
            r2 = r22
            if (r2 == 0) goto L4ce
            r2.g = r11
        L4ce:
            r0.h = r3
            r10 = r20
            goto L331
        L4d4:
            vz6 r2 = new vz6
            java.lang.String r3 = "!"
            r2.<init>(r3)
            goto L330
        L4dd:
            int r2 = r0.f
            int r2 = r2 + r11
            r0.f = r2
            boolean r2 = r4 instanceof defpackage.vz6
            if (r2 == 0) goto L52b
            vz6 r4 = (defpackage.vz6) r4
            java.lang.String r2 = r4.g
            boolean r2 = r2.endsWith(r5)
            if (r2 == 0) goto L52b
            java.lang.String r2 = r4.g
            java.util.regex.Pattern r3 = defpackage.v53.t
            java.util.regex.Matcher r3 = r3.matcher(r2)
            boolean r5 = r3.find()
            if (r5 == 0) goto L509
            int r5 = r3.end()
            int r3 = r3.start()
            int r3 = r5 - r3
            goto L50a
        L509:
            r3 = 0
        L50a:
            if (r3 <= 0) goto L51a
            int r5 = r2.length()
            int r5 = r5 - r3
            r6 = 0
            java.lang.String r2 = r2.substring(r6, r5)
            r4.g = r2
        L518:
            r11 = 2
            goto L51c
        L51a:
            r6 = 0
            goto L518
        L51c:
            if (r3 < r11) goto L525
            vv2 r2 = new vv2
            r2.<init>()
        L523:
            r10 = r2
            goto L532
        L525:
            wm6 r2 = new wm6
            r2.<init>()
            goto L523
        L52b:
            r6 = 0
            wm6 r2 = new wm6
            r2.<init>()
            goto L523
        L532:
            if (r10 == 0) goto L536
            r4 = r10
            goto L549
        L536:
            int r2 = r0.f
            r16 = 1
            int r2 = r2 + 1
            r0.f = r2
            java.lang.String r2 = java.lang.String.valueOf(r7)
            vz6 r3 = new vz6
            r3.<init>(r2)
            goto L1a
        L549:
            if (r4 == 0) goto L552
            r1.b(r4)
            r2 = r6
            r3 = 0
            goto L13
        L552:
            r5 = 0
            r0.h(r5)
            java.lang.Object r0 = r1.c
            a21 r0 = (defpackage.a21) r0
            java.lang.Object r1 = r1.d
            a21 r1 = (defpackage.a21) r1
            if (r0 != r1) goto L561
            return
        L561:
            e(r0, r1)
            return
    }

    public final char g() {
            r2 = this;
            int r0 = r2.f
            java.lang.String r1 = r2.e
            int r1 = r1.length()
            if (r0 >= r1) goto L13
            java.lang.String r0 = r2.e
            int r2 = r2.f
            char r2 = r0.charAt(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public final void h(defpackage.mh1 r12) {
            r11 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            mh1 r1 = r11.g
        L7:
            if (r1 == 0) goto Lf
            mh1 r2 = r1.e
            if (r2 == r12) goto Lf
            r1 = r2
            goto L7
        Lf:
            if (r1 == 0) goto Ld2
            vz6 r2 = r1.a
            char r3 = r1.b
            java.util.HashMap r4 = r11.c
            java.lang.Character r5 = java.lang.Character.valueOf(r3)
            java.lang.Object r4 = r4.get(r5)
            nh1 r4 = (defpackage.nh1) r4
            boolean r5 = r1.d
            if (r5 == 0) goto Lce
            if (r4 != 0) goto L29
            goto Lce
        L29:
            char r5 = r4.e()
            mh1 r6 = r1.e
            r7 = 0
            r8 = r7
            r9 = r8
        L32:
            if (r6 == 0) goto L54
            if (r6 == r12) goto L54
            java.lang.Character r10 = java.lang.Character.valueOf(r3)
            java.lang.Object r10 = r0.get(r10)
            if (r6 == r10) goto L54
            boolean r10 = r6.c
            if (r10 == 0) goto L51
            char r10 = r6.b
            if (r10 != r5) goto L51
            int r8 = r4.d(r6, r1)
            r9 = 1
            if (r8 <= 0) goto L51
            r5 = r9
            goto L56
        L51:
            mh1 r6 = r6.e
            goto L32
        L54:
            r5 = r9
            r9 = r7
        L56:
            if (r9 != 0) goto L6d
            if (r5 != 0) goto L6a
            java.lang.Character r2 = java.lang.Character.valueOf(r3)
            mh1 r3 = r1.e
            r0.put(r2, r3)
            boolean r2 = r1.c
            if (r2 != 0) goto L6a
            r11.i(r1)
        L6a:
            mh1 r1 = r1.f
            goto Lf
        L6d:
            vz6 r3 = r6.a
            int r5 = r6.g
            int r5 = r5 - r8
            r6.g = r5
            int r5 = r1.g
            int r5 = r5 - r8
            r1.g = r5
            java.lang.String r5 = r3.g
            int r9 = r5.length()
            int r9 = r9 - r8
            java.lang.String r5 = r5.substring(r7, r9)
            r3.g = r5
            java.lang.String r5 = r2.g
            int r9 = r5.length()
            int r9 = r9 - r8
            java.lang.String r5 = r5.substring(r7, r9)
            r2.g = r5
            mh1 r5 = r1.e
        L95:
            if (r5 == 0) goto La0
            if (r5 == r6) goto La0
            mh1 r7 = r5.e
            r11.i(r5)
            r5 = r7
            goto L95
        La0:
            if (r3 == r2) goto Lb0
            java.lang.Object r5 = r3.f
            a21 r5 = (defpackage.a21) r5
            if (r5 != r2) goto La9
            goto Lb0
        La9:
            java.lang.Object r7 = r2.e
            a21 r7 = (defpackage.a21) r7
            e(r5, r7)
        Lb0:
            r4.a(r3, r2, r8)
            int r3 = r6.g
            if (r3 != 0) goto Lbf
            vz6 r3 = r6.a
            r3.j()
            r11.i(r6)
        Lbf:
            int r3 = r1.g
            if (r3 != 0) goto Lf
            mh1 r3 = r1.f
            r2.j()
            r11.i(r1)
            r1 = r3
            goto Lf
        Lce:
            mh1 r1 = r1.f
            goto Lf
        Ld2:
            mh1 r0 = r11.g
            if (r0 == 0) goto Ldc
            if (r0 == r12) goto Ldc
            r11.i(r0)
            goto Ld2
        Ldc:
            return
    }

    public final void i(defpackage.mh1 r3) {
            r2 = this;
            mh1 r0 = r3.e
            if (r0 == 0) goto L8
            mh1 r1 = r3.f
            r0.f = r1
        L8:
            mh1 r3 = r3.f
            if (r3 != 0) goto Lf
            r2.g = r0
            return
        Lf:
            r3.e = r0
            return
    }
}
