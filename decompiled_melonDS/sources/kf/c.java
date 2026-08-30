package kf;

import android.net.Uri;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends ec.c {
    public Uri R;
    public id.a X;
    public int Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ g f8170b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f8171c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, ec.c cVar) {
        super(cVar);
        this.f8170b0 = gVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Z = obj;
        this.f8171c0 |= Integer.MIN_VALUE;
        return this.f8170b0.d(null, this);
    }
}
