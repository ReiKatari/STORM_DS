package defpackage;

import android.graphics.Rect;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wb7  reason: default package */
/* loaded from: classes.dex */
public final class wb7 {
    public final int a;
    public final int b;
    public final lz3 c;
    public final int d;
    public final ka f;
    public final Interpolator g;
    public float i;
    public float j;
    public final boolean m;
    public final u93 e = new u93(0);
    public boolean h = false;
    public final Rect l = new Rect();
    public long k = System.nanoTime();

    public wb7(ka kaVar, lz3 lz3Var, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
        float f;
        this.m = false;
        this.f = kaVar;
        this.c = lz3Var;
        this.d = i2;
        if (((ArrayList) kaVar.Y) == null) {
            kaVar.Y = new ArrayList();
        }
        ((ArrayList) kaVar.Y).add(this);
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
        lz3 lz3Var = this.c;
        ka kaVar = this.f;
        if (z) {
            long nanoTime = System.nanoTime();
            this.k = nanoTime;
            float f = this.i - (((float) ((nanoTime - this.k) * 1.0E-6d)) * this.j);
            this.i = f;
            if (f < RecyclerView.A1) {
                this.i = RecyclerView.A1;
            }
            float f2 = this.i;
            if (interpolator != null) {
                f2 = interpolator.getInterpolation(f2);
            }
            float f3 = f2;
            boolean d = lz3Var.d(f3, nanoTime, this.e, lz3Var.b);
            if (this.i <= RecyclerView.A1) {
                if (i2 != -1) {
                    lz3Var.b.setTag(i2, Long.valueOf(System.nanoTime()));
                }
                if (i != -1) {
                    lz3Var.b.setTag(i, null);
                }
                ((ArrayList) kaVar.Z).add(this);
            }
            if (this.i > RecyclerView.A1 || d) {
                ((MotionLayout) kaVar.B).invalidate();
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
        boolean d2 = lz3Var.d(f6, nanoTime2, this.e, lz3Var.b);
        if (this.i >= 1.0f) {
            if (i2 != -1) {
                lz3Var.b.setTag(i2, Long.valueOf(System.nanoTime()));
            }
            if (i != -1) {
                lz3Var.b.setTag(i, null);
            }
            if (!this.m) {
                ((ArrayList) kaVar.Z).add(this);
            }
        }
        if (this.i >= 1.0f && !d2) {
            return;
        }
        ((MotionLayout) kaVar.B).invalidate();
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
