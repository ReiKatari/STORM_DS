package d;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import kf.s0;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class m extends Dialog implements androidx.lifecycle.x, b0, f7.c, q7.f {
    public androidx.lifecycle.z A;
    public final q7.e B;
    public final yb.n L;
    public final yb.n R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, int i2) {
        super(context, i2);
        context.getClass();
        this.B = new q7.e(new s7.a(this, new s0(7, this)));
        this.L = new yb.n(new mc.a(this) { // from class: d.l
            public final /* synthetic */ m B;

            {
                this.B = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [f7.f, java.lang.Object] */
            @Override // mc.a
            public final Object b() {
                switch (r2) {
                    case 0:
                        ?? obj = new Object();
                        this.B.b().d(obj);
                        return obj;
                    default:
                        return new a0(new a8.f(6, this.B));
                }
            }
        });
        this.R = new yb.n(new mc.a(this) { // from class: d.l
            public final /* synthetic */ m B;

            {
                this.B = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [f7.f, java.lang.Object] */
            @Override // mc.a
            public final Object b() {
                switch (r2) {
                    case 0:
                        ?? obj = new Object();
                        this.B.b().d(obj);
                        return obj;
                    default:
                        return new a0(new a8.f(6, this.B));
                }
            }
        });
    }

    public static void c(m mVar) {
        super.onBackPressed();
    }

    @Override // d.b0
    public final a0 a() {
        return (a0) this.R.getValue();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // f7.c
    public final b9.e b() {
        return a().c().f3318c;
    }

    public final androidx.lifecycle.z d() {
        androidx.lifecycle.z zVar = this.A;
        if (zVar == null) {
            androidx.lifecycle.z zVar2 = new androidx.lifecycle.z(this, true);
            this.A = zVar2;
            return zVar2;
        }
        return zVar;
    }

    public final void e() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // androidx.lifecycle.x
    public final androidx.lifecycle.r getLifecycle() {
        return d();
    }

    @Override // q7.f
    public final q7.d getSavedStateRegistry() {
        return this.B.f12313b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((f7.a) this.L.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            a0 a10 = a();
            OnBackInvokedDispatcher r5 = b6.c.r(this);
            r5.getClass();
            a10.d(r5);
        }
        this.B.b(bundle);
        d().f(androidx.lifecycle.p.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.B.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        d().f(androidx.lifecycle.p.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        d().f(androidx.lifecycle.p.ON_DESTROY);
        this.A = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i2) {
        e();
        super.setContentView(i2);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.setContentView(view, layoutParams);
    }
}
