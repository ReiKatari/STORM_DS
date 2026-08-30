package c8;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v extends u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a1.e f2715a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f2716b;

    public v(w wVar, a1.e eVar) {
        this.f2716b = wVar;
        this.f2715a = eVar;
    }

    @Override // c8.u, c8.r
    public final void a(t tVar) {
        ((ArrayList) this.f2715a.get(this.f2716b.B)).remove(tVar);
        tVar.D(this);
    }
}
