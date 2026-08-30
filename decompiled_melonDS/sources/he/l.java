package he;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends ec.c {
    public n R;
    public ArrayList X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ n Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f6476b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, ec.c cVar) {
        super(cVar);
        this.Z = nVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Y = obj;
        this.f6476b0 |= Integer.MIN_VALUE;
        return n.B(this.Z, null, this);
    }
}
