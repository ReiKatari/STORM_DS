package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: to2  reason: default package */
/* loaded from: classes.dex */
public class to2 implements defpackage.gx3 {
    public final defpackage.gx3 A;
    public defpackage.qb0 B;

    public to2() {
            r2 = this;
            r2.<init>()
            d51 r0 = new d51
            r1 = 22
            r0.<init>(r2, r1)
            tb0 r0 = defpackage.ak7.W(r0)
            r2.A = r0
            return
    }

    public to2(defpackage.gx3 r1) {
            r0 = this;
            r0.<init>()
            r1.getClass()
            r0.A = r1
            return
    }

    @Override // defpackage.gx3
    public final void a(java.util.concurrent.Executor r1, java.lang.Runnable r2) {
            r0 = this;
            gx3 r0 = r0.A
            r0.a(r1, r2)
            return
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean r1) {
            r0 = this;
            gx3 r0 = r0.A
            boolean r0 = r0.cancel(r1)
            return r0
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get() {
            r0 = this;
            gx3 r0 = r0.A
            java.lang.Object r0 = r0.get()
            return r0
    }

    @Override // java.util.concurrent.Future
    public java.lang.Object get(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            gx3 r0 = r0.A
            java.lang.Object r0 = r0.get(r1, r3)
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r0 = this;
            gx3 r0 = r0.A
            boolean r0 = r0.isCancelled()
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r0 = this;
            gx3 r0 = r0.A
            boolean r0 = r0.isDone()
            return r0
    }
}
