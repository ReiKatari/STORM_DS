package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mc4  reason: default package */
/* loaded from: classes.dex */
public class mc4 extends ic4 implements Iterable, zf3 {
    public static final /* synthetic */ int Z = 0;
    public final dk0 Y;

    public mc4(qc4 qc4Var) {
        super(qc4Var);
        this.Y = new dk0(this);
    }

    @Override // defpackage.ic4
    public final hc4 d(m44 m44Var) {
        hc4 d = super.d(m44Var);
        dk0 dk0Var = this.Y;
        dk0Var.getClass();
        return dk0Var.v(d, m44Var, false, (mc4) dk0Var.R);
    }

    @Override // defpackage.ic4
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof mc4) && super.equals(obj)) {
                dk0 dk0Var = this.Y;
                int f = ((un6) dk0Var.X).f();
                dk0 dk0Var2 = ((mc4) obj).Y;
                if (f == ((un6) dk0Var2.X).f() && dk0Var.L == dk0Var2.L) {
                    un6 un6Var = (un6) dk0Var.X;
                    un6Var.getClass();
                    Iterator it = ((f11) sb6.Y(new w0(un6Var, 5))).iterator();
                    while (it.hasNext()) {
                        ic4 ic4Var = (ic4) it.next();
                        if (!ic4Var.equals(((un6) dk0Var2.X).c(ic4Var.B.a))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final hc4 f(m44 m44Var, ic4 ic4Var) {
        return this.Y.v(super.d(m44Var), m44Var, true, ic4Var);
    }

    public final hc4 g(String str, boolean z, ic4 ic4Var) {
        hc4 hc4Var;
        dk0 dk0Var = this.Y;
        dk0Var.getClass();
        mc4 mc4Var = (mc4) dk0Var.R;
        hc4 l = mc4Var.B.l(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = mc4Var.iterator();
        while (true) {
            oc4 oc4Var = (oc4) it;
            hc4Var = null;
            if (!oc4Var.hasNext()) {
                break;
            }
            ic4 ic4Var2 = (ic4) oc4Var.next();
            if (!nb3.k(ic4Var2, ic4Var)) {
                if (ic4Var2 instanceof mc4) {
                    hc4Var = ((mc4) ic4Var2).g(str, false, mc4Var);
                } else {
                    ic4Var2.getClass();
                    hc4Var = ic4Var2.B.l(str);
                }
            }
            if (hc4Var != null) {
                arrayList.add(hc4Var);
            }
        }
        hc4 hc4Var2 = (hc4) gt0.S0(arrayList);
        mc4 mc4Var2 = mc4Var.L;
        if (mc4Var2 != null && z && !mc4Var2.equals(ic4Var)) {
            hc4Var = mc4Var2.g(str, true, mc4Var);
        }
        return (hc4) gt0.S0(fv.C0(new hc4[]{l, hc4Var2, hc4Var}));
    }

    @Override // defpackage.ic4
    public final int hashCode() {
        dk0 dk0Var = this.Y;
        int i = dk0Var.L;
        un6 un6Var = (un6) dk0Var.X;
        int f = un6Var.f();
        for (int i2 = 0; i2 < f; i2++) {
            i = (((i * 31) + un6Var.d(i2)) * 31) + ((ic4) un6Var.g(i2)).hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        dk0 dk0Var = this.Y;
        dk0Var.getClass();
        return new oc4(dk0Var);
    }

    @Override // defpackage.ic4
    public final String toString() {
        ic4 ic4Var;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        dk0 dk0Var = this.Y;
        String str = (String) dk0Var.Y;
        dk0Var.getClass();
        if (str != null && !qs6.v0(str)) {
            ic4Var = dk0Var.m(str, true);
        } else {
            ic4Var = null;
        }
        if (ic4Var == null) {
            ic4Var = dk0Var.l(dk0Var.L);
        }
        sb.append(" startDestination=");
        if (ic4Var == null) {
            String str2 = (String) dk0Var.Y;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = (String) dk0Var.B;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(dk0Var.L));
                }
            }
        } else {
            sb.append("{");
            sb.append(ic4Var.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
