package defpackage;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p85  reason: default package */
/* loaded from: classes.dex */
public final class p85 implements y21 {
    public final float a;

    public p85(float f) {
        this.a = f;
    }

    @Override // defpackage.y21
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p85) && this.a == ((p85) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        return wh1.m(new StringBuilder(), (int) (this.a * 100.0f), "%");
    }
}
