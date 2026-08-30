package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: go1  reason: default package */
/* loaded from: classes.dex */
public final class go1 extends l07 {
    public final /* synthetic */ ho1 n;

    public go1(ho1 ho1Var) {
        this.n = ho1Var;
    }

    @Override // defpackage.l07
    public final void i0(Throwable th) {
        this.n.a.f(th);
    }

    @Override // defpackage.l07
    public final void j0(q9 q9Var) {
        Set<int[]> y;
        ho1 ho1Var = this.n;
        ho1Var.c = q9Var;
        q9 q9Var2 = ho1Var.c;
        mo1 mo1Var = ho1Var.a;
        jo1 jo1Var = mo1Var.g;
        ea1 ea1Var = mo1Var.i;
        if (Build.VERSION.SDK_INT >= 34) {
            y = ro1.a();
        } else {
            y = dk7.y();
        }
        ho1Var.b = new os(q9Var2, jo1Var, ea1Var, y);
        mo1 mo1Var2 = ho1Var.a;
        ArrayList arrayList = new ArrayList();
        mo1Var2.a.writeLock().lock();
        try {
            mo1Var2.c = 1;
            arrayList.addAll(mo1Var2.b);
            mo1Var2.b.clear();
            mo1Var2.a.writeLock().unlock();
            mo1Var2.d.post(new m90(arrayList, mo1Var2.c, (Throwable) null));
        } catch (Throwable th) {
            mo1Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
