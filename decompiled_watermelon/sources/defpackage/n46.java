package defpackage;

import java.io.File;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n46  reason: default package */
/* loaded from: classes.dex */
public final class n46 implements p46 {
    public final File a;

    public n46(File file) {
        this.a = file;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof n46) || !this.a.equals(((n46) obj).a)) {
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
