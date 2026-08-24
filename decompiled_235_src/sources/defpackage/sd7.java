package defpackage;

import java.util.Locale;
import java.util.StringTokenizer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sd7  reason: default package */
/* loaded from: classes.dex */
public class sd7 extends yc7 {
    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        String str;
        String str2;
        String str3 = null;
        if (hf3Var.n0() == jf3.NULL) {
            hf3Var.j0();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(hf3Var.l0(), "_");
        if (stringTokenizer.hasMoreElements()) {
            str = stringTokenizer.nextToken();
        } else {
            str = null;
        }
        if (stringTokenizer.hasMoreElements()) {
            str2 = stringTokenizer.nextToken();
        } else {
            str2 = null;
        }
        if (stringTokenizer.hasMoreElements()) {
            str3 = stringTokenizer.nextToken();
        }
        if (str2 == null && str3 == null) {
            return new Locale(str);
        }
        if (str3 == null) {
            return new Locale(str, str2);
        }
        return new Locale(str, str2, str3);
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        String locale;
        Locale locale2 = (Locale) obj;
        if (locale2 == null) {
            locale = null;
        } else {
            locale = locale2.toString();
        }
        vf3Var.c0(locale);
    }
}
