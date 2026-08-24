package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bc7  reason: default package */
/* loaded from: classes.dex */
public abstract class bc7 implements java.util.Iterator, defpackage.zf3 {
    public java.lang.Object[] A;
    public int B;
    public int L;

    public bc7() {
            r1 = this;
            r1.<init>()
            ac7 r0 = defpackage.ac7.e
            java.lang.Object[] r0 = r0.d
            r1.A = r0
            return
    }

    public final void a(java.lang.Object[] r1, int r2, int r3) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.L = r3
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
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }
}
