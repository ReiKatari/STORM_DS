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
import me.magnum.melonds.ui.settings.SettingsActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tm3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tm3 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ tm3(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CharSequence q0;
        boolean z;
        View findFocus;
        int i = this.A;
        Boolean bool = null;
        Object obj = this.B;
        switch (i) {
            case 0:
                tf0 tf0Var = (tf0) obj;
                if (((xg0) tf0Var.R) != null) {
                    tf0Var.m();
                    xm3 xm3Var = (xm3) tf0Var.X;
                    xm3Var.getClass();
                    Set<ex> set = (HashSet) tf0Var.c0;
                    synchronized (xm3Var.a) {
                        if (set == null) {
                            try {
                                set = xm3Var.b.keySet();
                            } finally {
                            }
                        }
                        for (ex exVar : set) {
                            if (xm3Var.b.containsKey(exVar)) {
                                xm3Var.k((sm3) xm3Var.b.get(exVar));
                            }
                        }
                    }
                    return;
                }
                return;
            case 1:
                c63 c63Var = (c63) obj;
                if (c63Var != null) {
                    c63Var.i(null);
                    return;
                }
                return;
            case 2:
                MaterialButton.a((MaterialButton) obj);
                return;
            case 3:
                in4 in4Var = (in4) obj;
                bu4 bu4Var = in4Var.e;
                if (bu4Var != null) {
                    bu4Var.a.m();
                }
                in4Var.e = null;
                return;
            case 4:
                ((nt4) obj).r();
                return;
            case 5:
                du4 du4Var = (du4) obj;
                in3 in3Var = du4Var.Y;
                if (du4Var.B == 0) {
                    du4Var.L = true;
                    in3Var.f(pm3.ON_PAUSE);
                }
                if (du4Var.A == 0 && du4Var.L) {
                    in3Var.f(pm3.ON_STOP);
                    du4Var.R = true;
                    return;
                }
                return;
            case ig7.b /* 6 */:
                ((y35) obj).o();
                return;
            case 7:
                jg5.a((jg5) obj);
                return;
            case 8:
                SettingsActivity settingsActivity = (SettingsActivity) obj;
                ee6 ee6Var = settingsActivity.A0;
                ct3 w = settingsActivity.w();
                String str = (w == null || (q0 = w.q0()) == null || (str = q0.toString()) == null) ? "" : "";
                ee6Var.getClass();
                ee6Var.l(null, str);
                settingsActivity.B0.k(null);
                return;
            case 9:
                l40 l40Var = (l40) obj;
                l40Var.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) l40Var.e;
                ha7 ha7Var = sideSheetBehavior.i;
                if (ha7Var != null && ha7Var.f()) {
                    l40Var.a(l40Var.b);
                    return;
                } else if (sideSheetBehavior.h == 2) {
                    sideSheetBehavior.r(l40Var.b);
                    return;
                } else {
                    return;
                }
            case 10:
                dq0 dq0Var = (dq0) ((n85) obj).R;
                if (dq0Var != null) {
                    for (V v : dq0Var.values()) {
                        v.b();
                    }
                    return;
                }
                return;
            case 11:
                int[] iArr = SwipeRefreshLayout.G0;
                ((SwipeRefreshLayout) obj).l();
                return;
            case mj2.L /* 12 */:
                jl6 jl6Var = ((ll6) obj).a;
                ViewParent parent = jl6Var.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(jl6Var);
                    return;
                }
                return;
            case 13:
                ((mm6) obj).b();
                return;
            case 14:
                ((TextInputLayout) obj).c0.requestLayout();
                return;
            case ig7.e /* 15 */:
                cr6 cr6Var = (cr6) obj;
                os osVar = cr6Var.b;
                cr6Var.n = null;
                o24 o24Var = cr6Var.m;
                View view = cr6Var.a;
                if (!view.isFocused() && (findFocus = view.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                    o24Var.h();
                    return;
                }
                Object[] objArr = o24Var.A;
                int i2 = o24Var.L;
                Boolean bool2 = null;
                for (int i3 = 0; i3 < i2; i3++) {
                    ar6 ar6Var = (ar6) objArr[i3];
                    int i4 = br6.a[ar6Var.ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3 && i4 != 4) {
                                i.c();
                                return;
                            }
                            if (!b53.x(bool, Boolean.FALSE)) {
                                if (ar6Var == ar6.ShowKeyboard) {
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
                o24Var.h();
                if (b53.x(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((gh3) osVar.L).getValue()).restartInput((View) osVar.B);
                }
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        ((dz4) ((dz4) osVar.R).A).A();
                    } else {
                        ((dz4) ((dz4) osVar.R).A).v();
                    }
                }
                if (b53.x(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((gh3) osVar.L).getValue()).restartInput((View) osVar.B);
                    return;
                }
                return;
            case 16:
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
