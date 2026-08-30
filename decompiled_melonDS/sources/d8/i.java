package d8;

import android.graphics.Paint;
import c8.c0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends l {

    /* renamed from: d  reason: collision with root package name */
    public c0 f3958d;

    /* renamed from: e  reason: collision with root package name */
    public float f3959e;

    /* renamed from: f  reason: collision with root package name */
    public c0 f3960f;

    /* renamed from: g  reason: collision with root package name */
    public float f3961g;

    /* renamed from: h  reason: collision with root package name */
    public float f3962h;

    /* renamed from: i  reason: collision with root package name */
    public float f3963i;

    /* renamed from: j  reason: collision with root package name */
    public float f3964j;

    /* renamed from: k  reason: collision with root package name */
    public float f3965k;

    /* renamed from: l  reason: collision with root package name */
    public Paint.Cap f3966l;
    public Paint.Join m;

    /* renamed from: n  reason: collision with root package name */
    public float f3967n;

    @Override // d8.k
    public final boolean a() {
        if (!this.f3960f.j() && !this.f3958d.j()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    @Override // d8.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            c8.c0 r0 = r6.f3960f
            boolean r1 = r0.j()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.f2626d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f2624b
            if (r1 == r4) goto L1e
            r0.f2624b = r1
            r0 = r2
            goto L1f
        L1e:
            r0 = r3
        L1f:
            c8.c0 r1 = r6.f3958d
            boolean r4 = r1.j()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r1.f2626d
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f2624b
            if (r7 == r4) goto L3a
            r1.f2624b = r7
            goto L3b
        L3a:
            r2 = r3
        L3b:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.i.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.f3962h;
    }

    public int getFillColor() {
        return this.f3960f.f2624b;
    }

    public float getStrokeAlpha() {
        return this.f3961g;
    }

    public int getStrokeColor() {
        return this.f3958d.f2624b;
    }

    public float getStrokeWidth() {
        return this.f3959e;
    }

    public float getTrimPathEnd() {
        return this.f3964j;
    }

    public float getTrimPathOffset() {
        return this.f3965k;
    }

    public float getTrimPathStart() {
        return this.f3963i;
    }

    public void setFillAlpha(float f8) {
        this.f3962h = f8;
    }

    public void setFillColor(int i2) {
        this.f3960f.f2624b = i2;
    }

    public void setStrokeAlpha(float f8) {
        this.f3961g = f8;
    }

    public void setStrokeColor(int i2) {
        this.f3958d.f2624b = i2;
    }

    public void setStrokeWidth(float f8) {
        this.f3959e = f8;
    }

    public void setTrimPathEnd(float f8) {
        this.f3964j = f8;
    }

    public void setTrimPathOffset(float f8) {
        this.f3965k = f8;
    }

    public void setTrimPathStart(float f8) {
        this.f3963i = f8;
    }
}
