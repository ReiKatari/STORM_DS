package defpackage;

import java.util.Currency;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rd7  reason: default package */
/* loaded from: classes.dex */
public class rd7 extends yc7 {
    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        String l0 = hf3Var.l0();
        try {
            return Currency.getInstance(l0);
        } catch (IllegalArgumentException e) {
            StringBuilder t = i61.t("Failed parsing '", l0, "' as Currency; at path ");
            t.append(hf3Var.D());
            throw new RuntimeException(t.toString(), e);
        }
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        vf3Var.c0(((Currency) obj).getCurrencyCode());
    }
}
