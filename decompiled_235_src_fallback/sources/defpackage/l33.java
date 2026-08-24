package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l33  reason: default package */
/* loaded from: classes.dex */
public final class l33 {
    public static final defpackage.l33 g = null;
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final defpackage.gy3 f;

    static {
            l33 r0 = new l33
            r5 = 1
            gy3 r6 = defpackage.gy3.L
            r1 = 0
            r2 = 0
            r3 = 1
            r4 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            defpackage.l33.g = r0
            return
    }

    public l33(boolean r1, int r2, boolean r3, int r4, int r5, defpackage.gy3 r6) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L35
        L3:
            boolean r0 = r3 instanceof defpackage.l33
            if (r0 != 0) goto L8
            goto L37
        L8:
            l33 r3 = (defpackage.l33) r3
            boolean r0 = r3.a
            boolean r1 = r2.a
            if (r1 == r0) goto L11
            goto L37
        L11:
            int r0 = r2.b
            int r1 = r3.b
            if (r0 != r1) goto L37
            boolean r0 = r2.c
            boolean r1 = r3.c
            if (r0 == r1) goto L1e
            goto L37
        L1e:
            int r0 = r2.d
            int r1 = r3.d
            if (r0 != r1) goto L37
            int r0 = r2.e
            int r1 = r3.e
            if (r0 != r1) goto L37
            gy3 r2 = r2.f
            gy3 r3 = r3.f
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L35
            goto L37
        L35:
            r2 = 1
            return r2
        L37:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            boolean r2 = r3.c
            int r0 = defpackage.xg6.e(r0, r2, r1)
            int r2 = r3.d
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r1 = r3.e
            r2 = 961(0x3c1, float:1.347E-42)
            int r0 = defpackage.lb1.a(r1, r0, r2)
            gy3 r3 = r3.f
            java.util.List r3 = r3.A
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ImeOptions(singleLine="
            r0.<init>(r1)
            boolean r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", capitalization="
            r0.append(r1)
            int r1 = r2.b
            java.lang.String r1 = defpackage.wh3.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", autoCorrect="
            r0.append(r1)
            boolean r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", keyboardType="
            r0.append(r1)
            int r1 = r2.d
            java.lang.String r1 = defpackage.yh3.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", imeAction="
            r0.append(r1)
            int r1 = r2.e
            java.lang.String r1 = defpackage.k33.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", platformImeOptions=null, hintLocales="
            r0.append(r1)
            gy3 r2 = r2.f
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
