package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xv3  reason: default package */
/* loaded from: classes.dex */
public final class xv3 implements java.util.Iterator {
    public defpackage.zv3 A;
    public defpackage.zv3 B;
    public int L;
    public final /* synthetic */ defpackage.aw3 R;
    public final /* synthetic */ int X;

    public xv3(defpackage.aw3 r1, int r2) {
            r0 = this;
            r0.X = r2
            r0.<init>()
            r0.R = r1
            zv3 r2 = r1.Y
            zv3 r2 = r2.R
            r0.A = r2
            r2 = 0
            r0.B = r2
            int r1 = r1.X
            r0.L = r1
            return
    }

    public final java.lang.Object a() {
            r0 = this;
            zv3 r0 = r0.b()
            return r0
    }

    public final defpackage.zv3 b() {
            r4 = this;
            zv3 r0 = r4.A
            aw3 r1 = r4.R
            zv3 r2 = r1.Y
            r3 = 0
            if (r0 == r2) goto L1a
            int r1 = r1.X
            int r2 = r4.L
            if (r1 != r2) goto L16
            zv3 r1 = r0.R
            r4.A = r1
            r4.B = r0
            return r0
        L16:
            defpackage.i.l()
            return r3
        L1a:
            defpackage.fa6.c()
            return r3
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            zv3 r0 = r1.A
            aw3 r1 = r1.R
            zv3 r1 = r1.Y
            if (r0 == r1) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
            r1 = this;
            int r0 = r1.X
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.a()
            return r1
        La:
            zv3 r1 = r1.b()
            java.lang.Object r1 = r1.Y
            return r1
    }

    @Override // java.util.Iterator
    public final void remove() {
            r3 = this;
            zv3 r0 = r3.B
            if (r0 == 0) goto L12
            r1 = 1
            aw3 r2 = r3.R
            r2.c(r0, r1)
            r0 = 0
            r3.B = r0
            int r0 = r2.X
            r3.L = r0
            return
        L12:
            defpackage.e41.m()
            return
    }
}
