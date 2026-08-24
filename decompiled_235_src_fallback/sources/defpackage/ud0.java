package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ud0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ud0 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.be0 B;
    public final /* synthetic */ defpackage.yk5 L;

    public /* synthetic */ ud0(defpackage.be0 r1, defpackage.ae0 r2, defpackage.yk5 r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r1
            r0.L = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            yk5 r0 = r1.L
            int r0 = defpackage.ae0.b(r0)
            be0 r1 = r1.B
            r1.a(r0)
            return
        L11:
            yk5 r0 = r1.L
            int r0 = defpackage.ae0.b(r0)
            be0 r1 = r1.B
            r1.e(r0)
            return
    }
}
