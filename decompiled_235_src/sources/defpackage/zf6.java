package defpackage;

import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zf6  reason: default package */
/* loaded from: classes.dex */
public final class zf6 implements bg6 {
    public final File a;

    public zf6(File file) {
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof zf6) || !this.a.equals(((zf6) obj).a)) {
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
        return "Local(dir=" + this.a + ")";
    }
}
