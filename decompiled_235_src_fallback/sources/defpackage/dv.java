package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dv  reason: default package */
/* loaded from: classes.dex */
public final class dv implements java.lang.Iterable, defpackage.zf3 {
    public final /* synthetic */ int A;
    public final java.lang.Object B;

    public /* synthetic */ dv(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r2 = this;
            int r0 = r2.A
            java.lang.Object r2 = r2.B
            switch(r0) {
                case 0: goto L36;
                case 1: goto L2d;
                case 2: goto L1f;
                case 3: goto L17;
                case 4: goto Lf;
                default: goto L7;
            }
        L7:
            w0 r0 = new w0
            s52 r2 = (defpackage.s52) r2
            r0.<init>(r2)
            return r0
        Lf:
            w0 r0 = new w0
            wb6 r2 = (defpackage.wb6) r2
            r0.<init>(r2)
            return r0
        L17:
            lh1 r2 = (defpackage.lh1) r2
            kh1 r0 = new kh1
            r0.<init>(r2)
            return r0
        L1f:
            op1 r0 = new op1
            on2 r2 = (defpackage.on2) r2
            java.lang.Object r2 = r2.c()
            java.util.Iterator r2 = (java.util.Iterator) r2
            r0.<init>(r2)
            return r0
        L2d:
            float[] r2 = (float[]) r2
            w0 r0 = new w0
            r1 = 1
            r0.<init>(r2, r1)
            return r0
        L36:
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            w0 r0 = new w0
            r0.<init>(r2)
            return r0
    }
}
