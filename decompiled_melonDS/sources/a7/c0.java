package a7;

import a1.x0;
import a4.k2;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@l0("navigation")
/* loaded from: classes.dex */
public class c0 extends m0 {

    /* renamed from: c  reason: collision with root package name */
    public final n0 f549c;

    public c0(n0 n0Var) {
        n0Var.getClass();
        this.f549c = n0Var;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [nc.t, java.lang.Object] */
    @Override // a7.m0
    public final void d(List list, f0 f0Var) {
        x xVar;
        Bundle bundle;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            x xVar2 = iVar.B;
            xVar2.getClass();
            z zVar = (z) xVar2;
            k2 k2Var = zVar.B;
            ?? obj = new Object();
            obj.A = iVar.f576b0.c();
            d5.j jVar = zVar.Y;
            int i2 = jVar.f3860b;
            String str = (String) jVar.f3864f;
            if (i2 == 0 && str == null) {
                k2Var.getClass();
                String valueOf = String.valueOf(k2Var.f248a);
                valueOf.getClass();
                if (((z) jVar.f3861c).B.f248a == 0) {
                    valueOf = "the root navigation";
                }
                m9.o.g("no start destination defined via app:startDestination for ".concat(valueOf));
                return;
            }
            if (str != null) {
                xVar = jVar.f(str, false);
            } else {
                xVar = (x) ((x0) jVar.f3862d).c(i2);
            }
            if (xVar == null) {
                if (((String) jVar.f3863e) == null) {
                    String str2 = (String) jVar.f3864f;
                    if (str2 == null) {
                        str2 = String.valueOf(jVar.f3860b);
                    }
                    jVar.f3863e = str2;
                }
                String str3 = (String) jVar.f3863e;
                str3.getClass();
                a0.j.h(kc.a.g("navigation destination ", str3, " is not a direct child of this NavGraph"));
                return;
            }
            k2 k2Var2 = xVar.B;
            if (str != null) {
                if (!str.equals((String) k2Var2.f252e)) {
                    w l10 = k2Var2.l(str);
                    if (l10 != null) {
                        bundle = l10.B;
                    } else {
                        bundle = null;
                    }
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle b10 = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
                        b10.putAll(bundle);
                        Bundle bundle2 = (Bundle) obj.A;
                        if (bundle2 != null) {
                            b10.putAll(bundle2);
                        }
                        obj.A = b10;
                    }
                }
                if (xVar.c().isEmpty()) {
                    continue;
                } else {
                    ArrayList b02 = d0.d.b0(xVar.c(), new b0(obj, 0));
                    if (!b02.isEmpty()) {
                        m9.o.k("Cannot navigate to startDestination ", xVar, ". Missing required arguments [", b02, 93);
                        return;
                    }
                }
            }
            this.f549c.b(xVar.A).d(p7.t.x(b().b(xVar, xVar.a((Bundle) obj.A))), f0Var);
        }
    }

    @Override // a7.m0
    /* renamed from: g */
    public z a() {
        return new z(this);
    }
}
