package d;

import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.o0;
import androidx.fragment.app.y0;
import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.e1;
import androidx.lifecycle.m0;
import androidx.lifecycle.z0;
import b4.v1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kf.s0;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class k extends m5.e implements e1, androidx.lifecycle.k, q7.f, b0, f7.c, h.i, n5.a, n5.b, m5.k, m5.l, a6.p {
    public final g.a B = new g.a();
    public final a4.n L;
    public final q7.e R;
    public d1 X;
    public final h Y;
    public final yb.n Z;

    /* renamed from: b0  reason: collision with root package name */
    public final AtomicInteger f3293b0;

    /* renamed from: c0  reason: collision with root package name */
    public final j f3294c0;

    /* renamed from: d0  reason: collision with root package name */
    public final CopyOnWriteArrayList f3295d0;

    /* renamed from: e0  reason: collision with root package name */
    public final CopyOnWriteArrayList f3296e0;

    /* renamed from: f0  reason: collision with root package name */
    public final CopyOnWriteArrayList f3297f0;

    /* renamed from: g0  reason: collision with root package name */
    public final CopyOnWriteArrayList f3298g0;

    /* renamed from: h0  reason: collision with root package name */
    public final CopyOnWriteArrayList f3299h0;

    /* renamed from: i0  reason: collision with root package name */
    public final CopyOnWriteArrayList f3300i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f3301j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f3302k0;

    /* renamed from: l0  reason: collision with root package name */
    public final yb.n f3303l0;

    /* renamed from: m0  reason: collision with root package name */
    public final yb.n f3304m0;

    /* renamed from: n0  reason: collision with root package name */
    public final yb.n f3305n0;

    public k() {
        final o0 o0Var = (o0) this;
        this.L = new a4.n(new b(o0Var, 1));
        q7.e eVar = new q7.e(new s7.a(this, new s0(7, this)));
        this.R = eVar;
        this.Y = new h(o0Var);
        this.Z = new yb.n(new c(o0Var, 1));
        this.f3293b0 = new AtomicInteger();
        this.f3294c0 = new j(o0Var);
        this.f3295d0 = new CopyOnWriteArrayList();
        this.f3296e0 = new CopyOnWriteArrayList();
        this.f3297f0 = new CopyOnWriteArrayList();
        this.f3298g0 = new CopyOnWriteArrayList();
        this.f3299h0 = new CopyOnWriteArrayList();
        this.f3300i0 = new CopyOnWriteArrayList();
        this.f3303l0 = new yb.n(new c(o0Var, 2));
        androidx.lifecycle.z zVar = this.A;
        if (zVar != null) {
            zVar.a(new androidx.lifecycle.v() { // from class: d.e
                @Override // androidx.lifecycle.v
                public final void d(androidx.lifecycle.x xVar, androidx.lifecycle.p pVar) {
                    Window window;
                    View peekDecorView;
                    switch (r2) {
                        case 0:
                            o0 o0Var2 = o0Var;
                            if (pVar == androidx.lifecycle.p.ON_STOP && (window = o0Var2.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                                peekDecorView.cancelPendingInputEvents();
                                return;
                            }
                            return;
                        default:
                            o0 o0Var3 = o0Var;
                            if (pVar == androidx.lifecycle.p.ON_DESTROY) {
                                o0Var3.B.f4999b = null;
                                if (!o0Var3.isChangingConfigurations()) {
                                    o0Var3.getViewModelStore().a();
                                }
                                h hVar = o0Var3.Y;
                                o0 o0Var4 = hVar.R;
                                o0Var4.getWindow().getDecorView().removeCallbacks(hVar);
                                o0Var4.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(hVar);
                                return;
                            }
                            return;
                    }
                }
            });
            this.A.a(new androidx.lifecycle.v() { // from class: d.e
                @Override // androidx.lifecycle.v
                public final void d(androidx.lifecycle.x xVar, androidx.lifecycle.p pVar) {
                    Window window;
                    View peekDecorView;
                    switch (r2) {
                        case 0:
                            o0 o0Var2 = o0Var;
                            if (pVar == androidx.lifecycle.p.ON_STOP && (window = o0Var2.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                                peekDecorView.cancelPendingInputEvents();
                                return;
                            }
                            return;
                        default:
                            o0 o0Var3 = o0Var;
                            if (pVar == androidx.lifecycle.p.ON_DESTROY) {
                                o0Var3.B.f4999b = null;
                                if (!o0Var3.isChangingConfigurations()) {
                                    o0Var3.getViewModelStore().a();
                                }
                                h hVar = o0Var3.Y;
                                o0 o0Var4 = hVar.R;
                                o0Var4.getWindow().getDecorView().removeCallbacks(hVar);
                                o0Var4.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(hVar);
                                return;
                            }
                            return;
                    }
                }
            });
            this.A.a(new q7.a(1, o0Var));
            eVar.a();
            androidx.lifecycle.s0.c(this);
            eVar.f12313b.c("android:support:activity-result", new v1(1, o0Var));
            q(new g.b() { // from class: d.f
                @Override // g.b
                public final void a(k kVar) {
                    kVar.getClass();
                    o0 o0Var2 = o0.this;
                    Bundle a10 = o0Var2.R.f12313b.a("android:support:activity-result");
                    if (a10 != null) {
                        j jVar = o0Var2.f3294c0;
                        LinkedHashMap linkedHashMap = jVar.f5826b;
                        LinkedHashMap linkedHashMap2 = jVar.f5825a;
                        Bundle bundle = jVar.f5831g;
                        ArrayList<Integer> integerArrayList = a10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                        ArrayList<String> stringArrayList = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                        if (stringArrayList != null && integerArrayList != null) {
                            ArrayList<String> stringArrayList2 = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                            if (stringArrayList2 != null) {
                                jVar.f5828d.addAll(stringArrayList2);
                            }
                            Bundle bundle2 = a10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                            if (bundle2 != null) {
                                bundle.putAll(bundle2);
                            }
                            int size = stringArrayList.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                String str = stringArrayList.get(i2);
                                if (linkedHashMap.containsKey(str)) {
                                    Integer num = (Integer) linkedHashMap.remove(str);
                                    if (!bundle.containsKey(str)) {
                                        nc.w.a(linkedHashMap2).remove(num);
                                    }
                                }
                                Integer num2 = integerArrayList.get(i2);
                                num2.getClass();
                                int intValue = num2.intValue();
                                String str2 = stringArrayList.get(i2);
                                str2.getClass();
                                String str3 = str2;
                                linkedHashMap2.put(Integer.valueOf(intValue), str3);
                                jVar.f5826b.put(str3, Integer.valueOf(intValue));
                            }
                        }
                    }
                }
            });
            this.f3304m0 = new yb.n(new c(o0Var, 3));
            this.f3305n0 = new yb.n(new c(o0Var, 4));
            return;
        }
        a0.j.p("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        throw null;
    }

    public static void p(o0 o0Var) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e6) {
            if (nc.k.a(e6.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                return;
            }
            throw e6;
        } catch (NullPointerException e10) {
            if (!nc.k.a(e10.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e10;
            }
        }
    }

    @Override // d.b0
    public final a0 a() {
        return (a0) this.f3305n0.getValue();
    }

    @Override // f7.c
    public final b9.e b() {
        return a().c().f3318c;
    }

    @Override // a6.p
    public final void c(y0 y0Var) {
        y0Var.getClass();
        a4.n nVar = this.L;
        ((CopyOnWriteArrayList) nVar.L).add(y0Var);
        ((Runnable) nVar.B).run();
    }

    @Override // m5.l
    public final void f(z5.a aVar) {
        aVar.getClass();
        this.f3299h0.remove(aVar);
    }

    @Override // n5.a
    public final void g(z5.a aVar) {
        aVar.getClass();
        this.f3295d0.add(aVar);
    }

    @Override // androidx.lifecycle.k
    public final w6.c getDefaultViewModelCreationExtras() {
        Bundle bundle;
        w6.d dVar = new w6.d(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = dVar.f14161a;
        if (application != null) {
            linkedHashMap.put(z0.f1512d, getApplication());
        }
        linkedHashMap.put(androidx.lifecycle.s0.f1482a, this);
        linkedHashMap.put(androidx.lifecycle.s0.f1483b, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.s0.f1484c, bundle);
        }
        return dVar;
    }

    public a1 getDefaultViewModelProviderFactory() {
        return (a1) this.f3304m0.getValue();
    }

    @Override // androidx.lifecycle.x
    public final androidx.lifecycle.r getLifecycle() {
        return this.A;
    }

    @Override // q7.f
    public final q7.d getSavedStateRegistry() {
        return this.R.f12313b;
    }

    @Override // androidx.lifecycle.e1
    public final d1 getViewModelStore() {
        if (getApplication() != null) {
            if (this.X == null) {
                g gVar = (g) getLastNonConfigurationInstance();
                if (gVar != null) {
                    this.X = gVar.f3291a;
                }
                if (this.X == null) {
                    this.X = new d1();
                }
            }
            d1 d1Var = this.X;
            d1Var.getClass();
            return d1Var;
        }
        a0.j.p("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        return null;
    }

    @Override // n5.b
    public final void h(z5.a aVar) {
        aVar.getClass();
        this.f3296e0.add(aVar);
    }

    @Override // n5.b
    public final void i(z5.a aVar) {
        aVar.getClass();
        this.f3296e0.remove(aVar);
    }

    @Override // a6.p
    public final void j(y0 y0Var) {
        y0Var.getClass();
        a4.n nVar = this.L;
        ((CopyOnWriteArrayList) nVar.L).remove(y0Var);
        if (((HashMap) nVar.R).remove(y0Var) == null) {
            ((Runnable) nVar.B).run();
        } else {
            m9.o.b();
        }
    }

    @Override // m5.l
    public final void k(z5.a aVar) {
        aVar.getClass();
        this.f3299h0.add(aVar);
    }

    @Override // m5.k
    public final void l(z5.a aVar) {
        aVar.getClass();
        this.f3298g0.add(aVar);
    }

    @Override // h.i
    public final h.h m() {
        return this.f3294c0;
    }

    @Override // m5.k
    public final void n(z5.a aVar) {
        aVar.getClass();
        this.f3298g0.remove(aVar);
    }

    @Override // n5.a
    public final void o(z5.a aVar) {
        aVar.getClass();
        this.f3295d0.remove(aVar);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i2, int i10, Intent intent) {
        if (!this.f3294c0.a(i2, i10, intent)) {
            super.onActivityResult(i2, i10, intent);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((f7.a) this.f3303l0.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.f3295d0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((z5.a) it.next()).accept(configuration);
        }
    }

    @Override // m5.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.R.b(bundle);
        g.a aVar = this.B;
        aVar.getClass();
        aVar.f4999b = this;
        Iterator it = aVar.f4998a.iterator();
        while (it.hasNext()) {
            ((g.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i2 = androidx.lifecycle.o0.B;
        m0.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        menu.getClass();
        if (i2 == 0) {
            super.onCreatePanelMenu(i2, menu);
            MenuInflater menuInflater = getMenuInflater();
            Iterator it = ((CopyOnWriteArrayList) this.L.L).iterator();
            while (it.hasNext()) {
                ((y0) it.next()).f1440a.k(menu, menuInflater);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.L.L).iterator();
            while (it.hasNext()) {
                if (((y0) it.next()).f1440a.p(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        configuration.getClass();
        this.f3301j0 = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.f3301j0 = false;
            Iterator it = this.f3298g0.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((z5.a) it.next()).accept(new m5.f(z10));
            }
        } catch (Throwable th2) {
            this.f3301j0 = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.f3297f0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((z5.a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.L.L).iterator();
        while (it.hasNext()) {
            ((y0) it.next()).f1440a.q(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        configuration.getClass();
        this.f3302k0 = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.f3302k0 = false;
            Iterator it = this.f3299h0.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((z5.a) it.next()).accept(new m5.m(z10));
            }
        } catch (Throwable th2) {
            this.f3302k0 = false;
            throw th2;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        menu.getClass();
        if (i2 == 0) {
            super.onPreparePanel(i2, view, menu);
            Iterator it = ((CopyOnWriteArrayList) this.L.L).iterator();
            while (it.hasNext()) {
                ((y0) it.next()).f1440a.t(menu);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (!this.f3294c0.a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, d.g] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        g gVar;
        d1 d1Var = this.X;
        if (d1Var == null && (gVar = (g) getLastNonConfigurationInstance()) != null) {
            d1Var = gVar.f3291a;
        }
        if (d1Var == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f3291a = d1Var;
        return obj;
    }

    @Override // m5.e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        androidx.lifecycle.z zVar = this.A;
        if (zVar != null) {
            zVar.h(androidx.lifecycle.q.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.R.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        Iterator it = this.f3296e0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((z5.a) it.next()).accept(Integer.valueOf(i2));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f3300i0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void q(g.b bVar) {
        g.a aVar = this.B;
        aVar.getClass();
        k kVar = aVar.f4999b;
        if (kVar != null) {
            bVar.a(kVar);
        }
        aVar.f4998a.add(bVar);
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
            if (aj.g.N()) {
                Trace.beginSection(aj.g.v0("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            u uVar = (u) this.Z.getValue();
            synchronized (uVar.f3308b) {
                uVar.f3309c = true;
                ArrayList arrayList = uVar.f3310d;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((mc.a) obj).b();
                }
                uVar.f3310d.clear();
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final h.c s(i.a aVar, h.b bVar) {
        j jVar = this.f3294c0;
        jVar.getClass();
        return jVar.c("activity_rq#" + this.f3293b0.getAndIncrement(), this, aVar, bVar);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        r();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        h hVar = this.Y;
        hVar.getClass();
        if (!hVar.L) {
            hVar.L = true;
            decorView.getViewTreeObserver().addOnDrawListener(hVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i2) {
        intent.getClass();
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i10, int i11, int i12) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i2, intent, i10, i11, i12);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i10, int i11, int i12, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i2, intent, i10, i11, i12, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        if (this.f3301j0) {
            return;
        }
        Iterator it = this.f3298g0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((z5.a) it.next()).accept(new m5.f(z10));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10) {
        if (this.f3302k0) {
            return;
        }
        Iterator it = this.f3299h0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((z5.a) it.next()).accept(new m5.m(z10));
        }
    }
}
