package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qv0  reason: default package */
/* loaded from: classes.dex */
public class qv0 extends Dialog implements hu3, jl4, id4, g56 {
    public ku3 A;
    public final e56 B;
    public final ex6 L;
    public final ex6 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv0(Context context, int i) {
        super(context, i);
        context.getClass();
        this.B = new e56(new f56(this, new t46(this, 2)));
        this.L = new ex6(new on2(this) { // from class: pv0
            public final /* synthetic */ qv0 B;

            {
                this.B = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ld4] */
            @Override // defpackage.on2
            public final Object c() {
                int i2 = r2;
                qv0 qv0Var = this.B;
                switch (i2) {
                    case 0:
                        ?? obj = new Object();
                        qv0Var.a().f(obj);
                        return obj;
                    default:
                        return new il4(new n0(qv0Var, 13));
                }
            }
        });
        this.R = new ex6(new on2(this) { // from class: pv0
            public final /* synthetic */ qv0 B;

            {
                this.B = this;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ld4] */
            @Override // defpackage.on2
            public final Object c() {
                int i2 = r2;
                qv0 qv0Var = this.B;
                switch (i2) {
                    case 0:
                        ?? obj = new Object();
                        qv0Var.a().f(obj);
                        return obj;
                    default:
                        return new il4(new n0(qv0Var, 13));
                }
            }
        });
    }

    public static void c(qv0 qv0Var) {
        super.onBackPressed();
    }

    @Override // defpackage.id4
    public final eb a() {
        return b().c().c;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        e();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.jl4
    public final il4 b() {
        return (il4) this.R.getValue();
    }

    public final ku3 d() {
        ku3 ku3Var = this.A;
        if (ku3Var == null) {
            ku3 ku3Var2 = new ku3(this, true);
            this.A = ku3Var2;
            return ku3Var2;
        }
        return ku3Var;
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

    @Override // defpackage.hu3
    public final ut3 getLifecycle() {
        return d();
    }

    @Override // defpackage.g56
    public final d56 getSavedStateRegistry() {
        return this.B.b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((vj1) this.L.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            il4 b = b();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            b.d(onBackInvokedDispatcher);
        }
        this.B.b(bundle);
        d().f(st3.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.B.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        d().f(st3.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        d().f(st3.ON_DESTROY);
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
