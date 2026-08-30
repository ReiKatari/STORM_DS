package k7;

import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public final long[] f8028b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean[] f8029c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f8030d;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f8032f;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f8027a = new ReentrantLock();

    /* renamed from: e  reason: collision with root package name */
    public final ReentrantLock f8031e = new ReentrantLock();

    public k(int i2) {
        this.f8028b = new long[i2];
        this.f8029c = new boolean[i2];
    }
}
