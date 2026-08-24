package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rs6  reason: default package */
/* loaded from: classes.dex */
public abstract class rs6 extends defpackage.hi2 {
    public static java.lang.String Q(java.lang.String r3) {
            ev r0 = new ev
            r1 = 4
            r0.<init>(r3, r1)
            c70 r3 = new c70
            r1 = 15
            java.lang.String r2 = "    "
            r3.<init>(r2, r1)
            qd2 r1 = new qd2
            r2 = 2
            r1.<init>(r0, r3, r2)
            java.lang.String r3 = "\n"
            java.lang.String r3 = defpackage.sb6.a0(r1, r3)
            return r3
    }

    public static java.lang.String R(java.lang.String r11) {
            java.util.List r0 = defpackage.qs6.z0(r11)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        Ld:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L24
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = defpackage.qs6.v0(r4)
            if (r4 != 0) goto Ld
            r1.add(r3)
            goto Ld
        L24:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.ht0.v0(r1, r3)
            r2.<init>(r3)
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L35:
            if (r5 >= r3) goto L64
            java.lang.Object r6 = r1.get(r5)
            int r5 = r5 + 1
            java.lang.String r6 = (java.lang.String) r6
            int r7 = r6.length()
            r8 = r4
        L44:
            r9 = -1
            if (r8 >= r7) goto L55
            char r10 = r6.charAt(r8)
            boolean r10 = defpackage.g04.J(r10)
            if (r10 != 0) goto L52
            goto L56
        L52:
            int r8 = r8 + 1
            goto L44
        L55:
            r8 = r9
        L56:
            if (r8 != r9) goto L5c
            int r8 = r6.length()
        L5c:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)
            r2.add(r6)
            goto L35
        L64:
            java.util.Iterator r1 = r2.iterator()
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 != 0) goto L71
            r2 = r3
            goto L8b
        L71:
            java.lang.Object r2 = r1.next()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
        L77:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L8b
            java.lang.Object r5 = r1.next()
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r6 = r2.compareTo(r5)
            if (r6 <= 0) goto L77
            r2 = r5
            goto L77
        L8b:
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L94
            int r1 = r2.intValue()
            goto L95
        L94:
            r1 = r4
        L95:
            int r11 = r11.length()
            r0.size()
            int r2 = r0.size()
            int r2 = r2 + (-1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lab:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto Lef
            java.lang.Object r6 = r0.next()
            int r7 = r4 + 1
            if (r4 < 0) goto Leb
            java.lang.String r6 = (java.lang.String) r6
            if (r4 == 0) goto Lbf
            if (r4 != r2) goto Lc7
        Lbf:
            boolean r4 = defpackage.qs6.v0(r6)
            if (r4 == 0) goto Lc7
            r4 = r3
            goto Ld8
        Lc7:
            r6.getClass()
            if (r1 < 0) goto Ldf
            int r4 = r6.length()
            if (r1 <= r4) goto Ld3
            goto Ld4
        Ld3:
            r4 = r1
        Ld4:
            java.lang.String r4 = r6.substring(r4)
        Ld8:
            if (r4 == 0) goto Ldd
            r5.add(r4)
        Ldd:
            r4 = r7
            goto Lab
        Ldf:
            java.lang.String r11 = "Requested character count "
            java.lang.String r0 = " is less than zero."
            java.lang.String r11 = defpackage.lb1.k(r11, r1, r0)
            defpackage.i.f(r11)
            return r3
        Leb:
            defpackage.hf.q0()
            throw r3
        Lef:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r11)
            java.lang.String r11 = "\n"
            r1 = 124(0x7c, float:1.74E-43)
            defpackage.gt0.O0(r5, r0, r11, r3, r1)
            java.lang.String r11 = r0.toString()
            return r11
    }

    public static java.lang.String S(java.lang.String r12) {
            java.lang.String r0 = "|"
            boolean r1 = defpackage.qs6.v0(r0)
            r2 = 0
            if (r1 != 0) goto L8a
            java.util.List r1 = defpackage.qs6.z0(r12)
            int r12 = r12.length()
            r1.size()
            int r3 = r1.size()
            int r3 = r3 + (-1)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
            r5 = 0
            r6 = r5
        L25:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L79
            java.lang.Object r7 = r1.next()
            int r8 = r6 + 1
            if (r6 < 0) goto L75
            java.lang.String r7 = (java.lang.String) r7
            if (r6 == 0) goto L39
            if (r6 != r3) goto L41
        L39:
            boolean r6 = defpackage.qs6.v0(r7)
            if (r6 == 0) goto L41
            r7 = r2
            goto L6e
        L41:
            int r6 = r7.length()
            r9 = r5
        L46:
            r10 = -1
            if (r9 >= r6) goto L57
            char r11 = r7.charAt(r9)
            boolean r11 = defpackage.g04.J(r11)
            if (r11 != 0) goto L54
            goto L58
        L54:
            int r9 = r9 + 1
            goto L46
        L57:
            r9 = r10
        L58:
            if (r9 != r10) goto L5c
        L5a:
            r6 = r2
            goto L6b
        L5c:
            boolean r6 = defpackage.xs6.f0(r7, r0, r9, r5)
            if (r6 == 0) goto L5a
            int r6 = r0.length()
            int r6 = r6 + r9
            java.lang.String r6 = r7.substring(r6)
        L6b:
            if (r6 == 0) goto L6e
            r7 = r6
        L6e:
            if (r7 == 0) goto L73
            r4.add(r7)
        L73:
            r6 = r8
            goto L25
        L75:
            defpackage.hf.q0()
            throw r2
        L79:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.lang.String r12 = "\n"
            r1 = 124(0x7c, float:1.74E-43)
            defpackage.gt0.O0(r4, r0, r12, r2, r1)
            java.lang.String r12 = r0.toString()
            return r12
        L8a:
            java.lang.String r12 = "marginPrefix must be non-blank string."
            defpackage.i.h(r12)
            return r2
    }
}
