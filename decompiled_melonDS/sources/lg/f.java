package lg;

import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import java.util.ArrayList;
import jg.u;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.Cheat;
import oe.q;
import yb.y;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ u B;

    public /* synthetic */ f(u uVar, int i2) {
        this.A = i2;
        this.B = uVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.lang.Iterable] */
    @Override // mc.l
    public final Object k(Object obj) {
        q qVar;
        switch (this.A) {
            case 0:
                Cheat cheat = (Cheat) obj;
                cheat.getClass();
                this.B.e(cheat);
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                oe.c cVar = (oe.c) obj;
                cVar.getClass();
                u uVar = this.B;
                uVar.getClass();
                uVar.f7877c.c(aj.g.v(cVar), "selected_folder");
                uVar.f7889p.a(new kg.j(cVar.f10917b));
                break;
            case 2:
                String str = (String) obj;
                str.getClass();
                u uVar2 = this.B;
                uVar2.getClass();
                if (!vc.h.j0(str)) {
                    fg.c cVar2 = (fg.c) uVar2.f7877c.a("selected_game");
                    if (cVar2 != null) {
                        qVar = cVar2.a();
                    } else {
                        qVar = null;
                    }
                    x.v(s0.h(uVar2), null, null, new a9.d(qVar, uVar2, str, (cc.c) null, 16), 3);
                }
                return y.f14813a;
            case 3:
                oe.f fVar = (oe.f) obj;
                fVar.getClass();
                this.B.e(fVar.f10927a);
                break;
            default:
                q qVar2 = (q) obj;
                qVar2.getClass();
                u uVar3 = this.B;
                uVar3.getClass();
                p0 p0Var = uVar3.f7877c;
                Long l10 = qVar2.f10950a;
                String str2 = qVar2.f10951b;
                String str3 = qVar2.f10952c;
                String str4 = qVar2.f10953d;
                ?? r22 = qVar2.f10954e;
                ArrayList arrayList = new ArrayList(zb.m.G(r22, 10));
                for (oe.c cVar3 : r22) {
                    arrayList.add(aj.g.v(cVar3));
                }
                p0Var.c(new fg.c(l10, str2, str3, str4, arrayList), "selected_game");
                uVar3.f7887n.a(new kg.j(qVar2.f10951b));
                break;
        }
        return y.f14813a;
    }
}
