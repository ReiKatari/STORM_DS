package o4;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a  reason: collision with root package name */
    public final int f10842a;

    /* renamed from: b  reason: collision with root package name */
    public final float f10843b;

    /* renamed from: c  reason: collision with root package name */
    public final float f10844c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10845d;

    public j(float f8, float f10, float f11, int i2) {
        this.f10842a = i2;
        this.f10843b = f8;
        this.f10844c = f10;
        this.f10845d = f11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f10845d, this.f10843b, this.f10844c, this.f10842a);
    }
}
