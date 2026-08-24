package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yv6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yv6 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.pk0 B;
    public final /* synthetic */ defpackage.cz L;

    public /* synthetic */ yv6(defpackage.pk0 r1, defpackage.cz r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.A
            cz r1 = r2.L
            pk0 r2 = r2.B
            switch(r0) {
                case 0: goto Ld;
                default: goto L9;
            }
        L9:
            r2.c(r1)
            return
        Ld:
            r2.c(r1)
            return
    }
}
