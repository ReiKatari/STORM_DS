package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yt  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yt implements java.util.concurrent.Executor {
    public final /* synthetic */ int A;

    public /* synthetic */ yt(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r1) {
            r0 = this;
            int r0 = r0.A
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            r1.run()
            return
        L9:
            zt r0 = defpackage.zt.l0()
            sf1 r0 = r0.e
            java.util.concurrent.ExecutorService r0 = r0.f
            r0.execute(r1)
            return
    }
}
