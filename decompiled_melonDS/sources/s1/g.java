package s1;

import android.os.Build;
import android.view.autofill.AutofillValue;
import c3.m;
import f1.y;
import i4.t;
import i4.v;
import i4.w;
import i4.x;
import mh.z;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends y {
    public k4.a H0;

    @Override // f1.g
    public final void R0(x xVar) {
        boolean z10;
        c3.g gVar;
        AutofillValue forToggle;
        v.g(xVar, this.H0);
        w wVar = t.f6797r;
        tc.c[] cVarArr = v.f6808a;
        tc.c cVar = cVarArr[9];
        xVar.a(wVar, m.f2566b);
        if (this.H0 != k4.a.Indeterminate) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            forToggle = AutofillValue.forToggle(z10);
            gVar = new c3.g(forToggle);
        } else {
            gVar = null;
        }
        if (gVar != null) {
            w wVar2 = t.f6798s;
            tc.c cVar2 = cVarArr[10];
            xVar.a(wVar2, gVar);
        }
        v.b(xVar, new z(19, xVar));
    }
}
