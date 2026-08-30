package l1;

import a6.i2;
import android.os.Build;
import android.view.View;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m0 extends pd.g implements Runnable, a6.v, View.OnAttachStateChangeListener {
    public final c2 L;
    public boolean R;
    public boolean X;
    public i2 Y;

    public m0(c2 c2Var) {
        super(!c2Var.f8537t ? 1 : 0);
        this.L = c2Var;
    }

    @Override // pd.g
    public final void a(a6.p1 p1Var) {
        this.R = false;
        this.X = false;
        i2 i2Var = this.Y;
        if (p1Var.f502a.b() > 0 && i2Var != null) {
            a6.d2 d2Var = i2Var.f479a;
            c2 c2Var = this.L;
            c2Var.f8536s.f(c.z(d2Var.f(8)));
            c2Var.f8535r.f(c.z(d2Var.f(8)));
            c2.b(c2Var, i2Var);
        }
        this.Y = null;
    }

    @Override // pd.g
    public final void b(a6.p1 p1Var) {
        this.R = true;
        this.X = true;
    }

    @Override // pd.g
    public final i2 c(i2 i2Var, List list) {
        c2 c2Var = this.L;
        c2.b(c2Var, i2Var);
        if (c2Var.f8537t) {
            return i2.f478b;
        }
        return i2Var;
    }

    @Override // pd.g
    public final a0.g d(a6.p1 p1Var, a0.g gVar) {
        this.R = false;
        return gVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.R) {
            this.R = false;
            this.X = false;
            i2 i2Var = this.Y;
            if (i2Var != null) {
                c2 c2Var = this.L;
                c2Var.f8536s.f(c.z(i2Var.f479a.f(8)));
                c2.b(c2Var, i2Var);
                this.Y = null;
            }
        }
    }

    @Override // a6.v
    public final i2 s(View view, i2 i2Var) {
        this.Y = i2Var;
        c2 c2Var = this.L;
        y1 y1Var = c2Var.f8535r;
        a6.d2 d2Var = i2Var.f479a;
        y1Var.f(c.z(d2Var.f(8)));
        if (this.R) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.X) {
            c2Var.f8536s.f(c.z(d2Var.f(8)));
            c2.b(c2Var, i2Var);
        }
        if (c2Var.f8537t) {
            return i2.f478b;
        }
        return i2Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
