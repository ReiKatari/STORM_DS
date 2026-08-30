package bh;

import q.q3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends ec.c {
    public long R;
    public boolean X;
    public ze.a Y;
    public xe.c Z;

    /* renamed from: b0  reason: collision with root package name */
    public String f2268b0;

    /* renamed from: c0  reason: collision with root package name */
    public wc.b f2269c0;

    /* renamed from: d0  reason: collision with root package name */
    public /* synthetic */ Object f2270d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ q3 f2271e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f2272f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(q3 q3Var, ec.c cVar) {
        super(cVar);
        this.f2271e0 = q3Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.f2270d0 = obj;
        this.f2272f0 |= Integer.MIN_VALUE;
        return this.f2271e0.d(0L, false, this);
    }
}
