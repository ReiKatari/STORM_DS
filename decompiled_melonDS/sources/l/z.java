package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z implements View.OnClickListener {
    public final View A;
    public final String B;
    public Method L;
    public Context R;

    public z(View view, String str) {
        this.A = view;
        this.B = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id2;
        String str;
        Method method;
        if (this.L == null) {
            View view2 = this.A;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.B;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.L = method;
                            this.R = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                } else {
                    if (view2.getId() == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                    }
                    StringBuilder u4 = w.d.u("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    u4.append(view2.getClass());
                    u4.append(str);
                    throw new IllegalStateException(u4.toString());
                }
            }
        }
        try {
            this.L.invoke(this.R, view);
        } catch (IllegalAccessException e6) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e6);
        } catch (InvocationTargetException e10) {
            throw new IllegalStateException("Could not execute method for android:onClick", e10);
        }
    }
}
