package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p82  reason: default package */
/* loaded from: classes.dex */
public class p82 extends defpackage.o82 {
    public final java.util.concurrent.locks.ReentrantLock g;
    public final java.util.LinkedHashMap h;
    public final java.util.LinkedHashMap i;

    public p82(androidx.window.extensions.layout.WindowLayoutComponent r1, defpackage.e31 r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
            r1.<init>()
            r0.g = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.h = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.i = r1
            return
    }

    @Override // defpackage.o82, defpackage.m82, defpackage.gt7
    public final void a(defpackage.b31 r8) {
            r7 = this;
            java.util.LinkedHashMap r0 = r7.h
            java.util.LinkedHashMap r1 = r7.i
            java.util.concurrent.locks.ReentrantLock r2 = r7.g
            r2.lock()
            java.lang.Object r3 = r1.get(r8)     // Catch: java.lang.Throwable -> L44
            android.content.Context r3 = (android.content.Context) r3     // Catch: java.lang.Throwable -> L44
            if (r3 != 0) goto L15
            r2.unlock()
            return
        L15:
            java.lang.Object r4 = r0.get(r3)     // Catch: java.lang.Throwable -> L44
            i94 r4 = (defpackage.i94) r4     // Catch: java.lang.Throwable -> L44
            if (r4 != 0) goto L21
            r2.unlock()
            return
        L21:
            java.util.concurrent.locks.ReentrantLock r5 = r4.b     // Catch: java.lang.Throwable -> L44
            r5.lock()     // Catch: java.lang.Throwable -> L44
            java.util.LinkedHashSet r6 = r4.d     // Catch: java.lang.Throwable -> L4a
            r6.remove(r8)     // Catch: java.lang.Throwable -> L4a
            r5.unlock()     // Catch: java.lang.Throwable -> L44
            r1.remove(r8)     // Catch: java.lang.Throwable -> L44
            java.util.LinkedHashSet r8 = r4.d     // Catch: java.lang.Throwable -> L44
            boolean r8 = r8.isEmpty()     // Catch: java.lang.Throwable -> L44
            if (r8 == 0) goto L46
            r0.remove(r3)     // Catch: java.lang.Throwable -> L44
            androidx.window.extensions.layout.WindowLayoutComponent r7 = r7.a     // Catch: java.lang.Throwable -> L44
            androidx.window.extensions.core.util.function.Consumer r4 = (androidx.window.extensions.core.util.function.Consumer) r4     // Catch: java.lang.Throwable -> L44
            r7.removeWindowLayoutInfoListener(r4)     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r7 = move-exception
            goto L4f
        L46:
            r2.unlock()
            return
        L4a:
            r7 = move-exception
            r5.unlock()     // Catch: java.lang.Throwable -> L44
            throw r7     // Catch: java.lang.Throwable -> L44
        L4f:
            r2.unlock()
            throw r7
    }

    @Override // defpackage.o82, defpackage.m82, defpackage.gt7
    public final void b(android.content.Context r4, java.util.concurrent.Executor r5, defpackage.b31 r6) {
            r3 = this;
            java.util.LinkedHashMap r5 = r3.h
            java.util.concurrent.locks.ReentrantLock r0 = r3.g
            r0.lock()
            java.lang.Object r1 = r5.get(r4)     // Catch: java.lang.Throwable -> L18
            i94 r1 = (defpackage.i94) r1     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashMap r2 = r3.i
            if (r1 == 0) goto L1a
            r1.a(r6)     // Catch: java.lang.Throwable -> L18
            r2.put(r6, r4)     // Catch: java.lang.Throwable -> L18
            goto L2f
        L18:
            r3 = move-exception
            goto L33
        L1a:
            i94 r1 = new i94     // Catch: java.lang.Throwable -> L18
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L18
            r5.put(r4, r1)     // Catch: java.lang.Throwable -> L18
            r2.put(r6, r4)     // Catch: java.lang.Throwable -> L18
            r1.a(r6)     // Catch: java.lang.Throwable -> L18
            androidx.window.extensions.layout.WindowLayoutComponent r3 = r3.a     // Catch: java.lang.Throwable -> L18
            androidx.window.extensions.core.util.function.Consumer r1 = (androidx.window.extensions.core.util.function.Consumer) r1     // Catch: java.lang.Throwable -> L18
            r3.addWindowLayoutInfoListener(r4, r1)     // Catch: java.lang.Throwable -> L18
        L2f:
            r0.unlock()
            return
        L33:
            r0.unlock()
            throw r3
    }
}
