package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oe6  reason: default package */
/* loaded from: classes.dex */
public final class oe6 extends t0 implements Iterator, f93 {
    public final /* synthetic */ int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oe6(za6 za6Var, Iterator it, int i) {
        super(za6Var, it);
        this.Z = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.Z) {
            case 0:
                a();
                if (((Map.Entry) this.X) != null) {
                    return new ne6(this);
                }
                f81.o();
                return null;
            case 1:
                Map.Entry entry = (Map.Entry) this.Y;
                if (entry != null) {
                    a();
                    return entry.getKey();
                }
                f81.o();
                return null;
            default:
                Map.Entry entry2 = (Map.Entry) this.Y;
                if (entry2 != null) {
                    a();
                    return entry2.getValue();
                }
                f81.o();
                return null;
        }
    }
}
