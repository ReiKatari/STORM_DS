package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ks  reason: default package */
/* loaded from: classes.dex */
public final class ks implements View.OnClickListener {
    public final View A;
    public final String B;
    public Method L;
    public Context R;

    public ks(View view, String str) {
        this.A = view;
        this.B = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id;
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
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder u = b31.u("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    u.append(view2.getClass());
                    u.append(str);
                    throw new IllegalStateException(u.toString());
                }
            }
        }
        try {
            this.L.invoke(this.R, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
