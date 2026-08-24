package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dm4  reason: default package */
/* loaded from: classes.dex */
public final class dm4 extends c55 {
    public final s35 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm4(o45 o45Var, s35 s35Var, wb6 wb6Var) {
        super(o45Var, s35Var, wb6Var);
        o45Var.getClass();
        s35Var.getClass();
        wb6Var.getClass();
        this.Z = s35Var;
        if (wb6Var.e() instanceof dz4) {
            return;
        }
        e41.s("The serializer of one of type ", wb6Var.a(), " should be using generic polymorphic serializer, but got ", wb6Var.e(), 46);
        throw null;
    }

    @Override // defpackage.c55, defpackage.x32
    public final vx0 c(wb6 wb6Var) {
        Object obj;
        wb6Var.getClass();
        if (wb6Var.equals(this.Y)) {
            return this;
        }
        o45 o45Var = this.R;
        o45Var.getClass();
        s35 s35Var = this.Z;
        s35Var.getClass();
        c55 c55Var = new c55(o45Var, s35Var, wb6Var);
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
            if (((r45) obj) != null) {
                return c55Var;
            }
            u34.A(wb6Var.a(), " should have @ProtoNumber annotation", "Implementation of oneOf type ");
            return null;
        }
        u34.k("Implementation of oneOf type ", wb6Var.a(), " should contain only 1 element, but get ", wb6Var.f());
        return null;
    }

    @Override // defpackage.c55, defpackage.x32
    public final x32 s(wb6 wb6Var) {
        wb6Var.getClass();
        int i = this.A;
        if (i >= 0) {
            this.A = i - 1;
            n0((((long[]) this.B)[i] & 1152921500311879680L) | ((int) (mp2.t(wb6Var, 0) & 2147483647L)));
            return this;
        }
        throw new IllegalArgumentException("No tag in stack for requested element");
    }

    @Override // defpackage.c55
    public final void s0(long j, String str) {
        str.getClass();
        if (j != 19501) {
            super.s0(j, str);
        }
    }

    @Override // defpackage.c55
    public final long u0(wb6 wb6Var, int i) {
        wb6Var.getClass();
        if (i != 0) {
            if (i == 1) {
                return mp2.t(wb6Var, i);
            }
            StringBuilder t = xg6.t("Unsupported index: ", i, " in a oneOf type ");
            t.append(wb6Var.a());
            t.append(", which should be using generic polymorphic serializer");
            throw new IllegalArgumentException(t.toString());
        }
        return 19501L;
    }
}
