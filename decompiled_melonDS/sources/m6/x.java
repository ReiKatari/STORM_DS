package m6;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x implements Spannable {
    public boolean A = false;
    public Spannable B;

    public x(Spannable spannable) {
        this.B = spannable;
    }

    public final void a() {
        l7.a aVar;
        Spannable spannable = this.B;
        if (!this.A) {
            if (Build.VERSION.SDK_INT < 28) {
                aVar = new l7.a(3);
            } else {
                aVar = new l7.a(3);
            }
            if (aVar.i(spannable)) {
                this.B = new SpannableString(spannable);
            }
        }
        this.A = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.B.charAt(i2);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.B.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.B.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.B.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.B.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.B.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i2, int i10, Class cls) {
        return this.B.getSpans(i2, i10, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.B.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i2, int i10, Class cls) {
        return this.B.nextSpanTransition(i2, i10, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.B.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i2, int i10, int i11) {
        a();
        this.B.setSpan(obj, i2, i10, i11);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i10) {
        return this.B.subSequence(i2, i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.B.toString();
    }
}
