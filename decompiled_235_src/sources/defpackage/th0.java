package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: th0  reason: default package */
/* loaded from: classes.dex */
public final class th0 extends oh0 {
    public final String a;
    public final ds0 b;
    public final Integer c;
    public final sq1 d;
    public final Throwable e;
    public final sq1 f;
    public final sq1 g;
    public final sq1 h;
    public final df0 i;

    public th0(String str, ds0 ds0Var, Integer num, sq1 sq1Var, Throwable th, sq1 sq1Var2, sq1 sq1Var3, sq1 sq1Var4, df0 df0Var) {
        str.getClass();
        ds0Var.getClass();
        this.a = str;
        this.b = ds0Var;
        this.c = num;
        this.d = sq1Var;
        this.e = th;
        this.f = sq1Var2;
        this.g = sq1Var3;
        this.h = sq1Var4;
        this.i = df0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th0)) {
            return false;
        }
        th0 th0Var = (th0) obj;
        if (nb3.k(this.a, th0Var.a) && this.b == th0Var.b && nb3.k(this.c, th0Var.c) && nb3.k(this.d, th0Var.d) && nb3.k(this.e, th0Var.e) && nb3.k(this.f, th0Var.f) && nb3.k(this.g, th0Var.g) && nb3.k(this.h, th0Var.h) && nb3.k(this.i, th0Var.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = 0;
        Integer num = this.c;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode7 + hashCode) * 31;
        sq1 sq1Var = this.d;
        if (sq1Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = Long.hashCode(sq1Var.a);
        }
        int i3 = (i2 + hashCode2) * 31;
        Throwable th = this.e;
        if (th == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = th.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        sq1 sq1Var2 = this.f;
        if (sq1Var2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = Long.hashCode(sq1Var2.a);
        }
        int i5 = (i4 + hashCode4) * 31;
        sq1 sq1Var3 = this.g;
        if (sq1Var3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = Long.hashCode(sq1Var3.a);
        }
        int i6 = (i5 + hashCode5) * 31;
        sq1 sq1Var4 = this.h;
        if (sq1Var4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = Long.hashCode(sq1Var4.a);
        }
        int i7 = (i6 + hashCode6) * 31;
        df0 df0Var = this.i;
        if (df0Var != null) {
            i = Integer.hashCode(df0Var.a);
        }
        return i7 + i;
    }

    public final String toString() {
        return "CameraStateClosed(cameraId=" + ((Object) xf0.b(this.a)) + ", cameraClosedReason=" + this.b + ", cameraRetryCount=" + this.c + ", cameraRetryDurationNs=" + this.d + ", cameraException=" + this.e + ", cameraOpenDurationNs=" + this.f + ", cameraActiveDurationNs=" + this.g + ", cameraClosingDurationNs=" + this.h + ", cameraErrorCode=" + this.i + ')';
    }
}
