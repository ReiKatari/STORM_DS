package defpackage;

import android.view.MenuItem;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oi6  reason: default package */
/* loaded from: classes.dex */
public final class oi6 implements MenuItem.OnMenuItemClickListener {
    public static final Class[] R = {MenuItem.class};
    public final /* synthetic */ int A = 0;
    public Object B;
    public Object L;

    public oi6(dx3 dx3Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.L = dx3Var;
        this.B = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.A) {
            case 0:
                Object obj = this.B;
                Method method = (Method) this.L;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    }
                    method.invoke(obj, menuItem);
                    return true;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.B).onMenuItemClick(((dx3) this.L).h(menuItem));
        }
    }

    public /* synthetic */ oi6() {
    }
}
