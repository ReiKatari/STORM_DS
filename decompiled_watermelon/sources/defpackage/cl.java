package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cl  reason: default package */
/* loaded from: classes.dex */
public final class cl extends k11 {
    public Iterator R;
    public q15 X;
    public int Y;
    public int Z;
    public /* synthetic */ Object c0;
    public final /* synthetic */ dl d0;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(dl dlVar, k11 k11Var) {
        super(k11Var);
        this.d0 = dlVar;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        this.c0 = obj;
        this.e0 |= Integer.MIN_VALUE;
        Object E = this.d0.E(this);
        if (E == p31.COROUTINE_SUSPENDED) {
            return E;
        }
        return new nc5(E);
    }
}
