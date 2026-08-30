package b4;

import android.content.Context;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q extends nc.l implements mc.l {
    public static final q L = new q(1, 0);
    public static final q R = new q(1, 1);
    public static final q X = new q(1, 2);
    public static final q Y = new q(1, 3);
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i2, int i10) {
        super(i2);
        this.B = i10;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.B) {
            case 0:
                g3.g0 g0Var = (g3.g0) obj;
                return Boolean.TRUE;
            case DSiCameraSource.FrontCamera /* 1 */:
                i4.m k10 = ((i4.p) obj).k();
                return Boolean.valueOf(k10.A.c(i4.t.A));
            case 2:
                v2.g gVar = (v2.g) obj;
                n2.b0 b0Var = r0.f1936a;
                gVar.getClass();
                n2.s.x(gVar, b0Var);
                return ((Context) n2.s.x(gVar, r0.f1937b)).getResources();
            default:
                return Boolean.valueOf(l0.f(obj));
        }
    }
}
