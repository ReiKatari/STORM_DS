package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xb6  reason: default package */
/* loaded from: classes.dex */
public final class xb6 implements wb6, ya0 {
    public final wb6 a;
    public final String b;
    public final Set c;

    public xb6(wb6 wb6Var) {
        wb6Var.getClass();
        this.a = wb6Var;
        this.b = wb6Var.a() + '?';
        this.c = q60.k(wb6Var);
    }

    @Override // defpackage.wb6
    public final String a() {
        return this.b;
    }

    @Override // defpackage.ya0
    public final Set b() {
        return this.c;
    }

    @Override // defpackage.wb6
    public final boolean c() {
        return true;
    }

    @Override // defpackage.wb6
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // defpackage.wb6
    public final np2 e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb6)) {
            return false;
        }
        if (nb3.k(this.a, ((xb6) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.wb6
    public final int f() {
        return this.a.f();
    }

    @Override // defpackage.wb6
    public final String g(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.wb6
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.wb6
    public final boolean h() {
        return this.a.h();
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.wb6
    public final List i(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.wb6
    public final wb6 j(int i) {
        return this.a.j(i);
    }

    @Override // defpackage.wb6
    public final boolean k(int i) {
        return this.a.k(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
