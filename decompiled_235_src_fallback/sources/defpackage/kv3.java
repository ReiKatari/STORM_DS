package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kv3  reason: default package */
/* loaded from: classes.dex */
public final class kv3 implements java.util.Iterator, defpackage.zf3 {
    public final java.lang.CharSequence A;
    public int B;
    public int L;
    public int R;
    public int X;

    public kv3(java.lang.CharSequence r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r9 = this;
            int r0 = r9.B
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            if (r0 != r2) goto L9
            return r2
        L9:
            return r1
        La:
            int r0 = r9.X
            r3 = 2
            if (r0 >= 0) goto L12
            r9.B = r3
            return r1
        L12:
            java.lang.CharSequence r0 = r9.A
            int r1 = r0.length()
            int r4 = r9.L
            int r5 = r0.length()
        L1e:
            if (r4 >= r5) goto L43
            char r6 = r0.charAt(r4)
            r7 = 13
            r8 = 10
            if (r6 == r8) goto L2f
            if (r6 == r7) goto L2f
            int r4 = r4 + 1
            goto L1e
        L2f:
            if (r6 != r7) goto L40
            int r1 = r4 + 1
            int r5 = r0.length()
            if (r1 >= r5) goto L40
            char r0 = r0.charAt(r1)
            if (r0 != r8) goto L40
            goto L41
        L40:
            r3 = r2
        L41:
            r1 = r4
            goto L44
        L43:
            r3 = -1
        L44:
            r9.B = r2
            r9.X = r3
            r9.R = r1
            return r2
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            r0 = 0
            r3.B = r0
            int r0 = r3.R
            int r1 = r3.L
            int r2 = r3.X
            int r2 = r2 + r0
            r3.L = r2
            java.lang.CharSequence r3 = r3.A
            java.lang.CharSequence r3 = r3.subSequence(r1, r0)
            java.lang.String r3 = r3.toString()
            return r3
        L1d:
            defpackage.fa6.c()
            r3 = 0
            return r3
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }
}
