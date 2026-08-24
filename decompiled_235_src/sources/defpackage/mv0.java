package defpackage;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mv0  reason: default package */
/* loaded from: classes.dex */
public abstract class mv0 extends lv0 implements bp7, mw2, g56, jl4, id4, l9, kl4, yl4, rl4, sl4, l44 {
    public final f41 B = new f41();
    public final m44 L = new m44(new cv0(this, 1));
    public final e56 R;
    public ap7 X;
    public final jv0 Y;
    public final ex6 Z;
    public final AtomicInteger d0;
    public final kv0 e0;
    public final CopyOnWriteArrayList f0;
    public final CopyOnWriteArrayList g0;
    public final CopyOnWriteArrayList h0;
    public final CopyOnWriteArrayList i0;
    public final CopyOnWriteArrayList j0;
    public final CopyOnWriteArrayList k0;
    public final CopyOnWriteArrayList l0;
    public boolean m0;
    public boolean n0;
    public final ex6 o0;
    public final ex6 p0;
    public final ex6 q0;

    public mv0() {
        e56 e56Var = new e56(new f56(this, new t46(this, 2)));
        this.R = e56Var;
        this.Y = new jv0(this);
        this.Z = new ex6(new dv0(this, 1));
        this.d0 = new AtomicInteger();
        this.e0 = new kv0(this);
        this.f0 = new CopyOnWriteArrayList();
        this.g0 = new CopyOnWriteArrayList();
        this.h0 = new CopyOnWriteArrayList();
        this.i0 = new CopyOnWriteArrayList();
        this.j0 = new CopyOnWriteArrayList();
        this.k0 = new CopyOnWriteArrayList();
        this.l0 = new CopyOnWriteArrayList();
        this.o0 = new ex6(new dv0(this, 2));
        ku3 ku3Var = this.A;
        if (ku3Var != null) {
            ku3Var.a(new fu3(this) { // from class: fv0
                public final /* synthetic */ mv0 B;

                {
                    this.B = this;
                }

                @Override // defpackage.fu3
                public final void h(hu3 hu3Var, st3 st3Var) {
                    Window window;
                    View peekDecorView;
                    int i = r2;
                    mv0 mv0Var = this.B;
                    switch (i) {
                        case 0:
                            if (st3Var == st3.ON_STOP && (window = mv0Var.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                                peekDecorView.cancelPendingInputEvents();
                                return;
                            }
                            return;
                        default:
                            if (st3Var == st3.ON_DESTROY) {
                                mv0Var.B.b = null;
                                if (!mv0Var.isChangingConfigurations()) {
                                    mv0Var.getViewModelStore().a();
                                }
                                jv0 jv0Var = mv0Var.Y;
                                mv0 mv0Var2 = jv0Var.R;
                                mv0Var2.getWindow().getDecorView().removeCallbacks(jv0Var);
                                mv0Var2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(jv0Var);
                                return;
                            }
                            return;
                    }
                }
            });
            this.A.a(new fu3(this) { // from class: fv0
                public final /* synthetic */ mv0 B;

                {
                    this.B = this;
                }

                @Override // defpackage.fu3
                public final void h(hu3 hu3Var, st3 st3Var) {
                    Window window;
                    View peekDecorView;
                    int i = r2;
                    mv0 mv0Var = this.B;
                    switch (i) {
                        case 0:
                            if (st3Var == st3.ON_STOP && (window = mv0Var.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                                peekDecorView.cancelPendingInputEvents();
                                return;
                            }
                            return;
                        default:
                            if (st3Var == st3.ON_DESTROY) {
                                mv0Var.B.b = null;
                                if (!mv0Var.isChangingConfigurations()) {
                                    mv0Var.getViewModelStore().a();
                                }
                                jv0 jv0Var = mv0Var.Y;
                                mv0 mv0Var2 = jv0Var.R;
                                mv0Var2.getWindow().getDecorView().removeCallbacks(jv0Var);
                                mv0Var2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(jv0Var);
                                return;
                            }
                            return;
                    }
                }
            });
            this.A.a(new mf5(this, 1));
            e56Var.a();
            y46.b(this);
            e56Var.b.c("android:support:activity-result", new gv0(this, 0));
            q(new hv0(this, 0));
            this.p0 = new ex6(new dv0(this, 3));
            this.q0 = new ex6(new dv0(this, 4));
            return;
        }
        i.m("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        throw null;
    }

    public static void p(mv0 mv0Var) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (nb3.k(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                return;
            }
            throw e;
        } catch (NullPointerException e2) {
            if (!nb3.k(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.id4
    public final eb a() {
        return b().c().c;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.Y.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.jl4
    public final il4 b() {
        return (il4) this.q0.getValue();
    }

    @Override // defpackage.sl4
    public final void d(b31 b31Var) {
        b31Var.getClass();
        this.j0.add(b31Var);
    }

    @Override // defpackage.rl4
    public final void e(b31 b31Var) {
        b31Var.getClass();
        this.i0.add(b31Var);
    }

    @Override // defpackage.yl4
    public final void f(b31 b31Var) {
        b31Var.getClass();
        this.g0.add(b31Var);
    }

    @Override // defpackage.l9
    public final j9 g() {
        return this.e0;
    }

    @Override // defpackage.mw2
    public final j71 getDefaultViewModelCreationExtras() {
        Bundle bundle;
        m94 m94Var = new m94(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = m94Var.a;
        if (application != null) {
            linkedHashMap.put(wo7.d, getApplication());
        }
        linkedHashMap.put(y46.a, this);
        linkedHashMap.put(y46.b, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            linkedHashMap.put(y46.c, bundle);
        }
        return m94Var;
    }

    public yo7 getDefaultViewModelProviderFactory() {
        return (yo7) this.p0.getValue();
    }

    @Override // defpackage.hu3
    public final ut3 getLifecycle() {
        return this.A;
    }

    @Override // defpackage.g56
    public final d56 getSavedStateRegistry() {
        return this.R.b;
    }

    @Override // defpackage.bp7
    public final ap7 getViewModelStore() {
        if (getApplication() != null) {
            if (this.X == null) {
                iv0 iv0Var = (iv0) getLastNonConfigurationInstance();
                if (iv0Var != null) {
                    this.X = iv0Var.a;
                }
                if (this.X == null) {
                    this.X = new ap7();
                }
            }
            ap7 ap7Var = this.X;
            ap7Var.getClass();
            return ap7Var;
        }
        i.m("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        return null;
    }

    @Override // defpackage.yl4
    public final void h(b31 b31Var) {
        b31Var.getClass();
        this.g0.remove(b31Var);
    }

    @Override // defpackage.l44
    public final void i(fl2 fl2Var) {
        fl2Var.getClass();
        m44 m44Var = this.L;
        ((CopyOnWriteArrayList) m44Var.L).remove(fl2Var);
        if (((HashMap) m44Var.R).remove(fl2Var) == null) {
            ((Runnable) m44Var.B).run();
        } else {
            u34.a();
        }
    }

    @Override // defpackage.kl4
    public final void k(b31 b31Var) {
        b31Var.getClass();
        this.f0.add(b31Var);
    }

    @Override // defpackage.kl4
    public final void l(b31 b31Var) {
        b31Var.getClass();
        this.f0.remove(b31Var);
    }

    @Override // defpackage.l44
    public final void m(fl2 fl2Var) {
        fl2Var.getClass();
        m44 m44Var = this.L;
        ((CopyOnWriteArrayList) m44Var.L).add(fl2Var);
        ((Runnable) m44Var.B).run();
    }

    @Override // defpackage.sl4
    public final void n(b31 b31Var) {
        b31Var.getClass();
        this.j0.remove(b31Var);
    }

    @Override // defpackage.rl4
    public final void o(b31 b31Var) {
        b31Var.getClass();
        this.i0.remove(b31Var);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.e0.a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((vj1) this.o0.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.f0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((b31) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.lv0, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.R.b(bundle);
        f41 f41Var = this.B;
        f41Var.getClass();
        f41Var.b = this;
        Iterator it = f41Var.a.iterator();
        while (it.hasNext()) {
            ((ml4) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = ik5.B;
        gk5.b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            MenuInflater menuInflater = getMenuInflater();
            Iterator it = ((CopyOnWriteArrayList) this.L.L).iterator();
            while (it.hasNext()) {
                ((fl2) it.next()).a.k(menu, menuInflater);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.L.L).iterator();
            while (it.hasNext()) {
                if (((fl2) it.next()).a.p(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.m0 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.m0 = false;
            Iterator it = this.i0.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((b31) it.next()).accept(new h94(z));
            }
        } catch (Throwable th) {
            this.m0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.h0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((b31) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.L.L).iterator();
        while (it.hasNext()) {
            ((fl2) it.next()).a.q(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.n0 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.n0 = false;
            Iterator it = this.j0.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((b31) it.next()).accept(new yw4(z));
            }
        } catch (Throwable th) {
            this.n0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        x31 x31Var;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            x31Var = new x31(18);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            x31Var = new x31(18);
        } else {
            x31Var = new x31(18);
        }
        Iterator it = this.k0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((b31) it.next()).accept(x31Var);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            Iterator it = ((CopyOnWriteArrayList) this.L.L).iterator();
            while (it.hasNext()) {
                ((fl2) it.next()).a.t(menu);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (!this.e0.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [iv0, java.lang.Object] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        iv0 iv0Var;
        ap7 ap7Var = this.X;
        if (ap7Var == null && (iv0Var = (iv0) getLastNonConfigurationInstance()) != null) {
            ap7Var = iv0Var.a;
        }
        if (ap7Var == null) {
            return null;
        }
        ?? obj = new Object();
        obj.a = ap7Var;
        return obj;
    }

    @Override // defpackage.lv0, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        ku3 ku3Var = this.A;
        if (ku3Var != null) {
            ku3Var.h(tt3.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.R.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.g0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((b31) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.l0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void q(ml4 ml4Var) {
        f41 f41Var = this.B;
        f41Var.getClass();
        mv0 mv0Var = f41Var.b;
        if (mv0Var != null) {
            ml4Var.a(mv0Var);
        }
        f41Var.a.add(ml4Var);
    }

    public final void r() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (ln2.H()) {
                Trace.beginSection(ln2.f0("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            nn2 nn2Var = (nn2) this.Z.getValue();
            synchronized (nn2Var.b) {
                nn2Var.c = true;
                ArrayList arrayList = nn2Var.d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((on2) obj).c();
                }
                nn2Var.d.clear();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final d9 s(b9 b9Var, a9 a9Var) {
        kv0 kv0Var = this.e0;
        kv0Var.getClass();
        return kv0Var.d("activity_rq#" + this.d0.getAndIncrement(), this, b9Var, a9Var);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        r();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.Y.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        r();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.Y.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        r();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.Y.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.m0) {
            return;
        }
        Iterator it = this.i0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((b31) it.next()).accept(new h94(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.n0) {
            return;
        }
        Iterator it = this.j0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((b31) it.next()).accept(new yw4(z));
        }
    }
}
