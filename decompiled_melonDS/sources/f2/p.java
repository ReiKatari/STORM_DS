package f2;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final cc.g f4768a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f4769b;

    /* renamed from: c  reason: collision with root package name */
    public final t f4770c;

    /* renamed from: d  reason: collision with root package name */
    public final s4.b f4771d;

    /* renamed from: f  reason: collision with root package name */
    public TextClassifier f4773f;

    /* renamed from: e  reason: collision with root package name */
    public final id.c f4772e = new id.c();

    /* renamed from: g  reason: collision with root package name */
    public final n2.f1 f4774g = n2.s.w(null);

    /* renamed from: h  reason: collision with root package name */
    public final Object f4775h = new Object();

    public p(cc.g gVar, Context context, t tVar, s4.b bVar) {
        this.f4768a = gVar;
        this.f4769b = context;
        this.f4770c = tVar;
        this.f4771d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:20:0x0075, B:22:0x007d, B:24:0x0087), top: B:46:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(f2.p r16, java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, ec.c r21) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.p.a(f2.p, java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, ec.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.lang.Object] */
    public final LocaleList b() {
        s4.b bVar = this.f4771d;
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(zb.m.G(bVar, 10));
            for (s4.a aVar : bVar.A) {
                arrayList.add(aVar.f12832a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        return new LocaleList(((s4.a) s4.c.f12833a.f().A.get(0)).f12832a);
    }
}
