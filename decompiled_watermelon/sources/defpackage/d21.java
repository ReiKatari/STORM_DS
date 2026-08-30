package defpackage;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import java.util.ArrayList;
import java.util.Collections;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d21  reason: default package */
/* loaded from: classes.dex */
public final class d21 implements du3 {
    public final /* synthetic */ e21 a;

    public d21(e21 e21Var) {
        this.a = e21Var;
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, zo3] */
    @Override // defpackage.du3
    public final void a(q9 q9Var, vy0 vy0Var) {
        String str;
        ArrayList arrayList;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        URLSpan[] uRLSpanArr;
        String str2 = ((jn6) vy0Var).g;
        cc6 cc6Var = (cc6) q9Var.R;
        au3 au3Var = (au3) q9Var.B;
        cc6Var.A.append(str2);
        ArrayList arrayList2 = this.a.a;
        if (!arrayList2.isEmpty()) {
            int G = q9Var.G() - str2.length();
            int size = arrayList2.size();
            int i5 = 0;
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList2.get(i6);
                i6++;
                ((ap3) obj).getClass();
                k30 k30Var = (k30) au3Var.g.a.get(ko3.class);
                if (k30Var == null) {
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
                        tq5.n(arrayList3, spannableStringBuilder, il4.a, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter);
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
                        Collections.sort(arrayList3, tq5.m);
                        int size2 = arrayList3.size();
                        int i8 = 0;
                        while (i8 < size2 - 1) {
                            zo3 zo3Var = (zo3) arrayList3.get(i8);
                            int i9 = i8 + 1;
                            zo3 zo3Var2 = (zo3) arrayList3.get(i9);
                            int i10 = zo3Var.c;
                            int i11 = size2;
                            int i12 = zo3Var2.c;
                            if (i10 <= i12 && (i = zo3Var.d) > i12) {
                                int i13 = zo3Var2.d;
                                if (i13 <= i || (i2 = i - i10) > (i3 = i13 - i12)) {
                                    i4 = i9;
                                } else if (i2 < i3) {
                                    i4 = i8;
                                } else {
                                    i4 = -1;
                                }
                                if (i4 != -1) {
                                    URLSpan uRLSpan2 = ((zo3) arrayList3.get(i4)).a;
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
                                zo3 zo3Var3 = (zo3) obj3;
                                if (zo3Var3.a == null) {
                                    spannableStringBuilder.setSpan(new URLSpan(zo3Var3.b), zo3Var3.c, zo3Var3.d, 33);
                                }
                            }
                            z = true;
                        }
                    }
                    if (z && (uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) != null && uRLSpanArr.length > 0) {
                        u93 u93Var = (u93) q9Var.L;
                        for (URLSpan uRLSpan3 : uRLSpanArr) {
                            n40.h.b(u93Var, uRLSpan3.getURL());
                            Object a = k30Var.a(au3Var, u93Var);
                            int spanStart = spannableStringBuilder.getSpanStart(uRLSpan3) + G;
                            int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan3) + G;
                            int length3 = cc6Var.A.length();
                            if (spanEnd > spanStart && spanStart >= 0 && spanEnd <= length3) {
                                cc6.c(cc6Var, a, spanStart, spanEnd);
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
