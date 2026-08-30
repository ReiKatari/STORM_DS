package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g44  reason: default package */
/* loaded from: classes.dex */
public class g44 extends b44 implements Iterable, f93 {
    public static final /* synthetic */ int Z = 0;
    public final vh0 Y;

    public g44(k44 k44Var) {
        super(k44Var);
        this.Y = new vh0(this);
    }

    @Override // defpackage.b44
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof g44) && super.equals(obj)) {
                vh0 vh0Var = this.Y;
                int g = ((ec6) vh0Var.e).g();
                vh0 vh0Var2 = ((g44) obj).Y;
                if (g == ((ec6) vh0Var2.e).g() && vh0Var.c == vh0Var2.c) {
                    ec6 ec6Var = (ec6) vh0Var.e;
                    ec6Var.getClass();
                    Iterator it = ((ay0) d06.w0(new v0(5, ec6Var))).iterator();
                    while (it.hasNext()) {
                        b44 b44Var = (b44) it.next();
                        if (!b44Var.equals(((ec6) vh0Var2.e).c(b44Var.B.a))) {
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

    @Override // defpackage.b44
    public final int hashCode() {
        vh0 vh0Var = this.Y;
        int i = vh0Var.c;
        ec6 ec6Var = (ec6) vh0Var.e;
        int g = ec6Var.g();
        for (int i2 = 0; i2 < g; i2++) {
            i = (((i * 31) + ec6Var.e(i2)) * 31) + ((b44) ec6Var.h(i2)).hashCode();
        }
        return i;
    }

    @Override // defpackage.b44
    public final a44 i(os osVar) {
        a44 i = super.i(osVar);
        vh0 vh0Var = this.Y;
        vh0Var.getClass();
        return vh0Var.s(i, osVar, false, (g44) vh0Var.d);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        vh0 vh0Var = this.Y;
        vh0Var.getClass();
        return new i44(vh0Var);
    }

    public final a44 j(os osVar, b44 b44Var) {
        return this.Y.s(super.i(osVar), osVar, true, b44Var);
    }

    public final a44 k(String str, boolean z, b44 b44Var) {
        a44 a44Var;
        vh0 vh0Var = this.Y;
        vh0Var.getClass();
        g44 g44Var = (g44) vh0Var.d;
        a44 l = g44Var.B.l(str);
        ArrayList arrayList = new ArrayList();
        Iterator it = g44Var.iterator();
        while (true) {
            i44 i44Var = (i44) it;
            a44Var = null;
            if (!i44Var.hasNext()) {
                break;
            }
            b44 b44Var2 = (b44) i44Var.next();
            if (!b53.x(b44Var2, b44Var)) {
                if (b44Var2 instanceof g44) {
                    a44Var = ((g44) b44Var2).k(str, false, g44Var);
                } else {
                    b44Var2.getClass();
                    a44Var = b44Var2.B.l(str);
                }
            }
            if (a44Var != null) {
                arrayList.add(a44Var);
            }
        }
        a44 a44Var2 = (a44) tq0.V0(arrayList);
        g44 g44Var2 = g44Var.L;
        if (g44Var2 != null && z && !g44Var2.equals(b44Var)) {
            a44Var = g44Var2.k(str, true, g44Var);
        }
        return (a44) tq0.V0(nu.o0(new a44[]{l, a44Var2, a44Var}));
    }

    @Override // defpackage.b44
    public final String toString() {
        b44 b44Var;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        vh0 vh0Var = this.Y;
        String str = (String) vh0Var.f;
        vh0Var.getClass();
        if (str != null && !zg6.B0(str)) {
            b44Var = vh0Var.k(str, true);
        } else {
            b44Var = null;
        }
        if (b44Var == null) {
            b44Var = vh0Var.j(vh0Var.c);
        }
        sb.append(" startDestination=");
        if (b44Var == null) {
            String str2 = (String) vh0Var.f;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = (String) vh0Var.b;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(vh0Var.c));
                }
            }
        } else {
            sb.append("{");
            sb.append(b44Var.toString());
            sb.append("}");
        }
        return sb.toString();
    }
}
