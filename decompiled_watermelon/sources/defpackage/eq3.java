package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: eq3  reason: default package */
/* loaded from: classes.dex */
public final class eq3 implements View.OnTouchListener {
    public static final int m0 = ViewConfiguration.getTapTimeout();
    public final nw A;
    public final AccelerateInterpolator B;
    public final fl1 L;
    public es4 R;
    public final float[] X;
    public final float[] Y;
    public final int Z;
    public final int c0;
    public final float[] d0;
    public final float[] e0;
    public final float[] f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public final fl1 l0;

    /* JADX WARN: Type inference failed for: r0v0, types: [nw, java.lang.Object] */
    public eq3(fl1 fl1Var) {
        ?? obj = new Object();
        obj.e = Long.MIN_VALUE;
        obj.g = -1L;
        obj.f = 0L;
        this.A = obj;
        this.B = new AccelerateInterpolator();
        float[] fArr = {RecyclerView.A1, RecyclerView.A1};
        this.X = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.Y = fArr2;
        float[] fArr3 = {RecyclerView.A1, RecyclerView.A1};
        this.d0 = fArr3;
        float[] fArr4 = {RecyclerView.A1, RecyclerView.A1};
        this.e0 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f0 = fArr5;
        this.L = fl1Var;
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
        this.c0 = m0;
        obj.a = 500;
        obj.b = 500;
        this.l0 = fl1Var;
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
            float[] r0 = r3.d0
            r0 = r0[r7]
            float[] r1 = r3.e0
            r1 = r1[r7]
            float[] r3 = r3.f0
            r3 = r3[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            return r3
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r3 = b(r4, r1, r3)
            float r3 = -r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq3.a(float, float, float, int):float");
    }

    public final float c(float f, float f2) {
        if (f2 != RecyclerView.A1) {
            int i = this.Z;
            if (i != 0 && i != 1) {
                if (i == 2 && f < RecyclerView.A1) {
                    return f / (-f2);
                }
            } else if (f < f2) {
                if (f >= RecyclerView.A1) {
                    return 1.0f - (f / f2);
                }
                if (this.j0 && i == 1) {
                    return 1.0f;
                }
            }
        }
        return RecyclerView.A1;
    }

    public final void d() {
        int i = 0;
        if (this.h0) {
            this.j0 = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        nw nwVar = this.A;
        int i2 = (int) (currentAnimationTimeMillis - nwVar.e);
        int i3 = nwVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        nwVar.i = i;
        nwVar.h = nwVar.a(currentAnimationTimeMillis);
        nwVar.g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        fl1 fl1Var;
        int count;
        nw nwVar = this.A;
        float f = nwVar.d;
        int abs = (int) (f / Math.abs(f));
        Math.abs(nwVar.c);
        if (abs != 0 && (count = (fl1Var = this.l0).getCount()) != 0) {
            int childCount = fl1Var.getChildCount();
            int firstVisiblePosition = fl1Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && fl1Var.getChildAt(0).getTop() >= 0)) : !(i >= count && fl1Var.getChildAt(childCount - 1).getBottom() <= fl1Var.getHeight())) {
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
            boolean r0 = r8.k0
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r10.getActionMasked()
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 == r2) goto L1f
            r9 = 3
            if (r0 == r9) goto L17
            goto L7c
        L17:
            r8.d()
            return r1
        L1b:
            r8.i0 = r3
            r8.g0 = r1
        L1f:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            fl1 r5 = r8.L
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.a(r0, r4, r6, r1)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.a(r10, r9, r4, r3)
            nw r10 = r8.A
            r10.c = r0
            r10.d = r9
            boolean r9 = r8.j0
            if (r9 != 0) goto L7c
            boolean r9 = r8.e()
            if (r9 == 0) goto L7c
            es4 r9 = r8.R
            if (r9 != 0) goto L60
            es4 r9 = new es4
            r9.<init>(r2, r8)
            r8.R = r9
        L60:
            r8.j0 = r3
            r8.h0 = r3
            boolean r9 = r8.g0
            if (r9 != 0) goto L75
            int r9 = r8.c0
            if (r9 <= 0) goto L75
            es4 r10 = r8.R
            long r6 = (long) r9
            java.util.WeakHashMap r9 = defpackage.aa7.a
            r5.postOnAnimationDelayed(r10, r6)
            goto L7a
        L75:
            es4 r9 = r8.R
            r9.run()
        L7a:
            r8.g0 = r3
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eq3.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
