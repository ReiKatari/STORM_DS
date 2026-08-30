package b7;

import java.util.List;
import java.util.UUID;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ mc.l Y;
    public final /* synthetic */ mc.l Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ mc.l f2104b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ mc.l f2105c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ int f2106d0;

    public /* synthetic */ w(List list, UUID uuid, mc.l lVar, mc.a aVar, mc.l lVar2, mc.l lVar3, mc.l lVar4, mc.a aVar2, int i2) {
        this.A = 3;
        this.B = list;
        this.L = uuid;
        this.Y = lVar;
        this.R = aVar;
        this.Z = lVar2;
        this.f2104b0 = lVar3;
        this.f2105c0 = lVar4;
        this.X = aVar2;
        this.f2106d0 = i2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                a.a.d((a7.d0) this.B, (a7.z) this.L, (b3.p) this.R, (b3.d) this.X, this.Y, this.Z, this.f2104b0, this.f2105c0, (n2.m) obj, n2.s.F(this.f2106d0 | 1));
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((Integer) obj2).getClass();
                a.a.d((a7.d0) this.B, (a7.z) this.L, (b3.p) this.R, (b3.d) this.X, this.Y, this.Z, this.f2104b0, this.f2105c0, (n2.m) obj, n2.s.F(this.f2106d0 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                a.a.d((a7.d0) this.B, (a7.z) this.L, (b3.p) this.R, (b3.d) this.X, this.Y, this.Z, this.f2104b0, this.f2105c0, (n2.m) obj, n2.s.F(this.f2106d0 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int F = n2.s.F(this.f2106d0 | 1);
                mc.l lVar = this.Y;
                mc.l lVar2 = this.Z;
                mc.l lVar3 = this.f2104b0;
                mc.l lVar4 = this.f2105c0;
                wh.a.c((List) this.B, (UUID) this.L, lVar, (mc.a) this.R, lVar2, lVar3, lVar4, (mc.a) this.X, (n2.m) obj, F);
                break;
        }
        return yb.y.f14813a;
    }

    public /* synthetic */ w(a7.d0 d0Var, a7.z zVar, b3.p pVar, b3.d dVar, mc.l lVar, mc.l lVar2, mc.l lVar3, mc.l lVar4, int i2, int i10) {
        this.A = i10;
        this.B = d0Var;
        this.L = zVar;
        this.R = pVar;
        this.X = dVar;
        this.Y = lVar;
        this.Z = lVar2;
        this.f2104b0 = lVar3;
        this.f2105c0 = lVar4;
        this.f2106d0 = i2;
    }
}
