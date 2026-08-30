package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sh6  reason: default package */
/* loaded from: classes.dex */
public final class sh6 implements b06, jl1 {
    public final b06 a;
    public final int b;
    public final int c;

    public sh6(b06 b06Var, int i, int i2) {
        b06Var.getClass();
        this.a = b06Var;
        this.b = i;
        this.c = i2;
        if (i >= 0) {
            if (i2 >= 0) {
                if (i2 >= i) {
                    return;
                }
                i.g(wh1.f(i2, i, "endIndex should be not less than startIndex, but was ", " < "));
                throw null;
            }
            i.g(wh1.g(i2, "endIndex should be non-negative, but is "));
            throw null;
        }
        i.g(wh1.g(i, "startIndex should be non-negative, but is "));
        throw null;
    }

    @Override // defpackage.jl1
    public final b06 a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        if (i >= i2 - i3) {
            return tp1.a;
        }
        return new sh6(this.a, i3 + i, i2);
    }

    @Override // defpackage.b06
    public final Iterator iterator() {
        return new ll2(this);
    }

    @Override // defpackage.jl1
    public final b06 take() {
        int i = this.c;
        int i2 = this.b;
        if (50 >= i - i2) {
            return this;
        }
        return new sh6(this.a, i2, i2 + 50);
    }
}
