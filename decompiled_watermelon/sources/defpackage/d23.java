package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d23  reason: default package */
/* loaded from: classes.dex */
public final class d23 extends yv4 implements Runnable, bc4, View.OnAttachStateChangeListener {
    public final dg7 L;
    public boolean R;
    public boolean X;
    public vf7 Y;

    public d23(dg7 dg7Var) {
        super(!dg7Var.t ? 1 : 0);
        this.L = dg7Var;
    }

    @Override // defpackage.bc4
    public final vf7 G(View view, vf7 vf7Var) {
        this.Y = vf7Var;
        dg7 dg7Var = this.L;
        p67 p67Var = dg7Var.r;
        rf7 rf7Var = vf7Var.a;
        p67Var.f(jg7.b(rf7Var.h(8)));
        if (this.R) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.X) {
            dg7Var.s.f(jg7.b(rf7Var.h(8)));
            dg7.b(dg7Var, vf7Var);
        }
        if (dg7Var.t) {
            return vf7.b;
        }
        return vf7Var;
    }

    @Override // defpackage.yv4
    public final void i0(ze7 ze7Var) {
        this.R = false;
        this.X = false;
        vf7 vf7Var = this.Y;
        if (ze7Var.a.b() > 0 && vf7Var != null) {
            rf7 rf7Var = vf7Var.a;
            dg7 dg7Var = this.L;
            dg7Var.s.f(jg7.b(rf7Var.h(8)));
            dg7Var.r.f(jg7.b(rf7Var.h(8)));
            dg7.b(dg7Var, vf7Var);
        }
        this.Y = null;
    }

    @Override // defpackage.yv4
    public final void j0(ze7 ze7Var) {
        this.R = true;
        this.X = true;
    }

    @Override // defpackage.yv4
    public final vf7 k0(vf7 vf7Var, List list) {
        dg7 dg7Var = this.L;
        dg7.b(dg7Var, vf7Var);
        if (dg7Var.t) {
            return vf7.b;
        }
        return vf7Var;
    }

    @Override // defpackage.yv4
    public final wv6 l0(ze7 ze7Var, wv6 wv6Var) {
        this.R = false;
        return wv6Var;
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
            vf7 vf7Var = this.Y;
            if (vf7Var != null) {
                dg7 dg7Var = this.L;
                dg7Var.s.f(jg7.b(vf7Var.a.h(8)));
                dg7.b(dg7Var, vf7Var);
                this.Y = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
