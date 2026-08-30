package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
@j54("navigation")
/* renamed from: k44  reason: default package */
/* loaded from: classes.dex */
public class k44 extends k54 {
    public final l54 c;

    public k44(l54 l54Var) {
        l54Var.getClass();
        this.c = l54Var;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, n75] */
    @Override // defpackage.k54
    public final void d(List list, u44 u44Var) {
        b44 b44Var;
        Bundle bundle;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l34 l34Var = (l34) it.next();
            b44 b44Var2 = l34Var.B;
            b44Var2.getClass();
            g44 g44Var = (g44) b44Var2;
            y9 y9Var = g44Var.B;
            ?? obj = new Object();
            obj.A = l34Var.c0.c();
            vh0 vh0Var = g44Var.Y;
            int i = vh0Var.c;
            String str = (String) vh0Var.f;
            if (i == 0 && str == null) {
                y9Var.getClass();
                String valueOf = String.valueOf(y9Var.a);
                valueOf.getClass();
                if (((g44) vh0Var.d).B.a == 0) {
                    valueOf = "the root navigation";
                }
                c44.e("no start destination defined via app:startDestination for ".concat(valueOf));
                return;
            }
            if (str != null) {
                b44Var = vh0Var.k(str, false);
            } else {
                b44Var = (b44) ((ec6) vh0Var.e).c(i);
            }
            if (b44Var == null) {
                if (((String) vh0Var.b) == null) {
                    String str2 = (String) vh0Var.f;
                    if (str2 == null) {
                        str2 = String.valueOf(vh0Var.c);
                    }
                    vh0Var.b = str2;
                }
                String str3 = (String) vh0Var.b;
                str3.getClass();
                i.i(wh1.A("navigation destination ", str3, " is not a direct child of this NavGraph"));
                return;
            }
            y9 y9Var2 = b44Var.B;
            if (str != null) {
                if (!str.equals((String) y9Var2.e)) {
                    a44 l = y9Var2.l(str);
                    if (l != null) {
                        bundle = l.B;
                    } else {
                        bundle = null;
                    }
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle k = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
                        k.putAll(bundle);
                        Bundle bundle2 = (Bundle) obj.A;
                        if (bundle2 != null) {
                            k.putAll(bundle2);
                        }
                        obj.A = k;
                    }
                }
                if (b44Var.d().isEmpty()) {
                    continue;
                } else {
                    ArrayList Q = cg2.Q(b44Var.d(), new j44(0, obj));
                    if (!Q.isEmpty()) {
                        f81.s("Cannot navigate to startDestination ", b44Var, ". Missing required arguments [", Q, 93);
                        return;
                    }
                }
            }
            this.c.b(b44Var.A).d(l07.b0(b().b(b44Var, b44Var.b((Bundle) obj.A))), u44Var);
        }
    }

    @Override // defpackage.k54
    /* renamed from: g */
    public g44 a() {
        return new g44(this);
    }
}
