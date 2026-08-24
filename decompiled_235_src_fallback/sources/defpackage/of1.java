package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: of1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class of1 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.bw6 B;

    public /* synthetic */ of1(defpackage.bw6 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.A
            bw6 r1 = r1.B
            switch(r0) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            tb0 r1 = r1.e
            r0 = 1
            r1.cancel(r0)
            return
        Le:
            r1.b()
            return
    }
}
