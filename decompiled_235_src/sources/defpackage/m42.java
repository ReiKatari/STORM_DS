package defpackage;

import android.content.res.TypedArray;
import android.util.SparseArray;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m42  reason: default package */
/* loaded from: classes.dex */
public final class m42 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public m42(CharSequence charSequence, int i, Locale locale) {
        this.a = 4;
        this.d = charSequence;
        if (charSequence.length() < 0) {
            q53.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            q53.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new nm0(i, charSequence));
    }

    public void a(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (!z) {
            StringBuilder q = i61.q(i, i2, "Invalid offset: ", ". Valid range is [", " , ");
            q.append(i3);
            q.append(']');
            q53.a(q.toString());
        }
    }

    public int b() {
        ls0 ls0Var = (ls0) this.e;
        String str = (String) this.d;
        if (ls0Var == null) {
            return str.length();
        }
        return (ls0Var.b - ls0Var.d()) + (str.length() - (this.c - this.b));
    }

    public boolean c(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i <= this.c && i2 <= i) {
            if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
                int i3 = i - 1;
                if (!Character.isSurrogate(charSequence.charAt(i3))) {
                    if (ws1.d()) {
                        ws1 a = ws1.a();
                        if (a.c() != 1 || a.b(i3, charSequence) == -1) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean d(int i) {
        int i2 = this.b + 1;
        if (i <= this.c && i2 <= i) {
            return yv7.b(Character.codePointBefore((CharSequence) this.d, i));
        }
        return false;
    }

    public boolean e(int i) {
        a(i);
        if (((BreakIterator) this.e).isBoundary(i)) {
            if (!g(i) || !g(i - 1) || !g(i + 1)) {
                if (i <= 0 || i >= ((CharSequence) this.d).length() - 1 || (!f(i) && !f(i + 1))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean f(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = i - 1;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (!nb3.k(of, unicodeBlock) || !nb3.k(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            if (nb3.k(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && nb3.k(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean g(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b;
        if (i < this.c && i2 <= i) {
            if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
                if (ws1.d()) {
                    ws1 a = ws1.a();
                    if (a.c() != 1 || a.b(i, charSequence) == -1) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean h(int i) {
        int i2 = this.b;
        if (i < this.c && i2 <= i) {
            return yv7.b(Character.codePointAt((CharSequence) this.d, i));
        }
        return false;
    }

    public int i(int i) {
        a(i);
        int following = ((BreakIterator) this.e).following(i);
        if (g(following - 1) && g(following) && !f(following)) {
            return i(following);
        }
        return following;
    }

    public int j(int i) {
        a(i);
        int preceding = ((BreakIterator) this.e).preceding(i);
        if (g(preceding) && c(preceding) && !f(preceding)) {
            return j(preceding);
        }
        return preceding;
    }

    public void k(int i, int i2, String str) {
        if (i > i2) {
            q53.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            q53.a("start must be non-negative, but was " + i);
        }
        ls0 ls0Var = (ls0) this.e;
        if (ls0Var == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - min;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = max - min2;
            int i5 = min2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, min);
            ls0 ls0Var2 = new ls0(1);
            ls0Var2.b = max;
            ls0Var2.e = cArr;
            ls0Var2.c = str.length() + min;
            ls0Var2.d = i4;
            this.e = ls0Var2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 >= 0 && i8 <= ls0Var.b - ls0Var.d()) {
            int length = str.length() - (i8 - i7);
            if (length > ls0Var.d()) {
                int d = length - ls0Var.d();
                int i9 = ls0Var.b;
                do {
                    i9 *= 2;
                } while (i9 - ls0Var.b < d);
                char[] cArr2 = new char[i9];
                System.arraycopy((char[]) ls0Var.e, 0, cArr2, 0, ls0Var.c);
                int i10 = ls0Var.b;
                int i11 = ls0Var.d;
                int i12 = i10 - i11;
                int i13 = i9 - i12;
                System.arraycopy((char[]) ls0Var.e, i11, cArr2, i13, (i12 + i11) - i11);
                ls0Var.e = cArr2;
                ls0Var.b = i9;
                ls0Var.d = i13;
            }
            int i14 = ls0Var.c;
            if (i7 < i14 && i8 <= i14) {
                int i15 = i14 - i8;
                char[] cArr3 = (char[]) ls0Var.e;
                System.arraycopy(cArr3, i8, cArr3, ls0Var.d - i15, i15);
                ls0Var.c = i7;
                ls0Var.d -= i15;
            } else if (i7 < i14 && i8 >= i14) {
                ls0Var.d = ls0Var.d() + i8;
                ls0Var.c = i7;
            } else {
                int d2 = ls0Var.d() + i8;
                int i16 = ls0Var.d;
                int d3 = (ls0Var.d() + i7) - i16;
                char[] cArr4 = (char[]) ls0Var.e;
                System.arraycopy(cArr4, i16, cArr4, ls0Var.c, d3);
                ls0Var.c += d3;
                ls0Var.d = d2;
            }
            str.getChars(0, str.length(), (char[]) ls0Var.e, ls0Var.c);
            ls0Var.c = str.length() + ls0Var.c;
            return;
        }
        this.d = toString();
        this.e = null;
        this.b = -1;
        this.c = -1;
        k(i, i2, str);
    }

    public String toString() {
        switch (this.a) {
            case 3:
                ls0 ls0Var = (ls0) this.e;
                String str = (String) this.d;
                if (ls0Var != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) str, 0, this.b);
                    sb.append((char[]) ls0Var.e, 0, ls0Var.c);
                    int i = ls0Var.d;
                    sb.append((char[]) ls0Var.e, i, ls0Var.b - i);
                    String str2 = (String) this.d;
                    sb.append((CharSequence) str2, this.c, str2.length());
                    return sb.toString();
                }
                return str;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ m42() {
        this.a = 3;
    }

    public m42(int i) {
        this.a = 1;
        this.c = -1;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [yc1, java.lang.Object] */
    public m42(xi3 xi3Var, int i, int i2) {
        this.a = 2;
        this.e = xi3Var;
        this.b = i;
        this.c = (1 << i2) - 1;
        this.d = new yc1[1 << (i + i2)];
        int i3 = 0;
        while (true) {
            yc1[] yc1VarArr = (yc1[]) this.d;
            if (i3 >= yc1VarArr.length) {
                return;
            }
            ?? obj = new Object();
            obj.B = this;
            obj.A = new short[768];
            yc1VarArr[i3] = obj;
            i3++;
        }
    }

    public m42(n42 n42Var, m44 m44Var) {
        this.a = 0;
        this.d = new SparseArray();
        this.e = n42Var;
        TypedArray typedArray = (TypedArray) m44Var.L;
        this.b = typedArray.getResourceId(28, 0);
        this.c = typedArray.getResourceId(53, 0);
    }
}
