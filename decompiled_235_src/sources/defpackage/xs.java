package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xs  reason: default package */
/* loaded from: classes.dex */
public final class xs implements View.OnClickListener {
    public final View A;
    public final String B;
    public Method L;
    public Context R;

    public xs(View view, String str) {
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
                    StringBuilder t = i61.t("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    t.append(view2.getClass());
                    t.append(str);
                    throw new IllegalStateException(t.toString());
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
