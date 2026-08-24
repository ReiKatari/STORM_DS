package defpackage;

import android.os.HandlerThread;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.settings.SettingsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rk3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rk3 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ rk3(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CharSequence h0;
        boolean z;
        View findFocus;
        int i = this.A;
        Boolean bool = null;
        Object obj = this.B;
        switch (i) {
            case 0:
                int i2 = LayoutEditorActivity.N0;
                ((LayoutEditorActivity) obj).E();
                return;
            case 1:
                ci0 ci0Var = (ci0) obj;
                if (((gj0) ci0Var.d) != null) {
                    ci0Var.m();
                    zt3 zt3Var = (zt3) ci0Var.e;
                    zt3Var.getClass();
                    Set<my> set = (HashSet) ci0Var.h;
                    synchronized (zt3Var.a) {
                        if (set == null) {
                            try {
                                set = zt3Var.b.keySet();
                            } finally {
                            }
                        }
                        for (my myVar : set) {
                            if (zt3Var.b.containsKey(myVar)) {
                                zt3Var.k((vt3) zt3Var.b.get(myVar));
                            }
                        }
                    }
                    return;
                }
                return;
            case 2:
                rc3 rc3Var = (rc3) obj;
                if (rc3Var != null) {
                    rc3Var.h(null);
                    return;
                }
                return;
            case 3:
                MaterialButton.a((MaterialButton) obj);
                return;
            case 4:
                w64 w64Var = (w64) obj;
                w64Var.m0 = true;
                w64Var.invalidate();
                return;
            case 5:
                nw4 nw4Var = (nw4) obj;
                f35 f35Var = nw4Var.e;
                if (f35Var != null) {
                    f35Var.a.m();
                }
                nw4Var.e = null;
                return;
            case 6:
                ((p25) obj).r();
                return;
            case 7:
                h35 h35Var = (h35) obj;
                ku3 ku3Var = h35Var.Y;
                if (h35Var.B == 0) {
                    h35Var.L = true;
                    ku3Var.f(st3.ON_PAUSE);
                }
                if (h35Var.A == 0 && h35Var.L) {
                    ku3Var.f(st3.ON_STOP);
                    h35Var.R = true;
                    return;
                }
                return;
            case 8:
                ((id5) obj).o();
                return;
            case 9:
                hq5.a((hq5) obj);
                return;
            case 10:
                SettingsActivity settingsActivity = (SettingsActivity) obj;
                tp6 tp6Var = settingsActivity.B0;
                ak7 w = settingsActivity.w();
                String str = (w == null || (h0 = w.h0()) == null || (str = h0.toString()) == null) ? "" : "";
                tp6Var.getClass();
                tp6Var.m(null, str);
                settingsActivity.C0.l(null);
                return;
            case 11:
                k60 k60Var = (k60) obj;
                k60Var.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) k60Var.e;
                ho7 ho7Var = sideSheetBehavior.i;
                if (ho7Var != null && ho7Var.f()) {
                    k60Var.a(k60Var.b);
                    return;
                } else if (sideSheetBehavior.h == 2) {
                    sideSheetBehavior.w(k60Var.b);
                    return;
                } else {
                    return;
                }
            case 12:
                qs0 qs0Var = (qs0) ((m44) obj).R;
                if (qs0Var != null) {
                    for (V v : qs0Var.values()) {
                        v.b();
                    }
                    return;
                }
                return;
            case 13:
                int[] iArr = SwipeRefreshLayout.H0;
                ((SwipeRefreshLayout) obj).l();
                return;
            case 14:
                fx6 fx6Var = ((hx6) obj).a;
                ViewParent parent = fx6Var.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(fx6Var);
                    return;
                }
                return;
            case 15:
                ((wy6) obj).b();
                return;
            case 16:
                ((TextInputLayout) obj).d0.requestLayout();
                return;
            case 17:
                r37 r37Var = (r37) obj;
                bt btVar = r37Var.b;
                r37Var.n = null;
                ua4 ua4Var = r37Var.m;
                View view = r37Var.a;
                if (!view.isFocused() && (findFocus = view.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                    ua4Var.g();
                    return;
                }
                Object[] objArr = ua4Var.A;
                int i3 = ua4Var.L;
                Boolean bool2 = null;
                for (int i4 = 0; i4 < i3; i4++) {
                    p37 p37Var = (p37) objArr[i4];
                    int i5 = q37.a[p37Var.ordinal()];
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 3 && i5 != 4) {
                                i.d();
                                return;
                            }
                            if (!nb3.k(bool, Boolean.FALSE)) {
                                if (p37Var == p37.ShowKeyboard) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                bool2 = Boolean.valueOf(z);
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    bool2 = bool;
                }
                ua4Var.g();
                if (nb3.k(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((go3) btVar.L).getValue()).restartInput((View) btVar.B);
                }
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        ((s35) ((s35) btVar.R).A).E();
                    } else {
                        ((s35) ((s35) btVar.R).A).z();
                    }
                }
                if (nb3.k(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((go3) btVar.L).getValue()).restartInput((View) btVar.B);
                    return;
                }
                return;
            case 18:
                HandlerThread handlerThread = (HandlerThread) obj;
                handlerThread.quit();
                handlerThread.join(1000L);
                return;
            default:
                ExecutorService executorService = (ExecutorService) obj;
                executorService.shutdownNow();
                executorService.awaitTermination(1L, TimeUnit.SECONDS);
                return;
        }
    }
}
