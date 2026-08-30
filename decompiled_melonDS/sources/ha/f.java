package ha;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.preference.Preference;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f6419a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f6420b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6421c;

    /* renamed from: d  reason: collision with root package name */
    public int f6422d;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6429k;
    public ah.e m;

    /* renamed from: e  reason: collision with root package name */
    public Layout.Alignment f6423e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f  reason: collision with root package name */
    public int f6424f = Preference.DEFAULT_ORDER;

    /* renamed from: g  reason: collision with root package name */
    public float f6425g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f6426h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public int f6427i = 1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f6428j = true;

    /* renamed from: l  reason: collision with root package name */
    public TextUtils.TruncateAt f6430l = null;

    public f(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f6419a = charSequence;
        this.f6420b = textPaint;
        this.f6421c = i2;
        this.f6422d = charSequence.length();
    }

    public final StaticLayout a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f6419a == null) {
            this.f6419a = "";
        }
        int max = Math.max(0, this.f6421c);
        CharSequence charSequence = this.f6419a;
        int i2 = this.f6424f;
        TextPaint textPaint = this.f6420b;
        if (i2 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f6430l);
        }
        int min = Math.min(charSequence.length(), this.f6422d);
        this.f6422d = min;
        if (this.f6429k && this.f6424f == 1) {
            this.f6423e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f6423e);
        obtain.setIncludePad(this.f6428j);
        if (this.f6429k) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f6430l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f6424f);
        float f8 = this.f6425g;
        if (f8 != 0.0f || this.f6426h != 1.0f) {
            obtain.setLineSpacing(f8, this.f6426h);
        }
        if (this.f6424f > 1) {
            obtain.setHyphenationFrequency(this.f6427i);
        }
        ah.e eVar = this.m;
        if (eVar != null) {
            obtain.setBreakStrategy(((TextInputLayout) eVar.B).f3136r0.getBreakStrategy());
        }
        return obtain.build();
    }
}
