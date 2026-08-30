package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i06  reason: default package */
/* loaded from: classes.dex */
public final class i06 implements h06, q80 {
    public final h06 a;
    public final String b;
    public final Set c;

    public i06(h06 h06Var) {
        h06Var.getClass();
        this.a = h06Var;
        this.b = h06Var.b() + '?';
        this.c = mh7.o(h06Var);
    }

    @Override // defpackage.h06
    public final int a(String str) {
        str.getClass();
        return this.a.a(str);
    }

    @Override // defpackage.h06
    public final String b() {
        return this.b;
    }

    @Override // defpackage.h06
    public final ep2 c() {
        return this.a.c();
    }

    @Override // defpackage.h06
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.h06
    public final String e(int i) {
        return this.a.e(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i06)) {
            return false;
        }
        if (b53.x(this.a, ((i06) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.h06
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.q80
    public final Set g() {
        return this.c;
    }

    @Override // defpackage.h06
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.h06
    public final boolean h() {
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.h06
    public final List i(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.h06
    public final h06 j(int i) {
        return this.a.j(i);
    }

    @Override // defpackage.h06
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
