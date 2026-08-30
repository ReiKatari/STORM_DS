package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gy  reason: default package */
/* loaded from: classes.dex */
public final class gy {
    public static final List b = l07.c0(new gy(0), new gy(1), new gy(6), new gy(5), new gy(2), new gy(3), new gy(8), new gy(7));
    public final int a;

    public /* synthetic */ gy(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gy) {
            if (this.a != ((gy) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return ej6.e("AwbMode(value=", this.a, ')');
    }
}
