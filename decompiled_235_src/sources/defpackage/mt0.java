package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mt0  reason: default package */
/* loaded from: classes.dex */
public final class mt0 {
    public final int a;
    public final k45 b;
    public e83 c;
    public e83 d;
    public l45 e;
    public final ColorDrawable f;
    public boolean g;
    public int h;

    static {
        new PathInterpolator(RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 1.0f);
        new PathInterpolator(0.6f, RecyclerView.B1, 1.0f, 1.0f);
        new PathInterpolator(RecyclerView.B1, RecyclerView.B1, 0.2f, 1.0f);
        new PathInterpolator(0.4f, RecyclerView.B1, 1.0f, 1.0f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k45] */
    public mt0(int i, int i2) {
        ?? obj = new Object();
        obj.a = -1;
        obj.b = -1;
        e83 e83Var = e83.e;
        obj.c = e83Var;
        obj.d = false;
        obj.e = null;
        obj.f = RecyclerView.B1;
        obj.g = RecyclerView.B1;
        obj.h = 1.0f;
        this.b = obj;
        this.c = e83Var;
        this.d = e83Var;
        this.e = null;
        if (i != 1 && i != 2 && i != 4 && i != 8) {
            i.h(lb1.g(i, "Unexpected side: "));
            throw null;
        }
        this.a = i;
        ColorDrawable colorDrawable = new ColorDrawable();
        this.f = colorDrawable;
        this.h = 0;
        this.g = true;
        if (i2 != 0) {
            this.h = i2;
            colorDrawable.setColor(i2);
            obj.e = colorDrawable;
            ap3 ap3Var = obj.i;
            if (ap3Var != null) {
                ((View) ap3Var.L).setBackground(colorDrawable);
            }
        }
    }

    public final void a(float f) {
        float f2 = f * 1.0f;
        k45 k45Var = this.b;
        if (k45Var.h != f2) {
            k45Var.h = f2;
            ap3 ap3Var = k45Var.i;
            if (ap3Var != null) {
                ((View) ap3Var.L).setAlpha(f2);
            }
        }
    }

    public final void b(float f) {
        float f2 = f * 1.0f;
        k45 k45Var = this.b;
        int i = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        float f3 = (1.0f - f2) * k45Var.b;
                        if (k45Var.g != f3) {
                            k45Var.g = f3;
                            ap3 ap3Var = k45Var.i;
                            if (ap3Var != null) {
                                ((View) ap3Var.L).setTranslationY(f3);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                float f4 = (1.0f - f2) * k45Var.a;
                if (k45Var.f != f4) {
                    k45Var.f = f4;
                    ap3 ap3Var2 = k45Var.i;
                    if (ap3Var2 != null) {
                        ((View) ap3Var2.L).setTranslationX(f4);
                        return;
                    }
                    return;
                }
                return;
            }
            float f5 = (-(1.0f - f2)) * k45Var.b;
            if (k45Var.g != f5) {
                k45Var.g = f5;
                ap3 ap3Var3 = k45Var.i;
                if (ap3Var3 != null) {
                    ((View) ap3Var3.L).setTranslationY(f5);
                    return;
                }
                return;
            }
            return;
        }
        float f6 = (-(1.0f - f2)) * k45Var.a;
        if (k45Var.f != f6) {
            k45Var.f = f6;
            ap3 ap3Var4 = k45Var.i;
            if (ap3Var4 != null) {
                ((View) ap3Var4.L).setTranslationX(f6);
            }
        }
    }
}
