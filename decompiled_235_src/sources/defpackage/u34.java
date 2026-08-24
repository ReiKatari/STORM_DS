package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u34 */
/* loaded from: classes.dex */
public final /* synthetic */ class u34 implements mo2, gm1, ga6 {
    public static /* synthetic */ void A(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void B(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void C(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void a() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void d(int i, Object obj, Throwable th) {
        throw new IllegalArgumentException("Error while decoding proto number " + i + ((Object) " of ") + obj, th);
    }

    public static /* synthetic */ void e(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void f(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void g(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void j(String str) {
        throw new RuntimeException(str);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, int i) {
        throw new IllegalArgumentException((str + obj + obj2 + i).toString());
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4 + obj5).toString());
    }

    public static /* synthetic */ void o(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void p(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void q(StringBuilder sb, int i) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void r(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void s(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void t() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void u(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void v(Object obj, Object obj2, String str) {
        throw new RuntimeException(str + obj + obj2);
    }

    public static /* synthetic */ void w(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void x(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void y(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void z(StringBuilder sb, Object obj) {
        sb.append(", but found ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString(), null);
    }

    @Override // defpackage.mo2
    public Object apply(Object obj) {
        Void r1 = (Void) obj;
        return f35.b;
    }

    @Override // defpackage.ga6
    public ea6 b(ci ciVar) {
        boolean z;
        ls0 ls0Var = (ls0) ciVar.R;
        da6 b = ls0Var.b(ls0Var.b);
        da6 b2 = ls0Var.b(ls0Var.c);
        if (ciVar.m() == m71.CROSSED) {
            z = true;
        } else {
            z = false;
        }
        return new ea6(b, b2, z);
    }

    @Override // defpackage.gm1
    public double c(double d) {
        return d;
    }
}
