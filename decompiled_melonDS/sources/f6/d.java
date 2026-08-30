package f6;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import q.r1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: l0  reason: collision with root package name */
    public static final int f4909l0 = ViewConfiguration.getTapTimeout();
    public final a A;
    public final AccelerateInterpolator B;
    public final r1 L;
    public ad.g R;
    public final float[] X;
    public final float[] Y;
    public final int Z;

    /* renamed from: b0  reason: collision with root package name */
    public final int f4910b0;

    /* renamed from: c0  reason: collision with root package name */
    public final float[] f4911c0;

    /* renamed from: d0  reason: collision with root package name */
    public final float[] f4912d0;

    /* renamed from: e0  reason: collision with root package name */
    public final float[] f4913e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f4914f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f4915g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f4916h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f4917i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f4918j0;

    /* renamed from: k0  reason: collision with root package name */
    public final r1 f4919k0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, f6.a] */
    public d(r1 r1Var) {
        ?? obj = new Object();
        obj.f4904e = Long.MIN_VALUE;
        obj.f4906g = -1L;
        obj.f4905f = 0L;
        this.A = obj;
        this.B = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.X = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.Y = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f4911c0 = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f4912d0 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f4913e0 = fArr5;
        this.L = r1Var;
        float f8 = Resources.getSystem().getDisplayMetrics().density;
        float f10 = ((int) ((1575.0f * f8) + 0.5f)) / 1000.0f;
        fArr5[0] = f10;
        fArr5[1] = f10;
        float f11 = ((int) ((f8 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f11;
        fArr4[1] = f11;
        this.Z = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f4910b0 = f4909l0;
        obj.f4900a = 500;
        obj.f4901b = 500;
        this.f4919k0 = r1Var;
    }

    public static float b(float f8, float f10, float f11) {
        if (f8 > f11) {
            return f11;
        }
        if (f8 < f10) {
            return f10;
        }
        return f8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.X
            r0 = r0[r7]
            float[] r1 = r3.Y
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.B
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f4911c0
            r0 = r0[r7]
            float[] r1 = r3.f4912d0
            r1 = r1[r7]
            float[] r2 = r3.f4913e0
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.d.a(float, float, float, int):float");
    }

    public final float c(float f8, float f10) {
        if (f10 != 0.0f) {
            int i2 = this.Z;
            if (i2 != 0 && i2 != 1) {
                if (i2 == 2 && f8 < 0.0f) {
                    return f8 / (-f10);
                }
            } else if (f8 < f10) {
                if (f8 >= 0.0f) {
                    return 1.0f - (f8 / f10);
                }
                if (this.f4917i0 && i2 == 1) {
                    return 1.0f;
                }
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i2 = 0;
        if (this.f4915g0) {
            this.f4917i0 = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.A;
        int i10 = (int) (currentAnimationTimeMillis - aVar.f4904e);
        int i11 = aVar.f4901b;
        if (i10 > i11) {
            i2 = i11;
        } else if (i10 >= 0) {
            i2 = i10;
        }
        aVar.f4908i = i2;
        aVar.f4907h = aVar.a(currentAnimationTimeMillis);
        aVar.f4906g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        r1 r1Var;
        int count;
        a aVar = this.A;
        float f8 = aVar.f4903d;
        int abs = (int) (f8 / Math.abs(f8));
        Math.abs(aVar.f4902c);
        if (abs != 0 && (count = (r1Var = this.f4919k0).getCount()) != 0) {
            int childCount = r1Var.getChildCount();
            int firstVisiblePosition = r1Var.getFirstVisiblePosition();
            int i2 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && r1Var.getChildAt(0).getTop() >= 0)) : !(i2 >= count && r1Var.getChildAt(childCount - 1).getBottom() <= r1Var.getHeight())) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.f4918j0
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r10.getActionMasked()
            r2 = 3
            r3 = 1
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            r4 = 2
            if (r0 == r4) goto L1f
            if (r0 == r2) goto L17
            goto L7c
        L17:
            r8.d()
            return r1
        L1b:
            r8.f4916h0 = r3
            r8.f4914f0 = r1
        L1f:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            q.r1 r5 = r8.L
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.a(r0, r4, r6, r1)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.a(r10, r9, r4, r3)
            f6.a r10 = r8.A
            r10.f4902c = r0
            r10.f4903d = r9
            boolean r9 = r8.f4917i0
            if (r9 != 0) goto L7c
            boolean r9 = r8.e()
            if (r9 == 0) goto L7c
            ad.g r9 = r8.R
            if (r9 != 0) goto L60
            ad.g r9 = new ad.g
            r9.<init>(r2, r8)
            r8.R = r9
        L60:
            r8.f4917i0 = r3
            r8.f4915g0 = r3
            boolean r9 = r8.f4914f0
            if (r9 != 0) goto L75
            int r9 = r8.f4910b0
            if (r9 <= 0) goto L75
            ad.g r10 = r8.R
            long r6 = (long) r9
            java.util.WeakHashMap r9 = a6.x0.f533a
            r5.postOnAnimationDelayed(r10, r6)
            goto L7a
        L75:
            ad.g r9 = r8.R
            r9.run()
        L7a:
            r8.f4914f0 = r3
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
