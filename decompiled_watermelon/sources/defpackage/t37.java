package defpackage;

import java.util.LinkedHashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t37  reason: default package */
/* loaded from: classes.dex */
public final class t37 {
    public final String a;
    public final long b;
    public final String c;
    public final LinkedHashSet d;

    public t37(String str, long j, String str2, LinkedHashSet linkedHashSet) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t37) {
                t37 t37Var = (t37) obj;
                if (!this.a.equals(t37Var.a) || this.b != t37Var.b || !b53.x(this.c, t37Var.c) || !this.d.equals(t37Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int c = b31.c(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.d.hashCode() + ((c + hashCode) * 31);
    }

    public final String toString() {
        return "UpdateApkMetadata(packageName=" + this.a + ", versionCode=" + this.b + ", versionName=" + this.c + ", signerDigests=" + this.d + ")";
    }
}
