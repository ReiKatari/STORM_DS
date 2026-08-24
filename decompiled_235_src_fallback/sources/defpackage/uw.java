package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uw  reason: default package */
/* loaded from: classes.dex */
public final class uw {
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater b = null;
    public volatile int a;

    static {
            java.lang.Class<uw> r0 = defpackage.uw.class
            java.lang.String r1 = "a"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            defpackage.uw.b = r0
            return
    }

    public final int a() {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.uw.b
            int r1 = r0.decrementAndGet(r1)
            return r1
    }

    public final java.lang.String toString() {
            r0 = this;
            int r0 = r0.a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
