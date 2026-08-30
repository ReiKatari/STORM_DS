package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gd4  reason: default package */
/* loaded from: classes.dex */
public final class gd4 extends tv4 {
    public final long f0;
    public boolean g0;
    public boolean h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd4(hv4 hv4Var, xv4 xv4Var, long j, h06 h06Var) {
        super(hv4Var, xv4Var, h06Var);
        h06Var.getClass();
        this.f0 = j;
    }

    @Override // defpackage.tv4, defpackage.b91
    public final yu0 c(h06 h06Var) {
        Object obj;
        h06Var.getClass();
        if (h06Var.equals(this.X)) {
            return this;
        }
        tv4 tv4Var = new tv4(this.L, this.R, h06Var);
        if (h06Var.d() == 1) {
            List i = h06Var.i(0);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : i) {
                if (obj2 instanceof kv4) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.size() == 1) {
                obj = arrayList.get(0);
            } else {
                obj = null;
            }
            kv4 kv4Var = (kv4) obj;
            if (kv4Var != null) {
                kv4Var.number();
                return tv4Var;
            }
            c44.t(h06Var.b(), " should have @ProtoNumber annotation", "Implementation of oneOf type ");
            return null;
        }
        c44.j("Implementation of oneOf type ", h06Var.b(), " should contain only 1 element, but get ", h06Var.d());
        return null;
    }

    @Override // defpackage.tv4
    public final String u0(long j) {
        Object obj;
        String b;
        if (j == 19501) {
            vn1 vn1Var = this.L.b;
            int i = (int) (this.f0 & 2147483647L);
            h06 h06Var = this.X;
            h06Var.getClass();
            vn1Var.getClass();
            Iterator it = gk2.L(h06Var, vn1Var).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((int) (gk2.H((h06) obj, 0) & 2147483647L)) == i) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            h06 h06Var2 = (h06) obj;
            if (h06Var2 != null && (b = h06Var2.b()) != null) {
                return b;
            }
            String b2 = h06Var.b();
            throw new IllegalArgumentException("Cannot find a subclass of " + b2 + " annotated with @ProtoNumber(" + i + ").");
        }
        return super.u0(j);
    }

    @Override // defpackage.tv4, defpackage.yu0
    public final int v(h06 h06Var) {
        h06Var.getClass();
        if (!this.g0) {
            this.g0 = true;
            return 0;
        } else if (!this.h0) {
            this.h0 = true;
            return 1;
        } else {
            return -1;
        }
    }

    @Override // defpackage.tv4
    public final long x0(h06 h06Var, int i) {
        h06Var.getClass();
        if (i == 0) {
            return 19501L;
        }
        return gk2.H(h06Var, 0);
    }
}
