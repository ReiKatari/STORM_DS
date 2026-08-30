package defpackage;

import java.util.regex.Pattern;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pl0  reason: default package */
/* loaded from: classes.dex */
public final class pl0 {
    public static final ci3 g = io2.X(new xk0(1), new nl0(0));
    public final boolean a;
    public final tj4 b;
    public final tj4 c;
    public final tj4 d;
    public final tj4 e;
    public final tj4 f;

    public pl0(String str, String str2, String str3, boolean z) {
        str.getClass();
        str3.getClass();
        this.a = z;
        int length = str.length();
        this.b = me2.G(new oq6(str, 4, ve2.g(length, length)));
        int length2 = str2.length();
        this.c = me2.G(new oq6(str2, 4, ve2.g(length2, length2)));
        int length3 = str3.length();
        this.d = me2.G(ct3.g0(new oq6(str3, 4, ve2.g(length3, length3))));
        this.e = me2.G(null);
        this.f = me2.G(null);
    }

    public final bm0 a() {
        return new bm0(zg6.Z0(((oq6) this.b.getValue()).a.B).toString(), zg6.Z0(((oq6) this.c.getValue()).a.B).toString(), gh6.k0(zg6.Z0(((oq6) this.d.getValue()).a.B).toString(), '\n', ' '));
    }

    public final boolean b() {
        tj4 tj4Var = this.d;
        boolean B0 = zg6.B0(((oq6) tj4Var.getValue()).a.B);
        tj4 tj4Var2 = this.f;
        if (B0) {
            tj4Var2.setValue(ol0.CANNOT_BE_EMPTY);
            return false;
        }
        String obj = zg6.Z0(((oq6) tj4Var.getValue()).a.B).toString();
        Pattern compile = Pattern.compile("[ \n]");
        compile.getClass();
        obj.getClass();
        String replaceAll = compile.matcher(obj).replaceAll("");
        replaceAll.getClass();
        if (replaceAll.length() % 16 == 0) {
            tj4Var2.setValue(null);
            return true;
        }
        tj4Var2.setValue(ol0.INVALID_FORMAT);
        return false;
    }

    public pl0(boolean z) {
        this("", "", "", z);
    }
}
