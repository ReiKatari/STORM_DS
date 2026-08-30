package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ne6  reason: default package */
/* loaded from: classes.dex */
public final class ne6 implements Map.Entry, h93 {
    public final Object A;
    public Object B;
    public final /* synthetic */ oe6 L;

    public ne6(oe6 oe6Var) {
        this.L = oe6Var;
        Map.Entry entry = (Map.Entry) oe6Var.X;
        entry.getClass();
        this.A = entry.getKey();
        Map.Entry entry2 = (Map.Entry) oe6Var.X;
        entry2.getClass();
        this.B = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.A;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.B;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        oe6 oe6Var = this.L;
        za6 za6Var = (za6) oe6Var.L;
        if (za6Var.e().d == oe6Var.B) {
            Object obj2 = this.B;
            za6Var.put(this.A, obj);
            this.B = obj;
            return obj2;
        }
        throw new ConcurrentModificationException();
    }
}
