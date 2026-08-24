package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sw  reason: default package */
/* loaded from: classes.dex */
public final class sw {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater b = null;
    public volatile int a;

    static {
            java.lang.Class<sw> r0 = defpackage.sw.class
            java.lang.String r1 = "a"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.sw.b = r0
            return
    }

    public final boolean a() {
            r3 = this;
            r0 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.sw.b
            r2 = 0
            boolean r3 = r1.compareAndSet(r3, r2, r0)
            return r3
    }

    public final boolean b() {
            r0 = this;
            int r0 = r0.a
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            boolean r0 = r0.b()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
