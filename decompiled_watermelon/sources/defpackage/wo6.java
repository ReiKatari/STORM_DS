package defpackage;

import android.text.TextPaint;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wo6  reason: default package */
/* loaded from: classes.dex */
public final class wo6 {
    public float c;
    public final WeakReference e;
    public un6 f;
    public final TextPaint a = new TextPaint(1);
    public final ao0 b = new ao0(1, this);
    public boolean d = true;

    public wo6(do0 do0Var) {
        this.e = new WeakReference(null);
        this.e = new WeakReference(do0Var);
    }

    public final float a(String str) {
        float measureText;
        if (!this.d) {
            return this.c;
        }
        TextPaint textPaint = this.a;
        if (str == null) {
            measureText = RecyclerView.A1;
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
