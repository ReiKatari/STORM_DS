package defpackage;

import java.util.ArrayList;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ok5  reason: default package */
/* loaded from: classes.dex */
public final class ok5 {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final i03 b;
    public String c;
    public h03 d;
    public final s9 e = new s9(13);
    public final ww2 f;
    public n34 g;
    public final boolean h;
    public final m44 i;
    public final yc1 j;
    public mk5 k;

    public ok5(String str, i03 i03Var, String str2, yw2 yw2Var, n34 n34Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = i03Var;
        this.c = str2;
        this.g = n34Var;
        this.h = z;
        if (yw2Var != null) {
            this.f = yw2Var.c();
        } else {
            this.f = new ww2(0, (byte) 0);
        }
        if (z2) {
            this.j = new yc1(18);
        } else if (z3) {
            m44 m44Var = new m44(2, (byte) 0);
            this.i = m44Var;
            n34 n34Var2 = l94.g;
            n34Var2.getClass();
            if (n34Var2.b.equals("multipart")) {
                m44Var.L = n34Var2;
            } else {
                u34.w(n34Var2, "multipart != ");
                throw null;
            }
        }
    }

    public final void a(String str, String str2, boolean z) {
        yc1 yc1Var = this.j;
        if (z) {
            yc1Var.getClass();
            str.getClass();
            ((ArrayList) yc1Var.A).add(jw2.n(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            ((ArrayList) yc1Var.B).add(jw2.n(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        yc1Var.getClass();
        str.getClass();
        ((ArrayList) yc1Var.A).add(jw2.n(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        ((ArrayList) yc1Var.B).add(jw2.n(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public final void b(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                xh5 xh5Var = n34.d;
                this.g = xk2.k(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(i61.m("Malformed content type: ", str2), e);
            }
        }
        ww2 ww2Var = this.f;
        if (z) {
            ww2Var.e(str, str2);
        } else {
            ww2Var.b(str, str2);
        }
    }

    public final void c(yw2 yw2Var, mk5 mk5Var) {
        m44 m44Var = this.i;
        m44Var.getClass();
        mk5Var.getClass();
        if (yw2Var.a("Content-Type") == null) {
            if (yw2Var.a("Content-Length") == null) {
                ((ArrayList) m44Var.R).add(new k94(yw2Var, mk5Var));
                return;
            }
            i.h("Unexpected header: Content-Length");
            return;
        }
        i.h("Unexpected header: Content-Type");
    }

    public final void d(String str, String str2, boolean z) {
        h03 h03Var;
        String str3 = this.c;
        String str4 = null;
        if (str3 != null) {
            i03 i03Var = this.b;
            i03Var.getClass();
            try {
                h03Var = new h03(0);
                h03Var.e(i03Var, str3);
            } catch (IllegalArgumentException unused) {
                h03Var = null;
            }
            this.d = h03Var;
            if (h03Var != null) {
                this.c = null;
            } else {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(i03Var);
                fa6.g(sb, ", Relative: ", this.c);
                return;
            }
        }
        h03 h03Var2 = this.d;
        if (z) {
            h03Var2.getClass();
            str.getClass();
            if (((ArrayList) h03Var2.i) == null) {
                h03Var2.i = new ArrayList();
            }
            ArrayList arrayList = (ArrayList) h03Var2.i;
            arrayList.getClass();
            arrayList.add(jw2.m(str, 0, 0, " \"'<>#&=", 83));
            ArrayList arrayList2 = (ArrayList) h03Var2.i;
            arrayList2.getClass();
            if (str2 != null) {
                str4 = jw2.m(str2, 0, 0, " \"'<>#&=", 83);
            }
            arrayList2.add(str4);
            return;
        }
        h03Var2.getClass();
        str.getClass();
        if (((ArrayList) h03Var2.i) == null) {
            h03Var2.i = new ArrayList();
        }
        ArrayList arrayList3 = (ArrayList) h03Var2.i;
        arrayList3.getClass();
        arrayList3.add(jw2.m(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
        ArrayList arrayList4 = (ArrayList) h03Var2.i;
        arrayList4.getClass();
        if (str2 != null) {
            str4 = jw2.m(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91);
        }
        arrayList4.add(str4);
    }
}
