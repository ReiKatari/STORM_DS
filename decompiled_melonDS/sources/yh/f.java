package yh;

import java.util.UUID;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends ec.c {
    public af.a R;
    public af.f X;
    public af.h Y;
    public UUID Z;

    /* renamed from: b0  reason: collision with root package name */
    public /* synthetic */ Object f14831b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ g f14832c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f14833d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, ec.c cVar) {
        super(cVar);
        this.f14832c0 = gVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.f14831b0 = obj;
        this.f14833d0 |= Integer.MIN_VALUE;
        return this.f14832c0.a(null, this);
    }
}
