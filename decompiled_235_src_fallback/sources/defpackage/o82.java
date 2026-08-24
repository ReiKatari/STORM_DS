package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o82  reason: default package */
/* loaded from: classes.dex */
public class o82 extends defpackage.m82 {
    public final androidx.window.extensions.layout.WindowLayoutComponent a;
    public final defpackage.e31 b;
    public final java.util.concurrent.locks.ReentrantLock c;
    public final java.util.LinkedHashMap d;
    public final java.util.LinkedHashMap e;
    public final java.util.LinkedHashMap f;

    public o82(androidx.window.extensions.layout.WindowLayoutComponent r1, defpackage.e31 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
            r1.<init>()
            r0.c = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.d = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.e = r1
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.f = r1
            return
    }

    @Override // defpackage.m82, defpackage.gt7
    public void a(defpackage.b31 r8) {
            r7 = this;
            java.util.LinkedHashMap r0 = r7.d
            java.util.LinkedHashMap r1 = r7.e
            java.util.concurrent.locks.ReentrantLock r2 = r7.c
            r2.lock()
            java.lang.Object r3 = r1.get(r8)     // Catch: java.lang.Throwable -> L52
            android.content.Context r3 = (android.content.Context) r3     // Catch: java.lang.Throwable -> L52
            if (r3 != 0) goto L15
            r2.unlock()
            return
        L15:
            java.lang.Object r4 = r0.get(r3)     // Catch: java.lang.Throwable -> L52
            androidx.window.layout.adapter.extensions.MulticastConsumer r4 = (androidx.window.layout.adapter.extensions.MulticastConsumer) r4     // Catch: java.lang.Throwable -> L52
            if (r4 != 0) goto L21
            r2.unlock()
            return
        L21:
            java.util.LinkedHashSet r5 = r4.d     // Catch: java.lang.Throwable -> L52
            java.util.concurrent.locks.ReentrantLock r6 = r4.b     // Catch: java.lang.Throwable -> L52
            r6.lock()     // Catch: java.lang.Throwable -> L52
            r5.remove(r8)     // Catch: java.lang.Throwable -> L58
            r6.unlock()     // Catch: java.lang.Throwable -> L52
            r1.remove(r8)     // Catch: java.lang.Throwable -> L52
            boolean r8 = r5.isEmpty()     // Catch: java.lang.Throwable -> L52
            if (r8 == 0) goto L54
            r0.remove(r3)     // Catch: java.lang.Throwable -> L52
            java.util.LinkedHashMap r7 = r7.f     // Catch: java.lang.Throwable -> L52
            java.lang.Object r7 = r7.remove(r4)     // Catch: java.lang.Throwable -> L52
            d31 r7 = (defpackage.d31) r7     // Catch: java.lang.Throwable -> L52
            if (r7 == 0) goto L54
            java.lang.reflect.Method r8 = r7.a     // Catch: java.lang.Throwable -> L52
            java.lang.Object r0 = r7.b     // Catch: java.lang.Throwable -> L52
            java.lang.Object r7 = r7.c     // Catch: java.lang.Throwable -> L52
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L52
            r8.invoke(r0, r7)     // Catch: java.lang.Throwable -> L52
            goto L54
        L52:
            r7 = move-exception
            goto L5d
        L54:
            r2.unlock()
            return
        L58:
            r7 = move-exception
            r6.unlock()     // Catch: java.lang.Throwable -> L52
            throw r7     // Catch: java.lang.Throwable -> L52
        L5d:
            r2.unlock()
            throw r7
    }

    @Override // defpackage.m82, defpackage.gt7
    public void b(android.content.Context r11, java.util.concurrent.Executor r12, defpackage.b31 r13) {
            r10 = this;
            java.util.LinkedHashMap r12 = r10.d
            java.util.concurrent.locks.ReentrantLock r1 = r10.c
            r1.lock()
            java.lang.Object r0 = r12.get(r11)     // Catch: java.lang.Throwable -> L18
            androidx.window.layout.adapter.extensions.MulticastConsumer r0 = (androidx.window.layout.adapter.extensions.MulticastConsumer) r0     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashMap r2 = r10.e
            if (r0 == 0) goto L1b
            r0.a(r13)     // Catch: java.lang.Throwable -> L18
            r2.put(r13, r11)     // Catch: java.lang.Throwable -> L18
            goto L50
        L18:
            r0 = move-exception
            r10 = r0
            goto L62
        L1b:
            androidx.window.layout.adapter.extensions.MulticastConsumer r4 = new androidx.window.layout.adapter.extensions.MulticastConsumer     // Catch: java.lang.Throwable -> L18
            r4.<init>(r11)     // Catch: java.lang.Throwable -> L18
            r12.put(r11, r4)     // Catch: java.lang.Throwable -> L18
            r2.put(r13, r11)     // Catch: java.lang.Throwable -> L18
            r4.a(r13)     // Catch: java.lang.Throwable -> L18
            boolean r12 = r11 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L18
            if (r12 == 0) goto L54
            e31 r12 = r10.b     // Catch: java.lang.Throwable -> L18
            androidx.window.extensions.layout.WindowLayoutComponent r13 = r10.a     // Catch: java.lang.Throwable -> L18
            java.lang.Class<androidx.window.extensions.layout.WindowLayoutInfo> r0 = androidx.window.extensions.layout.WindowLayoutInfo.class
            ar0 r0 = defpackage.gh5.a(r0)     // Catch: java.lang.Throwable -> L18
            android.app.Activity r11 = (android.app.Activity) r11     // Catch: java.lang.Throwable -> L18
            n82 r2 = new n82     // Catch: java.lang.Throwable -> L18
            java.lang.Class<androidx.window.layout.adapter.extensions.MulticastConsumer> r5 = androidx.window.layout.adapter.extensions.MulticastConsumer.class
            java.lang.String r6 = "accept"
            java.lang.String r7 = "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V"
            r8 = 0
            r9 = 0
            r3 = 1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L18
            d31 r11 = r12.a(r13, r0, r11, r2)     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashMap r10 = r10.f     // Catch: java.lang.Throwable -> L18
            r10.put(r4, r11)     // Catch: java.lang.Throwable -> L18
        L50:
            r1.unlock()
            return
        L54:
            androidx.window.extensions.layout.WindowLayoutInfo r10 = new androidx.window.extensions.layout.WindowLayoutInfo     // Catch: java.lang.Throwable -> L18
            yt1 r11 = defpackage.yt1.A     // Catch: java.lang.Throwable -> L18
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L18
            r4.accept(r10)     // Catch: java.lang.Throwable -> L18
            r1.unlock()
            return
        L62:
            r1.unlock()
            throw r10
    }
}
