package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wh6  reason: default package */
/* loaded from: classes.dex */
public final class wh6 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int A;
    public final Object B;
    public final Object L;

    public wh6(xh6 xh6Var, Activity activity) {
        this.A = 0;
        xh6Var.getClass();
        this.B = xh6Var;
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
                    ((xh6) obj2).c(iBinder, activity);
                    return;
                }
                return;
            case 1:
                ((ViewGroup) obj2).addView((fx6) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                p0 p0Var = (p0) obj2;
                hu3 B = bl2.B(p0Var);
                if (B != null) {
                    ((dh5) obj).A = ii2.o(p0Var, B.getLifecycle());
                    p0Var.removeOnAttachStateChangeListener(this);
                    return;
                }
                p53.d("View tree for " + p0Var + " has no ViewTreeLifecycleOwner");
                e41.c();
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
                ((ViewGroup) obj2).addView((fx6) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                return;
            default:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                ((if5) obj).x();
                return;
        }
    }

    public /* synthetic */ wh6(View view, Object obj, int i) {
        this.A = i;
        this.B = view;
        this.L = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
