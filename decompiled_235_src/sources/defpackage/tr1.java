package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tr1  reason: default package */
/* loaded from: classes.dex */
public abstract class tr1 {
    public static final int a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);
    public static bs1 c;

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(mv0 mv0Var, ix6 ix6Var) {
        bs1 bs1Var;
        int i = 0;
        ix6 ix6Var2 = new ix6(a, b, 0, new r76(19));
        mv0Var.getClass();
        View decorView = mv0Var.getWindow().getDecorView();
        decorView.getClass();
        bs1 bs1Var2 = c;
        bs1 bs1Var3 = bs1Var2;
        if (bs1Var2 == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 35) {
                bs1Var = new Object();
            } else if (i2 >= 30) {
                bs1Var = new Object();
            } else if (i2 >= 29) {
                bs1Var = new Object();
            } else if (i2 >= 28) {
                bs1Var = new Object();
            } else if (i2 >= 26) {
                bs1Var = new Object();
            } else {
                bs1Var = new Object();
            }
            c = bs1Var;
            bs1Var3 = bs1Var;
        }
        bs1 bs1Var4 = bs1Var3;
        q30 q30Var = new q30(bs1Var4, ix6Var, ix6Var2, mv0Var, decorView, 1);
        ViewGroup viewGroup = (ViewGroup) decorView;
        while (true) {
            if (i < viewGroup.getChildCount()) {
                int i3 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    if (childAt.getTag() instanceof bs1) {
                        break;
                    }
                    i = i3;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                sr1 sr1Var = new sr1(q30Var, viewGroup.getContext());
                sr1Var.setTag(bs1Var4);
                sr1Var.setVisibility(8);
                sr1Var.setWillNotDraw(true);
                viewGroup.addView(sr1Var);
                break;
            }
        }
        q30Var.run();
        Window window = mv0Var.getWindow();
        window.getClass();
        bs1Var4.a(window);
    }
}
