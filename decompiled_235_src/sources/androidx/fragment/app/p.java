package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class p extends mv0 {
    public final d51 r0;
    public boolean t0;
    public boolean u0;
    public final ku3 s0 = new ku3(this, true);
    public boolean v0 = true;

    public p() {
        jq jqVar = (jq) this;
        this.r0 = new d51(new vk2(jqVar), 20);
        this.R.b.c("android:support:lifecycle", new gv0(jqVar, 2));
        this.f0.add(new uk2(jqVar, 0));
        this.h0.add(new uk2(jqVar, 1));
        q(new hv0(jqVar, 1));
    }

    public static boolean u(u uVar, tt3 tt3Var) {
        boolean z = false;
        for (o oVar : uVar.c.f()) {
            if (oVar != null) {
                if (oVar.getHost() != null) {
                    z |= u(oVar.getChildFragmentManager(), tt3Var);
                }
                z zVar = oVar.mViewLifecycleOwner;
                if (zVar != null && zVar.getLifecycle().b().isAtLeast(tt3.STARTED)) {
                    oVar.mViewLifecycleOwner.X.h(tt3Var);
                    z = true;
                }
                if (oVar.mLifecycleRegistry.d.isAtLeast(tt3.STARTED)) {
                    oVar.mLifecycleRegistry.h(tt3Var);
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
    */
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.t0);
        printWriter.print(" mResumed=");
        printWriter.print(this.u0);
        printWriter.print(" mStopped=");
        printWriter.print(this.v0);
        if (getApplication() != null) {
            ap7 viewModelStore = getViewModelStore();
            viewModelStore.getClass();
            h71 h71Var = h71.b;
            h71Var.getClass();
            eb ebVar = new eb(viewModelStore, tx3.c, h71Var);
            ar0 a = gh5.a(tx3.class);
            String b = a.b();
            if (b != null) {
                un6 un6Var = ((tx3) ebVar.G(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).b;
                if (un6Var.f() > 0) {
                    printWriter.print(str3);
                    printWriter.println("Loaders:");
                    if (un6Var.f() > 0) {
                        if (un6Var.g(0) != null) {
                            u34.a();
                            return;
                        }
                        printWriter.print(str3);
                        printWriter.print("  #");
                        printWriter.print(un6Var.d(0));
                        printWriter.print(": ");
                        throw null;
                    }
                }
            } else {
                defpackage.i.h("Local and anonymous classes can not be ViewModels");
                return;
            }
        }
        ((vk2) this.r0.B).R.v(str, fileDescriptor, printWriter, strArr);
    }

    @Override // defpackage.mv0, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.r0.l();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.mv0, defpackage.lv0, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.s0.f(st3.ON_CREATE);
        ll2 ll2Var = ((vk2) this.r0.B).R;
        ll2Var.H = false;
        ll2Var.I = false;
        ll2Var.O.g = false;
        ll2Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((vk2) this.r0.B).R.f.onCreateView(null, str, context, attributeSet);
        if (onCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((vk2) this.r0.B).R.l();
        this.s0.f(st3.ON_DESTROY);
    }

    @Override // defpackage.mv0, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((vk2) this.r0.B).R.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.u0 = false;
        ((vk2) this.r0.B).R.u(5);
        this.s0.f(st3.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.s0.f(st3.ON_RESUME);
        ll2 ll2Var = ((vk2) this.r0.B).R;
        ll2Var.H = false;
        ll2Var.I = false;
        ll2Var.O.g = false;
        ll2Var.u(7);
    }

    @Override // defpackage.mv0, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.r0.l();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        d51 d51Var = this.r0;
        d51Var.l();
        super.onResume();
        this.u0 = true;
        ((vk2) d51Var.B).R.z(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        d51 d51Var = this.r0;
        d51Var.l();
        vk2 vk2Var = (vk2) d51Var.B;
        super.onStart();
        this.v0 = false;
        if (!this.t0) {
            this.t0 = true;
            ll2 ll2Var = vk2Var.R;
            ll2Var.H = false;
            ll2Var.I = false;
            ll2Var.O.g = false;
            ll2Var.u(4);
        }
        vk2Var.R.z(true);
        this.s0.f(st3.ON_START);
        ll2 ll2Var2 = vk2Var.R;
        ll2Var2.H = false;
        ll2Var2.I = false;
        ll2Var2.O.g = false;
        ll2Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.r0.l();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.v0 = true;
        do {
        } while (u(t(), tt3.CREATED));
        ll2 ll2Var = ((vk2) this.r0.B).R;
        ll2Var.I = true;
        ll2Var.O.g = true;
        ll2Var.u(4);
        this.s0.f(st3.ON_STOP);
    }

    public final ll2 t() {
        return ((vk2) this.r0.B).R;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((vk2) this.r0.B).R.f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }
}
