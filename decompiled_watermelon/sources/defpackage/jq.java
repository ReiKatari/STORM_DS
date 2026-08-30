package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jq  reason: default package */
/* loaded from: classes.dex */
public final class jq implements bc4, f01, lx3 {
    public final /* synthetic */ int A;
    public final /* synthetic */ tq B;

    public /* synthetic */ jq(tq tqVar, int i) {
        this.A = i;
        this.B = tqVar;
    }

    @Override // defpackage.bc4
    public vf7 G(View view, vf7 vf7Var) {
        int i;
        int i2;
        boolean z;
        vf7 vf7Var2;
        if7 af7Var;
        int b;
        int c;
        boolean z2;
        int color;
        int d = vf7Var.d();
        tq tqVar = this.B;
        Context context = tqVar.f0;
        int d2 = vf7Var.d();
        ActionBarContextView actionBarContextView = tqVar.p0;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tqVar.p0.getLayoutParams();
            boolean z3 = true;
            if (tqVar.p0.isShown()) {
                if (tqVar.W0 == null) {
                    tqVar.W0 = new Rect();
                    tqVar.X0 = new Rect();
                }
                Rect rect = tqVar.W0;
                Rect rect2 = tqVar.X0;
                rect.set(vf7Var.b(), vf7Var.d(), vf7Var.c(), vf7Var.a());
                ViewGroup viewGroup = tqVar.u0;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = dc7.a;
                    ac7.a(viewGroup, rect, rect2);
                } else {
                    if (!dc7.a) {
                        dc7.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            dc7.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                dc7.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = dc7.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i3 = rect.top;
                int i4 = rect.left;
                int i5 = rect.right;
                ViewGroup viewGroup2 = tqVar.u0;
                WeakHashMap weakHashMap = aa7.a;
                vf7 a = t97.a(viewGroup2);
                if (a == null) {
                    b = 0;
                } else {
                    b = a.b();
                }
                if (a == null) {
                    c = 0;
                } else {
                    c = a.c();
                }
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                if (i3 > 0 && tqVar.w0 == null) {
                    View view2 = new View(context);
                    tqVar.w0 = view2;
                    i2 = 8;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c;
                    tqVar.u0.addView(tqVar.w0, -1, layoutParams);
                } else {
                    i2 = 8;
                    View view3 = tqVar.w0;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c;
                            tqVar.w0.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = tqVar.w0;
                if (view4 == null) {
                    z3 = false;
                }
                if (z3 && view4.getVisibility() != 0) {
                    View view5 = tqVar.w0;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        color = context.getColor(R.color.abc_decor_view_status_guard_light);
                    } else {
                        color = context.getColor(R.color.abc_decor_view_status_guard);
                    }
                    view5.setBackgroundColor(color);
                }
                if (!tqVar.B0 && z3) {
                    d2 = 0;
                }
                i = 0;
                z = z3;
                z3 = z2;
            } else {
                i2 = 8;
                i = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z = false;
                } else {
                    z = false;
                    z3 = false;
                }
            }
            if (z3) {
                tqVar.p0.setLayoutParams(marginLayoutParams);
            }
        } else {
            i = 0;
            i2 = 8;
            z = false;
        }
        View view6 = tqVar.w0;
        if (view6 != null) {
            if (z) {
                i2 = i;
            }
            view6.setVisibility(i2);
        }
        if (d != d2) {
            int b2 = vf7Var.b();
            int c2 = vf7Var.c();
            int a2 = vf7Var.a();
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 36) {
                af7Var = new hf7(vf7Var);
            } else if (i8 >= 35) {
                af7Var = new gf7(vf7Var);
            } else if (i8 >= 34) {
                af7Var = new ff7(vf7Var);
            } else if (i8 >= 31) {
                af7Var = new ef7(vf7Var);
            } else if (i8 >= 30) {
                af7Var = new df7(vf7Var);
            } else if (i8 >= 29) {
                af7Var = new cf7(vf7Var);
            } else {
                af7Var = new af7(vf7Var);
            }
            af7Var.h(x13.c(b2, d2, c2, a2));
            vf7Var2 = af7Var.b();
        } else {
            vf7Var2 = vf7Var;
        }
        WeakHashMap weakHashMap2 = aa7.a;
        WindowInsets f = vf7Var2.f();
        if (f != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(f);
            if (!onApplyWindowInsets.equals(f)) {
                return vf7.g(view, onApplyWindowInsets);
            }
            return vf7Var2;
        }
        return vf7Var2;
    }

    @Override // defpackage.lx3
    public boolean M(uw3 uw3Var) {
        Window.Callback callback;
        int i = this.A;
        tq tqVar = this.B;
        switch (i) {
            case 2:
                Window.Callback callback2 = tqVar.g0.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, uw3Var);
                }
                return true;
            default:
                if (uw3Var == uw3Var.k() && tqVar.z0 && (callback = tqVar.g0.getCallback()) != null && !tqVar.K0) {
                    callback.onMenuOpened(108, uw3Var);
                }
                return true;
        }
    }

    @Override // defpackage.lx3
    public void f(uw3 uw3Var, boolean z) {
        boolean z2;
        int i;
        sq sqVar;
        int i2 = this.A;
        tq tqVar = this.B;
        switch (i2) {
            case 2:
                tqVar.p(uw3Var);
                return;
            default:
                uw3 k = uw3Var.k();
                int i3 = 0;
                if (k != uw3Var) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    uw3Var = k;
                }
                sq[] sqVarArr = tqVar.F0;
                if (sqVarArr != null) {
                    i = sqVarArr.length;
                } else {
                    i = 0;
                }
                while (true) {
                    if (i3 < i) {
                        sqVar = sqVarArr[i3];
                        if (sqVar == null || sqVar.h != uw3Var) {
                            i3++;
                        }
                    } else {
                        sqVar = null;
                    }
                }
                if (sqVar != null) {
                    if (z2) {
                        tqVar.o(sqVar.a, sqVar, k);
                        tqVar.q(sqVar, true);
                        return;
                    }
                    tqVar.q(sqVar, z);
                    return;
                }
                return;
        }
    }
}
