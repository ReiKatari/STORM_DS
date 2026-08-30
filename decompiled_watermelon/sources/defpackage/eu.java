package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: eu  reason: default package */
/* loaded from: classes.dex */
public final class eu extends m66 implements Map {
    public wo3 R;
    public bu X;
    public du Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu(m66 m66Var) {
        super(0);
        int i = m66Var.L;
        b(this.L + i);
        if (this.L == 0) {
            if (i > 0) {
                nu.d0(0, 0, i, m66Var.A, this.A);
                nu.f0(m66Var.B, this.B, 0, 0, i << 1);
                this.L = i;
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            put(m66Var.f(i2), m66Var.i(i2));
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        wo3 wo3Var = this.R;
        if (wo3Var == null) {
            wo3 wo3Var2 = new wo3(2, this);
            this.R = wo3Var2;
            return wo3Var2;
        }
        return wo3Var;
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
        bu buVar = this.X;
        if (buVar == null) {
            bu buVar2 = new bu(this);
            this.X = buVar2;
            return buVar2;
        }
        return buVar;
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
        du duVar = this.Y;
        if (duVar == null) {
            du duVar2 = new du(this);
            this.Y = duVar2;
            return duVar2;
        }
        return duVar;
    }
}
