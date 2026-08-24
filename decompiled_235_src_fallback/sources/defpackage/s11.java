package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s11  reason: default package */
/* loaded from: classes.dex */
public final class s11 {
    public int a;
    public int b;
    public java.lang.Object c;
    public java.lang.Cloneable d;
    public java.lang.Cloneable e;

    public int a(long r8) {
            r7 = this;
            int r0 = r7.a
            int r0 = r0 + 1
            java.lang.Object r1 = r7.c
            long[] r1 = (long[]) r1
            int r2 = r1.length
            r3 = 14
            r4 = 0
            if (r0 > r2) goto Lf
            goto L24
        Lf:
            int r2 = r2 * 2
            long[] r0 = new long[r2]
            int[] r2 = new int[r2]
            int r5 = r1.length
            defpackage.fv.s0(r1, r0, r4, r4, r5)
            java.lang.Cloneable r1 = r7.d
            int[] r1 = (int[]) r1
            defpackage.fv.v0(r4, r4, r3, r1, r2)
            r7.c = r0
            r7.d = r2
        L24:
            int r0 = r7.a
            int r1 = r0 + 1
            r7.a = r1
            java.lang.Cloneable r1 = r7.e
            int[] r1 = (int[]) r1
            int r1 = r1.length
            int r2 = r7.b
            if (r2 < r1) goto L49
            int r1 = r1 * 2
            int[] r2 = new int[r1]
            r5 = r4
        L38:
            if (r5 >= r1) goto L40
            int r6 = r5 + 1
            r2[r5] = r6
            r5 = r6
            goto L38
        L40:
            java.lang.Cloneable r1 = r7.e
            int[] r1 = (int[]) r1
            defpackage.fv.v0(r4, r4, r3, r1, r2)
            r7.e = r2
        L49:
            int r1 = r7.b
            java.lang.Cloneable r2 = r7.e
            int[] r2 = (int[]) r2
            r3 = r2[r1]
            r7.b = r3
            java.lang.Object r3 = r7.c
            long[] r3 = (long[]) r3
            r3[r0] = r8
            java.lang.Cloneable r4 = r7.d
            int[] r4 = (int[]) r4
            r4[r0] = r1
            r2[r1] = r0
        L61:
            if (r0 <= 0) goto L76
            int r2 = r0 + 1
            int r2 = r2 >> 1
            int r2 = r2 + (-1)
            r4 = r3[r2]
            int r4 = defpackage.nb3.q(r4, r8)
            if (r4 <= 0) goto L76
            r7.c(r2, r0)
            r0 = r2
            goto L61
        L76:
            return r1
    }

    public void b(android.content.Context r9, android.content.res.XmlResourceParser r10) {
            r8 = this;
            z11 r0 = new z11
            r0.<init>()
            int r1 = r10.getAttributeCount()
            r2 = 0
        La:
            if (r2 >= r1) goto L6a
            java.lang.String r3 = r10.getAttributeName(r2)
            java.lang.String r4 = r10.getAttributeValue(r2)
            if (r3 == 0) goto L67
            if (r4 != 0) goto L19
            goto L67
        L19:
            java.lang.String r5 = "id"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L67
            java.lang.String r1 = "/"
            boolean r1 = r4.contains(r1)
            r2 = -1
            r3 = 1
            if (r1 == 0) goto L43
            r1 = 47
            int r1 = r4.indexOf(r1)
            int r1 = r1 + r3
            java.lang.String r1 = r4.substring(r1)
            android.content.res.Resources r6 = r9.getResources()
            java.lang.String r7 = r9.getPackageName()
            int r1 = r6.getIdentifier(r1, r5, r7)
            goto L44
        L43:
            r1 = r2
        L44:
            if (r1 != r2) goto L5c
            int r2 = r4.length()
            if (r2 <= r3) goto L55
            java.lang.String r1 = r4.substring(r3)
            int r1 = java.lang.Integer.parseInt(r1)
            goto L5c
        L55:
            java.lang.String r2 = "ConstraintLayoutStates"
            java.lang.String r3 = "error in parsing id"
            android.util.Log.e(r2, r3)
        L5c:
            r0.k(r9, r10)
            java.lang.Cloneable r8 = r8.e
            android.util.SparseArray r8 = (android.util.SparseArray) r8
            r8.put(r1, r0)
            return
        L67:
            int r2 = r2 + 1
            goto La
        L6a:
            return
    }

    public void c(int r7, int r8) {
            r6 = this;
            java.lang.Object r0 = r6.c
            long[] r0 = (long[]) r0
            java.lang.Cloneable r1 = r6.d
            int[] r1 = (int[]) r1
            java.lang.Cloneable r6 = r6.e
            int[] r6 = (int[]) r6
            r2 = r0[r7]
            r4 = r0[r8]
            r0[r7] = r4
            r0[r8] = r2
            r0 = r1[r7]
            r2 = r1[r8]
            r1[r7] = r2
            r1[r8] = r0
            r6[r2] = r7
            r6[r0] = r8
            return
    }
}
