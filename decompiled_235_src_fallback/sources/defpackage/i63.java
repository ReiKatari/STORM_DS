package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i63  reason: default package */
/* loaded from: classes.dex */
public final class i63 {
    public final defpackage.b63 a;
    public final defpackage.h63 b;
    public final defpackage.h63 c;

    public /* synthetic */ i63(defpackage.b63 r2, defpackage.h63 r3, int r4) {
            r1 = this;
            r4 = r4 & 2
            g63 r0 = defpackage.g63.a
            if (r4 == 0) goto L7
            r3 = r0
        L7:
            r1.<init>(r2, r3, r0)
            return
    }

    public i63(defpackage.b63 r1, defpackage.h63 r2, defpackage.h63 r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static defpackage.i63 a(defpackage.i63 r2, defpackage.h63 r3, defpackage.h63 r4, int r5) {
            b63 r0 = r2.a
            r1 = r5 & 2
            if (r1 == 0) goto L8
            h63 r3 = r2.b
        L8:
            r5 = r5 & 4
            if (r5 == 0) goto Le
            h63 r4 = r2.c
        Le:
            r2.getClass()
            r0.getClass()
            r3.getClass()
            r4.getClass()
            i63 r2 = new i63
            r2.<init>(r0, r3, r4)
            return r2
    }

    public final boolean b() {
            r2 = this;
            h63 r0 = r2.b
            g63 r1 = defpackage.g63.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L15
            h63 r2 = r2.c
            boolean r2 = defpackage.nb3.k(r2, r1)
            if (r2 != 0) goto L13
            goto L15
        L13:
            r2 = 0
            return r2
        L15:
            r2 = 1
            return r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.i63
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            i63 r5 = (defpackage.i63) r5
            b63 r1 = r4.a
            b63 r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            h63 r1 = r4.b
            h63 r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            h63 r4 = r4.c
            h63 r5 = r5.c
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            b63 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            h63 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            h63 r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "InputConfig(input="
            r0.<init>(r1)
            b63 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", assignment="
            r0.append(r1)
            h63 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", altAssignment="
            r0.append(r1)
            h63 r2 = r2.c
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
