package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xg1  reason: default package */
/* loaded from: classes.dex */
public final class xg1 {
    public final String a;
    public final int b;
    public final int c;

    public xg1(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xg1) {
            xg1 xg1Var = (xg1) obj;
            if (this.a.equals(xg1Var.a) && this.b == xg1Var.b && this.c == xg1Var.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.b);
        Integer valueOf2 = Integer.valueOf(this.c);
        Float valueOf3 = Float.valueOf(1.0f);
        return Objects.hash(this.a, valueOf, valueOf2, valueOf3, 0, 0, 0, valueOf3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        sb.append(Integer.valueOf(this.a.hashCode()));
        sb.append(" displayWidth=");
        sb.append(this.b);
        sb.append(" displayHeight=");
        return wh1.m(sb, this.c, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}");
    }
}
