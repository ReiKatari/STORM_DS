package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i05  reason: default package */
/* loaded from: classes.dex */
public final class i05 extends s05 {
    public final String a;
    public final URL b;
    public final String c;
    public final im1 d;
    public final boolean e;

    public i05(String str, URL url, String str2, im1 im1Var, boolean z) {
        this.a = str;
        this.b = url;
        this.c = str2;
        this.d = im1Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i05) {
                i05 i05Var = (i05) obj;
                if (!this.a.equals(i05Var.a) || !this.b.equals(i05Var.b) || !b53.x(this.c, i05Var.c) || !b53.x(this.d, i05Var.d) || this.e != i05Var.e) {
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
        int hashCode2 = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        im1 im1Var = this.d;
        if (im1Var != null) {
            i = Long.hashCode(im1Var.A);
        }
        return Boolean.hashCode(this.e) + ((i2 + i) * 31);
    }

    public final String toString() {
        return "GameMastered(gameTitle=" + this.a + ", gameIcon=" + this.b + ", userName=" + this.c + ", playTime=" + this.d + ", forHardcodeMode=" + this.e + ")";
    }
}
