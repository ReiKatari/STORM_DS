package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tw4  reason: default package */
/* loaded from: classes.dex */
public final class tw4 extends android.graphics.drawable.BitmapDrawable {
    public static final /* synthetic */ int e = 0;
    public android.graphics.drawable.Drawable a;
    public final long b;
    public boolean c;
    public int d;

    static {
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            return
    }

    public tw4(android.content.Context r2, android.graphics.Bitmap r3, android.graphics.drawable.Drawable r4, defpackage.qw4 r5) {
            r1 = this;
            android.content.res.Resources r0 = r2.getResources()
            r1.<init>(r0, r3)
            r3 = 255(0xff, float:3.57E-43)
            r1.d = r3
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            qw4 r2 = defpackage.qw4.MEMORY
            if (r5 == r2) goto L24
            r1.a = r4
            r2 = 1
            r1.c = r2
            long r2 = android.os.SystemClock.uptimeMillis()
            r1.b = r2
        L24:
            return
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas r5) {
            r4 = this;
            boolean r0 = r4.c
            if (r0 != 0) goto L8
            super.draw(r5)
            goto L3a
        L8:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r4.b
            long r0 = r0 - r2
            float r0 = (float) r0
            r1 = 1128792064(0x43480000, float:200.0)
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L23
            r0 = 0
            r4.c = r0
            r0 = 0
            r4.a = r0
            super.draw(r5)
            goto L3a
        L23:
            android.graphics.drawable.Drawable r1 = r4.a
            if (r1 == 0) goto L2a
            r1.draw(r5)
        L2a:
            int r1 = r4.d
            float r1 = (float) r1
            float r1 = r1 * r0
            int r0 = (int) r1
            super.setAlpha(r0)
            super.draw(r5)
            int r5 = r4.d
            super.setAlpha(r5)
        L3a:
            return
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L7
            r0.setBounds(r2)
        L7:
            super.onBoundsChange(r2)
            return
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
            r1 = this;
            r1.d = r2
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L9
            r0.setAlpha(r2)
        L9:
            super.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.a
            if (r0 == 0) goto L7
            r0.setColorFilter(r2)
        L7:
            super.setColorFilter(r2)
            return
    }
}
