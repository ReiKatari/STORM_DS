package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lv3  reason: default package */
/* loaded from: classes.dex */
public final class lv3 implements java.util.Iterator, defpackage.zf3 {
    public java.lang.String A;
    public boolean B;
    public final /* synthetic */ defpackage.ev L;

    public lv3(defpackage.ev r1) {
            r0 = this;
            r0.<init>()
            r0.L = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            java.lang.String r0 = r2.A
            r1 = 1
            if (r0 != 0) goto L19
            boolean r0 = r2.B
            if (r0 != 0) goto L19
            ev r0 = r2.L
            java.lang.Object r0 = r0.b
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0
            java.lang.String r0 = r0.readLine()
            r2.A = r0
            if (r0 != 0) goto L19
            r2.B = r1
        L19:
            java.lang.String r2 = r2.A
            if (r2 == 0) goto L1e
            return r1
        L1e:
            r2 = 0
            return r2
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            r1 = 0
            if (r0 == 0) goto Lf
            java.lang.String r0 = r2.A
            r2.A = r1
            r0.getClass()
            return r0
        Lf:
            defpackage.fa6.c()
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
