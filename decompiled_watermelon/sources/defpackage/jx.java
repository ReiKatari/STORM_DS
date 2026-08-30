package defpackage;

import android.util.Range;
import android.util.Size;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jx  reason: default package */
/* loaded from: classes.dex */
public final class jx {
    public static final Range h = new Range(0, 0);
    public final Size a;
    public final Size b;
    public final sm1 c;
    public final int d;
    public final Range e;
    public final cw0 f;
    public final boolean g;

    public jx(Size size, Size size2, sm1 sm1Var, int i, Range range, cw0 cw0Var, boolean z) {
        this.a = size;
        this.b = size2;
        this.c = sm1Var;
        this.d = i;
        this.e = range;
        this.f = cw0Var;
        this.g = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cw6, java.lang.Object] */
    public static cw6 a(Size size) {
        ?? obj = new Object();
        if (size != null) {
            obj.a = size;
            obj.b = size;
            obj.d = 0;
            Range range = h;
            if (range != null) {
                obj.e = range;
                obj.c = sm1.d;
                obj.g = Boolean.FALSE;
                return obj;
            }
            c44.i("Null expectedFrameRateRange");
            return null;
        }
        c44.i("Null resolution");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cw6, java.lang.Object] */
    public final cw6 b() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = Integer.valueOf(this.d);
        obj.e = this.e;
        obj.f = this.f;
        obj.g = Boolean.valueOf(this.g);
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jx) {
            jx jxVar = (jx) obj;
            if (this.a.equals(jxVar.a) && this.b.equals(jxVar.b) && this.c.equals(jxVar.c) && this.d == jxVar.d && this.e.equals(jxVar.e)) {
                cw0 cw0Var = jxVar.f;
                cw0 cw0Var2 = this.f;
                if (cw0Var2 != null ? cw0Var2.equals(cw0Var) : cw0Var == null) {
                    if (this.g == jxVar.g) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        cw0 cw0Var = this.f;
        if (cw0Var == null) {
            hashCode = 0;
        } else {
            hashCode = cw0Var.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        if (this.g) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i ^ i2;
    }

    public final String toString() {
        return "StreamSpec{resolution=" + this.a + ", originalConfiguredResolution=" + this.b + ", dynamicRange=" + this.c + ", sessionType=" + this.d + ", expectedFrameRateRange=" + this.e + ", implementationOptions=" + this.f + ", zslDisabled=" + this.g + "}";
    }
}
