package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: aw  reason: default package */
/* loaded from: classes.dex */
public final class aw {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(aw.class, "a");
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
