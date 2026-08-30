package qf;

import b9.h;
import g9.f;
import g9.g;
import kf.a0;
import kf.g1;
import m9.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12512a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f12513b;

    public /* synthetic */ b(int i2, Object obj) {
        this.f12512a = i2;
        this.f12513b = obj;
    }

    @Override // g9.f
    public final g a(Object obj, n nVar, h hVar) {
        switch (this.f12512a) {
            case 0:
                nVar.getClass();
                return new c((a0) this.f12513b, (oe.a) obj, nVar);
            default:
                nVar.getClass();
                return new c((g1) this.f12513b, nVar, (ze.a) obj);
        }
    }
}
