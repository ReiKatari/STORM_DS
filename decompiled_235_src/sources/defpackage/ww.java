package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ww  reason: default package */
/* loaded from: classes.dex */
public final class ww {
    public static final AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(ww.class, "a");
    public volatile long a;

    public final String toString() {
        return String.valueOf(this.a);
    }
}
