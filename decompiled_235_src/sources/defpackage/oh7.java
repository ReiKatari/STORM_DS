package defpackage;

import java.util.LinkedHashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oh7  reason: default package */
/* loaded from: classes.dex */
public final class oh7 {
    public final String a;
    public final long b;
    public final String c;
    public final LinkedHashSet d;

    public oh7(String str, long j, String str2, LinkedHashSet linkedHashSet) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof oh7) {
                oh7 oh7Var = (oh7) obj;
                if (!this.a.equals(oh7Var.a) || this.b != oh7Var.b || !nb3.k(this.c, oh7Var.c) || !this.d.equals(oh7Var.d)) {
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
        int c = i61.c(this.b, this.a.hashCode() * 31, 31);
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
