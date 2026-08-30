package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bt0  reason: default package */
/* loaded from: classes.dex */
public class bt0 extends Dialog implements fn3, lc4, c54, au5 {
    public in3 A;
    public final yt5 B;
    public final il6 L;
    public final il6 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt0(Context context, int i) {
        super(context, i);
        context.getClass();
        this.B = new yt5(new zt5(this, new bz2(25, this)));
        this.L = new il6(new ki2(this) { // from class: at0
            public final /* synthetic */ bt0 B;

            {
                this.B = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [f54, java.lang.Object] */
            @Override // defpackage.ki2
            public final Object c() {
                int i2 = r2;
                bt0 bt0Var = this.B;
                switch (i2) {
                    case 0:
                        ?? obj = new Object();
                        bt0Var.a().f(obj);
                        return obj;
                    default:
                        return new kc4(new m0(13, bt0Var));
                }
            }
        });
        this.R = new il6(new ki2(this) { // from class: at0
            public final /* synthetic */ bt0 B;

            {
                this.B = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [f54, java.lang.Object] */
            @Override // defpackage.ki2
            public final Object c() {
                int i2 = r2;
                bt0 bt0Var = this.B;
                switch (i2) {
                    case 0:
                        ?? obj = new Object();
                        bt0Var.a().f(obj);
                        return obj;
                    default:
                        return new kc4(new m0(13, bt0Var));
                }
            }
        });
    }

    public static void c(bt0 bt0Var) {
        super.onBackPressed();
    }

    @Override // defpackage.c54
    public final q9 a() {
        return b().c().c;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.lc4
    public final kc4 b() {
        return (kc4) this.R.getValue();
    }

    public final in3 d() {
        in3 in3Var = this.A;
        if (in3Var == null) {
            in3 in3Var2 = new in3(this, true);
            this.A = in3Var2;
            return in3Var2;
        }
        return in3Var;
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

    @Override // defpackage.fn3
    public final rm3 getLifecycle() {
        return d();
    }

    @Override // defpackage.au5
    public final xt5 getSavedStateRegistry() {
        return this.B.b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((rf1) this.L.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            kc4 b = b();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            b.d(onBackInvokedDispatcher);
        }
        this.B.b(bundle);
        d().f(pm3.ON_CREATE);
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
        d().f(pm3.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        d().f(pm3.ON_DESTROY);
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
    public void setContentView(int i) {
        e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.setContentView(view, layoutParams);
    }
}
