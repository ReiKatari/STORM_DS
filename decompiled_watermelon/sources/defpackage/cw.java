package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cw  reason: default package */
/* loaded from: classes.dex */
public final class cw {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(cw.class, "a");
    public volatile int a;

    public final int a() {
        return b.decrementAndGet(this);
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
