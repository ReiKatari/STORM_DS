package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zd7  reason: default package */
/* loaded from: classes.dex */
public class zd7 extends yc7 {
    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        if (hf3Var.n0() == jf3.NULL) {
            hf3Var.j0();
            return null;
        }
        try {
            int Z = hf3Var.Z();
            if (Z <= 255 && Z >= -128) {
                return Byte.valueOf((byte) Z);
            }
            StringBuilder t = xg6.t("Lossy conversion from ", Z, " to byte; at path ");
            t.append(hf3Var.D());
            throw new RuntimeException(t.toString());
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            vf3Var.A();
        } else {
            vf3Var.X(number.byteValue());
        }
    }
}
