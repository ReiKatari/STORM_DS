package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c51  reason: default package */
/* loaded from: classes.dex */
public final class c51 {
    public static final java.util.regex.Pattern k = null;
    public static final java.util.regex.Pattern l = null;
    public static final java.util.regex.Pattern m = null;
    public static final java.util.regex.Pattern n = null;
    public final java.lang.String a;
    public final java.lang.String b;
    public final long c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final java.lang.String j;

    static {
            java.lang.String r0 = "(\\d{2,4})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.c51.k = r0
            java.lang.String r0 = "(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.c51.l = r0
            java.lang.String r0 = "(\\d{1,2})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.c51.m = r0
            java.lang.String r0 = "(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            defpackage.c51.n = r0
            return
    }

    public c51(java.lang.String r1, java.lang.String r2, long r3, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, boolean r9, boolean r10, java.lang.String r11) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r5
            r0.e = r6
            r0.f = r7
            r0.g = r8
            r0.h = r9
            r0.i = r10
            r0.j = r11
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof defpackage.c51
            if (r0 == 0) goto L5a
            c51 r5 = (defpackage.c51) r5
            java.lang.String r0 = r5.a
            java.lang.String r1 = r4.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            java.lang.String r0 = r5.b
            java.lang.String r1 = r4.b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            long r0 = r5.c
            long r2 = r4.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L5a
            java.lang.String r0 = r5.d
            java.lang.String r1 = r4.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            java.lang.String r0 = r5.e
            java.lang.String r1 = r4.e
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5a
            boolean r0 = r5.f
            boolean r1 = r4.f
            if (r0 != r1) goto L5a
            boolean r0 = r5.g
            boolean r1 = r4.g
            if (r0 != r1) goto L5a
            boolean r0 = r5.h
            boolean r1 = r4.h
            if (r0 != r1) goto L5a
            boolean r0 = r5.i
            boolean r1 = r4.i
            if (r0 != r1) goto L5a
            java.lang.String r5 = r5.j
            java.lang.String r4 = r4.j
            boolean r4 = defpackage.nb3.k(r5, r4)
            if (r4 == 0) goto L5a
            r4 = 1
            return r4
        L5a:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r4 = this;
            r0 = 527(0x20f, float:7.38E-43)
            r1 = 31
            java.lang.String r2 = r4.a
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r4.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            long r2 = r4.c
            int r0 = defpackage.i61.c(r2, r0, r1)
            java.lang.String r2 = r4.d
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r4.e
            int r0 = defpackage.xg6.d(r0, r1, r2)
            boolean r2 = r4.f
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r4.g
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r4.h
            int r0 = defpackage.xg6.e(r0, r2, r1)
            boolean r2 = r4.i
            int r0 = defpackage.xg6.e(r0, r2, r1)
            java.lang.String r4 = r4.j
            if (r4 == 0) goto L43
            int r4 = r4.hashCode()
            goto L44
        L43:
            r4 = 0
        L44:
            int r0 = r0 + r4
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.a
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.String r1 = r5.b
            r0.append(r1)
            boolean r1 = r5.h
            if (r1 == 0) goto L42
            r1 = -9223372036854775808
            long r3 = r5.c
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L26
            java.lang.String r1 = "; max-age=0"
            r0.append(r1)
            goto L42
        L26:
            java.lang.String r1 = "; expires="
            r0.append(r1)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r3)
            qm r2 = defpackage.cc1.a
            java.lang.Object r2 = r2.get()
            java.text.DateFormat r2 = (java.text.DateFormat) r2
            java.lang.String r1 = r2.format(r1)
            r1.getClass()
            r0.append(r1)
        L42:
            boolean r1 = r5.i
            if (r1 != 0) goto L50
            java.lang.String r1 = "; domain="
            r0.append(r1)
            java.lang.String r1 = r5.d
            r0.append(r1)
        L50:
            java.lang.String r1 = "; path="
            r0.append(r1)
            java.lang.String r1 = r5.e
            r0.append(r1)
            boolean r1 = r5.f
            if (r1 == 0) goto L63
            java.lang.String r1 = "; secure"
            r0.append(r1)
        L63:
            boolean r1 = r5.g
            if (r1 == 0) goto L6c
            java.lang.String r1 = "; httponly"
            r0.append(r1)
        L6c:
            java.lang.String r5 = r5.j
            if (r5 == 0) goto L78
            java.lang.String r1 = "; samesite="
            r0.append(r1)
            r0.append(r5)
        L78:
            java.lang.String r5 = r0.toString()
            return r5
    }
}
