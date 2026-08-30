package pb;

import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ob.i;
import vj.m;
import vj.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements ob.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f11532a;

    public b(c cVar) {
        this.f11532a = cVar;
    }

    /* JADX WARN: Type inference failed for: r10v12, types: [y5.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [y5.a, java.lang.Object] */
    @Override // ob.e
    public final void a(b9.e eVar, v8.e eVar2) {
        String str;
        ArrayList arrayList;
        int i2;
        int i10;
        URLSpan[] uRLSpanArr;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str2;
        boolean z11;
        String[] strArr;
        String str3 = ((u) eVar2).f13863g;
        i iVar = (i) eVar.R;
        ob.b bVar = (ob.b) eVar.B;
        iVar.A.append(str3);
        ArrayList arrayList2 = this.f11532a.f11533a;
        if (!arrayList2.isEmpty()) {
            int C = eVar.C() - str3.length();
            int size = arrayList2.size();
            int i17 = 0;
            while (i17 < size) {
                Object obj = arrayList2.get(i17);
                i17++;
                vb.a aVar = (vb.a) obj;
                aVar.getClass();
                qb.a aVar2 = (qb.a) ((Map) bVar.f10869g.B).get(m.class);
                if (aVar2 == null) {
                    str = str3;
                    arrayList = arrayList2;
                    i2 = C;
                    i10 = size;
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                    aVar.getClass();
                    if (Build.VERSION.SDK_INT >= 28) {
                        z10 = Linkify.addLinks(spannableStringBuilder, 1);
                        str = str3;
                        arrayList = arrayList2;
                        i2 = C;
                        i10 = size;
                    } else {
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                        for (int length = uRLSpanArr2.length - 1; length >= 0; length--) {
                            spannableStringBuilder.removeSpan(uRLSpanArr2[length]);
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Pattern pattern = z5.c.f14963a;
                        str = str3;
                        String[] strArr2 = {"http://", "https://", "rtsp://"};
                        Linkify.MatchFilter matchFilter = Linkify.sUrlMatchFilter;
                        Matcher matcher = pattern.matcher(spannableStringBuilder);
                        while (matcher.find()) {
                            int start = matcher.start();
                            int end = matcher.end();
                            ArrayList arrayList4 = arrayList2;
                            String group = matcher.group(0);
                            if ((matchFilter != null && !matchFilter.acceptMatch(spannableStringBuilder, start, end)) || group == null) {
                                strArr = strArr2;
                                i15 = C;
                                i16 = size;
                            } else {
                                ?? obj2 = new Object();
                                i15 = C;
                                int length2 = strArr2.length;
                                i16 = size;
                                int i18 = 0;
                                while (true) {
                                    if (i18 < length2) {
                                        String str4 = strArr2[i18];
                                        if (group.regionMatches(true, 0, str4, 0, str4.length())) {
                                            boolean regionMatches = group.regionMatches(false, 0, str4, 0, str4.length());
                                            z11 = true;
                                            if (!regionMatches) {
                                                str2 = str4.concat(group.substring(str4.length()));
                                            } else {
                                                str2 = group;
                                            }
                                        } else {
                                            i18++;
                                        }
                                    } else {
                                        str2 = group;
                                        z11 = false;
                                        break;
                                    }
                                }
                                if (!z11 && strArr2.length > 0) {
                                    strArr = strArr2;
                                    str2 = w.d.s(new StringBuilder(), strArr[0], str2);
                                } else {
                                    strArr = strArr2;
                                }
                                obj2.f14777b = str2;
                                obj2.f14778c = start;
                                obj2.f14779d = end;
                                arrayList3.add(obj2);
                            }
                            arrayList2 = arrayList4;
                            strArr2 = strArr;
                            C = i15;
                            size = i16;
                        }
                        arrayList = arrayList2;
                        i2 = C;
                        i10 = size;
                        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                            ?? obj3 = new Object();
                            obj3.f14776a = uRLSpan;
                            obj3.f14778c = spannableStringBuilder.getSpanStart(uRLSpan);
                            obj3.f14779d = spannableStringBuilder.getSpanEnd(uRLSpan);
                            arrayList3.add(obj3);
                        }
                        Collections.sort(arrayList3, y5.b.f14780a);
                        int size2 = arrayList3.size();
                        int i19 = 0;
                        while (i19 < size2 - 1) {
                            y5.a aVar3 = (y5.a) arrayList3.get(i19);
                            int i20 = i19 + 1;
                            y5.a aVar4 = (y5.a) arrayList3.get(i20);
                            int i21 = aVar3.f14778c;
                            int i22 = aVar4.f14778c;
                            if (i21 <= i22 && (i11 = aVar3.f14779d) > i22) {
                                int i23 = aVar4.f14779d;
                                if (i23 <= i11 || (i12 = i11 - i21) > (i13 = i23 - i22)) {
                                    i14 = i20;
                                } else if (i12 < i13) {
                                    i14 = i19;
                                } else {
                                    i14 = -1;
                                }
                                if (i14 != -1) {
                                    URLSpan uRLSpan2 = ((y5.a) arrayList3.get(i14)).f14776a;
                                    if (uRLSpan2 != null) {
                                        spannableStringBuilder.removeSpan(uRLSpan2);
                                    }
                                    arrayList3.remove(i14);
                                    size2--;
                                }
                            }
                            i19 = i20;
                        }
                        if (arrayList3.size() == 0) {
                            z10 = false;
                        } else {
                            int size3 = arrayList3.size();
                            int i24 = 0;
                            while (i24 < size3) {
                                Object obj4 = arrayList3.get(i24);
                                i24++;
                                y5.a aVar5 = (y5.a) obj4;
                                if (aVar5.f14776a == null) {
                                    spannableStringBuilder.setSpan(new URLSpan(aVar5.f14777b), aVar5.f14778c, aVar5.f14779d, 33);
                                }
                            }
                            z10 = true;
                        }
                    }
                    if (z10) {
                        URLSpan[] uRLSpanArr3 = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                        if (uRLSpanArr3 != null && uRLSpanArr3.length > 0) {
                            ob.d dVar = (ob.d) eVar.L;
                            for (URLSpan uRLSpan3 : uRLSpanArr3) {
                                e.f11538e.b(dVar, uRLSpan3.getURL());
                                Object a10 = aVar2.a(bVar, dVar);
                                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan3) + i2;
                                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan3) + i2;
                                int length3 = iVar.A.length();
                                if (spanEnd > spanStart && spanStart >= 0 && spanEnd <= length3) {
                                    i.c(iVar, a10, spanStart, spanEnd);
                                }
                            }
                        }
                        str3 = str;
                        arrayList2 = arrayList;
                        C = i2;
                        size = i10;
                    }
                }
                str3 = str;
                arrayList2 = arrayList;
                C = i2;
                size = i10;
            }
        }
    }
}
