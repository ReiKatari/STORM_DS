package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pw  reason: default package */
/* loaded from: classes.dex */
public final class pw {
    public final pj6 a;
    public final int b;
    public final Size c;
    public final sm1 d;
    public final List e;
    public final cw0 f;
    public final int g;
    public final Range h;
    public final boolean i;
    public final int j;

    public pw(pj6 pj6Var, int i, Size size, sm1 sm1Var, List list, cw0 cw0Var, int i2, Range range, boolean z, int i3) {
        this.a = pj6Var;
        this.b = i;
        this.c = size;
        if (sm1Var != null) {
            this.d = sm1Var;
            this.e = list;
            this.f = cw0Var;
            this.g = i2;
            if (range != null) {
                this.h = range;
                this.i = z;
                this.j = i3;
                return;
            }
            c44.i("Null targetFrameRate");
            throw null;
        }
        c44.i("Null dynamicRange");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof pw) {
                pw pwVar = (pw) obj;
                if (this.a.equals(pwVar.a) && this.b == pwVar.b && this.c.equals(pwVar.c) && this.d.equals(pwVar.d) && this.e.equals(pwVar.e)) {
                    cw0 cw0Var = pwVar.f;
                    cw0 cw0Var2 = this.f;
                    if (cw0Var2 == null) {
                        if (cw0Var != null) {
                            return false;
                        }
                    } else if (!cw0Var2.equals(cw0Var)) {
                        return false;
                    }
                    if (this.g == pwVar.g && this.h.equals(pwVar.h) && this.i == pwVar.i && this.j == pwVar.j) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        cw0 cw0Var = this.f;
        if (cw0Var == null) {
            hashCode = 0;
        } else {
            hashCode = cw0Var.hashCode();
        }
        int hashCode3 = (((((hashCode2 ^ hashCode) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003;
        if (this.i) {
            i = 1231;
        } else {
            i = 1237;
        }
        return this.j ^ ((hashCode3 ^ i) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachedSurfaceInfo{surfaceConfig=");
        sb.append(this.a);
        sb.append(", imageFormat=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", dynamicRange=");
        sb.append(this.d);
        sb.append(", captureTypes=");
        sb.append(this.e);
        sb.append(", implementationOptions=");
        sb.append(this.f);
        sb.append(", sessionType=");
        sb.append(this.g);
        sb.append(", targetFrameRate=");
        sb.append(this.h);
        sb.append(", strictFrameRateRequired=");
        sb.append(this.i);
        sb.append(", customMaxFrameRate=");
        return wh1.m(sb, this.j, "}");
    }
}
