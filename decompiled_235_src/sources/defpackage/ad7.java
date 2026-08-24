package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ad7  reason: default package */
/* loaded from: classes.dex */
public class ad7 extends yc7 {
    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        return new AtomicBoolean(hf3Var.U());
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        vf3Var.e0(((AtomicBoolean) obj).get());
    }
}
