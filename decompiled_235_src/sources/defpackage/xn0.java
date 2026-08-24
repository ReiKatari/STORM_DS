package defpackage;

import java.util.regex.Pattern;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xn0  reason: default package */
/* loaded from: classes.dex */
public final class xn0 {
    public static final ap3 g = jx2.z(new fn0(1), new vn0(0));
    public final boolean a;
    public final vs4 b;
    public final vs4 c;
    public final vs4 d;
    public final vs4 e;
    public final vs4 f;

    public xn0(String str, String str2, String str3, boolean z) {
        str.getClass();
        str3.getClass();
        this.a = z;
        int length = str.length();
        this.b = np2.Y(new c37(str, 4, jx2.f(length, length)));
        int length2 = str2.length();
        this.c = np2.Y(new c37(str2, 4, jx2.f(length2, length2)));
        int length3 = str3.length();
        this.d = np2.Y(n16.w(new c37(str3, 4, jx2.f(length3, length3))));
        this.e = np2.Y(null);
        this.f = np2.Y(null);
    }

    public final jo0 a() {
        return new jo0(qs6.T0(((c37) this.b.getValue()).a.B).toString(), qs6.T0(((c37) this.c.getValue()).a.B).toString(), xs6.d0(qs6.T0(((c37) this.d.getValue()).a.B).toString(), '\n', ' '));
    }

    public final boolean b() {
        vs4 vs4Var = this.d;
        boolean v0 = qs6.v0(((c37) vs4Var.getValue()).a.B);
        vs4 vs4Var2 = this.f;
        if (v0) {
            vs4Var2.setValue(wn0.CANNOT_BE_EMPTY);
            return false;
        }
        String obj = qs6.T0(((c37) vs4Var.getValue()).a.B).toString();
        Pattern compile = Pattern.compile("[ \n]");
        compile.getClass();
        obj.getClass();
        String replaceAll = compile.matcher(obj).replaceAll("");
        replaceAll.getClass();
        if (replaceAll.length() % 16 == 0) {
            vs4Var2.setValue(null);
            return true;
        }
        vs4Var2.setValue(wn0.INVALID_FORMAT);
        return false;
    }

    public xn0(boolean z) {
        this("", "", "", z);
    }
}
