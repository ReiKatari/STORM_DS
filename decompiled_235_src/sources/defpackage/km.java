package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: km  reason: default package */
/* loaded from: classes.dex */
public final class km extends TextPaint {
    public aj a;
    public b17 b;
    public int c;
    public ge6 d;
    public kt0 e;
    public f80 f;
    public ii1 g;
    public xi6 h;
    public oo1 i;

    public final aj a() {
        aj ajVar = this.a;
        if (ajVar != null) {
            return ajVar;
        }
        aj ajVar2 = new aj(this);
        this.a = ajVar2;
        return ajVar2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().k(i);
        this.c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
        if (r1 == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(f80 f80Var, long j, float f) {
        Shader shader;
        boolean b;
        if (f80Var == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
        } else if (f80Var instanceof cn6) {
            d(oi2.N(f, ((cn6) f80Var).a));
        } else if (f80Var instanceof xd6) {
            if (nb3.k(this.f, f80Var)) {
                xi6 xi6Var = this.h;
                if (xi6Var == null) {
                    b = false;
                } else {
                    b = xi6.b(xi6Var.a, j);
                }
            }
            if (j != 9205357640488583168L) {
                this.f = f80Var;
                this.h = new xi6(j);
                this.g = np2.I(new jm(f80Var, j, 0));
            }
            aj a = a();
            ii1 ii1Var = this.g;
            if (ii1Var != null) {
                shader = (Shader) ii1Var.getValue();
            } else {
                shader = null;
            }
            a.p(shader);
            this.e = null;
            g04.Q(this, f);
        } else {
            i.d();
        }
    }

    public final void d(long j) {
        boolean d;
        kt0 kt0Var = this.e;
        if (kt0Var == null) {
            d = false;
        } else {
            d = kt0.d(kt0Var.a, j);
        }
        if (!d && j != 16) {
            this.e = new kt0(j);
            setColor(hv.b0(j));
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
        }
    }

    public final void e(oo1 oo1Var) {
        if (oo1Var != null && !nb3.k(this.i, oo1Var)) {
            this.i = oo1Var;
            if (oo1Var.equals(kc2.a)) {
                setStyle(Paint.Style.FILL);
            } else if (oo1Var instanceof ys6) {
                a().t(1);
                ys6 ys6Var = (ys6) oo1Var;
                a().s(ys6Var.a);
                aj a = a();
                ((Paint) a.L).setStrokeMiter(ys6Var.b);
                a().r(ys6Var.d);
                a().q(ys6Var.c);
                a().o(null);
            } else {
                i.d();
            }
        }
    }

    public final void f(ge6 ge6Var) {
        if (ge6Var != null && !nb3.k(this.d, ge6Var)) {
            this.d = ge6Var;
            if (ge6Var.equals(ge6.d)) {
                clearShadowLayer();
                return;
            }
            ge6 ge6Var2 = this.d;
            float f = ge6Var2.c;
            if (f == RecyclerView.B1) {
                f = Float.MIN_VALUE;
            }
            setShadowLayer(f, Float.intBitsToFloat((int) (ge6Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), hv.b0(this.d.a));
        }
    }

    public final void g(b17 b17Var) {
        boolean z;
        if (b17Var != null && !nb3.k(this.b, b17Var)) {
            this.b = b17Var;
            int i = b17Var.a;
            boolean z2 = false;
            if ((i | 1) == i) {
                z = true;
            } else {
                z = false;
            }
            setUnderlineText(z);
            int i2 = this.b.a;
            if ((i2 | 2) == i2) {
                z2 = true;
            }
            setStrikeThruText(z2);
        }
    }
}
