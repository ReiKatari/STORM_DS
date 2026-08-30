package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c44 */
/* loaded from: classes.dex */
public final /* synthetic */ class c44 implements ij2, bi1 {
    public static final /* synthetic */ int B = 0;
    public final /* synthetic */ int A;

    public static /* synthetic */ void b() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void c(int i, Object obj, Throwable th) {
        throw new IllegalArgumentException("Error while decoding proto number " + i + ((Object) " of ") + obj, th);
    }

    public static /* synthetic */ void d(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void e(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void g(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void i(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, int i) {
        throw new IllegalArgumentException((str + obj + obj2 + i).toString());
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4 + obj5).toString());
    }

    public static /* synthetic */ void n(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void o(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void p(StringBuilder sb, int i) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void q(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void r() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void s(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void t(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void v(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void w(StringBuilder sb, Object obj) {
        sb.append(", but found ");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString(), null);
    }

    public static /* synthetic */ void x(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void y(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    @Override // defpackage.ij2
    public Object apply(Object obj) {
        Void r1 = (Void) obj;
        return bu4.b;
    }

    @Override // defpackage.bi1
    public double a(double d) {
        return d;
    }
}
