package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vd6 */
/* loaded from: classes.dex */
public final /* synthetic */ class vd6 implements xq6, uc7, ij2 {
    public static final vd6 B = new vd6(7);
    public static final vd6 L = new vd6(8);
    public static final vd6 R = new vd6(9);
    public static final vd6 X = new vd6(10);
    public static final vd6 Y = new vd6(11);
    public final /* synthetic */ int A;

    public /* synthetic */ vd6(f47 f47Var) {
        this.A = 13;
    }

    public static /* synthetic */ void b() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void c(int i, int i2, Object obj, String str) {
        throw new IndexOutOfBoundsException(str + i + obj + i2 + ((Object) ")."));
    }

    public static /* synthetic */ void d(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void e(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void f(String str, long j, Object obj) {
        throw new IllegalArgumentException((str + j + obj).toString());
    }

    public static /* synthetic */ void g(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void h(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void i(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3) {
        throw new IOException(str + obj + obj2 + obj3);
    }

    @Override // defpackage.uc7
    public uw6 a(to toVar) {
        return new uw6(toVar, ob4.a);
    }

    @Override // defpackage.ij2
    public Object apply(Object obj) {
        List<wh7> list = (List) obj;
        if (list != null) {
            ArrayList arrayList = new ArrayList(uq0.y0(list, 10));
            for (wh7 wh7Var : list) {
                arrayList.add(wh7Var.a());
            }
            return arrayList;
        }
        return null;
    }

    public /* synthetic */ vd6(int i) {
        this.A = i;
    }
}
