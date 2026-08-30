package b7;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.w0;
import u1.v0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f2097b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w0 w0Var, r rVar, z2.p pVar, cc.c cVar) {
        super(2, cVar);
        this.X = 0;
        this.Y = w0Var;
        this.Z = rVar;
        this.f2097b0 = pVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                yb.y yVar = yb.y.f14813a;
                ((p) t(cVar, uVar)).v(yVar);
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((p) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((p) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new p((w0) this.Y, (r) this.Z, (z2.p) this.f2097b0, cVar);
            case DSiCameraSource.FrontCamera /* 1 */:
                p pVar = new p((List) this.Z, (String) this.f2097b0, cVar, 1);
                pVar.Y = obj;
                return pVar;
            default:
                p pVar2 = new p((v3.w) this.Z, (v0) this.f2097b0, cVar, 2);
                pVar2.Y = obj;
                return pVar2;
        }
    }

    @Override // ec.a
    public final Object v(Object obj) {
        int i2 = this.X;
        Object obj2 = this.f2097b0;
        Object obj3 = this.Z;
        switch (i2) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                r rVar = (r) obj3;
                z2.p pVar = (z2.p) obj2;
                for (a7.i iVar : (Set) ((w0) this.Y).getValue()) {
                    if (!((List) rVar.b().f599e.A.getValue()).contains(iVar) && !pVar.contains(iVar)) {
                        rVar.b().c(iVar);
                    }
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                zc.u uVar = (zc.u) this.Y;
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                String str = (String) obj2;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : (List) obj3) {
                    ze.a aVar3 = (ze.a) obj4;
                    if (!zc.x.t(uVar)) {
                        return zb.q.A;
                    }
                    String str2 = aVar3.f15053a;
                    Normalizer.Form form = Normalizer.Form.NFD;
                    String normalize = Normalizer.normalize(str2, form);
                    normalize.getClass();
                    String T = vc.o.T(normalize, "[^\\p{ASCII}]", "");
                    String normalize2 = Normalizer.normalize(aVar3.f15055c, form);
                    normalize2.getClass();
                    String T2 = vc.o.T(normalize2, "[^\\p{ASCII}]", "");
                    if (vc.h.Y(T, str, true) || vc.h.Y(T2, str, true)) {
                        arrayList.add(obj4);
                    }
                }
                return arrayList;
            default:
                dc.a aVar4 = dc.a.COROUTINE_SUSPENDED;
                p7.j.I(obj);
                zc.u uVar2 = (zc.u) this.Y;
                zc.w wVar = zc.w.UNDISPATCHED;
                v3.w wVar2 = (v3.w) obj3;
                v0 v0Var = (v0) obj2;
                zc.x.v(uVar2, null, wVar, new u1.y(wVar2, v0Var, null, 1), 1);
                return zc.x.v(uVar2, null, wVar, new u1.y(wVar2, v0Var, null, 2), 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, Object obj2, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = obj;
        this.f2097b0 = obj2;
    }
}
