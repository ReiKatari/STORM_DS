package defpackage;

import java.util.Locale;
import java.util.StringTokenizer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xz6  reason: default package */
/* loaded from: classes.dex */
public class xz6 extends dz6 {
    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        String str;
        String str2;
        String str3 = null;
        if (o83Var.n0() == q83.NULL) {
            o83Var.j0();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(o83Var.l0(), "_");
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

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        String locale;
        Locale locale2 = (Locale) obj;
        if (locale2 == null) {
            locale = null;
        } else {
            locale = locale2.toString();
        }
        b93Var.Z(locale);
    }
}
