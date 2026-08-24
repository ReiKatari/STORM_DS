package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ua0  reason: default package */
/* loaded from: classes.dex */
public final class ua0 {
    public final defpackage.pa a;
    public final defpackage.ta0 b;
    public final java.util.Date c;
    public final java.lang.String d;
    public final java.util.Date e;
    public final java.lang.String f;
    public final java.util.Date g;
    public final long h;
    public final long i;
    public final java.lang.String j;
    public final int k;

    public ua0(defpackage.pa r8, defpackage.ta0 r9) {
            r7 = this;
            r7.<init>()
            r7.a = r8
            r7.b = r9
            r8 = -1
            r7.k = r8
            if (r9 == 0) goto Lb2
            long r0 = r9.c
            r7.h = r0
            long r0 = r9.d
            r7.i = r0
            yw2 r9 = r9.f
            int r0 = r9.size()
            r1 = 0
            r2 = r1
        L1c:
            if (r2 >= r0) goto Lb2
            java.lang.String r3 = r9.b(r2)
            java.lang.String r4 = "Date"
            boolean r5 = r3.equalsIgnoreCase(r4)
            r6 = 0
            if (r5 == 0) goto L3f
            java.lang.String r3 = r9.a(r4)
            if (r3 == 0) goto L35
            java.util.Date r6 = defpackage.cc1.a(r3)
        L35:
            r7.c = r6
            java.lang.String r3 = r9.d(r2)
            r7.d = r3
            goto Lae
        L3f:
            java.lang.String r4 = "Expires"
            boolean r5 = r3.equalsIgnoreCase(r4)
            if (r5 == 0) goto L54
            java.lang.String r3 = r9.a(r4)
            if (r3 == 0) goto L51
            java.util.Date r6 = defpackage.cc1.a(r3)
        L51:
            r7.g = r6
            goto Lae
        L54:
            java.lang.String r4 = "Last-Modified"
            boolean r5 = r3.equalsIgnoreCase(r4)
            if (r5 == 0) goto L6f
            java.lang.String r3 = r9.a(r4)
            if (r3 == 0) goto L66
            java.util.Date r6 = defpackage.cc1.a(r3)
        L66:
            r7.e = r6
            java.lang.String r3 = r9.d(r2)
            r7.f = r3
            goto Lae
        L6f:
            java.lang.String r4 = "ETag"
            boolean r4 = r3.equalsIgnoreCase(r4)
            if (r4 == 0) goto L7e
            java.lang.String r3 = r9.d(r2)
            r7.j = r3
            goto Lae
        L7e:
            java.lang.String r4 = "Age"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto Lae
            java.lang.String r3 = r9.d(r2)
            android.graphics.Bitmap$Config[] r4 = defpackage.k.a
            java.lang.Long r3 = defpackage.xs6.i0(r3)
            if (r3 == 0) goto Lab
            long r3 = r3.longValue()
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto La1
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto Lac
        La1:
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto La9
            r3 = r1
            goto Lac
        La9:
            int r3 = (int) r3
            goto Lac
        Lab:
            r3 = r8
        Lac:
            r7.k = r3
        Lae:
            int r2 = r2 + 1
            goto L1c
        Lb2:
            return
    }

    public final defpackage.va0 a() {
            r24 = this;
            r0 = r24
            pa r1 = r0.a
            java.lang.Object r2 = r1.B
            i03 r2 = (defpackage.i03) r2
            r3 = 0
            ta0 r4 = r0.b
            if (r4 != 0) goto L13
            va0 r0 = new va0
            r0.<init>(r1, r3)
            return r0
        L13:
            go3 r5 = r4.a
            boolean r6 = r2.f()
            if (r6 == 0) goto L25
            boolean r6 = r4.e
            if (r6 != 0) goto L25
            va0 r0 = new va0
            r0.<init>(r1, r3)
            return r0
        L25:
            java.lang.Object r6 = r5.getValue()
            ma0 r6 = (defpackage.ma0) r6
            ma0 r7 = r1.h()
            boolean r7 = r7.b
            if (r7 != 0) goto L17b
            java.lang.Object r7 = r5.getValue()
            ma0 r7 = (defpackage.ma0) r7
            boolean r7 = r7.b
            if (r7 != 0) goto L17b
            yw2 r7 = r4.f
            java.lang.String r8 = "Vary"
            java.lang.String r7 = r7.a(r8)
            java.lang.String r8 = "*"
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L17b
            ma0 r7 = r1.h()
            boolean r8 = r7.a
            if (r8 != 0) goto L174
            java.lang.Object r8 = r1.R
            yw2 r8 = (defpackage.yw2) r8
            java.lang.String r9 = "If-Modified-Since"
            java.lang.String r10 = r8.a(r9)
            if (r10 != 0) goto L174
            java.lang.String r10 = "If-None-Match"
            java.lang.String r8 = r8.a(r10)
            if (r8 == 0) goto L6b
            goto L174
        L6b:
            long r11 = r0.i
            java.util.Date r8 = r0.c
            r13 = 0
            if (r8 == 0) goto L80
            long r15 = r8.getTime()
            r17 = r4
            long r3 = r11 - r15
            long r3 = java.lang.Math.max(r13, r3)
            goto L83
        L80:
            r17 = r4
            r3 = r13
        L83:
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.SECONDS
            r18 = r13
            r13 = -1
            int r14 = r0.k
            if (r14 == r13) goto L95
            long r13 = (long) r14
            long r13 = r15.toMillis(r13)
            long r3 = java.lang.Math.max(r3, r13)
        L95:
            long r13 = r0.h
            long r20 = r11 - r13
            x57 r22 = defpackage.y57.a
            java.lang.Object r22 = r22.c()
            java.lang.Number r22 = (java.lang.Number) r22
            long r22 = r22.longValue()
            long r22 = r22 - r11
            long r3 = r3 + r20
            long r3 = r3 + r22
            java.lang.Object r5 = r5.getValue()
            ma0 r5 = (defpackage.ma0) r5
            int r5 = r5.c
            r20 = r3
            java.util.Date r3 = r0.e
            r4 = -1
            if (r5 == r4) goto Lc0
            long r4 = (long) r5
            long r4 = r15.toMillis(r4)
            goto L100
        Lc0:
            java.util.Date r4 = r0.g
            if (r4 == 0) goto Ld7
            if (r8 == 0) goto Lca
            long r11 = r8.getTime()
        Lca:
            long r4 = r4.getTime()
            long r4 = r4 - r11
            int r2 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
            if (r2 <= 0) goto Ld4
            goto L100
        Ld4:
            r4 = r18
            goto L100
        Ld7:
            if (r3 == 0) goto Ld4
            java.util.List r2 = r2.g
            if (r2 != 0) goto Ldf
            r2 = 0
            goto Leb
        Ldf:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            defpackage.x31.o(r2, r4)
            java.lang.String r2 = r4.toString()
        Leb:
            if (r2 != 0) goto Ld4
            if (r8 == 0) goto Lf3
            long r13 = r8.getTime()
        Lf3:
            long r4 = r3.getTime()
            long r13 = r13 - r4
            int r2 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r2 <= 0) goto Ld4
            r4 = 10
            long r4 = r13 / r4
        L100:
            int r2 = r7.c
            r11 = -1
            if (r2 == r11) goto L10e
            long r12 = (long) r2
            long r12 = r15.toMillis(r12)
            long r4 = java.lang.Math.min(r4, r12)
        L10e:
            int r2 = r7.i
            if (r2 == r11) goto L118
            long r12 = (long) r2
            long r12 = r15.toMillis(r12)
            goto L11a
        L118:
            r12 = r18
        L11a:
            boolean r2 = r6.g
            if (r2 != 0) goto L129
            int r2 = r7.h
            if (r2 == r11) goto L129
            r7 = r3
            long r2 = (long) r2
            long r2 = r15.toMillis(r2)
            goto L12c
        L129:
            r7 = r3
            r2 = r18
        L12c:
            boolean r6 = r6.a
            if (r6 != 0) goto L140
            long r11 = r20 + r12
            long r4 = r4 + r2
            int r2 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r2 >= 0) goto L140
            va0 r0 = new va0
            r2 = r17
            r1 = 0
            r0.<init>(r1, r2)
            return r0
        L140:
            r2 = r17
            java.lang.String r3 = r0.j
            if (r3 == 0) goto L148
            r9 = r10
            goto L157
        L148:
            if (r7 == 0) goto L150
            java.lang.String r3 = r0.f
            r3.getClass()
            goto L157
        L150:
            if (r8 == 0) goto L16d
            java.lang.String r3 = r0.d
            r3.getClass()
        L157:
            s9 r0 = r1.o()
            java.lang.Object r1 = r0.c
            ww2 r1 = (defpackage.ww2) r1
            r1.b(r9, r3)
            pa r1 = new pa
            r1.<init>(r0)
            va0 r0 = new va0
            r0.<init>(r1, r2)
            return r0
        L16d:
            va0 r0 = new va0
            r2 = 0
            r0.<init>(r1, r2)
            return r0
        L174:
            r2 = r3
            va0 r0 = new va0
            r0.<init>(r1, r2)
            return r0
        L17b:
            r2 = r3
            va0 r0 = new va0
            r0.<init>(r1, r2)
            return r0
    }
}
