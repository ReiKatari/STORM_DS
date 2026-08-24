package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: va4  reason: default package */
/* loaded from: classes.dex */
public abstract class va4 {
    public static final void a(int r0, java.util.List r1) {
            int r1 = r1.size()
            if (r0 < 0) goto La
            if (r0 < r1) goto L9
            goto La
        L9:
            return
        La:
            c(r0, r1)
            return
    }

    public static final void b(int r0, java.util.List r1, int r2) {
            if (r0 <= r2) goto L5
            f(r0, r2)
        L5:
            if (r0 >= 0) goto La
            d(r0)
        La:
            int r0 = r1.size()
            if (r2 <= r0) goto L17
            int r0 = r1.size()
            e(r2, r0)
        L17:
            return
    }

    private static final void c(int r4, int r5) {
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = " is out of bounds. The list has "
            java.lang.String r2 = " elements."
            java.lang.String r3 = "Index "
            java.lang.String r4 = defpackage.xg6.m(r4, r5, r3, r1, r2)
            r0.<init>(r4)
            throw r0
    }

    private static final void d(int r3) {
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "fromIndex ("
            java.lang.String r2 = ") is less than 0."
            java.lang.String r3 = defpackage.lb1.k(r1, r3, r2)
            r0.<init>(r3)
            throw r0
    }

    private static final void e(int r3, int r4) {
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "toIndex ("
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = ") is more than than the list size ("
            r1.append(r3)
            r1.append(r4)
            r3 = 41
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static final void f(int r4, int r5) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = ") is greater than toIndex ("
            java.lang.String r2 = ")."
            java.lang.String r3 = "Indices are out of order. fromIndex ("
            java.lang.String r4 = defpackage.xg6.m(r4, r5, r3, r1, r2)
            r0.<init>(r4)
            throw r0
    }
}
