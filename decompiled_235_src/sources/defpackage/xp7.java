package defpackage;

import android.graphics.Rect;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xp7  reason: default package */
/* loaded from: classes.dex */
public final class xp7 {
    public final int a;
    public final int b;
    public final m74 c;
    public final int d;
    public final pa f;
    public final Interpolator g;
    public float i;
    public float j;
    public final boolean m;
    public final ng3 e = new ng3(0);
    public boolean h = false;
    public final Rect l = new Rect();
    public long k = System.nanoTime();

    public xp7(pa paVar, m74 m74Var, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
        float f;
        this.m = false;
        this.f = paVar;
        this.c = m74Var;
        this.d = i2;
        if (((ArrayList) paVar.Y) == null) {
            paVar.Y = new ArrayList();
        }
        ((ArrayList) paVar.Y).add(this);
        this.g = interpolator;
        this.a = i4;
        this.b = i5;
        if (i3 == 3) {
            this.m = true;
        }
        if (i == 0) {
            f = Float.MAX_VALUE;
        } else {
            f = 1.0f / i;
        }
        this.j = f;
        a();
    }

    public final void a() {
        boolean z = this.h;
        int i = this.b;
        int i2 = this.a;
        Interpolator interpolator = this.g;
        m74 m74Var = this.c;
        pa paVar = this.f;
        if (z) {
            long nanoTime = System.nanoTime();
            this.k = nanoTime;
            float f = this.i - (((float) ((nanoTime - this.k) * 1.0E-6d)) * this.j);
            this.i = f;
            if (f < RecyclerView.B1) {
                this.i = RecyclerView.B1;
            }
            float f2 = this.i;
            if (interpolator != null) {
                f2 = interpolator.getInterpolation(f2);
            }
            float f3 = f2;
            boolean d = m74Var.d(f3, nanoTime, this.e, m74Var.b);
            if (this.i <= RecyclerView.B1) {
                if (i2 != -1) {
                    m74Var.b.setTag(i2, Long.valueOf(System.nanoTime()));
                }
                if (i != -1) {
                    m74Var.b.setTag(i, null);
                }
                ((ArrayList) paVar.Z).add(this);
            }
            if (this.i > RecyclerView.B1 || d) {
                ((MotionLayout) paVar.B).invalidate();
                return;
            }
            return;
        }
        long nanoTime2 = System.nanoTime();
        this.k = nanoTime2;
        float f4 = (((float) ((nanoTime2 - this.k) * 1.0E-6d)) * this.j) + this.i;
        this.i = f4;
        if (f4 >= 1.0f) {
            this.i = 1.0f;
        }
        float f5 = this.i;
        if (interpolator != null) {
            f5 = interpolator.getInterpolation(f5);
        }
        float f6 = f5;
        boolean d2 = m74Var.d(f6, nanoTime2, this.e, m74Var.b);
        if (this.i >= 1.0f) {
            if (i2 != -1) {
                m74Var.b.setTag(i2, Long.valueOf(System.nanoTime()));
            }
            if (i != -1) {
                m74Var.b.setTag(i, null);
            }
            if (!this.m) {
                ((ArrayList) paVar.Z).add(this);
            }
        }
        if (this.i >= 1.0f && !d2) {
            return;
        }
        ((MotionLayout) paVar.B).invalidate();
    }

    public final void b() {
        float f;
        this.h = true;
        int i = this.d;
        if (i != -1) {
            if (i == 0) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f / i;
            }
            this.j = f;
        }
        ((MotionLayout) this.f.B).invalidate();
        this.k = System.nanoTime();
    }
}
