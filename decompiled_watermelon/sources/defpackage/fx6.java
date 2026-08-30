package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fx6  reason: default package */
/* loaded from: classes.dex */
public final class fx6 implements ex6 {
    public final Object a;
    public final Object b;

    public fx6(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.ex6
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.ex6
    public final Object c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ex6) {
            ex6 ex6Var = (ex6) obj;
            if (b53.x(this.a, ex6Var.a()) && b53.x(this.b, ex6Var.c())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        Object obj = this.a;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i3 + i2;
    }
}
