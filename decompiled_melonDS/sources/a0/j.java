package a0;

import a6.i2;
import a6.v;
import android.view.View;
import c8.r;
import c8.s;
import c8.t;
import java.io.EOFException;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements t.a, v, s, d1.v {
    public static final /* synthetic */ int B = 0;
    public final /* synthetic */ int A;

    public static /* synthetic */ void c() {
        throw new EOFException();
    }

    public static /* synthetic */ void d(int i2, String str) {
        throw new IllegalArgumentException(str + i2);
    }

    public static /* synthetic */ void e(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void f(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void h(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void i(String str, long j2, Object obj) {
        throw new IllegalArgumentException((str + j2 + obj).toString());
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4 + obj5 + obj6 + obj7);
    }

    public static /* synthetic */ void l(StringBuilder sb2, int i2) {
        sb2.append(i2);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public static /* synthetic */ void m(StringBuilder sb2, Object obj) {
        sb2.append(obj);
        throw new IllegalStateException(sb2.toString());
    }

    public static /* synthetic */ void n(StringBuilder sb2, Object obj, Object obj2) {
        sb2.append(obj);
        sb2.append(obj2);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    public static /* synthetic */ void o(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void p(String str) {
        throw new IllegalStateException(str);
    }

    @Override // t.a
    public Object apply(Object obj) {
        List list = (List) obj;
        return null;
    }

    @Override // c8.s
    public void b(r rVar, t tVar, boolean z10) {
        switch (this.A) {
            case 14:
                rVar.d(tVar);
                return;
            case l1.c.f8512h /* 15 */:
                rVar.a(tVar);
                return;
            case 16:
                rVar.e(tVar);
                return;
            case 17:
                rVar.b();
                return;
            default:
                rVar.c();
                return;
        }
    }

    @Override // a6.v
    public i2 s(View view, i2 i2Var) {
        view.getClass();
        q5.b f8 = i2Var.f479a.f(647);
        f8.getClass();
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), f8.f12286d);
        return i2.f478b;
    }

    @Override // d1.v
    public float a(float f8) {
        return f8;
    }
}
