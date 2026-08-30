package defpackage;

import android.content.Context;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dj5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dj5 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String[] L;
    public final /* synthetic */ Context R;

    public /* synthetic */ dj5(String str, String[] strArr, Context context, int i) {
        this.A = i;
        this.B = str;
        this.L = strArr;
        this.R = context;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        String str;
        String str2;
        String str3;
        int i = this.A;
        Context context = this.R;
        String[] strArr = this.L;
        String str4 = this.B;
        switch (i) {
            case 0:
                VideoFiltering videoFiltering = (VideoFiltering) obj;
                if (videoFiltering == null || (str = strArr[videoFiltering.ordinal()]) == null) {
                    return nl2.c(context, str4);
                }
                return str;
            case 1:
                cs5 cs5Var = (cs5) obj;
                cs5Var.getClass();
                if (cs5Var == cs5.DEFAULT) {
                    return nl2.c(context, str4);
                }
                return strArr[cs5Var.ordinal()];
            case 2:
                Integer num = (Integer) obj;
                if (num == null || (str2 = strArr[io2.n(num.intValue() - 1, nu.s0(strArr))]) == null) {
                    return nl2.c(context, str4);
                }
                return str2;
            case 3:
                is5 is5Var = (is5) obj;
                is5Var.getClass();
                if (is5Var == is5.DEFAULT) {
                    return nl2.c(context, str4);
                }
                return strArr[is5Var.ordinal()];
            case 4:
                VideoRenderer videoRenderer = (VideoRenderer) obj;
                if (videoRenderer == null || (str3 = strArr[videoRenderer.ordinal()]) == null) {
                    return nl2.c(context, str4);
                }
                return str3;
            default:
                ym5 ym5Var = (ym5) obj;
                ym5Var.getClass();
                if (ym5Var == ym5.GLOBAL) {
                    return nl2.c(context, str4);
                }
                return strArr[ym5Var.ordinal()];
        }
    }
}
