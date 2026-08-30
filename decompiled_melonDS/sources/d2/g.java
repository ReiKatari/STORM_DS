package d2;

import i4.x;
import java.util.List;
import l4.i0;
import l4.q0;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.f1;
import p1.a0;
import q4.d0;
import u1.k1;
import u1.p0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ h B;

    public /* synthetic */ g(h hVar, x xVar) {
        this.A = 3;
        this.B = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mc.l
    public final Object k(Object obj) {
        boolean isText;
        int i2 = this.A;
        CharSequence charSequence = null;
        boolean z10 = false;
        h hVar = this.B;
        switch (i2) {
            case 0:
                c3.g gVar = (c3.g) obj;
                f1 f1Var = hVar.f3734m0.f13397t;
                Boolean bool = Boolean.TRUE;
                f1Var.setValue(bool);
                hVar.f3734m0.f13396s.setValue(bool);
                p0 p0Var = hVar.f3734m0;
                isText = gVar.f2562a.isText();
                if (isText) {
                    charSequence = gVar.f2562a.getTextValue();
                }
                charSequence.getClass();
                h.R0(p0Var, (String) charSequence, hVar.f3735n0);
                return bool;
            case DSiCameraSource.FrontCamera /* 1 */:
                List list = (List) obj;
                if (hVar.f3734m0.d() != null) {
                    k1 d4 = hVar.f3734m0.d();
                    d4.getClass();
                    list.add(d4.f13358a);
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 2:
                h.R0(hVar.f3734m0, ((l4.h) obj).B, hVar.f3735n0);
                return Boolean.TRUE;
            default:
                l4.h hVar2 = (l4.h) obj;
                if (hVar.f3735n0) {
                    d0 d0Var = hVar.f3734m0.f13383e;
                    if (d0Var != null) {
                        List y10 = p7.t.y(new Object(), new q4.a(hVar2, 1));
                        p0 p0Var2 = hVar.f3734m0;
                        a0 a0Var = p0Var2.f13382d;
                        u1.s sVar = p0Var2.f13399v;
                        q4.x q10 = a0Var.q(y10);
                        d0Var.a(null, q10);
                        sVar.k(q10);
                    } else {
                        q4.x xVar = hVar.f3733l0;
                        String str = xVar.f12276a.B;
                        long j2 = xVar.f12277b;
                        int i10 = q0.f8884c;
                        String obj2 = vc.h.s0(str, (int) (j2 >> 32), (int) (j2 & 4294967295L), hVar2).toString();
                        int length = hVar2.B.length() + ((int) (hVar.f3733l0.f12277b >> 32));
                        hVar.f3734m0.f13399v.k(new q4.x(obj2, 4, i0.b(length, length)));
                    }
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }

    public /* synthetic */ g(h hVar, int i2) {
        this.A = i2;
        this.B = hVar;
    }
}
