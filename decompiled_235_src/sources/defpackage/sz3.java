package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sz3  reason: default package */
/* loaded from: classes.dex */
public interface sz3 {
    jk3 b(jk3 jk3Var);

    default long c(jk3 jk3Var, jk3 jk3Var2) {
        jk3 b = b(jk3Var);
        jk3 b2 = b(jk3Var2);
        if (b instanceof nz3) {
            return ((nz3) b).R(b2, 0L, true);
        }
        if (b2 instanceof nz3) {
            return ((nz3) b2).R(b, 0L, true) ^ (-9223372034707292160L);
        }
        return b.R(b, 0L, true);
    }
}
