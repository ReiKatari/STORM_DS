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
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class i extends o implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler A;
    public boolean e0;
    public Dialog g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public final es4 B = new es4(4, this);
    public final te1 L = new te1(this);
    public final ue1 R = new ue1(this);
    public int X = 0;
    public int Y = 0;
    public boolean Z = true;
    public boolean c0 = true;
    public int d0 = -1;
    public final ve1 f0 = new ve1(this);
    public boolean k0 = false;

    @Override // androidx.fragment.app.o
    public final ag2 createFragmentContainer() {
        return new we1(this, super.createFragmentContainer());
    }

    public final void h(boolean z, boolean z2) {
        if (this.i0) {
            return;
        }
        this.i0 = true;
        this.j0 = false;
        Dialog dialog = this.g0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.g0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.A.getLooper()) {
                    onDismiss(this.g0);
                } else {
                    this.A.post(this.B);
                }
            }
        }
        this.h0 = true;
        if (this.d0 >= 0) {
            u parentFragmentManager = getParentFragmentManager();
            int i = this.d0;
            parentFragmentManager.getClass();
            if (i >= 0) {
                parentFragmentManager.x(new lg2(parentFragmentManager, i), z);
                this.d0 = -1;
                return;
            }
            defpackage.i.i(wh1.g(i, "Bad id: "));
            return;
        }
        u parentFragmentManager2 = getParentFragmentManager();
        parentFragmentManager2.getClass();
        a aVar = new a(parentFragmentManager2);
        aVar.r = true;
        u uVar = this.mFragmentManager;
        if (uVar != null && uVar != aVar.t) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        aVar.b(new vg2(this, 3));
        if (z) {
            aVar.g(true, true);
        } else {
            aVar.f();
        }
    }

    public Dialog i() {
        if (u.K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new bt0(requireContext(), this.Y);
    }

    public final void j(u uVar, String str) {
        this.i0 = false;
        this.j0 = true;
        uVar.getClass();
        a aVar = new a(uVar);
        aVar.r = true;
        aVar.h(0, this, str, 1);
        aVar.f();
    }

    @Override // androidx.fragment.app.o
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().d(this.f0);
        if (!this.j0) {
            this.i0 = false;
        }
    }

    @Override // androidx.fragment.app.o
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        this.A = new Handler();
        if (this.mContainerId == 0) {
            z = true;
        } else {
            z = false;
        }
        this.c0 = z;
        if (bundle != null) {
            this.X = bundle.getInt("android:style", 0);
            this.Y = bundle.getInt("android:theme", 0);
            this.Z = bundle.getBoolean("android:cancelable", true);
            this.c0 = bundle.getBoolean("android:showsDialog", this.c0);
            this.d0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.g0;
        if (dialog != null) {
            this.h0 = true;
            dialog.setOnDismissListener(null);
            this.g0.dismiss();
            if (!this.i0) {
                onDismiss(this.g0);
            }
            this.g0 = null;
            this.k0 = false;
        }
    }

    @Override // androidx.fragment.app.o
    public final void onDetach() {
        super.onDetach();
        if (!this.j0 && !this.i0) {
            this.i0 = true;
        }
        getViewLifecycleOwnerLiveData().e(this.f0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.h0) {
            if (u.K(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            h(true, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0046, B:29:0x0050, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x0068), top: B:49:0x001a }] */
    @Override // androidx.fragment.app.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.onGetLayoutInflater(r8)
            boolean r0 = r7.c0
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L9a
            boolean r3 = r7.e0
            if (r3 == 0) goto L11
            goto L9a
        L11:
            if (r0 != 0) goto L14
            goto L71
        L14:
            boolean r0 = r7.k0
            if (r0 != 0) goto L71
            r0 = 0
            r3 = 1
            r7.e0 = r3     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.i()     // Catch: java.lang.Throwable -> L4e
            r7.g0 = r4     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r7.c0     // Catch: java.lang.Throwable -> L4e
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
            android.app.Dialog r5 = r7.g0     // Catch: java.lang.Throwable -> L4e
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L4e
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            r8 = move-exception
            goto L6e
        L50:
            android.app.Dialog r4 = r7.g0     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r7.Z     // Catch: java.lang.Throwable -> L4e
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.g0     // Catch: java.lang.Throwable -> L4e
            te1 r5 = r7.L     // Catch: java.lang.Throwable -> L4e
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.g0     // Catch: java.lang.Throwable -> L4e
            ue1 r5 = r7.R     // Catch: java.lang.Throwable -> L4e
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L4e
            r7.k0 = r3     // Catch: java.lang.Throwable -> L4e
            goto L6b
        L68:
            r3 = 0
            r7.g0 = r3     // Catch: java.lang.Throwable -> L4e
        L6b:
            r7.e0 = r0
            goto L71
        L6e:
            r7.e0 = r0
            throw r8
        L71:
            boolean r0 = androidx.fragment.app.u.K(r2)
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
            android.app.Dialog r7 = r7.g0
            if (r7 == 0) goto Lc5
            android.content.Context r7 = r7.getContext()
            android.view.LayoutInflater r7 = r8.cloneInContext(r7)
            return r7
        L9a:
            boolean r0 = androidx.fragment.app.u.K(r2)
            if (r0 == 0) goto Lc5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r7 = r7.c0
            if (r7 != 0) goto Lbc
            java.lang.String r7 = "mShowsDialog = false: "
            java.lang.String r7 = r7.concat(r0)
            android.util.Log.d(r1, r7)
            return r8
        Lbc:
            java.lang.String r7 = "mCreatingDialog = true: "
            java.lang.String r7 = r7.concat(r0)
            android.util.Log.d(r1, r7)
        Lc5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.i.onGetLayoutInflater(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // androidx.fragment.app.o
    public void onSaveInstanceState(Bundle bundle) {
        Dialog dialog = this.g0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.X;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.Y;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.Z;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.c0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.d0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.o
    public void onStart() {
        super.onStart();
        Dialog dialog = this.g0;
        if (dialog != null) {
            this.h0 = false;
            dialog.show();
            View decorView = this.g0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.o
    public void onStop() {
        super.onStop();
        Dialog dialog = this.g0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.o
    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.g0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.g0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.o
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView == null && this.g0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.g0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
