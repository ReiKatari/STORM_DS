package com.squareup.picasso;

import java.util.concurrent.FutureTask;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 extends FutureTask implements Comparable {
    public final e A;

    public c0(e eVar) {
        super(eVar, null);
        this.A = eVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e eVar = this.A;
        z zVar = eVar.f3211l0;
        e eVar2 = ((c0) obj).A;
        z zVar2 = eVar2.f3211l0;
        if (zVar == zVar2) {
            return eVar.A - eVar2.A;
        }
        return zVar2.ordinal() - zVar.ordinal();
    }
}
