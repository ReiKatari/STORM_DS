package b7;

import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends a7.y {

    /* renamed from: g  reason: collision with root package name */
    public final i f2091g;

    /* renamed from: h  reason: collision with root package name */
    public final v2.c f2092h;

    public j(i iVar, nc.e eVar, Map map, v2.c cVar) {
        super(iVar, eVar, map);
        this.f2091g = iVar;
        this.f2092h = cVar;
    }

    @Override // a7.y
    public final a7.x a() {
        return (h) super.a();
    }

    @Override // a7.y
    public final a7.x b() {
        return new h(this.f2091g, this.f2092h);
    }
}
