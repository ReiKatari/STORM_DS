package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@pd4("navigation")
/* renamed from: qc4  reason: default package */
/* loaded from: classes.dex */
public class qc4 extends qd4 {
    public final rd4 c;

    public qc4(rd4 rd4Var) {
        rd4Var.getClass();
        this.c = rd4Var;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [dh5, java.lang.Object] */
    @Override // defpackage.qd4
    public final void d(List list, ad4 ad4Var) {
        ic4 ic4Var;
        Bundle bundle;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb4 sb4Var = (sb4) it.next();
            ic4 ic4Var2 = sb4Var.B;
            ic4Var2.getClass();
            mc4 mc4Var = (mc4) ic4Var2;
            z9 z9Var = mc4Var.B;
            ?? obj = new Object();
            obj.A = sb4Var.d0.c();
            dk0 dk0Var = mc4Var.Y;
            int i = dk0Var.L;
            String str = (String) dk0Var.Y;
            if (i == 0 && str == null) {
                z9Var.getClass();
                String valueOf = String.valueOf(z9Var.a);
                valueOf.getClass();
                if (((mc4) dk0Var.R).B.a == 0) {
                    valueOf = "the root navigation";
                }
                u34.f("no start destination defined via app:startDestination for ".concat(valueOf));
                return;
            }
            if (str != null) {
                ic4Var = dk0Var.m(str, false);
            } else {
                ic4Var = (ic4) ((un6) dk0Var.X).c(i);
            }
            if (ic4Var == null) {
                if (((String) dk0Var.B) == null) {
                    String str2 = (String) dk0Var.Y;
                    if (str2 == null) {
                        str2 = String.valueOf(dk0Var.L);
                    }
                    dk0Var.B = str2;
                }
                String str3 = (String) dk0Var.B;
                str3.getClass();
                i.h(lb1.A("navigation destination ", str3, " is not a direct child of this NavGraph"));
                return;
            }
            z9 z9Var2 = ic4Var.B;
            if (str != null) {
                if (!str.equals((String) z9Var2.e)) {
                    hc4 l = z9Var2.l(str);
                    if (l != null) {
                        bundle = l.B;
                    } else {
                        bundle = null;
                    }
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle l2 = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
                        l2.putAll(bundle);
                        Bundle bundle2 = (Bundle) obj.A;
                        if (bundle2 != null) {
                            l2.putAll(bundle2);
                        }
                        obj.A = l2;
                    }
                }
                if (ic4Var.c().isEmpty()) {
                    continue;
                } else {
                    ArrayList C = xk2.C(ic4Var.c(), new pc4(0, obj));
                    if (!C.isEmpty()) {
                        e41.s("Cannot navigate to startDestination ", ic4Var, ". Missing required arguments [", C, 93);
                        return;
                    }
                }
            }
            this.c.b(ic4Var.A).d(hf.b0(b().b(ic4Var, ic4Var.a((Bundle) obj.A))), ad4Var);
        }
    }

    @Override // defpackage.qd4
    /* renamed from: g */
    public mc4 a() {
        return new mc4(this);
    }
}
