package df;

import b9.e;
import oe.e0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends ec.c {
    public ze.a R;
    public e0 X;
    public long Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ e f4053b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f4054c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, ec.c cVar) {
        super(cVar);
        this.f4053b0 = eVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Z = obj;
        this.f4054c0 |= Integer.MIN_VALUE;
        return this.f4053b0.k(null, this);
    }
}
