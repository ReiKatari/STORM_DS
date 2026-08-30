package ai;

import java.util.List;
import java.util.UUID;
import l1.d1;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ mc.l L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ yb.d Y;
    public final /* synthetic */ yb.d Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f850b0;

    public /* synthetic */ o0(b3.p pVar, ze.a aVar, g3.z zVar, mc.a aVar2, mc.a aVar3, q1.a0 a0Var, mc.l lVar) {
        this.A = 0;
        this.B = pVar;
        this.R = aVar;
        this.X = zVar;
        this.Y = aVar2;
        this.Z = aVar3;
        this.f850b0 = a0Var;
        this.L = lVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        switch (this.A) {
            case 0:
                b3.p pVar = (b3.p) this.B;
                ze.a aVar = (ze.a) this.R;
                g3.z zVar = (g3.z) this.X;
                mc.a aVar2 = (mc.a) this.Y;
                mc.a aVar3 = (mc.a) this.Z;
                q1.a0 a0Var = (q1.a0) this.f850b0;
                n2.m mVar = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    g2.n0.h(pVar, null, 0L, 0L, 4, v2.h.c(370830353, new d0(aVar, zVar, aVar2, aVar3, a0Var, this.L), rVar), rVar, 1769472, 30);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((Integer) obj2).getClass();
                lg.j.a((b3.p) this.B, (d1) this.R, (kg.h) this.X, this.L, (mc.l) this.Y, (mc.p) this.Z, (mc.l) this.f850b0, (n2.m) obj, n2.s.F(7));
                break;
            case 2:
                ((Integer) obj2).getClass();
                lg.j.f((b3.p) this.B, (d1) this.R, (List) this.X, this.L, (mc.l) this.Y, (mc.p) this.Z, (mc.l) this.f850b0, (n2.m) obj, n2.s.F(7));
                break;
            default:
                ((Integer) obj2).getClass();
                p7.j.c((UUID) this.B, (ve.a) this.R, (mc.p) this.X, (mc.a) this.Y, this.L, (mc.a) this.Z, (mc.a) this.f850b0, (n2.m) obj, n2.s.F(1));
                break;
        }
        return yb.y.f14813a;
    }

    public /* synthetic */ o0(b3.p pVar, d1 d1Var, Object obj, mc.l lVar, mc.l lVar2, mc.p pVar2, mc.l lVar3, int i2, int i10) {
        this.A = i10;
        this.B = pVar;
        this.R = d1Var;
        this.X = obj;
        this.L = lVar;
        this.Y = lVar2;
        this.Z = pVar2;
        this.f850b0 = lVar3;
    }

    public /* synthetic */ o0(UUID uuid, ve.a aVar, mc.p pVar, mc.a aVar2, mc.l lVar, mc.a aVar3, mc.a aVar4, int i2) {
        this.A = 3;
        this.B = uuid;
        this.R = aVar;
        this.X = pVar;
        this.Y = aVar2;
        this.L = lVar;
        this.Z = aVar3;
        this.f850b0 = aVar4;
    }
}
