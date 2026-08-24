package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dw4  reason: default package */
/* loaded from: classes.dex */
public final class dw4 implements java.util.Iterator, defpackage.zf3 {
    public final /* synthetic */ int A;
    public final java.util.Iterator B;

    public dw4(defpackage.aw4 r5) {
            r4 = this;
            r0 = 0
            r4.A = r0
            r4.<init>()
            r0 = 8
            bc7[] r1 = new defpackage.bc7[r0]
            r2 = 0
        Lb:
            if (r2 >= r0) goto L17
            dc7 r3 = new dc7
            r3.<init>(r4)
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L17:
            bw4 r0 = new bw4
            r0.<init>(r5, r1)
            r4.B = r0
            return
    }

    public dw4(defpackage.dl7 r2) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            java.util.List r2 = r2.f0
            java.util.Iterator r2 = r2.iterator()
            r1.B = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            java.util.Iterator r1 = r1.B
            boolean r1 = r1.hasNext()
            return r1
        Lc:
            java.util.Iterator r1 = r1.B
            bw4 r1 = (defpackage.bw4) r1
            boolean r1 = r1.L
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.util.Iterator r1 = r1.B
            java.lang.Object r1 = r1.next()
            fl7 r1 = (defpackage.fl7) r1
            return r1
        Le:
            java.util.Iterator r1 = r1.B
            bw4 r1 = (defpackage.bw4) r1
            java.lang.Object r1 = r1.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            return r1
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
        Ld:
            java.util.Iterator r1 = r1.B
            bw4 r1 = (defpackage.bw4) r1
            r1.remove()
            return
    }
}
