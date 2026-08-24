package defpackage;

import android.content.Context;
import android.os.LocaleList;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zx4  reason: default package */
/* loaded from: classes.dex */
public final class zx4 {
    public final l61 a;
    public final Context b;
    public final ca6 c;
    public final gy3 d;
    public TextClassifier f;
    public final hb4 e = new hb4();
    public final vs4 g = np2.Y(null);
    public final Object h = new Object();

    public zx4(l61 l61Var, Context context, ca6 ca6Var, gy3 gy3Var) {
        this.a = l61Var;
        this.b = context;
        this.c = ca6Var;
        this.d = gy3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:20:0x0075, B:22:0x007d, B:24:0x0087), top: B:46:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(zx4 zx4Var, CharSequence charSequence, long j, TextClassifier textClassifier, s41 s41Var) {
        xx4 xx4Var;
        x61 x61Var;
        int i;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        hb4 hb4Var;
        h07 h07Var;
        TextClassification.Request.Builder defaultLocales;
        TextClassification.Request build;
        TextClassification classifyText;
        long j3;
        CharSequence charSequence3;
        boolean z;
        hb4 hb4Var2 = zx4Var.e;
        vs4 vs4Var = zx4Var.g;
        try {
            if (s41Var instanceof xx4) {
                xx4Var = (xx4) s41Var;
                int i2 = xx4Var.f0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    xx4Var.f0 = i2 - Integer.MIN_VALUE;
                    Object obj = xx4Var.d0;
                    x61Var = x61.COROUTINE_SUSPENDED;
                    i = xx4Var.f0;
                    jg7 jg7Var = jg7.a;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                j3 = xx4Var.Z;
                                hb4Var2 = xx4Var.Y;
                                classifyText = oc3.c(xx4Var.X);
                                charSequence3 = xx4Var.R;
                                oi2.Y(obj);
                                try {
                                    vs4Var.setValue(new h07(charSequence3, j3, classifyText));
                                    return jg7Var;
                                } finally {
                                }
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j2 = xx4Var.Z;
                        hb4Var = xx4Var.Y;
                        textClassifier2 = oc3.d(xx4Var.X);
                        charSequence2 = xx4Var.R;
                        oi2.Y(obj);
                    } else {
                        oi2.Y(obj);
                        xx4Var.R = charSequence;
                        xx4Var.X = textClassifier;
                        xx4Var.Y = hb4Var2;
                        j2 = j;
                        xx4Var.Z = j2;
                        xx4Var.f0 = 1;
                        if (hb4Var2.e(xx4Var) != x61Var) {
                            charSequence2 = charSequence;
                            textClassifier2 = textClassifier;
                            hb4Var = hb4Var2;
                        }
                        return x61Var;
                    }
                    h07Var = (h07) vs4Var.getValue();
                    if (h07Var != null) {
                        nq6 nq6Var = by4.a;
                        if (k47.b(j2, h07Var.b)) {
                            if (nb3.k(charSequence2, h07Var.a)) {
                                z = true;
                                if (z) {
                                    return jg7Var;
                                }
                            }
                        }
                        z = false;
                        if (z) {
                        }
                    }
                    hb4Var.h(null);
                    yr1.t();
                    defaultLocales = yr1.m(charSequence2, k47.f(j2), k47.e(j2)).setDefaultLocales(zx4Var.b());
                    build = defaultLocales.build();
                    classifyText = textClassifier2.classifyText(build);
                    xx4Var.R = charSequence2;
                    xx4Var.X = classifyText;
                    xx4Var.Y = hb4Var2;
                    xx4Var.Z = j2;
                    xx4Var.f0 = 2;
                    if (hb4Var2.e(xx4Var) != x61Var) {
                        j3 = j2;
                        charSequence3 = charSequence2;
                        vs4Var.setValue(new h07(charSequence3, j3, classifyText));
                        return jg7Var;
                    }
                    return x61Var;
                }
            }
            h07Var = (h07) vs4Var.getValue();
            if (h07Var != null) {
            }
            hb4Var.h(null);
            yr1.t();
            defaultLocales = yr1.m(charSequence2, k47.f(j2), k47.e(j2)).setDefaultLocales(zx4Var.b());
            build = defaultLocales.build();
            classifyText = textClassifier2.classifyText(build);
            xx4Var.R = charSequence2;
            xx4Var.X = classifyText;
            xx4Var.Y = hb4Var2;
            xx4Var.Z = j2;
            xx4Var.f0 = 2;
            if (hb4Var2.e(xx4Var) != x61Var) {
            }
            return x61Var;
        } finally {
        }
        xx4Var = new xx4(zx4Var, s41Var);
        Object obj2 = xx4Var.d0;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = xx4Var.f0;
        jg7 jg7Var2 = jg7.a;
        if (i == 0) {
        }
    }

    public final LocaleList b() {
        gy3 gy3Var = this.d;
        if (gy3Var != null) {
            ArrayList arrayList = new ArrayList(ht0.v0(gy3Var, 10));
            for (fy3 fy3Var : gy3Var.A) {
                arrayList.add(fy3Var.a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        return new LocaleList(((fy3) nx4.a.H().A.get(0)).a);
    }
}
