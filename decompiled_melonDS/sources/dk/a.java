package dk;

import a0.g;
import android.content.res.TypedArray;
import android.util.SparseArray;
import f2.s;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import m4.c;
import m6.i;
import nc.k;
import p1.c1;
import qa.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4110a;

    /* renamed from: b  reason: collision with root package name */
    public int f4111b;

    /* renamed from: c  reason: collision with root package name */
    public int f4112c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4113d;

    /* renamed from: e  reason: collision with root package name */
    public Object f4114e;

    public a(CharSequence charSequence, int i2, Locale locale) {
        this.f4110a = 2;
        this.f4113d = charSequence;
        if (charSequence.length() < 0) {
            r4.a.a("input start index is outside the CharSequence");
        }
        if (i2 < 0 || i2 > charSequence.length()) {
            r4.a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f4114e = wordInstance;
        this.f4111b = Math.max(0, -50);
        this.f4112c = Math.min(charSequence.length(), i2 + 50);
        wordInstance.setText(new c(i2, charSequence));
    }

    public void a(int i2) {
        int i10 = this.f4111b;
        int i11 = this.f4112c;
        boolean z10 = false;
        if (i2 <= i11 && i10 <= i2) {
            z10 = true;
        }
        if (!z10) {
            StringBuilder j2 = kc.a.j("Invalid offset: ", i2, ". Valid range is [", i10, " , ");
            j2.append(i11);
            j2.append(']');
            r4.a.a(j2.toString());
        }
    }

    public int b() {
        s sVar = (s) this.f4114e;
        String str = (String) this.f4113d;
        if (sVar == null) {
            return str.length();
        }
        return (sVar.f4789b - sVar.d()) + (str.length() - (this.f4112c - this.f4111b));
    }

    public boolean c(int i2) {
        CharSequence charSequence = (CharSequence) this.f4113d;
        int i10 = this.f4111b + 1;
        if (i2 <= this.f4112c && i10 <= i2) {
            if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i2))) {
                int i11 = i2 - 1;
                if (!Character.isSurrogate(charSequence.charAt(i11))) {
                    if (i.d()) {
                        i a10 = i.a();
                        if (a10.c() != 1 || a10.b(i11, charSequence) == -1) {
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

    public boolean d(int i2) {
        int i10 = this.f4111b + 1;
        if (i2 <= this.f4112c && i10 <= i2) {
            return a.a.P(Character.codePointBefore((CharSequence) this.f4113d, i2));
        }
        return false;
    }

    public boolean e(int i2) {
        a(i2);
        if (((BreakIterator) this.f4114e).isBoundary(i2)) {
            if (!g(i2) || !g(i2 - 1) || !g(i2 + 1)) {
                if (i2 <= 0 || i2 >= ((CharSequence) this.f4113d).length() - 1 || (!f(i2) && !f(i2 + 1))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean f(int i2) {
        CharSequence charSequence = (CharSequence) this.f4113d;
        int i10 = i2 - 1;
        Character.UnicodeBlock of2 = Character.UnicodeBlock.of(charSequence.charAt(i10));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (!k.a(of2, unicodeBlock) || !k.a(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA)) {
            if (k.a(Character.UnicodeBlock.of(charSequence.charAt(i2)), unicodeBlock) && k.a(Character.UnicodeBlock.of(charSequence.charAt(i10)), Character.UnicodeBlock.KATAKANA)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean g(int i2) {
        CharSequence charSequence = (CharSequence) this.f4113d;
        int i10 = this.f4111b;
        if (i2 < this.f4112c && i10 <= i2) {
            if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i2)) && !Character.isSurrogate(charSequence.charAt(i2))) {
                if (i.d()) {
                    i a10 = i.a();
                    if (a10.c() != 1 || a10.b(i2, charSequence) == -1) {
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

    public boolean h(int i2) {
        int i10 = this.f4111b;
        if (i2 < this.f4112c && i10 <= i2) {
            return a.a.P(Character.codePointAt((CharSequence) this.f4113d, i2));
        }
        return false;
    }

    public int i(int i2) {
        a(i2);
        int following = ((BreakIterator) this.f4114e).following(i2);
        if (g(following - 1) && g(following) && !f(following)) {
            return i(following);
        }
        return following;
    }

    public int j(int i2) {
        a(i2);
        int preceding = ((BreakIterator) this.f4114e).preceding(i2);
        if (g(preceding) && c(preceding) && !f(preceding)) {
            return j(preceding);
        }
        return preceding;
    }

    public void k(int i2, int i10, String str) {
        if (i2 > i10) {
            r4.a.a("start index must be less than or equal to end index: " + i2 + " > " + i10);
        }
        if (i2 < 0) {
            r4.a.a("start must be non-negative, but was " + i2);
        }
        s sVar = (s) this.f4114e;
        if (sVar == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i2, 64);
            int min2 = Math.min(((String) this.f4113d).length() - i10, 64);
            String str2 = (String) this.f4113d;
            int i11 = i2 - min;
            str2.getClass();
            str2.getChars(i11, i2, cArr, 0);
            String str3 = (String) this.f4113d;
            int i12 = max - min2;
            int i13 = min2 + i10;
            str3.getClass();
            str3.getChars(i10, i13, cArr, i12);
            str.getChars(0, str.length(), cArr, min);
            s sVar2 = new s(3);
            sVar2.f4789b = max;
            sVar2.f4792e = cArr;
            sVar2.f4790c = str.length() + min;
            sVar2.f4791d = i12;
            this.f4114e = sVar2;
            this.f4111b = i11;
            this.f4112c = i13;
            return;
        }
        int i14 = this.f4111b;
        int i15 = i2 - i14;
        int i16 = i10 - i14;
        if (i15 >= 0 && i16 <= sVar.f4789b - sVar.d()) {
            int length = str.length() - (i16 - i15);
            if (length > sVar.d()) {
                int d4 = length - sVar.d();
                int i17 = sVar.f4789b;
                do {
                    i17 *= 2;
                } while (i17 - sVar.f4789b < d4);
                char[] cArr2 = new char[i17];
                System.arraycopy((char[]) sVar.f4792e, 0, cArr2, 0, sVar.f4790c);
                int i18 = sVar.f4789b;
                int i19 = sVar.f4791d;
                int i20 = i18 - i19;
                int i21 = i17 - i20;
                System.arraycopy((char[]) sVar.f4792e, i19, cArr2, i21, (i20 + i19) - i19);
                sVar.f4792e = cArr2;
                sVar.f4789b = i17;
                sVar.f4791d = i21;
            }
            int i22 = sVar.f4790c;
            if (i15 < i22 && i16 <= i22) {
                int i23 = i22 - i16;
                char[] cArr3 = (char[]) sVar.f4792e;
                System.arraycopy(cArr3, i16, cArr3, sVar.f4791d - i23, i23);
                sVar.f4790c = i15;
                sVar.f4791d -= i23;
            } else if (i15 < i22 && i16 >= i22) {
                sVar.f4791d = sVar.d() + i16;
                sVar.f4790c = i15;
            } else {
                int d10 = sVar.d() + i16;
                int i24 = sVar.f4791d;
                int d11 = (sVar.d() + i15) - i24;
                char[] cArr4 = (char[]) sVar.f4792e;
                System.arraycopy(cArr4, i24, cArr4, sVar.f4790c, d11);
                sVar.f4790c += d11;
                sVar.f4791d = d10;
            }
            str.getChars(0, str.length(), (char[]) sVar.f4792e, sVar.f4790c);
            sVar.f4790c = str.length() + sVar.f4790c;
            return;
        }
        this.f4113d = toString();
        this.f4114e = null;
        this.f4111b = -1;
        this.f4112c = -1;
        k(i2, i10, str);
    }

    public String toString() {
        switch (this.f4110a) {
            case 3:
                s sVar = (s) this.f4114e;
                String str = (String) this.f4113d;
                if (sVar != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((CharSequence) str, 0, this.f4111b);
                    sb2.append((char[]) sVar.f4792e, 0, sVar.f4790c);
                    int i2 = sVar.f4791d;
                    sb2.append((char[]) sVar.f4792e, i2, sVar.f4789b - i2);
                    String str2 = (String) this.f4113d;
                    sb2.append((CharSequence) str2, this.f4112c, str2.length());
                    return sb2.toString();
                }
                return str;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a() {
        this.f4110a = 3;
    }

    public a(int i2) {
        this.f4110a = 1;
        this.f4112c = -1;
        this.f4111b = i2;
    }

    public a(b bVar, int i2, int i10) {
        this.f4110a = 0;
        this.f4114e = bVar;
        this.f4111b = i2;
        this.f4112c = (1 << i10) - 1;
        this.f4113d = new g[1 << (i2 + i10)];
        int i11 = 0;
        while (true) {
            g[] gVarArr = (g[]) this.f4113d;
            if (i11 >= gVarArr.length) {
                return;
            }
            gVarArr[i11] = new g(this);
            i11++;
        }
    }

    public a(m mVar, c1 c1Var) {
        this.f4110a = 4;
        this.f4113d = new SparseArray();
        this.f4114e = mVar;
        TypedArray typedArray = (TypedArray) c1Var.B;
        this.f4111b = typedArray.getResourceId(28, 0);
        this.f4112c = typedArray.getResourceId(53, 0);
    }
}
