package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cs4  reason: default package */
/* loaded from: classes.dex */
public final class cs4 extends defpackage.u {
    public final defpackage.xr4 a;
    public final defpackage.tv3 b;

    public cs4() {
            r1 = this;
            r1.<init>()
            xr4 r0 = new xr4
            r0.<init>()
            r1.a = r0
            tv3 r0 = new tv3
            r0.<init>()
            r1.b = r0
            return
    }

    @Override // defpackage.u
    public final void a(java.lang.CharSequence r10) {
            r9 = this;
            tv3 r9 = r9.b
            java.lang.StringBuilder r0 = r9.b
            int r1 = r0.length()
            r2 = 10
            if (r1 == 0) goto Lf
            r0.append(r2)
        Lf:
            r0.append(r10)
            r1 = 0
            r3 = r1
        L14:
            int r4 = r10.length()
            if (r3 >= r4) goto L1bb
            int[] r4 = defpackage.rv3.a
            sv3 r5 = r9.a
            int r5 = r5.ordinal()
            r4 = r4[r5]
            r5 = -1
            r6 = 1
            switch(r4) {
                case 1: goto L1bb;
                case 2: goto L185;
                case 3: goto L10e;
                case 4: goto Lc1;
                case 5: goto L6c;
                case 6: goto L2b;
                default: goto L29;
            }
        L29:
            goto L1b5
        L2b:
            char r4 = r9.g
            int r4 = defpackage.ln2.a0(r10, r3, r4)
            if (r4 != r5) goto L36
        L33:
            r3 = r5
            goto L1b5
        L36:
            java.lang.StringBuilder r7 = r9.h
            java.lang.CharSequence r3 = r10.subSequence(r3, r4)
            r7.append(r3)
            int r3 = r10.length()
            if (r4 < r3) goto L4d
            java.lang.StringBuilder r3 = r9.h
            r3.append(r2)
        L4a:
            r3 = r4
            goto L1b5
        L4d:
            int r4 = r4 + 1
            int r3 = r10.length()
            int r3 = defpackage.bl2.T(r10, r4, r3)
            int r4 = r10.length()
            if (r3 == r4) goto L5e
            goto L33
        L5e:
            r9.i = r6
            r9.a()
            r0.setLength(r1)
            sv3 r4 = defpackage.sv3.START_DEFINITION
            r9.a = r4
            goto L1b5
        L6c:
            int r4 = r10.length()
            int r3 = defpackage.bl2.T(r10, r3, r4)
            int r4 = r10.length()
            if (r3 < r4) goto L80
            sv3 r4 = defpackage.sv3.START_DEFINITION
            r9.a = r4
            goto L1b5
        L80:
            r9.g = r1
            char r4 = r10.charAt(r3)
            r6 = 34
            if (r4 == r6) goto L98
            r6 = 39
            if (r4 == r6) goto L98
            r6 = 40
            if (r4 == r6) goto L93
            goto L9a
        L93:
            r4 = 41
            r9.g = r4
            goto L9a
        L98:
            r9.g = r4
        L9a:
            char r4 = r9.g
            if (r4 == 0) goto Lb8
            sv3 r4 = defpackage.sv3.TITLE
            r9.a = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r9.h = r4
            int r3 = r3 + 1
            int r4 = r10.length()
            if (r3 != r4) goto L1b5
            java.lang.StringBuilder r4 = r9.h
            r4.append(r2)
            goto L1b5
        Lb8:
            r9.a()
            sv3 r4 = defpackage.sv3.START_DEFINITION
            r9.a = r4
            goto L1b5
        Lc1:
            int r4 = r10.length()
            int r3 = defpackage.bl2.T(r10, r3, r4)
            int r4 = defpackage.ln2.Y(r3, r10)
            if (r4 != r5) goto Ld1
            goto L33
        Ld1:
            char r7 = r10.charAt(r3)
            r8 = 60
            if (r7 != r8) goto Le6
            int r3 = r3 + 1
            int r7 = r4 + (-1)
            java.lang.CharSequence r3 = r10.subSequence(r3, r7)
            java.lang.String r3 = r3.toString()
            goto Lee
        Le6:
            java.lang.CharSequence r3 = r10.subSequence(r3, r4)
            java.lang.String r3 = r3.toString()
        Lee:
            r9.f = r3
            int r3 = r10.length()
            int r3 = defpackage.bl2.T(r10, r4, r3)
            int r7 = r10.length()
            if (r3 < r7) goto L104
            r9.i = r6
            r0.setLength(r1)
            goto L108
        L104:
            if (r3 != r4) goto L108
            goto L33
        L108:
            sv3 r4 = defpackage.sv3.START_TITLE
            r9.a = r4
            goto L1b5
        L10e:
            int r4 = defpackage.ln2.Z(r3, r10)
            if (r4 != r5) goto L116
            goto L33
        L116:
            java.lang.StringBuilder r6 = r9.d
            r6.append(r10, r3, r4)
            int r3 = r10.length()
            if (r4 < r3) goto L128
            java.lang.StringBuilder r3 = r9.d
            r3.append(r2)
            goto L4a
        L128:
            char r3 = r10.charAt(r4)
            r6 = 93
            if (r3 != r6) goto L33
            int r3 = r4 + 1
            int r6 = r10.length()
            if (r3 >= r6) goto L33
            char r3 = r10.charAt(r3)
            r6 = 58
            if (r3 == r6) goto L142
            goto L33
        L142:
            java.lang.StringBuilder r3 = r9.d
            int r3 = r3.length()
            r6 = 999(0x3e7, float:1.4E-42)
            if (r3 <= r6) goto L14e
            goto L33
        L14e:
            java.lang.StringBuilder r3 = r9.d
            java.lang.String r3 = r3.toString()
            java.util.regex.Pattern r6 = defpackage.c62.a
            java.lang.String r3 = r3.trim()
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r6)
            java.util.regex.Pattern r6 = defpackage.c62.c
            java.util.regex.Matcher r3 = r6.matcher(r3)
            java.lang.String r6 = " "
            java.lang.String r3 = r3.replaceAll(r6)
            boolean r6 = r3.isEmpty()
            if (r6 == 0) goto L174
            goto L33
        L174:
            r9.e = r3
            sv3 r3 = defpackage.sv3.DESTINATION
            r9.a = r3
            int r4 = r4 + 2
            int r3 = r10.length()
            int r3 = defpackage.bl2.T(r10, r4, r3)
            goto L1b5
        L185:
            int r4 = r10.length()
            int r3 = defpackage.bl2.T(r10, r3, r4)
            int r4 = r10.length()
            if (r3 >= r4) goto L33
            char r4 = r10.charAt(r3)
            r6 = 91
            if (r4 == r6) goto L19d
            goto L33
        L19d:
            sv3 r4 = defpackage.sv3.LABEL
            r9.a = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r9.d = r4
            int r3 = r3 + 1
            int r4 = r10.length()
            if (r3 < r4) goto L1b5
            java.lang.StringBuilder r4 = r9.d
            r4.append(r2)
        L1b5:
            if (r3 != r5) goto L14
            sv3 r10 = defpackage.sv3.PARAGRAPH
            r9.a = r10
        L1bb:
            return
    }

    @Override // defpackage.u
    public final void c() {
            r1 = this;
            tv3 r0 = r1.b
            java.lang.StringBuilder r0 = r0.b
            int r0 = r0.length()
            if (r0 != 0) goto Lf
            xr4 r1 = r1.a
            r1.j()
        Lf:
            return
    }

    @Override // defpackage.u
    public final defpackage.a50 d() {
            r0 = this;
            xr4 r0 = r0.a
            return r0
    }

    @Override // defpackage.u
    public final void f(defpackage.v53 r3) {
            r2 = this;
            tv3 r0 = r2.b
            java.lang.StringBuilder r0 = r0.b
            int r1 = r0.length()
            if (r1 <= 0) goto L13
            java.lang.String r0 = r0.toString()
            xr4 r2 = r2.a
            r3.f(r0, r2)
        L13:
            return
    }

    @Override // defpackage.u
    public final defpackage.b50 g(defpackage.am1 r1) {
            r0 = this;
            boolean r0 = r1.h
            if (r0 != 0) goto Lb
            int r0 = r1.b
            b50 r0 = defpackage.b50.a(r0)
            return r0
        Lb:
            r0 = 0
            return r0
    }
}
