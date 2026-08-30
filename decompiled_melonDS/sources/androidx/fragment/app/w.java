package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class w extends j0 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler A;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f1430d0;

    /* renamed from: f0  reason: collision with root package name */
    public Dialog f1432f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f1433g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f1434h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f1435i0;
    public final r B = new r(0, this);
    public final s L = new s(this);
    public final t R = new t(this);
    public int X = 0;
    public int Y = 0;
    public boolean Z = true;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f1428b0 = true;

    /* renamed from: c0  reason: collision with root package name */
    public int f1429c0 = -1;

    /* renamed from: e0  reason: collision with root package name */
    public final u f1431e0 = new u(this);

    /* renamed from: j0  reason: collision with root package name */
    public boolean f1436j0 = false;

    @Override // androidx.fragment.app.j0
    public final r0 createFragmentContainer() {
        return new v(this, super.createFragmentContainer());
    }

    public final void h(boolean z10, boolean z11) {
        if (this.f1434h0) {
            return;
        }
        this.f1434h0 = true;
        this.f1435i0 = false;
        Dialog dialog = this.f1432f0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1432f0.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.A.getLooper()) {
                    onDismiss(this.f1432f0);
                } else {
                    this.A.post(this.B);
                }
            }
        }
        this.f1433g0 = true;
        if (this.f1429c0 >= 0) {
            g1 parentFragmentManager = getParentFragmentManager();
            int i2 = this.f1429c0;
            parentFragmentManager.getClass();
            if (i2 >= 0) {
                parentFragmentManager.x(new e1(parentFragmentManager, i2), z10);
                this.f1429c0 = -1;
                return;
            }
            a0.j.h(w.d.l(i2, "Bad id: "));
            return;
        }
        g1 parentFragmentManager2 = getParentFragmentManager();
        parentFragmentManager2.getClass();
        a aVar = new a(parentFragmentManager2);
        aVar.f1243r = true;
        g1 g1Var = this.mFragmentManager;
        if (g1Var != null && g1Var != aVar.f1245t) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        aVar.b(new r1(this, 3));
        if (z10) {
            aVar.f(true, true);
        } else {
            aVar.e();
        }
    }

    public Dialog i() {
        if (g1.K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new d.m(requireContext(), this.Y);
    }

    public final void j(g1 g1Var, String str) {
        this.f1434h0 = false;
        this.f1435i0 = true;
        g1Var.getClass();
        a aVar = new a(g1Var);
        aVar.f1243r = true;
        aVar.g(0, this, str, 1);
        aVar.e();
    }

    @Override // androidx.fragment.app.j0
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().d(this.f1431e0);
        if (!this.f1435i0) {
            this.f1434h0 = false;
        }
    }

    @Override // androidx.fragment.app.j0
    public void onCreate(Bundle bundle) {
        boolean z10;
        super.onCreate(bundle);
        this.A = new Handler();
        if (this.mContainerId == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f1428b0 = z10;
        if (bundle != null) {
            this.X = bundle.getInt("android:style", 0);
            this.Y = bundle.getInt("android:theme", 0);
            this.Z = bundle.getBoolean("android:cancelable", true);
            this.f1428b0 = bundle.getBoolean("android:showsDialog", this.f1428b0);
            this.f1429c0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.j0
    public final void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f1432f0;
        if (dialog != null) {
            this.f1433g0 = true;
            dialog.setOnDismissListener(null);
            this.f1432f0.dismiss();
            if (!this.f1434h0) {
                onDismiss(this.f1432f0);
            }
            this.f1432f0 = null;
            this.f1436j0 = false;
        }
    }

    @Override // androidx.fragment.app.j0
    public final void onDetach() {
        super.onDetach();
        if (!this.f1435i0 && !this.f1434h0) {
            this.f1434h0 = true;
        }
        getViewLifecycleOwnerLiveData().g(this.f1431e0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f1433g0) {
            if (g1.K(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            h(true, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0046, B:29:0x0050, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x0068), top: B:49:0x001a }] */
    @Override // androidx.fragment.app.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.onGetLayoutInflater(r8)
            boolean r0 = r7.f1428b0
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L9a
            boolean r3 = r7.f1430d0
            if (r3 == 0) goto L11
            goto L9a
        L11:
            if (r0 != 0) goto L14
            goto L71
        L14:
            boolean r0 = r7.f1436j0
            if (r0 != 0) goto L71
            r0 = 0
            r3 = 1
            r7.f1430d0 = r3     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.i()     // Catch: java.lang.Throwable -> L4e
            r7.f1432f0 = r4     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r7.f1428b0     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L68
            int r5 = r7.X     // Catch: java.lang.Throwable -> L4e
            if (r5 == r3) goto L3b
            if (r5 == r2) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L4e
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L4e
        L3e:
            android.content.Context r4 = r7.getContext()     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r4 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L50
            android.app.Dialog r5 = r7.f1432f0     // Catch: java.lang.Throwable -> L4e
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L4e
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            r8 = move-exception
            goto L6e
        L50:
            android.app.Dialog r4 = r7.f1432f0     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r7.Z     // Catch: java.lang.Throwable -> L4e
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.f1432f0     // Catch: java.lang.Throwable -> L4e
            androidx.fragment.app.s r5 = r7.L     // Catch: java.lang.Throwable -> L4e
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.f1432f0     // Catch: java.lang.Throwable -> L4e
            androidx.fragment.app.t r5 = r7.R     // Catch: java.lang.Throwable -> L4e
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L4e
            r7.f1436j0 = r3     // Catch: java.lang.Throwable -> L4e
            goto L6b
        L68:
            r3 = 0
            r7.f1432f0 = r3     // Catch: java.lang.Throwable -> L4e
        L6b:
            r7.f1430d0 = r0
            goto L71
        L6e:
            r7.f1430d0 = r0
            throw r8
        L71:
            boolean r0 = androidx.fragment.app.g1.K(r2)
            if (r0 == 0) goto L8d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L8d:
            android.app.Dialog r0 = r7.f1432f0
            if (r0 == 0) goto Lc5
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
            return r8
        L9a:
            boolean r0 = androidx.fragment.app.g1.K(r2)
            if (r0 == 0) goto Lc5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r2 = r7.f1428b0
            if (r2 != 0) goto Lbc
            java.lang.String r2 = "mShowsDialog = false: "
            java.lang.String r0 = r2.concat(r0)
            android.util.Log.d(r1, r0)
            return r8
        Lbc:
            java.lang.String r2 = "mCreatingDialog = true: "
            java.lang.String r0 = r2.concat(r0)
            android.util.Log.d(r1, r0)
        Lc5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w.onGetLayoutInflater(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // androidx.fragment.app.j0
    public void onSaveInstanceState(Bundle bundle) {
        Dialog dialog = this.f1432f0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i2 = this.X;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i10 = this.Y;
        if (i10 != 0) {
            bundle.putInt("android:theme", i10);
        }
        boolean z10 = this.Z;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f1428b0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i11 = this.f1429c0;
        if (i11 != -1) {
            bundle.putInt("android:backStackId", i11);
        }
    }

    @Override // androidx.fragment.app.j0
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f1432f0;
        if (dialog != null) {
            this.f1433g0 = false;
            dialog.show();
            View decorView = this.f1432f0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.j0
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f1432f0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.j0
    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f1432f0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f1432f0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.j0
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.f1432f0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f1432f0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
