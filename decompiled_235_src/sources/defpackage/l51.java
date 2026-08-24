package defpackage;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l51  reason: default package */
/* loaded from: classes.dex */
public final class l51 implements g14 {
    public final /* synthetic */ m51 a;

    public l51(m51 m51Var) {
        this.a = m51Var;
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, bw3] */
    @Override // defpackage.g14
    public final void a(eb ebVar, a21 a21Var) {
        String str;
        ArrayList arrayList;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        URLSpan[] uRLSpanArr;
        String str2 = ((vz6) a21Var).g;
        sn6 sn6Var = (sn6) ebVar.R;
        d14 d14Var = (d14) ebVar.B;
        sn6Var.A.append(str2);
        ArrayList arrayList2 = this.a.a;
        if (!arrayList2.isEmpty()) {
            int H = ebVar.H() - str2.length();
            int size = arrayList2.size();
            int i5 = 0;
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList2.get(i6);
                i6++;
                ((cw3) obj).getClass();
                i50 i50Var = (i50) d14Var.g.A.get(mv3.class);
                if (i50Var == null) {
                    str = str2;
                    arrayList = arrayList2;
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                    if (Build.VERSION.SDK_INT >= 28) {
                        z = Linkify.addLinks(spannableStringBuilder, 1);
                        str = str2;
                        arrayList = arrayList2;
                    } else {
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) spannableStringBuilder.getSpans(i5, spannableStringBuilder.length(), URLSpan.class);
                        for (int length = uRLSpanArr2.length - 1; length >= 0; length--) {
                            spannableStringBuilder.removeSpan(uRLSpanArr2[length]);
                        }
                        ArrayList arrayList3 = new ArrayList();
                        hf.Q(arrayList3, spannableStringBuilder, ku4.a, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter);
                        URLSpan[] uRLSpanArr3 = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                        int length2 = uRLSpanArr3.length;
                        int i7 = 0;
                        while (i7 < length2) {
                            URLSpan uRLSpan = uRLSpanArr3[i7];
                            String str3 = str2;
                            ?? obj2 = new Object();
                            obj2.a = uRLSpan;
                            obj2.c = spannableStringBuilder.getSpanStart(uRLSpan);
                            obj2.d = spannableStringBuilder.getSpanEnd(uRLSpan);
                            arrayList3.add(obj2);
                            i7++;
                            str2 = str3;
                            arrayList2 = arrayList2;
                        }
                        str = str2;
                        arrayList = arrayList2;
                        Collections.sort(arrayList3, hf.n);
                        int size2 = arrayList3.size();
                        int i8 = 0;
                        while (i8 < size2 - 1) {
                            bw3 bw3Var = (bw3) arrayList3.get(i8);
                            int i9 = i8 + 1;
                            bw3 bw3Var2 = (bw3) arrayList3.get(i9);
                            int i10 = bw3Var.c;
                            int i11 = size2;
                            int i12 = bw3Var2.c;
                            if (i10 <= i12 && (i = bw3Var.d) > i12) {
                                int i13 = bw3Var2.d;
                                if (i13 <= i || (i2 = i - i10) > (i3 = i13 - i12)) {
                                    i4 = i9;
                                } else if (i2 < i3) {
                                    i4 = i8;
                                } else {
                                    i4 = -1;
                                }
                                if (i4 != -1) {
                                    URLSpan uRLSpan2 = ((bw3) arrayList3.get(i4)).a;
                                    if (uRLSpan2 != null) {
                                        spannableStringBuilder.removeSpan(uRLSpan2);
                                    }
                                    arrayList3.remove(i4);
                                    size2 = i11 - 1;
                                }
                            }
                            i8 = i9;
                            size2 = i11;
                        }
                        if (arrayList3.size() == 0) {
                            z = false;
                        } else {
                            int size3 = arrayList3.size();
                            int i14 = 0;
                            while (i14 < size3) {
                                Object obj3 = arrayList3.get(i14);
                                i14++;
                                bw3 bw3Var3 = (bw3) obj3;
                                if (bw3Var3.a == null) {
                                    spannableStringBuilder.setSpan(new URLSpan(bw3Var3.b), bw3Var3.c, bw3Var3.d, 33);
                                }
                            }
                            z = true;
                        }
                    }
                    if (z && (uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) != null && uRLSpanArr.length > 0) {
                        ng3 ng3Var = (ng3) ebVar.L;
                        for (URLSpan uRLSpan3 : uRLSpanArr) {
                            u24.h.b(ng3Var, uRLSpan3.getURL());
                            Object a = i50Var.a(d14Var, ng3Var);
                            int spanStart = spannableStringBuilder.getSpanStart(uRLSpan3) + H;
                            int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan3) + H;
                            int length3 = sn6Var.A.length();
                            if (spanEnd > spanStart && spanStart >= 0 && spanEnd <= length3) {
                                sn6.c(sn6Var, a, spanStart, spanEnd);
                            }
                        }
                    }
                }
                str2 = str;
                arrayList2 = arrayList;
                i5 = 0;
            }
        }
    }
}
