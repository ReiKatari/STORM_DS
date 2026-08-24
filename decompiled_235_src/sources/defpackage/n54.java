package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n54  reason: default package */
/* loaded from: classes.dex */
public final class n54 implements f92 {
    public final g71 a;
    public final g71 b;

    public n54(g71 g71Var, g71 g71Var2) {
        this.a = g71Var;
        this.b = g71Var2;
    }

    @Override // defpackage.n55
    public final Object get() {
        return new m54((Context) this.a.b, (bt) this.b.get());
    }
}
