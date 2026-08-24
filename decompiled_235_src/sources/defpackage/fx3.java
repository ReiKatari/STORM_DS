package defpackage;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fx3  reason: default package */
/* loaded from: classes.dex */
public final class fx3 implements View.OnTouchListener {
    public static final int n0 = ViewConfiguration.getTapTimeout();
    public final mx A;
    public final AccelerateInterpolator B;
    public final mp1 L;
    public g15 R;
    public final float[] X;
    public final float[] Y;
    public final int Z;
    public final int d0;
    public final float[] e0;
    public final float[] f0;
    public final float[] g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public final mp1 m0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mx] */
    public fx3(mp1 mp1Var) {
        ?? obj = new Object();
        obj.e = Long.MIN_VALUE;
        obj.g = -1L;
        obj.f = 0L;
        this.A = obj;
        this.B = new AccelerateInterpolator();
        float[] fArr = {RecyclerView.B1, RecyclerView.B1};
        this.X = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.Y = fArr2;
        float[] fArr3 = {RecyclerView.B1, RecyclerView.B1};
        this.e0 = fArr3;
        float[] fArr4 = {RecyclerView.B1, RecyclerView.B1};
        this.f0 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.g0 = fArr5;
        this.L = mp1Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.Z = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.d0 = n0;
        obj.a = 500;
        obj.b = 500;
        this.m0 = mp1Var;
    }

    public static float b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        if (f < f2) {
            return f2;
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f, float f2, float f3, int i) {
        float f4;
        float interpolation;
        int i2;
        float b = b(this.X[i] * f2, RecyclerView.B1, this.Y[i]);
        float c = c(f2 - f, b) - c(f, b);
        int i3 = (c > RecyclerView.B1 ? 1 : (c == RecyclerView.B1 ? 0 : -1));
        AccelerateInterpolator accelerateInterpolator = this.B;
        if (i3 < 0) {
            interpolation = -accelerateInterpolator.getInterpolation(-c);
        } else if (c > RecyclerView.B1) {
            interpolation = accelerateInterpolator.getInterpolation(c);
        } else {
            f4 = 0.0f;
            i2 = (f4 > RecyclerView.B1 ? 1 : (f4 == RecyclerView.B1 ? 0 : -1));
            if (i2 != 0) {
                return RecyclerView.B1;
            }
            float f5 = this.e0[i];
            float f6 = this.f0[i];
            float f7 = this.g0[i];
            float f8 = f5 * f3;
            if (i2 > 0) {
                return b(f4 * f8, f6, f7);
            }
            return -b((-f4) * f8, f6, f7);
        }
        f4 = b(interpolation, -1.0f, 1.0f);
        i2 = (f4 > RecyclerView.B1 ? 1 : (f4 == RecyclerView.B1 ? 0 : -1));
        if (i2 != 0) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 != RecyclerView.B1) {
            int i = this.Z;
            if (i != 0 && i != 1) {
                if (i == 2 && f < RecyclerView.B1) {
                    return f / (-f2);
                }
            } else if (f < f2) {
                if (f >= RecyclerView.B1) {
                    return 1.0f - (f / f2);
                }
                if (this.k0 && i == 1) {
                    return 1.0f;
                }
            }
        }
        return RecyclerView.B1;
    }

    public final void d() {
        int i = 0;
        if (this.i0) {
            this.k0 = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        mx mxVar = this.A;
        int i2 = (int) (currentAnimationTimeMillis - mxVar.e);
        int i3 = mxVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        mxVar.i = i;
        mxVar.h = mxVar.a(currentAnimationTimeMillis);
        mxVar.g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        mp1 mp1Var;
        int count;
        mx mxVar = this.A;
        float f = mxVar.d;
        int abs = (int) (f / Math.abs(f));
        Math.abs(mxVar.c);
        if (abs != 0 && (count = (mp1Var = this.m0).getCount()) != 0) {
            int childCount = mp1Var.getChildCount();
            int firstVisiblePosition = mp1Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && mp1Var.getChildAt(0).getTop() >= 0)) : !(i >= count && mp1Var.getChildAt(childCount - 1).getBottom() <= mp1Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
        if (r0 != 3) goto L27;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.l0) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.j0 = true;
            this.h0 = false;
            mp1 mp1Var = this.L;
            float a = a(motionEvent.getX(), view.getWidth(), mp1Var.getWidth(), 0);
            float a2 = a(motionEvent.getY(), view.getHeight(), mp1Var.getHeight(), 1);
            mx mxVar = this.A;
            mxVar.c = a;
            mxVar.d = a2;
            if (!this.k0 && e()) {
                if (this.R == null) {
                    this.R = new g15(this, 2);
                }
                this.k0 = true;
                this.i0 = true;
                if (!this.h0 && (i = this.d0) > 0) {
                    g15 g15Var = this.R;
                    long j = i;
                    WeakHashMap weakHashMap = ao7.a;
                    mp1Var.postOnAnimationDelayed(g15Var, j);
                } else {
                    this.R.run();
                }
                this.h0 = true;
            }
        }
        return false;
    }
}
