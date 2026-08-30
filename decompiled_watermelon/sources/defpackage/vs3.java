package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vs3  reason: default package */
/* loaded from: classes.dex */
public final class vs3 {
    public static final List b = l07.c0(new e17((byte) 0), new e17((byte) 9), new e17((byte) -65));
    public final ArrayList a;

    public vs3(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof vs3) || !this.a.equals(((vs3) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String upperCase = tq0.S0(this.a, ":", null, null, new gi3(10), 30).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }
}
