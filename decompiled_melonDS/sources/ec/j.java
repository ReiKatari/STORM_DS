package ec;

import nc.u;
import nc.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class j extends c implements nc.h {
    public final int R;

    public j(int i2, cc.c cVar) {
        super(cVar);
        this.R = i2;
    }

    @Override // nc.h
    public final int c() {
        return this.R;
    }

    @Override // ec.a
    public final String toString() {
        if (this.A == null) {
            u.f10262a.getClass();
            return v.a(this);
        }
        return super.toString();
    }
}
