package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uw2  reason: default package */
/* loaded from: classes.dex */
public final class uw2 {
    public static final defpackage.da0 d = null;
    public static final defpackage.da0 e = null;
    public static final defpackage.da0 f = null;
    public static final defpackage.da0 g = null;
    public static final defpackage.da0 h = null;
    public static final defpackage.da0 i = null;
    public final defpackage.da0 a;
    public final defpackage.da0 b;
    public final int c;

    static {
            da0 r0 = defpackage.da0.R
            java.lang.String r0 = ":"
            da0 r0 = defpackage.xd5.o(r0)
            defpackage.uw2.d = r0
            java.lang.String r0 = ":status"
            da0 r0 = defpackage.xd5.o(r0)
            defpackage.uw2.e = r0
            java.lang.String r0 = ":method"
            da0 r0 = defpackage.xd5.o(r0)
            defpackage.uw2.f = r0
            java.lang.String r0 = ":path"
            da0 r0 = defpackage.xd5.o(r0)
            defpackage.uw2.g = r0
            java.lang.String r0 = ":scheme"
            da0 r0 = defpackage.xd5.o(r0)
            defpackage.uw2.h = r0
            java.lang.String r0 = ":authority"
            da0 r0 = defpackage.xd5.o(r0)
            defpackage.uw2.i = r0
            return
    }

    public uw2(defpackage.da0 r1, defpackage.da0 r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            int r1 = r1.d()
            int r1 = r1 + 32
            int r2 = r2.d()
            int r2 = r2 + r1
            r0.c = r2
            return
    }

    public uw2(defpackage.da0 r2, java.lang.String r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            da0 r0 = defpackage.da0.R
            da0 r3 = defpackage.xd5.o(r3)
            r1.<init>(r2, r3)
            return
    }

    public uw2(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            da0 r0 = defpackage.da0.R
            da0 r2 = defpackage.xd5.o(r2)
            da0 r3 = defpackage.xd5.o(r3)
            r1.<init>(r2, r3)
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.uw2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            uw2 r5 = (defpackage.uw2) r5
            da0 r1 = r4.a
            da0 r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            da0 r4 = r4.b
            da0 r5 = r5.b
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            da0 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            da0 r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            da0 r1 = r2.a
            java.lang.String r1 = r1.s()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            da0 r2 = r2.b
            java.lang.String r2 = r2.s()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
