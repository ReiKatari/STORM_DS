package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i66  reason: default package */
/* loaded from: classes.dex */
public final class i66 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int A;
    public final Object B;
    public final Object L;

    public i66(j66 j66Var, Activity activity) {
        this.A = 0;
        j66Var.getClass();
        this.B = j66Var;
        this.L = new WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        IBinder iBinder;
        Window window;
        WindowManager.LayoutParams attributes;
        int i = this.A;
        Object obj = this.L;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                view.getClass();
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) obj).get();
                if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                } else {
                    iBinder = null;
                }
                if (activity != null && iBinder != null) {
                    ((j66) obj2).c(iBinder, activity);
                    return;
                }
                return;
            case 1:
                ((ViewGroup) obj2).addView((jl6) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                o0 o0Var = (o0) obj2;
                fn3 u = jk2.u(o0Var);
                if (u != null) {
                    ((n75) obj).A = ve2.h(o0Var, u.getLifecycle());
                    o0Var.removeOnAttachStateChangeListener(this);
                    return;
                }
                mz2.d("View tree for " + o0Var + " has no ViewTreeLifecycleOwner");
                f81.c();
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.A;
        Object obj = this.L;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                view.getClass();
                return;
            case 1:
                ((ViewGroup) obj2).addView((jl6) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                return;
            default:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                ((s55) obj).x();
                return;
        }
    }

    public /* synthetic */ i66(View view, Object obj, int i) {
        this.A = i;
        this.B = view;
        this.L = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
