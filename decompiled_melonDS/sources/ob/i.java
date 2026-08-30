package ob;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements Appendable, CharSequence {
    public final ArrayDeque B = new ArrayDeque(8);
    public final StringBuilder A = new StringBuilder((CharSequence) "");

    public i() {
        b(0, "");
    }

    public static void c(i iVar, Object obj, int i2, int i10) {
        if (obj != null) {
            if (obj.getClass().isArray()) {
                for (Object obj2 : (Object[]) obj) {
                    c(iVar, obj2, i2, i10);
                }
                return;
            }
            iVar.B.push(new g(obj, i2, i10, 33));
        }
    }

    public final void a(char c4) {
        this.A.append(c4);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i2, int i10) {
        CharSequence subSequence = charSequence.subSequence(i2, i10);
        StringBuilder sb2 = this.A;
        b(sb2.length(), subSequence);
        sb2.append(subSequence);
        return this;
    }

    public final void b(int i2, CharSequence charSequence) {
        int i10;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z10 = spanned instanceof h;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            if (spans != null) {
                i10 = spans.length;
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                ArrayDeque arrayDeque = this.B;
                if (z10) {
                    for (int i11 = i10 - 1; i11 >= 0; i11--) {
                        Object obj = spans[i11];
                        arrayDeque.push(new g(obj, spanned.getSpanStart(obj) + i2, spanned.getSpanEnd(obj) + i2, spanned.getSpanFlags(obj)));
                    }
                    return;
                }
                for (int i12 = 0; i12 < i10; i12++) {
                    Object obj2 = spans[i12];
                    arrayDeque.push(new g(obj2, spanned.getSpanStart(obj2) + i2, spanned.getSpanEnd(obj2) + i2, spanned.getSpanFlags(obj2)));
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.A.charAt(i2);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.A.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i10) {
        List<g> list;
        int i11;
        StringBuilder sb2 = this.A;
        int length = sb2.length();
        if (i10 > i2 && i2 >= 0 && i10 <= length) {
            ArrayDeque arrayDeque = this.B;
            if (i2 == 0 && length == i10) {
                ArrayList arrayList = new ArrayList(arrayDeque);
                Collections.reverse(arrayList);
                list = Collections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(0);
                Iterator descendingIterator = arrayDeque.descendingIterator();
                while (descendingIterator.hasNext()) {
                    g gVar = (g) descendingIterator.next();
                    int i12 = gVar.f10876b;
                    if ((i12 >= i2 && i12 < i10) || (((i11 = gVar.f10877c) <= i10 && i11 > i2) || (i12 < i2 && i11 > i10))) {
                        arrayList2.add(gVar);
                    }
                }
                list = Collections.unmodifiableList(arrayList2);
            }
        } else {
            list = Collections.EMPTY_LIST;
        }
        if (list.isEmpty()) {
            return sb2.subSequence(i2, i10);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.subSequence(i2, i10));
        int length2 = spannableStringBuilder.length();
        for (g gVar2 : list) {
            int max = Math.max(0, gVar2.f10876b - i2);
            spannableStringBuilder.setSpan(gVar2.f10875a, max, Math.min(length2, (gVar2.f10877c - gVar2.f10876b) + max), gVar2.f10878d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.A.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c4) {
        this.A.append(c4);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        StringBuilder sb2 = this.A;
        b(sb2.length(), charSequence);
        sb2.append(charSequence);
        return this;
    }
}
