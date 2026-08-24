package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: md4  reason: default package */
/* loaded from: classes.dex */
public final class md4 {
    public final defpackage.tp6 a;
    public final defpackage.tp6 b;
    public final defpackage.de5 c;
    public final defpackage.pu d;
    public final defpackage.pu e;
    public defpackage.jd4 f;
    public int g;
    public defpackage.ld4 h;
    public final java.util.LinkedHashSet i;
    public final java.util.LinkedHashSet j;
    public final java.util.LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public md4() {
            r2 = this;
            r2.<init>()
            nd4 r0 = defpackage.nd4.i
            tp6 r0 = defpackage.up6.a(r0)
            r2.a = r0
            kd4 r0 = new kd4
            r0.<init>()
            tp6 r0 = defpackage.up6.a(r0)
            r2.b = r0
            de5 r1 = new de5
            r1.<init>(r0)
            r2.c = r1
            pu r0 = new pu
            r0.<init>()
            r2.d = r0
            pu r0 = new pu
            r0.<init>()
            r2.e = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r2.i = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r2.j = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r2.k = r0
            return
    }

    public final void a(defpackage.eb r3, defpackage.ld4 r4, int r5) {
            r2 = this;
            r3.getClass()
            eb r0 = r4.a
            if (r0 != 0) goto L36
            r0 = 1
            if (r5 == 0) goto L12
            if (r5 == r0) goto Lf
            java.util.LinkedHashSet r1 = r2.i
            goto L14
        Lf:
            java.util.LinkedHashSet r1 = r2.j
            goto L14
        L12:
            java.util.LinkedHashSet r1 = r2.k
        L14:
            r1.add(r4)
            r4.a = r3
            de5 r3 = r2.c
            rp6 r3 = r3.A
            java.lang.Object r3 = r3.getValue()
            kd4 r3 = (defpackage.kd4) r3
            r3.getClass()
            if (r5 == 0) goto L30
            if (r5 == r0) goto L2d
            boolean r2 = r2.n
            goto L32
        L2d:
            boolean r2 = r2.l
            goto L32
        L30:
            boolean r2 = r2.m
        L32:
            r4.b(r2)
            return
        L36:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Input '"
            r2.<init>(r3)
            r2.append(r4)
            eb r3 = r4.a
            java.lang.String r4 = "' is already added to dispatcher "
            r2.append(r4)
            r2.append(r3)
            r3 = 46
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public final void b() {
            r11 = this;
            r0 = 1
            r1 = 0
            pu r2 = r11.d
            if (r2 == 0) goto Le
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto Le
        Lc:
            r3 = r1
            goto L24
        Le:
            java.util.Iterator r3 = r2.iterator()
        L12:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lc
            java.lang.Object r4 = r3.next()
            jd4 r4 = (defpackage.jd4) r4
            boolean r4 = r4.b
            if (r4 != 0) goto L23
            goto L12
        L23:
            r3 = r0
        L24:
            pu r4 = r11.e
            if (r4 == 0) goto L30
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L30
        L2e:
            r5 = r1
            goto L46
        L30:
            java.util.Iterator r5 = r4.iterator()
        L34:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L2e
            java.lang.Object r6 = r5.next()
            jd4 r6 = (defpackage.jd4) r6
            boolean r6 = r6.b
            if (r6 != 0) goto L45
            goto L34
        L45:
            r5 = r0
        L46:
            if (r3 != 0) goto L4d
            if (r5 == 0) goto L4b
            goto L4d
        L4b:
            r6 = r1
            goto L4e
        L4d:
            r6 = r0
        L4e:
            boolean r7 = r11.m
            if (r7 == r3) goto L54
            r7 = r0
            goto L55
        L54:
            r7 = r1
        L55:
            boolean r8 = r11.l
            if (r8 == r5) goto L5b
            r8 = r0
            goto L5c
        L5b:
            r8 = r1
        L5c:
            boolean r9 = r11.n
            if (r9 == r6) goto L61
            goto L62
        L61:
            r0 = r1
        L62:
            java.util.LinkedHashSet r9 = r11.k
            if (r7 == 0) goto L7a
            java.util.Iterator r7 = r9.iterator()
        L6a:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L7a
            java.lang.Object r10 = r7.next()
            ld4 r10 = (defpackage.ld4) r10
            r10.b(r3)
            goto L6a
        L7a:
            java.util.LinkedHashSet r7 = r11.j
            if (r8 == 0) goto L92
            java.util.Iterator r8 = r7.iterator()
        L82:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L92
            java.lang.Object r10 = r8.next()
            ld4 r10 = (defpackage.ld4) r10
            r10.b(r5)
            goto L82
        L92:
            java.util.LinkedHashSet r8 = r11.i
            if (r0 == 0) goto Laa
            java.util.Iterator r0 = r8.iterator()
        L9a:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto Laa
            java.lang.Object r10 = r0.next()
            ld4 r10 = (defpackage.ld4) r10
            r10.b(r6)
            goto L9a
        Laa:
            r11.m = r3
            r11.l = r5
            r11.n = r6
            jd4 r0 = r11.f
            if (r0 != 0) goto Lb8
            jd4 r0 = r11.c(r1)
        Lb8:
            jd4 r3 = r11.f
            if (r3 != 0) goto Lc0
            jd4 r3 = r11.c(r1)
        Lc0:
            boolean r0 = defpackage.nb3.k(r3, r0)
            if (r0 != 0) goto Lc8
            goto L169
        Lc8:
            if (r3 != 0) goto Ld0
            kd4 r0 = new kd4
            r0.<init>()
            goto L11a
        Ld0:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r2.iterator()
        Ld9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Le8
            java.lang.Object r2 = r1.next()
            jd4 r2 = (defpackage.jd4) r2
            boolean r2 = r2.b
            goto Ld9
        Le8:
            java.util.Iterator r1 = r4.iterator()
        Lec:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lfb
            java.lang.Object r2 = r1.next()
            jd4 r2 = (defpackage.jd4) r2
            boolean r2 = r2.b
            goto Lec
        Lfb:
            kj2 r1 = r3.a
            kd4 r2 = new kd4
            kw3 r3 = defpackage.hf.I()
            defpackage.gt0.A0(r3, r0)
            r3.add(r1)
            yt1 r1 = defpackage.yt1.A
            defpackage.gt0.A0(r3, r1)
            kw3 r1 = defpackage.hf.A(r3)
            int r0 = r0.size()
            r2.<init>(r0, r1)
            r0 = r2
        L11a:
            tp6 r11 = r11.b
            java.lang.Object r1 = r11.getValue()
            kd4 r1 = (defpackage.kd4) r1
            boolean r1 = defpackage.nb3.k(r1, r0)
            if (r1 == 0) goto L129
            goto L169
        L129:
            r1 = 0
            r11.m(r1, r0)
            java.util.Iterator r11 = r9.iterator()
        L131:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L141
            java.lang.Object r0 = r11.next()
            ld4 r0 = (defpackage.ld4) r0
            r0.getClass()
            goto L131
        L141:
            java.util.Iterator r11 = r7.iterator()
        L145:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L155
            java.lang.Object r0 = r11.next()
            ld4 r0 = (defpackage.ld4) r0
            r0.getClass()
            goto L145
        L155:
            java.util.Iterator r11 = r8.iterator()
        L159:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L169
            java.lang.Object r0 = r11.next()
            ld4 r0 = (defpackage.ld4) r0
            r0.getClass()
            goto L159
        L169:
            return
    }

    public final defpackage.jd4 c(int r4) {
            r3 = this;
            r0 = -1
            pu r1 = r3.e
            pu r3 = r3.d
            r2 = 0
            if (r4 == r0) goto L89
            if (r4 == 0) goto L53
            r0 = 1
            if (r4 != r0) goto L36
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L21
            java.lang.Object r4 = r3.next()
            jd4 r4 = (defpackage.jd4) r4
            r4.getClass()
            goto L11
        L21:
            java.util.Iterator r3 = r1.iterator()
        L25:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L35
            java.lang.Object r4 = r3.next()
            jd4 r4 = (defpackage.jd4) r4
            r4.getClass()
            goto L25
        L35:
            return r2
        L36:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported direction: '"
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = "'."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L53:
            java.util.Iterator r3 = r3.iterator()
        L57:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L69
            java.lang.Object r4 = r3.next()
            r0 = r4
            jd4 r0 = (defpackage.jd4) r0
            boolean r0 = r0.b
            if (r0 != 0) goto L6a
            goto L57
        L69:
            r4 = r2
        L6a:
            jd4 r4 = (defpackage.jd4) r4
            if (r4 != 0) goto L88
            java.util.Iterator r3 = r1.iterator()
        L72:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L85
            java.lang.Object r4 = r3.next()
            r0 = r4
            jd4 r0 = (defpackage.jd4) r0
            boolean r0 = r0.b
            if (r0 != 0) goto L84
            goto L72
        L84:
            r2 = r4
        L85:
            jd4 r2 = (defpackage.jd4) r2
            return r2
        L88:
            return r4
        L89:
            java.util.Iterator r3 = r3.iterator()
        L8d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L9f
            java.lang.Object r4 = r3.next()
            r0 = r4
            jd4 r0 = (defpackage.jd4) r0
            boolean r0 = r0.b
            if (r0 == 0) goto L8d
            goto La0
        L9f:
            r4 = r2
        La0:
            jd4 r4 = (defpackage.jd4) r4
            if (r4 != 0) goto Lbd
            java.util.Iterator r3 = r1.iterator()
        La8:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lba
            java.lang.Object r4 = r3.next()
            r0 = r4
            jd4 r0 = (defpackage.jd4) r0
            boolean r0 = r0.b
            if (r0 == 0) goto La8
            r2 = r4
        Lba:
            jd4 r2 = (defpackage.jd4) r2
            return r2
        Lbd:
            return r4
    }
}
