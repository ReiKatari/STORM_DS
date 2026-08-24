package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v44  reason: default package */
/* loaded from: classes.dex */
public class v44 {
    public final Context a;
    public final i44 b;
    public final boolean c;
    public final int d;
    public View e;
    public boolean g;
    public a54 h;
    public t44 i;
    public PopupWindow.OnDismissListener j;
    public int f = 8388611;
    public final u44 k = new u44(this);

    public v44(Context context, i44 i44Var, View view, boolean z, int i, int i2) {
        this.a = context;
        this.b = i44Var;
        this.e = view;
        this.c = z;
        this.d = i;
    }

    public final t44 a() {
        t44 ep6Var;
        if (this.i == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int min = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.a;
            if (min >= dimensionPixelSize) {
                ep6Var = new gl0(context2, this.e, this.d, this.c);
            } else {
                ep6Var = new ep6(context2, this.b, this.e, this.d, this.c);
            }
            ep6Var.l(this.b);
            ep6Var.r(this.k);
            ep6Var.n(this.e);
            ep6Var.g(this.h);
            ep6Var.o(this.g);
            ep6Var.p(this.f);
            this.i = ep6Var;
        }
        return this.i;
    }

    public final boolean b() {
        t44 t44Var = this.i;
        if (t44Var != null && t44Var.a()) {
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
        t44 a = a();
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
        a.e();
    }
}
