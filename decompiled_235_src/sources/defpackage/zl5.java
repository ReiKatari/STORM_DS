package defpackage;

import defpackage.qd5;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: zl5  reason: default package */
/* loaded from: classes.dex */
public final class zl5 {
    public static final b Companion = new Object();
    public final qd5 a;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @di1
    /* renamed from: zl5$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements qr2 {
        public static final a a;
        private static final wb6 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [qr2, zl5$a, java.lang.Object] */
        static {
            ?? obj = new Object();
            a = obj;
            ly4 ly4Var = new ly4("me.magnum.rcheevosapi.dto.ResponseDto", obj, 1);
            ly4Var.l("RankInfo", false);
            descriptor = ly4Var;
        }

        @Override // defpackage.qr2
        public final gg3[] b() {
            return new gg3[]{qd5.a.a};
        }

        @Override // defpackage.gg3
        public final Object c(sc1 sc1Var) {
            wb6 wb6Var = descriptor;
            ux0 c = sc1Var.c(wb6Var);
            c.getClass();
            qd5 qd5Var = null;
            boolean z = true;
            int i = 0;
            while (z) {
                int q = c.q(wb6Var);
                if (q != -1) {
                    if (q == 0) {
                        qd5Var = (qd5) c.G(wb6Var, 0, qd5.a.a, qd5Var);
                        i = 1;
                    } else {
                        throw new lg7(q);
                    }
                } else {
                    z = false;
                }
            }
            c.a(wb6Var);
            return new zl5(i, qd5Var);
        }

        @Override // defpackage.gg3
        public final void d(x32 x32Var, Object obj) {
            zl5 zl5Var = (zl5) obj;
            zl5Var.getClass();
            wb6 wb6Var = descriptor;
            vx0 c = x32Var.c(wb6Var);
            c.w(wb6Var, 0, qd5.a.a, zl5Var.a);
            c.a(wb6Var);
        }

        @Override // defpackage.gg3
        public final wb6 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: zl5$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final gg3 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ zl5(int i, qd5 qd5Var) {
        if (1 == (i & 1)) {
            this.a = qd5Var;
        } else {
            ii2.S(i, 1, a.a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zl5) && nb3.k(this.a, ((zl5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ResponseDto(rankInfo=" + this.a + ")";
    }
}
