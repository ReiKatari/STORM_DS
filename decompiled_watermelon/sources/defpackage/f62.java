package defpackage;

import java.io.File;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f62  reason: default package */
/* loaded from: classes.dex */
public final class f62 {
    public final File a;
    public final List b;

    public f62(File file, List list) {
        this.a = file;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f62) {
                f62 f62Var = (f62) obj;
                if (!this.a.equals(f62Var.a) || !this.b.equals(f62Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FilePathComponents(root=" + this.a + ", segments=" + this.b + ')';
    }
}
