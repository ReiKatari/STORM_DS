package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ew  reason: default package */
/* loaded from: classes.dex */
public final class ew {
    public static final AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(ew.class, "a");
    public volatile long a;

    public final String toString() {
        return String.valueOf(this.a);
    }
}
