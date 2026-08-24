package defpackage;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import androidx.recyclerview.widget.RecyclerView;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gj  reason: default package */
/* loaded from: classes.dex */
public final class gj implements as4 {
    public final String a;
    public final s47 b;
    public final List c;
    public final List d;
    public final ki2 e;
    public final qh1 f;
    public final km g;
    public final CharSequence h;
    public final dm3 i;
    public m44 j;
    public final boolean k;
    public final int l;

    /* JADX WARN: Code restructure failed: missing block: B:184:0x03b0, code lost:
        if ((r6.b.c & 1095216660480L) != 0) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
        if (r7 == 1) goto L438;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0871 A[LOOP:6: B:417:0x086f->B:418:0x0871, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0154 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ef  */
    /* JADX WARN: Type inference failed for: r4v3, types: [km, android.text.TextPaint, android.graphics.Paint] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gj(String str, s47 s47Var, List list, List list2, ki2 ki2Var, qh1 qh1Var) {
        boolean booleanValue;
        Locale locale;
        int i;
        i47 i47Var;
        int flags;
        int i2;
        int size;
        int i3;
        Object obj;
        boolean z;
        oj2 oj2Var;
        ij2 ij2Var;
        String str2;
        gy3 gy3Var;
        f37 f37Var;
        long j;
        long b;
        boolean z2;
        li2 li2Var;
        oj2 oj2Var2;
        int i4;
        jj2 jj2Var;
        int i5;
        boolean z3;
        we7 b2;
        Typeface typeface;
        long j2;
        x20 x20Var;
        boolean z4;
        long j3;
        boolean z5;
        boolean z6;
        long j4;
        x20 x20Var2;
        nn6 nn6Var;
        String str3;
        float textSize;
        qh1 qh1Var2;
        boolean z7;
        CharSequence charSequence;
        Spannable spannableString;
        nn6 nn6Var2;
        ds4 ds4Var;
        long j5;
        hy4 hy4Var;
        boolean z8;
        float K;
        int length;
        boolean z9;
        boolean z10;
        int i6;
        g37 g37Var;
        ds4 ds4Var2;
        ArrayList arrayList;
        int size2;
        int i7;
        nn6 nn6Var3;
        li2 li2Var2;
        nn6 nn6Var4;
        ArrayList arrayList2;
        nn6 nn6Var5;
        int i8;
        int size3;
        int i9;
        boolean z11;
        g37 g37Var2;
        int size4;
        int i10;
        int size5;
        int i11;
        int i12;
        int i13;
        int i14;
        Object obj2;
        int i15;
        int i16;
        List list3;
        boolean z12;
        Spannable spannable;
        qh1 qh1Var3;
        ds4 ds4Var3;
        int i17;
        boolean z13;
        boolean z14;
        float f;
        float f2;
        ux4 ux4Var;
        jt1 jt1Var;
        int i18;
        ux4 ux4Var2;
        ep epVar;
        this.a = str;
        this.b = s47Var;
        this.c = list;
        this.d = list2;
        this.e = ki2Var;
        this.f = qh1Var;
        float a = qh1Var.a();
        ?? textPaint = new TextPaint(1);
        ((TextPaint) textPaint).density = a;
        textPaint.b = b17.b;
        textPaint.c = 3;
        textPaint.d = ge6.d;
        this.g = textPaint;
        boolean h = jw2.h(s47Var);
        nn6 nn6Var6 = s47Var.a;
        ds4 ds4Var4 = s47Var.b;
        if (!h) {
            booleanValue = false;
        } else {
            d51 d51Var = zs1.a;
            d51 d51Var2 = zs1.a;
            pp6 pp6Var = (pp6) d51Var2.B;
            if (pp6Var == null) {
                if (ws1.d()) {
                    pp6Var = d51Var2.g();
                    d51Var2.B = pp6Var;
                } else {
                    pp6Var = nb3.l;
                }
            }
            booleanValue = ((Boolean) pp6Var.getValue()).booleanValue();
        }
        this.k = booleanValue;
        int i19 = ds4Var4.b;
        gy3 gy3Var2 = nn6Var6.k;
        if (i19 != 4) {
            if (i19 != 5) {
                if (i19 == 1) {
                    i = 0;
                } else if (i19 == 2) {
                    i = 1;
                } else if (i19 == 3 || i19 == 0) {
                    int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((gy3Var2 == null || (locale = ((fy3) gy3Var2.A.get(0)).a) == null) ? Locale.getDefault() : locale);
                    if (layoutDirectionFromLocale != 0) {
                    }
                } else {
                    i.m("Invalid TextDirection.");
                    throw null;
                }
                this.l = i;
                fj fjVar = new fj(this, 0);
                i47Var = ds4Var4.i;
                i47Var = i47Var == null ? i47.c : i47Var;
                if (i47Var.b) {
                    flags = textPaint.getFlags() | 128;
                } else {
                    flags = textPaint.getFlags() & (-129);
                }
                textPaint.setFlags(flags);
                i2 = i47Var.a;
                if (i2 == 1) {
                    textPaint.setFlags(textPaint.getFlags() | 64);
                    textPaint.setHinting(0);
                } else if (i2 == 2) {
                    textPaint.getFlags();
                    textPaint.setHinting(1);
                } else if (i2 == 3) {
                    textPaint.getFlags();
                    textPaint.setHinting(0);
                } else {
                    textPaint.getFlags();
                }
                size = list.size();
                i3 = 0;
                while (true) {
                    if (i3 < size) {
                        obj = list.get(i3);
                        if (((ep) obj).a instanceof nn6) {
                            break;
                        }
                        i3++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (obj != null) {
                    z = true;
                } else {
                    z = false;
                }
                long j6 = nn6Var6.b;
                oj2Var = nn6Var6.c;
                ij2Var = nn6Var6.d;
                str2 = nn6Var6.g;
                gy3Var = nn6Var6.k;
                e37 e37Var = nn6Var6.a;
                f37Var = nn6Var6.j;
                j = nn6Var6.h;
                b = x47.b(j6);
                z2 = z;
                if (y47.a(b, 4294967296L)) {
                    textPaint.setTextSize(qh1Var.y0(j6));
                } else if (y47.a(b, 8589934592L)) {
                    textPaint.setTextSize(x47.c(j6) * textPaint.getTextSize());
                }
                li2Var = nn6Var6.f;
                if (li2Var != null && ij2Var == null && oj2Var == null) {
                    z3 = z2;
                } else {
                    if (oj2Var == null) {
                        oj2Var2 = oj2.Y;
                    } else {
                        oj2Var2 = oj2Var;
                    }
                    if (ij2Var != null) {
                        i4 = ij2Var.a;
                    } else {
                        i4 = 0;
                    }
                    jj2Var = nn6Var6.e;
                    if (jj2Var != null) {
                        i5 = jj2Var.a;
                    } else {
                        i5 = 65535;
                    }
                    gj gjVar = (gj) fjVar.B;
                    z3 = z2;
                    b2 = ((mi2) gjVar.e).b(li2Var, oj2Var2, i4, i5);
                    if (!(b2 instanceof ve7)) {
                        m44 m44Var = new m44(b2, gjVar.j);
                        gjVar.j = m44Var;
                        Object obj3 = m44Var.R;
                        obj3.getClass();
                        typeface = (Typeface) obj3;
                    } else {
                        Object obj4 = ((ve7) b2).A;
                        obj4.getClass();
                        typeface = (Typeface) obj4;
                    }
                    textPaint.setTypeface(typeface);
                }
                if (gy3Var != null) {
                    gy3 gy3Var3 = gy3.L;
                    if (!gy3Var.equals(nx4.a.H())) {
                        ArrayList arrayList3 = new ArrayList(ht0.v0(gy3Var, 10));
                        for (fy3 fy3Var : gy3Var.A) {
                            arrayList3.add(fy3Var.a);
                        }
                        Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                        textPaint.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
                    }
                }
                if (str2 != null && !str2.equals("")) {
                    textPaint.setFontFeatureSettings(str2);
                }
                if (f37Var != null && !f37Var.equals(f37.c)) {
                    textPaint.setTextScaleX(textPaint.getTextScaleX() * f37Var.a);
                    textPaint.setTextSkewX(textPaint.getTextSkewX() + f37Var.b);
                }
                textPaint.d(e37Var.b());
                textPaint.c(e37Var.c(), 9205357640488583168L, e37Var.a());
                textPaint.f(nn6Var6.n);
                textPaint.g(nn6Var6.m);
                textPaint.e(nn6Var6.p);
                if (!y47.a(x47.b(j), 4294967296L) && x47.c(j) != RecyclerView.B1) {
                    float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
                    float y0 = qh1Var.y0(j);
                    if (textScaleX != RecyclerView.B1) {
                        textPaint.setLetterSpacing(y0 / textScaleX);
                    }
                } else if (y47.a(x47.b(j), 8589934592L)) {
                    textPaint.setLetterSpacing(x47.c(j));
                }
                j2 = nn6Var6.l;
                x20Var = nn6Var6.i;
                if (!z3 && y47.a(x47.b(j), 4294967296L) && x47.c(j) != RecyclerView.B1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                j3 = kt0.h;
                if (kt0.d(j2, j3) && !kt0.d(j2, kt0.g)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (x20Var == null && Float.compare(x20Var.a, RecyclerView.B1) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z4 && !z5 && !z6) {
                    nn6Var = null;
                } else {
                    long j7 = z4 ? j : x47.c;
                    if (z5) {
                        j4 = j2;
                    } else {
                        j4 = j3;
                    }
                    if (z6) {
                        x20Var2 = x20Var;
                    } else {
                        x20Var2 = null;
                    }
                    nn6Var = new nn6(0L, 0L, (oj2) null, (ij2) null, (jj2) null, (li2) null, (String) null, j7, x20Var2, (f37) null, (gy3) null, j4, (b17) null, (ge6) null, 63103);
                }
                List list4 = this.c;
                if (nn6Var != null) {
                    int size6 = list4.size() + 1;
                    ArrayList arrayList4 = new ArrayList(size6);
                    for (int i20 = 0; i20 < size6; i20++) {
                        if (i20 == 0) {
                            epVar = new ep(nn6Var, 0, this.a.length());
                        } else {
                            epVar = (ep) this.c.get(i20 - 1);
                        }
                        arrayList4.add(epVar);
                    }
                    list4 = arrayList4;
                }
                str3 = this.a;
                textSize = this.g.getTextSize();
                s47 s47Var2 = this.b;
                List list5 = this.d;
                qh1Var2 = this.f;
                z7 = this.k;
                dj djVar = ej.a;
                if (!z7 && ws1.d()) {
                    hy4 hy4Var2 = s47Var2.c;
                    if (hy4Var2 != null && (ux4Var2 = hy4Var2.b) != null) {
                        jt1Var = new jt1(ux4Var2.b);
                    } else {
                        jt1Var = null;
                    }
                    if (jt1Var == null) {
                        i18 = 0;
                    } else if (jt1Var.a == 2) {
                        i18 = 1;
                    } else {
                        i18 = 0;
                    }
                    charSequence = ws1.a().g(0, str3.length(), i18, str3);
                    charSequence.getClass();
                } else {
                    charSequence = str3;
                }
                Spannable spannable2 = (list4.isEmpty() && list5.isEmpty() && nb3.k(s47Var2.b.d, g37.c)) ? charSequence : spannable2;
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                nn6Var2 = s47Var2.a;
                ds4Var = s47Var2.b;
                if (nb3.k(nn6Var2.m, b17.c)) {
                    j5 = 0;
                    spannableString.setSpan(ej.a, 0, str3.length(), 33);
                } else {
                    j5 = 0;
                }
                hy4Var = s47Var2.c;
                if (hy4Var == null && (ux4Var = hy4Var.b) != null) {
                    z8 = ux4Var.a;
                } else {
                    z8 = false;
                }
                if (!z8 && ds4Var.f == null) {
                    float K2 = hi2.K(ds4Var.c, textSize, qh1Var2);
                    if (!Float.isNaN(K2)) {
                        spannableString.setSpan(new tu3(K2), 0, spannableString.length(), 33);
                    }
                } else {
                    xu3 xu3Var = ds4Var.f;
                    xu3Var = xu3Var == null ? xu3.d : xu3Var;
                    K = hi2.K(ds4Var.c, textSize, qh1Var2);
                    if (!Float.isNaN(K)) {
                        if (spannableString.length() == 0 || qs6.w0(spannableString) == '\n') {
                            length = spannableString.length() + 1;
                        } else {
                            length = spannableString.length();
                        }
                        int i21 = length;
                        int i22 = xu3Var.b;
                        if ((i22 & 1) > 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if ((i22 & 16) > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i6 = 0;
                        spannableString.setSpan(new yu3(K, i21, z9, z10, xu3Var.a, xu3Var.c), 0, spannableString.length(), 33);
                        g37Var = ds4Var.d;
                        if (g37Var == null) {
                            int i23 = i6;
                            long j8 = g37Var.a;
                            long j9 = g37Var.b;
                            if ((x47.a(j8, hi2.E(i23)) && x47.a(j9, hi2.E(i23))) || (j8 & 1095216660480L) == j5 || (j9 & 1095216660480L) == j5) {
                                ds4Var2 = ds4Var;
                            } else {
                                long b3 = x47.b(j8);
                                ds4Var2 = ds4Var;
                                if (y47.a(b3, 4294967296L)) {
                                    f = qh1Var2.y0(j8);
                                } else if (y47.a(b3, 8589934592L)) {
                                    f = x47.c(j8) * textSize;
                                } else {
                                    f = 0.0f;
                                }
                                long b4 = x47.b(j9);
                                if (y47.a(b4, 4294967296L)) {
                                    f2 = qh1Var2.y0(j9);
                                } else if (y47.a(b4, 8589934592L)) {
                                    f2 = x47.c(j9) * textSize;
                                } else {
                                    f2 = 0.0f;
                                }
                                spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(f), (int) Math.ceil(f2)), 0, spannableString.length(), 33);
                            }
                        } else {
                            ds4Var2 = ds4Var;
                        }
                        arrayList = new ArrayList(list4.size());
                        size2 = list4.size();
                        for (i7 = 0; i7 < size2; i7++) {
                            ep epVar2 = (ep) list4.get(i7);
                            Object obj5 = epVar2.a;
                            if (obj5 instanceof nn6) {
                                nn6 nn6Var7 = (nn6) obj5;
                                if (nn6Var7.f != null || nn6Var7.d != null || nn6Var7.c != null || ((nn6) obj5).e != null) {
                                    arrayList.add(epVar2);
                                }
                            }
                        }
                        nn6Var3 = s47Var2.a;
                        li2Var2 = nn6Var3.f;
                        if (li2Var2 != null && nn6Var3.d == null && nn6Var3.c == null && nn6Var3.e == null) {
                            nn6Var4 = null;
                        } else {
                            nn6Var4 = new nn6(0L, 0L, nn6Var3.c, nn6Var3.d, nn6Var3.e, li2Var2, (String) null, 0L, (x20) null, (f37) null, (gy3) null, 0L, (b17) null, (ge6) null, 65475);
                        }
                        l4 l4Var = new l4(15, spannableString, fjVar);
                        if (arrayList.size() > 1) {
                            if (!arrayList.isEmpty()) {
                                nn6 nn6Var8 = (nn6) ((ep) arrayList.get(0)).a;
                                l4Var.e(nn6Var4 != null ? nn6Var4.c(nn6Var8) : nn6Var8, Integer.valueOf(((ep) arrayList.get(0)).b), Integer.valueOf(((ep) arrayList.get(0)).c));
                            }
                        } else {
                            int size7 = arrayList.size();
                            int i24 = size7 * 2;
                            int[] iArr = new int[i24];
                            int size8 = arrayList.size();
                            for (int i25 = 0; i25 < size8; i25++) {
                                ep epVar3 = (ep) arrayList.get(i25);
                                iArr[i25] = epVar3.b;
                                iArr[i25 + size7] = epVar3.c;
                            }
                            if (i24 > 1) {
                                Arrays.sort(iArr);
                            }
                            if (i24 != 0) {
                                int i26 = iArr[0];
                                int i27 = 0;
                                while (i27 < i24) {
                                    int i28 = iArr[i27];
                                    if (i28 == i26) {
                                        arrayList2 = arrayList;
                                        nn6Var5 = nn6Var4;
                                        i8 = i24;
                                    } else {
                                        int size9 = arrayList.size();
                                        nn6 nn6Var9 = nn6Var4;
                                        int i29 = 0;
                                        while (i29 < size9) {
                                            ArrayList arrayList5 = arrayList;
                                            ep epVar4 = (ep) arrayList.get(i29);
                                            nn6 nn6Var10 = nn6Var4;
                                            int i30 = epVar4.b;
                                            int i31 = i24;
                                            int i32 = epVar4.c;
                                            if (i30 != i32 && gp.b(i26, i28, i30, i32)) {
                                                nn6 nn6Var11 = (nn6) epVar4.a;
                                                nn6Var9 = nn6Var9 != null ? nn6Var9.c(nn6Var11) : nn6Var11;
                                            }
                                            i29++;
                                            arrayList = arrayList5;
                                            nn6Var4 = nn6Var10;
                                            i24 = i31;
                                        }
                                        arrayList2 = arrayList;
                                        nn6Var5 = nn6Var4;
                                        i8 = i24;
                                        if (nn6Var9 != null) {
                                            l4Var.e(nn6Var9, Integer.valueOf(i26), Integer.valueOf(i28));
                                        }
                                        i26 = i28;
                                    }
                                    i27++;
                                    arrayList = arrayList2;
                                    nn6Var4 = nn6Var5;
                                    i24 = i8;
                                }
                            } else {
                                fa6.e("Array is empty.");
                                throw null;
                            }
                        }
                        size3 = list4.size();
                        i9 = 0;
                        z11 = false;
                        while (i9 < size3) {
                            ep epVar5 = (ep) list4.get(i9);
                            Object obj6 = epVar5.a;
                            if (obj6 instanceof nn6) {
                                int i33 = epVar5.b;
                                int i34 = epVar5.c;
                                if (i33 >= 0 && i33 < spannableString.length() && i34 > i33 && i34 <= spannableString.length()) {
                                    nn6 nn6Var12 = (nn6) obj6;
                                    long j10 = nn6Var12.h;
                                    x20 x20Var3 = nn6Var12.i;
                                    e37 e37Var2 = nn6Var12.a;
                                    if (x20Var3 != null) {
                                        i15 = size3;
                                        spannableString.setSpan(new y20(0, x20Var3.a), i33, i34, 33);
                                    } else {
                                        i15 = size3;
                                    }
                                    i16 = i9;
                                    hi2.M(spannableString, e37Var2.b(), i33, i34);
                                    f80 c = e37Var2.c();
                                    float a2 = e37Var2.a();
                                    if (c != null) {
                                        if (c instanceof cn6) {
                                            hi2.M(spannableString, ((cn6) c).a, i33, i34);
                                        } else {
                                            spannableString.setSpan(new yd6((xd6) c, a2), i33, i34, 33);
                                        }
                                    }
                                    b17 b17Var = nn6Var12.m;
                                    if (b17Var != null) {
                                        int i35 = b17Var.a;
                                        if ((i35 | 1) == i35) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if ((i35 | 2) == i35) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        c17 c17Var = new c17(z13, z14);
                                        i17 = 33;
                                        spannableString.setSpan(c17Var, i33, i34, 33);
                                    } else {
                                        i17 = 33;
                                    }
                                    int i36 = i17;
                                    ds4Var3 = ds4Var2;
                                    hi2.N(spannableString, nn6Var12.b, qh1Var2, i33, i34);
                                    spannable = spannableString;
                                    String str4 = nn6Var12.g;
                                    if (str4 != null) {
                                        spannable.setSpan(new js0(str4, 1), i33, i34, i36);
                                    }
                                    f37 f37Var2 = nn6Var12.j;
                                    if (f37Var2 != null) {
                                        spannable.setSpan(new ScaleXSpan(f37Var2.a), i33, i34, i36);
                                        spannable.setSpan(new y20(1, f37Var2.b), i33, i34, i36);
                                    }
                                    hi2.O(spannable, nn6Var12.k, i33, i34);
                                    long j11 = nn6Var12.l;
                                    if (j11 != 16) {
                                        spannable.setSpan(new BackgroundColorSpan(hv.b0(j11)), i33, i34, i36);
                                    }
                                    ge6 ge6Var = nn6Var12.n;
                                    if (ge6Var != null) {
                                        qh1Var3 = qh1Var2;
                                        long j12 = ge6Var.b;
                                        list3 = list4;
                                        int b0 = hv.b0(ge6Var.a);
                                        z12 = z11;
                                        float intBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
                                        float intBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L));
                                        float f3 = ge6Var.c;
                                        je6 je6Var = new je6(intBitsToFloat, intBitsToFloat2, f3 == RecyclerView.B1 ? Float.MIN_VALUE : f3, b0);
                                        i36 = 33;
                                        spannable.setSpan(je6Var, i33, i34, 33);
                                    } else {
                                        list3 = list4;
                                        z12 = z11;
                                        qh1Var3 = qh1Var2;
                                    }
                                    oo1 oo1Var = nn6Var12.p;
                                    if (oo1Var != null) {
                                        spannable.setSpan(new po1(oo1Var), i33, i34, i36);
                                    }
                                    if (y47.a(x47.b(j10), 4294967296L) || y47.a(x47.b(j10), 8589934592L)) {
                                        z11 = true;
                                        i9 = i16 + 1;
                                        list4 = list3;
                                        ds4Var2 = ds4Var3;
                                        spannableString = spannable;
                                        qh1Var2 = qh1Var3;
                                        size3 = i15;
                                    }
                                    z11 = z12;
                                    i9 = i16 + 1;
                                    list4 = list3;
                                    ds4Var2 = ds4Var3;
                                    spannableString = spannable;
                                    qh1Var2 = qh1Var3;
                                    size3 = i15;
                                }
                            }
                            i15 = size3;
                            i16 = i9;
                            list3 = list4;
                            z12 = z11;
                            spannable = spannableString;
                            qh1Var3 = qh1Var2;
                            ds4Var3 = ds4Var2;
                            z11 = z12;
                            i9 = i16 + 1;
                            list4 = list3;
                            ds4Var2 = ds4Var3;
                            spannableString = spannable;
                            qh1Var2 = qh1Var3;
                            size3 = i15;
                        }
                        List list6 = list4;
                        Spannable spannable3 = spannableString;
                        qh1 qh1Var4 = qh1Var2;
                        ds4 ds4Var5 = ds4Var2;
                        if (z11) {
                            int size10 = list6.size();
                            int i37 = 0;
                            while (i37 < size10) {
                                List list7 = list6;
                                ep epVar6 = (ep) list7.get(i37);
                                bp bpVar = (bp) epVar6.a;
                                if (bpVar instanceof nn6) {
                                    int i38 = epVar6.b;
                                    int i39 = epVar6.c;
                                    if (i38 >= 0 && i38 < spannable3.length() && i39 > i38 && i39 <= spannable3.length()) {
                                        long j13 = ((nn6) bpVar).h;
                                        long b5 = x47.b(j13);
                                        i14 = i37;
                                        qh1 qh1Var5 = qh1Var4;
                                        if (y47.a(b5, 4294967296L)) {
                                            qh1Var4 = qh1Var5;
                                            obj2 = new nt3(qh1Var4.y0(j13));
                                        } else {
                                            qh1Var4 = qh1Var5;
                                            if (y47.a(b5, 8589934592L)) {
                                                obj2 = new mt3(x47.c(j13));
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        if (obj2 != null) {
                                            spannable3.setSpan(obj2, i38, i39, 33);
                                        }
                                        i37 = i14 + 1;
                                        list6 = list7;
                                    }
                                }
                                i14 = i37;
                                i37 = i14 + 1;
                                list6 = list7;
                            }
                        }
                        List list8 = list6;
                        g37Var2 = ds4Var5.d;
                        if (g37Var2 != null) {
                            long j14 = g37Var2.a;
                            long b6 = x47.b(j14);
                            if (y47.a(b6, 4294967296L)) {
                                qh1Var4.y0(j14);
                            } else if (y47.a(b6, 8589934592L)) {
                                x47.c(j14);
                            }
                        }
                        size4 = list8.size();
                        for (i10 = 0; i10 < size4; i10++) {
                            Object obj7 = ((ep) list8.get(i10)).a;
                        }
                        size5 = list5.size();
                        i11 = 0;
                        while (i11 < size5) {
                            ep epVar7 = (ep) list5.get(i11);
                            hx4 hx4Var = (hx4) epVar7.a;
                            int i40 = epVar7.b;
                            int i41 = epVar7.c;
                            for (Object obj8 : spannable3.getSpans(i40, i41, se7.class)) {
                                spannable3.removeSpan((se7) obj8);
                            }
                            long j15 = hx4Var.a;
                            long j16 = hx4Var.b;
                            float c2 = x47.c(j15);
                            long b7 = x47.b(hx4Var.a);
                            int i42 = size5;
                            int i43 = i11;
                            if (y47.a(b7, 4294967296L)) {
                                i12 = 0;
                            } else if (y47.a(b7, 8589934592L)) {
                                i12 = 1;
                            } else {
                                i12 = 2;
                            }
                            float c3 = x47.c(j16);
                            long b8 = x47.b(j16);
                            if (y47.a(b8, 4294967296L)) {
                                i13 = 0;
                            } else if (y47.a(b8, 8589934592L)) {
                                i13 = 1;
                            } else {
                                i13 = 2;
                            }
                            qh1 qh1Var6 = qh1Var4;
                            qh1Var4 = qh1Var6;
                            spannable3.setSpan(new ix4(c2, i12, c3, i13, qh1Var6, 3), i40, i41, 33);
                            size5 = i42;
                            i11 = i43 + 1;
                        }
                        spannable2 = spannable3;
                        this.h = spannable2;
                        this.i = new dm3(spannable2, this.g, this.l);
                    }
                }
                i6 = 0;
                g37Var = ds4Var.d;
                if (g37Var == null) {
                }
                arrayList = new ArrayList(list4.size());
                size2 = list4.size();
                while (i7 < size2) {
                }
                nn6Var3 = s47Var2.a;
                li2Var2 = nn6Var3.f;
                if (li2Var2 != null) {
                }
                nn6Var4 = new nn6(0L, 0L, nn6Var3.c, nn6Var3.d, nn6Var3.e, li2Var2, (String) null, 0L, (x20) null, (f37) null, (gy3) null, 0L, (b17) null, (ge6) null, 65475);
                l4 l4Var2 = new l4(15, spannableString, fjVar);
                if (arrayList.size() > 1) {
                }
                size3 = list4.size();
                i9 = 0;
                z11 = false;
                while (i9 < size3) {
                }
                List list62 = list4;
                Spannable spannable32 = spannableString;
                qh1 qh1Var42 = qh1Var2;
                ds4 ds4Var52 = ds4Var2;
                if (z11) {
                }
                List list82 = list62;
                g37Var2 = ds4Var52.d;
                if (g37Var2 != null) {
                }
                size4 = list82.size();
                while (i10 < size4) {
                }
                size5 = list5.size();
                i11 = 0;
                while (i11 < size5) {
                }
                spannable2 = spannable32;
                this.h = spannable2;
                this.i = new dm3(spannable2, this.g, this.l);
            }
            i = 3;
            this.l = i;
            fj fjVar2 = new fj(this, 0);
            i47Var = ds4Var4.i;
            if (i47Var == null) {
            }
            if (i47Var.b) {
            }
            textPaint.setFlags(flags);
            i2 = i47Var.a;
            if (i2 == 1) {
            }
            size = list.size();
            i3 = 0;
            while (true) {
                if (i3 < size) {
                }
                i3++;
            }
            if (obj != null) {
            }
            long j62 = nn6Var6.b;
            oj2Var = nn6Var6.c;
            ij2Var = nn6Var6.d;
            str2 = nn6Var6.g;
            gy3Var = nn6Var6.k;
            e37 e37Var3 = nn6Var6.a;
            f37Var = nn6Var6.j;
            j = nn6Var6.h;
            b = x47.b(j62);
            z2 = z;
            if (y47.a(b, 4294967296L)) {
            }
            li2Var = nn6Var6.f;
            if (li2Var != null) {
            }
            if (oj2Var == null) {
            }
            if (ij2Var != null) {
            }
            jj2Var = nn6Var6.e;
            if (jj2Var != null) {
            }
            gj gjVar2 = (gj) fjVar2.B;
            z3 = z2;
            b2 = ((mi2) gjVar2.e).b(li2Var, oj2Var2, i4, i5);
            if (!(b2 instanceof ve7)) {
            }
            textPaint.setTypeface(typeface);
            if (gy3Var != null) {
            }
            if (str2 != null) {
                textPaint.setFontFeatureSettings(str2);
            }
            if (f37Var != null) {
                textPaint.setTextScaleX(textPaint.getTextScaleX() * f37Var.a);
                textPaint.setTextSkewX(textPaint.getTextSkewX() + f37Var.b);
            }
            textPaint.d(e37Var3.b());
            textPaint.c(e37Var3.c(), 9205357640488583168L, e37Var3.a());
            textPaint.f(nn6Var6.n);
            textPaint.g(nn6Var6.m);
            textPaint.e(nn6Var6.p);
            if (!y47.a(x47.b(j), 4294967296L)) {
            }
            if (y47.a(x47.b(j), 8589934592L)) {
            }
            j2 = nn6Var6.l;
            x20Var = nn6Var6.i;
            if (!z3) {
            }
            z4 = false;
            j3 = kt0.h;
            if (kt0.d(j2, j3)) {
            }
            z5 = false;
            if (x20Var == null) {
            }
            z6 = false;
            if (z4) {
            }
            long j72 = z4 ? j : x47.c;
            if (z5) {
            }
            if (z6) {
            }
            nn6Var = new nn6(0L, 0L, (oj2) null, (ij2) null, (jj2) null, (li2) null, (String) null, j72, x20Var2, (f37) null, (gy3) null, j4, (b17) null, (ge6) null, 63103);
            List list42 = this.c;
            if (nn6Var != null) {
            }
            str3 = this.a;
            textSize = this.g.getTextSize();
            s47 s47Var22 = this.b;
            List list52 = this.d;
            qh1Var2 = this.f;
            z7 = this.k;
            dj djVar2 = ej.a;
            if (!z7) {
            }
            charSequence = str3;
            if (list42.isEmpty()) {
            }
            if (charSequence instanceof Spannable) {
            }
            nn6Var2 = s47Var22.a;
            ds4Var = s47Var22.b;
            if (nb3.k(nn6Var2.m, b17.c)) {
            }
            hy4Var = s47Var22.c;
            if (hy4Var == null) {
            }
            z8 = false;
            if (!z8) {
            }
            xu3 xu3Var2 = ds4Var.f;
            if (xu3Var2 == null) {
            }
            K = hi2.K(ds4Var.c, textSize, qh1Var2);
            if (!Float.isNaN(K)) {
            }
            i6 = 0;
            g37Var = ds4Var.d;
            if (g37Var == null) {
            }
            arrayList = new ArrayList(list42.size());
            size2 = list42.size();
            while (i7 < size2) {
            }
            nn6Var3 = s47Var22.a;
            li2Var2 = nn6Var3.f;
            if (li2Var2 != null) {
            }
            nn6Var4 = new nn6(0L, 0L, nn6Var3.c, nn6Var3.d, nn6Var3.e, li2Var2, (String) null, 0L, (x20) null, (f37) null, (gy3) null, 0L, (b17) null, (ge6) null, 65475);
            l4 l4Var22 = new l4(15, spannableString, fjVar2);
            if (arrayList.size() > 1) {
            }
            size3 = list42.size();
            i9 = 0;
            z11 = false;
            while (i9 < size3) {
            }
            List list622 = list42;
            Spannable spannable322 = spannableString;
            qh1 qh1Var422 = qh1Var2;
            ds4 ds4Var522 = ds4Var2;
            if (z11) {
            }
            List list822 = list622;
            g37Var2 = ds4Var522.d;
            if (g37Var2 != null) {
            }
            size4 = list822.size();
            while (i10 < size4) {
            }
            size5 = list52.size();
            i11 = 0;
            while (i11 < size5) {
            }
            spannable2 = spannable322;
            this.h = spannable2;
            this.i = new dm3(spannable2, this.g, this.l);
        }
        i = 2;
        this.l = i;
        fj fjVar22 = new fj(this, 0);
        i47Var = ds4Var4.i;
        if (i47Var == null) {
        }
        if (i47Var.b) {
        }
        textPaint.setFlags(flags);
        i2 = i47Var.a;
        if (i2 == 1) {
        }
        size = list.size();
        i3 = 0;
        while (true) {
            if (i3 < size) {
            }
            i3++;
        }
        if (obj != null) {
        }
        long j622 = nn6Var6.b;
        oj2Var = nn6Var6.c;
        ij2Var = nn6Var6.d;
        str2 = nn6Var6.g;
        gy3Var = nn6Var6.k;
        e37 e37Var32 = nn6Var6.a;
        f37Var = nn6Var6.j;
        j = nn6Var6.h;
        b = x47.b(j622);
        z2 = z;
        if (y47.a(b, 4294967296L)) {
        }
        li2Var = nn6Var6.f;
        if (li2Var != null) {
        }
        if (oj2Var == null) {
        }
        if (ij2Var != null) {
        }
        jj2Var = nn6Var6.e;
        if (jj2Var != null) {
        }
        gj gjVar22 = (gj) fjVar22.B;
        z3 = z2;
        b2 = ((mi2) gjVar22.e).b(li2Var, oj2Var2, i4, i5);
        if (!(b2 instanceof ve7)) {
        }
        textPaint.setTypeface(typeface);
        if (gy3Var != null) {
        }
        if (str2 != null) {
        }
        if (f37Var != null) {
        }
        textPaint.d(e37Var32.b());
        textPaint.c(e37Var32.c(), 9205357640488583168L, e37Var32.a());
        textPaint.f(nn6Var6.n);
        textPaint.g(nn6Var6.m);
        textPaint.e(nn6Var6.p);
        if (!y47.a(x47.b(j), 4294967296L)) {
        }
        if (y47.a(x47.b(j), 8589934592L)) {
        }
        j2 = nn6Var6.l;
        x20Var = nn6Var6.i;
        if (!z3) {
        }
        z4 = false;
        j3 = kt0.h;
        if (kt0.d(j2, j3)) {
        }
        z5 = false;
        if (x20Var == null) {
        }
        z6 = false;
        if (z4) {
        }
        long j722 = z4 ? j : x47.c;
        if (z5) {
        }
        if (z6) {
        }
        nn6Var = new nn6(0L, 0L, (oj2) null, (ij2) null, (jj2) null, (li2) null, (String) null, j722, x20Var2, (f37) null, (gy3) null, j4, (b17) null, (ge6) null, 63103);
        List list422 = this.c;
        if (nn6Var != null) {
        }
        str3 = this.a;
        textSize = this.g.getTextSize();
        s47 s47Var222 = this.b;
        List list522 = this.d;
        qh1Var2 = this.f;
        z7 = this.k;
        dj djVar22 = ej.a;
        if (!z7) {
        }
        charSequence = str3;
        if (list422.isEmpty()) {
        }
        if (charSequence instanceof Spannable) {
        }
        nn6Var2 = s47Var222.a;
        ds4Var = s47Var222.b;
        if (nb3.k(nn6Var2.m, b17.c)) {
        }
        hy4Var = s47Var222.c;
        if (hy4Var == null) {
        }
        z8 = false;
        if (!z8) {
        }
        xu3 xu3Var22 = ds4Var.f;
        if (xu3Var22 == null) {
        }
        K = hi2.K(ds4Var.c, textSize, qh1Var2);
        if (!Float.isNaN(K)) {
        }
        i6 = 0;
        g37Var = ds4Var.d;
        if (g37Var == null) {
        }
        arrayList = new ArrayList(list422.size());
        size2 = list422.size();
        while (i7 < size2) {
        }
        nn6Var3 = s47Var222.a;
        li2Var2 = nn6Var3.f;
        if (li2Var2 != null) {
        }
        nn6Var4 = new nn6(0L, 0L, nn6Var3.c, nn6Var3.d, nn6Var3.e, li2Var2, (String) null, 0L, (x20) null, (f37) null, (gy3) null, 0L, (b17) null, (ge6) null, 65475);
        l4 l4Var222 = new l4(15, spannableString, fjVar22);
        if (arrayList.size() > 1) {
        }
        size3 = list422.size();
        i9 = 0;
        z11 = false;
        while (i9 < size3) {
        }
        List list6222 = list422;
        Spannable spannable3222 = spannableString;
        qh1 qh1Var4222 = qh1Var2;
        ds4 ds4Var5222 = ds4Var2;
        if (z11) {
        }
        List list8222 = list6222;
        g37Var2 = ds4Var5222.d;
        if (g37Var2 != null) {
        }
        size4 = list8222.size();
        while (i10 < size4) {
        }
        size5 = list522.size();
        i11 = 0;
        while (i11 < size5) {
        }
        spannable2 = spannable3222;
        this.h = spannable2;
        this.i = new dm3(spannable2, this.g, this.l);
    }

    @Override // defpackage.as4
    public final boolean a() {
        boolean z;
        m44 m44Var = this.j;
        if (m44Var != null) {
            z = m44Var.z();
        } else {
            z = false;
        }
        if (!z) {
            if (!this.k && jw2.h(this.b)) {
                d51 d51Var = zs1.a;
                d51 d51Var2 = zs1.a;
                pp6 pp6Var = (pp6) d51Var2.B;
                if (pp6Var == null) {
                    if (ws1.d()) {
                        pp6Var = d51Var2.g();
                        d51Var2.B = pp6Var;
                    } else {
                        pp6Var = nb3.l;
                    }
                }
                if (((Boolean) pp6Var.getValue()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.as4
    public final float b() {
        dm3 dm3Var = this.i;
        float f = dm3Var.e;
        TextPaint textPaint = dm3Var.b;
        if (!Float.isNaN(f)) {
            return dm3Var.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = dm3Var.a;
        lineInstance.setText(new nm0(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, n16.m);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new j93(i, next, 1));
            } else {
                l93 l93Var = (l93) priorityQueue.peek();
                if (l93Var != null && l93Var.B - l93Var.A < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new j93(i, next, 1));
                }
            }
            i = next;
        }
        boolean isEmpty = priorityQueue.isEmpty();
        float f2 = RecyclerView.B1;
        if (!isEmpty) {
            Iterator it = priorityQueue.iterator();
            if (it.hasNext()) {
                l93 l93Var2 = (l93) it.next();
                f2 = Layout.getDesiredWidth(dm3Var.b(), l93Var2.A, l93Var2.B, textPaint);
                while (it.hasNext()) {
                    l93 l93Var3 = (l93) it.next();
                    f2 = Math.max(f2, Layout.getDesiredWidth(dm3Var.b(), l93Var3.A, l93Var3.B, textPaint));
                }
            } else {
                fa6.c();
                return RecyclerView.B1;
            }
        }
        dm3Var.e = f2;
        return f2;
    }

    @Override // defpackage.as4
    public final float c() {
        return this.i.c();
    }
}
