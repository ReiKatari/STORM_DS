package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tg7  reason: default package */
/* loaded from: classes.dex */
public final class tg7 implements Spannable {
    public boolean A = false;
    public Spannable B;

    public tg7(Spannable spannable) {
        this.B = spannable;
    }

    public final void a() {
        jd1 jd1Var;
        Spannable spannable = this.B;
        if (!this.A) {
            if (Build.VERSION.SDK_INT < 28) {
                jd1Var = new jd1(29);
            } else {
                jd1Var = new jd1(29);
            }
            if (jd1Var.j(spannable)) {
                this.B = new SpannableString(spannable);
            }
        }
        this.A = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.B.charAt(i);
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
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.B.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.B.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.B.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.B.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.B.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.B.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.B.toString();
    }
}
