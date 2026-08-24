package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: su  reason: default package */
/* loaded from: classes.dex */
public final class su implements java.util.Iterator, defpackage.zf3 {
    public int A;
    public int B;
    public boolean L;
    public final /* synthetic */ int R;
    public final /* synthetic */ java.lang.Object X;

    public su(int r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    public su(defpackage.wu r1, int r2) {
            r0 = this;
            r0.R = r2
            switch(r2) {
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            r0.X = r1
            int r1 = r1.L
            r0.<init>(r1)
            return
        Ld:
            r0.X = r1
            int r1 = r1.L
            r0.<init>(r1)
            return
    }

    public su(defpackage.zu r2) {
            r1 = this;
            r0 = 2
            r1.R = r0
            r1.X = r2
            int r2 = r2.L
            r1.<init>(r2)
            return
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

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2c
            int r0 = r3.B
            int r1 = r3.R
            java.lang.Object r2 = r3.X
            switch(r1) {
                case 0: goto L1d;
                case 1: goto L16;
                default: goto Lf;
            }
        Lf:
            zu r2 = (defpackage.zu) r2
            java.lang.Object[] r1 = r2.B
            r0 = r1[r0]
            goto L23
        L16:
            wu r2 = (defpackage.wu) r2
            java.lang.Object r0 = r2.i(r0)
            goto L23
        L1d:
            wu r2 = (defpackage.wu) r2
            java.lang.Object r0 = r2.f(r0)
        L23:
            int r1 = r3.B
            r2 = 1
            int r1 = r1 + r2
            r3.B = r1
            r3.L = r2
            return r0
        L2c:
            defpackage.fa6.c()
            r3 = 0
            return r3
    }

    @Override // java.util.Iterator
    public final void remove() {
            r3 = this;
            boolean r0 = r3.L
            if (r0 == 0) goto L2c
            int r0 = r3.B
            int r0 = r0 + (-1)
            r3.B = r0
            int r1 = r3.R
            java.lang.Object r2 = r3.X
            switch(r1) {
                case 0: goto L1d;
                case 1: goto L17;
                default: goto L11;
            }
        L11:
            zu r2 = (defpackage.zu) r2
            r2.a(r0)
            goto L22
        L17:
            wu r2 = (defpackage.wu) r2
            r2.g(r0)
            goto L22
        L1d:
            wu r2 = (defpackage.wu) r2
            r2.g(r0)
        L22:
            int r0 = r3.A
            int r0 = r0 + (-1)
            r3.A = r0
            r0 = 0
            r3.L = r0
            return
        L2c:
            java.lang.String r3 = "Call next() before removing an element."
            defpackage.i.m(r3)
            return
    }
}
