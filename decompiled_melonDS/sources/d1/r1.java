package d1;

import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class r1 implements mc.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ r1(v2.c cVar, Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A = 2;
        this.L = cVar;
        this.X = obj;
        this.Y = obj2;
        this.R = obj3;
        this.Z = obj4;
        this.B = i2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int F = n2.s.F(this.B | 1);
                Object obj3 = this.X;
                Object obj4 = this.Y;
                u1.a((q1) this.L, (n1) this.R, obj3, obj4, (x) this.Z, (n2.m) obj, F);
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((Integer) obj2).getClass();
                ng.b.b((b3.p) this.L, (Cheat) this.R, (mc.a) this.X, (mc.a) this.Y, (mc.a) this.Z, (n2.m) obj, n2.s.F(this.B | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ((v2.c) this.L).e(this.X, this.Y, this.R, this.Z, (n2.m) obj, n2.s.F(this.B) | 1);
                break;
        }
        return yb.y.f14813a;
    }

    public /* synthetic */ r1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2, int i10) {
        this.A = i10;
        this.L = obj;
        this.R = obj2;
        this.X = obj3;
        this.Y = obj4;
        this.Z = obj5;
        this.B = i2;
    }
}
