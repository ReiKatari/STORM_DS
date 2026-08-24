package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cd  reason: default package */
/* loaded from: classes.dex */
public final class cd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cd(Object obj, int i) {
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
                dd ddVar = (dd) obj;
                bd bdVar = ddVar.n;
                rs4 rs4Var = ddVar.j;
                if (Float.isNaN(rs4Var.h())) {
                    h = 0.0f;
                } else {
                    h = rs4Var.h();
                }
                float f3 = h + f;
                Collection values = ddVar.d().a.values();
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
                Collection values2 = ddVar.d().a.values();
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
                float p = gi2.p(f3, f2, f5);
                dd ddVar2 = bdVar.a;
                ddVar2.j.i(p);
                ddVar2.k.i(RecyclerView.B1);
                return;
            default:
                ((qj6) obj).A.g(Float.valueOf(f));
                return;
        }
    }
}
