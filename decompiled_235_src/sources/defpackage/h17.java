package defpackage;

import android.text.TextPaint;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h17  reason: default package */
/* loaded from: classes.dex */
public final class h17 {
    public float c;
    public final WeakReference e;
    public g07 f;
    public final TextPaint a = new TextPaint(1);
    public final kq0 b = new kq0(this, 1);
    public boolean d = true;

    public h17(nq0 nq0Var) {
        this.e = new WeakReference(null);
        this.e = new WeakReference(nq0Var);
    }

    public final float a(String str) {
        float measureText;
        if (!this.d) {
            return this.c;
        }
        TextPaint textPaint = this.a;
        if (str == null) {
            measureText = RecyclerView.B1;
        } else {
            measureText = textPaint.measureText((CharSequence) str, 0, str.length());
        }
        this.c = measureText;
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.d = false;
        return this.c;
    }
}
