package g2;

import android.view.KeyEvent;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m4 implements mc.l {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ sc.a B;
    public final /* synthetic */ n2.w0 L;
    public final /* synthetic */ float R;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ n2.w0 Y;

    public m4(boolean z10, sc.a aVar, n2.w0 w0Var, float f8, boolean z11, n2.w0 w0Var2) {
        this.A = z10;
        this.B = aVar;
        this.L = w0Var;
        this.R = f8;
        this.X = z11;
        this.Y = w0Var2;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        KeyEvent keyEvent = ((t3.b) obj).f13107a;
        sc.a aVar = this.B;
        float f8 = aVar.f12864b;
        if (!this.A) {
            return Boolean.FALSE;
        }
        int c4 = t3.c.c(keyEvent);
        boolean z10 = false;
        if (c4 == 2) {
            float f10 = aVar.f12863a;
            float abs = Math.abs(f8 - f10) / 100;
            long a10 = t3.c.a(keyEvent.getKeyCode());
            boolean a11 = t3.a.a(a10, t3.a.f13085d);
            float f11 = this.R;
            n2.w0 w0Var = this.L;
            if (a11) {
                ((mc.l) w0Var.getValue()).k(p7.j.i(Float.valueOf(f11 + abs), aVar));
            } else if (t3.a.a(a10, t3.a.f13086e)) {
                ((mc.l) w0Var.getValue()).k(p7.j.i(Float.valueOf(f11 - abs), aVar));
            } else {
                boolean a12 = t3.a.a(a10, t3.a.f13088g);
                int i2 = -1;
                boolean z11 = this.X;
                if (a12) {
                    if (!z11) {
                        i2 = 1;
                    }
                    ((mc.l) w0Var.getValue()).k(p7.j.i(Float.valueOf((i2 * abs) + f11), aVar));
                } else if (t3.a.a(a10, t3.a.f13087f)) {
                    if (!z11) {
                        i2 = 1;
                    }
                    ((mc.l) w0Var.getValue()).k(p7.j.i(Float.valueOf(f11 - (i2 * abs)), aVar));
                } else if (t3.a.a(a10, t3.a.f13104x)) {
                    ((mc.l) w0Var.getValue()).k(Float.valueOf(f10));
                } else if (t3.a.a(a10, t3.a.f13105y)) {
                    ((mc.l) w0Var.getValue()).k(Float.valueOf(f8));
                } else if (t3.a.a(a10, t3.a.F)) {
                    ((mc.l) w0Var.getValue()).k(p7.j.i(Float.valueOf(f11 - (p7.j.g(10, 1, 10) * abs)), aVar));
                } else {
                    if (t3.a.a(a10, t3.a.G)) {
                        ((mc.l) w0Var.getValue()).k(p7.j.i(Float.valueOf((p7.j.g(10, 1, 10) * abs) + f11), aVar));
                    }
                    return Boolean.valueOf(z10);
                }
            }
            z10 = true;
            return Boolean.valueOf(z10);
        }
        if (c4 == 1) {
            long a13 = t3.c.a(keyEvent.getKeyCode());
            if (t3.a.a(a13, t3.a.f13085d) || t3.a.a(a13, t3.a.f13086e) || t3.a.a(a13, t3.a.f13088g) || t3.a.a(a13, t3.a.f13087f) || t3.a.a(a13, t3.a.f13104x) || t3.a.a(a13, t3.a.f13105y) || t3.a.a(a13, t3.a.F) || t3.a.a(a13, t3.a.G)) {
                mc.a aVar2 = (mc.a) this.Y.getValue();
                if (aVar2 != null) {
                    aVar2.b();
                }
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }
}
