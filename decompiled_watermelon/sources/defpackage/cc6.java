package defpackage;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cc6  reason: default package */
/* loaded from: classes.dex */
public final class cc6 implements Appendable, CharSequence {
    public final ArrayDeque B = new ArrayDeque(8);
    public final StringBuilder A = new StringBuilder((CharSequence) "");

    public cc6() {
        b(0, "");
    }

    public static void c(cc6 cc6Var, Object obj, int i, int i2) {
        if (obj != null) {
            if (obj.getClass().isArray()) {
                for (Object obj2 : (Object[]) obj) {
                    c(cc6Var, obj2, i, i2);
                }
                return;
            }
            cc6Var.B.push(new zb6(obj, i, i2, 33));
        }
    }

    public final void a(char c) {
        this.A.append(c);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        CharSequence subSequence = charSequence.subSequence(i, i2);
        StringBuilder sb = this.A;
        b(sb.length(), subSequence);
        sb.append(subSequence);
        return this;
    }

    public final void b(int i, CharSequence charSequence) {
        int i2;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z = spanned instanceof ac6;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            if (spans != null) {
                i2 = spans.length;
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                ArrayDeque arrayDeque = this.B;
                if (z) {
                    for (int i3 = i2 - 1; i3 >= 0; i3--) {
                        Object obj = spans[i3];
                        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spanned;
                        arrayDeque.push(new zb6(obj, spannableStringBuilder.getSpanStart(obj) + i, spannableStringBuilder.getSpanEnd(obj) + i, spannableStringBuilder.getSpanFlags(obj)));
                    }
                    return;
                }
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj2 = spans[i4];
                    arrayDeque.push(new zb6(obj2, spanned.getSpanStart(obj2) + i, spanned.getSpanEnd(obj2) + i, spanned.getSpanFlags(obj2)));
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.A.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.A.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        List<zb6> list;
        int i3;
        StringBuilder sb = this.A;
        int length = sb.length();
        if (i2 > i && i >= 0 && i2 <= length) {
            ArrayDeque arrayDeque = this.B;
            if (i == 0 && length == i2) {
                ArrayList arrayList = new ArrayList(arrayDeque);
                Collections.reverse(arrayList);
                list = Collections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(0);
                Iterator descendingIterator = arrayDeque.descendingIterator();
                while (descendingIterator.hasNext()) {
                    zb6 zb6Var = (zb6) descendingIterator.next();
                    int i4 = zb6Var.b;
                    if ((i4 >= i && i4 < i2) || (((i3 = zb6Var.c) <= i2 && i3 > i) || (i4 < i && i3 > i2))) {
                        arrayList2.add(zb6Var);
                    }
                }
                list = Collections.unmodifiableList(arrayList2);
            }
        } else {
            list = Collections.EMPTY_LIST;
        }
        if (list.isEmpty()) {
            return sb.subSequence(i, i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.subSequence(i, i2));
        int length2 = spannableStringBuilder.length();
        for (zb6 zb6Var2 : list) {
            int max = Math.max(0, zb6Var2.b - i);
            spannableStringBuilder.setSpan(zb6Var2.a, max, Math.min(length2, (zb6Var2.c - zb6Var2.b) + max), zb6Var2.d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.A.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.A.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        StringBuilder sb = this.A;
        b(sb.length(), charSequence);
        sb.append(charSequence);
        return this;
    }
}
