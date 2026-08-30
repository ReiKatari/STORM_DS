package q;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i2 extends d2 implements e2 {

    /* renamed from: x0  reason: collision with root package name */
    public static final Method f11909x0;

    /* renamed from: w0  reason: collision with root package name */
    public l.i0 f11910w0;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f11909x0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // q.e2
    public final void n(p.l lVar, MenuItem menuItem) {
        l.i0 i0Var = this.f11910w0;
        if (i0Var != null) {
            i0Var.n(lVar, menuItem);
        }
    }

    @Override // q.e2
    public final void o(p.l lVar, p.n nVar) {
        l.i0 i0Var = this.f11910w0;
        if (i0Var != null) {
            i0Var.o(lVar, nVar);
        }
    }

    @Override // q.d2
    public final r1 q(Context context, boolean z10) {
        h2 h2Var = new h2(context, z10);
        h2Var.setHoverListener(this);
        return h2Var;
    }
}
