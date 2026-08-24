package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rs1  reason: default package */
/* loaded from: classes.dex */
public final class rs1 extends hv {
    public final /* synthetic */ ss1 p;

    public rs1(ss1 ss1Var) {
        this.p = ss1Var;
    }

    @Override // defpackage.hv
    public final void O(Throwable th) {
        this.p.a.f(th);
    }

    @Override // defpackage.hv
    public final void P(eb ebVar) {
        Set<int[]> O;
        ss1 ss1Var = this.p;
        ss1Var.c = ebVar;
        eb ebVar2 = ss1Var.c;
        ws1 ws1Var = ss1Var.a;
        x31 x31Var = ws1Var.g;
        ae1 ae1Var = ws1Var.i;
        if (Build.VERSION.SDK_INT >= 34) {
            O = bt1.a();
        } else {
            O = nc1.O();
        }
        ss1Var.b = new bt(ebVar2, x31Var, ae1Var, O);
        ws1 ws1Var2 = ss1Var.a;
        ArrayList arrayList = new ArrayList();
        ws1Var2.a.writeLock().lock();
        try {
            ws1Var2.c = 1;
            arrayList.addAll(ws1Var2.b);
            ws1Var2.b.clear();
            ws1Var2.a.writeLock().unlock();
            ws1Var2.d.post(new ub0(arrayList, ws1Var2.c, (Throwable) null));
        } catch (Throwable th) {
            ws1Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
