package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ja  reason: default package */
/* loaded from: classes.dex */
public final class ja {
    public static final List b = l07.c0(new ja(0), new ja(1), new ja(2), new ja(3), new ja(4), new ja(5), new ja(6));
    public final int a;

    public /* synthetic */ ja(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ja) {
            if (this.a != ((ja) obj).a) {
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
        return ej6.e("AeMode(value=", this.a, ')');
    }
}
