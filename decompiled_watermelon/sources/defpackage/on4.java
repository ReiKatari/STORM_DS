package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: on4  reason: default package */
/* loaded from: classes.dex */
public final class on4 extends BitmapDrawable {
    public static final /* synthetic */ int e = 0;
    public Drawable a;
    public final long b;
    public boolean c;
    public int d;

    static {
        new Paint();
    }

    public on4(Context context, Bitmap bitmap, Drawable drawable, ln4 ln4Var) {
        super(context.getResources(), bitmap);
        this.d = 255;
        float f = context.getResources().getDisplayMetrics().density;
        if (ln4Var != ln4.MEMORY) {
            this.a = drawable;
            this.c = true;
            this.b = SystemClock.uptimeMillis();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!this.c) {
            super.draw(canvas);
            return;
        }
        float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.b)) / 200.0f;
        if (uptimeMillis >= 1.0f) {
            this.c = false;
            this.a = null;
            super.draw(canvas);
            return;
        }
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        super.setAlpha((int) (this.d * uptimeMillis));
        super.draw(canvas);
        super.setAlpha(this.d);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d = i;
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        super.setAlpha(i);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
