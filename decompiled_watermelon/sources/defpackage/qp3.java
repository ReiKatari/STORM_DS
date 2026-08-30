package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qp3  reason: default package */
/* loaded from: classes.dex */
public abstract class qp3 implements h06 {
    public final h06 a;

    public qp3(h06 h06Var) {
        this.a = h06Var;
    }

    @Override // defpackage.h06
    public final int a(String str) {
        str.getClass();
        Integer o0 = gh6.o0(str);
        if (o0 != null) {
            return o0.intValue();
        }
        i.i(str.concat(" is not a valid list index"));
        return 0;
    }

    @Override // defpackage.h06
    public final ep2 c() {
        return kh6.i;
    }

    @Override // defpackage.h06
    public final int d() {
        return 1;
    }

    @Override // defpackage.h06
    public final String e(int i) {
        return String.valueOf(i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qp3) {
                qp3 qp3Var = (qp3) obj;
                if (b53.x(this.a, qp3Var.a) && b53.x(b(), qp3Var.b())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return b().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.h06
    public final List i(int i) {
        if (i >= 0) {
            return pp1.A;
        }
        f81.n(wh1.s("Illegal index ", i, ", "), b(), " expects only non-negative indices");
        return null;
    }

    @Override // defpackage.h06
    public final h06 j(int i) {
        if (i >= 0) {
            return this.a;
        }
        f81.n(wh1.s("Illegal index ", i, ", "), b(), " expects only non-negative indices");
        return null;
    }

    @Override // defpackage.h06
    public final boolean k(int i) {
        if (i >= 0) {
            return false;
        }
        f81.n(wh1.s("Illegal index ", i, ", "), b(), " expects only non-negative indices");
        return false;
    }

    public final String toString() {
        return b() + '(' + this.a + ')';
    }
}
