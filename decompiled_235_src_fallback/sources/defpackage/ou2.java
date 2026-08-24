package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ou2  reason: default package */
/* loaded from: classes.dex */
public final class ou2 implements java.util.Iterator, defpackage.zf3 {
    public final defpackage.mk6 A;
    public final int B;
    public int L;
    public final int R;

    public ou2(defpackage.mk6 r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r3
            r0.L = r2
            int r2 = r1.d0
            r0.R = r2
            boolean r0 = r1.Z
            if (r0 == 0) goto L14
            defpackage.ok6.f()
        L14:
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.L
            int r1 = r1.B
            if (r0 >= r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r5 = this;
            mk6 r0 = r5.A
            int r1 = r0.d0
            int r2 = r5.R
            if (r1 == r2) goto Lb
            defpackage.ok6.f()
        Lb:
            int r1 = r5.L
            int[] r3 = r0.A
            int r4 = r1 * 5
            int r4 = r4 + 3
            r3 = r3[r4]
            int r3 = r3 + r1
            r5.L = r3
            nk6 r5 = new nk6
            r5.<init>(r0, r1, r2)
            return r5
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
