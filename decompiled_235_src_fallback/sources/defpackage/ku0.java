package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ku0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ku0 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.jk5 B;
    public final /* synthetic */ defpackage.yk5 L;

    public /* synthetic */ ku0(defpackage.jk5 r1, defpackage.yk5 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L15;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            jk5 r0 = r1.B
            yk5 r1 = r1.L
            r0.A(r1)
            return
        Ld:
            jk5 r0 = r1.B
            yk5 r1 = r1.L
            r0.k(r1)
            return
        L15:
            jk5 r0 = r1.B
            yk5 r1 = r1.L
            r0.r(r1)
            return
    }
}
