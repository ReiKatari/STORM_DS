package b4;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w2 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int A;
    public final Object B;
    public final Object L;

    public w2(m8.j jVar, Activity activity) {
        this.A = 2;
        jVar.getClass();
        this.B = jVar;
        this.L = new WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        IBinder iBinder;
        Window window;
        WindowManager.LayoutParams attributes;
        switch (this.A) {
            case 0:
                a aVar = (a) this.B;
                androidx.lifecycle.x d4 = androidx.lifecycle.s0.d(aVar);
                if (d4 != null) {
                    ((nc.t) this.L).A = l0.b(aVar, d4.getLifecycle());
                    aVar.removeOnAttachStateChangeListener(this);
                    return;
                }
                x3.a.d("View tree for " + aVar + " has no ViewTreeLifecycleOwner");
                wa.b.a();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                return;
            default:
                view.getClass();
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) this.L).get();
                if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                } else {
                    iBinder = null;
                }
                if (activity != null && iBinder != null) {
                    ((m8.j) this.B).c(iBinder, activity);
                    return;
                }
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.A) {
            case 0:
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((View) this.B).removeOnAttachStateChangeListener(this);
                ((n2.u1) this.L).x();
                return;
            default:
                view.getClass();
                return;
        }
    }

    public /* synthetic */ w2(View view, Object obj, int i2) {
        this.A = i2;
        this.B = view;
        this.L = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
