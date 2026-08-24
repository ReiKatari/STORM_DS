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
import com.stormds.emulator.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vq  reason: default package */
/* loaded from: classes.dex */
public final class vq implements zk4, k31, a54 {
    public final /* synthetic */ int A;
    public final /* synthetic */ fr B;

    public /* synthetic */ vq(fr frVar, int i) {
        this.A = i;
        this.B = frVar;
    }

    @Override // defpackage.a54
    public boolean M(i44 i44Var) {
        Window.Callback callback;
        int i = this.A;
        fr frVar = this.B;
        switch (i) {
            case 2:
                Window.Callback callback2 = frVar.h0.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, i44Var);
                }
                return true;
            default:
                if (i44Var == i44Var.k() && frVar.A0 && (callback = frVar.h0.getCallback()) != null && !frVar.L0) {
                    callback.onMenuOpened(108, i44Var);
                }
                return true;
        }
    }

    @Override // defpackage.zk4
    public vu7 U(View view, vu7 vu7Var) {
        int i;
        int i2;
        boolean z;
        vu7 vu7Var2;
        iu7 bu7Var;
        int b;
        int c;
        boolean z2;
        int color;
        int d = vu7Var.d();
        fr frVar = this.B;
        Context context = frVar.g0;
        int d2 = vu7Var.d();
        ActionBarContextView actionBarContextView = frVar.q0;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frVar.q0.getLayoutParams();
            boolean z3 = true;
            if (frVar.q0.isShown()) {
                if (frVar.X0 == null) {
                    frVar.X0 = new Rect();
                    frVar.Y0 = new Rect();
                }
                Rect rect = frVar.X0;
                Rect rect2 = frVar.Y0;
                rect.set(vu7Var.b(), vu7Var.d(), vu7Var.c(), vu7Var.a());
                ViewGroup viewGroup = frVar.v0;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z4 = eq7.a;
                    bq7.a(viewGroup, rect, rect2);
                } else {
                    if (!eq7.a) {
                        eq7.a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            eq7.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                eq7.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = eq7.b;
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
                ViewGroup viewGroup2 = frVar.v0;
                WeakHashMap weakHashMap = ao7.a;
                vu7 a = tn7.a(viewGroup2);
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
                if (i3 > 0 && frVar.x0 == null) {
                    View view2 = new View(context);
                    frVar.x0 = view2;
                    i2 = 8;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c;
                    frVar.v0.addView(frVar.x0, -1, layoutParams);
                } else {
                    i2 = 8;
                    View view3 = frVar.x0;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c;
                            frVar.x0.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = frVar.x0;
                if (view4 == null) {
                    z3 = false;
                }
                if (z3 && view4.getVisibility() != 0) {
                    View view5 = frVar.x0;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        color = context.getColor(R.color.abc_decor_view_status_guard_light);
                    } else {
                        color = context.getColor(R.color.abc_decor_view_status_guard);
                    }
                    view5.setBackgroundColor(color);
                }
                if (!frVar.C0 && z3) {
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
                frVar.q0.setLayoutParams(marginLayoutParams);
            }
        } else {
            i = 0;
            i2 = 8;
            z = false;
        }
        View view6 = frVar.x0;
        if (view6 != null) {
            if (z) {
                i2 = i;
            }
            view6.setVisibility(i2);
        }
        if (d != d2) {
            int b2 = vu7Var.b();
            int c2 = vu7Var.c();
            int a2 = vu7Var.a();
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 36) {
                bu7Var = new hu7(vu7Var);
            } else if (i8 >= 35) {
                bu7Var = new gu7(vu7Var);
            } else if (i8 >= 34) {
                bu7Var = new fu7(vu7Var);
            } else if (i8 >= 31) {
                bu7Var = new eu7(vu7Var);
            } else if (i8 >= 30) {
                bu7Var = new du7(vu7Var);
            } else if (i8 >= 29) {
                bu7Var = new cu7(vu7Var);
            } else {
                bu7Var = new bu7(vu7Var);
            }
            bu7Var.h(e83.c(b2, d2, c2, a2));
            vu7Var2 = bu7Var.b();
        } else {
            vu7Var2 = vu7Var;
        }
        WeakHashMap weakHashMap2 = ao7.a;
        WindowInsets f = vu7Var2.f();
        if (f != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(f);
            if (!onApplyWindowInsets.equals(f)) {
                return vu7.g(view, onApplyWindowInsets);
            }
            return vu7Var2;
        }
        return vu7Var2;
    }

    @Override // defpackage.a54
    public void d(i44 i44Var, boolean z) {
        boolean z2;
        int i;
        er erVar;
        int i2 = this.A;
        fr frVar = this.B;
        switch (i2) {
            case 2:
                frVar.u(i44Var);
                return;
            default:
                i44 k = i44Var.k();
                int i3 = 0;
                if (k != i44Var) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i44Var = k;
                }
                er[] erVarArr = frVar.G0;
                if (erVarArr != null) {
                    i = erVarArr.length;
                } else {
                    i = 0;
                }
                while (true) {
                    if (i3 < i) {
                        erVar = erVarArr[i3];
                        if (erVar == null || erVar.h != i44Var) {
                            i3++;
                        }
                    } else {
                        erVar = null;
                    }
                }
                if (erVar != null) {
                    if (z2) {
                        frVar.t(erVar.a, erVar, k);
                        frVar.v(erVar, true);
                        return;
                    }
                    frVar.v(erVar, z);
                    return;
                }
                return;
        }
    }
}
