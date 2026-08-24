package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zh6  reason: default package */
/* loaded from: classes.dex */
public final class zh6 implements defpackage.gt7 {
    public static volatile defpackage.zh6 c;
    public static final java.util.concurrent.locks.ReentrantLock d = null;
    public final defpackage.e82 a;
    public final java.util.concurrent.CopyOnWriteArrayList b;

    static {
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            defpackage.zh6.d = r0
            return
    }

    public zh6(defpackage.xh6 r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.b = r0
            if (r2 == 0) goto L16
            s35 r0 = new s35
            r0.<init>(r1)
            r2.d(r0)
        L16:
            return
    }

    @Override // defpackage.gt7
    public final void a(defpackage.b31 r7) {
            r6 = this;
            java.util.concurrent.locks.ReentrantLock r0 = defpackage.zh6.d
            monitor-enter(r0)
            e82 r1 = r6.a     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L9
            monitor-exit(r0)
            return
        L9:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2b
            r1.<init>()     // Catch: java.lang.Throwable -> L2b
            java.util.concurrent.CopyOnWriteArrayList r2 = r6.b     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2b
            r2.getClass()     // Catch: java.lang.Throwable -> L2b
        L17:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2b
            yh6 r3 = (defpackage.yh6) r3     // Catch: java.lang.Throwable -> L2b
            b31 r4 = r3.c     // Catch: java.lang.Throwable -> L2b
            if (r4 != r7) goto L17
            r1.add(r3)     // Catch: java.lang.Throwable -> L2b
            goto L17
        L2b:
            r6 = move-exception
            goto L73
        L2d:
            java.util.concurrent.CopyOnWriteArrayList r7 = r6.b     // Catch: java.lang.Throwable -> L2b
            r7.removeAll(r1)     // Catch: java.lang.Throwable -> L2b
            int r7 = r1.size()     // Catch: java.lang.Throwable -> L2b
            r2 = 0
        L37:
            if (r2 >= r7) goto L71
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L2b
            int r2 = r2 + 1
            yh6 r3 = (defpackage.yh6) r3     // Catch: java.lang.Throwable -> L2b
            android.app.Activity r3 = r3.a     // Catch: java.lang.Throwable -> L2b
            java.util.concurrent.CopyOnWriteArrayList r4 = r6.b     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L4e
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L4e
            goto L67
        L4e:
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L2b
        L52:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L67
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L2b
            yh6 r5 = (defpackage.yh6) r5     // Catch: java.lang.Throwable -> L2b
            android.app.Activity r5 = r5.a     // Catch: java.lang.Throwable -> L2b
            boolean r5 = r5.equals(r3)     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L52
            goto L37
        L67:
            e82 r4 = r6.a     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L37
            xh6 r4 = (defpackage.xh6) r4     // Catch: java.lang.Throwable -> L2b
            r4.b(r3)     // Catch: java.lang.Throwable -> L2b
            goto L37
        L71:
            monitor-exit(r0)
            return
        L73:
            monitor-exit(r0)
            throw r6
    }

    @Override // defpackage.gt7
    public final void b(android.content.Context r7, java.util.concurrent.Executor r8, defpackage.b31 r9) {
            r6 = this;
            boolean r0 = r7 instanceof android.app.Activity
            r1 = 0
            if (r0 == 0) goto L8
            android.app.Activity r7 = (android.app.Activity) r7
            goto L9
        L8:
            r7 = r1
        L9:
            yt1 r0 = defpackage.yt1.A
            if (r7 == 0) goto Lb3
            java.util.concurrent.locks.ReentrantLock r2 = defpackage.zh6.d
            r2.lock()
            e82 r3 = r6.a     // Catch: java.lang.Throwable -> L22
            if (r3 != 0) goto L25
            kv7 r6 = new kv7     // Catch: java.lang.Throwable -> L22
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L22
            r9.accept(r6)     // Catch: java.lang.Throwable -> L22
            r2.unlock()
            return
        L22:
            r6 = move-exception
            goto Laf
        L25:
            java.util.concurrent.CopyOnWriteArrayList r6 = r6.b
            r0 = 0
            if (r6 == 0) goto L31
            boolean r4 = r6.isEmpty()     // Catch: java.lang.Throwable -> L22
            if (r4 == 0) goto L31
            goto L4a
        L31:
            java.util.Iterator r4 = r6.iterator()     // Catch: java.lang.Throwable -> L22
        L35:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r5 == 0) goto L4a
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L22
            yh6 r5 = (defpackage.yh6) r5     // Catch: java.lang.Throwable -> L22
            android.app.Activity r5 = r5.a     // Catch: java.lang.Throwable -> L22
            boolean r5 = r5.equals(r7)     // Catch: java.lang.Throwable -> L22
            if (r5 == 0) goto L35
            r0 = 1
        L4a:
            yh6 r4 = new yh6     // Catch: java.lang.Throwable -> L22
            r4.<init>(r7, r8, r9)     // Catch: java.lang.Throwable -> L22
            r6.add(r4)     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L7b
            xh6 r3 = (defpackage.xh6) r3     // Catch: java.lang.Throwable -> L22
            android.view.Window r6 = r7.getWindow()     // Catch: java.lang.Throwable -> L22
            if (r6 == 0) goto L64
            android.view.WindowManager$LayoutParams r6 = r6.getAttributes()     // Catch: java.lang.Throwable -> L22
            if (r6 == 0) goto L64
            android.os.IBinder r1 = r6.token     // Catch: java.lang.Throwable -> L22
        L64:
            if (r1 == 0) goto L6a
            r3.c(r1, r7)     // Catch: java.lang.Throwable -> L22
            goto Lab
        L6a:
            wh6 r6 = new wh6     // Catch: java.lang.Throwable -> L22
            r6.<init>(r3, r7)     // Catch: java.lang.Throwable -> L22
            android.view.Window r7 = r7.getWindow()     // Catch: java.lang.Throwable -> L22
            android.view.View r7 = r7.getDecorView()     // Catch: java.lang.Throwable -> L22
            r7.addOnAttachStateChangeListener(r6)     // Catch: java.lang.Throwable -> L22
            goto Lab
        L7b:
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L22
        L7f:
            boolean r8 = r6.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r8 == 0) goto L95
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L22
            r9 = r8
            yh6 r9 = (defpackage.yh6) r9     // Catch: java.lang.Throwable -> L22
            android.app.Activity r9 = r9.a     // Catch: java.lang.Throwable -> L22
            boolean r9 = r7.equals(r9)     // Catch: java.lang.Throwable -> L22
            if (r9 == 0) goto L7f
            goto L96
        L95:
            r8 = r1
        L96:
            yh6 r8 = (defpackage.yh6) r8     // Catch: java.lang.Throwable -> L22
            if (r8 == 0) goto L9c
            kv7 r1 = r8.d     // Catch: java.lang.Throwable -> L22
        L9c:
            if (r1 == 0) goto Lab
            r4.d = r1     // Catch: java.lang.Throwable -> L22
            java.util.concurrent.Executor r6 = r4.b     // Catch: java.lang.Throwable -> L22
            q64 r7 = new q64     // Catch: java.lang.Throwable -> L22
            r8 = 6
            r7.<init>(r8, r4, r1)     // Catch: java.lang.Throwable -> L22
            r6.execute(r7)     // Catch: java.lang.Throwable -> L22
        Lab:
            r2.unlock()
            return
        Laf:
            r2.unlock()
            throw r6
        Lb3:
            kv7 r6 = new kv7
            r6.<init>(r0)
            r9.accept(r6)
            return
    }
}
