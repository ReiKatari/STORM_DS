package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class o0 extends d.k {

    /* renamed from: o0  reason: collision with root package name */
    public final d0 f1380o0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f1381q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f1382r0;
    public final androidx.lifecycle.z p0 = new androidx.lifecycle.z(this, true);

    /* renamed from: s0  reason: collision with root package name */
    public boolean f1383s0 = true;

    public o0() {
        final l.i iVar = (l.i) this;
        this.f1380o0 = new d0(2, new n0(iVar));
        this.R.f12313b.c("android:support:lifecycle", new k0(0, iVar));
        this.f3295d0.add(new z5.a() { // from class: androidx.fragment.app.l0
            @Override // z5.a
            public final void accept(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        iVar.f1380o0.a();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        iVar.f1380o0.a();
                        return;
                }
            }
        });
        this.f3297f0.add(new z5.a() { // from class: androidx.fragment.app.l0
            @Override // z5.a
            public final void accept(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        iVar.f1380o0.a();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        iVar.f1380o0.a();
                        return;
                }
            }
        });
        q(new g.b() { // from class: androidx.fragment.app.m0
            @Override // g.b
            public final void a(d.k kVar) {
                n0 n0Var = (n0) l.i.this.f1380o0.B;
                n0Var.R.b(n0Var, n0Var, null);
            }
        });
    }

    public static boolean u(g1 g1Var, androidx.lifecycle.q qVar) {
        boolean z10 = false;
        for (j0 j0Var : g1Var.f1312c.f()) {
            if (j0Var != null) {
                if (j0Var.getHost() != null) {
                    z10 |= u(j0Var.getChildFragmentManager(), qVar);
                }
                a2 a2Var = j0Var.mViewLifecycleOwner;
                if (a2Var != null && a2Var.getLifecycle().b().isAtLeast(androidx.lifecycle.q.STARTED)) {
                    j0Var.mViewLifecycleOwner.X.h(qVar);
                    z10 = true;
                }
                if (j0Var.mLifecycleRegistry.f1504d.isAtLeast(androidx.lifecycle.q.STARTED)) {
                    j0Var.mLifecycleRegistry.h(qVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003a, code lost:
        if (r1.equals("--list-dumpables") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
        if (r1.equals("--dump-dumpable") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
        if (android.os.Build.VERSION.SDK_INT < 33) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.o0.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // d.k, android.app.Activity
    public final void onActivityResult(int i2, int i10, Intent intent) {
        this.f1380o0.a();
        super.onActivityResult(i2, i10, intent);
    }

    @Override // d.k, m5.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.p0.f(androidx.lifecycle.p.ON_CREATE);
        h1 h1Var = ((n0) this.f1380o0.B).R;
        h1Var.H = false;
        h1Var.I = false;
        h1Var.O.f1352g = false;
        h1Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((n0) this.f1380o0.B).R.f1315f.onCreateView(null, str, context, attributeSet);
        if (onCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((n0) this.f1380o0.B).R.l();
        this.p0.f(androidx.lifecycle.p.ON_DESTROY);
    }

    @Override // d.k, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 6) {
            return ((n0) this.f1380o0.B).R.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f1382r0 = false;
        ((n0) this.f1380o0.B).R.u(5);
        this.p0.f(androidx.lifecycle.p.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.p0.f(androidx.lifecycle.p.ON_RESUME);
        h1 h1Var = ((n0) this.f1380o0.B).R;
        h1Var.H = false;
        h1Var.I = false;
        h1Var.O.f1352g = false;
        h1Var.u(7);
    }

    @Override // d.k, android.app.Activity
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f1380o0.a();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        d0 d0Var = this.f1380o0;
        d0Var.a();
        super.onResume();
        this.f1382r0 = true;
        ((n0) d0Var.B).R.z(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        d0 d0Var = this.f1380o0;
        d0Var.a();
        n0 n0Var = (n0) d0Var.B;
        super.onStart();
        this.f1383s0 = false;
        if (!this.f1381q0) {
            this.f1381q0 = true;
            h1 h1Var = n0Var.R;
            h1Var.H = false;
            h1Var.I = false;
            h1Var.O.f1352g = false;
            h1Var.u(4);
        }
        n0Var.R.z(true);
        this.p0.f(androidx.lifecycle.p.ON_START);
        h1 h1Var2 = n0Var.R;
        h1Var2.H = false;
        h1Var2.I = false;
        h1Var2.O.f1352g = false;
        h1Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f1380o0.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f1383s0 = true;
        do {
        } while (u(t(), androidx.lifecycle.q.CREATED));
        h1 h1Var = ((n0) this.f1380o0.B).R;
        h1Var.I = true;
        h1Var.O.f1352g = true;
        h1Var.u(4);
        this.p0.f(androidx.lifecycle.p.ON_STOP);
    }

    public final h1 t() {
        return ((n0) this.f1380o0.B).R;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((n0) this.f1380o0.B).R.f1315f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }
}
