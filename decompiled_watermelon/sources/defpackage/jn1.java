package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jn1  reason: default package */
/* loaded from: classes.dex */
public abstract class jn1 {
    public static final int a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);
    public static rn1 c;

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(xp xpVar, ml6 ml6Var, int i) {
        ml6 ml6Var2;
        rn1 rn1Var;
        int i2 = 0;
        if ((i & 1) != 0) {
            ml6Var2 = new ml6(0, 0, 0, new d96(7));
        } else {
            ml6Var2 = ml6Var;
        }
        ml6 ml6Var3 = new ml6(a, b, 0, new d96(7));
        View decorView = xpVar.getWindow().getDecorView();
        decorView.getClass();
        rn1 rn1Var2 = c;
        rn1 rn1Var3 = rn1Var2;
        if (rn1Var2 == null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 35) {
                rn1Var = new Object();
            } else if (i3 >= 30) {
                rn1Var = new Object();
            } else if (i3 >= 29) {
                rn1Var = new Object();
            } else if (i3 >= 28) {
                rn1Var = new Object();
            } else if (i3 >= 26) {
                rn1Var = new Object();
            } else {
                rn1Var = new Object();
            }
            c = rn1Var;
            rn1Var3 = rn1Var;
        }
        rn1 rn1Var4 = rn1Var3;
        w10 w10Var = new w10(rn1Var4, ml6Var2, ml6Var3, xpVar, decorView, 1);
        ViewGroup viewGroup = (ViewGroup) decorView;
        while (true) {
            if (i2 < viewGroup.getChildCount()) {
                int i4 = i2 + 1;
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null) {
                    if (childAt.getTag() instanceof rn1) {
                        break;
                    }
                    i2 = i4;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                in1 in1Var = new in1(w10Var, viewGroup.getContext());
                in1Var.setTag(rn1Var4);
                in1Var.setVisibility(8);
                in1Var.setWillNotDraw(true);
                viewGroup.addView(in1Var);
                break;
            }
        }
        w10Var.run();
        Window window = xpVar.getWindow();
        window.getClass();
        rn1Var4.a(window);
    }
}
