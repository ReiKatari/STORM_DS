package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 extends BitmapDrawable {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f3193e = 0;

    /* renamed from: a  reason: collision with root package name */
    public Drawable f3194a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3195b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3196c;

    /* renamed from: d  reason: collision with root package name */
    public int f3197d;

    static {
        new Paint();
    }

    public b0(Context context, Bitmap bitmap, Drawable drawable, y yVar) {
        super(context.getResources(), bitmap);
        this.f3197d = 255;
        float f8 = context.getResources().getDisplayMetrics().density;
        if (yVar != y.MEMORY) {
            this.f3194a = drawable;
            this.f3196c = true;
            this.f3195b = SystemClock.uptimeMillis();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!this.f3196c) {
            super.draw(canvas);
            return;
        }
        float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f3195b)) / 200.0f;
        if (uptimeMillis >= 1.0f) {
            this.f3196c = false;
            this.f3194a = null;
            super.draw(canvas);
            return;
        }
        Drawable drawable = this.f3194a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        super.setAlpha((int) (this.f3197d * uptimeMillis));
        super.draw(canvas);
        super.setAlpha(this.f3197d);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3194a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.f3197d = i2;
        Drawable drawable = this.f3194a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        }
        super.setAlpha(i2);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3194a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
