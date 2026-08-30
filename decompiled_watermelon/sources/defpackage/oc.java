package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oc  reason: default package */
/* loaded from: classes.dex */
public final class oc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(float f) {
        float h;
        Float valueOf;
        float f2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                pc pcVar = (pc) obj;
                nc ncVar = pcVar.n;
                pj4 pj4Var = pcVar.j;
                if (Float.isNaN(pj4Var.h())) {
                    h = 0.0f;
                } else {
                    h = pj4Var.h();
                }
                float f3 = h + f;
                Collection values = pcVar.d().a.values();
                values.getClass();
                Iterator it = values.iterator();
                Float f4 = null;
                if (!it.hasNext()) {
                    valueOf = null;
                } else {
                    float floatValue = ((Number) it.next()).floatValue();
                    while (it.hasNext()) {
                        floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
                    }
                    valueOf = Float.valueOf(floatValue);
                }
                float f5 = Float.NaN;
                if (valueOf != null) {
                    f2 = valueOf.floatValue();
                } else {
                    f2 = Float.NaN;
                }
                Collection values2 = pcVar.d().a.values();
                values2.getClass();
                Iterator it2 = values2.iterator();
                if (it2.hasNext()) {
                    float floatValue2 = ((Number) it2.next()).floatValue();
                    while (it2.hasNext()) {
                        floatValue2 = Math.max(floatValue2, ((Number) it2.next()).floatValue());
                    }
                    f4 = Float.valueOf(floatValue2);
                }
                if (f4 != null) {
                    f5 = f4.floatValue();
                }
                float l = io2.l(f3, f2, f5);
                pc pcVar2 = ncVar.a;
                pcVar2.j.i(l);
                pcVar2.k.i(RecyclerView.A1);
                return;
            default:
                ((b86) obj).A.n(Float.valueOf(f));
                return;
        }
    }
}
