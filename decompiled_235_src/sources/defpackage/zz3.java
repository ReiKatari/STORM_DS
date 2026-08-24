package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zz3  reason: default package */
/* loaded from: classes.dex */
public final class zz3 {
    public static final List b = hf.c0(new ze7((byte) 0), new ze7((byte) 9), new ze7((byte) -65));
    public final ArrayList a;

    public zz3(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof zz3) || !this.a.equals(((zz3) obj).a)) {
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
        String upperCase = gt0.P0(this.a, ":", null, null, new v83(22), 30).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }
}
