package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z01  reason: default package */
/* loaded from: classes.dex */
public final class z01 implements h06 {
    public final j06 a;
    public final qo0 b;
    public final String c;

    public z01(j06 j06Var, qo0 qo0Var) {
        qo0Var.getClass();
        this.a = j06Var;
        this.b = qo0Var;
        this.c = j06Var.a + '<' + qo0Var.c() + '>';
    }

    @Override // defpackage.h06
    public final int a(String str) {
        str.getClass();
        return this.a.a(str);
    }

    @Override // defpackage.h06
    public final String b() {
        return this.c;
    }

    @Override // defpackage.h06
    public final ep2 c() {
        return this.a.b;
    }

    @Override // defpackage.h06
    public final int d() {
        return this.a.c;
    }

    @Override // defpackage.h06
    public final String e(int i) {
        return this.a.f[i];
    }

    public final boolean equals(Object obj) {
        z01 z01Var;
        if (obj instanceof z01) {
            z01Var = (z01) obj;
        } else {
            z01Var = null;
        }
        if (z01Var != null && this.a.equals(z01Var.a) && b53.x(z01Var.b, this.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.h06
    public final boolean f() {
        return false;
    }

    @Override // defpackage.h06
    public final List getAnnotations() {
        return this.a.d;
    }

    @Override // defpackage.h06
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.h06
    public final List i(int i) {
        return this.a.h[i];
    }

    @Override // defpackage.h06
    public final h06 j(int i) {
        return this.a.g[i];
    }

    @Override // defpackage.h06
    public final boolean k(int i) {
        return this.a.i[i];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}
