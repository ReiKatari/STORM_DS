package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y27  reason: default package */
/* loaded from: classes.dex */
public final class y27 implements Spannable {
    public boolean A = false;
    public Spannable B;

    public y27(Spannable spannable) {
        this.B = spannable;
    }

    public final void a() {
        vn1 vn1Var;
        Spannable spannable = this.B;
        if (!this.A) {
            if (Build.VERSION.SDK_INT < 28) {
                vn1Var = new vn1(27);
            } else {
                vn1Var = new vn1(27);
            }
            if (vn1Var.l(spannable)) {
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
