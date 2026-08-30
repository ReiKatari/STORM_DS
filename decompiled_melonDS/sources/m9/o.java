package m9;

import a6.i2;
import a6.v;
import android.view.View;
import java.util.NoSuchElementException;
import q4.e0;
import q4.g0;
import qa.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements v, n2.f, g0, x, wa.p {
    public static /* synthetic */ void b() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void c(int i2, int i10, Object obj, String str) {
        throw new IndexOutOfBoundsException(str + i2 + obj + i10 + ((Object) ")."));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(int i2, Object obj, String str) {
        throw new IllegalArgumentException((str + obj + ((char) i2)).toString());
    }

    public static /* synthetic */ void f(int i2, String str) {
        throw new IllegalStateException((str + i2).toString());
    }

    public static /* synthetic */ void g(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void i(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3, int i2) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i2)).toString());
    }

    public static /* synthetic */ void l(String str, Object obj, Throwable th2) {
        throw new RuntimeException(str + obj, th2);
    }

    public static /* synthetic */ void m(String str, Throwable th2) {
        throw new RuntimeException(str, th2);
    }

    public static /* synthetic */ void n(StringBuilder sb2, Object obj) {
        sb2.append(obj);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static /* synthetic */ void o() {
        throw new RuntimeException();
    }

    public static /* synthetic */ void p(int i2, String str) {
        throw new IllegalArgumentException((str + i2 + '.').toString());
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void r(String str) {
        throw new RuntimeException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void t(String str, Object obj, Object obj2, Object obj3, int i2) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i2));
    }

    public static /* synthetic */ void u(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void v(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void w(Object obj, String str) {
        throw new RuntimeException(str + ((Object) obj.toString()));
    }

    public static /* synthetic */ void x(String str) {
        throw new NoSuchElementException(str);
    }

    @Override // q4.g0
    public e0 a(l4.h hVar) {
        return new e0(hVar, q4.p.f12260a);
    }

    @Override // wa.p
    public Object d() {
        return new wa.o(true);
    }

    @Override // a6.v
    public i2 s(View view, i2 i2Var) {
        view.getClass();
        q5.b f8 = i2Var.f479a.f(647);
        f8.getClass();
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), f8.f12286d);
        return i2.f478b;
    }

    @Override // n2.f
    public void cancel() {
    }
}
