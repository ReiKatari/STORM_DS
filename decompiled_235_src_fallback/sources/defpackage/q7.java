package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q7  reason: default package */
/* loaded from: classes.dex */
public final class q7 extends android.graphics.drawable.Drawable {
    public final androidx.appcompat.widget.ActionBarContainer a;

    public q7(androidx.appcompat.widget.ActionBarContainer r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r1 = r1.a
            boolean r0 = r1.f0
            if (r0 == 0) goto Le
            android.graphics.drawable.Drawable r1 = r1.e0
            if (r1 == 0) goto L20
            r1.draw(r2)
            return
        Le:
            android.graphics.drawable.Drawable r0 = r1.R
            if (r0 == 0) goto L15
            r0.draw(r2)
        L15:
            android.graphics.drawable.Drawable r0 = r1.d0
            if (r0 == 0) goto L20
            boolean r1 = r1.g0
            if (r1 == 0) goto L20
            r0.draw(r2)
        L20:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r1 = r1.a
            boolean r0 = r1.f0
            if (r0 == 0) goto L10
            android.graphics.drawable.Drawable r0 = r1.e0
            if (r0 == 0) goto L17
            android.graphics.drawable.Drawable r1 = r1.R
            r1.getOutline(r2)
            return
        L10:
            android.graphics.drawable.Drawable r1 = r1.R
            if (r1 == 0) goto L17
            r1.getOutline(r2)
        L17:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r1) {
            r0 = this;
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            return
    }
}
