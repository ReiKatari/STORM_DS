package ha;

import android.text.TextPaint;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: c  reason: collision with root package name */
    public float f6433c;

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference f6435e;

    /* renamed from: f  reason: collision with root package name */
    public ka.d f6436f;

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f6431a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final ca.b f6432b = new ca.b(1, this);

    /* renamed from: d  reason: collision with root package name */
    public boolean f6434d = true;

    public g(ca.e eVar) {
        this.f6435e = new WeakReference(null);
        this.f6435e = new WeakReference(eVar);
    }

    public final float a(String str) {
        float measureText;
        if (!this.f6434d) {
            return this.f6433c;
        }
        TextPaint textPaint = this.f6431a;
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = textPaint.measureText((CharSequence) str, 0, str.length());
        }
        this.f6433c = measureText;
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f6434d = false;
        return this.f6433c;
    }
}
