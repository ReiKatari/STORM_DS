package vj;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends v8.e {

    /* renamed from: g  reason: collision with root package name */
    public final String f13855g;

    /* renamed from: h  reason: collision with root package name */
    public final String f13856h;

    public m(String str, String str2) {
        this.f13855g = str;
        this.f13856h = str2;
    }

    @Override // v8.e
    public final void a(b9.e eVar) {
        eVar.M(this);
    }

    @Override // v8.e
    public final String i() {
        return "destination=" + this.f13855g + ", title=" + this.f13856h;
    }
}
