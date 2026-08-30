package ai;

import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ n2.w0 B;

    public /* synthetic */ s(n2.w0 w0Var, int i2) {
        this.A = i2;
        this.B = w0Var;
    }

    @Override // mc.a
    public final Object b() {
        String str;
        boolean z10;
        a7.x xVar;
        String str2;
        switch (this.A) {
            case 0:
                n2.w0 w0Var = this.B;
                w0Var.setValue(Boolean.valueOf(!((Boolean) w0Var.getValue()).booleanValue()));
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B.setValue(Boolean.TRUE);
                return yb.y.f14813a;
            case 2:
                this.B.setValue(Boolean.FALSE);
                return yb.y.f14813a;
            case 3:
                this.B.setValue(Boolean.TRUE);
                return yb.y.f14813a;
            case 4:
                this.B.setValue(Boolean.FALSE);
                return yb.y.f14813a;
            case l1.c.f8511g /* 5 */:
                y3.z zVar = (y3.z) this.B.getValue();
                if (zVar == null) {
                    k1.b.d("Required value was null.");
                    wa.b.a();
                    return null;
                }
                return zVar;
            case l1.c.f8509e /* 6 */:
                this.B.setValue(Boolean.TRUE);
                return yb.y.f14813a;
            case 7:
                this.B.setValue(Boolean.FALSE);
                return yb.y.f14813a;
            case 8:
                n2.w0 w0Var2 = this.B;
                w0Var2.setValue(Boolean.valueOf(!((Boolean) w0Var2.getValue()).booleanValue()));
                return yb.y.f14813a;
            case l1.c.f8508d /* 9 */:
                this.B.setValue(kg.c.f8293b);
                return yb.y.f14813a;
            case l1.c.f8510f /* 10 */:
                this.B.setValue(kg.b.f8292b);
                return yb.y.f14813a;
            case 11:
                a7.i iVar = (a7.i) this.B.getValue();
                if (iVar != null && (xVar = iVar.B) != null && (str2 = (String) xVar.B.f252e) != null) {
                    str = vc.h.y0(str2);
                } else {
                    str = null;
                }
                if (!nc.k.a(str, jg.k.Companion.serializer().e().b()) && !nc.k.a(str, jg.h.Companion.serializer().e().b())) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 12:
                return new n1.i((mc.l) this.B.getValue());
            case 13:
                this.B.setValue(Boolean.TRUE);
                return yb.y.f14813a;
            case 14:
                this.B.setValue(Boolean.FALSE);
                return yb.y.f14813a;
            case l1.c.f8512h /* 15 */:
                return new o1.g((mc.l) this.B.getValue());
            case 16:
                n2.w0 w0Var3 = this.B;
                Object value = w0Var3.getValue();
                og.g gVar = og.g.COLLAPSED;
                if (value == gVar) {
                    gVar = og.g.EXPANDED;
                }
                w0Var3.setValue(gVar);
                return yb.y.f14813a;
            case 17:
                return (p1.z) ((mc.a) this.B.getValue()).b();
            case 18:
                this.B.setValue(Boolean.FALSE);
                return yb.y.f14813a;
            case 19:
                this.B.setValue(Boolean.FALSE);
                return yb.y.f14813a;
            case 20:
                n2.w0 w0Var4 = this.B;
                if (w0Var4 != null) {
                    return (List) w0Var4.getValue();
                }
                return null;
            case 21:
                Boolean bool = (Boolean) this.B.getValue();
                bool.booleanValue();
                return bool;
            case 22:
                this.B.setValue(Boolean.FALSE);
                return yb.y.f14813a;
            case 23:
                this.B.setValue(Boolean.TRUE);
                return yb.y.f14813a;
            case 24:
                this.B.setValue(Boolean.TRUE);
                return yb.y.f14813a;
            case 25:
                this.B.setValue(Boolean.FALSE);
                return yb.y.f14813a;
            case 26:
                y3.z zVar2 = (y3.z) this.B.getValue();
                if (zVar2 == null) {
                    k1.b.d("Required value was null.");
                    wa.b.a();
                    return null;
                }
                return zVar2;
            case 27:
                y3.z zVar3 = (y3.z) this.B.getValue();
                if (zVar3 == null) {
                    k1.b.d("Required value was null.");
                    wa.b.a();
                    return null;
                }
                return zVar3;
            case 28:
                this.B.setValue(yg.a.MAIN);
                return yb.y.f14813a;
            default:
                this.B.setValue(Boolean.FALSE);
                return yb.y.f14813a;
        }
    }
}
