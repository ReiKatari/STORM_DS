package sb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final String f12855a;

    /* renamed from: b  reason: collision with root package name */
    public final l7.a f12856b;

    /* renamed from: c  reason: collision with root package name */
    public int f12857c;

    /* renamed from: d  reason: collision with root package name */
    public float f12858d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12859e;

    public a(String str, b bVar, l7.a aVar) {
        this.f12855a = str;
        this.f12856b = aVar;
        bVar.getClass();
    }

    public final boolean a() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!a()) {
            return;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (!a()) {
            return 1;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (!a()) {
            return 1;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!a()) {
            return -2;
        }
        throw null;
    }

    public final String toString() {
        return "AsyncDrawable{destination='" + this.f12855a + "', imageSize=null, result=" + ((Object) null) + ", canvasWidth=" + this.f12857c + ", textSize=" + this.f12858d + ", waitingForDimensions=" + this.f12859e + '}';
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
