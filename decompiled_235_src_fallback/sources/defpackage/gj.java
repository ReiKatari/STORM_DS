package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gj  reason: default package */
/* loaded from: classes.dex */
public final class gj implements defpackage.as4 {
    public final java.lang.String a;
    public final defpackage.s47 b;
    public final java.util.List c;
    public final java.util.List d;
    public final defpackage.ki2 e;
    public final defpackage.qh1 f;
    public final defpackage.km g;
    public final java.lang.CharSequence h;
    public final defpackage.dm3 i;
    public defpackage.m44 j;
    public final boolean k;
    public final int l;

    public gj(java.lang.String r41, defpackage.s47 r42, java.util.List r43, java.util.List r44, defpackage.ki2 r45, defpackage.qh1 r46) {
            r40 = this;
            r0 = r40
            r1 = r42
            r2 = r43
            r3 = r46
            r0.<init>()
            r4 = r41
            r0.a = r4
            r0.b = r1
            r0.c = r2
            r4 = r44
            r0.d = r4
            r4 = r45
            r0.e = r4
            r0.f = r3
            km r4 = new km
            float r5 = r3.a()
            r6 = 1
            r4.<init>(r6)
            r4.density = r5
            b17 r5 = defpackage.b17.b
            r4.b = r5
            r5 = 3
            r4.c = r5
            ge6 r7 = defpackage.ge6.d
            r4.d = r7
            r0.g = r4
            boolean r7 = defpackage.jw2.h(r1)
            nn6 r8 = r1.a
            ds4 r1 = r1.b
            r9 = 0
            if (r7 != 0) goto L43
            r7 = r9
            goto L67
        L43:
            d51 r7 = defpackage.zs1.a
            d51 r7 = defpackage.zs1.a
            java.lang.Object r10 = r7.B
            pp6 r10 = (defpackage.pp6) r10
            if (r10 == 0) goto L4e
            goto L5d
        L4e:
            boolean r10 = defpackage.ws1.d()
            if (r10 == 0) goto L5b
            pp6 r10 = r7.g()
            r7.B = r10
            goto L5d
        L5b:
            p33 r10 = defpackage.nb3.l
        L5d:
            java.lang.Object r7 = r10.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
        L67:
            r0.k = r7
            int r7 = r1.b
            gy3 r10 = r8.k
            r11 = 4
            r13 = 2
            if (r7 != r11) goto L73
        L71:
            r7 = r13
            goto La0
        L73:
            r11 = 5
            if (r7 != r11) goto L78
        L76:
            r7 = r5
            goto La0
        L78:
            if (r7 != r6) goto L7c
            r7 = r9
            goto La0
        L7c:
            if (r7 != r13) goto L80
            r7 = r6
            goto La0
        L80:
            if (r7 != r5) goto L83
            goto L85
        L83:
            if (r7 != 0) goto L92b
        L85:
            if (r10 == 0) goto L93
            java.util.List r7 = r10.A
            java.lang.Object r7 = r7.get(r9)
            fy3 r7 = (defpackage.fy3) r7
            java.util.Locale r7 = r7.a
            if (r7 != 0) goto L97
        L93:
            java.util.Locale r7 = java.util.Locale.getDefault()
        L97:
            int r7 = android.text.TextUtils.getLayoutDirectionFromLocale(r7)
            if (r7 == 0) goto L71
            if (r7 == r6) goto L76
            goto L71
        La0:
            r0.l = r7
            fj r7 = new fj
            r7.<init>(r0, r9)
            i47 r1 = r1.i
            if (r1 != 0) goto Lad
            i47 r1 = defpackage.i47.c
        Lad:
            boolean r10 = r1.b
            if (r10 == 0) goto Lb8
            int r10 = r4.getFlags()
            r10 = r10 | 128(0x80, float:1.8E-43)
            goto Lbe
        Lb8:
            int r10 = r4.getFlags()
            r10 = r10 & (-129(0xffffffffffffff7f, float:NaN))
        Lbe:
            r4.setFlags(r10)
            int r1 = r1.a
            if (r1 != r6) goto Ld2
            int r1 = r4.getFlags()
            r1 = r1 | 64
            r4.setFlags(r1)
            r4.setHinting(r9)
            goto Le7
        Ld2:
            if (r1 != r13) goto Ldb
            r4.getFlags()
            r4.setHinting(r6)
            goto Le7
        Ldb:
            if (r1 != r5) goto Le4
            r4.getFlags()
            r4.setHinting(r9)
            goto Le7
        Le4:
            r4.getFlags()
        Le7:
            int r1 = r2.size()
            r5 = r9
        Lec:
            if (r5 >= r1) goto Lff
            java.lang.Object r10 = r2.get(r5)
            r11 = r10
            ep r11 = (defpackage.ep) r11
            java.lang.Object r11 = r11.a
            boolean r11 = r11 instanceof defpackage.nn6
            if (r11 == 0) goto Lfc
            goto L100
        Lfc:
            int r5 = r5 + 1
            goto Lec
        Lff:
            r10 = 0
        L100:
            if (r10 == 0) goto L104
            r1 = r6
            goto L105
        L104:
            r1 = r9
        L105:
            long r10 = r8.b
            oj2 r2 = r8.c
            ij2 r5 = r8.d
            java.lang.String r14 = r8.g
            gy3 r15 = r8.k
            r41 = 0
            e37 r12 = r8.a
            r44 = r6
            f37 r6 = r8.j
            r43 = r14
            long r13 = r8.h
            r16 = r10
            long r9 = defpackage.x47.b(r16)
            r11 = r1
            r18 = r2
            r1 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r19 = defpackage.y47.a(r9, r1)
            if (r19 == 0) goto L139
            r1 = r16
            float r1 = r3.y0(r1)
            r4.setTextSize(r1)
            goto L150
        L139:
            r1 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r9 = defpackage.y47.a(r9, r1)
            if (r9 == 0) goto L150
            float r1 = r4.getTextSize()
            float r2 = defpackage.x47.c(r16)
            float r2 = r2 * r1
            r4.setTextSize(r2)
        L150:
            li2 r1 = r8.f
            if (r1 != 0) goto L15c
            if (r5 != 0) goto L15c
            if (r18 == 0) goto L159
            goto L15c
        L159:
            r16 = r11
            goto L1a2
        L15c:
            if (r18 != 0) goto L161
            oj2 r2 = defpackage.oj2.Y
            goto L163
        L161:
            r2 = r18
        L163:
            if (r5 == 0) goto L168
            int r5 = r5.a
            goto L169
        L168:
            r5 = 0
        L169:
            jj2 r9 = r8.e
            if (r9 == 0) goto L170
            int r9 = r9.a
            goto L173
        L170:
            r9 = 65535(0xffff, float:9.1834E-41)
        L173:
            java.lang.Object r10 = r7.B
            gj r10 = (defpackage.gj) r10
            r16 = r11
            ki2 r11 = r10.e
            mi2 r11 = (defpackage.mi2) r11
            we7 r1 = r11.b(r1, r2, r5, r9)
            boolean r2 = r1 instanceof defpackage.ve7
            if (r2 != 0) goto L196
            m44 r2 = new m44
            m44 r5 = r10.j
            r2.<init>(r1, r5)
            r10.j = r2
            java.lang.Object r1 = r2.R
            r1.getClass()
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            goto L19f
        L196:
            ve7 r1 = (defpackage.ve7) r1
            java.lang.Object r1 = r1.A
            r1.getClass()
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
        L19f:
            r4.setTypeface(r1)
        L1a2:
            r1 = 10
            if (r15 == 0) goto L1ed
            gy3 r2 = defpackage.gy3.L
            bt r2 = defpackage.nx4.a
            gy3 r2 = r2.H()
            boolean r2 = r15.equals(r2)
            if (r2 != 0) goto L1ed
            java.util.ArrayList r2 = new java.util.ArrayList
            int r5 = defpackage.ht0.v0(r15, r1)
            r2.<init>(r5)
            java.util.List r5 = r15.A
            java.util.Iterator r5 = r5.iterator()
        L1c3:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L1d5
            java.lang.Object r9 = r5.next()
            fy3 r9 = (defpackage.fy3) r9
            java.util.Locale r9 = r9.a
            r2.add(r9)
            goto L1c3
        L1d5:
            r9 = 0
            java.util.Locale[] r5 = new java.util.Locale[r9]
            java.lang.Object[] r2 = r2.toArray(r5)
            java.util.Locale[] r2 = (java.util.Locale[]) r2
            int r5 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r5)
            java.util.Locale[] r2 = (java.util.Locale[]) r2
            android.os.LocaleList r5 = new android.os.LocaleList
            r5.<init>(r2)
            r4.setTextLocales(r5)
        L1ed:
            if (r43 == 0) goto L1fc
            java.lang.String r2 = ""
            r5 = r43
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L1fc
            r4.setFontFeatureSettings(r5)
        L1fc:
            if (r6 == 0) goto L21a
            f37 r2 = defpackage.f37.c
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L21a
            float r2 = r4.getTextScaleX()
            float r5 = r6.a
            float r2 = r2 * r5
            r4.setTextScaleX(r2)
            float r2 = r4.getTextSkewX()
            float r5 = r6.b
            float r2 = r2 + r5
            r4.setTextSkewX(r2)
        L21a:
            long r5 = r12.b()
            r4.d(r5)
            f80 r2 = r12.c()
            r5 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            float r9 = r12.a()
            r4.c(r2, r5, r9)
            ge6 r2 = r8.n
            r4.f(r2)
            b17 r2 = r8.m
            r4.g(r2)
            oo1 r2 = r8.p
            r4.e(r2)
            long r5 = defpackage.x47.b(r13)
            r9 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r2 = defpackage.y47.a(r5, r9)
            r5 = 0
            if (r2 == 0) goto L270
            float r2 = defpackage.x47.c(r13)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L259
            goto L270
        L259:
            float r2 = r4.getTextSize()
            float r6 = r4.getTextScaleX()
            float r6 = r6 * r2
            float r2 = r3.y0(r13)
            int r3 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r3 != 0) goto L26b
            goto L286
        L26b:
            float r2 = r2 / r6
            r4.setLetterSpacing(r2)
            goto L286
        L270:
            long r2 = defpackage.x47.b(r13)
            r9 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r2 = defpackage.y47.a(r2, r9)
            if (r2 == 0) goto L286
            float r2 = defpackage.x47.c(r13)
            r4.setLetterSpacing(r2)
        L286:
            long r2 = r8.l
            x20 r4 = r8.i
            if (r16 == 0) goto L2a7
            long r8 = defpackage.x47.b(r13)
            r10 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r6 = defpackage.y47.a(r8, r10)
            if (r6 == 0) goto L2a7
            float r6 = defpackage.x47.c(r13)
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 != 0) goto L2a4
            goto L2a7
        L2a4:
            r6 = r44
            goto L2a8
        L2a7:
            r6 = 0
        L2a8:
            long r8 = defpackage.kt0.h
            boolean r10 = defpackage.kt0.d(r2, r8)
            if (r10 != 0) goto L2bb
            long r10 = defpackage.kt0.g
            boolean r10 = defpackage.kt0.d(r2, r10)
            if (r10 != 0) goto L2bb
            r10 = r44
            goto L2bc
        L2bb:
            r10 = 0
        L2bc:
            if (r4 == 0) goto L2ca
            float r11 = r4.a
            int r11 = java.lang.Float.compare(r11, r5)
            if (r11 != 0) goto L2c7
            goto L2ca
        L2c7:
            r11 = r44
            goto L2cb
        L2ca:
            r11 = 0
        L2cb:
            if (r6 != 0) goto L2d4
            if (r10 != 0) goto L2d4
            if (r11 != 0) goto L2d4
            r2 = r41
            goto L30a
        L2d4:
            if (r6 == 0) goto L2d9
        L2d6:
            r30 = r13
            goto L2dc
        L2d9:
            long r13 = defpackage.x47.c
            goto L2d6
        L2dc:
            if (r10 == 0) goto L2e1
            r35 = r2
            goto L2e3
        L2e1:
            r35 = r8
        L2e3:
            if (r11 == 0) goto L2e8
            r32 = r4
            goto L2ea
        L2e8:
            r32 = r41
        L2ea:
            nn6 r20 = new nn6
            r38 = 0
            r39 = 63103(0xf67f, float:8.8426E-41)
            r21 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r33 = 0
            r34 = 0
            r37 = 0
            r20.<init>(r21, r23, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r37, r38, r39)
            r2 = r20
        L30a:
            java.util.List r3 = r0.c
            if (r2 == 0) goto L33c
            int r3 = r3.size()
            int r3 = r3 + 1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r6 = 0
        L31a:
            if (r6 >= r3) goto L33b
            if (r6 != 0) goto L32b
            ep r8 = new ep
            java.lang.String r9 = r0.a
            int r9 = r9.length()
            r10 = 0
            r8.<init>(r2, r10, r9)
            goto L335
        L32b:
            java.util.List r8 = r0.c
            int r9 = r6 + (-1)
            java.lang.Object r8 = r8.get(r9)
            ep r8 = (defpackage.ep) r8
        L335:
            r4.add(r8)
            int r6 = r6 + 1
            goto L31a
        L33b:
            r3 = r4
        L33c:
            java.lang.String r2 = r0.a
            km r4 = r0.g
            float r4 = r4.getTextSize()
            s47 r6 = r0.b
            java.util.List r8 = r0.d
            qh1 r12 = r0.f
            boolean r9 = r0.k
            dj r10 = defpackage.ej.a
            if (r9 == 0) goto L387
            boolean r9 = defpackage.ws1.d()
            if (r9 == 0) goto L387
            hy4 r9 = r6.c
            if (r9 == 0) goto L366
            ux4 r9 = r9.b
            if (r9 == 0) goto L366
            int r9 = r9.b
            jt1 r10 = new jt1
            r10.<init>(r9)
            goto L368
        L366:
            r10 = r41
        L368:
            if (r10 != 0) goto L36d
            r9 = 0
            r15 = 2
            goto L376
        L36d:
            int r9 = r10.a
            r15 = 2
            if (r9 != r15) goto L375
            r9 = r44
            goto L376
        L375:
            r9 = 0
        L376:
            ws1 r10 = defpackage.ws1.a()
            int r11 = r2.length()
            r13 = 0
            java.lang.CharSequence r9 = r10.g(r13, r11, r9, r2)
            r9.getClass()
            goto L389
        L387:
            r15 = 2
            r9 = r2
        L389:
            boolean r10 = r3.isEmpty()
            r13 = 0
            r16 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            if (r10 == 0) goto L3b4
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto L3b4
            ds4 r10 = r6.b
            g37 r10 = r10.d
            g37 r11 = defpackage.g37.c
            boolean r10 = defpackage.nb3.k(r10, r11)
            if (r10 == 0) goto L3b4
            ds4 r10 = r6.b
            long r10 = r10.c
            long r10 = r10 & r16
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 != 0) goto L3b4
            goto L917
        L3b4:
            boolean r10 = r9 instanceof android.text.Spannable
            if (r10 == 0) goto L3bb
            android.text.Spannable r9 = (android.text.Spannable) r9
            goto L3c1
        L3bb:
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r9)
            r9 = r10
        L3c1:
            nn6 r10 = r6.a
            ds4 r11 = r6.b
            b17 r10 = r10.m
            r42 = r5
            b17 r5 = defpackage.b17.c
            boolean r5 = defpackage.nb3.k(r10, r5)
            r10 = 33
            if (r5 == 0) goto L3e0
            dj r5 = defpackage.ej.a
            int r2 = r2.length()
            r18 = r13
            r13 = 0
            r9.setSpan(r5, r13, r2, r10)
            goto L3e2
        L3e0:
            r18 = r13
        L3e2:
            hy4 r2 = r6.c
            if (r2 == 0) goto L3ed
            ux4 r2 = r2.b
            if (r2 == 0) goto L3ed
            boolean r2 = r2.a
            goto L3ee
        L3ed:
            r2 = 0
        L3ee:
            if (r2 == 0) goto L40f
            xu3 r2 = r11.f
            if (r2 != 0) goto L40f
            long r1 = r11.c
            float r1 = defpackage.hi2.K(r1, r4, r12)
            boolean r2 = java.lang.Float.isNaN(r1)
            if (r2 != 0) goto L40d
            tu3 r2 = new tu3
            r2.<init>(r1)
            int r1 = r9.length()
            r13 = 0
            r9.setSpan(r2, r13, r1, r10)
        L40d:
            r13 = 0
            goto L467
        L40f:
            xu3 r2 = r11.f
            if (r2 != 0) goto L415
            xu3 r2 = defpackage.xu3.d
        L415:
            long r13 = r11.c
            float r21 = defpackage.hi2.K(r13, r4, r12)
            boolean r5 = java.lang.Float.isNaN(r21)
            if (r5 != 0) goto L40d
            int r5 = r9.length()
            if (r5 != 0) goto L428
            goto L42e
        L428:
            char r5 = defpackage.qs6.w0(r9)
            if (r5 != r1) goto L437
        L42e:
            int r1 = r9.length()
            int r1 = r1 + 1
        L434:
            r22 = r1
            goto L43c
        L437:
            int r1 = r9.length()
            goto L434
        L43c:
            yu3 r20 = new yu3
            int r1 = r2.b
            r5 = r1 & 1
            if (r5 <= 0) goto L447
            r23 = r44
            goto L449
        L447:
            r23 = 0
        L449:
            r1 = r1 & 16
            if (r1 <= 0) goto L450
            r24 = r44
            goto L452
        L450:
            r24 = 0
        L452:
            float r1 = r2.a
            int r2 = r2.c
            r25 = r1
            r26 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r1 = r20
            int r2 = r9.length()
            r13 = 0
            r9.setSpan(r1, r13, r2, r10)
        L467:
            g37 r1 = r11.d
            if (r1 == 0) goto L50e
            r45 = r13
            long r13 = r1.a
            long r1 = r1.b
            r5 = r11
            long r10 = defpackage.hi2.E(r45)
            boolean r10 = defpackage.x47.a(r13, r10)
            if (r10 == 0) goto L486
            long r10 = defpackage.hi2.E(r45)
            boolean r10 = defpackage.x47.a(r1, r10)
            if (r10 != 0) goto L48c
        L486:
            long r10 = r13 & r16
            int r10 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r10 != 0) goto L490
        L48c:
            r16 = r5
            goto L510
        L490:
            long r10 = r1 & r16
            int r10 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r10 != 0) goto L497
            goto L48c
        L497:
            long r10 = defpackage.x47.b(r13)
            r46 = r4
            r16 = r5
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r17 = defpackage.y47.a(r10, r4)
            if (r17 == 0) goto L4b4
            float r10 = r12.y0(r13)
            r4 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L4c8
        L4b4:
            r4 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r10 = defpackage.y47.a(r10, r4)
            if (r10 == 0) goto L4c6
            float r10 = defpackage.x47.c(r13)
            float r10 = r10 * r46
            goto L4c8
        L4c6:
            r10 = r42
        L4c8:
            long r13 = defpackage.x47.b(r1)
            r4 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r11 = defpackage.y47.a(r13, r4)
            if (r11 == 0) goto L4dc
            float r1 = r12.y0(r1)
            goto L4f0
        L4dc:
            r4 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r11 = defpackage.y47.a(r13, r4)
            if (r11 == 0) goto L4ee
            float r1 = defpackage.x47.c(r1)
            float r1 = r1 * r46
            goto L4f0
        L4ee:
            r1 = r42
        L4f0:
            android.text.style.LeadingMarginSpan$Standard r2 = new android.text.style.LeadingMarginSpan$Standard
            double r4 = (double) r10
            double r4 = java.lang.Math.ceil(r4)
            float r4 = (float) r4
            int r4 = (int) r4
            double r10 = (double) r1
            double r10 = java.lang.Math.ceil(r10)
            float r1 = (float) r10
            int r1 = (int) r1
            r2.<init>(r4, r1)
            int r1 = r9.length()
            r4 = 33
            r13 = 0
            r9.setSpan(r2, r13, r1, r4)
            goto L510
        L50e:
            r16 = r11
        L510:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r3.size()
            r1.<init>(r2)
            int r2 = r3.size()
            r4 = 0
        L51e:
            if (r4 >= r2) goto L548
            java.lang.Object r5 = r3.get(r4)
            ep r5 = (defpackage.ep) r5
            java.lang.Object r10 = r5.a
            boolean r11 = r10 instanceof defpackage.nn6
            if (r11 == 0) goto L545
            r11 = r10
            nn6 r11 = (defpackage.nn6) r11
            li2 r13 = r11.f
            if (r13 != 0) goto L542
            ij2 r13 = r11.d
            if (r13 != 0) goto L542
            oj2 r11 = r11.c
            if (r11 == 0) goto L53c
            goto L542
        L53c:
            nn6 r10 = (defpackage.nn6) r10
            jj2 r10 = r10.e
            if (r10 == 0) goto L545
        L542:
            r1.add(r5)
        L545:
            int r4 = r4 + 1
            goto L51e
        L548:
            nn6 r2 = r6.a
            li2 r4 = r2.f
            if (r4 != 0) goto L55f
            ij2 r5 = r2.d
            if (r5 != 0) goto L55f
            oj2 r5 = r2.c
            if (r5 == 0) goto L557
            goto L55f
        L557:
            jj2 r5 = r2.e
            if (r5 == 0) goto L55c
            goto L55f
        L55c:
            r2 = r41
            goto L58b
        L55f:
            oj2 r5 = r2.c
            ij2 r6 = r2.d
            jj2 r2 = r2.e
            nn6 r20 = new nn6
            r38 = 0
            r39 = 65475(0xffc3, float:9.175E-41)
            r21 = 0
            r23 = 0
            r29 = 0
            r30 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r37 = 0
            r27 = r2
            r28 = r4
            r25 = r5
            r26 = r6
            r20.<init>(r21, r23, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r37, r38, r39)
            r2 = r20
        L58b:
            l4 r4 = new l4
            r5 = 15
            r4.<init>(r5, r9, r7)
            int r5 = r1.size()
            r6 = r44
            if (r5 > r6) goto L5cf
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L660
            r13 = 0
            java.lang.Object r5 = r1.get(r13)
            ep r5 = (defpackage.ep) r5
            java.lang.Object r5 = r5.a
            nn6 r5 = (defpackage.nn6) r5
            if (r2 != 0) goto L5ae
            goto L5b2
        L5ae:
            nn6 r5 = r2.c(r5)
        L5b2:
            java.lang.Object r2 = r1.get(r13)
            ep r2 = (defpackage.ep) r2
            int r2 = r2.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.get(r13)
            ep r1 = (defpackage.ep) r1
            int r1 = r1.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.e(r5, r2, r1)
            goto L660
        L5cf:
            int r5 = r1.size()
            int r6 = r5 * 2
            int[] r7 = new int[r6]
            int r10 = r1.size()
            r11 = 0
        L5dc:
            if (r11 >= r10) goto L5f1
            java.lang.Object r13 = r1.get(r11)
            ep r13 = (defpackage.ep) r13
            int r14 = r13.b
            r7[r11] = r14
            int r14 = r11 + r5
            int r13 = r13.c
            r7[r14] = r13
            int r11 = r11 + 1
            goto L5dc
        L5f1:
            r11 = 1
            if (r6 <= r11) goto L5f7
            java.util.Arrays.sort(r7)
        L5f7:
            if (r6 == 0) goto L925
            r13 = 0
            r5 = r7[r13]
            r10 = 0
        L5fd:
            if (r10 >= r6) goto L660
            r11 = r7[r10]
            if (r11 != r5) goto L60a
            r46 = r1
            r18 = r2
            r19 = r6
            goto L656
        L60a:
            int r13 = r1.size()
            r15 = r2
            r14 = 0
        L610:
            if (r14 >= r13) goto L642
            java.lang.Object r18 = r1.get(r14)
            r46 = r1
            r1 = r18
            ep r1 = (defpackage.ep) r1
            r18 = r2
            int r2 = r1.b
            r19 = r6
            int r6 = r1.c
            if (r2 == r6) goto L639
            boolean r2 = defpackage.gp.b(r5, r11, r2, r6)
            if (r2 == 0) goto L639
            java.lang.Object r1 = r1.a
            nn6 r1 = (defpackage.nn6) r1
            if (r15 != 0) goto L634
        L632:
            r15 = r1
            goto L639
        L634:
            nn6 r1 = r15.c(r1)
            goto L632
        L639:
            int r14 = r14 + 1
            r1 = r46
            r2 = r18
            r6 = r19
            goto L610
        L642:
            r46 = r1
            r18 = r2
            r19 = r6
            if (r15 == 0) goto L655
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r4.e(r15, r1, r2)
        L655:
            r5 = r11
        L656:
            int r10 = r10 + 1
            r1 = r46
            r2 = r18
            r6 = r19
            r15 = 2
            goto L5fd
        L660:
            int r1 = r3.size()
            r2 = 0
            r4 = 0
        L666:
            if (r2 >= r1) goto L7c1
            java.lang.Object r5 = r3.get(r2)
            ep r5 = (defpackage.ep) r5
            java.lang.Object r6 = r5.a
            boolean r7 = r6 instanceof defpackage.nn6
            if (r7 == 0) goto L688
            int r13 = r5.b
            int r14 = r5.c
            if (r13 < 0) goto L688
            int r5 = r9.length()
            if (r13 >= r5) goto L688
            if (r14 <= r13) goto L688
            int r5 = r9.length()
            if (r14 <= r5) goto L695
        L688:
            r46 = r1
            r5 = r2
            r43 = r3
            r20 = r4
            r7 = r9
            r10 = r12
            r1 = r16
            goto L7b3
        L695:
            nn6 r6 = (defpackage.nn6) r6
            long r10 = r6.h
            x20 r5 = r6.i
            e37 r7 = r6.a
            if (r5 == 0) goto L6b0
            float r5 = r5.a
            y20 r15 = new y20
            r46 = r1
            r1 = 0
            r15.<init>(r1, r5)
            r5 = 33
            r9.setSpan(r15, r13, r14, r5)
        L6ae:
            r5 = r2
            goto L6b3
        L6b0:
            r46 = r1
            goto L6ae
        L6b3:
            long r1 = r7.b()
            defpackage.hi2.M(r9, r1, r13, r14)
            f80 r1 = r7.c()
            float r2 = r7.a()
            if (r1 == 0) goto L6dc
            boolean r7 = r1 instanceof defpackage.cn6
            if (r7 == 0) goto L6d0
            cn6 r1 = (defpackage.cn6) r1
            long r1 = r1.a
            defpackage.hi2.M(r9, r1, r13, r14)
            goto L6dc
        L6d0:
            yd6 r7 = new yd6
            xd6 r1 = (defpackage.xd6) r1
            r7.<init>(r1, r2)
            r1 = 33
            r9.setSpan(r7, r13, r14, r1)
        L6dc:
            b17 r1 = r6.m
            if (r1 == 0) goto L6fd
            int r1 = r1.a
            c17 r2 = new c17
            r7 = r1 | 1
            if (r7 != r1) goto L6ea
            r7 = 1
            goto L6eb
        L6ea:
            r7 = 0
        L6eb:
            r15 = r1 | 2
            if (r15 != r1) goto L6f1
            r1 = 1
            goto L6f2
        L6f1:
            r1 = 0
        L6f2:
            r2.<init>(r7, r1)
            r1 = 33
            r9.setSpan(r2, r13, r14, r1)
        L6fa:
            r18 = r10
            goto L700
        L6fd:
            r1 = 33
            goto L6fa
        L700:
            long r10 = r6.b
            r2 = r1
            r1 = r16
            defpackage.hi2.N(r9, r10, r12, r13, r14)
            r7 = r9
            java.lang.String r9 = r6.g
            if (r9 == 0) goto L716
            js0 r10 = new js0
            r11 = 1
            r10.<init>(r9, r11)
            r7.setSpan(r10, r13, r14, r2)
        L716:
            f37 r9 = r6.j
            if (r9 == 0) goto L730
            android.text.style.ScaleXSpan r10 = new android.text.style.ScaleXSpan
            float r11 = r9.a
            r10.<init>(r11)
            r7.setSpan(r10, r13, r14, r2)
            y20 r10 = new y20
            float r9 = r9.b
            r11 = 1
            r10.<init>(r11, r9)
            r7.setSpan(r10, r13, r14, r2)
            goto L731
        L730:
            r11 = 1
        L731:
            gy3 r9 = r6.k
            defpackage.hi2.O(r7, r9, r13, r14)
            long r9 = r6.l
            r15 = 16
            int r15 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r15 == 0) goto L74a
            android.text.style.BackgroundColorSpan r15 = new android.text.style.BackgroundColorSpan
            int r9 = defpackage.hv.b0(r9)
            r15.<init>(r9)
            r7.setSpan(r15, r13, r14, r2)
        L74a:
            ge6 r9 = r6.n
            if (r9 == 0) goto L782
            r10 = r12
            long r11 = r9.b
            je6 r15 = new je6
            r43 = r3
            long r2 = r9.a
            int r2 = defpackage.hv.b0(r2)
            r3 = 32
            r20 = r4
            long r3 = r11 >> r3
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r21 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r21
            int r4 = (int) r11
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r9 = r9.c
            int r11 = (r9 > r42 ? 1 : (r9 == r42 ? 0 : -1))
            if (r11 != 0) goto L779
            r9 = 1
        L779:
            r15.<init>(r3, r4, r9, r2)
            r2 = 33
            r7.setSpan(r15, r13, r14, r2)
            goto L787
        L782:
            r43 = r3
            r20 = r4
            r10 = r12
        L787:
            oo1 r3 = r6.p
            if (r3 == 0) goto L793
            po1 r4 = new po1
            r4.<init>(r3)
            r7.setSpan(r4, r13, r14, r2)
        L793:
            long r2 = defpackage.x47.b(r18)
            r11 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r2 = defpackage.y47.a(r2, r11)
            if (r2 != 0) goto L7b1
            long r2 = defpackage.x47.b(r18)
            r11 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r2 = defpackage.y47.a(r2, r11)
            if (r2 == 0) goto L7b3
        L7b1:
            r4 = 1
            goto L7b5
        L7b3:
            r4 = r20
        L7b5:
            int r2 = r5 + 1
            r3 = r43
            r16 = r1
            r9 = r7
            r12 = r10
            r1 = r46
            goto L666
        L7c1:
            r43 = r3
            r20 = r4
            r7 = r9
            r10 = r12
            r1 = r16
            if (r20 == 0) goto L841
            int r2 = r43.size()
            r9 = 0
        L7d0:
            if (r9 >= r2) goto L841
            r3 = r43
            java.lang.Object r4 = r3.get(r9)
            ep r4 = (defpackage.ep) r4
            java.lang.Object r5 = r4.a
            bp r5 = (defpackage.bp) r5
            boolean r6 = r5 instanceof defpackage.nn6
            if (r6 == 0) goto L7f6
            int r6 = r4.b
            int r4 = r4.c
            if (r6 < 0) goto L7f6
            int r11 = r7.length()
            if (r6 >= r11) goto L7f6
            if (r4 <= r6) goto L7f6
            int r11 = r7.length()
            if (r4 <= r11) goto L7f8
        L7f6:
            r5 = r9
            goto L83c
        L7f8:
            nn6 r5 = (defpackage.nn6) r5
            long r11 = r5.h
            long r13 = defpackage.x47.b(r11)
            r5 = r9
            r42 = r10
            r9 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r15 = defpackage.y47.a(r13, r9)
            if (r15 == 0) goto L81a
            nt3 r9 = new nt3
            r10 = r42
            float r11 = r10.y0(r11)
            r9.<init>(r11)
            goto L835
        L81a:
            r10 = r42
            r18 = r11
            r11 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r9 = defpackage.y47.a(r13, r11)
            if (r9 == 0) goto L833
            mt3 r9 = new mt3
            float r11 = defpackage.x47.c(r18)
            r9.<init>(r11)
            goto L835
        L833:
            r9 = r41
        L835:
            if (r9 == 0) goto L83c
            r11 = 33
            r7.setSpan(r9, r6, r4, r11)
        L83c:
            int r9 = r5 + 1
            r43 = r3
            goto L7d0
        L841:
            r3 = r43
            g37 r1 = r1.d
            if (r1 == 0) goto L86a
            long r1 = r1.a
            long r4 = defpackage.x47.b(r1)
            r11 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r6 = defpackage.y47.a(r4, r11)
            if (r6 == 0) goto L85c
            r10.y0(r1)
            goto L86a
        L85c:
            r11 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r4 = defpackage.y47.a(r4, r11)
            if (r4 == 0) goto L86a
            defpackage.x47.c(r1)
        L86a:
            int r1 = r3.size()
            r9 = 0
        L86f:
            if (r9 >= r1) goto L87c
            java.lang.Object r2 = r3.get(r9)
            ep r2 = (defpackage.ep) r2
            java.lang.Object r2 = r2.a
            int r9 = r9 + 1
            goto L86f
        L87c:
            int r1 = r8.size()
            r2 = 0
        L881:
            if (r2 >= r1) goto L916
            java.lang.Object r3 = r8.get(r2)
            ep r3 = (defpackage.ep) r3
            java.lang.Object r4 = r3.a
            hx4 r4 = (defpackage.hx4) r4
            int r5 = r3.b
            int r3 = r3.c
            java.lang.Class<se7> r6 = defpackage.se7.class
            java.lang.Object[] r6 = r7.getSpans(r5, r3, r6)
            int r9 = r6.length
            r11 = 0
        L899:
            if (r11 >= r9) goto L8a5
            r12 = r6[r11]
            se7 r12 = (defpackage.se7) r12
            r7.removeSpan(r12)
            int r11 = r11 + 1
            goto L899
        L8a5:
            ix4 r9 = new ix4
            long r11 = r4.a
            long r13 = r4.b
            float r6 = defpackage.x47.c(r11)
            long r11 = r4.a
            long r11 = defpackage.x47.b(r11)
            r41 = r1
            r4 = r2
            r1 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r15 = defpackage.y47.a(r11, r1)
            if (r15 == 0) goto L8ca
            r1 = 8589934592(0x200000000, double:4.243991582E-314)
            r11 = 0
            goto L8d8
        L8ca:
            r1 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r11 = defpackage.y47.a(r11, r1)
            if (r11 == 0) goto L8d7
            r11 = 1
            goto L8d8
        L8d7:
            r11 = 2
        L8d8:
            float r12 = defpackage.x47.c(r13)
            long r13 = defpackage.x47.b(r13)
            r1 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r15 = defpackage.y47.a(r13, r1)
            if (r15 == 0) goto L8f2
            r1 = 8589934592(0x200000000, double:4.243991582E-314)
            r13 = 0
            goto L900
        L8f2:
            r1 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r13 = defpackage.y47.a(r13, r1)
            if (r13 == 0) goto L8ff
            r13 = 1
            goto L900
        L8ff:
            r13 = 2
        L900:
            r15 = 3
            r14 = r10
            r17 = 2
            r10 = r6
            r6 = 1
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r10 = r14
            r11 = 33
            r7.setSpan(r9, r5, r3, r11)
            int r3 = r4 + 1
            r1 = r41
            r2 = r3
            goto L881
        L916:
            r9 = r7
        L917:
            r0.h = r9
            dm3 r1 = new dm3
            km r2 = r0.g
            int r3 = r0.l
            r1.<init>(r9, r2, r3)
            r0.i = r1
            return
        L925:
            java.lang.String r0 = "Array is empty."
            defpackage.fa6.e(r0)
            throw r41
        L92b:
            r41 = 0
            java.lang.String r0 = "Invalid TextDirection."
            defpackage.i.m(r0)
            throw r41
    }

    @Override // defpackage.as4
    public final boolean a() {
            r2 = this;
            m44 r0 = r2.j
            r1 = 0
            if (r0 == 0) goto La
            boolean r0 = r0.z()
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 != 0) goto L41
            boolean r0 = r2.k
            if (r0 != 0) goto L40
            s47 r2 = r2.b
            boolean r2 = defpackage.jw2.h(r2)
            if (r2 == 0) goto L40
            d51 r2 = defpackage.zs1.a
            d51 r2 = defpackage.zs1.a
            java.lang.Object r0 = r2.B
            pp6 r0 = (defpackage.pp6) r0
            if (r0 == 0) goto L24
            goto L33
        L24:
            boolean r0 = defpackage.ws1.d()
            if (r0 == 0) goto L31
            pp6 r0 = r2.g()
            r2.B = r0
            goto L33
        L31:
            p33 r0 = defpackage.nb3.l
        L33:
            java.lang.Object r2 = r0.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L40
            goto L41
        L40:
            return r1
        L41:
            r2 = 1
            return r2
    }

    @Override // defpackage.as4
    public final float b() {
            r10 = this;
            dm3 r10 = r10.i
            float r0 = r10.e
            android.text.TextPaint r1 = r10.b
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lf
            float r10 = r10.e
            return r10
        Lf:
            java.util.Locale r0 = r1.getTextLocale()
            java.text.BreakIterator r0 = java.text.BreakIterator.getLineInstance(r0)
            nm0 r2 = new nm0
            java.lang.CharSequence r3 = r10.a
            int r4 = r3.length()
            r2.<init>(r4, r3)
            r0.setText(r2)
            java.util.PriorityQueue r2 = new java.util.PriorityQueue
            bk r3 = defpackage.n16.m
            r4 = 10
            r2.<init>(r4, r3)
            int r3 = r0.next()
            r5 = 0
        L33:
            r6 = -1
            if (r3 == r6) goto L6a
            int r6 = r2.size()
            r7 = 1
            if (r6 >= r4) goto L46
            l93 r6 = new l93
            r6.<init>(r5, r3, r7)
            r2.add(r6)
            goto L62
        L46:
            java.lang.Object r6 = r2.peek()
            l93 r6 = (defpackage.l93) r6
            if (r6 == 0) goto L62
            int r8 = r6.B
            int r6 = r6.A
            int r8 = r8 - r6
            int r6 = r3 - r5
            if (r8 >= r6) goto L62
            r2.poll()
            l93 r6 = new l93
            r6.<init>(r5, r3, r7)
            r2.add(r6)
        L62:
            int r5 = r0.next()
            r9 = r5
            r5 = r3
            r3 = r9
            goto L33
        L6a:
            boolean r0 = r2.isEmpty()
            r3 = 0
            if (r0 == 0) goto L72
            goto Lac
        L72:
            java.util.Iterator r0 = r2.iterator()
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Laf
            java.lang.Object r2 = r0.next()
            l93 r2 = (defpackage.l93) r2
            int r3 = r2.A
            int r2 = r2.B
            java.lang.CharSequence r4 = r10.b()
            float r2 = android.text.Layout.getDesiredWidth(r4, r3, r2, r1)
            r3 = r2
        L8f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lac
            java.lang.Object r2 = r0.next()
            l93 r2 = (defpackage.l93) r2
            int r4 = r2.A
            int r2 = r2.B
            java.lang.CharSequence r5 = r10.b()
            float r2 = android.text.Layout.getDesiredWidth(r5, r4, r2, r1)
            float r3 = java.lang.Math.max(r3, r2)
            goto L8f
        Lac:
            r10.e = r3
            return r3
        Laf:
            defpackage.fa6.c()
            return r3
    }

    @Override // defpackage.as4
    public final float c() {
            r0 = this;
            dm3 r0 = r0.i
            float r0 = r0.c()
            return r0
    }
}
