package h5;

import android.graphics.Rect;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.ArrayList;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f6085a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6086b;

    /* renamed from: c  reason: collision with root package name */
    public final p f6087c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6088d;

    /* renamed from: f  reason: collision with root package name */
    public final x0 f6090f;

    /* renamed from: g  reason: collision with root package name */
    public final Interpolator f6091g;

    /* renamed from: i  reason: collision with root package name */
    public float f6093i;

    /* renamed from: j  reason: collision with root package name */
    public float f6094j;
    public final boolean m;

    /* renamed from: e  reason: collision with root package name */
    public final d5.e f6089e = new d5.e(1);

    /* renamed from: h  reason: collision with root package name */
    public boolean f6092h = false;

    /* renamed from: l  reason: collision with root package name */
    public final Rect f6096l = new Rect();

    /* renamed from: k  reason: collision with root package name */
    public long f6095k = System.nanoTime();

    public b0(x0 x0Var, p pVar, int i2, int i10, int i11, Interpolator interpolator, int i12, int i13) {
        float f8;
        this.m = false;
        this.f6090f = x0Var;
        this.f6087c = pVar;
        this.f6088d = i10;
        if (((ArrayList) x0Var.f14093f) == null) {
            x0Var.f14093f = new ArrayList();
        }
        ((ArrayList) x0Var.f14093f).add(this);
        this.f6091g = interpolator;
        this.f6085a = i12;
        this.f6086b = i13;
        if (i11 == 3) {
            this.m = true;
        }
        if (i2 == 0) {
            f8 = Float.MAX_VALUE;
        } else {
            f8 = 1.0f / i2;
        }
        this.f6094j = f8;
        a();
    }

    public final void a() {
        boolean z10 = this.f6092h;
        int i2 = this.f6086b;
        int i10 = this.f6085a;
        Interpolator interpolator = this.f6091g;
        p pVar = this.f6087c;
        x0 x0Var = this.f6090f;
        if (z10) {
            long nanoTime = System.nanoTime();
            this.f6095k = nanoTime;
            float f8 = this.f6093i - (((float) ((nanoTime - this.f6095k) * 1.0E-6d)) * this.f6094j);
            this.f6093i = f8;
            if (f8 < 0.0f) {
                this.f6093i = 0.0f;
            }
            float f10 = this.f6093i;
            if (interpolator != null) {
                f10 = interpolator.getInterpolation(f10);
            }
            boolean d4 = pVar.d(f10, nanoTime, pVar.f6211b, this.f6089e);
            if (this.f6093i <= 0.0f) {
                if (i10 != -1) {
                    pVar.f6211b.setTag(i10, Long.valueOf(System.nanoTime()));
                }
                if (i2 != -1) {
                    pVar.f6211b.setTag(i2, null);
                }
                ((ArrayList) x0Var.f14094g).add(this);
            }
            if (this.f6093i > 0.0f || d4) {
                ((MotionLayout) x0Var.f14089b).invalidate();
                return;
            }
            return;
        }
        long nanoTime2 = System.nanoTime();
        this.f6095k = nanoTime2;
        float f11 = (((float) ((nanoTime2 - this.f6095k) * 1.0E-6d)) * this.f6094j) + this.f6093i;
        this.f6093i = f11;
        if (f11 >= 1.0f) {
            this.f6093i = 1.0f;
        }
        float f12 = this.f6093i;
        if (interpolator != null) {
            f12 = interpolator.getInterpolation(f12);
        }
        boolean d10 = pVar.d(f12, nanoTime2, pVar.f6211b, this.f6089e);
        if (this.f6093i >= 1.0f) {
            if (i10 != -1) {
                pVar.f6211b.setTag(i10, Long.valueOf(System.nanoTime()));
            }
            if (i2 != -1) {
                pVar.f6211b.setTag(i2, null);
            }
            if (!this.m) {
                ((ArrayList) x0Var.f14094g).add(this);
            }
        }
        if (this.f6093i >= 1.0f && !d10) {
            return;
        }
        ((MotionLayout) x0Var.f14089b).invalidate();
    }

    public final void b() {
        float f8;
        this.f6092h = true;
        int i2 = this.f6088d;
        if (i2 != -1) {
            if (i2 == 0) {
                f8 = Float.MAX_VALUE;
            } else {
                f8 = 1.0f / i2;
            }
            this.f6094j = f8;
        }
        ((MotionLayout) this.f6090f.f14089b).invalidate();
        this.f6095k = System.nanoTime();
    }
}
