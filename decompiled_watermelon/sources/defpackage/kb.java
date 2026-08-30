package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kb  reason: default package */
/* loaded from: classes.dex */
public final class kb {
    public static final List b = l07.c0(new kb(0), new kb(1), new kb(2), new kb(3), new kb(4), new kb(5));
    public final int a;

    public /* synthetic */ kb(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kb) {
            if (this.a != ((kb) obj).a) {
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
        return ej6.e("AfMode(value=", this.a, ')');
    }
}
