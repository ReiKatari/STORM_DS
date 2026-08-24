package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xh5  reason: default package */
/* loaded from: classes.dex */
public final class xh5 implements java.io.Serializable {
    public final java.util.regex.Pattern A;

    static {
            return
    }

    public xh5(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r1.getClass()
            r0.<init>()
            r0.A = r1
            return
    }

    public xh5(java.lang.String r3, java.util.Set r4) {
            r2 = this;
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r4.next()
            yh5 r1 = (defpackage.yh5) r1
            int r1 = r1.getValue()
            r0 = r0 | r1
            goto L7
        L19:
            r4 = r0 & 2
            if (r4 == 0) goto L1f
            r0 = r0 | 64
        L1f:
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3, r0)
            r3.getClass()
            r2.<init>()
            r2.A = r3
            return
    }

    public xh5(java.lang.String r2, defpackage.yh5 r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            int r3 = r3.getValue()
            r0 = r3 & 2
            if (r0 == 0) goto L10
            r3 = r3 | 64
        L10:
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            r2.getClass()
            r1.<init>()
            r1.A = r2
            return
    }

    public static defpackage.qd2 a(defpackage.xh5 r2, java.lang.String r3) {
            r2.getClass()
            int r0 = r3.length()
            if (r0 < 0) goto L19
            ci2 r0 = new ci2
            r1 = 20
            r0.<init>(r1, r2, r3)
            wh5 r2 = defpackage.wh5.d0
            qd2 r3 = new qd2
            r1 = 3
            r3.<init>(r0, r2, r1)
            return r3
        L19:
            java.lang.String r2 = "Start index out of bounds: "
            java.lang.String r0 = ", input length: "
            r1 = 0
            java.lang.StringBuilder r2 = defpackage.xg6.t(r2, r1, r0)
            int r3 = r3.length()
            defpackage.u34.q(r2, r3)
            r2 = 0
            return r2
    }

    public final defpackage.n14 b(int r2, java.lang.String r3) {
            r1 = this;
            r3.getClass()
            java.util.regex.Pattern r1 = r1.A
            java.util.regex.Matcher r1 = r1.matcher(r3)
            r0 = 0
            java.util.regex.Matcher r1 = r1.useAnchoringBounds(r0)
            r0 = 1
            java.util.regex.Matcher r1 = r1.useTransparentBounds(r0)
            int r0 = r3.length()
            java.util.regex.Matcher r1 = r1.region(r2, r0)
            boolean r2 = r1.lookingAt()
            if (r2 == 0) goto L27
            n14 r2 = new n14
            r2.<init>(r1, r3)
            return r2
        L27:
            r1 = 0
            return r1
    }

    public final defpackage.n14 c(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            java.util.regex.Pattern r1 = r1.A
            java.util.regex.Matcher r1 = r1.matcher(r2)
            r1.getClass()
            boolean r0 = r1.matches()
            if (r0 != 0) goto L14
            r1 = 0
            return r1
        L14:
            n14 r0 = new n14
            r0.<init>(r1, r2)
            return r0
    }

    public final boolean d(java.lang.CharSequence r1) {
            r0 = this;
            r1.getClass()
            java.util.regex.Pattern r0 = r0.A
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.matches()
            return r0
    }

    public final java.lang.String e(java.lang.String r5, defpackage.qn2 r6) {
            r4 = this;
            r5.getClass()
            java.util.regex.Pattern r4 = r4.A
            java.util.regex.Matcher r4 = r4.matcher(r5)
            r4.getClass()
            r0 = 0
            n14 r4 = defpackage.kn2.k(r4, r0, r5)
            if (r4 != 0) goto L18
            java.lang.String r4 = r5.toString()
            return r4
        L18:
            int r1 = r5.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
        L21:
            l93 r3 = r4.b()
            int r3 = r3.A
            r2.append(r5, r0, r3)
            java.lang.Object r0 = r6.g(r4)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.append(r0)
            l93 r0 = r4.b()
            int r0 = r0.B
            int r0 = r0 + 1
            n14 r4 = r4.c()
            if (r0 >= r1) goto L43
            if (r4 != 0) goto L21
        L43:
            if (r0 >= r1) goto L48
            r2.append(r5, r0, r1)
        L48:
            java.lang.String r4 = r2.toString()
            return r4
    }

    public final java.lang.String toString() {
            r0 = this;
            java.util.regex.Pattern r0 = r0.A
            java.lang.String r0 = r0.toString()
            r0.getClass()
            return r0
    }
}
