package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pi  reason: default package */
/* loaded from: classes.dex */
public final class pi implements java.util.concurrent.Executor {
    public final /* synthetic */ int A;
    public final android.os.Handler B;

    public pi() {
            r2 = this;
            r0 = 0
            r2.A = r0
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.B = r0
            return
    }

    public pi(android.os.Handler r2) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r2.getClass()
            r1.<init>()
            r1.B = r2
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
            r1.post(r2)
            return
    }
}
