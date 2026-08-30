package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xe6  reason: default package */
/* loaded from: classes.dex */
public final class xe6 {
    public CharSequence a;
    public final TextPaint b;
    public final int c;
    public int d;
    public boolean k;
    public a31 m;
    public Layout.Alignment e = Layout.Alignment.ALIGN_NORMAL;
    public int f = Preference.DEFAULT_ORDER;
    public float g = RecyclerView.A1;
    public float h = 1.0f;
    public int i = 1;
    public boolean j = true;
    public TextUtils.TruncateAt l = null;

    public xe6(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.a == null) {
            this.a = "";
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.a;
        int i = this.f;
        TextPaint textPaint = this.b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.l);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.k && this.f == 1) {
            this.e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.e);
        obtain.setIncludePad(this.j);
        if (this.k) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f);
        float f = this.g;
        if (f != RecyclerView.A1 || this.h != 1.0f) {
            obtain.setLineSpacing(f, this.h);
        }
        if (this.f > 1) {
            obtain.setHyphenationFrequency(this.i);
        }
        a31 a31Var = this.m;
        if (a31Var != null) {
            obtain.setBreakStrategy(((TextInputLayout) a31Var.B).s0.getBreakStrategy());
        }
        return obtain.build();
    }
}
