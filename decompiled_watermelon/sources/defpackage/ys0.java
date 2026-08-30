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
import android.view.Window;
import androidx.fragment.app.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ys0  reason: default package */
/* loaded from: classes.dex */
public abstract class ys0 extends xs0 implements ab7, lq2, au5, lc4, c54, k9, mc4, ad4, sc4, tc4, xw3 {
    public final x01 B = new x01();
    public final os L;
    public final yt5 R;
    public za7 X;
    public final vs0 Y;
    public final il6 Z;
    public final AtomicInteger c0;
    public final ws0 d0;
    public final CopyOnWriteArrayList e0;
    public final CopyOnWriteArrayList f0;
    public final CopyOnWriteArrayList g0;
    public final CopyOnWriteArrayList h0;
    public final CopyOnWriteArrayList i0;
    public final CopyOnWriteArrayList j0;
    public final CopyOnWriteArrayList k0;
    public boolean l0;
    public boolean m0;
    public final il6 n0;
    public final il6 o0;
    public final il6 p0;

    public ys0() {
        final p pVar = (p) this;
        this.L = new os(new os0(pVar, 1));
        yt5 yt5Var = new yt5(new zt5(this, new bz2(25, this)));
        this.R = yt5Var;
        this.Y = new vs0(pVar);
        this.Z = new il6(new ps0(pVar, 1));
        this.c0 = new AtomicInteger();
        this.d0 = new ws0(pVar);
        this.e0 = new CopyOnWriteArrayList();
        this.f0 = new CopyOnWriteArrayList();
        this.g0 = new CopyOnWriteArrayList();
        this.h0 = new CopyOnWriteArrayList();
        this.i0 = new CopyOnWriteArrayList();
        this.j0 = new CopyOnWriteArrayList();
        this.k0 = new CopyOnWriteArrayList();
        this.n0 = new il6(new ps0(pVar, 2));
        in3 in3Var = this.A;
        if (in3Var != null) {
            in3Var.a(new dn3() { // from class: rs0
                @Override // defpackage.dn3
                public final void d(fn3 fn3Var, pm3 pm3Var) {
                    Window window;
                    View peekDecorView;
                    int i = r2;
                    p pVar2 = pVar;
                    switch (i) {
                        case 0:
                            if (pm3Var == pm3.ON_STOP && (window = pVar2.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                                peekDecorView.cancelPendingInputEvents();
                                return;
                            }
                            return;
                        default:
                            if (pm3Var == pm3.ON_DESTROY) {
                                pVar2.B.b = null;
                                if (!pVar2.isChangingConfigurations()) {
                                    pVar2.getViewModelStore().a();
                                }
                                vs0 vs0Var = pVar2.Y;
                                p pVar3 = vs0Var.R;
                                pVar3.getWindow().getDecorView().removeCallbacks(vs0Var);
                                pVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(vs0Var);
                                return;
                            }
                            return;
                    }
                }
            });
            this.A.a(new dn3() { // from class: rs0
                @Override // defpackage.dn3
                public final void d(fn3 fn3Var, pm3 pm3Var) {
                    Window window;
                    View peekDecorView;
                    int i = r2;
                    p pVar2 = pVar;
                    switch (i) {
                        case 0:
                            if (pm3Var == pm3.ON_STOP && (window = pVar2.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                                peekDecorView.cancelPendingInputEvents();
                                return;
                            }
                            return;
                        default:
                            if (pm3Var == pm3.ON_DESTROY) {
                                pVar2.B.b = null;
                                if (!pVar2.isChangingConfigurations()) {
                                    pVar2.getViewModelStore().a();
                                }
                                vs0 vs0Var = pVar2.Y;
                                p pVar3 = vs0Var.R;
                                pVar3.getWindow().getDecorView().removeCallbacks(vs0Var);
                                pVar3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(vs0Var);
                                return;
                            }
                            return;
                    }
                }
            });
            this.A.a(new w55(1, pVar));
            yt5Var.a();
            st5.b(this);
            yt5Var.b.c("android:support:activity-result", new ss0(0, pVar));
            q(new ts0(pVar, 0));
            this.o0 = new il6(new ps0(pVar, 3));
            this.p0 = new il6(new ps0(pVar, 4));
            return;
        }
        i.n("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        throw null;
    }

    public static void p(p pVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (b53.x(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                return;
            }
            throw e;
        } catch (NullPointerException e2) {
            if (!b53.x(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.c54
    public final q9 a() {
        return b().c().c;
    }

    @Override // defpackage.lc4
    public final kc4 b() {
        return (kc4) this.p0.getValue();
    }

    @Override // defpackage.xw3
    public final void c(gg2 gg2Var) {
        gg2Var.getClass();
        os osVar = this.L;
        ((CopyOnWriteArrayList) osVar.R).remove(gg2Var);
        if (((HashMap) osVar.B).remove(gg2Var) == null) {
            ((Runnable) osVar.L).run();
        } else {
            c44.b();
        }
    }

    @Override // defpackage.mc4
    public final void f(wz0 wz0Var) {
        wz0Var.getClass();
        this.e0.add(wz0Var);
    }

    @Override // defpackage.mc4
    public final void g(wz0 wz0Var) {
        wz0Var.getClass();
        this.e0.remove(wz0Var);
    }

    @Override // defpackage.lq2
    public final z31 getDefaultViewModelCreationExtras() {
        Bundle bundle;
        g14 g14Var = new g14(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = g14Var.a;
        if (application != null) {
            linkedHashMap.put(wa7.d, getApplication());
        }
        linkedHashMap.put(st5.a, this);
        linkedHashMap.put(st5.b, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            linkedHashMap.put(st5.c, bundle);
        }
        return g14Var;
    }

    public xa7 getDefaultViewModelProviderFactory() {
        return (xa7) this.o0.getValue();
    }

    @Override // defpackage.fn3
    public final rm3 getLifecycle() {
        return this.A;
    }

    @Override // defpackage.au5
    public final xt5 getSavedStateRegistry() {
        return this.R.b;
    }

    @Override // defpackage.ab7
    public final za7 getViewModelStore() {
        if (getApplication() != null) {
            if (this.X == null) {
                us0 us0Var = (us0) getLastNonConfigurationInstance();
                if (us0Var != null) {
                    this.X = us0Var.a;
                }
                if (this.X == null) {
                    this.X = new za7();
                }
            }
            za7 za7Var = this.X;
            za7Var.getClass();
            return za7Var;
        }
        i.n("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        return null;
    }

    @Override // defpackage.tc4
    public final void h(wz0 wz0Var) {
        wz0Var.getClass();
        this.i0.add(wz0Var);
    }

    @Override // defpackage.sc4
    public final void i(wz0 wz0Var) {
        wz0Var.getClass();
        this.h0.add(wz0Var);
    }

    @Override // defpackage.xw3
    public final void j(gg2 gg2Var) {
        gg2Var.getClass();
        os osVar = this.L;
        ((CopyOnWriteArrayList) osVar.R).add(gg2Var);
        ((Runnable) osVar.L).run();
    }

    @Override // defpackage.ad4
    public final void k(wz0 wz0Var) {
        wz0Var.getClass();
        this.f0.add(wz0Var);
    }

    @Override // defpackage.k9
    public final i9 l() {
        return this.d0;
    }

    @Override // defpackage.ad4
    public final void m(wz0 wz0Var) {
        wz0Var.getClass();
        this.f0.remove(wz0Var);
    }

    @Override // defpackage.tc4
    public final void n(wz0 wz0Var) {
        wz0Var.getClass();
        this.i0.remove(wz0Var);
    }

    @Override // defpackage.sc4
    public final void o(wz0 wz0Var) {
        wz0Var.getClass();
        this.h0.remove(wz0Var);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.d0.a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((rf1) this.n0.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.e0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wz0) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.xs0, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.R.b(bundle);
        x01 x01Var = this.B;
        x01Var.getClass();
        x01Var.b = this;
        Iterator it = x01Var.a.iterator();
        while (it.hasNext()) {
            ((oc4) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = qa5.B;
        oa5.b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            MenuInflater menuInflater = getMenuInflater();
            Iterator it = ((CopyOnWriteArrayList) this.L.R).iterator();
            while (it.hasNext()) {
                ((gg2) it.next()).a.k(menu, menuInflater);
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
            Iterator it = ((CopyOnWriteArrayList) this.L.R).iterator();
            while (it.hasNext()) {
                if (((gg2) it.next()).a.p(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.l0 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.l0 = false;
            Iterator it = this.h0.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((wz0) it.next()).accept(new b14(z));
            }
        } catch (Throwable th) {
            this.l0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.g0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wz0) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.L.R).iterator();
        while (it.hasNext()) {
            ((gg2) it.next()).a.q(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.m0 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.m0 = false;
            Iterator it = this.i0.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((wz0) it.next()).accept(new tn4(z));
            }
        } catch (Throwable th) {
            this.m0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        vn1 vn1Var;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            vn1Var = new vn1(16);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            vn1Var = new vn1(16);
        } else {
            vn1Var = new vn1(16);
        }
        Iterator it = this.j0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wz0) it.next()).accept(vn1Var);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            Iterator it = ((CopyOnWriteArrayList) this.L.R).iterator();
            while (it.hasNext()) {
                ((gg2) it.next()).a.t(menu);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (!this.d0.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [us0, java.lang.Object] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        us0 us0Var;
        za7 za7Var = this.X;
        if (za7Var == null && (us0Var = (us0) getLastNonConfigurationInstance()) != null) {
            za7Var = us0Var.a;
        }
        if (za7Var == null) {
            return null;
        }
        ?? obj = new Object();
        obj.a = za7Var;
        return obj;
    }

    @Override // defpackage.xs0, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        in3 in3Var = this.A;
        if (in3Var != null) {
            in3Var.h(qm3.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.R.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wz0) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.k0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void q(oc4 oc4Var) {
        x01 x01Var = this.B;
        x01Var.getClass();
        ys0 ys0Var = x01Var.b;
        if (ys0Var != null) {
            oc4Var.a(ys0Var);
        }
        x01Var.a.add(oc4Var);
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
            if (io2.R()) {
                Trace.beginSection(io2.p0("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            ji2 ji2Var = (ji2) this.Z.getValue();
            synchronized (ji2Var.b) {
                ji2Var.c = true;
                ArrayList arrayList = ji2Var.d;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ki2) obj).c();
                }
                ji2Var.d.clear();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final c9 s(a9 a9Var, z8 z8Var) {
        ws0 ws0Var = this.d0;
        ws0Var.getClass();
        return ws0Var.d("activity_rq#" + this.c0.getAndIncrement(), this, a9Var, z8Var);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        r();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        vs0 vs0Var = this.Y;
        vs0Var.getClass();
        if (!vs0Var.L) {
            vs0Var.L = true;
            decorView.getViewTreeObserver().addOnDrawListener(vs0Var);
        }
        super.setContentView(view);
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
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.l0) {
            return;
        }
        Iterator it = this.h0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wz0) it.next()).accept(new b14(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.m0) {
            return;
        }
        Iterator it = this.i0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((wz0) it.next()).accept(new tn4(z));
        }
    }
}
