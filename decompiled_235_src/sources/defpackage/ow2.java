package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: ow2  reason: default package */
/* loaded from: classes.dex */
public final class ow2 {
    public static final b Companion = new Object();
    public static final go3[] b = {kj2.M(xr3.PUBLICATION, new ns1(11))};
    public final Map a;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @di1
    /* renamed from: ow2$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements qr2 {
        public static final a a;
        private static final wb6 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [qr2, ow2$a, java.lang.Object] */
        static {
            ?? obj = new Object();
            a = obj;
            ly4 ly4Var = new ly4("me.magnum.rcheevosapi.dto.HashLibraryDto", obj, 1);
            ly4Var.l("MD5List", false);
            descriptor = ly4Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qr2
        public final gg3[] b() {
            return new gg3[]{ow2.b[0].getValue()};
        }

        @Override // defpackage.gg3
        public final Object c(sc1 sc1Var) {
            wb6 wb6Var = descriptor;
            ux0 c = sc1Var.c(wb6Var);
            go3[] go3VarArr = ow2.b;
            c.getClass();
            Map map = null;
            boolean z = true;
            int i = 0;
            while (z) {
                int q = c.q(wb6Var);
                if (q != -1) {
                    if (q == 0) {
                        map = (Map) c.G(wb6Var, 0, (gg3) go3VarArr[0].getValue(), map);
                        i = 1;
                    } else {
                        throw new lg7(q);
                    }
                } else {
                    z = false;
                }
            }
            c.a(wb6Var);
            return new ow2(i, map);
        }

        @Override // defpackage.gg3
        public final void d(x32 x32Var, Object obj) {
            ow2 ow2Var = (ow2) obj;
            ow2Var.getClass();
            wb6 wb6Var = descriptor;
            vx0 c = x32Var.c(wb6Var);
            c.w(wb6Var, 0, (gg3) ow2.b[0].getValue(), ow2Var.a);
            c.a(wb6Var);
        }

        @Override // defpackage.gg3
        public final wb6 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: ow2$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final gg3 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ ow2(int i, Map map) {
        if (1 == (i & 1)) {
            this.a = map;
        } else {
            ii2.S(i, 1, a.a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ow2) && nb3.k(this.a, ((ow2) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HashLibraryDto(md5List=" + this.a + ")";
    }
}
