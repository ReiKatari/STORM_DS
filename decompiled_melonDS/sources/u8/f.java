package u8;

import p8.v;
import p8.w;
import x8.p;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends b {

    /* renamed from: b  reason: collision with root package name */
    public final int f13509b;

    static {
        v.g("NetworkNotRoamingCtrlr");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(v8.e eVar) {
        super(eVar);
        eVar.getClass();
        this.f13509b = 7;
    }

    @Override // u8.d
    public final boolean c(p pVar) {
        pVar.getClass();
        if (pVar.f14429j.f11471a == w.NOT_ROAMING) {
            return true;
        }
        return false;
    }

    @Override // u8.b
    public final int d() {
        return this.f13509b;
    }

    @Override // u8.b
    public final boolean e(Object obj) {
        t8.e eVar = (t8.e) obj;
        eVar.getClass();
        if (eVar.f13138a && eVar.f13141d && !eVar.f13142e) {
            return false;
        }
        return true;
    }
}
