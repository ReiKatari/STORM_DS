package l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8418a;

    /* renamed from: b  reason: collision with root package name */
    public long f8419b;

    public long a() {
        if (this.f8418a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.f8419b - System.nanoTime());
    }
}
