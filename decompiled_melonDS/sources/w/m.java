package w;

import j0.j2;
import j0.l2;
import j0.w1;
import java.util.LinkedHashMap;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ x B;
    public final /* synthetic */ String L;
    public final /* synthetic */ w1 R;
    public final /* synthetic */ l2 X;
    public final /* synthetic */ j0.k Y;
    public final /* synthetic */ List Z;

    public /* synthetic */ m(x xVar, String str, w1 w1Var, l2 l2Var, j0.k kVar, List list, int i2) {
        this.A = i2;
        this.B = xVar;
        this.L = str;
        this.R = w1Var;
        this.X = l2Var;
        this.Y = kVar;
        this.Z = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                x xVar = this.B;
                String str = this.L;
                w1 w1Var = this.R;
                l2 l2Var = this.X;
                j0.k kVar = this.Y;
                List list = this.Z;
                xVar.v("Use case " + str + " RESET", null);
                xVar.A.B(str, w1Var, l2Var, kVar, list);
                xVar.r();
                xVar.E();
                xVar.L();
                if (xVar.X == u.OPENED) {
                    xVar.D();
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                x xVar2 = this.B;
                String str2 = this.L;
                w1 w1Var2 = this.R;
                l2 l2Var2 = this.X;
                j0.k kVar2 = this.Y;
                List list2 = this.Z;
                xVar2.v("Use case " + str2 + " UPDATED", null);
                xVar2.A.B(str2, w1Var2, l2Var2, kVar2, list2);
                xVar2.L();
                return;
            default:
                x xVar3 = this.B;
                String str3 = this.L;
                w1 w1Var3 = this.R;
                l2 l2Var3 = this.X;
                j0.k kVar3 = this.Y;
                List list3 = this.Z;
                xVar3.v("Use case " + str3 + " ACTIVE", null);
                LinkedHashMap linkedHashMap = (LinkedHashMap) xVar3.A.L;
                j2 j2Var = (j2) linkedHashMap.get(str3);
                if (j2Var == null) {
                    j2Var = new j2(w1Var3, l2Var3, kVar3, list3);
                    linkedHashMap.put(str3, j2Var);
                }
                j2Var.f7233f = true;
                xVar3.A.B(str3, w1Var3, l2Var3, kVar3, list3);
                xVar3.L();
                return;
        }
    }
}
