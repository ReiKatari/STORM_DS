package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yu0  reason: default package */
/* loaded from: classes.dex */
public final class yu0 {
    public final Object a;
    public final lj0 b;
    public final fo2 c;
    public final Object d;
    public final Throwable e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ yu0(Object obj, lj0 lj0Var, fo2 fo2Var, Throwable th, int i) {
        this(obj, lj0Var, fo2Var, (Object) null, r7);
        Throwable th2;
        lj0Var = (i & 2) != 0 ? null : lj0Var;
        fo2Var = (i & 4) != 0 ? null : fo2Var;
        if ((i & 16) != 0) {
            th2 = null;
        } else {
            th2 = th;
        }
    }

    public static yu0 a(yu0 yu0Var, lj0 lj0Var, Throwable th, int i) {
        Object obj = yu0Var.a;
        if ((i & 2) != 0) {
            lj0Var = yu0Var.b;
        }
        lj0 lj0Var2 = lj0Var;
        fo2 fo2Var = yu0Var.c;
        Object obj2 = yu0Var.d;
        if ((i & 16) != 0) {
            th = yu0Var.e;
        }
        return new yu0(obj, lj0Var2, fo2Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu0)) {
            return false;
        }
        yu0 yu0Var = (yu0) obj;
        if (nb3.k(this.a, yu0Var.a) && nb3.k(this.b, yu0Var.b) && nb3.k(this.c, yu0Var.c) && nb3.k(this.d, yu0Var.d) && nb3.k(this.e, yu0Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        lj0 lj0Var = this.b;
        if (lj0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = lj0Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        fo2 fo2Var = this.c;
        if (fo2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = fo2Var.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Object obj2 = this.d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Throwable th = this.e;
        if (th != null) {
            i = th.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public yu0(Object obj, lj0 lj0Var, fo2 fo2Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = lj0Var;
        this.c = fo2Var;
        this.d = obj2;
        this.e = th;
    }
}
