package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z44  reason: default package */
/* loaded from: classes.dex */
public final class z44 extends ax3 implements n44 {
    public static final Method z0;
    public os0 y0;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                z0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.n44
    public final void D(i44 i44Var, o44 o44Var) {
        os0 os0Var = this.y0;
        if (os0Var != null) {
            os0Var.D(i44Var, o44Var);
        }
    }

    @Override // defpackage.n44
    public final void o(i44 i44Var, MenuItem menuItem) {
        os0 os0Var = this.y0;
        if (os0Var != null) {
            os0Var.o(i44Var, menuItem);
        }
    }

    @Override // defpackage.ax3
    public final mp1 p(Context context, boolean z) {
        y44 y44Var = new y44(context, z);
        y44Var.setHoverListener(this);
        return y44Var;
    }
}
