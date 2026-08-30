package j7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    public int f7550a;

    /* renamed from: b  reason: collision with root package name */
    public int f7551b;

    /* renamed from: c  reason: collision with root package name */
    public int f7552c;

    /* renamed from: d  reason: collision with root package name */
    public int f7553d;

    /* renamed from: e  reason: collision with root package name */
    public int f7554e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7555f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7556g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f7557h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7558i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7559j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7560k;

    /* renamed from: l  reason: collision with root package name */
    public int f7561l;
    public long m;

    /* renamed from: n  reason: collision with root package name */
    public int f7562n;

    public final void a(int i2) {
        if ((this.f7553d & i2) != 0) {
            return;
        }
        m9.o.j("Layout state should be one of ", Integer.toBinaryString(i2), " but it is ", Integer.toBinaryString(this.f7553d));
    }

    public final int b() {
        if (this.f7556g) {
            return this.f7551b - this.f7552c;
        }
        return this.f7554e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f7550a + ", mData=null, mItemCount=" + this.f7554e + ", mIsMeasuring=" + this.f7558i + ", mPreviousLayoutItemCount=" + this.f7551b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f7552c + ", mStructureChanged=" + this.f7555f + ", mInPreLayout=" + this.f7556g + ", mRunSimpleAnimations=" + this.f7559j + ", mRunPredictiveAnimations=" + this.f7560k + '}';
    }
}
