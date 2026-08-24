package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kv6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kv6 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.qv6 B;

    public /* synthetic */ kv6(defpackage.qv6 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.A
            qv6 r3 = r3.B
            switch(r0) {
                case 0: goto Lf;
                default: goto L7;
            }
        L7:
            boolean r0 = r3.n
            if (r0 != 0) goto Le
            r3.d()
        Le:
            return
        Lf:
            ov2 r0 = defpackage.u24.x()
            kv6 r1 = new kv6
            r2 = 1
            r1.<init>(r3, r2)
            r0.execute(r1)
            return
    }
}
