package g2;

import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5255a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5256b;

    public /* synthetic */ m(int i2, Object obj) {
        this.f5255a = i2;
        this.f5256b = obj;
    }

    public final void a(float f8) {
        float g10;
        Float valueOf;
        float f10;
        switch (this.f5255a) {
            case 0:
                n nVar = (n) this.f5256b;
                k kVar = nVar.f5275n;
                n2.b1 b1Var = nVar.f5272j;
                if (Float.isNaN(b1Var.g())) {
                    g10 = 0.0f;
                } else {
                    g10 = b1Var.g();
                }
                float f11 = g10 + f8;
                Collection values = nVar.d().f5159a.values();
                values.getClass();
                Iterator it = values.iterator();
                Float f12 = null;
                if (!it.hasNext()) {
                    valueOf = null;
                } else {
                    float floatValue = ((Number) it.next()).floatValue();
                    while (it.hasNext()) {
                        floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
                    }
                    valueOf = Float.valueOf(floatValue);
                }
                float f13 = Float.NaN;
                if (valueOf != null) {
                    f10 = valueOf.floatValue();
                } else {
                    f10 = Float.NaN;
                }
                Collection values2 = nVar.d().f5159a.values();
                values2.getClass();
                Iterator it2 = values2.iterator();
                if (it2.hasNext()) {
                    float floatValue2 = ((Number) it2.next()).floatValue();
                    while (it2.hasNext()) {
                        floatValue2 = Math.max(floatValue2, ((Number) it2.next()).floatValue());
                    }
                    f12 = Float.valueOf(floatValue2);
                }
                if (f12 != null) {
                    f13 = f12.floatValue();
                }
                float f14 = p7.j.f(f11, f10, f13);
                n nVar2 = kVar.f5209a;
                nVar2.f5272j.h(f14);
                nVar2.f5273k.h(0.0f);
                return;
            default:
                ((x3) this.f5256b).A.k(Float.valueOf(f8));
                return;
        }
    }
}
