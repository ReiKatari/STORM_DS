package defpackage;

import android.view.MenuItem;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iu6  reason: default package */
/* loaded from: classes.dex */
public final class iu6 implements MenuItem.OnMenuItemClickListener {
    public static final Class[] R = {MenuItem.class};
    public final /* synthetic */ int A = 0;
    public Object B;
    public Object L;

    public iu6(s44 s44Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.L = s44Var;
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
                return ((MenuItem.OnMenuItemClickListener) this.B).onMenuItemClick(((s44) this.L).h(menuItem));
        }
    }

    public /* synthetic */ iu6() {
    }
}
