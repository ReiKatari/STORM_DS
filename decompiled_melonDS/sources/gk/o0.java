package gk;

import j0.o1;
import java.util.ArrayList;
import java.util.regex.Pattern;
import p1.c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f5750l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a  reason: collision with root package name */
    public final String f5751a;

    /* renamed from: b  reason: collision with root package name */
    public final pi.r f5752b;

    /* renamed from: c  reason: collision with root package name */
    public String f5753c;

    /* renamed from: d  reason: collision with root package name */
    public na.a0 f5754d;

    /* renamed from: e  reason: collision with root package name */
    public final a7.v f5755e = new a7.v(7);

    /* renamed from: f  reason: collision with root package name */
    public final o1 f5756f;

    /* renamed from: g  reason: collision with root package name */
    public pi.t f5757g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5758h;

    /* renamed from: i  reason: collision with root package name */
    public final c1 f5759i;

    /* renamed from: j  reason: collision with root package name */
    public final p1.a0 f5760j;

    /* renamed from: k  reason: collision with root package name */
    public pi.b0 f5761k;

    public o0(String str, pi.r rVar, String str2, pi.q qVar, pi.t tVar, boolean z10, boolean z11, boolean z12) {
        this.f5751a = str;
        this.f5752b = rVar;
        this.f5753c = str2;
        this.f5757g = tVar;
        this.f5758h = z10;
        if (qVar != null) {
            this.f5756f = qVar.c();
        } else {
            this.f5756f = new o1(3, false);
        }
        if (z11) {
            this.f5760j = new p1.a0(3);
        } else if (z12) {
            c1 c1Var = new c1(1);
            this.f5759i = c1Var;
            pi.t tVar2 = pi.v.f11798g;
            tVar2.getClass();
            if (tVar2.f11793b.equals("multipart")) {
                c1Var.B = tVar2;
            } else {
                fj.j.t(tVar2, "multipart != ");
                throw null;
            }
        }
    }

    public final void a(String str, String str2, boolean z10) {
        p1.a0 a0Var = this.f5760j;
        if (z10) {
            a0Var.getClass();
            str.getClass();
            ((ArrayList) a0Var.B).add(ej.a.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            ((ArrayList) a0Var.L).add(ej.a.b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        a0Var.getClass();
        str.getClass();
        ((ArrayList) a0Var.B).add(ej.a.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        ((ArrayList) a0Var.L).add(ej.a.b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public final void b(String str, String str2, boolean z10) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                vc.f fVar = pi.t.f11790d;
                this.f5757g = p7.n.i(str2);
                return;
            } catch (IllegalArgumentException e6) {
                throw new IllegalArgumentException("Malformed content type: " + str2, e6);
            }
        }
        o1 o1Var = this.f5756f;
        if (z10) {
            o1Var.e(str, str2);
        } else {
            o1Var.b(str, str2);
        }
    }

    public final void c(pi.q qVar, pi.b0 b0Var) {
        c1 c1Var = this.f5759i;
        c1Var.getClass();
        b0Var.getClass();
        if (qVar.a("Content-Type") == null) {
            if (qVar.a("Content-Length") == null) {
                ((ArrayList) c1Var.L).add(new pi.u(qVar, b0Var));
                return;
            }
            a0.j.h("Unexpected header: Content-Length");
            return;
        }
        a0.j.h("Unexpected header: Content-Type");
    }

    public final void d(String str, String str2, boolean z10) {
        na.a0 a0Var;
        String str3 = this.f5753c;
        String str4 = null;
        if (str3 != null) {
            pi.r rVar = this.f5752b;
            rVar.getClass();
            try {
                a0Var = new na.a0(1);
                a0Var.e(rVar, str3);
            } catch (IllegalArgumentException unused) {
                a0Var = null;
            }
            this.f5754d = a0Var;
            if (a0Var != null) {
                this.f5753c = null;
            } else {
                StringBuilder sb2 = new StringBuilder("Malformed URL. Base: ");
                sb2.append(rVar);
                fj.j.k(sb2, ", Relative: ", this.f5753c);
                return;
            }
        }
        na.a0 a0Var2 = this.f5754d;
        if (z10) {
            a0Var2.getClass();
            str.getClass();
            if (((ArrayList) a0Var2.f10124h) == null) {
                a0Var2.f10124h = new ArrayList();
            }
            ArrayList arrayList = (ArrayList) a0Var2.f10124h;
            arrayList.getClass();
            arrayList.add(ej.a.a(str, 0, 0, " \"'<>#&=", 83));
            ArrayList arrayList2 = (ArrayList) a0Var2.f10124h;
            arrayList2.getClass();
            if (str2 != null) {
                str4 = ej.a.a(str2, 0, 0, " \"'<>#&=", 83);
            }
            arrayList2.add(str4);
            return;
        }
        a0Var2.getClass();
        str.getClass();
        if (((ArrayList) a0Var2.f10124h) == null) {
            a0Var2.f10124h = new ArrayList();
        }
        ArrayList arrayList3 = (ArrayList) a0Var2.f10124h;
        arrayList3.getClass();
        arrayList3.add(ej.a.a(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
        ArrayList arrayList4 = (ArrayList) a0Var2.f10124h;
        arrayList4.getClass();
        if (str2 != null) {
            str4 = ej.a.a(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91);
        }
        arrayList4.add(str4);
    }
}
