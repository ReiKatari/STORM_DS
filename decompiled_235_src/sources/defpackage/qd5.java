package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: qd5  reason: default package */
/* loaded from: classes.dex */
public final class qd5 {
    public static final b Companion = new Object();
    public final int a;
    public final int b;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @di1
    /* renamed from: qd5$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements qr2 {
        public static final a a;
        private static final wb6 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [qr2, qd5$a, java.lang.Object] */
        static {
            ?? obj = new Object();
            a = obj;
            ly4 ly4Var = new ly4("me.magnum.rcheevosapi.dto.RankInfoDto", obj, 2);
            ly4Var.l("NumEntries", false);
            ly4Var.l("Rank", false);
            descriptor = ly4Var;
        }

        @Override // defpackage.qr2
        public final gg3[] b() {
            o93 o93Var = o93.a;
            return new gg3[]{o93Var, o93Var};
        }

        @Override // defpackage.gg3
        public final Object c(sc1 sc1Var) {
            wb6 wb6Var = descriptor;
            ux0 c = sc1Var.c(wb6Var);
            c.getClass();
            boolean z = true;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (z) {
                int q = c.q(wb6Var);
                if (q != -1) {
                    if (q != 0) {
                        if (q == 1) {
                            i3 = c.H(wb6Var, 1);
                            i |= 2;
                        } else {
                            throw new lg7(q);
                        }
                    } else {
                        i2 = c.H(wb6Var, 0);
                        i |= 1;
                    }
                } else {
                    z = false;
                }
            }
            c.a(wb6Var);
            return new qd5(i, i2, i3);
        }

        @Override // defpackage.gg3
        public final void d(x32 x32Var, Object obj) {
            qd5 qd5Var = (qd5) obj;
            qd5Var.getClass();
            wb6 wb6Var = descriptor;
            vx0 c = x32Var.c(wb6Var);
            c.O(0, qd5Var.a, wb6Var);
            c.O(1, qd5Var.b, wb6Var);
            c.a(wb6Var);
        }

        @Override // defpackage.gg3
        public final wb6 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: qd5$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final gg3 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ qd5(int i, int i2, int i3) {
        if (3 == (i & 3)) {
            this.a = i2;
            this.b = i3;
            return;
        }
        ii2.S(i, 3, a.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd5)) {
            return false;
        }
        qd5 qd5Var = (qd5) obj;
        if (this.a == qd5Var.a && this.b == qd5Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xg6.m(this.a, this.b, "RankInfoDto(numEntries=", ", rank=", ")");
    }
}
