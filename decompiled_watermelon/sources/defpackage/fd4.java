package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fd4  reason: default package */
/* loaded from: classes.dex */
public final class fd4 extends vv4 {
    public final ka3 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd4(hv4 hv4Var, ka3 ka3Var, h06 h06Var) {
        super(hv4Var, ka3Var, h06Var);
        hv4Var.getClass();
        ka3Var.getClass();
        h06Var.getClass();
        this.Z = ka3Var;
        if (h06Var.c() instanceof zp4) {
            return;
        }
        f81.s("The serializer of one of type ", h06Var.b(), " should be using generic polymorphic serializer, but got ", h06Var.c(), 46);
        throw null;
    }

    @Override // defpackage.vv4, defpackage.mz1
    public final zu0 c(h06 h06Var) {
        Object obj;
        h06Var.getClass();
        if (h06Var.equals(this.Y)) {
            return this;
        }
        hv4 hv4Var = this.R;
        hv4Var.getClass();
        ka3 ka3Var = this.Z;
        ka3Var.getClass();
        vv4 vv4Var = new vv4(hv4Var, ka3Var, h06Var);
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
            if (((kv4) obj) != null) {
                return vv4Var;
            }
            c44.t(h06Var.b(), " should have @ProtoNumber annotation", "Implementation of oneOf type ");
            return null;
        }
        c44.j("Implementation of oneOf type ", h06Var.b(), " should contain only 1 element, but get ", h06Var.d());
        return null;
    }

    @Override // defpackage.vv4
    public final void s0(long j, String str) {
        str.getClass();
        if (j != 19501) {
            super.s0(j, str);
        }
    }

    @Override // defpackage.vv4
    public final long u0(h06 h06Var, int i) {
        h06Var.getClass();
        if (i != 0) {
            if (i == 1) {
                return gk2.H(h06Var, i);
            }
            StringBuilder s = wh1.s("Unsupported index: ", i, " in a oneOf type ");
            s.append(h06Var.b());
            s.append(", which should be using generic polymorphic serializer");
            throw new IllegalArgumentException(s.toString());
        }
        return 19501L;
    }

    @Override // defpackage.vv4, defpackage.mz1
    public final mz1 x(h06 h06Var) {
        h06Var.getClass();
        int i = this.A;
        if (i >= 0) {
            this.A = i - 1;
            n0((((long[]) this.B)[i] & 1152921500311879680L) | ((int) (gk2.H(h06Var, 0) & 2147483647L)));
            return this;
        }
        throw new IllegalArgumentException("No tag in stack for requested element");
    }
}
