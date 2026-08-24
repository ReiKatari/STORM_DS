package defpackage;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sn6  reason: default package */
/* loaded from: classes.dex */
public final class sn6 implements Appendable, CharSequence {
    public final ArrayDeque B = new ArrayDeque(8);
    public final StringBuilder A = new StringBuilder((CharSequence) "");

    public sn6() {
        b(0, "");
    }

    public static void c(sn6 sn6Var, Object obj, int i, int i2) {
        if (obj != null) {
            if (obj.getClass().isArray()) {
                for (Object obj2 : (Object[]) obj) {
                    c(sn6Var, obj2, i, i2);
                }
                return;
            }
            sn6Var.B.push(new pn6(obj, i, i2, 33));
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
            boolean z = spanned instanceof qn6;
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
                        arrayDeque.push(new pn6(obj, spannableStringBuilder.getSpanStart(obj) + i, spannableStringBuilder.getSpanEnd(obj) + i, spannableStringBuilder.getSpanFlags(obj)));
                    }
                    return;
                }
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj2 = spans[i4];
                    arrayDeque.push(new pn6(obj2, spanned.getSpanStart(obj2) + i, spanned.getSpanEnd(obj2) + i, spanned.getSpanFlags(obj2)));
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
        List<pn6> list;
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
                    pn6 pn6Var = (pn6) descendingIterator.next();
                    int i4 = pn6Var.b;
                    if ((i4 >= i && i4 < i2) || (((i3 = pn6Var.c) <= i2 && i3 > i) || (i4 < i && i3 > i2))) {
                        arrayList2.add(pn6Var);
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
        for (pn6 pn6Var2 : list) {
            int max = Math.max(0, pn6Var2.b - i);
            spannableStringBuilder.setSpan(pn6Var2.a, max, Math.min(length2, (pn6Var2.c - pn6Var2.b) + max), pn6Var2.d);
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
