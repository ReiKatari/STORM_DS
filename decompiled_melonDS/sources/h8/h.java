package h8;

import mc.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends k0.d {

    /* renamed from: e  reason: collision with root package name */
    public final Object f6334e;

    /* renamed from: f  reason: collision with root package name */
    public final i f6335f;

    /* renamed from: g  reason: collision with root package name */
    public final a f6336g;

    public h(Object obj, i iVar, a aVar) {
        obj.getClass();
        iVar.getClass();
        this.f6334e = obj;
        this.f6335f = iVar;
        this.f6336g = aVar;
    }

    @Override // k0.d
    public final k0.d H(String str, l lVar) {
        Object obj = this.f6334e;
        if (((Boolean) lVar.k(obj)).booleanValue()) {
            return this;
        }
        return new g(obj, str, this.f6336g, this.f6335f);
    }

    @Override // k0.d
    public final Object o() {
        return this.f6334e;
    }
}
