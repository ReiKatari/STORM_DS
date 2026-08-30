package p;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11164a;

    /* renamed from: b  reason: collision with root package name */
    public final l f11165b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11166c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11167d;

    /* renamed from: e  reason: collision with root package name */
    public View f11168e;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11170g;

    /* renamed from: h  reason: collision with root package name */
    public w f11171h;

    /* renamed from: i  reason: collision with root package name */
    public t f11172i;

    /* renamed from: j  reason: collision with root package name */
    public PopupWindow.OnDismissListener f11173j;

    /* renamed from: f  reason: collision with root package name */
    public int f11169f = 8388611;

    /* renamed from: k  reason: collision with root package name */
    public final u f11174k = new u(this);

    public v(Context context, l lVar, View view, boolean z10, int i2, int i10) {
        this.f11164a = context;
        this.f11165b = lVar;
        this.f11168e = view;
        this.f11166c = z10;
        this.f11167d = i2;
    }

    public final t a() {
        t c0Var;
        if (this.f11172i == null) {
            Context context = this.f11164a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int min = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.f11164a;
            if (min >= dimensionPixelSize) {
                c0Var = new f(context2, this.f11168e, this.f11167d, this.f11166c);
            } else {
                c0Var = new c0(context2, this.f11165b, this.f11168e, this.f11167d, this.f11166c);
            }
            c0Var.l(this.f11165b);
            c0Var.r(this.f11174k);
            c0Var.n(this.f11168e);
            c0Var.j(this.f11171h);
            c0Var.o(this.f11170g);
            c0Var.p(this.f11169f);
            this.f11172i = c0Var;
        }
        return this.f11172i;
    }

    public final boolean b() {
        t tVar = this.f11172i;
        if (tVar != null && tVar.b()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f11172i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f11173j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i2, int i10, boolean z10, boolean z11) {
        t a10 = a();
        a10.s(z11);
        if (z10) {
            if ((Gravity.getAbsoluteGravity(this.f11169f, this.f11168e.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f11168e.getWidth();
            }
            a10.q(i2);
            a10.t(i10);
            int i11 = (int) ((this.f11164a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a10.A = new Rect(i2 - i11, i10 - i11, i2 + i11, i10 + i11);
        }
        a10.c();
    }
}
