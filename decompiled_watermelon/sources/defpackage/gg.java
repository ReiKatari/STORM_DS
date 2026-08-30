package defpackage;

import java.io.File;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gg  reason: default package */
/* loaded from: classes.dex */
public final class gg {
    public final long a;
    public final String b;
    public final File c;

    public gg(long j, String str, File file) {
        str.getClass();
        this.a = j;
        this.b = str;
        this.c = file;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg)) {
            return false;
        }
        gg ggVar = (gg) obj;
        if (this.a == ggVar.a && b53.x(this.b, ggVar.b) && b53.x(this.c, ggVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b = ej6.b(Long.hashCode(this.a) * 31, 31, this.b);
        File file = this.c;
        if (file == null) {
            hashCode = 0;
        } else {
            hashCode = file.hashCode();
        }
        return b + hashCode;
    }

    public final String toString() {
        return "InstalledDsiWareShortcutSession(titleId=" + this.a + ", titleIdHex=" + this.b + ", publicSaveFile=" + this.c + ")";
    }
}
