package h9;

import d0.i1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends ec.c {
    public g R;
    public i1 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ g Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f6361b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, ec.c cVar) {
        super(cVar);
        this.Z = gVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Y = obj;
        this.f6361b0 |= Integer.MIN_VALUE;
        return this.Z.d(null, this);
    }
}
