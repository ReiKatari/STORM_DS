package defpackage;

import java.util.ArrayList;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wa5  reason: default package */
/* loaded from: classes.dex */
public final class wa5 {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final hu2 b;
    public String c;
    public gu2 d;
    public final r9 e = new r9(13);
    public final vq2 f;
    public cw3 g;
    public final boolean h;
    public final os i;
    public final k91 j;
    public ua5 k;

    public wa5(String str, hu2 hu2Var, String str2, xq2 xq2Var, cw3 cw3Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = hu2Var;
        this.c = str2;
        this.g = cw3Var;
        this.h = z;
        if (xq2Var != null) {
            this.f = xq2Var.d();
        } else {
            this.f = new vq2(0, (byte) 0);
        }
        if (z2) {
            this.j = new k91(17);
        } else if (z3) {
            os osVar = new os(23);
            this.i = osVar;
            cw3 cw3Var2 = f14.g;
            cw3Var2.getClass();
            if (cw3Var2.b.equals("multipart")) {
                osVar.L = cw3Var2;
            } else {
                c44.u(cw3Var2, "multipart != ");
                throw null;
            }
        }
    }

    public final void a(String str, String str2, boolean z) {
        k91 k91Var = this.j;
        if (z) {
            k91Var.getClass();
            str.getClass();
            ((ArrayList) k91Var.A).add(dk7.n(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            ((ArrayList) k91Var.B).add(dk7.n(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        k91Var.getClass();
        str.getClass();
        ((ArrayList) k91Var.A).add(dk7.n(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        ((ArrayList) k91Var.B).add(dk7.n(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public final void b(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                h85 h85Var = cw3.d;
                this.g = hi2.n(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(b31.p("Malformed content type: ", str2), e);
            }
        }
        vq2 vq2Var = this.f;
        if (z) {
            vq2Var.e(str, str2);
        } else {
            vq2Var.b(str, str2);
        }
    }

    public final void c(xq2 xq2Var, ua5 ua5Var) {
        os osVar = this.i;
        osVar.getClass();
        ua5Var.getClass();
        if (xq2Var.b("Content-Type") == null) {
            if (xq2Var.b("Content-Length") == null) {
                ((ArrayList) osVar.R).add(new e14(xq2Var, ua5Var));
                return;
            }
            i.i("Unexpected header: Content-Length");
            return;
        }
        i.i("Unexpected header: Content-Type");
    }

    public final void d(String str, String str2, boolean z) {
        gu2 gu2Var;
        String str3 = this.c;
        String str4 = null;
        if (str3 != null) {
            hu2 hu2Var = this.b;
            hu2Var.getClass();
            try {
                gu2Var = new gu2(0);
                gu2Var.e(hu2Var, str3);
            } catch (IllegalArgumentException unused) {
                gu2Var = null;
            }
            this.d = gu2Var;
            if (gu2Var != null) {
                this.c = null;
            } else {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(hu2Var);
                vd6.h(sb, ", Relative: ", this.c);
                return;
            }
        }
        gu2 gu2Var2 = this.d;
        if (z) {
            gu2Var2.getClass();
            str.getClass();
            if (((ArrayList) gu2Var2.i) == null) {
                gu2Var2.i = new ArrayList();
            }
            ArrayList arrayList = (ArrayList) gu2Var2.i;
            arrayList.getClass();
            arrayList.add(dk7.m(str, 0, 0, " \"'<>#&=", 83));
            ArrayList arrayList2 = (ArrayList) gu2Var2.i;
            arrayList2.getClass();
            if (str2 != null) {
                str4 = dk7.m(str2, 0, 0, " \"'<>#&=", 83);
            }
            arrayList2.add(str4);
            return;
        }
        gu2Var2.getClass();
        str.getClass();
        if (((ArrayList) gu2Var2.i) == null) {
            gu2Var2.i = new ArrayList();
        }
        ArrayList arrayList3 = (ArrayList) gu2Var2.i;
        arrayList3.getClass();
        arrayList3.add(dk7.m(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
        ArrayList arrayList4 = (ArrayList) gu2Var2.i;
        arrayList4.getClass();
        if (str2 != null) {
            str4 = dk7.m(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91);
        }
        arrayList4.add(str4);
    }
}
