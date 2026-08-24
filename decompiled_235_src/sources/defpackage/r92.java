package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r92  reason: default package */
/* loaded from: classes.dex */
public final class r92 extends s36 {
    public final HashMap X = new HashMap();

    @Override // defpackage.s36
    public final p36 a(Object obj) {
        return (p36) this.X.get(obj);
    }

    @Override // defpackage.s36
    public final Object b(Object obj) {
        Object b = super.b(obj);
        this.X.remove(obj);
        return b;
    }
}
