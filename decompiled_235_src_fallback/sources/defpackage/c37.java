package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c37  reason: default package */
/* loaded from: classes.dex */
public final class c37 {
    public static final defpackage.ap3 d = null;
    public final defpackage.fp a;
    public final long b;
    public final defpackage.k47 c;

    static {
            z17 r0 = new z17
            r1 = 2
            r0.<init>(r1)
            r76 r1 = new r76
            r2 = 29
            r1.<init>(r2)
            ap3 r2 = new ap3
            r3 = 28
            r2.<init>(r3, r0, r1)
            defpackage.c37.d = r2
            return
    }

    public c37(defpackage.fp r2, long r3, defpackage.k47 r5) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            java.lang.String r0 = r2.B
            int r0 = r0.length()
            long r3 = defpackage.jx2.m(r0, r3)
            r1.b = r3
            if (r5 == 0) goto L25
            long r3 = r5.a
            java.lang.String r2 = r2.B
            int r2 = r2.length()
            long r2 = defpackage.jx2.m(r2, r3)
            k47 r4 = new k47
            r4.<init>(r2)
            goto L26
        L25:
            r4 = 0
        L26:
            r1.c = r4
            return
    }

    public c37(java.lang.String r2, int r3, long r4) {
            r1 = this;
            r0 = r3 & 1
            if (r0 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            long r4 = defpackage.k47.b
        Lc:
            fp r3 = new fp
            r3.<init>(r2)
            r2 = 0
            r1.<init>(r3, r4, r2)
            return
    }

    public static defpackage.c37 a(defpackage.c37 r1, defpackage.fp r2, long r3, int r5) {
            r0 = r5 & 1
            if (r0 == 0) goto L6
            fp r2 = r1.a
        L6:
            r0 = r5 & 2
            if (r0 == 0) goto Lc
            long r3 = r1.b
        Lc:
            r5 = r5 & 4
            if (r5 == 0) goto L13
            k47 r5 = r1.c
            goto L14
        L13:
            r5 = 0
        L14:
            r1.getClass()
            c37 r1 = new c37
            r1.<init>(r2, r3, r5)
            return r1
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.c37
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c37 r8 = (defpackage.c37) r8
            long r3 = r8.b
            long r5 = r7.b
            boolean r1 = defpackage.k47.b(r5, r3)
            if (r1 == 0) goto L2b
            k47 r1 = r7.c
            k47 r3 = r8.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 == 0) goto L2b
            fp r7 = r7.a
            fp r8 = r8.a
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 == 0) goto L2b
            return r0
        L2b:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            fp r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = defpackage.k47.c
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            k47 r4 = r4.c
            if (r4 == 0) goto L1c
            long r1 = r4.a
            int r4 = java.lang.Long.hashCode(r1)
            goto L1d
        L1c:
            r4 = 0
        L1d:
            int r0 = r0 + r4
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextFieldValue(text='"
            r0.<init>(r1)
            fp r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = "', selection="
            r0.append(r1)
            long r1 = r3.b
            java.lang.String r1 = defpackage.k47.h(r1)
            r0.append(r1)
            java.lang.String r1 = ", composition="
            r0.append(r1)
            k47 r3 = r3.c
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
