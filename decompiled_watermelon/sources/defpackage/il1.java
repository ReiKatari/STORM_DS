package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: il1  reason: default package */
/* loaded from: classes.dex */
public final class il1 implements b06, jl1 {
    public final b06 a;
    public final int b;

    public il1(b06 b06Var, int i) {
        b06Var.getClass();
        this.a = b06Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        i.g(ej6.e("count must be non-negative, but was ", i, '.'));
        throw null;
    }

    @Override // defpackage.jl1
    public final b06 a(int i) {
        int i2 = this.b + i;
        if (i2 < 0) {
            return new il1(this, i);
        }
        return new il1(this.a, i2);
    }

    @Override // defpackage.b06
    public final Iterator iterator() {
        return new hl1(this);
    }

    @Override // defpackage.jl1
    public final b06 take() {
        int i = this.b;
        int i2 = i + 50;
        if (i2 < 0) {
            return new nm6(this);
        }
        return new sh6(this.a, i, i2);
    }
}
