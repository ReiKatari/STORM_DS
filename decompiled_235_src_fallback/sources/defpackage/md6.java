package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: md6  reason: default package */
/* loaded from: classes.dex */
public final class md6 {
    public static final defpackage.md6[] q = null;
    public java.lang.String a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public java.nio.file.attribute.FileTime h;
    public java.nio.file.attribute.FileTime i;
    public java.nio.file.attribute.FileTime j;
    public boolean k;
    public int l;
    public boolean m;
    public long n;
    public long o;
    public java.util.List p;

    static {
            r0 = 0
            md6[] r0 = new defpackage.md6[r0]
            defpackage.md6.q = r0
            return
    }

    public final void a(java.lang.Iterable r3) {
            r2 = this;
            if (r3 == 0) goto L16
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            ld6 r1 = new ld6
            r1.<init>(r0)
            r3.forEach(r1)
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            r2.p = r3
            return
        L16:
            r3 = 0
            r2.p = r3
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L5
            goto Lbe
        L5:
            r1 = 0
            if (r7 == 0) goto Lbf
            java.lang.Class<md6> r2 = defpackage.md6.class
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L12
            goto Lbf
        L12:
            md6 r7 = (defpackage.md6) r7
            java.lang.String r2 = r6.a
            java.lang.String r3 = r7.a
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto Lbf
            boolean r2 = r6.b
            boolean r3 = r7.b
            if (r2 != r3) goto Lbf
            boolean r2 = r6.c
            boolean r3 = r7.c
            if (r2 != r3) goto Lbf
            boolean r2 = r6.d
            boolean r3 = r7.d
            if (r2 != r3) goto Lbf
            boolean r2 = r6.e
            boolean r3 = r7.e
            if (r2 != r3) goto Lbf
            boolean r2 = r6.f
            boolean r3 = r7.f
            if (r2 != r3) goto Lbf
            boolean r2 = r6.g
            boolean r3 = r7.g
            if (r2 != r3) goto Lbf
            java.nio.file.attribute.FileTime r2 = r6.h
            java.nio.file.attribute.FileTime r3 = r7.h
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto Lbf
            java.nio.file.attribute.FileTime r2 = r6.i
            java.nio.file.attribute.FileTime r3 = r7.i
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto Lbf
            java.nio.file.attribute.FileTime r2 = r6.j
            java.nio.file.attribute.FileTime r3 = r7.j
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto Lbf
            boolean r2 = r6.k
            boolean r3 = r7.k
            if (r2 != r3) goto Lbf
            int r2 = r6.l
            int r3 = r7.l
            if (r2 != r3) goto Lbf
            boolean r2 = r6.m
            boolean r3 = r7.m
            if (r2 != r3) goto Lbf
            long r2 = r6.n
            long r4 = r7.n
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lbf
            long r2 = r6.o
            long r4 = r7.o
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lbf
            java.util.List r6 = r6.p
            java.util.List r7 = r7.p
            if (r6 != 0) goto L8e
            if (r7 != 0) goto L8c
            r6 = r0
            goto Lbc
        L8c:
            r6 = r1
            goto Lbc
        L8e:
            if (r7 != 0) goto L91
            goto L8c
        L91:
            java.util.Iterator r7 = r7.iterator()
            java.util.Iterator r6 = r6.iterator()
        L99:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lb7
            java.lang.Object r2 = r6.next()
            ud6 r2 = (defpackage.ud6) r2
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto Lac
            goto L8c
        Lac:
            java.lang.Object r3 = r7.next()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L99
            goto L8c
        Lb7:
            boolean r6 = r7.hasNext()
            r6 = r6 ^ r0
        Lbc:
            if (r6 == 0) goto Lbf
        Lbe:
            return r0
        Lbf:
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }
}
