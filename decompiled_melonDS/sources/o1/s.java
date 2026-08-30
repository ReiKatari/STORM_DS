package o1;

import f1.f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s extends ec.c {
    public f1 R;
    public ec.j X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ t Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f10587b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, cc.c cVar) {
        super(cVar);
        this.Z = tVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Y = obj;
        this.f10587b0 |= Integer.MIN_VALUE;
        return this.Z.c(null, null, this);
    }
}
