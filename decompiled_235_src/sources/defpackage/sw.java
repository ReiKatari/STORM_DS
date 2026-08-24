package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sw  reason: default package */
/* loaded from: classes.dex */
public final class sw {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(sw.class, "a");
    public volatile int a;

    public final boolean a() {
        return b.compareAndSet(this, 0, 1);
    }

    public final boolean b() {
        if (this.a != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return String.valueOf(b());
    }
}
