package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nm6  reason: default package */
/* loaded from: classes.dex */
public final class nm6 implements b06, jl1 {
    public final b06 a;

    public nm6(b06 b06Var) {
        this.a = b06Var;
    }

    @Override // defpackage.jl1
    public final b06 a(int i) {
        if (i >= 50) {
            return tp1.a;
        }
        return new sh6(this.a, i, 50);
    }

    @Override // defpackage.b06
    public final Iterator iterator() {
        return new hl1(this);
    }

    @Override // defpackage.jl1
    public final b06 take() {
        return this;
    }
}
