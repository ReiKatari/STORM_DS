package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: em4  reason: default package */
/* loaded from: classes.dex */
public final class em4 extends a55 {
    public final long g0;
    public boolean h0;
    public boolean i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public em4(o45 o45Var, e55 e55Var, long j, wb6 wb6Var) {
        super(o45Var, e55Var, wb6Var);
        wb6Var.getClass();
        this.g0 = j;
    }

    @Override // defpackage.a55, defpackage.sc1
    public final ux0 c(wb6 wb6Var) {
        Object obj;
        wb6Var.getClass();
        if (wb6Var.equals(this.X)) {
            return this;
        }
        a55 a55Var = new a55(this.L, this.R, wb6Var);
        if (wb6Var.f() == 1) {
            List i = wb6Var.i(0);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : i) {
                if (obj2 instanceof r45) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.size() == 1) {
                obj = arrayList.get(0);
            } else {
                obj = null;
            }
            r45 r45Var = (r45) obj;
            if (r45Var != null) {
                r45Var.number();
                return a55Var;
            }
            u34.A(wb6Var.a(), " should have @ProtoNumber annotation", "Implementation of oneOf type ");
            return null;
        }
        u34.k("Implementation of oneOf type ", wb6Var.a(), " should contain only 1 element, but get ", wb6Var.f());
        return null;
    }

    @Override // defpackage.a55, defpackage.ux0
    public final int q(wb6 wb6Var) {
        wb6Var.getClass();
        if (!this.h0) {
            this.h0 = true;
            return 0;
        } else if (!this.i0) {
            this.i0 = true;
            return 1;
        } else {
            return -1;
        }
    }

    @Override // defpackage.a55
    public final String u0(long j) {
        Object obj;
        String a;
        if (j == 19501) {
            jd1 jd1Var = this.L.b;
            int i = (int) (this.g0 & 2147483647L);
            wb6 wb6Var = this.X;
            wb6Var.getClass();
            jd1Var.getClass();
            Iterator it = mp2.y(wb6Var, jd1Var).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((int) (mp2.t((wb6) obj, 0) & 2147483647L)) == i) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            wb6 wb6Var2 = (wb6) obj;
            if (wb6Var2 != null && (a = wb6Var2.a()) != null) {
                return a;
            }
            String a2 = wb6Var.a();
            throw new IllegalArgumentException("Cannot find a subclass of " + a2 + " annotated with @ProtoNumber(" + i + ").");
        }
        return super.u0(j);
    }

    @Override // defpackage.a55
    public final long x0(wb6 wb6Var, int i) {
        wb6Var.getClass();
        if (i == 0) {
            return 19501L;
        }
        return mp2.t(wb6Var, 0);
    }
}
