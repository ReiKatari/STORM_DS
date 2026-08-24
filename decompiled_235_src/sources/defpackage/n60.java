package defpackage;

import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n60  reason: default package */
/* loaded from: classes.dex */
public final class n60 extends i60 {
    public final Boolean a;
    public final vu7 b;
    public Window c;
    public boolean d;

    public n60(View view, vu7 vu7Var) {
        ColorStateList backgroundTintList;
        Integer num;
        this.b = vu7Var;
        p24 p24Var = BottomSheetBehavior.A(view).i;
        if (p24Var != null) {
            backgroundTintList = p24Var.B.d;
        } else {
            backgroundTintList = view.getBackgroundTintList();
        }
        if (backgroundTintList != null) {
            this.a = Boolean.valueOf(mp2.L(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList r = u24.r(view.getBackground());
        if (r != null) {
            num = Integer.valueOf(r.getDefaultColor());
        } else {
            num = null;
        }
        if (num != null) {
            this.a = Boolean.valueOf(mp2.L(num.intValue()));
        } else {
            this.a = null;
        }
    }

    @Override // defpackage.i60
    public final void a(View view) {
        d(view);
    }

    @Override // defpackage.i60
    public final void b(View view) {
        d(view);
    }

    @Override // defpackage.i60
    public final void c(View view, int i) {
        d(view);
    }

    public final void d(View view) {
        bv7 wu7Var;
        boolean booleanValue;
        bv7 wu7Var2;
        int top = view.getTop();
        vu7 vu7Var = this.b;
        if (top < vu7Var.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                if (bool == null) {
                    booleanValue = this.d;
                } else {
                    booleanValue = bool.booleanValue();
                }
                s35 s35Var = new s35(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                if (i >= 35) {
                    wu7Var2 = new zu7(window, s35Var);
                } else if (i >= 30) {
                    wu7Var2 = new zu7(window, s35Var);
                } else if (i >= 26) {
                    wu7Var2 = new wu7(window, s35Var);
                } else {
                    wu7Var2 = new wu7(window, s35Var);
                }
                wu7Var2.d(booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), vu7Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
        } else if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                boolean z = this.d;
                s35 s35Var2 = new s35(window2.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 35) {
                    wu7Var = new zu7(window2, s35Var2);
                } else if (i2 >= 30) {
                    wu7Var = new zu7(window2, s35Var2);
                } else if (i2 >= 26) {
                    wu7Var = new wu7(window2, s35Var2);
                } else {
                    wu7Var = new wu7(window2, s35Var2);
                }
                wu7Var.d(z);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.c != window) {
            this.c = window;
            if (window != null) {
                this.d = new cv7(window, window.getDecorView()).a.b();
            }
        }
    }
}
