package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d72  reason: default package */
/* loaded from: classes.dex */
public final class d72 implements java.util.concurrent.Executor {
    public final /* synthetic */ int A;
    public final android.os.Handler B;

    public /* synthetic */ d72(android.os.Handler r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            int r0 = r1.A
            android.os.Handler r1 = r1.B
            switch(r0) {
                case 0: goto L15;
                default: goto L7;
            }
        L7:
            r2.getClass()
            boolean r2 = r1.post(r2)
            if (r2 == 0) goto L11
            goto L14
        L11:
            defpackage.e41.e(r1)
        L14:
            return
        L15:
            r2.getClass()
            boolean r2 = r1.post(r2)
            if (r2 == 0) goto L1f
            goto L22
        L1f:
            defpackage.e41.e(r1)
        L22:
            return
    }
}
