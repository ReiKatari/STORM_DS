package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hy3  reason: default package */
/* loaded from: classes.dex */
public final class hy3 {
    public static final defpackage.hy3 b = null;
    public final defpackage.iy3 a;

    static {
            r0 = 0
            java.util.Locale[] r0 = new java.util.Locale[r0]
            android.os.LocaleList r1 = new android.os.LocaleList
            r1.<init>(r0)
            hy3 r0 = new hy3
            iy3 r2 = new iy3
            r2.<init>(r1)
            r0.<init>(r2)
            defpackage.hy3.b = r0
            return
    }

    public hy3(defpackage.iy3 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static defpackage.hy3 a(java.lang.String r4) {
            if (r4 == 0) goto L31
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L31
        L9:
            java.lang.String r0 = ","
            r1 = -1
            java.lang.String[] r4 = r4.split(r0, r1)
            int r0 = r4.length
            java.util.Locale[] r1 = new java.util.Locale[r0]
            r2 = 0
        L14:
            if (r2 >= r0) goto L21
            r3 = r4[r2]
            java.util.Locale r3 = java.util.Locale.forLanguageTag(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L14
        L21:
            android.os.LocaleList r4 = new android.os.LocaleList
            r4.<init>(r1)
            hy3 r0 = new hy3
            iy3 r1 = new iy3
            r1.<init>(r4)
            r0.<init>(r1)
            return r0
        L31:
            hy3 r4 = defpackage.hy3.b
            return r4
    }

    public final java.util.Locale b(int r1) {
            r0 = this;
            iy3 r0 = r0.a
            android.os.LocaleList r0 = r0.a
            java.util.Locale r0 = r0.get(r1)
            return r0
    }

    public final int c() {
            r0 = this;
            iy3 r0 = r0.a
            android.os.LocaleList r0 = r0.a
            int r0 = r0.size()
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.hy3
            if (r0 == 0) goto L12
            hy3 r2 = (defpackage.hy3) r2
            iy3 r2 = r2.a
            iy3 r1 = r1.a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            iy3 r0 = r0.a
            android.os.LocaleList r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            iy3 r0 = r0.a
            android.os.LocaleList r0 = r0.a
            java.lang.String r0 = r0.toString()
            return r0
    }
}
