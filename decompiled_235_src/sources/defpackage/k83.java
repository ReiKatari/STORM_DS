package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k83  reason: default package */
/* loaded from: classes.dex */
public final class k83 extends f55 implements Runnable, zk4, View.OnAttachStateChangeListener {
    public final dv7 L;
    public boolean R;
    public boolean X;
    public vu7 Y;

    public k83(dv7 dv7Var) {
        super(!dv7Var.t ? 1 : 0);
        this.L = dv7Var;
    }

    @Override // defpackage.zk4
    public final vu7 U(View view, vu7 vu7Var) {
        this.Y = vu7Var;
        dv7 dv7Var = this.L;
        ok7 ok7Var = dv7Var.r;
        ru7 ru7Var = vu7Var.a;
        ok7Var.f(jv7.b(ru7Var.h(8)));
        if (this.R) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.X) {
            dv7Var.s.f(jv7.b(ru7Var.h(8)));
            dv7.b(dv7Var, vu7Var);
        }
        if (dv7Var.t) {
            return vu7.b;
        }
        return vu7Var;
    }

    @Override // defpackage.f55
    public final void i0(au7 au7Var) {
        this.R = false;
        this.X = false;
        vu7 vu7Var = this.Y;
        if (au7Var.a.b() > 0 && vu7Var != null) {
            ru7 ru7Var = vu7Var.a;
            dv7 dv7Var = this.L;
            dv7Var.s.f(jv7.b(ru7Var.h(8)));
            dv7Var.r.f(jv7.b(ru7Var.h(8)));
            dv7.b(dv7Var, vu7Var);
        }
        this.Y = null;
    }

    @Override // defpackage.f55
    public final void j0(au7 au7Var) {
        this.R = true;
        this.X = true;
    }

    @Override // defpackage.f55
    public final vu7 k0(vu7 vu7Var, List list) {
        dv7 dv7Var = this.L;
        dv7.b(dv7Var, vu7Var);
        if (dv7Var.t) {
            return vu7.b;
        }
        return vu7Var;
    }

    @Override // defpackage.f55
    public final rr6 l0(au7 au7Var, rr6 rr6Var) {
        this.R = false;
        return rr6Var;
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
            vu7 vu7Var = this.Y;
            if (vu7Var != null) {
                dv7 dv7Var = this.L;
                dv7Var.s.f(jv7.b(vu7Var.a.h(8)));
                dv7.b(dv7Var, vu7Var);
                this.Y = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
