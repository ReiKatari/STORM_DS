package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gx3  reason: default package */
/* loaded from: classes.dex */
public class gx3 {
    public final Context a;
    public final uw3 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public lx3 h;
    public ex3 i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final fx3 k = new fx3(this);

    public gx3(Context context, uw3 uw3Var, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = uw3Var;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final ex3 a() {
        ex3 od6Var;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int min = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (min >= dimensionPixelSize) {
                od6Var = new yi0(context2, this.e, this.d, this.c);
            } else {
                od6Var = new od6(context2, this.b, this.e, this.d, this.c);
            }
            od6Var.l(this.b);
            od6Var.r(this.k);
            od6Var.n(this.e);
            od6Var.d(this.h);
            od6Var.o(this.g);
            od6Var.p(this.f);
            this.i = od6Var;
        }
        return this.i;
    }

    public final boolean b() {
        ex3 ex3Var = this.i;
        if (ex3Var != null && ex3Var.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        ex3 a = a();
        a.s(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f, this.e.getLayoutDirection()) & 7) == 5) {
                i -= this.e.getWidth();
            }
            a.q(i);
            a.t(i2);
            int i3 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.A = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a.c();
    }
}
