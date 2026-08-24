package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p92  reason: default package */
/* loaded from: classes.dex */
public final class p92 extends lz6 {
    public final /* synthetic */ h26 e;
    public final /* synthetic */ fb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p92(String str, h26 h26Var, fb fbVar) {
        super(str, true);
        this.e = h26Var;
        this.f = fbVar;
    }

    @Override // defpackage.lz6
    public final long a() {
        g26 g26Var;
        h26 h26Var = this.e;
        try {
            g26Var = h26Var.d();
        } catch (Throwable th) {
            g26Var = new g26(h26Var, th, 2);
        }
        fb fbVar = this.f;
        if (((CopyOnWriteArrayList) fbVar.R).contains(h26Var)) {
            ((LinkedBlockingDeque) fbVar.X).put(g26Var);
            return -1L;
        }
        return -1L;
    }
}
