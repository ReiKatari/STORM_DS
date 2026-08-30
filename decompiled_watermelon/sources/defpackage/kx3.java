package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kx3  reason: default package */
/* loaded from: classes.dex */
public final class kx3 extends yp3 implements yw3 {
    public static final Method y0;
    public bq0 x0;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                y0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.yp3
    public final fl1 o(Context context, boolean z) {
        jx3 jx3Var = new jx3(context, z);
        jx3Var.setHoverListener(this);
        return jx3Var;
    }

    @Override // defpackage.yw3
    public final void v(uw3 uw3Var, MenuItem menuItem) {
        bq0 bq0Var = this.x0;
        if (bq0Var != null) {
            bq0Var.v(uw3Var, menuItem);
        }
    }

    @Override // defpackage.yw3
    public final void y(uw3 uw3Var, zw3 zw3Var) {
        bq0 bq0Var = this.x0;
        if (bq0Var != null) {
            bq0Var.y(uw3Var, zw3Var);
        }
    }
}
