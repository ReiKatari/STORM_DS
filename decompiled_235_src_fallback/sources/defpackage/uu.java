package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uu  reason: default package */
/* loaded from: classes.dex */
public final class uu implements java.util.Iterator, java.util.Map.Entry {
    public int A;
    public int B;
    public boolean L;
    public final /* synthetic */ defpackage.wu R;

    public uu(defpackage.wu r1) {
            r0 = this;
            r0.<init>()
            r0.R = r1
            int r1 = r1.L
            int r1 = r1 + (-1)
            r0.A = r1
            r1 = -1
            r0.B = r1
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r4.L
            r1 = 0
            if (r0 == 0) goto L31
            boolean r0 = r5 instanceof java.util.Map.Entry
            if (r0 != 0) goto La
            goto L30
        La:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getKey()
            int r2 = r4.B
            wu r3 = r4.R
            java.lang.Object r2 = r3.f(r2)
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 == 0) goto L30
            java.lang.Object r5 = r5.getValue()
            int r4 = r4.B
            java.lang.Object r4 = r3.i(r4)
            boolean r4 = defpackage.nb3.k(r5, r4)
            if (r4 == 0) goto L30
            r4 = 1
            return r4
        L30:
            return r1
        L31:
            java.lang.String r4 = "This container does not support retaining Map.Entry objects"
            defpackage.i.m(r4)
            return r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r1 = this;
            boolean r0 = r1.L
            if (r0 == 0) goto Ld
            wu r0 = r1.R
            int r1 = r1.B
            java.lang.Object r1 = r0.f(r1)
            return r1
        Ld:
            java.lang.String r1 = "This container does not support retaining Map.Entry objects"
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r1 = this;
            boolean r0 = r1.L
            if (r0 == 0) goto Ld
            wu r0 = r1.R
            int r1 = r1.B
            java.lang.Object r1 = r0.i(r1)
            return r1
        Ld:
            java.lang.String r1 = "This container does not support retaining Map.Entry objects"
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.B
            int r1 = r1.A
            if (r0 >= r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.L
            r1 = 0
            if (r0 == 0) goto L25
            int r0 = r3.B
            wu r2 = r3.R
            java.lang.Object r0 = r2.f(r0)
            int r3 = r3.B
            java.lang.Object r3 = r2.i(r3)
            if (r0 != 0) goto L17
            r0 = r1
            goto L1b
        L17:
            int r0 = r0.hashCode()
        L1b:
            if (r3 != 0) goto L1e
            goto L22
        L1e:
            int r1 = r3.hashCode()
        L22:
            r3 = r0 ^ r1
            return r3
        L25:
            java.lang.String r3 = "This container does not support retaining Map.Entry objects"
            defpackage.i.m(r3)
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lf
            int r0 = r2.B
            r1 = 1
            int r0 = r0 + r1
            r2.B = r0
            r2.L = r1
            return r2
        Lf:
            defpackage.fa6.c()
            r2 = 0
            return r2
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            boolean r0 = r2.L
            if (r0 == 0) goto L1b
            wu r0 = r2.R
            int r1 = r2.B
            r0.g(r1)
            int r0 = r2.B
            int r0 = r0 + (-1)
            r2.B = r0
            int r0 = r2.A
            int r0 = r0 + (-1)
            r2.A = r0
            r0 = 0
            r2.L = r0
            return
        L1b:
            defpackage.e41.m()
            return
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.L
            if (r0 == 0) goto Ld
            wu r0 = r1.R
            int r1 = r1.B
            java.lang.Object r1 = r0.h(r1, r2)
            return r1
        Ld:
            java.lang.String r1 = "This container does not support retaining Map.Entry objects"
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.getKey()
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r2 = r2.getValue()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
