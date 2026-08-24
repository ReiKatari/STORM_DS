package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xh3  reason: default package */
/* loaded from: classes.dex */
public final class xh3 {
    public static final defpackage.xh3 e = null;
    public final int a;
    public final java.lang.Boolean b;
    public final int c;
    public final int d;

    static {
            xh3 r0 = new xh3
            r1 = 0
            r2 = 127(0x7f, float:1.78E-43)
            r0.<init>(r1, r1, r1, r2)
            defpackage.xh3.e = r0
            return
    }

    public xh3(int r4, int r5, int r6, int r7) {
            r3 = this;
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = r7 & 1
            r2 = -1
            if (r1 == 0) goto L8
            r4 = r2
        L8:
            r1 = r7 & 2
            if (r1 == 0) goto Ld
            r0 = 0
        Ld:
            r1 = r7 & 4
            if (r1 == 0) goto L12
            r5 = 0
        L12:
            r7 = r7 & 8
            if (r7 == 0) goto L17
            r6 = r2
        L17:
            r3.<init>()
            r3.a = r4
            r3.b = r0
            r3.c = r5
            r3.d = r6
            return
    }

    public final defpackage.l33 a(boolean r9) {
            r8 = this;
            l33 r0 = new l33
            wh3 r1 = new wh3
            int r2 = r8.a
            r1.<init>(r2)
            r3 = 0
            r4 = -1
            if (r2 != r4) goto Le
            r1 = r3
        Le:
            if (r1 == 0) goto L14
            int r1 = r1.a
        L12:
            r2 = r1
            goto L16
        L14:
            r1 = 0
            goto L12
        L16:
            r1 = 1
            java.lang.Boolean r5 = r8.b
            if (r5 == 0) goto L20
            boolean r5 = r5.booleanValue()
            goto L21
        L20:
            r5 = r1
        L21:
            yh3 r6 = new yh3
            int r7 = r8.c
            r6.<init>(r7)
            if (r7 != 0) goto L2b
            r6 = r3
        L2b:
            if (r6 == 0) goto L30
            int r6 = r6.a
            goto L31
        L30:
            r6 = r1
        L31:
            k33 r7 = new k33
            int r8 = r8.d
            r7.<init>(r8)
            if (r8 != r4) goto L3b
            goto L3c
        L3b:
            r3 = r7
        L3c:
            if (r3 == 0) goto L40
            int r1 = r3.a
        L40:
            r4 = r6
            gy3 r6 = defpackage.gy3.L
            r3 = r5
            r5 = r1
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L27
        L3:
            boolean r0 = r3 instanceof defpackage.xh3
            if (r0 != 0) goto L8
            goto L29
        L8:
            xh3 r3 = (defpackage.xh3) r3
            int r0 = r3.a
            int r1 = r2.a
            if (r1 != r0) goto L29
            java.lang.Boolean r0 = r2.b
            java.lang.Boolean r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L1b
            goto L29
        L1b:
            int r0 = r2.c
            int r1 = r3.c
            if (r0 != r1) goto L29
            int r2 = r2.d
            int r3 = r3.d
            if (r2 != r3) goto L29
        L27:
            r2 = 1
            return r2
        L29:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.Boolean r2 = r3.b
            if (r2 == 0) goto L12
            int r2 = r2.hashCode()
            goto L13
        L12:
            r2 = 0
        L13:
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r2 = r3.c
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r3 = r3.d
            r1 = 29791(0x745f, float:4.1746E-41)
            int r3 = defpackage.lb1.a(r3, r0, r1)
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "KeyboardOptions(capitalization="
            r0.<init>(r1)
            int r1 = r2.a
            java.lang.String r1 = defpackage.wh3.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", autoCorrectEnabled="
            r0.append(r1)
            java.lang.Boolean r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", keyboardType="
            r0.append(r1)
            int r1 = r2.c
            java.lang.String r1 = defpackage.yh3.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", imeAction="
            r0.append(r1)
            int r2 = r2.d
            java.lang.String r2 = defpackage.k33.a(r2)
            r0.append(r2)
            java.lang.String r2 = ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
