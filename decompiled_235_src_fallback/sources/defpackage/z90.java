package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z90  reason: default package */
/* loaded from: classes.dex */
public final class z90 implements java.util.Iterator {
    public int A;
    public final int B;
    public final /* synthetic */ defpackage.ea0 L;

    public z90(defpackage.ea0 r2) {
            r1 = this;
            r1.<init>()
            r1.L = r2
            r0 = 0
            r1.A = r0
            int r2 = r2.size()
            r1.B = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.A
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
            r2 = this;
            int r0 = r2.A
            int r1 = r2.B
            if (r0 >= r1) goto L15
            int r1 = r0 + 1
            r2.A = r1
            ea0 r2 = r2.L
            byte r2 = r2.f(r0)
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            return r2
        L15:
            defpackage.fa6.c()
            r2 = 0
            return r2
    }

    @Override // java.util.Iterator
    public final void remove() {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
