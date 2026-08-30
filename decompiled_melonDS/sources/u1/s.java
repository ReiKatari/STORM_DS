package u1;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ p0 B;

    public /* synthetic */ s(p0 p0Var, int i2) {
        this.A = i2;
        this.B = p0Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        String str;
        switch (this.A) {
            case 0:
                y3.z zVar = (y3.z) obj;
                k1 d4 = this.B.d();
                if (d4 != null) {
                    d4.f13360c = zVar;
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.B.f13394q.setValue(bool);
                return yb.y.f14813a;
            case 2:
                p0 p0Var = this.B;
                n2.f1 f1Var = p0Var.f13397t;
                q4.x xVar = (q4.x) obj;
                String str2 = xVar.f12276a.B;
                l4.h hVar = p0Var.f13388j;
                if (hVar != null) {
                    str = hVar.B;
                } else {
                    str = null;
                }
                if (!nc.k.a(str2, str)) {
                    p0Var.f13389k.setValue(d0.None);
                    if (((Boolean) f1Var.getValue()).booleanValue()) {
                        f1Var.setValue(Boolean.FALSE);
                    } else {
                        p0Var.f13396s.setValue(Boolean.FALSE);
                    }
                }
                long j2 = l4.q0.f8883b;
                p0Var.f(j2);
                p0Var.e(j2);
                p0Var.f13398u.k(xVar);
                n2.p1 p1Var = p0Var.f13380b;
                n2.y yVar = p1Var.f9980a;
                if (yVar != null) {
                    yVar.s(p1Var, null);
                }
                return yb.y.f14813a;
            case 3:
                this.B.f13395r.b(((q4.i) obj).f12248a);
                return yb.y.f14813a;
            default:
                return Boolean.valueOf(this.B.f13395r.b(((q4.i) obj).f12248a));
        }
    }
}
