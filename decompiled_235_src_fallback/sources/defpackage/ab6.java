package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ab6  reason: default package */
/* loaded from: classes.dex */
public final class ab6 {
    public final defpackage.sm3 a;
    public final defpackage.bu1 b;
    public final defpackage.g93 c;
    public final defpackage.ca4 d;

    public ab6(defpackage.sm3 r1, defpackage.bu1 r2, defpackage.p94 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            ca4 r1 = new ca4
            r2 = 2
            r1.<init>(r2)
            r0.d = r1
            return
    }

    public final defpackage.xa6 a() {
            r4 = this;
            ta6 r0 = new ta6
            r0.<init>()
            xa6 r1 = new xa6
            r2 = 0
            bu1 r3 = r4.b
            sm3 r4 = r4.a
            r1.<init>(r3, r2, r4, r0)
            return r1
    }

    public final void b(defpackage.sm3 r18, defpackage.ta6 r19) {
            r17 = this;
            r0 = r17
            r1 = r19
            ca4 r0 = r0.d
            java.lang.Object[] r2 = r0.a
            int r0 = r0.b
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r0) goto L16a
            r5 = r2[r4]
            nd r5 = (defpackage.nd) r5
            s63 r6 = r5.A
            te r7 = r5.L
            ta6 r8 = r18.x()
            r9 = r18
            int r10 = r9.B
            r11 = 0
            if (r1 == 0) goto L33
            fb6 r12 = defpackage.bb6.F
            ja4 r13 = r1.A
            java.lang.Object r12 = r13.g(r12)
            if (r12 != 0) goto L2c
            r12 = r11
        L2c:
            fp r12 = (defpackage.fp) r12
            if (r12 == 0) goto L33
            java.lang.String r12 = r12.B
            goto L34
        L33:
            r12 = r11
        L34:
            if (r8 == 0) goto L48
            fb6 r13 = defpackage.bb6.F
            ja4 r14 = r8.A
            java.lang.Object r13 = r14.g(r13)
            if (r13 != 0) goto L41
            r13 = r11
        L41:
            fp r13 = (defpackage.fp) r13
            if (r13 == 0) goto L48
            java.lang.String r13 = r13.B
            goto L49
        L48:
            r13 = r11
        L49:
            r14 = 1
            if (r12 == r13) goto L9b
            if (r12 != 0) goto L52
            r6.v(r7, r10, r14)
            goto L9b
        L52:
            if (r13 != 0) goto L58
            r6.v(r7, r10, r3)
            goto L9b
        L58:
            fb6 r12 = defpackage.bb6.s
            java.lang.Object r12 = defpackage.xk2.r(r8, r12)
            rf r12 = (defpackage.rf) r12
            rf r15 = defpackage.xd5.Y
            boolean r12 = defpackage.nb3.k(r12, r15)
            if (r12 == 0) goto L9b
            int r12 = r13.length()
            r15 = 5000(0x1388, float:7.006E-42)
            if (r12 >= r15) goto L71
            goto L90
        L71:
            r12 = 4999(0x1387, float:7.005E-42)
            char r16 = r13.charAt(r12)
            boolean r16 = java.lang.Character.isHighSurrogate(r16)
            if (r16 == 0) goto L8c
            char r16 = r13.charAt(r15)
            boolean r16 = java.lang.Character.isLowSurrogate(r16)
            if (r16 == 0) goto L8c
            java.lang.String r13 = defpackage.qs6.S0(r12, r13)
            goto L90
        L8c:
            java.lang.String r13 = defpackage.qs6.S0(r15, r13)
        L90:
            android.view.autofill.AutofillValue r12 = defpackage.au.d(r13)
            java.lang.Object r13 = r6.B
            android.view.autofill.AutofillManager r13 = (android.view.autofill.AutofillManager) r13
            defpackage.oc3.r(r13, r7, r10, r12)
        L9b:
            if (r1 == 0) goto Lab
            fb6 r12 = defpackage.bb6.K
            ja4 r13 = r1.A
            java.lang.Object r12 = r13.g(r12)
            if (r12 != 0) goto La8
            r12 = r11
        La8:
            a87 r12 = (defpackage.a87) r12
            goto Lac
        Lab:
            r12 = r11
        Lac:
            if (r8 == 0) goto Lbc
            fb6 r13 = defpackage.bb6.K
            ja4 r15 = r8.A
            java.lang.Object r13 = r15.g(r13)
            if (r13 != 0) goto Lb9
            r13 = r11
        Lb9:
            a87 r13 = (defpackage.a87) r13
            goto Lbd
        Lbc:
            r13 = r11
        Lbd:
            if (r12 == r13) goto L100
            if (r12 != 0) goto Lc5
            r6.v(r7, r10, r14)
            goto L100
        Lc5:
            if (r13 != 0) goto Lcb
            r6.v(r7, r10, r3)
            goto L100
        Lcb:
            fb6 r12 = defpackage.bb6.s
            java.lang.Object r12 = defpackage.xk2.r(r8, r12)
            rf r12 = (defpackage.rf) r12
            rf r15 = defpackage.xd5.Z
            boolean r12 = defpackage.nb3.k(r12, r15)
            if (r12 == 0) goto L100
            int[] r12 = defpackage.kd.a
            int r13 = r13.ordinal()
            r12 = r12[r13]
            if (r12 == r14) goto Led
            r13 = 2
            if (r12 == r13) goto Lea
            r12 = r11
            goto Lef
        Lea:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            goto Lef
        Led:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
        Lef:
            if (r12 == 0) goto L100
            boolean r12 = r12.booleanValue()
            android.view.autofill.AutofillValue r12 = defpackage.au.e(r12)
            java.lang.Object r13 = r6.B
            android.view.autofill.AutofillManager r13 = (android.view.autofill.AutofillManager) r13
            defpackage.oc3.r(r13, r7, r10, r12)
        L100:
            if (r1 == 0) goto L110
            fb6 r12 = defpackage.bb6.t
            ja4 r13 = r1.A
            java.lang.Object r12 = r13.g(r12)
            if (r12 != 0) goto L10d
            r12 = r11
        L10d:
            oh r12 = (defpackage.oh) r12
            goto L111
        L110:
            r12 = r11
        L111:
            if (r8 == 0) goto L121
            fb6 r13 = defpackage.bb6.t
            ja4 r15 = r8.A
            java.lang.Object r13 = r15.g(r13)
            if (r13 != 0) goto L11e
            goto L11f
        L11e:
            r11 = r13
        L11f:
            oh r11 = (defpackage.oh) r11
        L121:
            boolean r13 = defpackage.nb3.k(r12, r11)
            if (r13 != 0) goto L13c
            if (r12 != 0) goto L12d
            r6.v(r7, r10, r14)
            goto L13c
        L12d:
            if (r11 != 0) goto L133
            r6.v(r7, r10, r3)
            goto L13c
        L133:
            android.view.autofill.AutofillValue r11 = r11.a
            java.lang.Object r6 = r6.B
            android.view.autofill.AutofillManager r6 = (android.view.autofill.AutofillManager) r6
            defpackage.oc3.r(r6, r7, r10, r11)
        L13c:
            if (r1 == 0) goto L14a
            ja4 r6 = r1.A
            fb6 r7 = defpackage.bb6.r
            boolean r6 = r6.b(r7)
            if (r6 != r14) goto L14a
            r6 = r14
            goto L14b
        L14a:
            r6 = r3
        L14b:
            if (r8 == 0) goto L158
            ja4 r7 = r8.A
            fb6 r8 = defpackage.bb6.r
            boolean r7 = r7.b(r8)
            if (r7 != r14) goto L158
            goto L159
        L158:
            r14 = r3
        L159:
            if (r6 == r14) goto L166
            q94 r5 = r5.d0
            if (r14 == 0) goto L163
            r5.a(r10)
            goto L166
        L163:
            r5.f(r10)
        L166:
            int r4 = r4 + 1
            goto Lc
        L16a:
            return
    }
}
