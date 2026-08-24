package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tb0  reason: default package */
/* loaded from: classes.dex */
public final class tb0 implements defpackage.gx3 {
    public final java.lang.ref.WeakReference A;
    public final defpackage.sb0 B;

    public tb0(defpackage.qb0 r2) {
            r1 = this;
            r1.<init>()
            sb0 r0 = new sb0
            r0.<init>(r1)
            r1.B = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.A = r0
            return
    }

    @Override // defpackage.gx3
    public final void a(java.util.concurrent.Executor r1, java.lang.Runnable r2) {
            r0 = this;
            sb0 r0 = r0.B
            r0.a(r1, r2)
            return
    }

    public final boolean b(java.lang.Throwable r1) {
            r0 = this;
            sb0 r0 = r0.B
            boolean r0 = r0.i(r1)
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.A
            java.lang.Object r0 = r0.get()
            qb0 r0 = (defpackage.qb0) r0
            sb0 r1 = r1.B
            boolean r1 = r1.cancel(r2)
            if (r1 == 0) goto L1c
            if (r0 == 0) goto L1c
            r2 = 0
            r0.a = r2
            r0.b = r2
            hl5 r0 = r0.c
            r0.j(r2)
        L1c:
            return r1
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
            r0 = this;
            sb0 r0 = r0.B
            java.lang.Object r0 = r0.get()
            return r0
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            sb0 r0 = r0.B
            java.lang.Object r0 = r0.get(r1, r3)
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r0 = this;
            sb0 r0 = r0.B
            java.lang.Object r0 = r0.A
            boolean r0 = r0 instanceof defpackage.k1
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r0 = this;
            sb0 r0 = r0.B
            boolean r0 = r0.isDone()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            sb0 r0 = r0.B
            java.lang.String r0 = r0.toString()
            return r0
    }
}
