package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vt4  reason: default package */
/* loaded from: classes.dex */
public final class vt4 implements h06 {
    public final String a;
    public final tt4 b;

    public vt4(String str, tt4 tt4Var) {
        tt4Var.getClass();
        this.a = str;
        this.b = tt4Var;
    }

    @Override // defpackage.h06
    public final int a(String str) {
        str.getClass();
        g();
        throw null;
    }

    @Override // defpackage.h06
    public final String b() {
        return this.a;
    }

    @Override // defpackage.h06
    public final ep2 c() {
        return this.b;
    }

    @Override // defpackage.h06
    public final int d() {
        return 0;
    }

    @Override // defpackage.h06
    public final String e(int i) {
        g();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vt4) {
                vt4 vt4Var = (vt4) obj;
                if (this.a.equals(vt4Var.a) && b53.x(this.b, vt4Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void g() {
        throw new IllegalStateException(b31.q(new StringBuilder("Primitive descriptor "), this.a, " does not have elements"));
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.h06
    public final List i(int i) {
        g();
        throw null;
    }

    @Override // defpackage.h06
    public final h06 j(int i) {
        g();
        throw null;
    }

    @Override // defpackage.h06
    public final boolean k(int i) {
        g();
        throw null;
    }

    public final String toString() {
        return wh1.o(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
