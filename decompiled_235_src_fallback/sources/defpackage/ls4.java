package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ls4  reason: default package */
/* loaded from: classes.dex */
public final class ls4 extends defpackage.uj2 {
    public final java.lang.reflect.Method h;
    public final int i;
    public final java.lang.String j;
    public final defpackage.d90 k;
    public final boolean l;

    public ls4(java.lang.reflect.Method r2, int r3, java.lang.String r4, boolean r5) {
            r1 = this;
            d90 r0 = defpackage.d90.B
            r1.<init>()
            r1.h = r2
            r1.i = r3
            java.lang.String r2 = "name == null"
            java.util.Objects.requireNonNull(r4, r2)
            r1.j = r4
            r1.k = r0
            r1.l = r5
            return
    }

    @Override // defpackage.uj2
    public final void l(defpackage.ok5 r21, java.lang.Object r22) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = 0
            java.lang.String r3 = r0.j
            if (r22 == 0) goto L104
            d90 r4 = r0.k
            r4.getClass()
            java.lang.String r4 = r22.toString()
            java.lang.String r5 = r1.c
            if (r5 == 0) goto Lfe
            int r5 = r4.length()
            r6 = r2
        L1b:
            if (r6 >= r5) goto Lcb
            int r7 = r4.codePointAt(r6)
            boolean r8 = r0.l
            r9 = 37
            r10 = 47
            r11 = -1
            java.lang.String r12 = " \"<>^`{}|\\?#"
            r13 = 127(0x7f, float:1.78E-43)
            r14 = 32
            if (r7 < r14) goto L45
            if (r7 >= r13) goto L45
            int r15 = r12.indexOf(r7)
            if (r15 != r11) goto L45
            if (r8 != 0) goto L3f
            if (r7 == r10) goto L45
            if (r7 != r9) goto L3f
            goto L45
        L3f:
            int r7 = java.lang.Character.charCount(r7)
            int r6 = r6 + r7
            goto L1b
        L45:
            k80 r0 = new k80
            r0.<init>()
            r0.s0(r2, r6, r4)
            r2 = 0
        L4e:
            if (r6 >= r5) goto Lc6
            int r7 = r4.codePointAt(r6)
            if (r8 == 0) goto L67
            r15 = 9
            if (r7 == r15) goto Lb9
            r15 = 10
            if (r7 == r15) goto Lb9
            r15 = 12
            if (r7 == r15) goto Lb9
            r15 = 13
            if (r7 != r15) goto L67
            goto Lb9
        L67:
            if (r7 < r14) goto L7c
            if (r7 >= r13) goto L7c
            int r15 = r12.indexOf(r7)
            if (r15 != r11) goto L7c
            if (r8 != 0) goto L78
            if (r7 == r10) goto L7c
            if (r7 != r9) goto L78
            goto L7c
        L78:
            r0.u0(r7)
            goto Lb9
        L7c:
            if (r2 != 0) goto L83
            k80 r2 = new k80
            r2.<init>()
        L83:
            r2.u0(r7)
            long r10 = r2.B
            r16 = 0
            r13 = r16
        L8c:
            int r16 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r16 >= 0) goto Lb4
            byte r15 = r2.v(r13)
            r16 = r2
            r2 = r15 & 255(0xff, float:3.57E-43)
            r0.n0(r9)
            char[] r17 = defpackage.ok5.l
            int r2 = r2 >> 4
            r2 = r2 & 15
            char r2 = r17[r2]
            r0.n0(r2)
            r2 = r15 & 15
            char r2 = r17[r2]
            r0.n0(r2)
            r18 = 1
            long r13 = r13 + r18
            r2 = r16
            goto L8c
        Lb4:
            r16 = r2
            r16.e()
        Lb9:
            int r7 = java.lang.Character.charCount(r7)
            int r6 = r6 + r7
            r10 = 47
            r11 = -1
            r13 = 127(0x7f, float:1.78E-43)
            r14 = 32
            goto L4e
        Lc6:
            java.lang.String r0 = r0.c0()
            goto Lcc
        Lcb:
            r0 = r4
        Lcc:
            java.lang.String r2 = r1.c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "{"
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = "}"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r0 = r2.replace(r3, r0)
            java.util.regex.Pattern r2 = defpackage.ok5.m
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r2 = r2.matches()
            if (r2 != 0) goto Lf4
            r1.c = r0
            return
        Lf4:
            java.lang.String r0 = "@Path parameters shouldn't perform path traversal ('.' or '..'): "
            java.lang.String r0 = r0.concat(r4)
            defpackage.i.h(r0)
            return
        Lfe:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L104:
            java.lang.String r1 = "Path parameter \""
            java.lang.String r4 = "\" value must not be null."
            java.lang.String r1 = defpackage.lb1.A(r1, r3, r4)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.reflect.Method r3 = r0.h
            int r0 = r0.i
            java.lang.IllegalArgumentException r0 = defpackage.ak7.v0(r3, r0, r1, r2)
            throw r0
    }
}
