package ai;

import g2.p5;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ n2.w0 B;

    public /* synthetic */ o(n2.w0 w0Var, int i2) {
        this.A = i2;
        this.B = w0Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        l4.h hVar;
        switch (this.A) {
            case 0:
                String str = (String) obj;
                str.getClass();
                this.B.setValue(str);
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                String str2 = (String) obj;
                str2.getClass();
                this.B.setValue(str2);
                return yb.y.f14813a;
            case 2:
                this.B.setValue((y3.z) obj);
                return yb.y.f14813a;
            case 3:
                k3.d dVar = (k3.d) obj;
                long j2 = ((i3.s) this.B.getValue()).f6689a;
                float v10 = dVar.v(p5.f5347a);
                float v11 = dVar.v(p5.f5348b);
                float f8 = v11 / 2;
                long floatToRawIntBits = (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.S() & 4294967295L))) & 4294967295L);
                float f10 = v10 - f8;
                float intBitsToFloat = Float.intBitsToFloat((int) (dVar.S() & 4294967295L));
                k3.d.p(dVar, j2, floatToRawIntBits, (Float.floatToRawIntBits(f10) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat)), v11, 1, 480);
                return yb.y.f14813a;
            case 4:
                Float f11 = (Float) obj;
                f11.getClass();
                return Float.valueOf(((Number) ((mc.l) this.B.getValue()).k(f11)).floatValue());
            case l1.c.f8511g /* 5 */:
                this.B.setValue(Integer.valueOf((int) (((x4.l) obj).f14346a & 4294967295L)));
                return yb.y.f14813a;
            case l1.c.f8509e /* 6 */:
                int intValue = ((Integer) obj).intValue();
                this.B.setValue((ve.d) ((fc.b) ve.d.getEntries()).get(intValue));
                return yb.y.f14813a;
            case 7:
                this.B.setValue(Boolean.valueOf(!((Boolean) obj).booleanValue()));
                return yb.y.f14813a;
            case 8:
                String str3 = (String) obj;
                str3.getClass();
                if (!vc.h.j0(str3)) {
                    this.B.setValue(str3);
                }
                return yb.y.f14813a;
            case l1.c.f8508d /* 9 */:
                e2.h hVar2 = (e2.h) obj;
                if (hVar2.f4210c) {
                    hVar = hVar2.f4209b;
                } else {
                    hVar = hVar2.f4208a;
                }
                this.B.setValue(hVar);
                return yb.y.f14813a;
            case l1.c.f8510f /* 10 */:
                List list = (List) obj;
                n2.w0 w0Var = this.B;
                if (w0Var != null) {
                    w0Var.setValue(list);
                }
                return yb.y.f14813a;
            case 11:
                ((mc.l) this.B.getValue()).k((h3.b) obj);
                return yb.y.f14813a;
            case 12:
                this.B.setValue((y3.z) obj);
                return yb.y.f14813a;
            case 13:
                this.B.setValue((y3.z) obj);
                return yb.y.f14813a;
            default:
                yg.a aVar = (yg.a) obj;
                aVar.getClass();
                this.B.setValue(aVar);
                return yb.y.f14813a;
        }
    }
}
