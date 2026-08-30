package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public abstract class p extends ys0 {
    public final t71 q0;
    public boolean s0;
    public boolean t0;
    public final in3 r0 = new in3(this, true);
    public boolean u0 = true;

    public p() {
        xp xpVar = (xp) this;
        this.q0 = new t71(18, new wf2(xpVar));
        this.R.b.c("android:support:lifecycle", new ss0(2, xpVar));
        this.e0.add(new vf2(0, xpVar));
        this.g0.add(new vf2(1, xpVar));
        q(new ts0(xpVar, 1));
    }

    public static boolean u(u uVar, qm3 qm3Var) {
        boolean z = false;
        for (o oVar : uVar.c.f()) {
            if (oVar != null) {
                if (oVar.getHost() != null) {
                    z |= u(oVar.getChildFragmentManager(), qm3Var);
                }
                z zVar = oVar.mViewLifecycleOwner;
                if (zVar != null && zVar.getLifecycle().b().isAtLeast(qm3.STARTED)) {
                    oVar.mViewLifecycleOwner.X.h(qm3Var);
                    z = true;
                }
                if (oVar.mLifecycleRegistry.d.isAtLeast(qm3.STARTED)) {
                    oVar.mLifecycleRegistry.h(qm3Var);
                    z = true;
                }
            }
        }
        return z;
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.p.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // defpackage.ys0, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.q0.p();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.ys0, defpackage.xs0, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.r0.f(pm3.ON_CREATE);
        mg2 mg2Var = ((wf2) this.q0.B).R;
        mg2Var.H = false;
        mg2Var.I = false;
        mg2Var.O.g = false;
        mg2Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((wf2) this.q0.B).R.f.onCreateView(null, str, context, attributeSet);
        if (onCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((wf2) this.q0.B).R.l();
        this.r0.f(pm3.ON_DESTROY);
    }

    @Override // defpackage.ys0, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((wf2) this.q0.B).R.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.t0 = false;
        ((wf2) this.q0.B).R.u(5);
        this.r0.f(pm3.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.r0.f(pm3.ON_RESUME);
        mg2 mg2Var = ((wf2) this.q0.B).R;
        mg2Var.H = false;
        mg2Var.I = false;
        mg2Var.O.g = false;
        mg2Var.u(7);
    }

    @Override // defpackage.ys0, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.q0.p();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        t71 t71Var = this.q0;
        t71Var.p();
        super.onResume();
        this.t0 = true;
        ((wf2) t71Var.B).R.z(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        t71 t71Var = this.q0;
        t71Var.p();
        wf2 wf2Var = (wf2) t71Var.B;
        super.onStart();
        this.u0 = false;
        if (!this.s0) {
            this.s0 = true;
            mg2 mg2Var = wf2Var.R;
            mg2Var.H = false;
            mg2Var.I = false;
            mg2Var.O.g = false;
            mg2Var.u(4);
        }
        wf2Var.R.z(true);
        this.r0.f(pm3.ON_START);
        mg2 mg2Var2 = wf2Var.R;
        mg2Var2.H = false;
        mg2Var2.I = false;
        mg2Var2.O.g = false;
        mg2Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.q0.p();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.u0 = true;
        do {
        } while (u(t(), qm3.CREATED));
        mg2 mg2Var = ((wf2) this.q0.B).R;
        mg2Var.I = true;
        mg2Var.O.g = true;
        mg2Var.u(4);
        this.r0.f(pm3.ON_STOP);
    }

    public final mg2 t() {
        return ((wf2) this.q0.B).R;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((wf2) this.q0.B).R.f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }
}
