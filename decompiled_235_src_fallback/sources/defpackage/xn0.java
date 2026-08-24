package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xn0  reason: default package */
/* loaded from: classes.dex */
public final class xn0 {
    public static final defpackage.ap3 g = null;
    public final boolean a;
    public final defpackage.vs4 b;
    public final defpackage.vs4 c;
    public final defpackage.vs4 d;
    public final defpackage.vs4 e;
    public final defpackage.vs4 f;

    static {
            fn0 r0 = new fn0
            r1 = 1
            r0.<init>(r1)
            vn0 r1 = new vn0
            r2 = 0
            r1.<init>(r2)
            ap3 r0 = defpackage.jx2.z(r0, r1)
            defpackage.xn0.g = r0
            return
    }

    public xn0(java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7) {
            r3 = this;
            r4.getClass()
            r6.getClass()
            r3.<init>()
            r3.a = r7
            c37 r7 = new c37
            int r0 = r4.length()
            long r0 = defpackage.jx2.f(r0, r0)
            r2 = 4
            r7.<init>(r4, r2, r0)
            vs4 r4 = defpackage.np2.Y(r7)
            r3.b = r4
            c37 r4 = new c37
            int r7 = r5.length()
            long r0 = defpackage.jx2.f(r7, r7)
            r4.<init>(r5, r2, r0)
            vs4 r4 = defpackage.np2.Y(r4)
            r3.c = r4
            c37 r4 = new c37
            int r5 = r6.length()
            long r0 = defpackage.jx2.f(r5, r5)
            r4.<init>(r6, r2, r0)
            c37 r4 = defpackage.n16.w(r4)
            vs4 r4 = defpackage.np2.Y(r4)
            r3.d = r4
            r4 = 0
            vs4 r5 = defpackage.np2.Y(r4)
            r3.e = r5
            vs4 r4 = defpackage.np2.Y(r4)
            r3.f = r4
            return
    }

    public xn0(boolean r2) {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r0, r0, r0, r2)
            return
    }

    public final defpackage.jo0 a() {
            r5 = this;
            jo0 r0 = new jo0
            vs4 r1 = r5.b
            java.lang.Object r1 = r1.getValue()
            c37 r1 = (defpackage.c37) r1
            fp r1 = r1.a
            java.lang.String r1 = r1.B
            java.lang.CharSequence r1 = defpackage.qs6.T0(r1)
            java.lang.String r1 = r1.toString()
            vs4 r2 = r5.c
            java.lang.Object r2 = r2.getValue()
            c37 r2 = (defpackage.c37) r2
            fp r2 = r2.a
            java.lang.String r2 = r2.B
            java.lang.CharSequence r2 = defpackage.qs6.T0(r2)
            java.lang.String r2 = r2.toString()
            vs4 r5 = r5.d
            java.lang.Object r5 = r5.getValue()
            c37 r5 = (defpackage.c37) r5
            fp r5 = r5.a
            java.lang.String r5 = r5.B
            java.lang.CharSequence r5 = defpackage.qs6.T0(r5)
            java.lang.String r5 = r5.toString()
            r3 = 10
            r4 = 32
            java.lang.String r5 = defpackage.xs6.d0(r5, r3, r4)
            r0.<init>(r1, r2, r5)
            return r0
    }

    public final boolean b() {
            r3 = this;
            vs4 r0 = r3.d
            java.lang.Object r1 = r0.getValue()
            c37 r1 = (defpackage.c37) r1
            fp r1 = r1.a
            java.lang.String r1 = r1.B
            boolean r1 = defpackage.qs6.v0(r1)
            vs4 r3 = r3.f
            r2 = 0
            if (r1 == 0) goto L1b
            wn0 r0 = defpackage.wn0.CANNOT_BE_EMPTY
            r3.setValue(r0)
            return r2
        L1b:
            java.lang.Object r0 = r0.getValue()
            c37 r0 = (defpackage.c37) r0
            fp r0 = r0.a
            java.lang.String r0 = r0.B
            java.lang.CharSequence r0 = defpackage.qs6.T0(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "[ \n]"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r1.getClass()
            r0.getClass()
            java.util.regex.Matcher r0 = r1.matcher(r0)
            java.lang.String r1 = ""
            java.lang.String r0 = r0.replaceAll(r1)
            r0.getClass()
            int r0 = r0.length()
            int r0 = r0 % 16
            if (r0 != 0) goto L54
            r0 = 0
            r3.setValue(r0)
            r3 = 1
            return r3
        L54:
            wn0 r0 = defpackage.wn0.INVALID_FORMAT
            r3.setValue(r0)
            return r2
    }
}
