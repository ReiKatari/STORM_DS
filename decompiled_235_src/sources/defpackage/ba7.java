package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ba7  reason: default package */
/* loaded from: classes.dex */
public final class ba7 implements aa7 {
    public final Object a;
    public final Object b;

    public ba7(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.aa7
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.aa7
    public final Object c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aa7) {
            aa7 aa7Var = (aa7) obj;
            if (nb3.k(this.a, aa7Var.a()) && nb3.k(this.b, aa7Var.c())) {
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
