package defpackage;

import android.content.Context;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: st5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class st5 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;
    public final /* synthetic */ String[] L;
    public final /* synthetic */ Context R;

    public /* synthetic */ st5(String str, String[] strArr, Context context, int i) {
        this.A = i;
        this.B = str;
        this.L = strArr;
        this.R = context;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        String str;
        String str2;
        int i = this.A;
        Context context = this.R;
        String[] strArr = this.L;
        String str3 = this.B;
        switch (i) {
            case 0:
                nx5 nx5Var = (nx5) obj;
                nx5Var.getClass();
                if (nx5Var == nx5.GLOBAL) {
                    return qo2.c(context, str3);
                }
                return strArr[nx5Var.ordinal()];
            case 1:
                u26 u26Var = (u26) obj;
                u26Var.getClass();
                if (u26Var == u26.DEFAULT) {
                    return qo2.c(context, str3);
                }
                return strArr[u26Var.ordinal()];
            case 2:
                Integer num = (Integer) obj;
                if (num == null || (str = strArr[gi2.r(num.intValue() - 1, fv.G0(strArr))]) == null) {
                    return qo2.c(context, str3);
                }
                return str;
            case 3:
                VideoFiltering videoFiltering = (VideoFiltering) obj;
                if (videoFiltering != null) {
                    String str4 = (String) fv.J0(videoFiltering.ordinal(), strArr);
                    if (str4 == null) {
                        str4 = videoFiltering.name();
                    }
                    if (str4 != null) {
                        return str4;
                    }
                }
                return qo2.c(context, str3);
            case 4:
                a36 a36Var = (a36) obj;
                a36Var.getClass();
                if (a36Var == a36.DEFAULT) {
                    return qo2.c(context, str3);
                }
                return strArr[a36Var.ordinal()];
            default:
                VideoRenderer videoRenderer = (VideoRenderer) obj;
                if (videoRenderer == null || (str2 = strArr[videoRenderer.ordinal()]) == null) {
                    return qo2.c(context, str3);
                }
                return str2;
        }
    }
}
