package g2;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class o3 implements mc.p {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ yb.d Y;
    public final /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f5320b0;

    public /* synthetic */ o3(int i2, mc.p pVar, v2.c cVar, v2.c cVar2, mc.p pVar2, l1.b2 b2Var, mc.p pVar3, int i10) {
        this.B = i2;
        this.L = pVar;
        this.Y = cVar;
        this.Z = cVar2;
        this.R = pVar2;
        this.f5320b0 = b2Var;
        this.X = pVar3;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int F = n2.s.F(24577);
                r3.c(this.B, (mc.p) this.L, (v2.c) this.Y, (v2.c) this.Z, (mc.p) this.R, (l1.b2) this.f5320b0, (mc.p) this.X, (n2.m) obj, F);
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((Integer) obj2).getClass();
                ig.m.e((hg.l) this.L, (c1.y1) this.R, (c1.p) this.X, (mc.l) this.Y, (mc.l) this.Z, (mc.a) this.f5320b0, (n2.m) obj, n2.s.F(this.B | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((v2.c) this.Y).a(this.L, (Boolean) this.R, this.X, this.Z, this.f5320b0, (n2.m) obj, n2.s.F(this.B) | 1);
                break;
        }
        return yb.y.f14813a;
    }

    public /* synthetic */ o3(hg.l lVar, c1.y1 y1Var, c1.p pVar, mc.l lVar2, mc.l lVar3, mc.a aVar, int i2) {
        this.L = lVar;
        this.R = y1Var;
        this.X = pVar;
        this.Y = lVar2;
        this.Z = lVar3;
        this.f5320b0 = aVar;
        this.B = i2;
    }

    public /* synthetic */ o3(v2.c cVar, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i2) {
        this.Y = cVar;
        this.L = obj;
        this.R = bool;
        this.X = obj2;
        this.Z = obj3;
        this.f5320b0 = obj4;
        this.B = i2;
    }
}
