package ug;

import android.view.KeyEvent;
import mc.l;
import n2.b1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements l {
    public final /* synthetic */ float A;
    public final /* synthetic */ sc.a B;
    public final /* synthetic */ b1 L;

    public d(float f8, sc.a aVar, b1 b1Var) {
        this.A = f8;
        this.B = aVar;
        this.L = b1Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        KeyEvent keyEvent = ((t3.b) obj).f13107a;
        keyEvent.getClass();
        boolean z10 = false;
        if (t3.c.c(keyEvent) == 2) {
            long a10 = t3.c.a(keyEvent.getKeyCode());
            boolean a11 = t3.a.a(a10, t3.a.f13091j);
            sc.a aVar = this.B;
            float f8 = this.A;
            b1 b1Var = this.L;
            if (!a11 && !t3.a.a(a10, t3.a.f13087f)) {
                if (t3.a.a(a10, t3.a.f13090i) || t3.a.a(a10, t3.a.f13088g)) {
                    float g10 = b1Var.g() + f8;
                    float f10 = aVar.f12864b;
                    if (g10 > f10) {
                        g10 = f10;
                    }
                    b1Var.h(g10);
                }
            } else {
                float g11 = b1Var.g() - f8;
                float f11 = aVar.f12863a;
                if (g11 < f11) {
                    g11 = f11;
                }
                b1Var.h(g11);
            }
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
