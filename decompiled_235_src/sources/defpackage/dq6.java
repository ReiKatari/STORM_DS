package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dq6  reason: default package */
/* loaded from: classes.dex */
public final class dq6 extends u0 implements Iterator, zf3 {
    public final /* synthetic */ int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dq6(om6 om6Var, Iterator it, int i) {
        super(om6Var, it);
        this.Z = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.Z) {
            case 0:
                a();
                if (((Map.Entry) this.X) != null) {
                    return new cq6(this);
                }
                e41.m();
                return null;
            case 1:
                Map.Entry entry = (Map.Entry) this.Y;
                if (entry != null) {
                    a();
                    return entry.getKey();
                }
                e41.m();
                return null;
            default:
                Map.Entry entry2 = (Map.Entry) this.Y;
                if (entry2 != null) {
                    a();
                    return entry2.getValue();
                }
                e41.m();
                return null;
        }
    }
}
