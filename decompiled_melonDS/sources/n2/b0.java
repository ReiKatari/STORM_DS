package n2;

import g2.v3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 extends n1 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9875b = 1;

    /* renamed from: c  reason: collision with root package name */
    public final Object f9876c;

    public b0(mc.l lVar) {
        super(new v3(27));
        this.f9876c = new c0(lVar);
    }

    @Override // n2.n1
    public final o1 a(Object obj) {
        boolean z10;
        boolean z11;
        switch (this.f9875b) {
            case 0:
                if (obj == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return new o1(this, obj, z10, null, true);
            default:
                if (obj == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return new o1(this, obj, z11, (e) this.f9876c, true);
        }
    }

    @Override // n2.n1
    public v2 b() {
        switch (this.f9875b) {
            case 0:
                return (c0) this.f9876c;
            default:
                return super.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(mc.a aVar) {
        super(aVar);
        e eVar = e.Z;
        this.f9876c = eVar;
    }
}
