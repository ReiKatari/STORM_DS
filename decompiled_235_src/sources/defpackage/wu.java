package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wu  reason: default package */
/* loaded from: classes.dex */
public final class wu extends ci6 implements Map {
    public yv3 R;
    public tu X;
    public vu Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu(ci6 ci6Var) {
        super(0);
        int i = ci6Var.L;
        b(this.L + i);
        if (this.L == 0) {
            if (i > 0) {
                fv.r0(0, 0, i, ci6Var.A, this.A);
                fv.t0(ci6Var.B, this.B, 0, 0, i << 1);
                this.L = i;
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            put(ci6Var.f(i2), ci6Var.i(i2));
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        yv3 yv3Var = this.R;
        if (yv3Var == null) {
            yv3 yv3Var2 = new yv3(2, this);
            this.R = yv3Var2;
            return yv3Var2;
        }
        return yv3Var;
    }

    public final boolean j(Collection collection) {
        for (Object obj : collection) {
            if (!super.containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.L;
        for (Object obj : collection) {
            super.remove(obj);
        }
        if (i != this.L) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        tu tuVar = this.X;
        if (tuVar == null) {
            tu tuVar2 = new tu(this);
            this.X = tuVar2;
            return tuVar2;
        }
        return tuVar;
    }

    public final boolean l(Collection collection) {
        int i = this.L;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(f(i2))) {
                g(i2);
            }
        }
        if (i != this.L) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.L);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        vu vuVar = this.Y;
        if (vuVar == null) {
            vu vuVar2 = new vu(this);
            this.Y = vuVar2;
            return vuVar2;
        }
        return vuVar;
    }
}
