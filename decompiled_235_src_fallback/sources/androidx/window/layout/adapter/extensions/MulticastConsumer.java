package androidx.window.layout.adapter.extensions;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class MulticastConsumer implements defpackage.b31 {
    public final android.content.Context a;
    public final java.util.concurrent.locks.ReentrantLock b;
    public defpackage.kv7 c;
    public final java.util.LinkedHashSet d;

    public MulticastConsumer(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
            r1.<init>()
            r0.b = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.d = r1
            return
    }

    public final void a(defpackage.b31 r3) {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.b
            r0.lock()
            kv7 r1 = r2.c     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Lf
            r3.accept(r1)     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r2 = move-exception
            goto L18
        Lf:
            java.util.LinkedHashSet r2 = r2.d     // Catch: java.lang.Throwable -> Ld
            r2.add(r3)     // Catch: java.lang.Throwable -> Ld
            r0.unlock()
            return
        L18:
            r0.unlock()
            throw r2
    }

    public void accept(androidx.window.extensions.layout.WindowLayoutInfo r3) {
            r2 = this;
            r3.getClass()
            java.util.concurrent.locks.ReentrantLock r0 = r2.b
            r0.lock()
            android.content.Context r1 = r2.a     // Catch: java.lang.Throwable -> L26
            kv7 r3 = defpackage.t82.c(r1, r3)     // Catch: java.lang.Throwable -> L26
            r2.c = r3     // Catch: java.lang.Throwable -> L26
            java.util.LinkedHashSet r2 = r2.d     // Catch: java.lang.Throwable -> L26
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L26
        L16:
            boolean r1 = r2.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L28
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L26
            b31 r1 = (defpackage.b31) r1     // Catch: java.lang.Throwable -> L26
            r1.accept(r3)     // Catch: java.lang.Throwable -> L26
            goto L16
        L26:
            r2 = move-exception
            goto L2c
        L28:
            r0.unlock()
            return
        L2c:
            r0.unlock()
            throw r2
    }

    @Override // defpackage.b31
    public final /* bridge */ /* synthetic */ void accept(java.lang.Object r1) {
            r0 = this;
            androidx.window.extensions.layout.WindowLayoutInfo r1 = (androidx.window.extensions.layout.WindowLayoutInfo) r1
            r0.accept(r1)
            return
    }
}
