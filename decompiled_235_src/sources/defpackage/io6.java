package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: io6  reason: default package */
/* loaded from: classes.dex */
public final class io6 implements rc2 {
    public final float a;
    public final float b;
    public final Object c;

    public io6(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    @Override // defpackage.to
    public final il7 a(wc7 wc7Var) {
        ap apVar;
        Object obj = this.c;
        if (obj == null) {
            apVar = null;
        } else {
            apVar = (ap) wc7Var.a.g(obj);
        }
        return new j97(this.a, this.b, apVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof io6) {
            io6 io6Var = (io6) obj;
            if (io6Var.a == this.a && io6Var.b == this.b && nb3.k(io6Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object obj = this.c;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return Float.hashCode(this.b) + xg6.a(this.a, i * 31, 31);
    }

    public /* synthetic */ io6(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
