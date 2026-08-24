package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n33  reason: default package */
/* loaded from: classes.dex */
public class n33 implements defpackage.gx3 {
    public static final defpackage.n33 L = null;
    public final /* synthetic */ int A;
    public final java.lang.Object B;

    static {
            n33 r0 = new n33
            r1 = 0
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.n33.L = r0
            return
    }

    public /* synthetic */ n33(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.gx3
    public final void a(java.util.concurrent.Executor r3, java.lang.Runnable r4) {
            r2 = this;
            r3.getClass()
            r3.execute(r4)     // Catch: java.lang.RuntimeException -> L7
            return
        L7:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Experienced RuntimeException while attempting to notify "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " on Executor "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "ImmediateFuture"
            defpackage.kj2.w(r4, r3, r2)
            return
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Lf;
                default: goto L5;
            }
        L5:
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException
            java.lang.Object r1 = r1.B
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.<init>(r1)
            throw r0
        Lf:
            java.lang.Object r1 = r1.B
            return r1
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            r3.getClass()
            java.lang.Object r0 = r0.get()
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r0 = this;
            r0 = 1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            int r0 = r3.A
            java.lang.String r1 = "]]"
            java.lang.Object r2 = r3.B
            switch(r0) {
                case 0: goto L27;
                default: goto L9;
            }
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = super.toString()
            r0.append(r3)
            java.lang.String r3 = "[status=FAILURE, cause=["
            r0.append(r3)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r0.append(r2)
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            return r3
        L27:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = super.toString()
            r0.append(r3)
            java.lang.String r3 = "[status=SUCCESS, result=["
            r0.append(r3)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
