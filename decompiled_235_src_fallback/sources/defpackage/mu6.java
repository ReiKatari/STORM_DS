package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mu6  reason: default package */
/* loaded from: classes.dex */
public final class mu6 implements defpackage.e36 {
    public final defpackage.vm2 A;

    public mu6(defpackage.vm2 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.e36
    public final boolean Y() {
            r0 = this;
            vm2 r0 = r0.A
            boolean r0 = r0.Y()
            return r0
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            vm2 r0 = r0.A
            r0.close()
            return
    }

    @Override // defpackage.e36
    public final defpackage.j36 i0(java.lang.String r12) {
            r11 = this;
            r12.getClass()
            vm2 r11 = r11.A
            boolean r0 = r11.isOpen()
            r1 = 0
            if (r0 == 0) goto L15e
            java.lang.CharSequence r0 = defpackage.qs6.T0(r12)
            java.lang.String r0 = r0.toString()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r2)
            r0.getClass()
            int r2 = r0.length()
            int r2 = r2 + (-2)
            r3 = 0
            r4 = -1
            if (r2 >= 0) goto L28
            goto L79
        L28:
            r5 = r3
        L29:
            if (r5 >= r2) goto L79
            char r6 = r0.charAt(r5)
            r7 = 32
            int r7 = defpackage.nb3.p(r6, r7)
            if (r7 > 0) goto L3a
        L37:
            int r5 = r5 + 1
            goto L29
        L3a:
            r7 = 4
            r8 = 45
            if (r6 != r8) goto L53
            int r6 = r5 + 1
            char r6 = r0.charAt(r6)
            if (r6 == r8) goto L48
            goto L78
        L48:
            int r5 = r5 + 2
            r6 = 10
            int r5 = defpackage.qs6.s0(r6, r5, r7, r0)
            if (r5 >= 0) goto L37
            goto L79
        L53:
            r8 = 47
            if (r6 != r8) goto L78
            int r6 = r5 + 1
            char r9 = r0.charAt(r6)
            r10 = 42
            if (r9 == r10) goto L62
            goto L78
        L62:
            int r6 = r6 + 1
            int r6 = defpackage.qs6.s0(r10, r6, r7, r0)
            if (r6 >= 0) goto L6b
            goto L79
        L6b:
            int r5 = r6 + 1
            if (r5 >= r2) goto L75
            char r5 = r0.charAt(r5)
            if (r5 != r8) goto L62
        L75:
            int r5 = r6 + 2
            goto L29
        L78:
            r4 = r5
        L79:
            if (r4 < 0) goto L91
            int r2 = r0.length()
            if (r4 <= r2) goto L82
            goto L91
        L82:
            int r2 = r4 + 3
            int r5 = r0.length()
            int r2 = java.lang.Math.min(r2, r5)
            java.lang.String r2 = r0.substring(r4, r2)
            goto L92
        L91:
            r2 = r1
        L92:
            if (r2 != 0) goto L9a
            tu6 r0 = new tu6
            r0.<init>(r11, r12)
            return r0
        L9a:
            int r4 = r2.hashCode()
            switch(r4) {
                case 65636: goto Lcd;
                case 66913: goto Lc1;
                case 68795: goto Lb8;
                case 81327: goto La2;
                default: goto La1;
            }
        La1:
            goto Ld5
        La2:
            java.lang.String r4 = "ROL"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto Lab
            goto Ld5
        Lab:
            java.lang.String r4 = " TO "
            boolean r4 = defpackage.qs6.j0(r0, r4, r3)
            if (r4 == 0) goto Lb5
        Lb3:
            r4 = r1
            goto Lee
        Lb5:
            su6 r4 = defpackage.su6.ROLLBACK
            goto Lee
        Lb8:
            java.lang.String r4 = "END"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto Lca
            goto Ld5
        Lc1:
            java.lang.String r4 = "COM"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto Lca
            goto Ld5
        Lca:
            su6 r4 = defpackage.su6.END
            goto Lee
        Lcd:
            java.lang.String r4 = "BEG"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto Ld6
        Ld5:
            goto Lb3
        Ld6:
            java.lang.String r4 = "EXCLUSIVE"
            boolean r4 = defpackage.qs6.j0(r0, r4, r3)
            if (r4 == 0) goto Le1
            su6 r4 = defpackage.su6.BEGIN_EXCLUSIVE
            goto Lee
        Le1:
            java.lang.String r4 = "IMMEDIATE"
            boolean r4 = defpackage.qs6.j0(r0, r4, r3)
            if (r4 == 0) goto Lec
            su6 r4 = defpackage.su6.BEGIN_IMMEDIATE
            goto Lee
        Lec:
            su6 r4 = defpackage.su6.BEGIN_DEFERRED
        Lee:
            if (r4 == 0) goto Lf6
            tu6 r0 = new tu6
            r0.<init>(r11, r12, r4)
            return r0
        Lf6:
            java.lang.String r4 = "PRA"
            boolean r5 = r2.equals(r4)
            if (r5 == 0) goto L119
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r5)
            r0.getClass()
            java.lang.String r5 = "journal_mode"
            java.lang.String r6 = ""
            java.lang.String r0 = defpackage.qs6.N0(r0, r5, r6)
            java.lang.String r5 = "="
            boolean r0 = defpackage.qs6.j0(r0, r5, r3)
            if (r0 == 0) goto L119
            d90 r1 = defpackage.d90.E0
        L119:
            if (r1 == 0) goto L126
            tu6 r0 = new tu6
            uu6 r1 = new uu6
            r1.<init>(r11, r12)
            r0.<init>(r11, r12, r1)
            return r0
        L126:
            int r0 = r2.hashCode()
            r1 = 79487(0x1367f, float:1.11385E-40)
            if (r0 == r1) goto L14c
            r1 = 81978(0x1403a, float:1.14876E-40)
            if (r0 == r1) goto L143
            r1 = 85954(0x14fc2, float:1.20447E-40)
            if (r0 == r1) goto L13a
            goto L158
        L13a:
            java.lang.String r0 = "WIT"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L152
            goto L158
        L143:
            java.lang.String r0 = "SEL"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L152
            goto L158
        L14c:
            boolean r0 = r2.equals(r4)
            if (r0 == 0) goto L158
        L152:
            uu6 r0 = new uu6
            r0.<init>(r11, r12)
            return r0
        L158:
            tu6 r0 = new tu6
            r0.<init>(r11, r12)
            return r0
        L15e:
            r11 = 21
            java.lang.String r12 = "connection is closed"
            defpackage.ii2.T(r11, r12)
            throw r1
    }
}
