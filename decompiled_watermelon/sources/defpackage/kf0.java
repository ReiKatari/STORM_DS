package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kf0  reason: default package */
/* loaded from: classes.dex */
public final class kf0 extends ff0 {
    public final String a;
    public final qp0 b;
    public final Integer c;
    public final mm1 d;
    public final Throwable e;
    public final mm1 f;
    public final mm1 g;
    public final mm1 h;
    public final uc0 i;

    public kf0(String str, qp0 qp0Var, Integer num, mm1 mm1Var, Throwable th, mm1 mm1Var2, mm1 mm1Var3, mm1 mm1Var4, uc0 uc0Var) {
        str.getClass();
        qp0Var.getClass();
        this.a = str;
        this.b = qp0Var;
        this.c = num;
        this.d = mm1Var;
        this.e = th;
        this.f = mm1Var2;
        this.g = mm1Var3;
        this.h = mm1Var4;
        this.i = uc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf0)) {
            return false;
        }
        kf0 kf0Var = (kf0) obj;
        if (b53.x(this.a, kf0Var.a) && this.b == kf0Var.b && b53.x(this.c, kf0Var.c) && b53.x(this.d, kf0Var.d) && b53.x(this.e, kf0Var.e) && b53.x(this.f, kf0Var.f) && b53.x(this.g, kf0Var.g) && b53.x(this.h, kf0Var.h) && b53.x(this.i, kf0Var.i)) {
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
        mm1 mm1Var = this.d;
        if (mm1Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = Long.hashCode(mm1Var.a);
        }
        int i3 = (i2 + hashCode2) * 31;
        Throwable th = this.e;
        if (th == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = th.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        mm1 mm1Var2 = this.f;
        if (mm1Var2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = Long.hashCode(mm1Var2.a);
        }
        int i5 = (i4 + hashCode4) * 31;
        mm1 mm1Var3 = this.g;
        if (mm1Var3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = Long.hashCode(mm1Var3.a);
        }
        int i6 = (i5 + hashCode5) * 31;
        mm1 mm1Var4 = this.h;
        if (mm1Var4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = Long.hashCode(mm1Var4.a);
        }
        int i7 = (i6 + hashCode6) * 31;
        uc0 uc0Var = this.i;
        if (uc0Var != null) {
            i = Integer.hashCode(uc0Var.a);
        }
        return i7 + i;
    }

    public final String toString() {
        return "CameraStateClosed(cameraId=" + ((Object) od0.b(this.a)) + ", cameraClosedReason=" + this.b + ", cameraRetryCount=" + this.c + ", cameraRetryDurationNs=" + this.d + ", cameraException=" + this.e + ", cameraOpenDurationNs=" + this.f + ", cameraActiveDurationNs=" + this.g + ", cameraClosingDurationNs=" + this.h + ", cameraErrorCode=" + this.i + ')';
    }
}
