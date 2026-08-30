package kf;

import android.net.Uri;
import me.magnum.melonds.domain.model.DSiWareTitle;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends ec.c {
    public DSiWareTitle R;
    public re.a X;
    public Uri Y;
    public id.c Z;

    /* renamed from: b0  reason: collision with root package name */
    public /* synthetic */ Object f8138b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ g f8139c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f8140d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, ec.c cVar) {
        super(cVar);
        this.f8139c0 = gVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.f8138b0 = obj;
        this.f8140d0 |= Integer.MIN_VALUE;
        return this.f8139c0.c(null, null, null, this);
    }
}
