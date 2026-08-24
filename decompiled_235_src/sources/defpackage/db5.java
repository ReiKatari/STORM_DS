package defpackage;

import defpackage.zl5;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: db5  reason: default package */
/* loaded from: classes.dex */
public final class db5 {
    public static final b Companion = new Object();
    public final zl5 a;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @di1
    /* renamed from: db5$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements qr2 {
        public static final a a;
        private static final wb6 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [qr2, java.lang.Object, db5$a] */
        static {
            ?? obj = new Object();
            a = obj;
            ly4 ly4Var = new ly4("me.magnum.rcheevosapi.dto.RASubmitLeaderboardEntryResponseDto", obj, 1);
            ly4Var.l("Response", false);
            descriptor = ly4Var;
        }

        @Override // defpackage.qr2
        public final gg3[] b() {
            return new gg3[]{zl5.a.a};
        }

        @Override // defpackage.gg3
        public final Object c(sc1 sc1Var) {
            wb6 wb6Var = descriptor;
            ux0 c = sc1Var.c(wb6Var);
            c.getClass();
            zl5 zl5Var = null;
            boolean z = true;
            int i = 0;
            while (z) {
                int q = c.q(wb6Var);
                if (q != -1) {
                    if (q == 0) {
                        zl5Var = (zl5) c.G(wb6Var, 0, zl5.a.a, zl5Var);
                        i = 1;
                    } else {
                        throw new lg7(q);
                    }
                } else {
                    z = false;
                }
            }
            c.a(wb6Var);
            return new db5(i, zl5Var);
        }

        @Override // defpackage.gg3
        public final void d(x32 x32Var, Object obj) {
            db5 db5Var = (db5) obj;
            db5Var.getClass();
            wb6 wb6Var = descriptor;
            vx0 c = x32Var.c(wb6Var);
            c.w(wb6Var, 0, zl5.a.a, db5Var.a);
            c.a(wb6Var);
        }

        @Override // defpackage.gg3
        public final wb6 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: db5$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final gg3 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ db5(int i, zl5 zl5Var) {
        if (1 == (i & 1)) {
            this.a = zl5Var;
        } else {
            ii2.S(i, 1, a.a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof db5) && nb3.k(this.a, ((db5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "RASubmitLeaderboardEntryResponseDto(response=" + this.a + ")";
    }
}
