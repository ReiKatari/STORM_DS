package a7;

import a4.p2;
import a4.q2;
import android.os.Bundle;
import java.util.List;
import p1.j1;
import p1.o0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ nc.t B;

    public /* synthetic */ b0(nc.t tVar, int i2) {
        this.A = i2;
        this.B = tVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        boolean z10;
        switch (this.A) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Object obj2 = this.B.A;
                if (obj2 == null || !((Bundle) obj2).containsKey(str)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                q2 q2Var = (q2) obj;
                q2Var.getClass();
                o0 o0Var = ((j1) q2Var).f11226i0;
                nc.t tVar = this.B;
                List list = (List) tVar.A;
                if (list != null) {
                    list.add(o0Var);
                } else {
                    list = p7.t.A(o0Var);
                }
                tVar.A = list;
                return p2.SkipSubtreeAndContinueTraversal;
        }
    }
}
