package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zq0  reason: default package */
/* loaded from: classes.dex */
public final class zq0 {
    public final int a;
    public final dv4 b;
    public x13 c;
    public x13 d;
    public ev4 e;
    public final ColorDrawable f;
    public boolean g;
    public int h;

    static {
        new PathInterpolator(RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 1.0f);
        new PathInterpolator(0.6f, RecyclerView.A1, 1.0f, 1.0f);
        new PathInterpolator(RecyclerView.A1, RecyclerView.A1, 0.2f, 1.0f);
        new PathInterpolator(0.4f, RecyclerView.A1, 1.0f, 1.0f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dv4, java.lang.Object] */
    public zq0(int i, int i2) {
        ?? obj = new Object();
        obj.a = -1;
        obj.b = -1;
        x13 x13Var = x13.e;
        obj.c = x13Var;
        obj.d = false;
        obj.e = null;
        obj.f = RecyclerView.A1;
        obj.g = RecyclerView.A1;
        obj.h = 1.0f;
        this.b = obj;
        this.c = x13Var;
        this.d = x13Var;
        this.e = null;
        if (i != 1 && i != 2 && i != 4 && i != 8) {
            i.i(wh1.g(i, "Unexpected side: "));
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
            ci3 ci3Var = obj.i;
            if (ci3Var != null) {
                ((View) ci3Var.L).setBackground(colorDrawable);
            }
        }
    }

    public final void a(float f) {
        float f2 = f * 1.0f;
        dv4 dv4Var = this.b;
        if (dv4Var.h != f2) {
            dv4Var.h = f2;
            ci3 ci3Var = dv4Var.i;
            if (ci3Var != null) {
                ((View) ci3Var.L).setAlpha(f2);
            }
        }
    }

    public final void b(float f) {
        float f2 = f * 1.0f;
        dv4 dv4Var = this.b;
        int i = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        float f3 = (1.0f - f2) * dv4Var.b;
                        if (dv4Var.g != f3) {
                            dv4Var.g = f3;
                            ci3 ci3Var = dv4Var.i;
                            if (ci3Var != null) {
                                ((View) ci3Var.L).setTranslationY(f3);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                float f4 = (1.0f - f2) * dv4Var.a;
                if (dv4Var.f != f4) {
                    dv4Var.f = f4;
                    ci3 ci3Var2 = dv4Var.i;
                    if (ci3Var2 != null) {
                        ((View) ci3Var2.L).setTranslationX(f4);
                        return;
                    }
                    return;
                }
                return;
            }
            float f5 = (-(1.0f - f2)) * dv4Var.b;
            if (dv4Var.g != f5) {
                dv4Var.g = f5;
                ci3 ci3Var3 = dv4Var.i;
                if (ci3Var3 != null) {
                    ((View) ci3Var3.L).setTranslationY(f5);
                    return;
                }
                return;
            }
            return;
        }
        float f6 = (-(1.0f - f2)) * dv4Var.a;
        if (dv4Var.f != f6) {
            dv4Var.f = f6;
            ci3 ci3Var4 = dv4Var.i;
            if (ci3Var4 != null) {
                ((View) ci3Var4.L).setTranslationX(f6);
            }
        }
    }
}
