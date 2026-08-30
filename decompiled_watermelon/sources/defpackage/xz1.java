package defpackage;

import android.content.res.TypedArray;
import android.util.SparseArray;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xz1  reason: default package */
/* loaded from: classes.dex */
public final class xz1 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public xz1(CharSequence charSequence, int i, Locale locale) {
        this.a = 4;
        this.d = charSequence;
        if (charSequence.length() < 0) {
            nz2.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            nz2.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new ek0(i, charSequence));
    }

    public void a(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (!z) {
            StringBuilder s = b31.s(i, i2, "Invalid offset: ", ". Valid range is [", " , ");
            s.append(i3);
            s.append(']');
            nz2.a(s.toString());
        }
    }

    public int b() {
        yp0 yp0Var = (yp0) this.e;
        String str = (String) this.d;
        if (yp0Var == null) {
            return str.length();
        }
        return (yp0Var.b - yp0Var.d()) + (str.length() - (this.c - this.b));
    }

    public boolean c(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i <= this.c && i2 <= i) {
            if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
                int i3 = i - 1;
                if (!Character.isSurrogate(charSequence.charAt(i3))) {
                    if (mo1.d()) {
                        mo1 a = mo1.a();
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
            return yg7.b(Character.codePointBefore((CharSequence) this.d, i));
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
        if (!b53.x(of, unicodeBlock) || !b53.x(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            if (b53.x(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && b53.x(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA)) {
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
                if (mo1.d()) {
                    mo1 a = mo1.a();
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
            return yg7.b(Character.codePointAt((CharSequence) this.d, i));
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
            nz2.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            nz2.a("start must be non-negative, but was " + i);
        }
        yp0 yp0Var = (yp0) this.e;
        if (yp0Var == null) {
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
            yp0 yp0Var2 = new yp0(1);
            yp0Var2.b = max;
            yp0Var2.e = cArr;
            yp0Var2.c = str.length() + min;
            yp0Var2.d = i4;
            this.e = yp0Var2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 >= 0 && i8 <= yp0Var.b - yp0Var.d()) {
            int length = str.length() - (i8 - i7);
            if (length > yp0Var.d()) {
                int d = length - yp0Var.d();
                int i9 = yp0Var.b;
                do {
                    i9 *= 2;
                } while (i9 - yp0Var.b < d);
                char[] cArr2 = new char[i9];
                System.arraycopy((char[]) yp0Var.e, 0, cArr2, 0, yp0Var.c);
                int i10 = yp0Var.b;
                int i11 = yp0Var.d;
                int i12 = i10 - i11;
                int i13 = i9 - i12;
                System.arraycopy((char[]) yp0Var.e, i11, cArr2, i13, (i12 + i11) - i11);
                yp0Var.e = cArr2;
                yp0Var.b = i9;
                yp0Var.d = i13;
            }
            int i14 = yp0Var.c;
            if (i7 < i14 && i8 <= i14) {
                int i15 = i14 - i8;
                char[] cArr3 = (char[]) yp0Var.e;
                System.arraycopy(cArr3, i8, cArr3, yp0Var.d - i15, i15);
                yp0Var.c = i7;
                yp0Var.d -= i15;
            } else if (i7 < i14 && i8 >= i14) {
                yp0Var.d = yp0Var.d() + i8;
                yp0Var.c = i7;
            } else {
                int d2 = yp0Var.d() + i8;
                int i16 = yp0Var.d;
                int d3 = (yp0Var.d() + i7) - i16;
                char[] cArr4 = (char[]) yp0Var.e;
                System.arraycopy(cArr4, i16, cArr4, yp0Var.c, d3);
                yp0Var.c += d3;
                yp0Var.d = d2;
            }
            str.getChars(0, str.length(), (char[]) yp0Var.e, yp0Var.c);
            yp0Var.c = str.length() + yp0Var.c;
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
                yp0 yp0Var = (yp0) this.e;
                String str = (String) this.d;
                if (yp0Var != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) str, 0, this.b);
                    sb.append((char[]) yp0Var.e, 0, yp0Var.c);
                    int i = yp0Var.d;
                    sb.append((char[]) yp0Var.e, i, yp0Var.b - i);
                    String str2 = (String) this.d;
                    sb.append((CharSequence) str2, this.c, str2.length());
                    return sb.toString();
                }
                return str;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ xz1() {
        this.a = 3;
    }

    public xz1(int i) {
        this.a = 1;
        this.c = -1;
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [k91, java.lang.Object] */
    public xz1(fc3 fc3Var, int i, int i2) {
        this.a = 2;
        this.e = fc3Var;
        this.b = i;
        this.c = (1 << i2) - 1;
        this.d = new k91[1 << (i + i2)];
        int i3 = 0;
        while (true) {
            k91[] k91VarArr = (k91[]) this.d;
            if (i3 >= k91VarArr.length) {
                return;
            }
            ?? obj = new Object();
            obj.B = this;
            obj.A = new short[768];
            k91VarArr[i3] = obj;
            i3++;
        }
    }

    public xz1(yz1 yz1Var, n85 n85Var) {
        this.a = 0;
        this.d = new SparseArray();
        this.e = yz1Var;
        TypedArray typedArray = (TypedArray) n85Var.L;
        this.b = typedArray.getResourceId(28, 0);
        this.c = typedArray.getResourceId(53, 0);
    }
}
