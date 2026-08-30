package kf;

import h1.c3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends ec.c {
    public long R;
    public boolean X;
    public c3 Y;
    public Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public je.f f8234b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f8235c0;

    /* renamed from: d0  reason: collision with root package name */
    public /* synthetic */ Object f8236d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ z f8237e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f8238f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(z zVar, ec.c cVar) {
        super(cVar);
        this.f8237e0 = zVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.f8236d0 = obj;
        this.f8238f0 |= Integer.MIN_VALUE;
        Object c4 = this.f8237e0.c(0L, false, null, this);
        if (c4 == dc.a.COROUTINE_SUSPENDED) {
            return c4;
        }
        return new yb.l(c4);
    }
}
