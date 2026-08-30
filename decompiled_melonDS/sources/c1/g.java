package c1;

import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends nc.l implements mc.l {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i2, Object obj) {
        super(1);
        this.B = i2;
        this.L = obj;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        boolean z10;
        switch (this.B) {
            case 0:
                return Boolean.valueOf(nc.k.a(obj, this.L));
            case DSiCameraSource.FrontCamera /* 1 */:
                y3.h1 h1Var = (y3.h1) obj;
                ArrayList arrayList = (ArrayList) this.L;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    y3.h1.k(h1Var, (y3.i1) arrayList.get(i2), 0, 0);
                }
                return yb.y.f14813a;
            case 2:
                d1.l1 l1Var = (d1.l1) obj;
                return ((i0) this.L).f2442f;
            case 3:
                d1.o oVar = (d1.o) obj;
                float f8 = oVar.f3621b;
                float f10 = 0.0f;
                if (f8 < 0.0f) {
                    f8 = 0.0f;
                }
                float f11 = 1.0f;
                if (f8 > 1.0f) {
                    f8 = 1.0f;
                }
                float f12 = oVar.f3622c;
                float f13 = -0.5f;
                if (f12 < -0.5f) {
                    f12 = -0.5f;
                }
                float f14 = 0.5f;
                if (f12 > 0.5f) {
                    f12 = 0.5f;
                }
                float f15 = oVar.f3623d;
                if (f15 >= -0.5f) {
                    f13 = f15;
                }
                if (f13 <= 0.5f) {
                    f14 = f13;
                }
                float f16 = oVar.f3620a;
                if (f16 >= 0.0f) {
                    f10 = f16;
                }
                if (f10 <= 1.0f) {
                    f11 = f10;
                }
                return new i3.s(i3.s.a(i3.z.b(f8, f12, f14, f11, j3.d.f7371x), (j3.c) this.L));
            case 4:
                k3.d dVar = (k3.d) obj;
                ((a4.r0) this.L).a();
                return yb.y.f14813a;
            default:
                q1 q1Var = (q1) obj;
                if (((p1) this.L).f2500g.contains(q1Var) && q1Var.h()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }
}
