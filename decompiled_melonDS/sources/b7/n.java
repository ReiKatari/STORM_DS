package b7;

import a1.m0;
import java.util.Map;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.g0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n implements g0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2093a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2094b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2095c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f2096d;

    public n(z2.p pVar, Object obj, c1.v vVar) {
        this.f2093a = 1;
        this.f2094b = pVar;
        this.f2095c = obj;
        this.f2096d = vVar;
    }

    @Override // n2.g0
    public final void dispose() {
        switch (this.f2093a) {
            case 0:
                a7.i iVar = (a7.i) this.f2096d;
                ((r) this.f2095c).b().c(iVar);
                ((z2.p) this.f2094b).remove(iVar);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                Object obj = this.f2095c;
                ((z2.p) this.f2094b).remove(obj);
                ((c1.v) this.f2096d).f2535d.k(obj);
                return;
            case 2:
                ((androidx.lifecycle.x) this.f2095c).getLifecycle().c((u6.a) this.f2096d);
                e.e eVar = (e.e) ((nc.t) this.f2094b).A;
                if (eVar != null) {
                    eVar.a();
                    return;
                }
                return;
            default:
                y2.e eVar2 = (y2.e) this.f2095c;
                m0 m0Var = eVar2.B;
                Object obj2 = this.f2096d;
                Object k10 = m0Var.k(obj2);
                y2.i iVar2 = (y2.i) this.f2094b;
                if (k10 == iVar2) {
                    Map map = eVar2.A;
                    Map c4 = iVar2.c();
                    if (c4.isEmpty()) {
                        map.remove(obj2);
                        return;
                    } else {
                        map.put(obj2, c4);
                        return;
                    }
                }
                return;
        }
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i2) {
        this.f2093a = i2;
        this.f2095c = obj;
        this.f2096d = obj2;
        this.f2094b = obj3;
    }
}
