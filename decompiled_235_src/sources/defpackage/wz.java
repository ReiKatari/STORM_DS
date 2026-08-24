package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@cc6
/* renamed from: wz  reason: default package */
/* loaded from: classes.dex */
public final class wz {
    public static final b Companion = new Object();
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @di1
    /* renamed from: wz$a */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class a implements qr2 {
        public static final a a;
        private static final wb6 descriptor;

        /* JADX WARN: Type inference failed for: r0v0, types: [qr2, wz$a, java.lang.Object] */
        static {
            ?? obj = new Object();
            a = obj;
            ly4 ly4Var = new ly4("me.magnum.rcheevosapi.dto.AwardAchievementResponseDto", obj, 5);
            ly4Var.l("Success", false);
            ly4Var.l("AchievementsRemaining", false);
            ly4Var.l("Score", false);
            ly4Var.l("SoftcoreScore", false);
            ly4Var.l("AchievementID", false);
            descriptor = ly4Var;
        }

        @Override // defpackage.qr2
        public final gg3[] b() {
            o93 o93Var = o93.a;
            return new gg3[]{u50.a, o93Var, o93Var, o93Var, o93Var};
        }

        @Override // defpackage.gg3
        public final Object c(sc1 sc1Var) {
            wb6 wb6Var = descriptor;
            ux0 c = sc1Var.c(wb6Var);
            c.getClass();
            boolean z = true;
            int i = 0;
            boolean z2 = false;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (z) {
                int q = c.q(wb6Var);
                if (q != -1) {
                    if (q != 0) {
                        if (q != 1) {
                            if (q != 2) {
                                if (q != 3) {
                                    if (q == 4) {
                                        i5 = c.H(wb6Var, 4);
                                        i |= 16;
                                    } else {
                                        throw new lg7(q);
                                    }
                                } else {
                                    i4 = c.H(wb6Var, 3);
                                    i |= 8;
                                }
                            } else {
                                i3 = c.H(wb6Var, 2);
                                i |= 4;
                            }
                        } else {
                            i2 = c.H(wb6Var, 1);
                            i |= 2;
                        }
                    } else {
                        z2 = c.W(wb6Var, 0);
                        i |= 1;
                    }
                } else {
                    z = false;
                }
            }
            c.a(wb6Var);
            return new wz(i, z2, i2, i3, i4, i5);
        }

        @Override // defpackage.gg3
        public final void d(x32 x32Var, Object obj) {
            wz wzVar = (wz) obj;
            wzVar.getClass();
            wb6 wb6Var = descriptor;
            vx0 c = x32Var.c(wb6Var);
            c.u(wb6Var, 0, wzVar.a);
            c.O(1, wzVar.b, wb6Var);
            c.O(2, wzVar.c, wb6Var);
            c.O(3, wzVar.d, wb6Var);
            c.O(4, wzVar.e, wb6Var);
            c.a(wb6Var);
        }

        @Override // defpackage.gg3
        public final wb6 e() {
            return descriptor;
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: wz$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final gg3 serializer() {
            return a.a;
        }
    }

    public /* synthetic */ wz(int i, boolean z, int i2, int i3, int i4, int i5) {
        if (31 == (i & 31)) {
            this.a = z;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            return;
        }
        ii2.S(i, 31, a.a.e());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz)) {
            return false;
        }
        wz wzVar = (wz) obj;
        if (this.a == wzVar.a && this.b == wzVar.b && this.c == wzVar.c && this.d == wzVar.d && this.e == wzVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + lb1.a(this.d, lb1.a(this.c, lb1.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwardAchievementResponseDto(success=");
        sb.append(this.a);
        sb.append(", achievementsRemaining=");
        sb.append(this.b);
        sb.append(", score=");
        lb1.x(sb, this.c, ", softcoreScore=", this.d, ", achievementId=");
        return lb1.o(sb, this.e, ")");
    }
}
