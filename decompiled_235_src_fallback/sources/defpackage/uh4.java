package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uh4  reason: default package */
/* loaded from: classes.dex */
public abstract class uh4 {
    public static final java.lang.Object[] a = null;
    public static final defpackage.ca4 b = null;

    static {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            defpackage.uh4.a = r1
            ca4 r1 = new ca4
            r1.<init>(r0)
            defpackage.uh4.b = r1
            return
    }

    public static final void a(int r3, java.util.List r4) {
            int r4 = r4.size()
            if (r3 < 0) goto L9
            if (r3 >= r4) goto L9
            return
        L9:
            java.lang.String r0 = " is out of bounds. The list has "
            java.lang.String r1 = " elements."
            java.lang.String r2 = "Index "
            java.lang.String r3 = defpackage.xg6.m(r3, r4, r2, r0, r1)
            defpackage.e41.q(r3)
            return
    }

    public static final void b(int r2, java.util.List r3, int r4) {
            int r3 = r3.size()
            if (r2 > r4) goto L38
            if (r2 < 0) goto L2c
            if (r4 > r3) goto Lb
            return
        Lb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "toIndex ("
            r2.<init>(r0)
            r2.append(r4)
            java.lang.String r4 = ") is more than than the list size ("
            r2.append(r4)
            r2.append(r3)
            r3 = 41
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r3.<init>(r2)
            throw r3
        L2c:
            java.lang.String r3 = "fromIndex ("
            java.lang.String r4 = ") is less than 0."
            java.lang.String r2 = defpackage.lb1.k(r3, r2, r4)
            defpackage.e41.q(r2)
            return
        L38:
            java.lang.String r3 = ") is greater than toIndex ("
            java.lang.String r0 = ")."
            java.lang.String r1 = "Indices are out of order. fromIndex ("
            java.lang.String r2 = defpackage.xg6.m(r2, r4, r1, r3, r0)
            defpackage.i.h(r2)
            return
    }
}
