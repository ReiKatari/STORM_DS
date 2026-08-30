package l2;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import i3.s;
import i3.z;
import j1.k;
import kf.s0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends View {

    /* renamed from: c0 */
    public static final int[] f8673c0 = {16842919, 16842910};

    /* renamed from: d0 */
    public static final int[] f8674d0 = new int[0];
    public h A;
    public Boolean B;
    public Long L;
    public a8.f R;

    /* renamed from: b0 */
    public s0 f8675b0;

    private final void setRippleState(boolean z10) {
        long j2;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.R;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.L;
        if (l10 != null) {
            j2 = l10.longValue();
        } else {
            j2 = 0;
        }
        long j10 = currentAnimationTimeMillis - j2;
        if (!z10 && j10 < 5) {
            a8.f fVar = new a8.f(16, this);
            this.R = fVar;
            postDelayed(fVar, 50L);
        } else {
            if (z10) {
                iArr = f8673c0;
            } else {
                iArr = f8674d0;
            }
            h hVar = this.A;
            if (hVar != null) {
                hVar.setState(iArr);
            }
        }
        this.L = Long.valueOf(currentAnimationTimeMillis);
    }

    public static final void setRippleState$lambda$1(e eVar) {
        h hVar = eVar.A;
        if (hVar != null) {
            hVar.setState(f8674d0);
        }
        eVar.R = null;
    }

    public final void b(k kVar, boolean z10, long j2, int i2, long j10, float f8, s0 s0Var) {
        if (this.A == null || !Boolean.valueOf(z10).equals(this.B)) {
            h hVar = new h(z10);
            setBackground(hVar);
            this.A = hVar;
            this.B = Boolean.valueOf(z10);
        }
        h hVar2 = this.A;
        hVar2.getClass();
        this.f8675b0 = s0Var;
        e(j2, i2, j10, f8);
        if (z10) {
            hVar2.setHotspot(Float.intBitsToFloat((int) (kVar.f7337a >> 32)), Float.intBitsToFloat((int) (kVar.f7337a & 4294967295L)));
        } else {
            hVar2.setHotspot(hVar2.getBounds().centerX(), hVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f8675b0 = null;
        a8.f fVar = this.R;
        if (fVar != null) {
            removeCallbacks(fVar);
            a8.f fVar2 = this.R;
            fVar2.getClass();
            fVar2.run();
        } else {
            h hVar = this.A;
            if (hVar != null) {
                hVar.setState(f8674d0);
            }
        }
        h hVar2 = this.A;
        if (hVar2 == null) {
            return;
        }
        hVar2.setVisible(false, false);
        unscheduleDrawable(hVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            c();
        } else {
            super.draw(canvas);
        }
    }

    public final void e(long j2, int i2, long j10, float f8) {
        boolean c4;
        h hVar = this.A;
        if (hVar == null) {
            return;
        }
        Integer num = hVar.L;
        if (num == null || num.intValue() != i2) {
            hVar.L = Integer.valueOf(i2);
            hVar.setRadius(i2);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f8 *= 2;
        }
        if (f8 > 1.0f) {
            f8 = 1.0f;
        }
        long b10 = s.b(j10, f8);
        s sVar = hVar.B;
        if (sVar == null) {
            c4 = false;
        } else {
            c4 = s.c(sVar.f6689a, b10);
        }
        if (!c4) {
            hVar.B = new s(b10);
            hVar.setColor(ColorStateList.valueOf(z.y(b10)));
        }
        Rect rect = new Rect(0, 0, pc.a.M(h3.e.e(j2)), pc.a.M(h3.e.c(j2)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        hVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        s0 s0Var = this.f8675b0;
        if (s0Var != null) {
            s0Var.b();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
    }
}
