package defpackage;

import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qd7  reason: default package */
/* loaded from: classes.dex */
public class qd7 extends yc7 {
    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        if (hf3Var.n0() == jf3.NULL) {
            hf3Var.j0();
            return null;
        }
        String l0 = hf3Var.l0();
        try {
            return UUID.fromString(l0);
        } catch (IllegalArgumentException e) {
            StringBuilder t = i61.t("Failed parsing '", l0, "' as UUID; at path ");
            t.append(hf3Var.D());
            throw new RuntimeException(t.toString(), e);
        }
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        String uuid;
        UUID uuid2 = (UUID) obj;
        if (uuid2 == null) {
            uuid = null;
        } else {
            uuid = uuid2.toString();
        }
        vf3Var.c0(uuid);
    }
}
