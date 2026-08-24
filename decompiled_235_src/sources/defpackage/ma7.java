package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ma7  reason: default package */
/* loaded from: classes.dex */
public final class ma7 extends la7 {
    public final /* synthetic */ wu a;
    public final /* synthetic */ na7 b;

    public ma7(na7 na7Var, wu wuVar) {
        this.b = na7Var;
        this.a = wuVar;
    }

    @Override // defpackage.la7, defpackage.da7
    public final void a(ea7 ea7Var) {
        ((ArrayList) this.a.get(this.b.B)).remove(ea7Var);
        ea7Var.D(this);
    }
}
