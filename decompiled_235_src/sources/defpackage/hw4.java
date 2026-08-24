package defpackage;

import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hw4  reason: default package */
/* loaded from: classes.dex */
public final class hw4 extends s1 implements s33, Collection, zf3 {
    public static final hw4 R;
    public final Object A;
    public final Object B;
    public final yv4 L;

    static {
        d90 d90Var = d90.t0;
        R = new hw4(d90Var, d90Var, yv4.L);
    }

    public hw4(Object obj, Object obj2, yv4 yv4Var) {
        this.A = obj;
        this.B = obj2;
        this.L = yv4Var;
    }

    @Override // defpackage.l0
    public final int a() {
        return this.L.B;
    }

    @Override // defpackage.l0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.L.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new rr2(this.L, this.A);
    }
}
