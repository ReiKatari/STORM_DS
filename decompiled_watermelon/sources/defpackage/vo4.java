package defpackage;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vo4  reason: default package */
/* loaded from: classes.dex */
public final class vo4 {
    public final e31 a;
    public final Context b;
    public final py5 c;
    public final fr3 d;
    public TextClassifier f;
    public final b34 e = new b34();
    public final tj4 g = me2.G(null);
    public final Object h = new Object();

    public vo4(e31 e31Var, Context context, py5 py5Var, fr3 fr3Var) {
        this.a = e31Var;
        this.b = context;
        this.c = py5Var;
        this.d = fr3Var;
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
    public static final java.lang.Object a(defpackage.vo4 r16, java.lang.CharSequence r17, long r18, android.view.textclassifier.TextClassifier r20, defpackage.k11 r21) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vo4.a(vo4, java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, k11):java.lang.Object");
    }

    public final LocaleList b() {
        fr3 fr3Var = this.d;
        if (fr3Var != null) {
            ArrayList arrayList = new ArrayList(uq0.y0(fr3Var, 10));
            for (er3 er3Var : fr3Var.A) {
                arrayList.add(er3Var.a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        return new LocaleList(((er3) jo4.a.t().A.get(0)).a);
    }
}
