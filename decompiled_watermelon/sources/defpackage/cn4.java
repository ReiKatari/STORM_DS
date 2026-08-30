package defpackage;

import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cn4  reason: default package */
/* loaded from: classes.dex */
public final class cn4 extends r1 implements ox2, Collection, f93 {
    public static final cn4 R;
    public final Object A;
    public final Object B;
    public final tm4 L;

    static {
        sn1 sn1Var = sn1.d0;
        R = new cn4(sn1Var, sn1Var, tm4.L);
    }

    public cn4(Object obj, Object obj2, tm4 tm4Var) {
        this.A = obj;
        this.B = obj2;
        this.L = tm4Var;
    }

    @Override // defpackage.k0
    public final int b() {
        return this.L.B;
    }

    @Override // defpackage.k0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.L.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ll2(this.A, this.L);
    }
}
