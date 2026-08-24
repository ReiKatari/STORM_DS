package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uk7  reason: default package */
/* loaded from: classes.dex */
public final class uk7 extends defpackage.xk7 {
    public defpackage.ei d;
    public float e;
    public defpackage.ei f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public android.graphics.Paint.Cap l;
    public android.graphics.Paint.Join m;
    public float n;

    @Override // defpackage.wk7
    public final boolean a() {
            r1 = this;
            ei r0 = r1.f
            boolean r0 = r0.i()
            if (r0 != 0) goto L13
            ei r1 = r1.d
            boolean r1 = r1.i()
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    @Override // defpackage.wk7
    public final boolean b(int[] r6) {
            r5 = this;
            ei r0 = r5.f
            boolean r1 = r0.i()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.R
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r6, r4)
            int r4 = r0.B
            if (r1 == r4) goto L1e
            r0.B = r1
            r0 = r2
            goto L1f
        L1e:
            r0 = r3
        L1f:
            ei r5 = r5.d
            boolean r1 = r5.i()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r5.R
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r6 = r1.getColorForState(r6, r4)
            int r1 = r5.B
            if (r6 == r1) goto L3a
            r5.B = r6
            goto L3b
        L3a:
            r2 = r3
        L3b:
            r5 = r0 | r2
            return r5
    }

    public float getFillAlpha() {
            r0 = this;
            float r0 = r0.h
            return r0
    }

    public int getFillColor() {
            r0 = this;
            ei r0 = r0.f
            int r0 = r0.B
            return r0
    }

    public float getStrokeAlpha() {
            r0 = this;
            float r0 = r0.g
            return r0
    }

    public int getStrokeColor() {
            r0 = this;
            ei r0 = r0.d
            int r0 = r0.B
            return r0
    }

    public float getStrokeWidth() {
            r0 = this;
            float r0 = r0.e
            return r0
    }

    public float getTrimPathEnd() {
            r0 = this;
            float r0 = r0.j
            return r0
    }

    public float getTrimPathOffset() {
            r0 = this;
            float r0 = r0.k
            return r0
    }

    public float getTrimPathStart() {
            r0 = this;
            float r0 = r0.i
            return r0
    }

    public void setFillAlpha(float r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void setFillColor(int r1) {
            r0 = this;
            ei r0 = r0.f
            r0.B = r1
            return
    }

    public void setStrokeAlpha(float r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void setStrokeColor(int r1) {
            r0 = this;
            ei r0 = r0.d
            r0.B = r1
            return
    }

    public void setStrokeWidth(float r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void setTrimPathEnd(float r1) {
            r0 = this;
            r0.j = r1
            return
    }

    public void setTrimPathOffset(float r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public void setTrimPathStart(float r1) {
            r0 = this;
            r0.i = r1
            return
    }
}
